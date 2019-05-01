package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.zzaeu;
import com.google.android.gms.internal.zzaev;

final class zzbb implements Runnable {
    private /* synthetic */ zzaev zzana;
    private /* synthetic */ zzba zzaqs;

    zzbb(zzba zzba, zzaev zzaev) {
        this.zzaqs = zzba;
        this.zzana = zzaev;
    }

    public final void run() {
        this.zzaqs.zzb(new zzaeu(this.zzana, null, null, null, null, null, null, null));
    }
}
