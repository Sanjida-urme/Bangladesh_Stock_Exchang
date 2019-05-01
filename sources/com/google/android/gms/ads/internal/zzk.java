package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.zzaeu;
import com.google.android.gms.internal.zzaev;

final class zzk implements Runnable {
    private /* synthetic */ zzaev zzana;
    private /* synthetic */ zzi zzanf;

    zzk(zzi zzi, zzaev zzaev) {
        this.zzanf = zzi;
        this.zzana = zzaev;
    }

    public final void run() {
        this.zzanf.zzb(new zzaeu(this.zzana, null, null, null, null, null, null, null));
    }
}
