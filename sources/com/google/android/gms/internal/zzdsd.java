package com.google.android.gms.internal;

import java.nio.ByteBuffer;

abstract class zzdsd extends zzdsa {
    private zzdsd(byte[] bArr) {
        super(bArr);
    }

    private static void zza(int[] iArr, int i, int i2, int i3, int i4) {
        iArr[i] = iArr[i] + iArr[i2];
        iArr[i4] = zzdsa.rotateLeft(iArr[i4] ^ iArr[i], 16);
        iArr[i3] = iArr[i3] + iArr[i4];
        iArr[i2] = zzdsa.rotateLeft(iArr[i2] ^ iArr[i3], 12);
        iArr[i] = iArr[i] + iArr[i2];
        iArr[i4] = zzdsa.rotateLeft(iArr[i] ^ iArr[i4], 8);
        iArr[i3] = iArr[i3] + iArr[i4];
        iArr[i2] = zzdsa.rotateLeft(iArr[i2] ^ iArr[i3], 7);
    }

    private static void zza(int[] iArr, byte[] bArr) {
        Object zza = zzdsa.zza(ByteBuffer.wrap(bArr));
        System.arraycopy(zza, 0, iArr, 4, zza.length);
    }

    private static void zzi(int[] iArr) {
        System.arraycopy(zzluq, 0, iArr, 0, zzluq.length);
    }

    final void zzg(int[] iArr) {
        int[] iArr2 = iArr;
        for (int i = 0; i < 10; i++) {
            zza(iArr2, 0, 4, 8, 12);
            zza(iArr2, 1, 5, 9, 13);
            zza(iArr2, 2, 6, 10, 14);
            zza(iArr2, 3, 7, 11, 15);
            zza(iArr2, 0, 5, 10, 15);
            zza(iArr2, 1, 6, 11, 12);
            zza(iArr2, 2, 7, 8, 13);
            zza(iArr2, 3, 4, 9, 14);
        }
    }
}
