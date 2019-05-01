package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzdrz implements zzdoo {
    private final SecretKeySpec zzluj;

    public zzdrz(byte[] bArr) {
        this.zzluj = new SecretKeySpec(bArr, "AES");
    }

    public final byte[] zzd(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Object obj = new byte[((bArr.length + 12) + 16)];
        Object zzgc = zzdtd.zzgc(12);
        System.arraycopy(zzgc, 0, obj, 0, 12);
        Cipher cipher = (Cipher) zzdsr.zzlvu.zzod("AES/GCM/NoPadding");
        cipher.init(1, this.zzluj, new GCMParameterSpec(128, zzgc));
        cipher.updateAAD(bArr2);
        cipher.doFinal(bArr, 0, bArr.length, obj, 12);
        return obj;
    }
}
