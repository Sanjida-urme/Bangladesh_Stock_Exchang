package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdrk.zzb;
import java.security.GeneralSecurityException;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class zzdpc implements zzdos<zzdoo> {
    private static final Logger logger = Logger.getLogger(zzdpc.class.getName());

    static {
        try {
            zzdpa.zzlqa.zza("type.googleapis.com/google.crypto.tink.AesCtrKey", new zzdpd());
            zzdpp.zzblj();
        } catch (GeneralSecurityException e) {
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 30);
            stringBuilder.append("cannot register key managers: ");
            stringBuilder.append(valueOf);
            logger.logp(Level.SEVERE, "com.google.crypto.tink.aead.AesCtrHmacAeadKeyManager", "<clinit>", stringBuilder.toString());
        }
    }

    zzdpc() {
    }

    private final zzdoo zzd(zzfdp zzfdp) throws GeneralSecurityException {
        try {
            zzdpq zzh = zzdpq.zzh(zzfdp);
            if (zzh instanceof zzdpq) {
                zzh = zzh;
                zzdte.zzt(zzh.getVersion(), 0);
                return new zzdsq((zzdtb) zzdpa.zzlqa.zzb("type.googleapis.com/google.crypto.tink.AesCtrKey", zzh.zzblm()), (zzdou) zzdpa.zzlqa.zzb("type.googleapis.com/google.crypto.tink.HmacKey", zzh.zzbln()), zzh.zzbln().zzbnj().zzbnq());
            }
            throw new GeneralSecurityException("expected AesCtrHmacAeadKey proto");
        } catch (Throwable e) {
            throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKey proto", e);
        }
    }

    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    public final /* synthetic */ Object zza(zzfdp zzfdp) throws GeneralSecurityException {
        return zzd(zzfdp);
    }

    public final /* synthetic */ Object zza(zzffq zzffq) throws GeneralSecurityException {
        if (zzffq instanceof zzdpq) {
            zzdpq zzdpq = (zzdpq) zzffq;
            zzdte.zzt(zzdpq.getVersion(), 0);
            return new zzdsq((zzdtb) zzdpa.zzlqa.zzb("type.googleapis.com/google.crypto.tink.AesCtrKey", zzdpq.zzblm()), (zzdou) zzdpa.zzlqa.zzb("type.googleapis.com/google.crypto.tink.HmacKey", zzdpq.zzbln()), zzdpq.zzbln().zzbnj().zzbnq());
        }
        throw new GeneralSecurityException("expected AesCtrHmacAeadKey proto");
    }

    public final zzffq zzb(zzfdp zzfdp) throws GeneralSecurityException {
        try {
            return zzb(zzdps.zzi(zzfdp));
        } catch (Throwable e) {
            throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKeyFormat proto", e);
        }
    }

    public final zzffq zzb(zzffq zzffq) throws GeneralSecurityException {
        if (zzffq instanceof zzdps) {
            zzdps zzdps = (zzdps) zzffq;
            zzdpu zzdpu = (zzdpu) zzdpa.zzlqa.zza("type.googleapis.com/google.crypto.tink.AesCtrKey", zzdps.zzblq());
            return zzdpq.zzblo().zzb(zzdpu).zzb((zzdre) zzdpa.zzlqa.zza("type.googleapis.com/google.crypto.tink.HmacKey", zzdps.zzblr())).zzfj(0).zzcvl();
        }
        throw new GeneralSecurityException("expected AesCtrHmacAeadKeyFormat proto");
    }

    public final zzdrk zzc(zzfdp zzfdp) throws GeneralSecurityException {
        return (zzdrk) zzdrk.zzbnw().zzob("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey").zzaa(((zzdpq) zzb(zzfdp)).toByteString()).zzb(zzb.SYMMETRIC).zzcvl();
    }
}
