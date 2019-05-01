package com.google.android.gms.internal;

import java.io.IOException;

public final class zzik extends zzfhm<zzik> {
    public String zzbbl;
    public zzim zzbbm;

    public zzik() {
        this.zzbbl = null;
        this.zzbbm = null;
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
                this.zzbbl = zzfhj.readString();
            } else if (zzctt == 34) {
                if (this.zzbbm == null) {
                    this.zzbbm = new zzim();
                }
                zzfhj.zza(this.zzbbm);
            } else if (!super.zza(zzfhj, zzctt)) {
                return this;
            }
        }
    }

    public final void zza(zzfhk zzfhk) throws IOException {
        if (this.zzbbl != null) {
            zzfhk.zzn(1, this.zzbbl);
        }
        if (this.zzbbm != null) {
            zzfhk.zza(4, this.zzbbm);
        }
        super.zza(zzfhk);
    }

    protected final int zzo() {
        int zzo = super.zzo();
        if (this.zzbbl != null) {
            zzo += zzfhk.zzo(1, this.zzbbl);
        }
        return this.zzbbm != null ? zzo + zzfhk.zzb(4, this.zzbbm) : zzo;
    }
}
