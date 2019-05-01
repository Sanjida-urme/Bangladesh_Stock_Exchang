package com.google.android.gms.internal;

public final class zzfho implements Cloneable {
    private static final zzfhp zzpho = new zzfhp();
    private int mSize;
    private boolean zzphp;
    private int[] zzphq;
    private zzfhp[] zzphr;

    zzfho() {
        this(10);
    }

    private zzfho(int i) {
        this.zzphp = false;
        i = idealIntArraySize(i);
        this.zzphq = new int[i];
        this.zzphr = new zzfhp[i];
        this.mSize = 0;
    }

    private static int idealIntArraySize(int i) {
        i <<= 2;
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                i = i3;
                break;
            }
        }
        return i / 4;
    }

    private final int zzmc(int i) {
        int i2 = this.mSize - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.zzphq[i4];
            if (i5 < i) {
                i3 = i4 + 1;
            } else if (i5 <= i) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return i3 ^ -1;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i = this.mSize;
        zzfho zzfho = new zzfho(i);
        int i2 = 0;
        System.arraycopy(this.zzphq, 0, zzfho.zzphq, 0, i);
        while (i2 < i) {
            if (this.zzphr[i2] != null) {
                zzfho.zzphr[i2] = (zzfhp) this.zzphr[i2].clone();
            }
            i2++;
        }
        zzfho.mSize = i;
        return zzfho;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfho)) {
            return false;
        }
        zzfho zzfho = (zzfho) obj;
        if (this.mSize != zzfho.mSize) {
            return false;
        }
        Object obj2;
        int[] iArr = this.zzphq;
        int[] iArr2 = zzfho.zzphq;
        int i = this.mSize;
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                obj2 = null;
                break;
            }
        }
        obj2 = 1;
        if (obj2 != null) {
            zzfhp[] zzfhpArr = this.zzphr;
            zzfhp[] zzfhpArr2 = zzfho.zzphr;
            int i3 = this.mSize;
            for (i = 0; i < i3; i++) {
                if (!zzfhpArr[i].equals(zzfhpArr2[i])) {
                    obj = null;
                    break;
                }
            }
            obj = 1;
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.mSize; i2++) {
            i = (((i * 31) + this.zzphq[i2]) * 31) + this.zzphr[i2].hashCode();
        }
        return i;
    }

    public final boolean isEmpty() {
        return this.mSize == 0;
    }

    final int size() {
        return this.mSize;
    }

    final void zza(int i, zzfhp zzfhp) {
        int zzmc = zzmc(i);
        if (zzmc >= 0) {
            this.zzphr[zzmc] = zzfhp;
            return;
        }
        zzmc ^= -1;
        if (zzmc >= this.mSize || this.zzphr[zzmc] != zzpho) {
            if (this.mSize >= this.zzphq.length) {
                int idealIntArraySize = idealIntArraySize(this.mSize + 1);
                Object obj = new int[idealIntArraySize];
                Object obj2 = new zzfhp[idealIntArraySize];
                System.arraycopy(this.zzphq, 0, obj, 0, this.zzphq.length);
                System.arraycopy(this.zzphr, 0, obj2, 0, this.zzphr.length);
                this.zzphq = obj;
                this.zzphr = obj2;
            }
            if (this.mSize - zzmc != 0) {
                int i2 = zzmc + 1;
                System.arraycopy(this.zzphq, zzmc, this.zzphq, i2, this.mSize - zzmc);
                System.arraycopy(this.zzphr, zzmc, this.zzphr, i2, this.mSize - zzmc);
            }
            this.zzphq[zzmc] = i;
            this.zzphr[zzmc] = zzfhp;
            this.mSize++;
            return;
        }
        this.zzphq[zzmc] = i;
        this.zzphr[zzmc] = zzfhp;
    }

    final zzfhp zzma(int i) {
        i = zzmc(i);
        if (i >= 0) {
            if (this.zzphr[i] != zzpho) {
                return this.zzphr[i];
            }
        }
        return null;
    }

    final zzfhp zzmb(int i) {
        return this.zzphr[i];
    }
}
