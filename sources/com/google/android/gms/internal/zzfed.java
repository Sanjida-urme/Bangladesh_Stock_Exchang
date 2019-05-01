package com.google.android.gms.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzfed extends zzfdo {
    private static final Logger logger = Logger.getLogger(zzfed.class.getName());
    private static final boolean zzpbt = zzfgr.zzcwx();

    public static class zzc extends IOException {
        zzc() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzc(String str, Throwable th) {
            String valueOf = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
            str = String.valueOf(str);
            super(str.length() != 0 ? valueOf.concat(str) : new String(valueOf), th);
        }

        zzc(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    static abstract class zza extends zzfed {
        final byte[] buffer;
        final int limit;
        int position;
        int zzpbu;

        zza(int i) {
            super();
            if (i < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            this.buffer = new byte[Math.max(i, 20)];
            this.limit = this.buffer.length;
        }

        final void zzah(int i, int i2) {
            zzlg((i << 3) | i2);
        }

        final void zzc(byte b) {
            byte[] bArr = this.buffer;
            int i = this.position;
            this.position = i + 1;
            bArr[i] = b;
            this.zzpbu++;
        }

        public final int zzcus() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        final void zzdb(long j) {
            byte[] bArr;
            if (zzfed.zzpbt) {
                long j2 = (long) this.position;
                while ((j & -128) != 0) {
                    bArr = this.buffer;
                    int i = this.position;
                    this.position = i + 1;
                    zzfgr.zza(bArr, (long) i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                bArr = this.buffer;
                int i2 = this.position;
                this.position = i2 + 1;
                zzfgr.zza(bArr, (long) i2, (byte) ((int) j));
                this.zzpbu += (int) (((long) this.position) - j2);
                return;
            }
            while ((j & -128) != 0) {
                bArr = this.buffer;
                int i3 = this.position;
                this.position = i3 + 1;
                bArr[i3] = (byte) ((((int) j) & 127) | 128);
                this.zzpbu++;
                j >>>= 7;
            }
            bArr = this.buffer;
            i2 = this.position;
            this.position = i2 + 1;
            bArr[i2] = (byte) ((int) j);
            this.zzpbu++;
        }

        final void zzdc(long j) {
            byte[] bArr = this.buffer;
            int i = this.position;
            this.position = i + 1;
            bArr[i] = (byte) ((int) (j & 255));
            bArr = this.buffer;
            i = this.position;
            this.position = i + 1;
            bArr[i] = (byte) ((int) ((j >> 8) & 255));
            bArr = this.buffer;
            i = this.position;
            this.position = i + 1;
            bArr[i] = (byte) ((int) ((j >> 16) & 255));
            bArr = this.buffer;
            i = this.position;
            this.position = i + 1;
            bArr[i] = (byte) ((int) ((j >> 24) & 255));
            bArr = this.buffer;
            i = this.position;
            this.position = i + 1;
            bArr[i] = (byte) ((int) (j >> 32));
            bArr = this.buffer;
            i = this.position;
            this.position = i + 1;
            bArr[i] = (byte) ((int) (j >> 40));
            bArr = this.buffer;
            i = this.position;
            this.position = i + 1;
            bArr[i] = (byte) ((int) (j >> 48));
            bArr = this.buffer;
            i = this.position;
            this.position = i + 1;
            bArr[i] = (byte) ((int) (j >> 56));
            this.zzpbu += 8;
        }

        final void zzlg(int i) {
            if (zzfed.zzpbt) {
                byte[] bArr;
                int i2;
                long j = (long) this.position;
                while ((i & -128) != 0) {
                    bArr = this.buffer;
                    i2 = this.position;
                    this.position = i2 + 1;
                    zzfgr.zza(bArr, (long) i2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                bArr = this.buffer;
                i2 = this.position;
                this.position = i2 + 1;
                zzfgr.zza(bArr, (long) i2, (byte) i);
                this.zzpbu += (int) (((long) this.position) - j);
                return;
            }
            byte[] bArr2;
            int i3;
            while ((i & -128) != 0) {
                bArr2 = this.buffer;
                i3 = this.position;
                this.position = i3 + 1;
                bArr2[i3] = (byte) ((i & 127) | 128);
                this.zzpbu++;
                i >>>= 7;
            }
            bArr2 = this.buffer;
            i3 = this.position;
            this.position = i3 + 1;
            bArr2[i3] = (byte) i;
            this.zzpbu++;
        }

        final void zzlh(int i) {
            byte[] bArr = this.buffer;
            int i2 = this.position;
            this.position = i2 + 1;
            bArr[i2] = (byte) i;
            bArr = this.buffer;
            i2 = this.position;
            this.position = i2 + 1;
            bArr[i2] = (byte) (i >> 8);
            bArr = this.buffer;
            i2 = this.position;
            this.position = i2 + 1;
            bArr[i2] = (byte) (i >> 16);
            bArr = this.buffer;
            i2 = this.position;
            this.position = i2 + 1;
            bArr[i2] = i >> 24;
            this.zzpbu += 4;
        }
    }

    static class zzb extends zzfed {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        zzb(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i3 = i + i2;
            if (((i | i2) | (bArr.length - i3)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            this.buffer = bArr;
            this.offset = i;
            this.position = i;
            this.limit = i3;
        }

        public void flush() {
        }

        public final void write(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.buffer, this.position, i2);
                this.position += i2;
            } catch (Throwable e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(i2)}), e);
            }
        }

        public final void zza(int i, long j) throws IOException {
            zzz(i, 0);
            zzcs(j);
        }

        public final void zza(int i, zzfdp zzfdp) throws IOException {
            zzz(i, 2);
            zzam(zzfdp);
        }

        public final void zza(int i, zzffq zzffq) throws IOException {
            zzz(i, 2);
            zzd(zzffq);
        }

        public final void zzaa(int i, int i2) throws IOException {
            zzz(i, 0);
            zzkt(i2);
        }

        public final void zzab(int i, int i2) throws IOException {
            zzz(i, 0);
            zzku(i2);
        }

        public final void zzac(int i, int i2) throws IOException {
            zzz(i, 5);
            zzkw(i2);
        }

        public final void zzam(zzfdp zzfdp) throws IOException {
            zzku(zzfdp.size());
            zzfdp.zza(this);
        }

        public final void zzb(byte b) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                this.position = i + 1;
                bArr[i] = b;
            } catch (Throwable e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(1)}), e);
            }
        }

        public final void zzb(int i, long j) throws IOException {
            zzz(i, 1);
            zzcu(j);
        }

        public final void zzcs(long j) throws IOException {
            byte[] bArr;
            if (!zzfed.zzpbt || zzcus() < 10) {
                while ((j & -128) != 0) {
                    bArr = this.buffer;
                    int i = this.position;
                    this.position = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    bArr = this.buffer;
                    int i2 = this.position;
                    this.position = i2 + 1;
                    bArr[i2] = (byte) ((int) j);
                    return;
                } catch (Throwable e) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(1)}), e);
                }
            }
            while ((j & -128) != 0) {
                bArr = this.buffer;
                i = this.position;
                this.position = i + 1;
                zzfgr.zza(bArr, (long) i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            bArr = this.buffer;
            i2 = this.position;
            this.position = i2 + 1;
            zzfgr.zza(bArr, (long) i2, (byte) ((int) j));
        }

        public final void zzcu(long j) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) ((int) j);
                bArr = this.buffer;
                i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) ((int) (j >> 8));
                bArr = this.buffer;
                i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) ((int) (j >> 16));
                bArr = this.buffer;
                i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) ((int) (j >> 24));
                bArr = this.buffer;
                i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) ((int) (j >> 32));
                bArr = this.buffer;
                i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) ((int) (j >> 40));
                bArr = this.buffer;
                i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) ((int) (j >> 48));
                bArr = this.buffer;
                i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) ((int) (j >> 56));
            } catch (Throwable e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(1)}), e);
            }
        }

        public final int zzcus() {
            return this.limit - this.position;
        }

        public final void zzd(zzffq zzffq) throws IOException {
            zzku(zzffq.zzhl());
            zzffq.zza(this);
        }

        public final void zzd(byte[] bArr, int i, int i2) throws IOException {
            write(bArr, i, i2);
        }

        public final void zzi(byte[] bArr, int i, int i2) throws IOException {
            zzku(i2);
            write(bArr, 0, i2);
        }

        public final void zzkt(int i) throws IOException {
            if (i >= 0) {
                zzku(i);
            } else {
                zzcs((long) i);
            }
        }

        public final void zzku(int i) throws IOException {
            byte[] bArr;
            int i2;
            if (!zzfed.zzpbt || zzcus() < 10) {
                while ((i & -128) != 0) {
                    bArr = this.buffer;
                    i2 = this.position;
                    this.position = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    bArr = this.buffer;
                    i2 = this.position;
                    this.position = i2 + 1;
                    bArr[i2] = (byte) i;
                    return;
                } catch (Throwable e) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(1)}), e);
                }
            }
            while ((i & -128) != 0) {
                bArr = this.buffer;
                i2 = this.position;
                this.position = i2 + 1;
                zzfgr.zza(bArr, (long) i2, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            bArr = this.buffer;
            i2 = this.position;
            this.position = i2 + 1;
            zzfgr.zza(bArr, (long) i2, (byte) i);
        }

        public final void zzkw(int i) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i2 = this.position;
                this.position = i2 + 1;
                bArr[i2] = (byte) i;
                bArr = this.buffer;
                i2 = this.position;
                this.position = i2 + 1;
                bArr[i2] = (byte) (i >> 8);
                bArr = this.buffer;
                i2 = this.position;
                this.position = i2 + 1;
                bArr[i2] = (byte) (i >> 16);
                bArr = this.buffer;
                i2 = this.position;
                this.position = i2 + 1;
                bArr[i2] = i >> 24;
            } catch (Throwable e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(1)}), e);
            }
        }

        public final void zzl(int i, boolean z) throws IOException {
            zzz(i, 0);
            zzb((byte) z);
        }

        public final void zzn(int i, String str) throws IOException {
            zzz(i, 2);
            zztd(str);
        }

        public final void zztd(String str) throws IOException {
            int i = this.position;
            try {
                int zzkz = zzfed.zzkz(str.length() * 3);
                int zzkz2 = zzfed.zzkz(str.length());
                if (zzkz2 == zzkz) {
                    this.position = i + zzkz2;
                    zzkz = zzfgt.zza(str, this.buffer, this.position, zzcus());
                    this.position = i;
                    zzku((zzkz - i) - zzkz2);
                    this.position = zzkz;
                    return;
                }
                zzku(zzfgt.zzd(str));
                this.position = zzfgt.zza(str, this.buffer, this.position, zzcus());
            } catch (zzfgw e) {
                this.position = i;
                zza(str, e);
            } catch (Throwable e2) {
                throw new zzc(e2);
            }
        }

        public final void zzz(int i, int i2) throws IOException {
            zzku((i << 3) | i2);
        }
    }

    static final class zzd extends zza {
        private final OutputStream out;

        zzd(OutputStream outputStream, int i) {
            super(i);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.out = outputStream;
        }

        private final void doFlush() throws IOException {
            this.out.write(this.buffer, 0, this.position);
            this.position = 0;
        }

        private final void zzli(int i) throws IOException {
            if (this.limit - this.position < i) {
                doFlush();
            }
        }

        public final void flush() throws IOException {
            if (this.position > 0) {
                doFlush();
            }
        }

        public final void write(byte[] bArr, int i, int i2) throws IOException {
            if (this.limit - this.position >= i2) {
                System.arraycopy(bArr, i, this.buffer, this.position, i2);
                this.position += i2;
            } else {
                int i3 = this.limit - this.position;
                System.arraycopy(bArr, i, this.buffer, this.position, i3);
                i += i3;
                i2 -= i3;
                this.position = this.limit;
                this.zzpbu += i3;
                doFlush();
                if (i2 <= this.limit) {
                    System.arraycopy(bArr, i, this.buffer, 0, i2);
                    this.position = i2;
                } else {
                    this.out.write(bArr, i, i2);
                }
            }
            this.zzpbu += i2;
        }

        public final void zza(int i, long j) throws IOException {
            zzli(20);
            zzah(i, 0);
            zzdb(j);
        }

        public final void zza(int i, zzfdp zzfdp) throws IOException {
            zzz(i, 2);
            zzam(zzfdp);
        }

        public final void zza(int i, zzffq zzffq) throws IOException {
            zzz(i, 2);
            zzd(zzffq);
        }

        public final void zzaa(int i, int i2) throws IOException {
            zzli(20);
            zzah(i, 0);
            if (i2 >= 0) {
                zzlg(i2);
            } else {
                zzdb((long) i2);
            }
        }

        public final void zzab(int i, int i2) throws IOException {
            zzli(20);
            zzah(i, 0);
            zzlg(i2);
        }

        public final void zzac(int i, int i2) throws IOException {
            zzli(14);
            zzah(i, 5);
            zzlh(i2);
        }

        public final void zzam(zzfdp zzfdp) throws IOException {
            zzku(zzfdp.size());
            zzfdp.zza(this);
        }

        public final void zzb(byte b) throws IOException {
            if (this.position == this.limit) {
                doFlush();
            }
            zzc(b);
        }

        public final void zzb(int i, long j) throws IOException {
            zzli(18);
            zzah(i, 1);
            zzdc(j);
        }

        public final void zzcs(long j) throws IOException {
            zzli(10);
            zzdb(j);
        }

        public final void zzcu(long j) throws IOException {
            zzli(8);
            zzdc(j);
        }

        public final void zzd(zzffq zzffq) throws IOException {
            zzku(zzffq.zzhl());
            zzffq.zza(this);
        }

        public final void zzd(byte[] bArr, int i, int i2) throws IOException {
            write(bArr, i, i2);
        }

        public final void zzi(byte[] bArr, int i, int i2) throws IOException {
            zzku(i2);
            write(bArr, 0, i2);
        }

        public final void zzkt(int i) throws IOException {
            if (i >= 0) {
                zzku(i);
            } else {
                zzcs((long) i);
            }
        }

        public final void zzku(int i) throws IOException {
            zzli(10);
            zzlg(i);
        }

        public final void zzkw(int i) throws IOException {
            zzli(4);
            zzlh(i);
        }

        public final void zzl(int i, boolean z) throws IOException {
            zzli(11);
            zzah(i, 0);
            zzc((byte) z);
        }

        public final void zzn(int i, String str) throws IOException {
            zzz(i, 2);
            zztd(str);
        }

        public final void zztd(String str) throws IOException {
            int i;
            try {
                int length = str.length() * 3;
                int zzkz = zzfed.zzkz(length);
                i = zzkz + length;
                if (i > this.limit) {
                    byte[] bArr = new byte[length];
                    length = zzfgt.zza(str, bArr, 0, length);
                    zzku(length);
                    zzd(bArr, 0, length);
                    return;
                }
                int i2;
                if (i > this.limit - this.position) {
                    doFlush();
                }
                length = zzfed.zzkz(str.length());
                i = this.position;
                if (length == zzkz) {
                    this.position = i + length;
                    zzkz = zzfgt.zza(str, this.buffer, this.position, this.limit - this.position);
                    this.position = i;
                    i2 = (zzkz - i) - length;
                    zzlg(i2);
                    this.position = zzkz;
                } else {
                    i2 = zzfgt.zzd(str);
                    zzlg(i2);
                    this.position = zzfgt.zza(str, this.buffer, this.position, i2);
                }
                this.zzpbu += i2;
            } catch (zzfgw e) {
                this.zzpbu -= this.position - i;
                this.position = i;
                throw e;
            } catch (Throwable e2) {
                throw new zzc(e2);
            } catch (zzfgw e3) {
                zza(str, e3);
            }
        }

        public final void zzz(int i, int i2) throws IOException {
            zzku((i << 3) | i2);
        }
    }

    private zzfed() {
    }

    public static int zza(zzffk zzffk) {
        int zzhl = zzffk.zzhl();
        return zzkz(zzhl) + zzhl;
    }

    public static int zzad(int i, int i2) {
        return zzkx(i) + zzky(i2);
    }

    public static int zzae(int i, int i2) {
        return zzkx(i) + zzkz(i2);
    }

    public static int zzaf(int i, int i2) {
        return zzkx(i) + 4;
    }

    public static int zzag(int i, int i2) {
        return zzkx(i) + zzky(i2);
    }

    public static int zzan(zzfdp zzfdp) {
        int size = zzfdp.size();
        return zzkz(size) + size;
    }

    public static int zzb(int i, double d) {
        return zzkx(i) + 8;
    }

    public static int zzb(int i, zzfdp zzfdp) {
        i = zzkx(i);
        int size = zzfdp.size();
        return i + (zzkz(size) + size);
    }

    public static int zzb(int i, zzffq zzffq) {
        return zzkx(i) + zze(zzffq);
    }

    public static zzfed zzb(OutputStream outputStream, int i) {
        return new zzd(outputStream, i);
    }

    public static zzfed zzbb(byte[] bArr) {
        return zzh(bArr, 0, bArr.length);
    }

    public static int zzbc(byte[] bArr) {
        int length = bArr.length;
        return zzkz(length) + length;
    }

    public static int zzc(int i, long j) {
        return zzkx(i) + zzcw(j);
    }

    public static int zzcv(long j) {
        return zzcw(j);
    }

    public static int zzcw(long j) {
        if ((j & -128) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        int i;
        if ((j & -34359738368L) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((j & -2097152) != 0) {
            i += 2;
            j >>>= 14;
        }
        if ((j & -16384) != 0) {
            i++;
        }
        return i;
    }

    public static int zzcx(long j) {
        return zzcw(zzda(j));
    }

    public static int zzcy(long j) {
        return 8;
    }

    public static int zzcz(long j) {
        return 8;
    }

    public static int zzd(int i, long j) {
        return zzkx(i) + zzcw(j);
    }

    public static int zzda(boolean z) {
        return 1;
    }

    private static long zzda(long j) {
        return (j << 1) ^ (j >> 63);
    }

    public static int zze(int i, long j) {
        return zzkx(i) + 8;
    }

    public static int zze(zzffq zzffq) {
        int zzhl = zzffq.zzhl();
        return zzkz(zzhl) + zzhl;
    }

    public static int zzf(float f) {
        return 4;
    }

    @Deprecated
    public static int zzf(zzffq zzffq) {
        return zzffq.zzhl();
    }

    public static zzfed zzh(byte[] bArr, int i, int i2) {
        return new zzb(bArr, i, i2);
    }

    static int zzks(int i) {
        return i > 4096 ? 4096 : i;
    }

    public static int zzkx(int i) {
        return zzkz(i << 3);
    }

    public static int zzky(int i) {
        return i >= 0 ? zzkz(i) : 10;
    }

    public static int zzkz(int i) {
        return (i & -128) == 0 ? 1 : (i & -16384) == 0 ? 2 : (-2097152 & i) == 0 ? 3 : (i & -268435456) == 0 ? 4 : 5;
    }

    public static int zzla(int i) {
        return zzkz(zzlf(i));
    }

    public static int zzlb(int i) {
        return 4;
    }

    public static int zzlc(int i) {
        return 4;
    }

    public static int zzld(int i) {
        return zzky(i);
    }

    static int zzle(int i) {
        return zzkz(i) + i;
    }

    private static int zzlf(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static int zzm(int i, boolean z) {
        return zzkx(i) + 1;
    }

    public static int zzn(double d) {
        return 8;
    }

    public static int zzo(int i, String str) {
        return zzkx(i) + zzte(str);
    }

    public static int zzte(java.lang.String r1) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/558922244.run(Unknown Source)
*/
        /*
        r0 = com.google.android.gms.internal.zzfgt.zzd(r1);	 Catch:{ zzfgw -> 0x0005 }
        goto L_0x000c;
    L_0x0005:
        r0 = com.google.android.gms.internal.zzfez.UTF_8;
        r1 = r1.getBytes(r0);
        r0 = r1.length;
    L_0x000c:
        r1 = zzkz(r0);
        r1 = r1 + r0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzfed.zzte(java.lang.String):int");
    }

    public abstract void flush() throws IOException;

    public abstract void write(byte[] bArr, int i, int i2) throws IOException;

    public final void zza(int i, double d) throws IOException {
        zzb(i, Double.doubleToRawLongBits(d));
    }

    public abstract void zza(int i, long j) throws IOException;

    public abstract void zza(int i, zzfdp zzfdp) throws IOException;

    public abstract void zza(int i, zzffq zzffq) throws IOException;

    final void zza(String str, zzfgw zzfgw) throws IOException {
        logger.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzfgw);
        byte[] bytes = str.getBytes(zzfez.UTF_8);
        try {
            zzku(bytes.length);
            zzd(bytes, 0, bytes.length);
        } catch (Throwable e) {
            throw new zzc(e);
        } catch (zzc e2) {
            throw e2;
        }
    }

    public abstract void zzaa(int i, int i2) throws IOException;

    public abstract void zzab(int i, int i2) throws IOException;

    public abstract void zzac(int i, int i2) throws IOException;

    public abstract void zzam(zzfdp zzfdp) throws IOException;

    public abstract void zzb(byte b) throws IOException;

    public abstract void zzb(int i, long j) throws IOException;

    public abstract void zzcs(long j) throws IOException;

    public final void zzct(long j) throws IOException {
        zzcs(zzda(j));
    }

    public abstract void zzcu(long j) throws IOException;

    public abstract int zzcus();

    public final void zzcut() {
        if (zzcus() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void zzd(zzffq zzffq) throws IOException;

    abstract void zzi(byte[] bArr, int i, int i2) throws IOException;

    public abstract void zzkt(int i) throws IOException;

    public abstract void zzku(int i) throws IOException;

    public final void zzkv(int i) throws IOException {
        zzku(zzlf(i));
    }

    public abstract void zzkw(int i) throws IOException;

    public abstract void zzl(int i, boolean z) throws IOException;

    public abstract void zzn(int i, String str) throws IOException;

    public abstract void zztd(String str) throws IOException;

    public abstract void zzz(int i, int i2) throws IOException;
}
