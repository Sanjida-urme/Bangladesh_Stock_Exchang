package com.google.android.gms.internal;

import java.io.IOException;

public abstract class zzfhm<M extends zzfhm<M>> extends zzfhs {
    protected zzfho zzphm;

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return zzcxf();
    }

    public final <T> T zza(zzfhn<M, T> zzfhn) {
        if (this.zzphm == null) {
            return null;
        }
        zzfhp zzma = this.zzphm.zzma(zzfhn.tag >>> 3);
        return zzma == null ? null : zzma.zzb(zzfhn);
    }

    public void zza(zzfhk zzfhk) throws IOException {
        if (this.zzphm != null) {
            for (int i = 0; i < this.zzphm.size(); i++) {
                this.zzphm.zzmb(i).zza(zzfhk);
            }
        }
    }

    protected final boolean zza(zzfhj zzfhj, int i) throws IOException {
        int position = zzfhj.getPosition();
        if (!zzfhj.zzkh(i)) {
            return false;
        }
        int i2 = i >>> 3;
        zzfhu zzfhu = new zzfhu(i, zzfhj.zzal(position, zzfhj.getPosition() - position));
        zzfhp zzfhp = null;
        if (this.zzphm == null) {
            this.zzphm = new zzfho();
        } else {
            zzfhp = this.zzphm.zzma(i2);
        }
        if (zzfhp == null) {
            zzfhp = new zzfhp();
            this.zzphm.zza(i2, zzfhp);
        }
        zzfhp.zza(zzfhu);
        return true;
    }

    public M zzcxf() throws CloneNotSupportedException {
        zzfhm zzfhm = (zzfhm) super.zzcxg();
        zzfhq.zza(this, zzfhm);
        return zzfhm;
    }

    public /* synthetic */ zzfhs zzcxg() throws CloneNotSupportedException {
        return (zzfhm) clone();
    }

    protected int zzo() {
        if (this.zzphm == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.zzphm.size(); i2++) {
            i += this.zzphm.zzmb(i2).zzo();
        }
        return i;
    }
}
