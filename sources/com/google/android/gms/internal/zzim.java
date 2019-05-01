package com.google.android.gms.internal;

import java.io.IOException;

public final class zzim extends zzfhm<zzim> {
    public Integer zzbbq;
    public Integer zzbbr;
    public Integer zzbbs;

    public zzim() {
        this.zzbbq = null;
        this.zzbbr = null;
        this.zzbbs = null;
        this.zzphm = null;
        this.zzpaw = -1;
    }

    public final /* synthetic */ zzfhs zza(zzfhj zzfhj) throws IOException {
        while (true) {
            int zzctt = zzfhj.zzctt();
            if (zzctt == 0) {
                return this;
            }
            if (zzctt == 8) {
                this.zzbbq = Integer.valueOf(zzfhj.zzcui());
            } else if (zzctt == 16) {
                this.zzbbr = Integer.valueOf(zzfhj.zzcui());
            } else if (zzctt == 24) {
                this.zzbbs = Integer.valueOf(zzfhj.zzcui());
            } else if (!super.zza(zzfhj, zzctt)) {
                return this;
            }
        }
    }

    public final void zza(zzfhk zzfhk) throws IOException {
        if (this.zzbbq != null) {
            zzfhk.zzaa(1, this.zzbbq.intValue());
        }
        if (this.zzbbr != null) {
            zzfhk.zzaa(2, this.zzbbr.intValue());
        }
        if (this.zzbbs != null) {
            zzfhk.zzaa(3, this.zzbbs.intValue());
        }
        super.zza(zzfhk);
    }

    protected final int zzo() {
        int zzo = super.zzo();
        if (this.zzbbq != null) {
            zzo += zzfhk.zzad(1, this.zzbbq.intValue());
        }
        if (this.zzbbr != null) {
            zzo += zzfhk.zzad(2, this.zzbbr.intValue());
        }
        return this.zzbbs != null ? zzo + zzfhk.zzad(3, this.zzbbs.intValue()) : zzo;
    }
}
