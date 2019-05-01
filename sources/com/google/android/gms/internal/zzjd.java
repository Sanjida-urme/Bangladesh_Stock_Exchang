package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.zzo;
import com.google.android.gms.dynamic.zzn;

final class zzjd extends zza<zzkb> {
    private /* synthetic */ Context val$context;
    private /* synthetic */ zziw zzbdp;
    private /* synthetic */ String zzbdq;
    private /* synthetic */ zzuc zzbdr;
    private /* synthetic */ zzja zzbds;

    zzjd(zzja zzja, Context context, zziw zziw, String str, zzuc zzuc) {
        this.zzbds = zzja;
        this.val$context = context;
        this.zzbdp = zziw;
        this.zzbdq = str;
        this.zzbdr = zzuc;
        super(zzja);
    }

    public final /* synthetic */ Object zza(zzkj zzkj) throws RemoteException {
        return zzkj.createInterstitialAdManager(zzn.zzy(this.val$context), this.zzbdp, this.zzbdq, this.zzbdr, zzo.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public final /* synthetic */ Object zzht() throws RemoteException {
        zzkb zza = this.zzbds.zzbdi.zza(this.val$context, this.zzbdp, this.zzbdq, this.zzbdr, 2);
        if (zza != null) {
            return zza;
        }
        zzja.zza(this.val$context, "interstitial");
        return new zzlp();
    }
}
