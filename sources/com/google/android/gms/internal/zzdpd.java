package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdrk.zzb;
import java.security.GeneralSecurityException;

final class zzdpd implements zzdos<zzdtb> {
    zzdpd() {
    }

    private static void zza(zzdpy zzdpy) throws GeneralSecurityException {
        if (zzdpy.zzbma() >= 12) {
            if (zzdpy.zzbma() <= 16) {
                return;
            }
        }
        throw new GeneralSecurityException("invalid IV size");
    }

    private final zzdrx zze(zzfdp zzfdp) throws GeneralSecurityException {
        try {
            zzdpu zzk = zzdpu.zzk(zzfdp);
            if (zzk instanceof zzdpu) {
                zzk = zzk;
                zzdte.zzt(zzk.getVersion(), 0);
                zzdte.zzgd(zzk.zzblu().size());
                zza(zzk.zzblt());
                return new zzdrx(zzk.zzblu().toByteArray(), zzk.zzblt().zzbma());
            }
            throw new GeneralSecurityException("expected AesCtrKey proto");
        } catch (Throwable e) {
            throw new GeneralSecurityException("expected serialized AesCtrKey proto", e);
        }
    }

    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    public final /* synthetic */ Object zza(zzfdp zzfdp) throws GeneralSecurityException {
        return zze(zzfdp);
    }

    public final /* synthetic */ Object zza(zzffq zzffq) throws GeneralSecurityException {
        if (zzffq instanceof zzdpu) {
            zzdpu zzdpu = (zzdpu) zzffq;
            zzdte.zzt(zzdpu.getVersion(), 0);
            zzdte.zzgd(zzdpu.zzblu().size());
            zza(zzdpu.zzblt());
            return new zzdrx(zzdpu.zzblu().toByteArray(), zzdpu.zzblt().zzbma());
        }
        throw new GeneralSecurityException("expected AesCtrKey proto");
    }

    public final zzffq zzb(zzfdp zzfdp) throws GeneralSecurityException {
        try {
            return zzb(zzdpw.zzm(zzfdp));
        } catch (Throwable e) {
            throw new GeneralSecurityException("expected serialized AesCtrKeyFormat proto", e);
        }
    }

    public final zzffq zzb(zzffq zzffq) throws GeneralSecurityException {
        if (zzffq instanceof zzdpw) {
            zzdpw zzdpw = (zzdpw) zzffq;
            zzdte.zzgd(zzdpw.getKeySize());
            zza(zzdpw.zzblt());
            return zzdpu.zzblv().zzc(zzdpw.zzblt()).zzl(zzfdp.zzay(zzdtd.zzgc(zzdpw.getKeySize()))).zzfk(0).zzcvl();
        }
        throw new GeneralSecurityException("expected AesCtrKeyFormat proto");
    }

    public final zzdrk zzc(zzfdp zzfdp) throws GeneralSecurityException {
        return (zzdrk) zzdrk.zzbnw().zzob("type.googleapis.com/google.crypto.tink.AesCtrKey").zzaa(((zzdpu) zzb(zzfdp)).toByteString()).zzb(zzb.SYMMETRIC).zzcvl();
    }
}
