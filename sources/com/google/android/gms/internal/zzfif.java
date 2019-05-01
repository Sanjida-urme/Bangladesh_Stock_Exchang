package com.google.android.gms.internal;

import java.io.IOException;

public final class zzfif extends zzfhm<zzfif> {
    public String zzpjr;
    public Long zzpjs;
    public Boolean zzpjt;

    public zzfif() {
        this.zzpjr = null;
        this.zzpjs = null;
        this.zzpjt = null;
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
                this.zzpjr = zzfhj.readString();
            } else if (zzctt == 16) {
                this.zzpjs = Long.valueOf(zzfhj.zzctv());
            } else if (zzctt == 24) {
                this.zzpjt = Boolean.valueOf(zzfhj.zzctz());
            } else if (!super.zza(zzfhj, zzctt)) {
                return this;
            }
        }
    }

    public final void zza(zzfhk zzfhk) throws IOException {
        if (this.zzpjr != null) {
            zzfhk.zzn(1, this.zzpjr);
        }
        if (this.zzpjs != null) {
            zzfhk.zzf(2, this.zzpjs.longValue());
        }
        if (this.zzpjt != null) {
            zzfhk.zzl(3, this.zzpjt.booleanValue());
        }
        super.zza(zzfhk);
    }

    protected final int zzo() {
        int zzo = super.zzo();
        if (this.zzpjr != null) {
            zzo += zzfhk.zzo(1, this.zzpjr);
        }
        if (this.zzpjs != null) {
            zzo += zzfhk.zzc(2, this.zzpjs.longValue());
        }
        if (this.zzpjt == null) {
            return zzo;
        }
        this.zzpjt.booleanValue();
        return zzo + (zzfhk.zzkx(3) + 1);
    }
}
