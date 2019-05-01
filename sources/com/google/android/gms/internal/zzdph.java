package com.google.android.gms.internal;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;

public final class zzdph implements zzdos<zzdor> {
    zzdph() {
    }

    private final zzdor zzf(zzfdp zzfdp) throws GeneralSecurityException {
        try {
            zzdqu zzv = zzdqu.zzv(zzfdp);
            if (zzv instanceof zzdqu) {
                zzv = zzv;
                zzdte.zzt(zzv.getVersion(), 0);
                zzdqs zzbmz = zzv.zzbmz();
                zzdsi.zza(zzdoy.zza(zzbmz.zzbmu().zzbnd()));
                zzdoy.zza(zzbmz.zzbmu().zzbne());
                if (zzbmz.zzbmw() == zzdqo.UNKNOWN_FORMAT) {
                    throw new GeneralSecurityException("unknown EC point format");
                }
                zzdpa.zzlqa.zza(zzbmz.zzbmv().zzbmr());
                zzbmz = zzv.zzbmz();
                zzdqw zzbmu = zzbmz.zzbmu();
                zzdsk zza = zzdoy.zza(zzbmu.zzbnd());
                byte[] toByteArray = zzv.zzbna().toByteArray();
                byte[] toByteArray2 = zzv.zzbnb().toByteArray();
                ECParameterSpec zza2 = zzdsi.zza(zza);
                ECPoint eCPoint = new ECPoint(new BigInteger(1, toByteArray), new BigInteger(1, toByteArray2));
                zzdsi.zza(eCPoint, zza2.getCurve());
                return new zzdsn((ECPublicKey) KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(eCPoint, zza2)), zzbmu.zzbnf().toByteArray(), zzdoy.zza(zzbmu.zzbne()), zzdoy.zza(zzbmz.zzbmw()), new zzdpl(zzbmz.zzbmv().zzbmr()));
            }
            throw new GeneralSecurityException("expected EciesAeadHkdfPublicKey proto");
        } catch (Throwable e) {
            throw new GeneralSecurityException("expected serialized EciesAeadHkdfPublicKey proto", e);
        }
    }

    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    public final /* synthetic */ Object zza(zzfdp zzfdp) throws GeneralSecurityException {
        return zzf(zzfdp);
    }

    public final /* synthetic */ Object zza(zzffq zzffq) throws GeneralSecurityException {
        if (zzffq instanceof zzdqu) {
            zzdqu zzdqu = (zzdqu) zzffq;
            zzdte.zzt(zzdqu.getVersion(), 0);
            zzdqs zzbmz = zzdqu.zzbmz();
            zzdsi.zza(zzdoy.zza(zzbmz.zzbmu().zzbnd()));
            zzdoy.zza(zzbmz.zzbmu().zzbne());
            if (zzbmz.zzbmw() == zzdqo.UNKNOWN_FORMAT) {
                throw new GeneralSecurityException("unknown EC point format");
            }
            zzdpa.zzlqa.zza(zzbmz.zzbmv().zzbmr());
            zzbmz = zzdqu.zzbmz();
            zzdqw zzbmu = zzbmz.zzbmu();
            zzdsk zza = zzdoy.zza(zzbmu.zzbnd());
            byte[] toByteArray = zzdqu.zzbna().toByteArray();
            byte[] toByteArray2 = zzdqu.zzbnb().toByteArray();
            ECParameterSpec zza2 = zzdsi.zza(zza);
            ECPoint eCPoint = new ECPoint(new BigInteger(1, toByteArray), new BigInteger(1, toByteArray2));
            zzdsi.zza(eCPoint, zza2.getCurve());
            return new zzdsn((ECPublicKey) KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(eCPoint, zza2)), zzbmu.zzbnf().toByteArray(), zzdoy.zza(zzbmu.zzbne()), zzdoy.zza(zzbmz.zzbmw()), new zzdpl(zzbmz.zzbmv().zzbmr()));
        }
        throw new GeneralSecurityException("expected EciesAeadHkdfPublicKey proto");
    }

    public final zzffq zzb(zzfdp zzfdp) throws GeneralSecurityException {
        throw new GeneralSecurityException("Not implemented.");
    }

    public final zzffq zzb(zzffq zzffq) throws GeneralSecurityException {
        throw new GeneralSecurityException("Not implemented.");
    }

    public final zzdrk zzc(zzfdp zzfdp) throws GeneralSecurityException {
        throw new GeneralSecurityException("Not implemented.");
    }
}
