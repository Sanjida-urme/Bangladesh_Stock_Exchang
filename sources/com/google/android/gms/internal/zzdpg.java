package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdrk.zzb;
import java.security.GeneralSecurityException;

public final class zzdpg implements zzdos<zzdoo> {
    zzdpg() {
    }

    private static zzdqm zzblk() throws GeneralSecurityException {
        return (zzdqm) zzdqm.zzbmp().zzfn(0).zzu(zzfdp.zzay(zzdtd.zzgc(32))).zzcvl();
    }

    private final zzdoo zzd(zzfdp zzfdp) throws GeneralSecurityException {
        try {
            zzdqm zzt = zzdqm.zzt(zzfdp);
            if (zzt instanceof zzdqm) {
                zzt = zzt;
                zzdte.zzt(zzt.getVersion(), 0);
                if (zzt.zzblu().size() == 32) {
                    return zzdsf.zzaj(zzt.zzblu().toByteArray());
                }
                throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
            }
            throw new GeneralSecurityException("expected ChaCha20Poly1305Key proto");
        } catch (Throwable e) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305 key", e);
        }
    }

    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    public final /* synthetic */ Object zza(zzfdp zzfdp) throws GeneralSecurityException {
        return zzd(zzfdp);
    }

    public final /* synthetic */ Object zza(zzffq zzffq) throws GeneralSecurityException {
        if (zzffq instanceof zzdqm) {
            zzdqm zzdqm = (zzdqm) zzffq;
            zzdte.zzt(zzdqm.getVersion(), 0);
            if (zzdqm.zzblu().size() == 32) {
                return zzdsf.zzaj(zzdqm.zzblu().toByteArray());
            }
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
        throw new GeneralSecurityException("expected ChaCha20Poly1305Key proto");
    }

    public final zzffq zzb(zzfdp zzfdp) throws GeneralSecurityException {
        return zzblk();
    }

    public final zzffq zzb(zzffq zzffq) throws GeneralSecurityException {
        return zzblk();
    }

    public final zzdrk zzc(zzfdp zzfdp) throws GeneralSecurityException {
        return (zzdrk) zzdrk.zzbnw().zzob("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key").zzaa(zzblk().toByteString()).zzb(zzb.SYMMETRIC).zzcvl();
    }
}
