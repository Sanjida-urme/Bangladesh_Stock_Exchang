package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule.zzc;
import com.google.android.gms.dynamite.DynamiteModule.zzd;

final class zzb implements zzd {
    zzb() {
    }

    public final zzj zza(Context context, String str, zzi zzi) throws zzc {
        zzj zzj = new zzj();
        zzj.zzgux = zzi.zzc(context, str, true);
        if (zzj.zzgux != 0) {
            zzj.zzguy = 1;
            return zzj;
        }
        zzj.zzguw = zzi.zzab(context, str);
        if (zzj.zzguw != 0) {
            zzj.zzguy = -1;
        }
        return zzj;
    }
}
