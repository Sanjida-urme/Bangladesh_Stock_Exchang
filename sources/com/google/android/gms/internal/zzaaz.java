package com.google.android.gms.internal;

final class zzaaz implements Runnable {
    private /* synthetic */ zzaau zzcow;

    zzaaz(zzaau zzaau) {
        this.zzcow = zzaau;
    }

    public final void run() {
        if (this.zzcow.zzcov != null) {
            this.zzcow.zzcov.release();
            this.zzcow.zzcov = null;
        }
    }
}
