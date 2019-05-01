package com.google.android.gms.internal;

final class zzvf implements Runnable {
    private /* synthetic */ zzvc zzcei;

    zzvf(zzvc zzvc) {
        this.zzcei = zzvc;
    }

    public final void run() {
        try {
            this.zzcei.zzcea.onAdLoaded();
        } catch (Throwable e) {
            zzaiw.zzc("Could not call onAdLoaded.", e);
        }
    }
}
