package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.zzo;
import com.google.android.gms.dynamic.zzn;

final class zzjc extends zza<zzkb> {
    private /* synthetic */ Context val$context;
    private /* synthetic */ zziw zzbdp;
    private /* synthetic */ String zzbdq;
    private /* synthetic */ zzja zzbds;

    zzjc(zzja zzja, Context context, zziw zziw, String str) {
        this.zzbds = zzja;
        this.val$context = context;
        this.zzbdp = zziw;
        this.zzbdq = str;
        super(zzja);
    }

    public final /* synthetic */ Object zza(zzkj zzkj) throws RemoteException {
        return zzkj.createSearchAdManager(zzn.zzy(this.val$context), this.zzbdp, this.zzbdq, zzo.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public final /* synthetic */ Object zzht() throws RemoteException {
        zzkb zza = this.zzbds.zzbdi.zza(this.val$context, this.zzbdp, this.zzbdq, null, 3);
        if (zza != null) {
            return zza;
        }
        zzja.zza(this.val$context, "search");
        return new zzlp();
    }
}
