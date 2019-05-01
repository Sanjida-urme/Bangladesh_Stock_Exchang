package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

@zzzb
public final class zzpp extends NativeAppInstallAd {
    private final VideoController zzbeq = new VideoController();
    private final zzpm zzbuj;
    private final List<Image> zzbuk = new ArrayList();
    private final zzpb zzbul;
    private final AdChoicesInfo zzbum;

    public zzpp(zzpm zzpm) {
        zzpb zzpb;
        this.zzbuj = zzpm;
        AdChoicesInfo adChoicesInfo = null;
        try {
            List images = this.zzbuj.getImages();
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
            zzoy zzjm = this.zzbuj.zzjm();
            if (zzjm != null) {
                zzpb = new zzpb(zzjm);
                this.zzbul = zzpb;
                if (this.zzbuj.zzjs() != null) {
                    adChoicesInfo = new zzox(this.zzbuj.zzjs());
                }
                this.zzbum = adChoicesInfo;
            }
        } catch (Throwable e2) {
            zzaiw.zzb("Failed to get image.", e2);
        }
        zzpb = null;
        this.zzbul = zzpb;
        try {
            if (this.zzbuj.zzjs() != null) {
                adChoicesInfo = new zzox(this.zzbuj.zzjs());
            }
        } catch (Throwable e22) {
            zzaiw.zzb("Failed to get attribution info.", e22);
        }
        this.zzbum = adChoicesInfo;
    }

    private final IObjectWrapper zzjn() {
        try {
            return this.zzbuj.zzjn();
        } catch (Throwable e) {
            zzaiw.zzb("Failed to retrieve native ad engine.", e);
            return null;
        }
    }

    public final void destroy() {
        try {
            this.zzbuj.destroy();
        } catch (Throwable e) {
            zzaiw.zzb("Failed to destroy", e);
        }
    }

    public final AdChoicesInfo getAdChoicesInfo() {
        return this.zzbum;
    }

    public final CharSequence getBody() {
        try {
            return this.zzbuj.getBody();
        } catch (Throwable e) {
            zzaiw.zzb("Failed to get body.", e);
            return null;
        }
    }

    public final CharSequence getCallToAction() {
        try {
            return this.zzbuj.getCallToAction();
        } catch (Throwable e) {
            zzaiw.zzb("Failed to get call to action.", e);
            return null;
        }
    }

    public final Bundle getExtras() {
        try {
            return this.zzbuj.getExtras();
        } catch (Throwable e) {
            zzaiw.zzb("Failed to get extras", e);
            return null;
        }
    }

    public final CharSequence getHeadline() {
        try {
            return this.zzbuj.getHeadline();
        } catch (Throwable e) {
            zzaiw.zzb("Failed to get headline.", e);
            return null;
        }
    }

    public final Image getIcon() {
        return this.zzbul;
    }

    public final List<Image> getImages() {
        return this.zzbuk;
    }

    public final CharSequence getMediationAdapterClassName() {
        try {
            return this.zzbuj.getMediationAdapterClassName();
        } catch (Throwable e) {
            zzaiw.zzb("Failed to get mediation adapter class name.", e);
            return null;
        }
    }

    public final CharSequence getPrice() {
        try {
            return this.zzbuj.getPrice();
        } catch (Throwable e) {
            zzaiw.zzb("Failed to get price.", e);
            return null;
        }
    }

    public final Double getStarRating() {
        try {
            double starRating = this.zzbuj.getStarRating();
            return starRating == -1.0d ? null : Double.valueOf(starRating);
        } catch (Throwable e) {
            zzaiw.zzb("Failed to get star rating.", e);
            return null;
        }
    }

    public final CharSequence getStore() {
        try {
            return this.zzbuj.getStore();
        } catch (Throwable e) {
            zzaiw.zzb("Failed to get store", e);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            if (this.zzbuj.getVideoController() != null) {
                this.zzbeq.zza(this.zzbuj.getVideoController());
            }
        } catch (Throwable e) {
            zzaiw.zzb("Exception occurred while getting video controller", e);
        }
        return this.zzbeq;
    }

    public final void performClick(Bundle bundle) {
        try {
            this.zzbuj.performClick(bundle);
        } catch (Throwable e) {
            zzaiw.zzb("Failed to perform click.", e);
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zzbuj.recordImpression(bundle);
        } catch (Throwable e) {
            zzaiw.zzb("Failed to record impression.", e);
            return false;
        }
    }

    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zzbuj.reportTouchEvent(bundle);
        } catch (Throwable e) {
            zzaiw.zzb("Failed to report touch event.", e);
        }
    }

    protected final /* synthetic */ Object zzbg() {
        return zzjn();
    }
}
