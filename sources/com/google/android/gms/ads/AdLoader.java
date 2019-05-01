package com.google.android.gms.ads;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener;
import com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.internal.zzaiw;
import com.google.android.gms.internal.zzip;
import com.google.android.gms.internal.zziv;
import com.google.android.gms.internal.zziw;
import com.google.android.gms.internal.zzjk;
import com.google.android.gms.internal.zzjt;
import com.google.android.gms.internal.zzjw;
import com.google.android.gms.internal.zzlc;
import com.google.android.gms.internal.zzom;
import com.google.android.gms.internal.zzqp;
import com.google.android.gms.internal.zzqq;
import com.google.android.gms.internal.zzqr;
import com.google.android.gms.internal.zzqs;
import com.google.android.gms.internal.zzqt;
import com.google.android.gms.internal.zzub;

public class AdLoader {
    private final Context mContext;
    private final zziv zzakq;
    private final zzjt zzakr;

    public static class Builder {
        private final Context mContext;
        private final zzjw zzaks;

        private Builder(Context context, zzjw zzjw) {
            this.mContext = context;
            this.zzaks = zzjw;
        }

        public Builder(Context context, String str) {
            this((Context) zzbq.checkNotNull(context, "context cannot be null"), zzjk.zzhy().zzb(context, str, new zzub()));
        }

        public AdLoader build() {
            try {
                return new AdLoader(this.mContext, this.zzaks.zzdc());
            } catch (Throwable e) {
                zzaiw.zzb("Failed to build AdLoader.", e);
                return null;
            }
        }

        public Builder forAppInstallAd(OnAppInstallAdLoadedListener onAppInstallAdLoadedListener) {
            try {
                this.zzaks.zza(new zzqp(onAppInstallAdLoadedListener));
                return this;
            } catch (Throwable e) {
                zzaiw.zzc("Failed to add app install ad listener", e);
                return this;
            }
        }

        public Builder forContentAd(OnContentAdLoadedListener onContentAdLoadedListener) {
            try {
                this.zzaks.zza(new zzqq(onContentAdLoadedListener));
                return this;
            } catch (Throwable e) {
                zzaiw.zzc("Failed to add content ad listener", e);
                return this;
            }
        }

        public Builder forCustomTemplateAd(String str, OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, OnCustomClickListener onCustomClickListener) {
            try {
                this.zzaks.zza(str, new zzqs(onCustomTemplateAdLoadedListener), onCustomClickListener == null ? null : new zzqr(onCustomClickListener));
                return this;
            } catch (Throwable e) {
                zzaiw.zzc("Failed to add custom template ad listener", e);
                return this;
            }
        }

        public Builder forPublisherAdView(OnPublisherAdViewLoadedListener onPublisherAdViewLoadedListener, AdSize... adSizeArr) {
            if (adSizeArr != null) {
                if (adSizeArr.length > 0) {
                    try {
                        this.zzaks.zza(new zzqt(onPublisherAdViewLoadedListener), new zziw(this.mContext, adSizeArr));
                        return this;
                    } catch (Throwable e) {
                        zzaiw.zzc("Failed to add publisher banner ad listener", e);
                        return this;
                    }
                }
            }
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }

        public Builder withAdListener(AdListener adListener) {
            try {
                this.zzaks.zzb(new zzip(adListener));
                return this;
            } catch (Throwable e) {
                zzaiw.zzc("Failed to set AdListener.", e);
                return this;
            }
        }

        public Builder withCorrelator(@NonNull Correlator correlator) {
            zzbq.checkNotNull(correlator);
            try {
                this.zzaks.zzb(correlator.zzbc());
                return this;
            } catch (Throwable e) {
                zzaiw.zzc("Failed to set correlator.", e);
                return this;
            }
        }

        public Builder withNativeAdOptions(NativeAdOptions nativeAdOptions) {
            try {
                this.zzaks.zza(new zzom(nativeAdOptions));
                return this;
            } catch (Throwable e) {
                zzaiw.zzc("Failed to specify native ad options", e);
                return this;
            }
        }

        public Builder withPublisherAdViewOptions(PublisherAdViewOptions publisherAdViewOptions) {
            try {
                this.zzaks.zza(publisherAdViewOptions);
                return this;
            } catch (Throwable e) {
                zzaiw.zzc("Failed to specify DFP banner ad options", e);
                return this;
            }
        }
    }

    AdLoader(Context context, zzjt zzjt) {
        this(context, zzjt, zziv.zzbcz);
    }

    private AdLoader(Context context, zzjt zzjt, zziv zziv) {
        this.mContext = context;
        this.zzakr = zzjt;
        this.zzakq = zziv;
    }

    private final void zza(zzlc zzlc) {
        try {
            this.zzakr.zzd(zziv.zza(this.mContext, zzlc));
        } catch (Throwable e) {
            zzaiw.zzb("Failed to load ad.", e);
        }
    }

    @Deprecated
    public String getMediationAdapterClassName() {
        try {
            return this.zzakr.zzcj();
        } catch (Throwable e) {
            zzaiw.zzc("Failed to get the mediation adapter class name.", e);
            return null;
        }
    }

    public boolean isLoading() {
        try {
            return this.zzakr.isLoading();
        } catch (Throwable e) {
            zzaiw.zzc("Failed to check if ad is loading.", e);
            return false;
        }
    }

    @RequiresPermission("android.permission.INTERNET")
    public void loadAd(AdRequest adRequest) {
        zza(adRequest.zzbb());
    }

    public void loadAd(PublisherAdRequest publisherAdRequest) {
        zza(publisherAdRequest.zzbb());
    }

    @RequiresPermission("android.permission.INTERNET")
    public void loadAds(AdRequest adRequest, int i) {
        try {
            this.zzakr.zza(zziv.zza(this.mContext, adRequest.zzbb()), i);
        } catch (Throwable e) {
            zzaiw.zzb("Failed to load ads.", e);
        }
    }
}
