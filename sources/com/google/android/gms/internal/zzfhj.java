package com.google.android.gms.internal;

import java.io.IOException;

public final class zzfhj {
    private final byte[] buffer;
    private int zzpbf;
    private int zzpbg = 64;
    private int zzpbh = 67108864;
    private int zzpbl;
    private int zzpbn;
    private int zzpbo = Integer.MAX_VALUE;
    private int zzpbq;
    private int zzphj;
    private int zzphk;

    private zzfhj(byte[] bArr, int i, int i2) {
        this.buffer = bArr;
        this.zzphj = i;
        this.zzpbq = i2 + i;
        this.zzphk = i;
    }

    public static zzfhj zzbd(byte[] bArr) {
        return zzn(bArr, 0, bArr.length);
    }

    private final void zzcuq() {
        this.zzpbq += this.zzpbl;
        int i = this.zzpbq;
        if (i > this.zzpbo) {
            this.zzpbl = i - this.zzpbo;
            this.zzpbq -= this.zzpbl;
            return;
        }
        this.zzpbl = 0;
    }

    private final byte zzcur() throws IOException {
        if (this.zzphk == this.zzpbq) {
            throw zzfhr.zzcxi();
        }
        byte[] bArr = this.buffer;
        int i = this.zzphk;
        this.zzphk = i + 1;
        return bArr[i];
    }

    private final void zzkl(int i) throws IOException {
        if (i < 0) {
            throw zzfhr.zzcxj();
        } else if (this.zzphk + i > this.zzpbo) {
            zzkl(this.zzpbo - this.zzphk);
            throw zzfhr.zzcxi();
        } else if (i <= this.zzpbq - this.zzphk) {
            this.zzphk += i;
        } else {
            throw zzfhr.zzcxi();
        }
    }

    public static zzfhj zzn(byte[] bArr, int i, int i2) {
        return new zzfhj(bArr, 0, i2);
    }

    public final int getPosition() {
        return this.zzphk - this.zzphj;
    }

    public final byte[] readBytes() throws IOException {
        int zzcui = zzcui();
        if (zzcui < 0) {
            throw zzfhr.zzcxj();
        } else if (zzcui == 0) {
            return zzfhv.zzpif;
        } else {
            if (zzcui > this.zzpbq - this.zzphk) {
                throw zzfhr.zzcxi();
            }
            Object obj = new byte[zzcui];
            System.arraycopy(this.buffer, this.zzphk, obj, 0, zzcui);
            this.zzphk += zzcui;
            return obj;
        }
    }

    public final String readString() throws IOException {
        int zzcui = zzcui();
        if (zzcui < 0) {
            throw zzfhr.zzcxj();
        } else if (zzcui > this.zzpbq - this.zzphk) {
            throw zzfhr.zzcxi();
        } else {
            String str = new String(this.buffer, this.zzphk, zzcui, zzfhq.UTF_8);
            this.zzphk += zzcui;
            return str;
        }
    }

    public final void zza(zzfhs zzfhs) throws IOException {
        int zzcui = zzcui();
        if (this.zzpbf >= this.zzpbg) {
            throw zzfhr.zzcxl();
        }
        zzcui = zzkj(zzcui);
        this.zzpbf++;
        zzfhs.zza(this);
        zzkg(0);
        this.zzpbf--;
        zzkk(zzcui);
    }

    public final void zza(zzfhs zzfhs, int i) throws IOException {
        if (this.zzpbf >= this.zzpbg) {
            throw zzfhr.zzcxl();
        }
        this.zzpbf++;
        zzfhs.zza(this);
        zzkg((i << 3) | 4);
        this.zzpbf--;
    }

    public final byte[] zzal(int i, int i2) {
        if (i2 == 0) {
            return zzfhv.zzpif;
        }
        Object obj = new byte[i2];
        System.arraycopy(this.buffer, this.zzphj + i, obj, 0, i2);
        return obj;
    }

    final void zzam(int i, int i2) {
        if (i > this.zzphk - this.zzphj) {
            int i3 = this.zzphk - this.zzphj;
            StringBuilder stringBuilder = new StringBuilder(50);
            stringBuilder.append("Position ");
            stringBuilder.append(i);
            stringBuilder.append(" is beyond current ");
            stringBuilder.append(i3);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i < 0) {
            StringBuilder stringBuilder2 = new StringBuilder(24);
            stringBuilder2.append("Bad position ");
            stringBuilder2.append(i);
            throw new IllegalArgumentException(stringBuilder2.toString());
        } else {
            this.zzphk = this.zzphj + i;
            this.zzpbn = i2;
        }
    }

