package com.google.android.gms.internal;

public final class zzdta {
    private final byte[] data;

    private zzdta(byte[] bArr, int i, int i2) {
        this.data = new byte[i2];
        System.arraycopy(bArr, 0, this.data, 0, i2);
    }

    public static zzdta zzak(byte[] bArr) {
        return bArr == null ? null : new zzdta(bArr, 0, bArr.length);
    }

    public final byte[] getBytes() {
        Object obj = new byte[this.data.length];
        System.arraycopy(this.data, 0, obj, 0, this.data.length);
        return obj;
    }
}
