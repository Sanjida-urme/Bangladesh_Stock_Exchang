package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

public final class zzdoy {
    public static zzdsk zza(zzdqy zzdqy) throws GeneralSecurityException {
        switch (zzdoz.zzlpy[zzdqy.ordinal()]) {
            case 1:
                return zzdsk.NIST_P256;
            case 2:
                return zzdsk.NIST_P384;
            case 3:
                return zzdsk.NIST_P521;
            default:
                String valueOf = String.valueOf(zzdqy);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 20);
                stringBuilder.append("unknown curve type: ");
                stringBuilder.append(valueOf);
                throw new GeneralSecurityException(stringBuilder.toString());
        }
    }

    public static zzdsl zza(zzdqo zzdqo) throws GeneralSecurityException {
        switch (zzdoz.zzlpz[zzdqo.ordinal()]) {
            case 1:
                return zzdsl.UNCOMPRESSED;
            case 2:
                return zzdsl.COMPRESSED;
            default:
                String valueOf = String.valueOf(zzdqo);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 22);
                stringBuilder.append("unknown point format: ");
                stringBuilder.append(valueOf);
                throw new GeneralSecurityException(stringBuilder.toString());
        }
    }

    public static String zza(zzdrc zzdrc) throws NoSuchAlgorithmException {
        switch (zzdoz.zzlpx[zzdrc.ordinal()]) {
            case 1:
                return "HmacSha1";
            case 2:
                return "HmacSha256";
            case 3:
                return "HmacSha512";
            default:
                String valueOf = String.valueOf(zzdrc);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 27);
                stringBuilder.append("hash unsupported for HMAC: ");
                stringBuilder.append(valueOf);
                throw new NoSuchAlgorithmException(stringBuilder.toString());
        }
    }
}
