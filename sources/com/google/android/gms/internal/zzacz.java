package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.zzo;
import com.google.android.gms.dynamic.zzn;
import com.google.android.gms.dynamic.zzp;

@zzzb
public final class zzacz extends zzp<zzact> {
    public zzacz() {
        super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
    }

    public final zzacq zza(Context context, zzuc zzuc) {
        try {
            IBinder zza = ((zzact) zzdb(context)).zza(zzn.zzy(context), zzuc, zzo.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            if (zza == null) {
                return null;
            }
            IInterface queryLocalInterface = zza.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
            return queryLocalInterface instanceof zzacq ? (zzacq) queryLocalInterface : new zzacs(zza);
        } catch (Throwable e) {
            zzaiw.zzc("Could not get remote RewardedVideoAd.", e);
            return null;
        }
    }

    protected final /* synthetic */ Object zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
        return queryLocalInterface instanceof zzact ? (zzact) queryLocalInterface : new zzacu(iBinder);
    }
}
