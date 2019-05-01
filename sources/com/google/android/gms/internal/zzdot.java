package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdrr.zzb;
import java.security.GeneralSecurityException;

public final class zzdot {
    private final zzdrr zzlpp;
    private final zzdra zzlpq = null;

    zzdot(zzdrr zzdrr) {
        this.zzlpp = zzdrr;
    }

    public static void zza(zzdrr zzdrr) throws GeneralSecurityException {
        if (zzdrr != null) {
            if (zzdrr.zzbod() > 0) {
                return;
            }
        }
        throw new GeneralSecurityException("empty keyset");
    }

    public final String toString() {
        zzdrr zzdrr = this.zzlpp;
        zzfen zzfv = zzdrt.zzbom().zzfv(zzdrr.zzbob());
        for (zzb zzb : zzdrr.zzboc()) {
            zzfv.zzb((zzdrt.zzb) zzdrt.zzb.zzbop().zzoc(zzb.zzbog().zzbnt()).zzb(zzb.zzboh()).zzb(zzb.zzboj()).zzfx(zzb.zzboi()).zzcvl());
        }
        return ((zzdrt) zzfv.zzcvl()).toString();
    }

    public final zzdrr zzblf() {
        return this.zzlpp;
    }
}
