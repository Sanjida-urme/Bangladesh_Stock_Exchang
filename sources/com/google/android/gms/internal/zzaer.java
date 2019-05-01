package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;

@zzzb
public final class zzaer implements zzaet {
    public final zzajp<String> zza(String str, PackageInfo packageInfo) {
        return zzajg.zzi(str);
    }

    public final zzajp<Info> zzac(Context context) {
        zzajp zzajy = new zzajy();
        zzjk.zzhx();
        if (zzais.zzbe(context)) {
            zzagl.zza(new zzaes(this, context, zzajy));
        }
        return zzajy;
    }
}
