package com.google.android.gms.internal;

import java.io.IOException;

public final class zzfic extends zzfhm<zzfic> {
    private byte[] zzpjd;
    private Integer zzpjg;
    private byte[] zzpjh;

    public zzfic() {
        this.zzpjg = null;
        this.zzpjh = null;
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
            if (zzctt == 8) {
                this.zzpjg = Integer.valueOf(zzfhj.zzctw());
            } else if (zzctt == 18) {
                this.zzpjh = zzfhj.readBytes();
            } else if (zzctt == 26) {
                this.zzpjd = zzfhj.readBytes();
            } else if (!super.zza(zzfhj, zzctt)) {
                return this;
            }
        }
    }

    public final void zza(zzfhk zzfhk) throws IOException {
        if (this.zzpjg != null) {
            zzfhk.zzaa(1, this.zzpjg.intValue());
        }
        if (this.zzpjh != null) {
            zzfhk.zzc(2, this.zzpjh);
        }
        if (this.zzpjd != null) {
            zzfhk.zzc(3, this.zzpjd);
        }
        super.zza(zzfhk);
    }

    protected final int zzo() {
        int zzo = super.zzo();
        if (this.zzpjg != null) {
            zzo += zzfhk.zzad(1, this.zzpjg.intValue());
        }
        if (this.zzpjh != null) {
            zzo += zzfhk.zzd(2, this.zzpjh);
        }
        return this.zzpjd != null ? zzo + zzfhk.zzd(3, this.zzpjd) : zzo;
    }
}
