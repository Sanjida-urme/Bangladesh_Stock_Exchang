package com.google.android.gms.internal;

import java.io.IOException;

public final class zzba extends zzfhm<zzba> {
    public byte[] data;
    public byte[] zzge;
    public byte[] zzgf;
    public byte[] zzgg;

    public zzba() {
        this.data = null;
        this.zzge = null;
        this.zzgf = null;
        this.zzgg = null;
        this.zzpaw = -1;
    }

    public final /* synthetic */ zzfhs zza(zzfhj zzfhj) throws IOException {
        while (true) {
            int zzctt = zzfhj.zzctt();
            if (zzctt == 0) {
                return this;
            }
            if (zzctt == 10) {
                this.data = zzfhj.readBytes();
            } else if (zzctt == 18) {
                this.zzge = zzfhj.readBytes();
            } else if (zzctt == 26) {
                this.zzgf = zzfhj.readBytes();
            } else if (zzctt == 34) {
                this.zzgg = zzfhj.readBytes();
            } else if (!super.zza(zzfhj, zzctt)) {
                return this;
            }
        }
    }

    public final void zza(zzfhk zzfhk) throws IOException {
        if (this.data != null) {
            zzfhk.zzc(1, this.data);
        }
        if (this.zzge != null) {
            zzfhk.zzc(2, this.zzge);
        }
        if (this.zzgf != null) {
            zzfhk.zzc(3, this.zzgf);
        }
        if (this.zzgg != null) {
            zzfhk.zzc(4, this.zzgg);
        }
        super.zza(zzfhk);
    }

    protected final int zzo() {
        int zzo = super.zzo();
        if (this.data != null) {
            zzo += zzfhk.zzd(1, this.data);
        }
        if (this.zzge != null) {
            zzo += zzfhk.zzd(2, this.zzge);
        }
        if (this.zzgf != null) {
            zzo += zzfhk.zzd(3, this.zzgf);
        }
        return this.zzgg != null ? zzo + zzfhk.zzd(4, this.zzgg) : zzo;
    }
}
