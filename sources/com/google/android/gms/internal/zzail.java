package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbs;

@zzzb
public final class zzail {
    private Object mLock = new Object();
    private long zzdbf;
    private long zzdbg = Long.MIN_VALUE;

    public zzail(long j) {
        this.zzdbf = j;
    }

    public final boolean tryAcquire() {
        synchronized (this.mLock) {
            long elapsedRealtime = zzbs.zzei().elapsedRealtime();
            if (this.zzdbg + this.zzdbf > elapsedRealtime) {
                return false;
            }
            this.zzdbg = elapsedRealtime;
            return true;
        }
    }
}
