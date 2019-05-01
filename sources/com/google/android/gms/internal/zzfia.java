package com.google.android.gms.internal;

import java.io.IOException;

public final class zzfia extends zzfhm<zzfia> {
    private byte[] zzpjb;
    private byte[] zzpjc;
    private byte[] zzpjd;

    public zzfia() {
        this.zzpjb = null;
        this.zzpjc = null;
        this.zzpjd = null;
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
                this.zzpjb = zzfhj.readBytes();
            } else if (zzctt == 18) {
                this.zzpjc = zzfhj.readBytes();
            } else if (zzctt == 26) {
                this.zzpjd = zzfhj.readBytes();
            } else if (!super.zza(zzfhj, zzctt)) {
                return this;
            }
        }
    }

    public final void zza(zzfhk zzfhk) throws IOException {
        if (this.zzpjb != null) {
            zzfhk.zzc(1, this.zzpjb);
        }
        if (this.zzpjc != null) {
            zzfhk.zzc(2, this.zzpjc);
        }
        if (this.zzpjd != null) {
            zzfhk.zzc(3, this.zzpjd);
        }
        super.zza(zzfhk);
    }

    protected final int zzo() {
        int zzo = super.zzo();
        if (this.zzpjb != null) {
            zzo += zzfhk.zzd(1, this.zzpjb);
        }
        if (this.zzpjc != null) {
            zzo += zzfhk.zzd(2, this.zzpjc);
        }
        return this.zzpjd != null ? zzo + zzfhk.zzd(3, this.zzpjd) : zzo;
    }
}
