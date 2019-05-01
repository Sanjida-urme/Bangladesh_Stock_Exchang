package com.google.android.gms.internal;

final class zzfds extends zzfdw {
    private final int zzpbc;
    private final int zzpbd;

    zzfds(byte[] bArr, int i, int i2) {
        super(bArr);
        zzfdp.zzh(i, i + i2, bArr.length);
        this.zzpbc = i;
        this.zzpbd = i2;
    }

    public final int size() {
        return this.zzpbd;
    }

    protected final void zzb(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzjkv, zzctq() + i, bArr, i2, i3);
    }

    protected final int zzctq() {
        return this.zzpbc;
    }

    public final byte zzke(int i) {
        zzfdp.zzy(i, size());
        return this.zzjkv[this.zzpbc + i];
    }
}
