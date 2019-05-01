package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.dynamic.zzn;

@zzzb
public final class zzlh {
    private static final Object sLock = new Object();
    private static zzlh zzbfa;
    private zzkp zzbfb;
    private RewardedVideoAd zzbfc;

    private zzlh() {
    }

    public static zzlh zzik() {
        zzlh zzlh;
        synchronized (sLock) {
            if (zzbfa == null) {
                zzbfa = new zzlh();
            }
            zzlh = zzbfa;
        }
        return zzlh;
    }

    public final RewardedVideoAd getRewardedVideoAdInstance(Context context) {
        synchronized (sLock) {
            if (this.zzbfc != null) {
                RewardedVideoAd rewardedVideoAd = this.zzbfc;
                return rewardedVideoAd;
            }
            this.zzbfc = new zzadd(context, (zzacq) zzja.zza(context, false, new zzji(zzjk.zzhy(), context, new zzub())));
            rewardedVideoAd = this.zzbfc;
            return rewardedVideoAd;
        }
    }

    public final void openDebugMenu(Context context, String str) {
        zzbq.zza(this.zzbfb != null, (Object) "MobileAds.initialize() must be called prior to opening debug menu.");
        try {
            this.zzbfb.zzb(zzn.zzy(context), str);
        } catch (Throwable e) {
            zzaiw.zzb("Unable to open debug menu.", e);
        }
    }

    public final void setAppMuted(boolean z) {
        zzbq.zza(this.zzbfb != null, (Object) "MobileAds.initialize() must be called prior to setting app muted state.");
        try {
            this.zzbfb.setAppMuted(z);
        } catch (Throwable e) {
            zzaiw.zzb("Unable to set app mute state.", e);
        }
    }

    public final void setAppVolume(float f) {
        boolean z = false;
        boolean z2 = 0.0f <= f && f <= 1.0f;
        zzbq.checkArgument(z2, "The app volume must be a value between 0 and 1 inclusive.");
        if (this.zzbfb != null) {
            z = true;
        }
        zzbq.zza(z, (Object) "MobileAds.initialize() must be called prior to setting the app volume.");
        try {
            this.zzbfb.setAppVolume(f);
        } catch (Throwable e) {
            zzaiw.zzb("Unable to set app volume.", e);
        }
    }

    public final void zza(Context context, String str, zzlj zzlj) {
        synchronized (sLock) {
            if (this.zzbfb != null) {
                return;
            } else if (context == null) {
                throw new IllegalArgumentException("Context cannot be null.");
            } else {
                try {
                    this.zzbfb = (zzkp) zzja.zza(context, false, new zzjf(zzjk.zzhy(), context));
                    this.zzbfb.initialize();
                    if (str != null) {
                        this.zzbfb.zza(str, zzn.zzy(new zzli(this, context)));
                    }
                } catch (Throwable e) {
                    zzaiw.zzc("MobileAdsSettingManager initialization failed", e);
                }
            }
        }
    }

    public final float zzdh() {
        if (this.zzbfb == null) {
            return 1.0f;
        }
        try {
            return this.zzbfb.zzdh();
        } catch (Throwable e) {
            zzaiw.zzb("Unable to get app volume.", e);
            return 1.0f;
        }
    }

    public final boolean zzdi() {
        if (this.zzbfb == null) {
            return false;
        }
        try {
            return this.zzbfb.zzdi();
        } catch (Throwable e) {
            zzaiw.zzb("Unable to get app mute state.", e);
            return false;
        }
    }
}
