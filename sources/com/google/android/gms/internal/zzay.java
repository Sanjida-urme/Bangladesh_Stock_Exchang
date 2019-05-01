package com.google.android.gms.internal;

import java.io.IOException;

public final class zzay extends zzfhm<zzay> {
    private Long zzej;
    private Long zzek;
    public Long zzfw;
    public Long zzfx;
    public Long zzfy;

    public zzay() {
        this.zzej = null;
        this.zzek = null;
        this.zzfw = null;
        this.zzfx = null;
        this.zzfy = null;
        this.zzpaw = -1;
    }

    public final /* synthetic */ zzfhs zza(zzfhj zzfhj) throws IOException {
        while (true) {
            int zzctt = zzfhj.zzctt();
            if (zzctt == 0) {
                return this;
            }
            if (zzctt == 8) {
                this.zzej = Long.valueOf(zzfhj.zzcun());
            } else if (zzctt == 16) {
                this.zzek = Long.valueOf(zzfhj.zzcun());
            } else if (zzctt == 24) {
                this.zzfw = Long.valueOf(zzfhj.zzcun());
            } else if (zzctt == 32) {
                this.zzfx = Long.valueOf(zzfhj.zzcun());
            } else if (zzctt == 40) {
                this.zzfy = Long.valueOf(zzfhj.zzcun());
            } else if (!super.zza(zzfhj, zzctt)) {
                return this;
            }
        }
    }

    public final void zza(zzfhk zzfhk) throws IOException {
        if (this.zzej != null) {
            zzfhk.zzf(1, this.zzej.longValue());
        }
        if (this.zzek != null) {
            zzfhk.zzf(2, this.zzek.longValue());
        }
        if (this.zzfw != null) {
            zzfhk.zzf(3, this.zzfw.longValue());
        }
        if (this.zzfx != null) {
            zzfhk.zzf(4, this.zzfx.longValue());
        }
        if (this.zzfy != null) {
            zzfhk.zzf(5, this.zzfy.longValue());
        }
        super.zza(zzfhk);
    }

    protected final int zzo() {
        int zzo = super.zzo();
        if (this.zzej != null) {
            zzo += zzfhk.zzc(1, this.zzej.longValue());
        }
        if (this.zzek != null) {
            zzo += zzfhk.zzc(2, this.zzek.longValue());
        }
        if (this.zzfw != null) {
            zzo += zzfhk.zzc(3, this.zzfw.longValue());
        }
        if (this.zzfx != null) {
            zzo += zzfhk.zzc(4, this.zzfx.longValue());
        }
        return this.zzfy != null ? zzo + zzfhk.zzc(5, this.zzfy.longValue()) : zzo;
    }
}
