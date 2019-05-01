package com.google.android.gms.internal;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.zzn;
import java.util.HashMap;

final class zzjh extends zza<zzph> {
    private /* synthetic */ zzja zzbds;
    private /* synthetic */ View zzbdv;
    private /* synthetic */ HashMap zzbdw;
    private /* synthetic */ HashMap zzbdx;

    zzjh(zzja zzja, View view, HashMap hashMap, HashMap hashMap2) {
        this.zzbds = zzja;
        this.zzbdv = view;
        this.zzbdw = hashMap;
        this.zzbdx = hashMap2;
        super(zzja);
    }

    public final /* synthetic */ Object zza(zzkj zzkj) throws RemoteException {
        return zzkj.createNativeAdViewHolderDelegate(zzn.zzy(this.zzbdv), zzn.zzy(this.zzbdw), zzn.zzy(this.zzbdx));
    }

    public final /* synthetic */ Object zzht() throws RemoteException {
        zzph zzb = this.zzbds.zzbdo.zzb(this.zzbdv, this.zzbdw, this.zzbdx);
        if (zzb != null) {
            return zzb;
        }
        zzja.zza(this.zzbdv.getContext(), "native_ad_view_holder_delegate");
        return new zzlt();
    }
}
