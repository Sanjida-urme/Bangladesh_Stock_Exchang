package com.google.android.gms.internal;

final class zzgr implements Runnable {
    private /* synthetic */ zzgq zzayi;

    zzgr(zzgq zzgq) {
        this.zzayi = zzgq;
    }

    public final void run() {
        synchronized (this.zzayi.mLock) {
            if (this.zzayi.zzayc && this.zzayi.zzayd) {
                this.zzayi.zzayc = false;
                zzaiw.zzbw("App went background");
                for (zzgs zzg : this.zzayi.zzaye) {
                    try {
                        zzg.zzg(false);
                    } catch (Throwable e) {
                        zzaiw.zzb("OnForegroundStateChangedListener threw exception.", e);
                    }
                }
            } else {
                zzaiw.zzbw("App is still foreground");
            }
        }
    }
}
