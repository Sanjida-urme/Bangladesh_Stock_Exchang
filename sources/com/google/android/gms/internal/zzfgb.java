package com.google.android.gms.internal;

import java.io.IOException;
import java.io.InputStream;

final class zzfgb extends InputStream {
    private int mark;
    private zzfga zzped;
    private zzfdv zzpee;
    private int zzpef;
    private int zzpeg;
    private int zzpeh;
    private /* synthetic */ zzffx zzpei;

    public zzfgb(zzffx zzffx) {
        this.zzpei = zzffx;
        initialize();
    }

    private final void initialize() {
        this.zzped = new zzfga(this.zzpei);
        this.zzpee = (zzfdv) this.zzped.next();
        this.zzpef = this.zzpee.size();
        this.zzpeg = 0;
        this.zzpeh = 0;
    }

    private final void zzcwj() {
        if (this.zzpee != null && this.zzpeg == this.zzpef) {
            this.zzpeh += this.zzpef;
            this.zzpeg = 0;
            if (this.zzped.hasNext()) {
                this.zzpee = (zzfdv) this.zzped.next();
                this.zzpef = this.zzpee.size();
                return;
            }
            this.zzpee = null;
            this.zzpef = 0;
        }
    }

    private final int zzj(byte[] bArr, int i, int i2) {
        int i3 = i;
        i = i2;
        while (i > 0) {
            zzcwj();
            if (this.zzpee == null) {
                if (i == i2) {
                    return -1;
                }
                return i2 - i;
            }
            int min = Math.min(this.zzpef - this.zzpeg, i);
            if (bArr != null) {
                this.zzpee.zza(bArr, this.zzpeg, i3, min);
                i3 += min;
            }
            this.zzpeg += min;
            i -= min;
        }
        return i2 - i;
    }

    public final int available() throws IOException {
        return this.zzpei.size() - (this.zzpeh + this.zzpeg);
    }

    public final void mark(int i) {
        this.mark = this.zzpeh + this.zzpeg;
    }

    public final boolean markSupported() {
        return true;
    }

    public final int read() throws IOException {
        zzcwj();
        if (this.zzpee == null) {
            return -1;
        }
        zzfdp zzfdp = this.zzpee;
        int i = this.zzpeg;
        this.zzpeg = i + 1;
        return zzfdp.zzke(i) & 255;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException();
        }
        if (i >= 0 && i2 >= 0) {
            if (i2 <= bArr.length - i) {
                return zzj(bArr, i, i2);
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public final synchronized void reset() {
        initialize();
        zzj(null, 0, this.mark);
    }

    public final long skip(long j) {
        if (j < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (j > 2147483647L) {
            j = 2147483647L;
        }
        return (long) zzj(null, 0, (int) j);
    }
}
