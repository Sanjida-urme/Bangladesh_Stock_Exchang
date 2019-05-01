package com.google.android.gms.internal;

final class zzvl implements Runnable {
    private /* synthetic */ zzvc zzcei;

    zzvl(zzvc zzvc) {
        this.zzcei = zzvc;
    }

    public final void run() {
        try {
            this.zzcei.zzcea.onAdClosed();
        } catch (Throwable e) {
            zzaiw.zzc("Could not call onAdClosed.", e);
        }
    }
}
