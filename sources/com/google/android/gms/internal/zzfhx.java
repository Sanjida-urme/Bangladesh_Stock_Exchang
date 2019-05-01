package com.google.android.gms.internal;

import java.io.IOException;

public final class zzfhx extends zzfhm<zzfhx> {
    public String zzcuw;

    public zzfhx() {
        this.zzcuw = null;
        this.zzphm = null;
        this.zzpaw = -1;
    }

    public final /* synthetic */ zzfhs zza(zzfhj zzfhj) throws IOException {
        while (true) {
            int zzctt = zzfhj.zzctt();
            if (zzctt == 0) {
                return this;
            }
            if (zzctt == 10) {
                this.zzcuw = zzfhj.readString();
            } else if (!super.zza(zzfhj, zzctt)) {
                return this;
            }
        }
    }

    public final void zza(zzfhk zzfhk) throws IOException {
        if (this.zzcuw != null) {
            zzfhk.zzn(1, this.zzcuw);
        }
        super.zza(zzfhk);
    }

    protected final int zzo() {
        int zzo = super.zzo();
        return this.zzcuw != null ? zzo + zzfhk.zzo(1, this.zzcuw) : zzo;
    }
}
