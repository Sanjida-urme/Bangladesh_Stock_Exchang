package com.google.android.gms.internal;

final class zzvn implements Runnable {
    private /* synthetic */ zzvc zzcei;

    zzvn(zzvc zzvc) {
        this.zzcei = zzvc;
    }

    public final void run() {
        try {
            this.zzcei.zzcea.onAdLeftApplication();
        } catch (Throwable e) {
            zzaiw.zzc("Could not call onAdLeftApplication.", e);
        }
    }
}
