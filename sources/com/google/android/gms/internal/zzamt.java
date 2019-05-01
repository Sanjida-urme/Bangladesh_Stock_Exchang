package com.google.android.gms.internal;

final class zzamt implements Runnable {
    private /* synthetic */ zzamr zzdkl;
    private /* synthetic */ int zzdkm;
    private /* synthetic */ int zzdkn;
    private /* synthetic */ boolean zzdko;
    private /* synthetic */ boolean zzdkp;

    zzamt(zzamr zzamr, int i, int i2, boolean z, boolean z2) {
        this.zzdkl = zzamr;
        this.zzdkm = i;
        this.zzdkn = i2;
        this.zzdko = z;
        this.zzdkp = z2;
    }

    public final void run() {
        synchronized (this.zzdkl.lock) {
            boolean z = false;
            Object obj = this.zzdkm != this.zzdkn ? 1 : null;
            Object obj2 = (this.zzdkl.zzdkh || this.zzdkn != 1) ? null : 1;
            Object obj3 = (obj == null || this.zzdkn != 1) ? null : 1;
            Object obj4 = (obj == null || this.zzdkn != 2) ? null : 1;
            obj = (obj == null || this.zzdkn != 3) ? null : 1;
            Object obj5 = this.zzdko != this.zzdkp ? 1 : null;
            zzamr zzamr = this.zzdkl;
            if (this.zzdkl.zzdkh || obj2 != null) {
                z = true;
            }
            zzamr.zzdkh = z;
            if (this.zzdkl.zzcdw == null) {
                return;
            }
            if (obj2 != null) {
                try {
                    this.zzdkl.zzcdw.onVideoStart();
                } catch (Throwable e) {
                    zzaiw.zzc("Unable to call onVideoStart()", e);
                }
            }
            if (obj3 != null) {
                try {
                    this.zzdkl.zzcdw.onVideoPlay();
                } catch (Throwable e2) {
                    zzaiw.zzc("Unable to call onVideoPlay()", e2);
                }
            }
            if (obj4 != null) {
                try {
                    this.zzdkl.zzcdw.onVideoPause();
                } catch (Throwable e22) {
                    zzaiw.zzc("Unable to call onVideoPause()", e22);
                }
            }
            if (obj != null) {
                try {
                    this.zzdkl.zzcdw.onVideoEnd();
                } catch (Throwable e3) {
                    zzaiw.zzc("Unable to call onVideoEnd()", e3);
                }
            }
            if (obj5 != null) {
                try {
                    this.zzdkl.zzcdw.onVideoMute(this.zzdkp);
                } catch (Throwable e32) {
                    zzaiw.zzc("Unable to call onVideoMute()", e32);
                }
            }
        }
        return;
    }
}
