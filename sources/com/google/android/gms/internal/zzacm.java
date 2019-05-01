package com.google.android.gms.internal;

final class zzacm implements Runnable {
    private /* synthetic */ zzaev zzana;
    private /* synthetic */ zzack zzctj;

    zzacm(zzack zzack, zzaev zzaev) {
        this.zzctj = zzack;
        this.zzana = zzaev;
    }

    public final void run() {
        this.zzctj.zzb(new zzaeu(this.zzana, null, null, null, null, null, null, null));
    }
}
