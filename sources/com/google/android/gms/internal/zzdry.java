package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzdry implements zzdoo {
    private final SecretKeySpec zzluj;
    private final byte[] zzlum;
    private final byte[] zzlun;
    private final int zzluo;

    public zzdry(byte[] bArr, int i) throws GeneralSecurityException {
        if (i == 12 || i == 16) {
            this.zzluo = i;
            this.zzluj = new SecretKeySpec(bArr, "AES");
            Cipher instance = Cipher.getInstance("AES/ECB/NOPADDING");
            instance.init(1, this.zzluj);
            this.zzlum = zzag(instance.doFinal(new byte[16]));
            this.zzlun = zzag(this.zzlum);
            return;
        }
        throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
    }

    private final byte[] zza(Cipher cipher, int i, byte[] bArr, int i2, int i3) throws IllegalBlockSizeException, BadPaddingException {
        byte[] zze;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        if (i3 == 0) {
            zze = zze(bArr2, this.zzlum);
        } else {
            zze = cipher.doFinal(bArr2);
            byte[] bArr3 = zze;
            i = 0;
            while (i3 - i > 16) {
                for (int i4 = 0; i4 < 16; i4++) {
                    bArr3[i4] = (byte) (bArr3[i4] ^ bArr[(i2 + i) + i4]);
                }
                bArr3 = cipher.doFinal(bArr3);
                i += 16;
            }
            zze = Arrays.copyOfRange(bArr, i + i2, i2 + i3);
            if (zze.length == 16) {
                zze = zze(zze, this.zzlum);
            } else {
                bArr = Arrays.copyOf(this.zzlun, 16);
                for (int i5 = 0; i5 < zze.length; i5++) {
                    bArr[i5] = (byte) (bArr[i5] ^ zze[i5]);
                }
                bArr[zze.length] = (byte) (bArr[zze.length] ^ 128);
                zze = bArr;
            }
            zze = zze(bArr3, zze);
        }
        return cipher.doFinal(zze);
    }

    private static byte[] zzag(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        int i2 = 0;
        while (i2 < 15) {
            int i3 = i2 + 1;
            bArr2[i2] = (byte) ((bArr[i2] << 1) ^ ((bArr[i3] & 255) >>> 7));
            i2 = i3;
        }
        i2 = bArr[15] << 1;
        if ((bArr[0] & 128) != 0) {
            i = 135;
        }
        bArr2[15] = (byte) (i2 ^ i);
        return bArr2;
    }

    private static byte[] zze(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    public final byte[] zzd(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = bArr;
        if (bArr3.length > (Integer.MAX_VALUE - this.zzluo) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Object obj = new byte[((r6.zzluo + bArr3.length) + 16)];
        Object zzgc = zzdtd.zzgc(r6.zzluo);
        int i = 0;
        System.arraycopy(zzgc, 0, obj, 0, r6.zzluo);
        Cipher instance = Cipher.getInstance("AES/ECB/NOPADDING");
        instance.init(1, r6.zzluj);
        Cipher cipher = instance;
        byte[] zza = zza(cipher, 0, zzgc, 0, zzgc.length);
        byte[] bArr4 = bArr2;
        byte[] zza2 = zza(cipher, 1, bArr4, 0, bArr4.length);
        Cipher instance2 = Cipher.getInstance("AES/CTR/NOPADDING");
        instance2.init(1, r6.zzluj, new IvParameterSpec(zza));
        instance2.doFinal(bArr3, 0, bArr3.length, obj, r6.zzluo);
        byte[] zza3 = zza(instance, 2, obj, r6.zzluo, bArr3.length);
        int length = bArr3.length + r6.zzluo;
        while (i < 16) {
            obj[length + i] = (byte) ((zza2[i] ^ zza[i]) ^ zza3[i]);
            i++;
        }
        return obj;
    }
}
