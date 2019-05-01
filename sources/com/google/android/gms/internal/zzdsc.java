package com.google.android.gms.internal;

import java.nio.ByteBuffer;

final class zzdsc extends zzdsd {
    private zzdsc(byte[] bArr) {
        super(bArr);
    }

    final zzdse zzai(byte[] bArr) {
        return new zzdse(this, bArr, 1);
    }

    final int zzbos() {
        return 12;
    }

    final int[] zzd(byte[] bArr, int i) {
        Object obj = new int[16];
        zzdsd.zzi(obj);
        zzdsd.zza(obj, this.zzlur.getBytes());
        obj[12] = i;
        System.arraycopy(zzdsa.zza(ByteBuffer.wrap(bArr)), 0, obj, 13, 3);
        return obj;
    }

    final void zzh(int[] iArr) {
        iArr[12] = iArr[12] + 1;
    }
}
