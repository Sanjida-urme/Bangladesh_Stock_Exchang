package com.google.android.gms.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class zzffx extends zzfdp {
    private static final int[] zzpdu;
    private final int zzpdv;
    private final zzfdp zzpdw;
    private final zzfdp zzpdx;
    private final int zzpdy;
    private final int zzpdz;

    static {
        List arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.valueOf(Integer.MAX_VALUE));
        zzpdu = new int[arrayList.size()];
        for (i = 0; i < zzpdu.length; i++) {
            zzpdu[i] = ((Integer) arrayList.get(i)).intValue();
        }
    }

    private zzffx(zzfdp zzfdp, zzfdp zzfdp2) {
        this.zzpdw = zzfdp;
        this.zzpdx = zzfdp2;
        this.zzpdy = zzfdp.size();
        this.zzpdv = this.zzpdy + zzfdp2.size();
        this.zzpdz = Math.max(zzfdp.zzctn(), zzfdp2.zzctn()) + 1;
    }

    static zzfdp zza(zzfdp zzfdp, zzfdp zzfdp2) {
        if (zzfdp2.size() == 0) {
            return zzfdp;
        }
        if (zzfdp.size() == 0) {
            return zzfdp2;
        }
        int size = zzfdp.size() + zzfdp2.size();
        if (size < 128) {
            return zzb(zzfdp, zzfdp2);
        }
        if (zzfdp instanceof zzffx) {
            zzffx zzffx = (zzffx) zzfdp;
            if (zzffx.zzpdx.size() + zzfdp2.size() < 128) {
                return new zzffx(zzffx.zzpdw, zzb(zzffx.zzpdx, zzfdp2));
            } else if (zzffx.zzpdw.zzctn() > zzffx.zzpdx.zzctn() && zzffx.zzctn() > zzfdp2.zzctn()) {
                return new zzffx(zzffx.zzpdw, new zzffx(zzffx.zzpdx, zzfdp2));
            }
        }
        return size >= zzpdu[Math.max(zzfdp.zzctn(), zzfdp2.zzctn()) + 1] ? new zzffx(zzfdp, zzfdp2) : new zzffz().zzc(zzfdp, zzfdp2);
    }

    private static zzfdp zzb(zzfdp zzfdp, zzfdp zzfdp2) {
        int size = zzfdp.size();
        int size2 = zzfdp2.size();
        byte[] bArr = new byte[(size + size2)];
        zzfdp.zza(bArr, 0, 0, size);
        zzfdp2.zza(bArr, 0, size, size2);
        return zzfdp.zzaz(bArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfdp)) {
            return false;
        }
        zzfdp zzfdp = (zzfdp) obj;
        if (this.zzpdv != zzfdp.size()) {
            return false;
        }
        if (this.zzpdv == 0) {
            return true;
        }
        int zzctp = zzctp();
        int zzctp2 = zzfdp.zzctp();
        if (zzctp != 0 && zzctp2 != 0 && zzctp != zzctp2) {
            return false;
        }
        Iterator zzfga = new zzfga(this);
        zzfdp zzfdp2 = (zzfdv) zzfga.next();
        Iterator zzfga2 = new zzfga(zzfdp);
        zzfdp zzfdp3 = (zzfdv) zzfga2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = zzfdp2.size() - i;
            int size2 = zzfdp3.size() - i2;
            int min = Math.min(size, size2);
            if (!(i == 0 ? zzfdp2.zza(zzfdp3, i2, min) : zzfdp3.zza(zzfdp2, i, min))) {
                return false;
            }
            i3 += min;
            if (i3 >= this.zzpdv) {
                break;
            }
            if (min == size) {
                zzfdp2 = (zzfdv) zzfga.next();
                i = 0;
            } else {
                i += min;
            }
            if (min == size2) {
                zzfdp3 = (zzfdv) zzfga2.next();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
        if (i3 == this.zzpdv) {
            return true;
        }
        throw new IllegalStateException();
    }

    public final int size() {
        return this.zzpdv;
    }

    final void zza(zzfdo zzfdo) throws IOException {
        this.zzpdw.zza(zzfdo);
        this.zzpdx.zza(zzfdo);
    }

    protected final void zzb(byte[] bArr, int i, int i2, int i3) {
        if (i + i3 <= this.zzpdy) {
            this.zzpdw.zzb(bArr, i, i2, i3);
        } else if (i >= this.zzpdy) {
            this.zzpdx.zzb(bArr, i - this.zzpdy, i2, i3);
        } else {
            int i4 = this.zzpdy - i;
            this.zzpdw.zzb(bArr, i, i2, i4);
            this.zzpdx.zzb(bArr, 0, i2 + i4, i3 - i4);
        }
    }

    public final zzfdy zzctm() {
        return zzfdy.zzi(new zzfgb(this));
    }

    protected final int zzctn() {
        return this.zzpdz;
    }

    protected final boolean zzcto() {
        return this.zzpdv >= zzpdu[this.zzpdz];
    }

    protected final int zzg(int i, int i2, int i3) {
        if (i2 + i3 <= this.zzpdy) {
            return this.zzpdw.zzg(i, i2, i3);
        }
        if (i2 >= this.zzpdy) {
            return this.zzpdx.zzg(i, i2 - this.zzpdy, i3);
        }
        int i4 = this.zzpdy - i2;
        return this.zzpdx.zzg(this.zzpdw.zzg(i, i2, i4), 0, i3 - i4);
    }

    public final byte zzke(int i) {
        zzfdp zzfdp;
        zzfdp.zzy(i, this.zzpdv);
        if (i < this.zzpdy) {
            zzfdp = this.zzpdw;
        } else {
            zzfdp = this.zzpdx;
            i -= this.zzpdy;
        }
        return zzfdp.zzke(i);
    }

    public final zzfdp zzx(int i, int i2) {
        int zzh = zzfdp.zzh(i, i2, this.zzpdv);
        if (zzh == 0) {
            return zzfdp.zzpaz;
        }
        if (zzh == this.zzpdv) {
            return this;
        }
        zzfdp zzfdp;
        if (i2 <= this.zzpdy) {
            zzfdp = this.zzpdw;
        } else if (i >= this.zzpdy) {
            zzfdp = this.zzpdx;
            i -= this.zzpdy;
            i2 -= this.zzpdy;
        } else {
            zzfdp = this.zzpdw;
            return new zzffx(zzfdp.zzx(i, zzfdp.size()), this.zzpdx.zzx(0, i2 - this.zzpdy));
        }
        return zzfdp.zzx(i, i2);
    }
}
