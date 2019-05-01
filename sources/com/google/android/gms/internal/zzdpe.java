package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdrk.zzb;
import java.security.GeneralSecurityException;

public final class zzdpe implements zzdos<zzdoo> {
    zzdpe() {
    }

    private final zzdoo zzd(zzfdp zzfdp) throws GeneralSecurityException {
        try {
            zzdqa zzn = zzdqa.zzn(zzfdp);
            if (zzn instanceof zzdqa) {
                zzn = zzn;
                zzdte.zzt(zzn.getVersion(), 0);
                zzdte.zzgd(zzn.zzblu().size());
                if (zzn.zzbmd().zzbma() == 12 || zzn.zzbmd().zzbma() == 16) {
                    return new zzdry(zzn.zzblu().toByteArray(), zzn.zzbmd().zzbma());
                }
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
            throw new GeneralSecurityException("expected AesEaxKey proto");
        } catch (Throwable e) {
            throw new GeneralSecurityException("expected serialized AesEaxKey proto", e);
        }
    }

    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    public final /* synthetic */ Object zza(zzfdp zzfdp) throws GeneralSecurityException {
        return zzd(zzfdp);
    }

    public final /* synthetic */ Object zza(zzffq zzffq) throws GeneralSecurityException {
        if (zzffq instanceof zzdqa) {
            zzdqa zzdqa = (zzdqa) zzffq;
            zzdte.zzt(zzdqa.getVersion(), 0);
            zzdte.zzgd(zzdqa.zzblu().size());
            if (zzdqa.zzbmd().zzbma() == 12 || zzdqa.zzbmd().zzbma() == 16) {
                return new zzdry(zzdqa.zzblu().toByteArray(), zzdqa.zzbmd().zzbma());
            }
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
        throw new GeneralSecurityException("expected AesEaxKey proto");
    }

    public final zzffq zzb(zzfdp zzfdp) throws GeneralSecurityException {
        try {
            return zzb(zzdqc.zzp(zzfdp));
        } catch (Throwable e) {
            throw new GeneralSecurityException("expected serialized AesEaxKeyFormat proto", e);
        }
    }

    public final zzffq zzb(zzffq zzffq) throws GeneralSecurityException {
        if (zzffq instanceof zzdqc) {
            zzdqc zzdqc = (zzdqc) zzffq;
            zzdte.zzgd(zzdqc.getKeySize());
            if (zzdqc.zzbmd().zzbma() == 12 || zzdqc.zzbmd().zzbma() == 16) {
                return zzdqa.zzbme().zzo(zzfdp.zzay(zzdtd.zzgc(zzdqc.getKeySize()))).zzb(zzdqc.zzbmd()).zzfl(0).zzcvl();
            }
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
        throw new GeneralSecurityException("expected AesEaxKeyFormat proto");
    }

    public final zzdrk zzc(zzfdp zzfdp) throws GeneralSecurityException {
        return (zzdrk) zzdrk.zzbnw().zzob("type.googleapis.com/google.crypto.tink.AesEaxKey").zzaa(((zzdqa) zzb(zzfdp)).toByteString()).zzb(zzb.SYMMETRIC).zzcvl();
    }
}
