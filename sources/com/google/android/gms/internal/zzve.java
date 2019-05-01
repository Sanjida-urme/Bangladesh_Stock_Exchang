package com.google.android.gms.internal;

final class zzve implements Runnable {
    private /* synthetic */ zzvc zzcei;

    zzve(zzvc zzvc) {
        this.zzcei = zzvc;
    }

    public final void run() {
        try {
            this.zzcei.zzcea.onAdOpened();
        } catch (Throwable e) {
            zzaiw.zzc("Could not call onAdOpened.", e);
        }
    }
}
