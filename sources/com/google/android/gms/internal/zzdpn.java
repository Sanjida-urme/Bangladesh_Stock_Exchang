package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdrk.zzb;
import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;

public final class zzdpn implements zzdos<zzdou> {
    zzdpn() {
    }

    private static void zza(zzdri zzdri) throws GeneralSecurityException {
        if (zzdri.zzbnq() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        switch (zzdpo.zzlpx[zzdri.zzbnp().ordinal()]) {
            case 1:
                if (zzdri.zzbnq() > 20) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            case 2:
                if (zzdri.zzbnq() > 32) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            case 3:
                if (zzdri.zzbnq() > 64) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            default:
                throw new GeneralSecurityException("unknown hash type");
        }
    }

    private final zzdou zzg(zzfdp zzfdp) throws GeneralSecurityException {
        try {
            zzdre zzw = zzdre.zzw(zzfdp);
            if (zzw instanceof zzdre) {
                zzw = zzw;
                zzdte.zzt(zzw.getVersion(), 0);
                if (zzw.zzblu().size() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                zzdtc zzdtc;
                zza(zzw.zzbnj());
                zzdrc zzbnp = zzw.zzbnj().zzbnp();
                Key secretKeySpec = new SecretKeySpec(zzw.zzblu().toByteArray(), "HMAC");
                int zzbnq = zzw.zzbnj().zzbnq();
                switch (zzdpo.zzlpx[zzbnp.ordinal()]) {
                    case 1:
                        zzdtc = new zzdtc("HMACSHA1", secretKeySpec, zzbnq);
                        break;
                    case 2:
                        zzdtc = new zzdtc("HMACSHA256", secretKeySpec, zzbnq);
                        break;
                    case 3:
                        zzdtc = new zzdtc("HMACSHA512", secretKeySpec, zzbnq);
                        break;
                    default:
                        throw new GeneralSecurityException("unknown hash");
                }
                return zzdtc;
            }
            throw new GeneralSecurityException("expected HmacKey proto");
        } catch (Throwable e) {
            throw new GeneralSecurityException("expected serialized HmacKey proto", e);
        }
    }

    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    public final /* synthetic */ Object zza(zzfdp zzfdp) throws GeneralSecurityException {
        return zzg(zzfdp);
    }

    public final /* synthetic */ Object zza(zzffq zzffq) throws GeneralSecurityException {
        if (zzffq instanceof zzdre) {
            zzdre zzdre = (zzdre) zzffq;
            zzdte.zzt(zzdre.getVersion(), 0);
            if (zzdre.zzblu().size() < 16) {
                throw new GeneralSecurityException("key too short");
            }
            zza(zzdre.zzbnj());
            zzdrc zzbnp = zzdre.zzbnj().zzbnp();
            Key secretKeySpec = new SecretKeySpec(zzdre.zzblu().toByteArray(), "HMAC");
            int zzbnq = zzdre.zzbnj().zzbnq();
            switch (zzdpo.zzlpx[zzbnp.ordinal()]) {
                case 1:
                    return new zzdtc("HMACSHA1", secretKeySpec, zzbnq);
                case 2:
                    return new zzdtc("HMACSHA256", secretKeySpec, zzbnq);
                case 3:
                    return new zzdtc("HMACSHA512", secretKeySpec, zzbnq);
                default:
                    throw new GeneralSecurityException("unknown hash");
            }
        }
        throw new GeneralSecurityException("expected HmacKey proto");
    }

    public final zzffq zzb(zzfdp zzfdp) throws GeneralSecurityException {
        try {
            return zzb(zzdrg.zzy(zzfdp));
        } catch (Throwable e) {
            throw new GeneralSecurityException("expected serialized HmacKeyFormat proto", e);
        }
    }

    public final zzffq zzb(zzffq zzffq) throws GeneralSecurityException {
        if (zzffq instanceof zzdrg) {
            zzdrg zzdrg = (zzdrg) zzffq;
            if (zzdrg.getKeySize() < 16) {
                throw new GeneralSecurityException("key too short");
            }
            zza(zzdrg.zzbnj());
            return zzdre.zzbnk().zzfr(0).zzc(zzdrg.zzbnj()).zzx(zzfdp.zzay(zzdtd.zzgc(zzdrg.getKeySize()))).zzcvl();
        }
        throw new GeneralSecurityException("expected HmacKeyFormat proto");
    }

    public final zzdrk zzc(zzfdp zzfdp) throws GeneralSecurityException {
        return (zzdrk) zzdrk.zzbnw().zzob("type.googleapis.com/google.crypto.tink.HmacKey").zzaa(((zzdre) zzb(zzfdp)).toByteString()).zzb(zzb.SYMMETRIC).zzcvl();
    }
}
