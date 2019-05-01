package com.google.android.gms.internal;

import java.io.IOException;

public final class zzil extends zzfhm<zzil> {
    public String zzbbn;
    public zzik zzbbo;
    public zzij zzbbp;

    public zzil() {
        this.zzbbn = null;
        this.zzbbo = null;
        this.zzbbp = null;
        this.zzphm = null;
        this.zzpaw = -1;
    }

    public final /* synthetic */ zzfhs zza(zzfhj zzfhj) throws IOException {
        while (true) {
            int zzctt = zzfhj.zzctt();
            if (zzctt == 0) {
                return this;
            }
            if (zzctt != 82) {
                zzfhs zzfhs;
                if (zzctt == 122) {
                    if (this.zzbbo == null) {
                        this.zzbbo = new zzik();
                    }
                    zzfhs = this.zzbbo;
                } else if (zzctt == 146) {
                    if (this.zzbbp == null) {
                        this.zzbbp = new zzij();
                    }
                    zzfhs = this.zzbbp;
                } else if (!super.zza(zzfhj, zzctt)) {
                    return this;
                }
                zzfhj.zza(zzfhs);
            } else {
                this.zzbbn = zzfhj.readString();
            }
        }
    }

    public final void zza(zzfhk zzfhk) throws IOException {
        if (this.zzbbn != null) {
            zzfhk.zzn(10, this.zzbbn);
        }
        if (this.zzbbo != null) {
            zzfhk.zza(15, this.zzbbo);
        }
        if (this.zzbbp != null) {
            zzfhk.zza(18, this.zzbbp);
        }
        super.zza(zzfhk);
    }

    protected final int zzo() {
        int zzo = super.zzo();
        if (this.zzbbn != null) {
            zzo += zzfhk.zzo(10, this.zzbbn);
        }
        if (this.zzbbo != null) {
            zzo += zzfhk.zzb(15, this.zzbbo);
        }
        return this.zzbbp != null ? zzo + zzfhk.zzb(18, this.zzbbp) : zzo;
    }
}
