package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.os.Message;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebStorage.QuotaUpdater;
import android.webkit.WebView;
import android.webkit.WebView.WebViewTransport;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.ads.internal.zzw;

@zzzb
@TargetApi(11)
public class zzamx extends WebChromeClient {
    private final zzama zzbwq;

    public zzamx(zzama zzama) {
        this.zzbwq = zzama;
    }

    private static Context zza(WebView webView) {
        if (!(webView instanceof zzama)) {
            return webView.getContext();
        }
        zzama zzama = (zzama) webView;
        Context zzrz = zzama.zzrz();
        return zzrz != null ? zzrz : zzama.getContext();
    }

    private final boolean zza(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        try {
            AlertDialog create;
            if (!(this.zzbwq == null || this.zzbwq.zzsq() == null || this.zzbwq.zzsq().zztd() == null)) {
                zzw zztd = this.zzbwq.zzsq().zztd();
                if (!(zztd == null || zztd.zzcu())) {
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 11) + String.valueOf(str3).length());
                    stringBuilder.append("window.");
                    stringBuilder.append(str);
                    stringBuilder.append("('");
                    stringBuilder.append(str3);
                    stringBuilder.append("')");
                    zztd.zzs(stringBuilder.toString());
                    return false;
                }
            }
            Builder builder = new Builder(context);
            builder.setTitle(str2);
            if (z) {
                View linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                View textView = new TextView(context);
                textView.setText(str3);
                View editText = new EditText(context);
                editText.setText(str4);
                linearLayout.addView(textView);
                linearLayout.addView(editText);
                create = builder.setView(linearLayout).setPositiveButton(17039370, new zzand(jsPromptResult, editText)).setNegativeButton(17039360, new zzanc(jsPromptResult)).setOnCancelListener(new zzanb(jsPromptResult)).create();
            } else {
                create = builder.setMessage(str3).setPositiveButton(17039370, new zzana(jsResult)).setNegativeButton(17039360, new zzamz(jsResult)).setOnCancelListener(new zzamy(jsResult)).create();
            }
            create.show();
            return true;
        } catch (Throwable e) {
            zzaiw.zzc("Fail to display Dialog.", e);
            return true;
        }
    }

    public final void onCloseWindow(WebView webView) {
        String str;
        if (webView instanceof zzama) {
            zzd zzsm = ((zzama) webView).zzsm();
            if (zzsm == null) {
                str = "Tried to close an AdWebView not associated with an overlay.";
            } else {
                zzsm.close();
                return;
            }
        }
        str = "Tried to close a WebView that wasn't an AdWebView.";
        zzaiw.zzco(str);
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(message).length() + 19) + String.valueOf(sourceId).length());
        stringBuilder.append("JS: ");
        stringBuilder.append(message);
        stringBuilder.append(" (");
        stringBuilder.append(sourceId);
        stringBuilder.append(":");
        stringBuilder.append(lineNumber);
        stringBuilder.append(")");
        message = stringBuilder.toString();
        if (message.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        switch (zzane.zzdkt[consoleMessage.messageLevel().ordinal()]) {
            case 1:
                zzaiw.m3e(message);
                break;
            case 2:
                zzaiw.zzco(message);
                break;
            case 5:
                zzaiw.zzbw(message);
                break;
            default:
                zzaiw.zzcn(message);
                break;
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebViewTransport webViewTransport = (WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        webView2.setWebViewClient(this.zzbwq.zzsq());
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        long j5 = 0;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j != 0) {
            if (j2 == 0) {
                j = Math.min(j + Math.min(PlaybackStateCompat.ACTION_PREPARE_FROM_URI, j4), PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            } else if (j2 <= Math.min(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED - j, j4)) {
                j5 = j + j2;
            }
            j5 = j;
        } else if (j2 <= j4 && j2 <= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            j5 = j2;
        }
        quotaUpdater.updateQuota(j5);
    }

    public final void onGeolocationPermissionsShowPrompt(String str, Callback callback) {
        if (callback != null) {
            boolean z;
            zzbs.zzec();
            if (!zzagr.zzd(this.zzbwq.getContext(), this.zzbwq.getContext().getPackageName(), "android.permission.ACCESS_FINE_LOCATION")) {
                zzbs.zzec();
                if (!zzagr.zzd(this.zzbwq.getContext(), this.zzbwq.getContext().getPackageName(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = false;
                    callback.invoke(str, z, true);
                }
            }
            z = true;
            callback.invoke(str, z, true);
        }
    }

    public final void onHideCustomView() {
        zzd zzsm = this.zzbwq.zzsm();
        if (zzsm == null) {
            zzaiw.zzco("Could not get ad overlay when hiding custom view.");
        } else {
            zzsm.zzmm();
        }
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zza(webView), "alert", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zza(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zza(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return zza(zza(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    public final void onReachedMaxAppCacheSize(long j, long j2, QuotaUpdater quotaUpdater) {
        long j3 = j + PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
        if (5242880 - j2 < j3) {
            quotaUpdater.updateQuota(0);
        } else {
            quotaUpdater.updateQuota(j3);
        }
    }

    public final void onShowCustomView(View view, CustomViewCallback customViewCallback) {
        zza(view, -1, customViewCallback);
    }

    protected final void zza(View view, int i, CustomViewCallback customViewCallback) {
        zzd zzsm = this.zzbwq.zzsm();
        if (zzsm == null) {
            zzaiw.zzco("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        zzsm.zza(view, customViewCallback);
        zzsm.setRequestedOrientation(i);
    }
}
