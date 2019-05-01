package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

@zzzb
public final class zzpt extends NativeContentAd {
    private final VideoController zzbeq = new VideoController();
    private final List<Image> zzbuk = new ArrayList();
    private final AdChoicesInfo zzbum;
    private final zzpq zzbun;
    private final zzpb zzbuo;

    public zzpt(zzpq zzpq) {
        zzpb zzpb;
        this.zzbun = zzpq;
        AdChoicesInfo adChoicesInfo = null;
        try {
            List images = this.zzbun.getImages();
            if (images != null) {
                for (Object next : images) {
                    zzoy zzpa;
                    if (next instanceof IBinder) {
                        IBinder iBinder = (IBinder) next;
                        if (iBinder != null) {
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                            zzpa = queryLocalInterface instanceof zzoy ? (zzoy) queryLocalInterface : new zzpa(iBinder);
                            if (zzpa != null) {
                                this.zzbuk.add(new zzpb(zzpa));
                            }
                        }
                    }
                    zzpa = null;
                    if (zzpa != null) {
                        this.zzbuk.add(new zzpb(zzpa));
                    }
                }
            }
        } catch (Throwable e) {
            zzaiw.zzb("Failed to get image.", e);
        }
        try {
            zzoy zzjt = this.zzbun.zzjt();
            if (zzjt != null) {
                zzpb = new zzpb(zzjt);
                this.zzbuo = zzpb;
                if (this.zzbun.zzjs() != null) {
                    adChoicesInfo = new zzox(this.zzbun.zzjs());
                }
                this.zzbum = adChoicesInfo;
            }
        } catch (Throwable e2) {
            zzaiw.zzb("Failed to get image.", e2);
        }
        zzpb = null;
        this.zzbuo = zzpb;
        try {
            if (this.zzbun.zzjs() != null) {
                adChoicesInfo = new zzox(this.zzbun.zzjs());
            }
        } catch (Throwable e22) {
            zzaiw.zzb("Failed to get attribution info.", e22);
        }
        this.zzbum = adChoicesInfo;
    }

    private final IObjectWrapper zzjn() {
        try {
            return this.zzbun.zzjn();
        } catch (Throwable e) {
            zzaiw.zzb("Failed to retrieve native ad engine.", e);
            return null;
        }
    }

    public final void destroy() {
        try {
            this.zzbun.destroy();
        } catch (Throwable e) {
            zzaiw.zzb("Failed to destroy", e);
        }
    }

    public final AdChoicesInfo getAdChoicesInfo() {
        return this.zzbum;
    }

    public final CharSequence getAdvertiser() {
        try {
            return this.zzbun.getAdvertiser();
        } catch (Throwable e) {
            zzaiw.zzb("Failed to get attribution.", e);
            return null;
        }
    }

    public final CharSequence getBody() {
        try {
            return this.zzbun.getBody();
        } catch (Throwable e) {
            zzaiw.zzb("Failed to get body.", e);
            return null;
        }
    }

    public final CharSequence getCallToAction() {
        try {
            return this.zzbun.getCallToAction();
        } catch (Throwable e) {
            zzaiw.zzb("Failed to get call to action.", e);
            return null;
        }
    }

    public final Bundle getExtras() {
        try {
            return this.zzbun.getExtras();
        } catch (Throwable e) {
            zzaiw.zzc("Failed to get extras", e);
            return null;
        }
    }

    public final CharSequence getHeadline() {
        try {
            return this.zzbun.getHeadline();
        } catch (Throwable e) {
            zzaiw.zzb("Failed to get headline.", e);
            return null;
        }
    }

    public final List<Image> getImages() {
        return this.zzbuk;
    }

    public final Image getLogo() {
        return this.zzbuo;
    }

    public final CharSequence getMediationAdapterClassName() {
        try {
            return this.zzbun.getMediationAdapterClassName();
        } catch (Throwable e) {
            zzaiw.zzb("Failed to get mediation adapter class name.", e);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            if (this.zzbun.getVideoController() != null) {
                this.zzbeq.zza(this.zzbun.getVideoController());
            }
        } catch (Throwable e) {
            zzaiw.zzb("Exception occurred while getting video controller", e);
        }
        return this.zzbeq;
    }

    public final void performClick(Bundle bundle) {
        try {
            this.zzbun.performClick(bundle);
        } catch (Throwable e) {
            zzaiw.zzb("Failed to perform click.", e);
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zzbun.recordImpression(bundle);
        } catch (Throwable e) {
            zzaiw.zzb("Failed to record impression.", e);
            return false;
        }
    }

    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zzbun.reportTouchEvent(bundle);
        } catch (Throwable e) {
            zzaiw.zzb("Failed to report touch event.", e);
        }
    }

    protected final /* synthetic */ Object zzbg() {
        return zzjn();
    }
}