    public final int zzctt() throws IOException {
        if (this.zzphk == this.zzpbq) {
            this.zzpbn = 0;
            return 0;
        }
        this.zzpbn = zzcui();
        if (this.zzpbn != 0) {
            return this.zzpbn;
        }
        throw new zzfhr("Protocol message contained an invalid tag (zero).");
    }

    public final long zzctv() throws IOException {
        return zzcun();
    }

    public final int zzctw() throws IOException {
        return zzcui();
    }

    public final boolean zzctz() throws IOException {
        return zzcui() != 0;
    }

    public final long zzcuh() throws IOException {
        long zzcun = zzcun();
        return (zzcun >>> 1) ^ (-(zzcun & 1));
    }

    public final int zzcui() throws IOException {
        byte zzcur = zzcur();
        if (zzcur >= (byte) 0) {
            return zzcur;
        }
        int i;
        int i2 = zzcur & 127;
        byte zzcur2 = zzcur();
        if (zzcur2 >= (byte) 0) {
            i = zzcur2 << 7;
        } else {
            i2 |= (zzcur2 & 127) << 7;
            zzcur2 = zzcur();
            if (zzcur2 >= (byte) 0) {
                i = zzcur2 << 14;
            } else {
                i2 |= (zzcur2 & 127) << 14;
                zzcur2 = zzcur();
                if (zzcur2 >= (byte) 0) {
                    i = zzcur2 << 21;
                } else {
                    i2 |= (zzcur2 & 127) << 21;
                    zzcur2 = zzcur();
                    i2 |= zzcur2 << 28;
                    if (zzcur2 >= (byte) 0) {
                        return i2;
                    }
                    for (i = 0; i < 5; i++) {
                        if (zzcur() >= (byte) 0) {
                            return i2;
                        }
                    }
                    throw zzfhr.zzcxk();
                }
            }
        }
        return i2 | i;
    }

    public final int zzcuk() {
        if (this.zzpbo == Integer.MAX_VALUE) {
            return -1;
        }
        return this.zzpbo - this.zzphk;
    }

    public final long zzcun() throws IOException {
        int i = 0;
        long j = 0;
        while (i < 64) {
            byte zzcur = zzcur();
            long j2 = j | (((long) (zzcur & 127)) << i);
            if ((zzcur & 128) == 0) {
                return j2;
            }
            i += 7;
            j = j2;
        }
        throw zzfhr.zzcxk();
    }

    public final int zzcuo() throws IOException {
        return (((zzcur() & 255) | ((zzcur() & 255) << 8)) | ((zzcur() & 255) << 16)) | ((zzcur() & 255) << 24);
    }

    public final long zzcup() throws IOException {
        return (((((((((long) zzcur()) & 255) | ((((long) zzcur()) & 255) << 8)) | ((((long) zzcur()) & 255) << 16)) | ((((long) zzcur()) & 255) << 24)) | ((((long) zzcur()) & 255) << 32)) | ((((long) zzcur()) & 255) << 40)) | ((((long) zzcur()) & 255) << 48)) | ((((long) zzcur()) & 255) << 56);
    }

    public final void zzkg(int i) throws zzfhr {
        if (this.zzpbn != i) {
            throw new zzfhr("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final boolean zzkh(int i) throws IOException {
        switch (i & 7) {
            case 0:
                zzcui();
                return true;
            case 1:
                zzcup();
                return true;
            case 2:
                zzkl(zzcui());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                zzcuo();
                return true;
            default:
                throw new zzfhr("Protocol message tag had invalid wire type.");
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

    public final int zzkj(int i) throws zzfhr {
        if (i < 0) {
            throw zzfhr.zzcxj();
        }
        i += this.zzphk;
        int i2 = this.zzpbo;
        if (i > i2) {
            throw zzfhr.zzcxi();
        }
        this.zzpbo = i;
        zzcuq();
        return i2;
    }

    public final void zzkk(int i) {
        this.zzpbo = i;
        zzcuq();
    }

    public final void zzlw(int i) {
        zzam(i, this.zzpbn);
    }
}
