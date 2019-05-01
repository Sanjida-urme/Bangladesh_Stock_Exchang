package com.google.android.gms.internal;

import java.io.IOException;

public final class zzfhy extends zzfhm<zzfhy> {
    private static volatile zzfhy[] zzpiv;
    public byte[] zzodc;
    public byte[] zzpiw;

    public zzfhy() {
        this.zzpiw = null;
        this.zzodc = null;
        this.zzphm = null;
        this.zzpaw = -1;
    }

    public static zzfhy[] zzcxn() {
        if (zzpiv == null) {
            synchronized (zzfhq.zzphu) {
                if (zzpiv == null) {
                    zzpiv = new zzfhy[0];
                }
            }
        }
        return zzpiv;
    }

    public final /* synthetic */ zzfhs zza(zzfhj zzfhj) throws IOException {
        while (true) {
            int zzctt = zzfhj.zzctt();
            if (zzctt == 0) {
                return this;
            }
            if (zzctt == 10) {
                this.zzpiw = zzfhj.readBytes();
            } else if (zzctt == 18) {
                this.zzodc = zzfhj.readBytes();
            } else if (!super.zza(zzfhj, zzctt)) {
                return this;
            }
        }
    }

    public final void zza(zzfhk zzfhk) throws IOException {
        zzfhk.zzc(1, this.zzpiw);
        if (this.zzodc != null) {
            zzfhk.zzc(2, this.zzodc);
        }
        super.zza(zzfhk);
    }

    protected final int zzo() {
        int zzo = super.zzo() + zzfhk.zzd(1, this.zzpiw);
        return this.zzodc != null ? zzo + zzfhk.zzd(2, this.zzodc) : zzo;
    }
}
