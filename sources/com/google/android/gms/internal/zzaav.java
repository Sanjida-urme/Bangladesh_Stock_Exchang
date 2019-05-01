package com.google.android.gms.internal;

final class zzaav implements Runnable {
    private /* synthetic */ zzaev zzana;
    private /* synthetic */ zzaau zzcow;

    zzaav(zzaau zzaau, zzaev zzaev) {
        this.zzcow = zzaau;
        this.zzana = zzaev;
    }

    public final void run() {
        this.zzcow.zzckx.zza(this.zzana);
        if (this.zzcow.zzcov != null) {
            this.zzcow.zzcov.release();
            this.zzcow.zzcov = null;
        }
    }
}
