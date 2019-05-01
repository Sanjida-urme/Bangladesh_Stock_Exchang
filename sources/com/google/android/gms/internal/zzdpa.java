package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdrr.zzb;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class zzdpa {
    public static final zzdpa zzlqa = new zzdpa();
    private final ConcurrentMap<String, zzdos> zzlqb = new ConcurrentHashMap();

    protected zzdpa() {
    }

    private final <P> zzdos<P> zznz(String str) throws GeneralSecurityException {
        zzdos<P> zzdos = (zzdos) this.zzlqb.get(str);
        if (zzdos != null) {
            return zzdos;
        }
        String str2 = "unsupported key type: ";
        str = String.valueOf(str);
        throw new GeneralSecurityException(str.length() != 0 ? str2.concat(str) : new String(str2));
    }

    public final <P> zzdow<P> zza(zzdot zzdot, zzdos<P> zzdos) throws GeneralSecurityException {
        zzdrr zzblf = zzdot.zzblf();
        if (zzblf.zzbod() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        int zzbob = zzblf.zzbob();
        Object obj = null;
        Object obj2 = 1;
        for (zzb zzb : zzblf.zzboc()) {
            if (!zzb.zzbof()) {
                throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(zzb.zzboi())}));
            } else if (zzb.zzboj() == zzdrv.UNKNOWN_PREFIX) {
                throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(zzb.zzboi())}));
            } else if (zzb.zzboh() == zzdrn.UNKNOWN_STATUS) {
                throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(zzb.zzboi())}));
            } else {
                if (zzb.zzboh() == zzdrn.ENABLED && zzb.zzboi() == zzbob) {
                    if (obj != null) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    obj = 1;
                }
                if (zzb.zzbog().zzbnv() != zzdrk.zzb.ASYMMETRIC_PUBLIC) {
                    obj2 = null;
                }
            }
        }
        if (obj == null && r4 == null) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        zzdow<P> zzdow = new zzdow();
        for (zzb zzb2 : zzdot.zzblf().zzboc()) {
            if (zzb2.zzboh() == zzdrn.ENABLED) {
                String zzbnt = zzb2.zzbog().zzbnt();
                zzdox zza = zzdow.zza(zznz(zzbnt).zza(zzb2.zzbog().zzbnu()), zzb2);
                if (zzb2.zzboi() == zzdot.zzblf().zzbob()) {
                    zzdow.zza(zza);
                }
            }
        }
        return zzdow;
    }

    public final <P> zzdrk zza(zzdrp zzdrp) throws GeneralSecurityException {
        return zznz(zzdrp.zzbnt()).zzc(zzdrp.zzbnu());
    }

    public final <P> zzffq zza(String str, zzffq zzffq) throws GeneralSecurityException {
        return zznz(str).zzb(zzffq);
    }

    public final <P> boolean zza(String str, zzdos<P> zzdos) throws GeneralSecurityException {
        if (zzdos != null) {
            return ((zzdos) this.zzlqb.putIfAbsent(str, zzdos)) == null;
        } else {
            throw new NullPointerException("key manager must be non-null.");
        }
    }

    public final <P> zzffq zzb(zzdrp zzdrp) throws GeneralSecurityException {
        return zznz(zzdrp.zzbnt()).zzb(zzdrp.zzbnu());
    }

    public final <P> P zzb(String str, zzffq zzffq) throws GeneralSecurityException {
        return zznz(str).zza(zzffq);
    }
}
