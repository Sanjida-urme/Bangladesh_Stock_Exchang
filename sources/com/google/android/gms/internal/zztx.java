package com.google.android.gms.internal;

import java.util.concurrent.Callable;

final class zztx implements Callable<zztt> {
    private /* synthetic */ zztq zzcdq;
    private /* synthetic */ zztw zzcdr;

    zztx(zztw zztw, zztq zztq) {
        this.zzcdr = zztw;
        this.zzcdq = zztq;
    }

    private final zztt zzlx() throws Exception {
        synchronized (this.zzcdr.mLock) {
            if (this.zzcdr.zzcdm) {
                return null;
            }
            return this.zzcdq.zza(this.zzcdr.mStartTime, this.zzcdr.zzcdk);
        }
    }

    public final /* synthetic */ Object call() throws Exception {
        return zzlx();
    }
}
