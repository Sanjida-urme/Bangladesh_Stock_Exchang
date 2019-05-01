package com.google.android.gms.internal;

final class zzvi implements Runnable {
    private /* synthetic */ zzvc zzcei;

    zzvi(zzvc zzvc) {
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
