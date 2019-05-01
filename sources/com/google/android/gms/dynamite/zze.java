package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule.zzc;
import com.google.android.gms.dynamite.DynamiteModule.zzd;

final class zze implements zzd {
    zze() {
    }

    public final zzj zza(Context context, String str, zzi zzi) throws zzc {
        zzj zzj = new zzj();
        zzj.zzguw = zzi.zzab(context, str);
        zzj.zzgux = zzj.zzguw != 0 ? zzi.zzc(context, str, false) : zzi.zzc(context, str, true);
        if (zzj.zzguw == 0 && zzj.zzgux == 0) {
            zzj.zzguy = 0;
            return zzj;
        } else if (zzj.zzguw >= zzj.zzgux) {
            zzj.zzguy = -1;
            return zzj;
        } else {
            zzj.zzguy = 1;
            return zzj;
        }
    }
}
