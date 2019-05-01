package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbs;

final class zzafb {
    private final Object mLock;
    private volatile int zzcxt;
    private volatile long zzcxu;

    private zzafb() {
        this.mLock = new Object();
        this.zzcxt = zzafc.zzcxv;
        this.zzcxu = 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzd(int r5, int r6) {
        /*
        r4 = this;
        r4.zzpq();
        r0 = com.google.android.gms.ads.internal.zzbs.zzei();
        r0 = r0.currentTimeMillis();
        r2 = r4.mLock;
        monitor-enter(r2);
        r3 = r4.zzcxt;	 Catch:{ all -> 0x0020 }
        if (r3 == r5) goto L_0x0014;
    L_0x0012:
        monitor-exit(r2);	 Catch:{ all -> 0x0020 }
        return;
    L_0x0014:
        r4.zzcxt = r6;	 Catch:{ all -> 0x0020 }
        r5 = r4.zzcxt;	 Catch:{ all -> 0x0020 }
        r6 = com.google.android.gms.internal.zzafc.zzcxx;	 Catch:{ all -> 0x0020 }
        if (r5 != r6) goto L_0x001e;
    L_0x001c:
        r4.zzcxu = r0;	 Catch:{ all -> 0x0020 }
    L_0x001e:
        monitor-exit(r2);	 Catch:{ all -> 0x0020 }
        return;
    L_0x0020:
        r5 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0020 }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzafb.zzd(int, int):void");
    }

    private final void zzpq() {
        long currentTimeMillis = zzbs.zzei().currentTimeMillis();
        synchronized (this.mLock) {
            if (this.zzcxt == zzafc.zzcxx) {
                if (this.zzcxu + ((Long) zzbs.zzep().zzd(zzmq.zzbpy)).longValue() <= currentTimeMillis) {
                    this.zzcxt = zzafc.zzcxv;
                }
            }
        }
    }

    public final boolean zzpg() {
        zzpq();
        return this.zzcxt == zzafc.zzcxw;
    }

    public final boolean zzph() {
        zzpq();
        return this.zzcxt == zzafc.zzcxx;
    }

    public final void zzpi() {
        zzd(zzafc.zzcxw, zzafc.zzcxx);
    }

    public final void zzz(boolean z) {
        int i;
        int i2;
        if (z) {
            i = zzafc.zzcxv;
            i2 = zzafc.zzcxw;
        } else {
            i = zzafc.zzcxw;
            i2 = zzafc.zzcxv;
        }
        zzd(i, i2);
    }
}
