package com.google.android.gms.internal;

final class zzvk implements Runnable {
    private /* synthetic */ zzvc zzcei;

    zzvk(zzvc zzvc) {
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
