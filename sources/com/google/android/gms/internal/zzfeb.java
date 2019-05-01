package com.google.android.gms.internal;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

final class zzfeb extends zzfdy {
    private final byte[] buffer;
    private int pos;
    private int zzpbl;
    private int zzpbn;
    private int zzpbo;
    private final InputStream zzpbp;
    private int zzpbq;
    private int zzpbr;
    private zzfec zzpbs;

    private zzfeb(InputStream inputStream, int i) {
        super();
        this.zzpbo = Integer.MAX_VALUE;
        this.zzpbs = null;
        zzfez.zzc(inputStream, "input");
        this.zzpbp = inputStream;
        this.buffer = new byte[i];
        this.zzpbq = 0;
        this.pos = 0;
        this.zzpbr = 0;
    }

    private final long zzcun() throws IOException {
        int i = this.pos;
        if (this.zzpbq != i) {
            byte[] bArr = this.buffer;
            int i2 = i + 1;
            byte b = bArr[i];
            if (b >= (byte) 0) {
                this.pos = i2;
                return (long) b;
            } else if (this.zzpbq - i2 >= 9) {
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
        if (this.zzpbq - i < 4) {
            zzkn(4);
            i = this.pos;
        }
        byte[] bArr = this.buffer;
        this.pos = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8)) | ((bArr[i + 2] & 255) << 16));
    }

    private final long zzcup() throws IOException {
        int i = this.pos;
        if (this.zzpbq - i < 8) {
            zzkn(8);
            i = this.pos;
        }
        byte[] bArr = this.buffer;
        this.pos = i + 8;
        return (((((((((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8)) | ((((long) bArr[i + 2]) & 255) << 16)) | ((((long) bArr[i + 3]) & 255) << 24)) | ((((long) bArr[i + 4]) & 255) << 32)) | ((((long) bArr[i + 5]) & 255) << 40)) | ((((long) bArr[i + 6]) & 255) << 48)) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    private final void zzcuq() {
        this.zzpbq += this.zzpbl;
        int i = this.zzpbr + this.zzpbq;
        if (i > this.zzpbo) {
            this.zzpbl = i - this.zzpbo;
            this.zzpbq -= this.zzpbl;
            return;
        }
        this.zzpbl = 0;
    }

    private final byte zzcur() throws IOException {
        if (this.pos == this.zzpbq) {
            zzkn(1);
        }
        byte[] bArr = this.buffer;
        int i = this.pos;
        this.pos = i + 1;
        return bArr[i];
    }

    private final void zzkn(int i) throws IOException {
        if (!zzko(i)) {
            if (i > (this.zzpbh - this.zzpbr) - this.pos) {
                throw zzffe.zzcvz();
            }
            throw zzffe.zzcvs();
        }
    }

    private final boolean zzko(int i) throws IOException {
        StringBuilder stringBuilder;
        while (this.pos + i > this.zzpbq) {
            if (i > (this.zzpbh - this.zzpbr) - this.pos || (this.zzpbr + this.pos) + i > this.zzpbo) {
                return false;
            }
            int i2 = this.pos;
            if (i2 > 0) {
                if (this.zzpbq > i2) {
                    System.arraycopy(this.buffer, i2, this.buffer, 0, this.zzpbq - i2);
                }
                this.zzpbr += i2;
                this.zzpbq -= i2;
                this.pos = 0;
            }
            i2 = this.zzpbp.read(this.buffer, this.zzpbq, Math.min(this.buffer.length - this.zzpbq, (this.zzpbh - this.zzpbr) - this.zzpbq));
            if (i2 != 0 && i2 >= -1) {
                if (i2 <= this.buffer.length) {
                    if (i2 <= 0) {
                        return false;
                    }
                    this.zzpbq += i2;
                    zzcuq();
                    if (this.zzpbq >= i) {
                        return true;
                    }
                }
            }
            stringBuilder = new StringBuilder(102);
            stringBuilder.append("InputStream#read(byte[]) returned invalid result: ");
            stringBuilder.append(i2);
            stringBuilder.append("\nThe InputStream implementation is buggy.");
            throw new IllegalStateException(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder(77);
        stringBuilder.append("refillBuffer() called when ");
        stringBuilder.append(i);
        stringBuilder.append(" bytes were already available in buffer");
        throw new IllegalStateException(stringBuilder.toString());
    }

    private final byte[] zzkp(int i) throws IOException {
        byte[] zzkq = zzkq(i);
        if (zzkq != null) {
            return zzkq;
        }
        int i2 = this.pos;
        int i3 = this.zzpbq - this.pos;
        this.zzpbr += this.zzpbq;
        this.pos = 0;
        this.zzpbq = 0;
        List<byte[]> zzkr = zzkr(i - i3);
        Object obj = new byte[i];
        System.arraycopy(this.buffer, i2, obj, 0, i3);
        for (byte[] bArr : zzkr) {
            System.arraycopy(bArr, 0, obj, i3, bArr.length);
            i3 += bArr.length;
        }
        return obj;
    }

    private final byte[] zzkq(int i) throws IOException {
        if (i == 0) {
            return zzfez.EMPTY_BYTE_ARRAY;
        }
        if (i < 0) {
            throw zzffe.zzcvt();
        }
        int i2 = (this.zzpbr + this.pos) + i;
        if (i2 - this.zzpbh > 0) {
            throw zzffe.zzcvz();
        } else if (i2 > this.zzpbo) {
            zzkl((this.zzpbo - this.zzpbr) - this.pos);
            throw zzffe.zzcvs();
        } else {
            i2 = this.zzpbq - this.pos;
            int i3 = i - i2;
            if (i3 >= 4096) {
                if (i3 > this.zzpbp.available()) {
                    return null;
                }
            }
            Object obj = new byte[i];
            System.arraycopy(this.buffer, this.pos, obj, 0, i2);
            this.zzpbr += this.zzpbq;
            this.pos = 0;
            this.zzpbq = 0;
            while (i2 < obj.length) {
                int read = this.zzpbp.read(obj, i2, i - i2);
                if (read == -1) {
                    throw zzffe.zzcvs();
                }
                this.zzpbr += read;
                i2 += read;
            }
            return obj;
        }
    }

    private final List<byte[]> zzkr(int i) throws IOException {
        List<byte[]> arrayList = new ArrayList();
        while (i > 0) {
            Object obj = new byte[Math.min(i, 4096)];
            int i2 = 0;
            while (i2 < obj.length) {
                int read = this.zzpbp.read(obj, i2, obj.length - i2);
                if (read == -1) {
                    throw zzffe.zzcvs();
                }
                this.zzpbr += read;
                i2 += read;
            }
            i -= obj.length;
            arrayList.add(obj);
        }
        return arrayList;
    }

    public final double readDouble() throws IOException {
        return Double.longBitsToDouble(zzcup());
    }

    public final float readFloat() throws IOException {
        return Float.intBitsToFloat(zzcuo());
    }

    public final String readString() throws IOException {
        int zzcui = zzcui();
        String str;
        if (zzcui > 0 && zzcui <= this.zzpbq - this.pos) {
            str = new String(this.buffer, this.pos, zzcui, zzfez.UTF_8);
            this.pos += zzcui;
            return str;
        } else if (zzcui == 0) {
            return "";
        } else {
            if (zzcui > this.zzpbq) {
                return new String(zzkp(zzcui), zzfez.UTF_8);
            }
            zzkn(zzcui);
            str = new String(this.buffer, this.pos, zzcui, zzfez.UTF_8);
            this.pos += zzcui;
            return str;
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
        byte[] bArr;
        int zzcui = zzcui();
        int i = this.pos;
        int i2 = 0;
        if (zzcui <= this.zzpbq - i && zzcui > 0) {
            bArr = this.buffer;
            this.pos = i + zzcui;
            i2 = i;
        } else if (zzcui == 0) {
            return "";
        } else {
            if (zzcui <= this.zzpbq) {
                zzkn(zzcui);
                bArr = this.buffer;
                this.pos = zzcui;
            } else {
                bArr = zzkp(zzcui);
            }
        }
        if (zzfgt.zzk(bArr, i2, i2 + zzcui)) {
            return new String(bArr, i2, zzcui, zzfez.UTF_8);
        }
        throw zzffe.zzcwa();
    }

    public final zzfdp zzcub() throws IOException {
        int zzcui = zzcui();
        if (zzcui <= this.zzpbq - this.pos && zzcui > 0) {
            zzfdp zze = zzfdp.zze(this.buffer, this.pos, zzcui);
            this.pos += zzcui;
            return zze;
        } else if (zzcui == 0) {
            return zzfdp.zzpaz;
        } else {
            byte[] zzkq = zzkq(zzcui);
            if (zzkq != null) {
                return zzfdp.zzaz(zzkq);
            }
            int i = this.pos;
            int i2 = this.zzpbq - this.pos;
            this.zzpbr += this.zzpbq;
            this.pos = 0;
            this.zzpbq = 0;
            List<byte[]> zzkr = zzkr(zzcui - i2);
            Iterable arrayList = new ArrayList(zzkr.size() + 1);
            arrayList.add(zzfdp.zze(this.buffer, i, i2));
            for (byte[] zzkq2 : zzkr) {
                arrayList.add(zzfdp.zzaz(zzkq2));
            }
            return zzfdp.zzf(arrayList);
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
        r1 = r5.zzpbq;
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
        r3 = r5.zzpbq;
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzfeb.zzcui():int");
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
        if (this.zzpbo == Integer.MAX_VALUE) {
            return -1;
        }
        return this.zzpbo - (this.zzpbr + this.pos);
    }

    public final boolean zzcul() throws IOException {
        return this.pos == this.zzpbq && !zzko(1);
    }

    public final int zzcum() {
        return this.zzpbr + this.pos;
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
                if (this.zzpbq - this.pos >= 10) {
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
        i += this.zzpbr + this.pos;
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
        if (i <= this.zzpbq - this.pos && i >= 0) {
            this.pos += i;
        } else if (i < 0) {
            throw zzffe.zzcvt();
        } else if ((this.zzpbr + this.pos) + i > this.zzpbo) {
            zzkl((this.zzpbo - this.zzpbr) - this.pos);
            throw zzffe.zzcvs();
        } else {
            int i2 = this.zzpbq - this.pos;
            this.pos = this.zzpbq;
            while (true) {
                zzkn(1);
                int i3 = i - i2;
                if (i3 > this.zzpbq) {
                    i2 += this.zzpbq;
                    this.pos = this.zzpbq;
                } else {
                    this.pos = i3;
                    return;
                }
            }
        }
    }
}
