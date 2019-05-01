package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdqg.zza;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class zzdpl implements zzdsm {
    private final int zzlqd;
    private final int zzlqe;
    private zzdqg zzlqf;
    private zzdpq zzlqg;
    private int zzlqh;

    zzdpl(zzdrp zzdrp) throws GeneralSecurityException {
        String zzbnt = zzdrp.zzbnt();
        if (zzbnt.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                zzdqi zzs = zzdqi.zzs(zzdrp.zzbnu());
                this.zzlqd = zzdpm.zzlqi;
                this.zzlqf = (zzdqg) zzdpa.zzlqa.zzb(zzdrp);
                this.zzlqe = zzs.getKeySize();
            } catch (Throwable e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (zzbnt.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                zzdps zzi = zzdps.zzi(zzdrp.zzbnu());
                this.zzlqd = zzdpm.zzlqj;
                this.zzlqg = (zzdpq) zzdpa.zzlqa.zzb(zzdrp);
                this.zzlqh = zzi.zzblq().getKeySize();
                this.zzlqe = this.zzlqh + zzi.zzblr().getKeySize();
            } catch (Throwable e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e2);
            }
        } else {
            String str = "unsupported AEAD DEM key type: ";
            zzbnt = String.valueOf(zzbnt);
            throw new GeneralSecurityException(zzbnt.length() != 0 ? str.concat(zzbnt) : new String(str));
        }
    }

    public final zzdoo zzad(byte[] bArr) throws GeneralSecurityException {
        zzffq zzffq;
        zzdpa zzdpa;
        String str;
        if (this.zzlqd == zzdpm.zzlqi) {
            zzffq = (zzdqg) ((zza) zzdqg.zzbmj().zza(this.zzlqf)).zzr(zzfdp.zzay(bArr)).zzcvl();
            zzdpa = zzdpa.zzlqa;
            str = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        } else if (this.zzlqd == zzdpm.zzlqj) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.zzlqh);
            zzdre zzdre = (zzdre) ((zzdre.zza) zzdre.zzbnk().zza(this.zzlqg.zzbln())).zzx(zzfdp.zzay(Arrays.copyOfRange(bArr, this.zzlqh, this.zzlqe))).zzcvl();
            zzdpq zzdpq = (zzdpq) zzdpq.zzblo().zzfj(this.zzlqg.getVersion()).zzb((zzdpu) ((zzdpu.zza) zzdpu.zzblv().zza(this.zzlqg.zzblm())).zzl(zzfdp.zzay(copyOfRange)).zzcvl()).zzb(zzdre).zzcvl();
            zzdpa = zzdpa.zzlqa;
            str = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        } else {
            throw new GeneralSecurityException("unknown DEM key type");
        }
        return (zzdoo) zzdpa.zzb(str, zzffq);
    }

    public final int zzbll() {
        return this.zzlqe;
    }
}
