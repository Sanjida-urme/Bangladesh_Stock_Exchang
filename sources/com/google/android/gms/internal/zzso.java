package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzak;
import com.google.android.gms.ads.internal.zzbs;

final class zzso {
    zzak zzbyd;
    @Nullable
    zzis zzbye;
    zzrj zzbyf;
    long zzbyg;
    boolean zzbyh;
    boolean zzbyi;
    private /* synthetic */ zzsn zzbyj;

    zzso(zzsn zzsn, zzri zzri) {
        this.zzbyj = zzsn;
        this.zzbyd = zzri.zzav(zzsn.zzaou);
        this.zzbyf = new zzrj();
        zzrj zzrj = this.zzbyf;
        zza zza = this.zzbyd;
        zza.zza(new zzrk(zzrj));
        zza.zza(new zzrs(zzrj));
        zza.zza(new zzru(zzrj));
        zza.zza(new zzrw(zzrj));
        zza.zza(new zzry(zzrj));
    }

    zzso(zzsn zzsn, zzri zzri, zzis zzis) {
        this(zzsn, zzri);
        this.zzbye = zzis;
    }

    final boolean load() {
        if (this.zzbyh) {
            return false;
        }
        this.zzbyi = this.zzbyd.zzb(zzsl.zzj(this.zzbye != null ? this.zzbye : this.zzbyj.zzbya));
        this.zzbyh = true;
        this.zzbyg = zzbs.zzei().currentTimeMillis();
        return true;
    }
}
