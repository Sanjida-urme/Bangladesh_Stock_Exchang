package com.google.android.gms.internal;

import java.io.IOException;

public final class zzau extends zzfhm<zzau> {
    public String zzcq;
    private String zzcr;
    private String zzcs;
    private String zzct;
    private String zzcu;

    public final /* synthetic */ zzfhs zza(zzfhj zzfhj) throws IOException {
        while (true) {
            int zzctt = zzfhj.zzctt();
            if (zzctt == 0) {
                return this;
            }
            if (zzctt == 10) {
                this.zzcq = zzfhj.readString();
            } else if (zzctt == 18) {
                this.zzcr = zzfhj.readString();
            } else if (zzctt == 26) {
                this.zzcs = zzfhj.readString();
            } else if (zzctt == 34) {
                this.zzct = zzfhj.readString();
            } else if (zzctt == 42) {
                this.zzcu = zzfhj.readString();
            } else if (!super.zza(zzfhj, zzctt)) {
                return this;
            }
        }
    }

    public final void zza(zzfhk zzfhk) throws IOException {
        if (this.zzcq != null) {
            zzfhk.zzn(1, this.zzcq);
        }
        if (this.zzcr != null) {
            zzfhk.zzn(2, this.zzcr);
        }
        if (this.zzcs != null) {
            zzfhk.zzn(3, this.zzcs);
        }
        if (this.zzct != null) {
            zzfhk.zzn(4, this.zzct);
        }
        if (this.zzcu != null) {
            zzfhk.zzn(5, this.zzcu);
        }
        super.zza(zzfhk);
    }

    protected final int zzo() {
        int zzo = super.zzo();
        if (this.zzcq != null) {
            zzo += zzfhk.zzo(1, this.zzcq);
        }
        if (this.zzcr != null) {
            zzo += zzfhk.zzo(2, this.zzcr);
        }
        if (this.zzcs != null) {
            zzo += zzfhk.zzo(3, this.zzcs);
        }
        if (this.zzct != null) {
            zzo += zzfhk.zzo(4, this.zzct);
        }
        return this.zzcu != null ? zzo + zzfhk.zzo(5, this.zzcu) : zzo;
    }
}
