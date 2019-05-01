package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public abstract class zzdsf implements zzdoo {
    private final zzdsa zzlus;

    private zzdsf(zzdsa zzdsa) {
        this.zzlus = zzdsa;
    }

    private static void zza(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) ((int) (j & 255));
            i2++;
            j >>= 8;
        }
    }

    private final byte[] zza(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr2;
        Object zza = zza(bArr, byteBuffer);
        if (bArr3.length < 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        long zzc;
        long zzc2 = zzc(bArr3, 0, 0) & 67108863;
        int i = 2;
        int i2 = 3;
        long zzc3 = zzc(bArr3, 3, 2) & 67108611;
        long zzc4 = zzc(bArr3, 6, 4) & 67092735;
        long zzc5 = zzc(bArr3, 9, 6) & 66076671;
        long zzc6 = zzc(bArr3, 12, 8) & 1048575;
        long j = zzc3 * 5;
        long j2 = zzc4 * 5;
        long j3 = zzc5 * 5;
        long j4 = zzc6 * 5;
        Object obj = new byte[17];
        long j5 = 0;
        long j6 = 0;
        long j7 = j6;
        long j8 = j7;
        long j9 = j8;
        int i3 = 0;
        while (i3 < zza.length) {
            int min = Math.min(16, zza.length - i3);
            System.arraycopy(zza, i3, obj, 0, min);
            obj[min] = (byte) 1;
            if (min != 16) {
                Arrays.fill(obj, min + 1, 17, (byte) 0);
            }
            long zzc7 = j9 + zzc(obj, 0, 0);
            long zzc8 = j5 + zzc(obj, i2, i);
            j9 = j6 + zzc(obj, 6, 4);
            j6 = j7 + zzc(obj, 9, 6);
            zzc = j8 + (zzc(obj, 12, 8) | ((long) (obj[16] << 24)));
            j7 = ((((zzc7 * zzc2) + (zzc8 * j4)) + (j9 * j3)) + (j6 * j2)) + (zzc * j);
            j8 = ((((zzc7 * zzc3) + (zzc8 * zzc2)) + (j9 * j4)) + (j6 * j3)) + (zzc * j2);
            long j10 = ((((zzc7 * zzc4) + (zzc8 * zzc3)) + (j9 * zzc2)) + (j6 * j4)) + (zzc * j3);
            long j11 = ((((zzc7 * zzc5) + (zzc8 * zzc4)) + (j9 * zzc3)) + (j6 * zzc2)) + (zzc * j4);
            j6 = ((((zzc7 * zzc6) + (zzc8 * zzc5)) + (j9 * zzc4)) + (j6 * zzc3)) + (zzc * zzc2);
            j5 = j7 & 67108863;
            j7 = j8 + (j7 >> 26);
            j8 = j7 & 67108863;
            j7 = j10 + (j7 >> 26);
            j9 = j7 & 67108863;
            j7 = j11 + (j7 >> 26);
            j10 = j7 & 67108863;
            j7 = j6 + (j7 >> 26);
            j6 = j7 & 67108863;
            j7 = j5 + ((j7 >> 26) * 5);
            j5 = j7 & 67108863;
            j7 = j8 + (j7 >> 26);
            i3 += 16;
            j8 = j6;
            j6 = j9;
            i = 2;
            i2 = 3;
            j9 = j5;
            j5 = j7;
            j7 = j10;
        }
        long j12 = j6 + (j5 >> 26);
        long j13 = j12 & 67108863;
        j12 = j7 + (j12 >> 26);
        zzc3 = j12 & 67108863;
        j12 = j8 + (j12 >> 26);
        zzc4 = j12 & 67108863;
        j12 = j9 + ((j12 >> 26) * 5);
        j = j12 & 67108863;
        j12 = (j5 & 67108863) + (j12 >> 26);
        zzc = j + 5;
        long j14 = zzc & 67108863;
        zzc = j12 + (zzc >> 26);
        zzc5 = zzc & 67108863;
        zzc = j13 + (zzc >> 26);
        zzc6 = zzc & 67108863;
        zzc = zzc3 + (zzc >> 26);
        j2 = zzc & 67108863;
        j3 = (zzc4 + (zzc >> 26)) - 67108864;
        zzc = j3 >> 63;
        long j15 = j & zzc;
        j = j12 & zzc;
        j12 = j13 & zzc;
        j13 = zzc3 & zzc;
        zzc3 = zzc4 & zzc;
        j4 = zzc ^ -1;
        j14 = j15 | (j14 & j4);
        j15 = j | (zzc5 & j4);
        zzc4 = j12 | (zzc6 & j4);
        j12 = j13 | (j2 & j4);
        j13 = zzc3 | (j3 & j4);
        j14 = (j14 | (j15 << 26)) & 4294967295L;
        j15 = ((j15 >> 6) | (zzc4 << 20)) & 4294967295L;
        zzc3 = ((zzc4 >> 12) | (j12 << 14)) & 4294967295L;
        zzc4 = j14 + zze(bArr3, 16);
        j14 = (j15 + zze(bArr3, 20)) + (zzc4 >> 32);
        j15 = j14 & 4294967295L;
        long zze = (zzc3 + zze(bArr3, 24)) + (j14 >> 32);
        long j16 = zze & 4294967295L;
        j12 = (((((j12 >> 18) | (j13 << 8)) & 4294967295L) + zze(bArr3, 28)) + (zze >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        zza(bArr4, zzc4 & 4294967295L, 0);
        zza(bArr4, j15, 4);
        zza(bArr4, j16, 8);
        zza(bArr4, j12, 12);
        return bArr4;
    }

    public static zzdsf zzaj(byte[] bArr) {
        return new zzdsh(zzdsa.zzah(bArr), null);
    }

    private static long zzc(byte[] bArr, int i, int i2) {
        return (zze(bArr, i) >> i2) & 67108863;
    }

    private static long zze(byte[] bArr, int i) {
        return ((long) (((bArr[i + 3] & 255) << 24) | (((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8)) | ((bArr[i + 2] & 255) << 16)))) & 4294967295L;
    }

    private static int zzga(int i) {
        return (((i + 16) - 1) / 16) << 4;
    }

    abstract byte[] zza(byte[] bArr, ByteBuffer byteBuffer);

    public final byte[] zzd(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate((this.zzlus.zzbos() + bArr.length) + 16);
        if (allocate.remaining() < (bArr.length + this.zzlus.zzbos()) + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int position = allocate.position();
        this.zzlus.zza(allocate, bArr);
        allocate.position(position);
        bArr = new byte[this.zzlus.zzbos()];
        allocate.get(bArr);
        bArr = new zzdse(this.zzlus, bArr, 0).zzfz(32);
        allocate.limit(allocate.limit() - 16);
        bArr = zza(allocate, bArr2, bArr);
        allocate.limit(allocate.limit() + 16);
        allocate.put(bArr);
        return allocate.array();
    }
}
