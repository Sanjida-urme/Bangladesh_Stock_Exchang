package com.google.android.gms.ads.internal;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.zzaiw;
import com.google.android.gms.internal.zzmq;

final class zzbn extends WebViewClient {
    private /* synthetic */ zzbm zzarm;

    zzbn(zzbm zzbm) {
        this.zzarm = zzbm;
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (this.zzarm.zzaoj != null) {
            try {
                this.zzarm.zzaoj.onAdFailedToLoad(0);
            } catch (Throwable e) {
                zzaiw.zzc("Could not call AdListener.onAdFailedToLoad().", e);
            }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.zzarm.zzdt())) {
            return false;
        }
        if (str.startsWith((String) zzbs.zzep().zzd(zzmq.zzbnu))) {
            if (this.zzarm.zzaoj != null) {
                try {
                    this.zzarm.zzaoj.onAdFailedToLoad(3);
                } catch (Throwable e) {
                    zzaiw.zzc("Could not call AdListener.onAdFailedToLoad().", e);
                }
            }
            this.zzarm.zzk(0);
            return true;
        }
        if (str.startsWith((String) zzbs.zzep().zzd(zzmq.zzbnv))) {
            if (this.zzarm.zzaoj != null) {
                try {
                    this.zzarm.zzaoj.onAdFailedToLoad(0);
                } catch (Throwable e2) {
                    zzaiw.zzc("Could not call AdListener.onAdFailedToLoad().", e2);
                }
            }
            this.zzarm.zzk(0);
            return true;
        }
        if (str.startsWith((String) zzbs.zzep().zzd(zzmq.zzbnw))) {
            if (this.zzarm.zzaoj != null) {
                try {
                    this.zzarm.zzaoj.onAdLoaded();
                } catch (Throwable e22) {
                    zzaiw.zzc("Could not call AdListener.onAdLoaded().", e22);
                }
            }
            this.zzarm.zzk(this.zzarm.zzu(str));
            return true;
        } else if (str.startsWith("gmsg://")) {
            return true;
        } else {
            if (this.zzarm.zzaoj != null) {
                try {
                    this.zzarm.zzaoj.onAdLeftApplication();
                } catch (Throwable e222) {
                    zzaiw.zzc("Could not call AdListener.onAdLeftApplication().", e222);
                }
            }
            this.zzarm.zzw(this.zzarm.zzv(str));
            return true;
        }
    }
}
