package com.google.android.gms.internal;

import java.io.IOException;

class zzfdw extends zzfdv {
    protected final byte[] zzjkv;

    zzfdw(byte[] bArr) {
        this.zzjkv = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfdp) || size() != ((zzfdp) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof zzfdw)) {
            return obj.equals(this);
        }
        zzfdw zzfdw = (zzfdw) obj;
        int zzctp = zzctp();
        int zzctp2 = zzfdw.zzctp();
        return (zzctp == 0 || zzctp2 == 0 || zzctp == zzctp2) ? zza(zzfdw, 0, size()) : false;
    }

    public int size() {
        return this.zzjkv.length;
    }

    final void zza(zzfdo zzfdo) throws IOException {
        zzfdo.zzd(this.zzjkv, zzctq(), size());
    }

    final boolean zza(zzfdp zzfdp, int i, int i2) {
        if (i2 > zzfdp.size()) {
            i = size();
            StringBuilder stringBuilder = new StringBuilder(40);
            stringBuilder.append("Length too large: ");
            stringBuilder.append(i2);
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        int i3 = i + i2;
        int size;
        if (i3 > zzfdp.size()) {
            size = zzfdp.size();
            StringBuilder stringBuilder2 = new StringBuilder(59);
            stringBuilder2.append("Ran off end of other: ");
            stringBuilder2.append(i);
            stringBuilder2.append(", ");
            stringBuilder2.append(i2);
            stringBuilder2.append(", ");
            stringBuilder2.append(size);
            throw new IllegalArgumentException(stringBuilder2.toString());
        } else if (!(zzfdp instanceof zzfdw)) {
            return zzfdp.zzx(i, i3).equals(zzx(0, i2));
        } else {
            zzfdw zzfdw = (zzfdw) zzfdp;
            byte[] bArr = this.zzjkv;
            byte[] bArr2 = zzfdw.zzjkv;
            int zzctq = zzctq() + i2;
            i2 = zzctq();
            size = zzfdw.zzctq() + i;
            while (i2 < zzctq) {
                if (bArr[i2] != bArr2[size]) {
                    return false;
                }
                i2++;
                size++;
            }
            return true;
        }
    }

    protected void zzb(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzjkv, i, bArr, i2, i3);
    }

    public final zzfdy zzctm() {
        return zzfdy.zzb(this.zzjkv, zzctq(), size(), true);
    }

    protected int zzctq() {
        return 0;
    }

    protected final int zzg(int i, int i2, int i3) {
        return zzfez.zza(i, this.zzjkv, zzctq() + i2, i3);
    }

    public byte zzke(int i) {
        return this.zzjkv[i];
    }

    public final zzfdp zzx(int i, int i2) {
        i2 = zzfdp.zzh(i, i2, size());
        return i2 == 0 ? zzfdp.zzpaz : new zzfds(this.zzjkv, zzctq() + i, i2);
    }
}
