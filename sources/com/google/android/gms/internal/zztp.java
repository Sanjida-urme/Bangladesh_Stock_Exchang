package com.google.android.gms.internal;

import android.support.annotation.Nullable;

@zzzb
public final class zztp extends zzuj {
    private final Object mLock = new Object();
    private zztu zzccm;
    private zzto zzccn;

    public final void onAdClicked() {
        synchronized (this.mLock) {
            if (this.zzccn != null) {
                this.zzccn.zzcd();
            }
        }
    }

    public final void onAdClosed() {
        synchronized (this.mLock) {
            if (this.zzccn != null) {
                this.zzccn.zzce();
            }
        }
    }

    public final void onAdFailedToLoad(int i) {
        synchronized (this.mLock) {
            if (this.zzccm != null) {
                this.zzccm.zzv(i == 3 ? 1 : 2);
                this.zzccm = null;
            }
        }
    }

    public final void onAdImpression() {
        synchronized (this.mLock) {
            if (this.zzccn != null) {
                this.zzccn.zzci();
            }
        }
    }

    public final void onAdLeftApplication() {
        synchronized (this.mLock) {
            if (this.zzccn != null) {
                this.zzccn.zzcf();
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAdLoaded() {
        /*
        r3 = this;
        r0 = r3.mLock;
        monitor-enter(r0);
        r1 = r3.zzccm;	 Catch:{ all -> 0x001d }
        if (r1 == 0) goto L_0x0012;
    L_0x0007:
        r1 = r3.zzccm;	 Catch:{ all -> 0x001d }
        r2 = 0;
        r1.zzv(r2);	 Catch:{ all -> 0x001d }
        r1 = 0;
        r3.zzccm = r1;	 Catch:{ all -> 0x001d }
        monitor-exit(r0);	 Catch:{ all -> 0x001d }
        return;
    L_0x0012:
        r1 = r3.zzccn;	 Catch:{ all -> 0x001d }
        if (r1 == 0) goto L_0x001b;
    L_0x0016:
        r1 = r3.zzccn;	 Catch:{ all -> 0x001d }
        r1.zzch();	 Catch:{ all -> 0x001d }
    L_0x001b:
        monitor-exit(r0);	 Catch:{ all -> 0x001d }
        return;
    L_0x001d:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x001d }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zztp.onAdLoaded():void");
    }

    public final void onAdOpened() {
        synchronized (this.mLock) {
            if (this.zzccn != null) {
                this.zzccn.zzcg();
            }
        }
    }

    public final void onAppEvent(String str, String str2) {
        synchronized (this.mLock) {
            if (this.zzccn != null) {
                this.zzccn.zzc(str, str2);
            }
        }
    }

    public final void onVideoEnd() {
        synchronized (this.mLock) {
            if (this.zzccn != null) {
                this.zzccn.zzcc();
            }
        }
    }

    public final void zza(@Nullable zzto zzto) {
        synchronized (this.mLock) {
            this.zzccn = zzto;
        }
    }

    public final void zza(zztu zztu) {
        synchronized (this.mLock) {
            this.zzccm = zztu;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.internal.zzul r4) {
        /*
        r3 = this;
        r0 = r3.mLock;
        monitor-enter(r0);
        r1 = r3.zzccm;	 Catch:{ all -> 0x001d }
        if (r1 == 0) goto L_0x0012;
    L_0x0007:
        r1 = r3.zzccm;	 Catch:{ all -> 0x001d }
        r2 = 0;
        r1.zza(r2, r4);	 Catch:{ all -> 0x001d }
        r4 = 0;
        r3.zzccm = r4;	 Catch:{ all -> 0x001d }
        monitor-exit(r0);	 Catch:{ all -> 0x001d }
        return;
    L_0x0012:
        r4 = r3.zzccn;	 Catch:{ all -> 0x001d }
        if (r4 == 0) goto L_0x001b;
    L_0x0016:
        r4 = r3.zzccn;	 Catch:{ all -> 0x001d }
        r4.zzch();	 Catch:{ all -> 0x001d }
    L_0x001b:
        monitor-exit(r0);	 Catch:{ all -> 0x001d }
        return;
    L_0x001d:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x001d }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zztp.zza(com.google.android.gms.internal.zzul):void");
    }

    public final void zzb(zzpu zzpu, String str) {
        synchronized (this.mLock) {
            if (this.zzccn != null) {
                this.zzccn.zza(zzpu, str);
            }
        }
    }
}
