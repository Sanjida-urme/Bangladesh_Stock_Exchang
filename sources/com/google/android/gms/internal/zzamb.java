package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.gmsg.zza;
import com.google.android.gms.ads.internal.gmsg.zzaa;
import com.google.android.gms.ads.internal.gmsg.zzab;
import com.google.android.gms.ads.internal.gmsg.zzb;
import com.google.android.gms.ads.internal.gmsg.zzd;
import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.ads.internal.gmsg.zzx;
import com.google.android.gms.ads.internal.gmsg.zzz;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzq;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.common.util.zzr;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

@zzzb
public class zzamb extends WebViewClient {
    private static final String[] zzdhz = new String[]{"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};
    private static final String[] zzdia = new String[]{"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};
    private final Object mLock;
    @Nullable
    protected zzaeh zzanv;
    private boolean zzaut;
    private zzin zzbbt;
    private zzb zzbva;
    private zzx zzbwi;
    private zzw zzbwk;
    private zzvw zzbwl;
    private zzq zzbwo;
    private zzn zzbwp;
    protected zzama zzbwq;
    private zzwh zzcff;
    private final HashMap<String, List<zzt<? super zzama>>> zzcio;
    private zzamf zzdib;
    private zzamg zzdic;
    private zzamh zzdid;
    private boolean zzdie;
    private boolean zzdif;
    private OnGlobalLayoutListener zzdig;
    private OnScrollChangedListener zzdih;
    private boolean zzdii;
    private final zzwf zzdij;
    private zzamj zzdik;
    private boolean zzdil;
    private boolean zzdim;
    private boolean zzdin;
    private int zzdio;
    private OnAttachStateChangeListener zzdip;

    public zzamb(zzama zzama, boolean z) {
        this(zzama, z, new zzwf(zzama, zzama.zzsl(), new zzmc(zzama.getContext())), null);
    }

    private zzamb(zzama zzama, boolean z, zzwf zzwf, zzvw zzvw) {
        this.zzcio = new HashMap();
        this.mLock = new Object();
        this.zzdie = false;
        this.zzbwq = zzama;
        this.zzaut = z;
        this.zzdij = zzwf;
        this.zzbwl = null;
    }

    private final void zza(View view, zzaeh zzaeh, int i) {
        if (zzaeh.zzof() && i > 0) {
            zzaeh.zzl(view);
            if (zzaeh.zzof()) {
                zzagr.zzczc.postDelayed(new zzamc(this, view, zzaeh, i), 100);
            }
        }
    }

    private final void zza(AdOverlayInfoParcel adOverlayInfoParcel) {
        boolean z = false;
        boolean zzml = this.zzbwl != null ? this.zzbwl.zzml() : false;
        zzbs.zzea();
        Context context = this.zzbwq.getContext();
        if (!zzml) {
            z = true;
        }
        zzl.zza(context, adOverlayInfoParcel, z);
        if (this.zzanv != null) {
            String str = adOverlayInfoParcel.url;
            if (str == null && adOverlayInfoParcel.zzchg != null) {
                str = adOverlayInfoParcel.zzchg.url;
            }
            this.zzanv.zzbu(str);
        }
    }

    private final void zzc(Context context, String str, String str2, String str3) {
        if (((Boolean) zzbs.zzep().zzd(zzmq.zzble)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString(NotificationCompat.CATEGORY_ERROR, str);
            bundle.putString("code", str2);
            str = "host";
            if (!TextUtils.isEmpty(str3)) {
                Uri parse = Uri.parse(str3);
                if (parse.getHost() != null) {
                    str2 = parse.getHost();
                    bundle.putString(str, str2);
                    zzbs.zzec().zza(context, this.zzbwq.zzsb().zzcp, "gmob-apps", bundle, true);
                }
            }
            str2 = "";
            bundle.putString(str, str2);
            zzbs.zzec().zza(context, this.zzbwq.zzsb().zzcp, "gmob-apps", bundle, true);
        }
    }

    private final void zzh(Uri uri) {
        String path = uri.getPath();
        List<zzt> list = (List) this.zzcio.get(path);
        if (list != null) {
            zzbs.zzec();
            Map zzf = zzagr.zzf(uri);
            if (zzaiw.zzae(2)) {
                String str = "Received GMSG: ";
                path = String.valueOf(path);
                zzafj.m5v(path.length() != 0 ? str.concat(path) : new String(str));
                for (String str2 : zzf.keySet()) {
                    String str3 = (String) zzf.get(str2);
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 4) + String.valueOf(str3).length());
                    stringBuilder.append("  ");
                    stringBuilder.append(str2);
                    stringBuilder.append(": ");
                    stringBuilder.append(str3);
                    zzafj.m5v(stringBuilder.toString());
                }
            }
            for (zzt zza : list) {
                zza.zza(this.zzbwq, zzf);
            }
            return;
        }
        String valueOf = String.valueOf(uri);
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 32);
        stringBuilder2.append("No GMSG handler found for GMSG: ");
        stringBuilder2.append(valueOf);
        zzafj.m5v(stringBuilder2.toString());
    }

