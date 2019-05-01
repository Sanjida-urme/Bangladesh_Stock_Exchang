package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzdrx implements zzdtb {
    private final SecretKeySpec zzluj;
    private final int zzluk;
    private final int zzlul = ((Cipher) zzdsr.zzlvu.zzod("AES/CTR/NoPadding")).getBlockSize();

    public zzdrx(byte[] bArr, int i) throws GeneralSecurityException {
        this.zzluj = new SecretKeySpec(bArr, "AES");
        if (i >= 12) {
            if (i <= this.zzlul) {
                this.zzluk = i;
                return;
            }
        }
        throw new GeneralSecurityException("invalid IV size");
    }

    public final byte[] zzaf(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length > Integer.MAX_VALUE - this.zzluk) {
            int i = Integer.MAX_VALUE - this.zzluk;
            StringBuilder stringBuilder = new StringBuilder(43);
            stringBuilder.append("plaintext length can not exceed ");
            stringBuilder.append(i);
            throw new GeneralSecurityException(stringBuilder.toString());
        }
        Object obj = new byte[(this.zzluk + bArr.length)];
        Object zzgc = zzdtd.zzgc(this.zzluk);
        System.arraycopy(zzgc, 0, obj, 0, this.zzluk);
        int length = bArr.length;
        int i2 = this.zzluk;
        Cipher cipher = (Cipher) zzdsr.zzlvu.zzod("AES/CTR/NoPadding");
        Object obj2 = new byte[this.zzlul];
        System.arraycopy(zzgc, 0, obj2, 0, this.zzluk);
        cipher.init(1, this.zzluj, new IvParameterSpec(obj2));
        if (cipher.doFinal(bArr, 0, length, obj, i2) == length) {
            return obj;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
