package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

public final class zzfgq {
    private static final zzfgq zzpez = new zzfgq(0, new int[0], new Object[0], false);
    private int count;
    private boolean zzpav;
    private int zzpch;
    private int[] zzpfa;
    private Object[] zzpfb;

    private zzfgq() {
        this(0, new int[8], new Object[8], true);
    }

    private zzfgq(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zzpch = -1;
        this.count = i;
        this.zzpfa = iArr;
        this.zzpfb = objArr;
        this.zzpav = z;
    }

    private final zzfgq zza(zzfdy zzfdy) throws IOException {
        int zzctt;
        do {
            zzctt = zzfdy.zzctt();
            if (zzctt == 0) {
                break;
            }
        } while (zzb(zzctt, zzfdy));
        return this;
    }

    static zzfgq zzb(zzfgq zzfgq, zzfgq zzfgq2) {
        int i = zzfgq.count + zzfgq2.count;
        Object copyOf = Arrays.copyOf(zzfgq.zzpfa, i);
        System.arraycopy(zzfgq2.zzpfa, 0, copyOf, zzfgq.count, zzfgq2.count);
        Object copyOf2 = Arrays.copyOf(zzfgq.zzpfb, i);
        System.arraycopy(zzfgq2.zzpfb, 0, copyOf2, zzfgq.count, zzfgq2.count);
        return new zzfgq(i, copyOf, copyOf2, true);
    }

    private void zzb(int i, Object obj) {
        if (this.count == this.zzpfa.length) {
            int i2 = this.count + (this.count < 4 ? 8 : this.count >> 1);
            this.zzpfa = Arrays.copyOf(this.zzpfa, i2);
            this.zzpfb = Arrays.copyOf(this.zzpfb, i2);
        }
        this.zzpfa[this.count] = i;
        this.zzpfb[this.count] = obj;
        this.count++;
    }

    public static zzfgq zzcwv() {
        return zzpez;
    }

    static zzfgq zzcww() {
        return new zzfgq();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzfgq)) {
            return false;
        }
        zzfgq zzfgq = (zzfgq) obj;
        if (this.count == zzfgq.count) {
            Object obj2;
            int[] iArr = this.zzpfa;
            int[] iArr2 = zzfgq.zzpfa;
            int i = this.count;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] != iArr2[i2]) {
                    obj2 = null;
                    break;
                }
            }
            obj2 = 1;
            if (obj2 != null) {
                Object[] objArr = this.zzpfb;
                Object[] objArr2 = zzfgq.zzpfb;
                int i3 = this.count;
                for (i = 0; i < i3; i++) {
                    if (!objArr[i].equals(objArr2[i])) {
                        obj = null;
                        break;
                    }
                }
                obj = 1;
                return obj != null;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.count + 527) * 31) + Arrays.hashCode(this.zzpfa)) * 31) + Arrays.deepHashCode(this.zzpfb);
    }

    public final void zza(zzfed zzfed) throws IOException {
        for (int i = 0; i < this.count; i++) {
            int i2 = this.zzpfa[i];
            int i3 = i2 >>> 3;
            i2 &= 7;
            if (i2 != 5) {
                switch (i2) {
                    case 0:
                        zzfed.zza(i3, ((Long) this.zzpfb[i]).longValue());
                        break;
                    case 1:
                        zzfed.zzb(i3, ((Long) this.zzpfb[i]).longValue());
                        break;
                    case 2:
                        zzfed.zza(i3, (zzfdp) this.zzpfb[i]);
                        break;
                    case 3:
                        zzfed.zzz(i3, 3);
                        ((zzfgq) this.zzpfb[i]).zza(zzfed);
                        zzfed.zzz(i3, 4);
                        break;
                    default:
                        throw zzffe.zzcvx();
                }
            }
            zzfed.zzac(i3, ((Integer) this.zzpfb[i]).intValue());
        }
    }

    final boolean zzb(int i, zzfdy zzfdy) throws IOException {
        if (this.zzpav) {
            int i2 = i >>> 3;
            switch (i & 7) {
                case 0:
                    zzb(i, Long.valueOf(zzfdy.zzctv()));
                    return true;
                case 1:
                    zzb(i, Long.valueOf(zzfdy.zzctx()));
                    return true;
                case 2:
                    zzb(i, zzfdy.zzcub());
                    return true;
                case 3:
                    Object zzfgq = new zzfgq();
                    zzfgq.zza(zzfdy);
                    zzfdy.zzkg((i2 << 3) | 4);
                    zzb(i, zzfgq);
                    return true;
                case 4:
                    return false;
                case 5:
                    zzb(i, Integer.valueOf(zzfdy.zzcty()));
                    return true;
                default:
                    throw zzffe.zzcvx();
            }
        }
        throw new UnsupportedOperationException();
    }

    public final void zzbin() {
        this.zzpav = false;
    }

    final void zzd(StringBuilder stringBuilder, int i) {
        for (int i2 = 0; i2 < this.count; i2++) {
            zzfft.zzb(stringBuilder, i, String.valueOf(this.zzpfa[i2] >>> 3), this.zzpfb[i2]);
        }
    }

    public final int zzhl() {
        int i = this.zzpch;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (i = 0; i < this.count; i++) {
            int i3 = this.zzpfa[i];
            int i4 = i3 >>> 3;
            i3 &= 7;
            if (i3 != 5) {
                switch (i3) {
                    case 0:
                        i3 = zzfed.zzd(i4, ((Long) this.zzpfb[i]).longValue());
                        break;
                    case 1:
                        i3 = zzfed.zze(i4, ((Long) this.zzpfb[i]).longValue());
                        break;
                    case 2:
                        i3 = zzfed.zzb(i4, (zzfdp) this.zzpfb[i]);
                        break;
                    case 3:
                        i3 = (zzfed.zzkx(i4) << 1) + ((zzfgq) this.zzpfb[i]).zzhl();
                        break;
                    default:
                        throw new IllegalStateException(zzffe.zzcvx());
                }
            }
            i3 = zzfed.zzaf(i4, ((Integer) this.zzpfb[i]).intValue());
            i2 += i3;
        }
        this.zzpch = i2;
        return i2;
    }
}
