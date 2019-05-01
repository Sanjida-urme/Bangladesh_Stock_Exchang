package com.google.android.gms.ads.internal.js;

import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.internal.zzafj;
import com.google.android.gms.internal.zzaht;
import com.google.android.gms.internal.zzakc;
import com.google.android.gms.internal.zzake;

public final class zzaf extends zzake<zzc> {
    private final Object mLock = new Object();
    private zzaht<zzc> zzbzl;
    private boolean zzcad;
    private int zzcae;

    public zzaf(zzaht<zzc> zzaht) {
        this.zzbzl = zzaht;
        this.zzcad = false;
        this.zzcae = 0;
    }

    private final void zzlm() {
        synchronized (this.mLock) {
            zzbq.checkState(this.zzcae >= 0);
            if (this.zzcad && this.zzcae == 0) {
                zzafj.m5v("No reference is left (including root). Cleaning up engine.");
                zza(new zzai(this), new zzakc());
            } else {
                zzafj.m5v("There are still references to the engine. Not destroying.");
            }
        }
    }

    public final zzab zzlj() {
        zzab zzab = new zzab(this);
        synchronized (this.mLock) {
            zza(new zzag(this, zzab), new zzah(this, zzab));
            zzbq.checkState(this.zzcae >= 0);
            this.zzcae++;
        }
        return zzab;
    }

    protected final void zzlk() {
        synchronized (this.mLock) {
            zzbq.checkState(this.zzcae > 0);
            zzafj.m5v("Releasing 1 reference for JS Engine");
            this.zzcae--;
            zzlm();
        }
    }

    public final void zzll() {
        synchronized (this.mLock) {
            zzbq.checkState(this.zzcae >= 0);
            zzafj.m5v("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.zzcad = true;
            zzlm();
        }
    }
}
