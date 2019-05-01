package com.google.android.gms.internal;

public final class zzfby {
    private final byte[] zzoxb = new byte[256];
    private int zzoxc;
    private int zzoxd;

    public zzfby(byte[] bArr) {
        int i;
        for (i = 0; i < 256; i++) {
            this.zzoxb[i] = (byte) i;
        }
        int i2 = 0;
        for (i = 0; i < 256; i++) {
            i2 = ((i2 + this.zzoxb[i]) + bArr[i % bArr.length]) & 255;
            byte b = this.zzoxb[i];
            this.zzoxb[i] = this.zzoxb[i2];
            this.zzoxb[i2] = b;
        }
        this.zzoxc = 0;
        this.zzoxd = 0;
    }

    public final void zzax(byte[] bArr) {
        int i = this.zzoxc;
        int i2 = this.zzoxd;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) & 255;
            i2 = (i2 + this.zzoxb[i]) & 255;
            byte b = this.zzoxb[i];
            this.zzoxb[i] = this.zzoxb[i2];
            this.zzoxb[i2] = b;
            bArr[i3] = (byte) (bArr[i3] ^ this.zzoxb[(this.zzoxb[i] + this.zzoxb[i2]) & 255]);
        }
        this.zzoxc = i;
        this.zzoxd = i2;
    }
}
