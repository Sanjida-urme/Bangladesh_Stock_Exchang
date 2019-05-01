package com.google.android.gms.internal;

final class zzlo implements Runnable {
    private /* synthetic */ zzln zzbff;

    zzlo(zzln zzln) {
        this.zzbff = zzln;
    }

    public final void run() {
        if (this.zzbff.zzbfe.zzaoj != null) {
            try {
                this.zzbff.zzbfe.zzaoj.onAdFailedToLoad(1);
            } catch (Throwable e) {
                zzaiw.zzc("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