    private final void zztj() {
        if (this.zzdip != null) {
            zzama zzama = this.zzbwq;
            if (zzama == null) {
                throw null;
            }
            ((View) zzama).removeOnAttachStateChangeListener(this.zzdip);
        }
    }

    private final void zzto() {
        if (this.zzdib != null && ((this.zzdim && this.zzdio <= 0) || this.zzdin)) {
            this.zzdib.zza(this.zzbwq, this.zzdin ^ 1);
            this.zzdib = null;
        }
        this.zzbwq.zzsz();
    }

    public final void onLoadResource(WebView webView, String str) {
        String str2 = "Loading resource: ";
        String valueOf = String.valueOf(str);
        zzafj.m5v(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzh(parse);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageFinished(android.webkit.WebView r1, java.lang.String r2) {
        /*
        r0 = this;
        r1 = r0.mLock;
        monitor-enter(r1);
        r2 = r0.zzdil;	 Catch:{ all -> 0x0029 }
        if (r2 == 0) goto L_0x0013;
    L_0x0007:
        r2 = "Blank page loaded, 1...";
        com.google.android.gms.internal.zzafj.m5v(r2);	 Catch:{ all -> 0x0029 }
        r2 = r0.zzbwq;	 Catch:{ all -> 0x0029 }
        r2.zzsu();	 Catch:{ all -> 0x0029 }
        monitor-exit(r1);	 Catch:{ all -> 0x0029 }
        return;
    L_0x0013:
        monitor-exit(r1);	 Catch:{ all -> 0x0029 }
        r1 = 1;
        r0.zzdim = r1;
        r1 = r0.zzdic;
        if (r1 == 0) goto L_0x0025;
    L_0x001b:
        r1 = r0.zzdic;
        r2 = r0.zzbwq;
        r1.zzg(r2);
        r1 = 0;
        r0.zzdic = r1;
    L_0x0025:
        r0.zzto();
        return;
    L_0x0029:
        r2 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0029 }
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzamb.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        String str3;
        if (i < 0) {
            int i2 = (-i) - 1;
            if (i2 < zzdhz.length) {
                str3 = zzdhz[i2];
                zzc(this.zzbwq.getContext(), "http_err", str3, str2);
                super.onReceivedError(webView, i, str, str2);
            }
        }
        str3 = String.valueOf(i);
        zzc(this.zzbwq.getContext(), "http_err", str3, str2);
        super.onReceivedError(webView, i, str, str2);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslError != null) {
            int primaryError = sslError.getPrimaryError();
            String valueOf = (primaryError < 0 || primaryError >= zzdia.length) ? String.valueOf(primaryError) : zzdia[primaryError];
            zzc(this.zzbwq.getContext(), "ssl_err", valueOf, zzbs.zzee().zza(sslError));
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    public final void reset() {
        if (this.zzanv != null) {
            this.zzanv.zzoh();
            this.zzanv = null;
        }
        zztj();
        synchronized (this.mLock) {
            this.zzcio.clear();
            this.zzbbt = null;
            this.zzbwp = null;
            this.zzdib = null;
            this.zzdic = null;
            this.zzbva = null;
            this.zzdie = false;
            this.zzaut = false;
            this.zzdif = false;
            this.zzdii = false;
            this.zzbwo = null;
            this.zzdid = null;
            if (this.zzbwl != null) {
                this.zzbwl.zzl(true);
                this.zzbwl = null;
            }
        }
    }

    @TargetApi(11)
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        try {
            String zzb = zzaeo.zzb(str, this.zzbwq.getContext());
            if (zzb.equals(str)) {
                zzhu zzaa = zzhu.zzaa(str);
                if (zzaa == null) {
                    return null;
                }
                zzhr zza = zzbs.zzeh().zza(zzaa);
                return (zza == null || !zza.zzhc()) ? null : new WebResourceResponse("", "", zza.zzhd());
            } else {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(zzb).openConnection();
                zzbs.zzec().zza(this.zzbwq.getContext(), this.zzbwq.zzsb().zzcp, true, httpURLConnection);
                return new WebResourceResponse(httpURLConnection.getContentType(), httpURLConnection.getHeaderField("encoding"), httpURLConnection.getInputStream());
            }
        } catch (Throwable e) {
            zzbs.zzeg().zza(e, "AdWebViewClient.shouldInterceptRequest");
            return null;
        }
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (!(keyCode == 79 || keyCode == 222)) {
            switch (keyCode) {
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                case 90:
                case 91:
                    break;
                default:
                    switch (keyCode) {
                        case 126:
                        case 127:
                        case 128:
                        case 129:
                        case 130:
                            break;
                        default:
                            return false;
                    }
            }
        }
        return true;
    }

    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r12, java.lang.String r13) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/558922244.run(Unknown Source)
*/
        /*
        r11 = this;
        r0 = "AdWebView shouldOverrideUrlLoading: ";
        r1 = java.lang.String.valueOf(r13);
        r2 = r1.length();
        if (r2 == 0) goto L_0x0011;
    L_0x000c:
        r0 = r0.concat(r1);
        goto L_0x0017;
    L_0x0011:
        r1 = new java.lang.String;
        r1.<init>(r0);
        r0 = r1;
    L_0x0017:
        com.google.android.gms.internal.zzafj.m5v(r0);
        r0 = android.net.Uri.parse(r13);
        r1 = "gmsg";
        r2 = r0.getScheme();
        r1 = r1.equalsIgnoreCase(r2);
        r2 = 1;
        if (r1 == 0) goto L_0x003b;
    L_0x002b:
        r1 = "mobileads.google.com";
        r3 = r0.getHost();
        r1 = r1.equalsIgnoreCase(r3);
        if (r1 == 0) goto L_0x003b;
    L_0x0037:
        r11.zzh(r0);
        return r2;
    L_0x003b:
        r1 = r11.zzdie;
        r3 = 0;
        if (r1 == 0) goto L_0x008d;
    L_0x0040:
        r1 = r11.zzbwq;
        r1 = r1.getWebView();
        if (r12 != r1) goto L_0x008d;
    L_0x0048:
        r1 = r0.getScheme();
        r4 = "http";
        r4 = r4.equalsIgnoreCase(r1);
        if (r4 != 0) goto L_0x005f;
    L_0x0054:
        r4 = "https";
        r1 = r4.equalsIgnoreCase(r1);
        if (r1 == 0) goto L_0x005d;
    L_0x005c:
        goto L_0x005f;
    L_0x005d:
        r1 = 0;
        goto L_0x0060;
    L_0x005f:
        r1 = 1;
    L_0x0060:
        if (r1 == 0) goto L_0x008d;
    L_0x0062:
        r0 = r11.zzbbt;
        if (r0 == 0) goto L_0x0088;
    L_0x0066:
        r0 = com.google.android.gms.internal.zzmq.zzbiv;
        r1 = com.google.android.gms.ads.internal.zzbs.zzep();
        r0 = r1.zzd(r0);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x0088;
    L_0x0078:
        r0 = r11.zzbbt;
        r0.onAdClicked();
        r0 = r11.zzanv;
        if (r0 == 0) goto L_0x0086;
    L_0x0081:
        r0 = r11.zzanv;
        r0.zzbu(r13);
    L_0x0086:
        r11.zzbbt = r3;
    L_0x0088:
        r12 = super.shouldOverrideUrlLoading(r12, r13);
        return r12;
    L_0x008d:
        r12 = r11.zzbwq;
        r12 = r12.getWebView();
        r12 = r12.willNotDraw();
        if (r12 != 0) goto L_0x00fc;
    L_0x0099:
        r12 = r11.zzbwq;	 Catch:{ zzct -> 0x00ba }
        r12 = r12.zzss();	 Catch:{ zzct -> 0x00ba }
        if (r12 == 0) goto L_0x00d4;	 Catch:{ zzct -> 0x00ba }
    L_0x00a1:
        r1 = r12.zzb(r0);	 Catch:{ zzct -> 0x00ba }
        if (r1 == 0) goto L_0x00d4;	 Catch:{ zzct -> 0x00ba }
    L_0x00a7:
        r1 = r11.zzbwq;	 Catch:{ zzct -> 0x00ba }
        r1 = r1.getContext();	 Catch:{ zzct -> 0x00ba }
        r4 = r11.zzbwq;	 Catch:{ zzct -> 0x00ba }
        if (r4 != 0) goto L_0x00b2;	 Catch:{ zzct -> 0x00ba }
    L_0x00b1:
        throw r3;	 Catch:{ zzct -> 0x00ba }
    L_0x00b2:
        r4 = (android.view.View) r4;	 Catch:{ zzct -> 0x00ba }
        r12 = r12.zza(r0, r1, r4);	 Catch:{ zzct -> 0x00ba }
        r0 = r12;
        goto L_0x00d4;
    L_0x00ba:
        r12 = "Unable to append parameter to URL: ";
        r1 = java.lang.String.valueOf(r13);
        r3 = r1.length();
        if (r3 == 0) goto L_0x00cb;
    L_0x00c6:
        r12 = r12.concat(r1);
        goto L_0x00d1;
    L_0x00cb:
        r1 = new java.lang.String;
        r1.<init>(r12);
        r12 = r1;
    L_0x00d1:
        com.google.android.gms.internal.zzaiw.zzco(r12);
    L_0x00d4:
        r12 = r11.zzbwk;
        if (r12 == 0) goto L_0x00e7;
    L_0x00d8:
        r12 = r11.zzbwk;
        r12 = r12.zzcu();
        if (r12 == 0) goto L_0x00e1;
    L_0x00e0:
        goto L_0x00e7;
    L_0x00e1:
        r12 = r11.zzbwk;
        r12.zzs(r13);
        return r2;
    L_0x00e7:
        r12 = new com.google.android.gms.ads.internal.overlay.zzc;
        r4 = "android.intent.action.VIEW";
        r5 = r0.toString();
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r3 = r12;
        r3.<init>(r4, r5, r6, r7, r8, r9, r10);
        r11.zza(r12);
        return r2;
    L_0x00fc:
        r12 = "AdWebView unable to handle URL: ";
        r13 = java.lang.String.valueOf(r13);
        r0 = r13.length();
        if (r0 == 0) goto L_0x010d;
    L_0x0108:
        r12 = r12.concat(r13);
        goto L_0x0113;
    L_0x010d:
        r13 = new java.lang.String;
        r13.<init>(r12);
        r12 = r13;
    L_0x0113:
        com.google.android.gms.internal.zzaiw.zzco(r12);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzamb.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }

    public final void zza(int i, int i2, boolean z) {
        this.zzdij.zzc(i, i2);
        if (this.zzbwl != null) {
            this.zzbwl.zza(i, i2, z);
        }
    }

    public final void zza(OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        synchronized (this.mLock) {
            this.zzdif = true;
            this.zzbwq.zzsy();
            this.zzdig = onGlobalLayoutListener;
            this.zzdih = onScrollChangedListener;
        }
    }

    public final void zza(zzc zzc) {
        boolean zzst = this.zzbwq.zzst();
        zzin zzin = (!zzst || this.zzbwq.zzso().zztx()) ? this.zzbbt : null;
        zza(new AdOverlayInfoParcel(zzc, zzin, zzst ? null : this.zzbwp, this.zzbwo, this.zzbwq.zzsb()));
    }

    public final void zza(zzamf zzamf) {
        this.zzdib = zzamf;
    }

    public final void zza(zzamg zzamg) {
        this.zzdic = zzamg;
    }

    public final void zza(zzamh zzamh) {
        this.zzdid = zzamh;
    }

    public final void zza(zzamj zzamj) {
        this.zzdik = zzamj;
    }

    public final void zza(zzin zzin, zzn zzn, zzb zzb, zzq zzq, boolean z, @Nullable zzx zzx, zzw zzw, zzwh zzwh, @Nullable zzaeh zzaeh) {
        zzb zzb2 = zzb;
        zzx zzx2 = zzx;
        zzwh zzwh2 = zzwh;
        zzaeh zzaeh2 = zzaeh;
        zzw zzw2 = zzw == null ? new zzw(this.zzbwq.getContext(), zzaeh2, null) : zzw;
        r0.zzbwl = new zzvw(r0.zzbwq, zzwh2);
        r0.zzanv = zzaeh2;
        zza("/appEvent", new zza(zzb2));
        zza("/backButton", zzd.zzbvl);
        zza("/refresh", zzd.zzbvm);
        zza("/canOpenURLs", zzd.zzbvc);
        zza("/canOpenIntents", zzd.zzbvd);
        zza("/click", zzd.zzbve);
        zza("/close", zzd.zzbvf);
        zza("/customClose", zzd.zzbvg);
        zza("/instrument", zzd.zzbvp);
        zza("/delayPageLoaded", zzd.zzbvr);
        zza("/delayPageClosed", zzd.zzbvs);
        zza("/getLocationInfo", zzd.zzbvt);
        zza("/httpTrack", zzd.zzbvh);
        zza("/log", zzd.zzbvi);
        zza("/mraid", new zzaa(zzw2, r0.zzbwl));
        zza("/mraidLoaded", r0.zzdij);
        zzt zzt = r1;
        zzab zzab = new zzab(r0.zzbwq.getContext(), r0.zzbwq.zzsb(), r0.zzbwq.zzss(), zzq, zzin, zzb2, zzn, zzw2, r0.zzbwl);
        zza("/open", zzt);
        zza("/precache", new zzalx());
        zza("/touch", zzd.zzbvk);
        zza("/video", zzd.zzbvn);
        zza("/videoMeta", zzd.zzbvo);
        if (zzbs.zzfa().zzr(r0.zzbwq.getContext())) {
            zza("/logScionEvent", new zzz(r0.zzbwq.getContext()));
        }
        if (zzx2 != null) {
            zza("/setInterstitialProperties", new com.google.android.gms.ads.internal.gmsg.zzw(zzx2));
        }
        r0.zzbbt = zzin;
        r0.zzbwp = zzn;
        r0.zzbva = zzb2;
        r0.zzbwo = zzq;
        r0.zzbwk = zzw2;
        r0.zzcff = zzwh;
        r0.zzbwi = zzx2;
        r0.zzdie = z;
    }

    public final void zza(String str, zzt<? super zzama> zzt) {
        synchronized (this.mLock) {
            List list = (List) this.zzcio.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.zzcio.put(str, list);
            }
            list.add(zzt);
        }
    }

    public final void zza(String str, zzr<zzt<? super zzama>> zzr) {
        synchronized (this.mLock) {
            List<zzt> list = (List) this.zzcio.get(str);
            if (list == null) {
                return;
            }
            Collection arrayList = new ArrayList();
            for (zzt zzt : list) {
                if (zzr.apply(zzt)) {
                    arrayList.add(zzt);
                }
            }
            list.removeAll(arrayList);
        }
    }

    public final void zza(boolean z, int i) {
        zzin zzin = (!this.zzbwq.zzst() || this.zzbwq.zzso().zztx()) ? this.zzbbt : null;
        zza(new AdOverlayInfoParcel(zzin, this.zzbwp, this.zzbwo, this.zzbwq, z, i, this.zzbwq.zzsb()));
    }

    public final void zza(boolean z, int i, String str) {
        boolean zzst = this.zzbwq.zzst();
        zzin zzin = (!zzst || this.zzbwq.zzso().zztx()) ? this.zzbbt : null;
        zza(new AdOverlayInfoParcel(zzin, zzst ? null : new zzami(this.zzbwq, this.zzbwp), this.zzbva, this.zzbwo, this.zzbwq, z, i, str, this.zzbwq.zzsb()));
    }

    public final void zza(boolean z, int i, String str, String str2) {
        boolean zzst = this.zzbwq.zzst();
        zzin zzin = (!zzst || r0.zzbwq.zzso().zztx()) ? r0.zzbbt : null;
        zza(new AdOverlayInfoParcel(zzin, zzst ? null : new zzami(r0.zzbwq, r0.zzbwp), r0.zzbva, r0.zzbwo, r0.zzbwq, z, i, str, str2, r0.zzbwq.zzsb()));
    }

    public final void zzab(boolean z) {
        this.zzdie = z;
    }

    public final void zzb(int i, int i2) {
        if (this.zzbwl != null) {
            this.zzbwl.zzb(i, i2);
        }
    }

    public final void zzb(String str, zzt<? super zzama> zzt) {
        synchronized (this.mLock) {
            List list = (List) this.zzcio.get(str);
            if (list == null) {
                return;
            }
            list.remove(zzt);
        }
    }

    public final boolean zzfr() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzaut;
        }
        return z;
    }

    public final void zzmp() {
        synchronized (this.mLock) {
            this.zzdie = false;
            this.zzaut = true;
            zzbs.zzec();
            zzagr.runOnUiThread(new zzame(this));
        }
    }

    public final zzw zztd() {
        return this.zzbwk;
    }

    public final boolean zzte() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzdif;
        }
        return z;
    }

    public final OnGlobalLayoutListener zztf() {
        OnGlobalLayoutListener onGlobalLayoutListener;
        synchronized (this.mLock) {
            onGlobalLayoutListener = this.zzdig;
        }
        return onGlobalLayoutListener;
    }

    public final OnScrollChangedListener zztg() {
        OnScrollChangedListener onScrollChangedListener;
        synchronized (this.mLock) {
            onScrollChangedListener = this.zzdih;
        }
        return onScrollChangedListener;
    }

    public final boolean zzth() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzdii;
        }
        return z;
    }

    public final void zzti() {
        synchronized (this.mLock) {
            zzafj.m5v("Loading blank page in WebView, 2...");
            this.zzdil = true;
            this.zzbwq.zzct("about:blank");
        }
    }

    public final void zztk() {
        zzaeh zzaeh = this.zzanv;
        if (zzaeh != null) {
            View webView = this.zzbwq.getWebView();
            if (ViewCompat.isAttachedToWindow(webView)) {
                zza(webView, zzaeh, 10);
                return;
            }
            zztj();
            this.zzdip = new zzamd(this, zzaeh);
            zzama zzama = this.zzbwq;
            if (zzama == null) {
                throw null;
            }
            ((View) zzama).addOnAttachStateChangeListener(this.zzdip);
        }
    }

    public final void zztl() {
        synchronized (this.mLock) {
            this.zzdii = true;
        }
        this.zzdio++;
        zzto();
    }

    public final void zztm() {
        this.zzdio--;
        zzto();
    }

    public final void zztn() {
        this.zzdin = true;
        zzto();
    }

    public final zzamj zztp() {
        return this.zzdik;
    }
}
