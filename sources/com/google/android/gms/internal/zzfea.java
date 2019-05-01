package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

final class zzfea extends zzfdy {
    private final byte[] buffer;
    private int limit;
    private int pos;
    private final boolean zzpbk;
    private int zzpbl;
    private int zzpbm;
    private int zzpbn;
    private int zzpbo;

    private zzfea(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.zzpbo = Integer.MAX_VALUE;
        this.buffer = bArr;
        this.limit = i2 + i;
        this.pos = i;
        this.zzpbm = this.pos;
        this.zzpbk = z;
    }

    private final long zzcun() throws IOException {
        int i = this.pos;
        if (this.limit != i) {
            byte[] bArr = this.buffer;
            int i2 = i + 1;
            byte b = bArr[i];
            if (b >= (byte) 0) {
                this.pos = i2;
                return (long) b;
            } else if (this.limit - i2 >= 9) {
                long j;
                long j2;
                int i3 = i2 + 1;
                i = b ^ (bArr[i2] << 7);
                if (i < 0) {
                    i ^= -128;
                } else {
                    i2 = i3 + 1;
                    i ^= bArr[i3] << 14;
                    if (i >= 0) {
                        j = (long) (i ^ 16256);
                        i = i2;
                        j2 = j;
                        this.pos = i;
                        return j2;
                    }
                    i3 = i2 + 1;
                    i ^= bArr[i2] << 21;
                    if (i < 0) {
                        i ^= -2080896;
                    } else {
                        long j3;
                        long j4 = (long) i;
                        i = i3 + 1;
                        long j5 = j4 ^ (((long) bArr[i3]) << 28);
                        if (j5 >= 0) {
                            j3 = 266354560;
                        } else {
                            long j6;
                            int i4 = i + 1;
                            long j7 = j5 ^ (((long) bArr[i]) << 35);
                            if (j7 < 0) {
                                j6 = -34093383808L;
                            } else {
                                i = i4 + 1;
                                j5 = j7 ^ (((long) bArr[i4]) << 42);
                                if (j5 >= 0) {
                                    j3 = 4363953127296L;
                                } else {
                                    i4 = i + 1;
                                    j7 = j5 ^ (((long) bArr[i]) << 49);
                                    if (j7 < 0) {
                                        j6 = -558586000294016L;
                                    } else {
                                        i = i4 + 1;
                                        long j8 = (j7 ^ (((long) bArr[i4]) << 56)) ^ 71499008037633920L;
                                        if (j8 < 0) {
                                            i4 = i + 1;
                                            if (((long) bArr[i]) >= 0) {
                                                i = i4;
                                            }
                                        }
                                        j2 = j8;
                                        this.pos = i;
                                        return j2;
                                    }
                                }
                            }
                            j2 = j7 ^ j6;
                            i = i4;
                            this.pos = i;
                            return j2;
                        }
                        j2 = j5 ^ j3;
                        this.pos = i;
                        return j2;
                    }
                }
                j = (long) i;
                i = i3;
                j2 = j;
                this.pos = i;
                return j2;
            }
        }
        return zzcuj();
    }

