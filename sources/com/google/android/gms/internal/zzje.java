package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.zzo;
import com.google.android.gms.dynamic.zzn;

final class zzje extends zza<zzjw> {
    private /* synthetic */ Context val$context;
    private /* synthetic */ String zzbdq;
    private /* synthetic */ zzuc zzbdr;
    private /* synthetic */ zzja zzbds;

    zzje(zzja zzja, Context context, String str, zzuc zzuc) {
        this.zzbds = zzja;
        this.val$context = context;
        this.zzbdq = str;
        this.zzbdr = zzuc;
        super(zzja);
    }

    public final /* synthetic */ Object zza(zzkj zzkj) throws RemoteException {
        return zzkj.createAdLoaderBuilder(zzn.zzy(this.val$context), this.zzbdq, this.zzbdr, zzo.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public final /* synthetic */ Object zzht() throws RemoteException {
        zzjw zza = this.zzbds.zzbdj.zza(this.val$context, this.zzbdq, this.zzbdr);
        if (zza != null) {
            return zza;
        }
        zzja.zza(this.val$context, "native_ad");
        return new zzll();
    }
}
