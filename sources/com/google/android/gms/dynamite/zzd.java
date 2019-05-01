package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule.zzc;

final class zzd implements com.google.android.gms.dynamite.DynamiteModule.zzd {
    zzd() {
    }

    public final zzj zza(Context context, String str, zzi zzi) throws zzc {
        int i;
        zzj zzj = new zzj();
        zzj.zzguw = zzi.zzab(context, str);
        zzj.zzgux = zzi.zzc(context, str, true);
        if (zzj.zzguw == 0 && zzj.zzgux == 0) {
            i = 0;
        } else if (zzj.zzguw >= zzj.zzgux) {
            i = -1;
        } else {
            zzj.zzguy = 1;
            return zzj;
        }
        zzj.zzguy = i;
        return zzj;
    }
}
