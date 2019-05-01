package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.zzo;
import com.google.android.gms.dynamic.zzn;

final class zzjf extends zza<zzkp> {
    private /* synthetic */ Context val$context;
    private /* synthetic */ zzja zzbds;

    zzjf(zzja zzja, Context context) {
        this.zzbds = zzja;
        this.val$context = context;
        super(zzja);
    }

    public final /* synthetic */ Object zza(zzkj zzkj) throws RemoteException {
        return zzkj.getMobileAdsSettingsManagerWithClientJarVersion(zzn.zzy(this.val$context), zzo.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public final /* synthetic */ Object zzht() throws RemoteException {
        zzkp zzh = this.zzbds.zzbdk.zzh(this.val$context);
        if (zzh != null) {
            return zzh;
        }
        zzja.zza(this.val$context, "mobile_ads_settings");
        return new zzlr();
    }
}
