package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.zzo;
import com.google.android.gms.dynamic.zzn;

final class zzji extends zza<zzacq> {
    private /* synthetic */ Context val$context;
    private /* synthetic */ zzuc zzbdr;
    private /* synthetic */ zzja zzbds;

    zzji(zzja zzja, Context context, zzuc zzuc) {
        this.zzbds = zzja;
        this.val$context = context;
        this.zzbdr = zzuc;
        super(zzja);
    }

    public final /* synthetic */ Object zza(zzkj zzkj) throws RemoteException {
        return zzkj.createRewardedVideoAd(zzn.zzy(this.val$context), this.zzbdr, zzo.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public final /* synthetic */ Object zzht() throws RemoteException {
        zzacq zza = this.zzbds.zzbdm.zza(this.val$context, this.zzbdr);
        if (zza != null) {
            return zza;
        }
        zzja.zza(this.val$context, "rewarded_video");
        return new zzlu();
    }
}
