package com.google.android.gms.internal;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzn;

final class zzjj extends zza<zzwj> {
    private /* synthetic */ Activity val$activity;
    private /* synthetic */ zzja zzbds;

    zzjj(zzja zzja, Activity activity) {
        this.zzbds = zzja;
        this.val$activity = activity;
        super(zzja);
    }

    public final /* synthetic */ Object zza(zzkj zzkj) throws RemoteException {
        return zzkj.createAdOverlay(zzn.zzy(this.val$activity));
    }

    public final /* synthetic */ Object zzht() throws RemoteException {
        zzwj zze = this.zzbds.zzbdn.zze(this.val$activity);
        if (zze != null) {
            return zze;
        }
        zzja.zza(this.val$activity, "ad_overlay");
        return null;
    }
}
