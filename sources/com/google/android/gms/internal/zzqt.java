package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;

public final class zzqt extends zzql {
    private final OnPublisherAdViewLoadedListener zzbuw;

    public zzqt(OnPublisherAdViewLoadedListener onPublisherAdViewLoadedListener) {
        this.zzbuw = onPublisherAdViewLoadedListener;
    }

    public final void zza(zzkb zzkb, IObjectWrapper iObjectWrapper) {
        if (zzkb != null && iObjectWrapper != null) {
            PublisherAdView publisherAdView = new PublisherAdView((Context) zzn.zzx(iObjectWrapper));
            AppEventListener appEventListener = null;
            try {
                if (zzkb.zzby() instanceof zzip) {
                    zzip zzip = (zzip) zzkb.zzby();
                    publisherAdView.setAdListener(zzip != null ? zzip.getAdListener() : null);
                }
            } catch (Throwable e) {
                zzaiw.zzc("Failed to get ad listener.", e);
            }
            try {
                if (zzkb.zzbx() instanceof zziy) {
                    zziy zziy = (zziy) zzkb.zzbx();
                    if (zziy != null) {
                        appEventListener = zziy.getAppEventListener();
                    }
                    publisherAdView.setAppEventListener(appEventListener);
                }
            } catch (Throwable e2) {
                zzaiw.zzc("Failed to get app event listener.", e2);
            }
            zzais.zzdbs.post(new zzqu(this, publisherAdView, zzkb));
        }
    }
}