    private final int zzcuo() throws IOException {
        int i = this.pos;
        if (this.limit - i < 4) {
            throw zzffe.zzcvs();
        }
        byte[] bArr = this.buffer;
        this.pos = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8)) | ((bArr[i + 2] & 255) << 16));
    }

    private final long zzcup() throws IOException {
        int i = this.pos;
        if (this.limit - i < 8) {
            throw zzffe.zzcvs();
        }
        byte[] bArr = this.buffer;
        this.pos = i + 8;
        return (((((((((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8)) | ((((long) bArr[i + 2]) & 255) << 16)) | ((((long) bArr[i + 3]) & 255) << 24)) | ((((long) bArr[i + 4]) & 255) << 32)) | ((((long) bArr[i + 5]) & 255) << 40)) | ((((long) bArr[i + 6]) & 255) << 48)) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    private final void zzcuq() {
        this.limit += this.zzpbl;
        int i = this.limit - this.zzpbm;
        if (i > this.zzpbo) {
            this.zzpbl = i - this.zzpbo;
            this.limit -= this.zzpbl;
            return;
        }
        this.zzpbl = 0;
    }

    private final byte zzcur() throws IOException {
        if (this.pos == this.limit) {
            throw zzffe.zzcvs();
        }
        byte[] bArr = this.buffer;
        int i = this.pos;
        this.pos = i + 1;
        return bArr[i];
    }

    public final double readDouble() throws IOException {
        return Double.longBitsToDouble(zzcup());
    }

    public final float readFloat() throws IOException {
        return Float.intBitsToFloat(zzcuo());
    }

    public final String readString() throws IOException {
        int zzcui = zzcui();
        if (zzcui > 0 && zzcui <= this.limit - this.pos) {
            String str = new String(this.buffer, this.pos, zzcui, zzfez.UTF_8);
            this.pos += zzcui;
            return str;
        } else if (zzcui == 0) {
            return "";
        } else {
            if (zzcui < 0) {
                throw zzffe.zzcvt();
            }
            throw zzffe.zzcvs();
        }
    }

    public final <T extends zzfem<T, ?>> T zza(T t, zzfei zzfei) throws IOException {
        int zzcui = zzcui();
        if (this.zzpbf >= this.zzpbg) {
            throw zzffe.zzcvy();
        }
        zzcui = zzkj(zzcui);
        this.zzpbf++;
        t = zzfem.zza((zzfem) t, (zzfdy) this, zzfei);
        zzkg(0);
        this.zzpbf--;
        zzkk(zzcui);
        return t;
    }

    public final void zza(zzffr zzffr, zzfei zzfei) throws IOException {
        int zzcui = zzcui();
        if (this.zzpbf >= this.zzpbg) {
            throw zzffe.zzcvy();
        }
        zzcui = zzkj(zzcui);
        this.zzpbf++;
        zzffr.zzb(this, zzfei);
        zzkg(0);
        this.zzpbf--;
        zzkk(zzcui);
    }

    public final int zzctt() throws IOException {
        if (zzcul()) {
            this.zzpbn = 0;
            return 0;
        }
        this.zzpbn = zzcui();
        if ((this.zzpbn >>> 3) != 0) {
            return this.zzpbn;
        }
        throw zzffe.zzcvv();
    }

    public final long zzctu() throws IOException {
        return zzcun();
    }

    public final long zzctv() throws IOException {
        return zzcun();
    }

    public final int zzctw() throws IOException {
        return zzcui();
    }

    public final long zzctx() throws IOException {
        return zzcup();
    }

    public final int zzcty() throws IOException {
        return zzcuo();
    }

    public final boolean zzctz() throws IOException {
        return zzcun() != 0;
    }

    public final String zzcua() throws IOException {
        int zzcui = zzcui();
        if (zzcui <= 0 || zzcui > this.limit - this.pos) {
            if (zzcui == 0) {
                return "";
            }
            if (zzcui <= 0) {
                throw zzffe.zzcvt();
            }
            throw zzffe.zzcvs();
        } else if (zzfgt.zzk(this.buffer, this.pos, this.pos + zzcui)) {
            int i = this.pos;
            this.pos += zzcui;
            return new String(this.buffer, i, zzcui, zzfez.UTF_8);
        } else {
            throw zzffe.zzcwa();
        }
    }

    public final zzfdp zzcub() throws IOException {
        int zzcui = zzcui();
        if (zzcui > 0 && zzcui <= this.limit - this.pos) {
            zzfdp zze = zzfdp.zze(this.buffer, this.pos, zzcui);
            this.pos += zzcui;
            return zze;
        } else if (zzcui == 0) {
            return zzfdp.zzpaz;
        } else {
            byte[] copyOfRange;
            if (zzcui > 0 && zzcui <= this.limit - this.pos) {
                int i = this.pos;
                this.pos += zzcui;
                copyOfRange = Arrays.copyOfRange(this.buffer, i, this.pos);
            } else if (zzcui > 0) {
                throw zzffe.zzcvs();
            } else if (zzcui == 0) {
                copyOfRange = zzfez.EMPTY_BYTE_ARRAY;
            } else {
                throw zzffe.zzcvt();
            }
            return zzfdp.zzaz(copyOfRange);
        }
    }

    public final int zzcuc() throws IOException {
        return zzcui();
    }

    public final int zzcud() throws IOException {
        return zzcui();
    }

    public final int zzcue() throws IOException {
        return zzcuo();
    }

    public final long zzcuf() throws IOException {
        return zzcup();
    }

    public final int zzcug() throws IOException {
        return zzfdy.zzkm(zzcui());
    }

    public final long zzcuh() throws IOException {
        return zzfdy.zzcr(zzcun());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzcui() throws java.io.IOException {
        /*
        r5 = this;
        r0 = r5.pos;
        r1 = r5.limit;
        if (r1 == r0) goto L_0x006d;
    L_0x0006:
        r1 = r5.buffer;
        r2 = r0 + 1;
        r0 = r1[r0];
        if (r0 < 0) goto L_0x0011;
    L_0x000e:
        r5.pos = r2;
        return r0;
    L_0x0011:
        r3 = r5.limit;
        r3 = r3 - r2;
        r4 = 9;
        if (r3 < r4) goto L_0x006d;
    L_0x0018:
        r3 = r2 + 1;
        r2 = r1[r2];
        r2 = r2 << 7;
        r0 = r0 ^ r2;
        if (r0 >= 0) goto L_0x0024;
    L_0x0021:
        r0 = r0 ^ -128;
        goto L_0x006a;
    L_0x0024:
        r2 = r3 + 1;
        r3 = r1[r3];
        r3 = r3 << 14;
        r0 = r0 ^ r3;
        if (r0 < 0) goto L_0x0031;
    L_0x002d:
        r0 = r0 ^ 16256;
    L_0x002f:
        r3 = r2;
        goto L_0x006a;
    L_0x0031:
        r3 = r2 + 1;
        r2 = r1[r2];
        r2 = r2 << 21;
        r0 = r0 ^ r2;
        if (r0 >= 0) goto L_0x003f;
    L_0x003a:
        r1 = -2080896; // 0xffffffffffe03f80 float:NaN double:NaN;
        r0 = r0 ^ r1;
        goto L_0x006a;
    L_0x003f:
        r2 = r3 + 1;
        r3 = r1[r3];
        r4 = r3 << 28;
        r0 = r0 ^ r4;
        r4 = 266354560; // 0xfe03f80 float:2.2112565E-29 double:1.315966377E-315;
        r0 = r0 ^ r4;
        if (r3 >= 0) goto L_0x002f;
    L_0x004c:
        r3 = r2 + 1;
        r2 = r1[r2];
        if (r2 >= 0) goto L_0x006a;
    L_0x0052:
        r2 = r3 + 1;
        r3 = r1[r3];
        if (r3 >= 0) goto L_0x002f;
    L_0x0058:
        r3 = r2 + 1;
        r2 = r1[r2];
        if (r2 >= 0) goto L_0x006a;
    L_0x005e:
        r2 = r3 + 1;
        r3 = r1[r3];
        if (r3 >= 0) goto L_0x002f;
    L_0x0064:
        r3 = r2 + 1;
        r1 = r1[r2];
        if (r1 < 0) goto L_0x006d;
    L_0x006a:
        r5.pos = r3;
        return r0;
    L_0x006d:
        r0 = r5.zzcuj();
        r0 = (int) r0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzfea.zzcui():int");
    }

    final long zzcuj() throws IOException {
        long j = 0;
        int i = 0;
        while (i < 64) {
            byte zzcur = zzcur();
            long j2 = j | (((long) (zzcur & 127)) << i);
            if ((zzcur & 128) == 0) {
                return j2;
            }
            i += 7;
            j = j2;
        }
        throw zzffe.zzcvu();
    }

    public final int zzcuk() {
        return this.zzpbo == Integer.MAX_VALUE ? -1 : this.zzpbo - zzcum();
    }

    public final boolean zzcul() throws IOException {
        return this.pos == this.limit;
    }

    public final int zzcum() {
        return this.pos - this.zzpbm;
    }

    public final void zzkg(int i) throws zzffe {
        if (this.zzpbn != i) {
            throw zzffe.zzcvw();
        }
    }

    public final boolean zzkh(int i) throws IOException {
        int i2 = 0;
        switch (i & 7) {
            case 0:
                if (this.limit - this.pos >= 10) {
                    while (i2 < 10) {
                        byte[] bArr = this.buffer;
                        int i3 = this.pos;
                        this.pos = i3 + 1;
                        if (bArr[i3] < (byte) 0) {
                            i2++;
                        }
                    }
                    throw zzffe.zzcvu();
                }
                while (i2 < 10) {
                    if (zzcur() < (byte) 0) {
                        i2++;
                    }
                }
                throw zzffe.zzcvu();
                return true;
            case 1:
                zzkl(8);
                return true;
            case 2:
                zzkl(zzcui());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                zzkl(4);
                return true;
            default:
                throw zzffe.zzcvx();
        }
        int zzctt;
        do {
            zzctt = zzctt();
            if (zzctt != 0) {
            }
            zzkg(((i >>> 3) << 3) | 4);
            return true;
        } while (zzkh(zzctt));
        zzkg(((i >>> 3) << 3) | 4);
        return true;
    }

    public final int zzkj(int i) throws zzffe {
        if (i < 0) {
            throw zzffe.zzcvt();
        }
        i += zzcum();
        int i2 = this.zzpbo;
        if (i > i2) {
            throw zzffe.zzcvs();
        }
        this.zzpbo = i;
        zzcuq();
        return i2;
    }

    public final void zzkk(int i) {
        this.zzpbo = i;
        zzcuq();
    }

    public final void zzkl(int i) throws IOException {
        if (i >= 0 && i <= this.limit - this.pos) {
            this.pos += i;
        } else if (i < 0) {
            throw zzffe.zzcvt();
        } else {
            throw zzffe.zzcvs();
        }
    }
}
