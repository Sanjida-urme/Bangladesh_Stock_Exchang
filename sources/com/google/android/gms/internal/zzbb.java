package com.google.android.gms.internal;

import java.io.IOException;

public final class zzbb extends zzfhm<zzbb> {
    public Long zzfz;
    private String zzgh;
    private byte[] zzgi;

    public zzbb() {
        this.zzfz = null;
        this.zzgh = null;
        this.zzgi = null;
        this.zzpaw = -1;
    }

    public final /* synthetic */ zzfhs zza(zzfhj zzfhj) throws IOException {
        while (true) {
            int zzctt = zzfhj.zzctt();
            if (zzctt == 0) {
                return this;
            }
            if (zzctt == 8) {
                this.zzfz = Long.valueOf(zzfhj.zzcun());
            } else if (zzctt == 26) {
                this.zzgh = zzfhj.readString();
            } else if (zzctt == 34) {
                this.zzgi = zzfhj.readBytes();
            } else if (!super.zza(zzfhj, zzctt)) {
                return this;
            }
        }
    }

    public final void zza(zzfhk zzfhk) throws IOException {
        if (this.zzfz != null) {
            zzfhk.zzf(1, this.zzfz.longValue());
        }
        if (this.zzgh != null) {
            zzfhk.zzn(3, this.zzgh);
        }
        if (this.zzgi != null) {
            zzfhk.zzc(4, this.zzgi);
        }
        super.zza(zzfhk);
    }

    protected final int zzo() {
        int zzo = super.zzo();
        if (this.zzfz != null) {
            zzo += zzfhk.zzc(1, this.zzfz.longValue());
        }
        if (this.zzgh != null) {
            zzo += zzfhk.zzo(3, this.zzgh);
        }
        return this.zzgi != null ? zzo + zzfhk.zzd(4, this.zzgi) : zzo;
    }
}
