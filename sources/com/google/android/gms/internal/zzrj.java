package com.google.android.gms.internal;

import android.os.Handler;
import java.util.LinkedList;
import java.util.List;

@zzzb
final class zzrj {
    private final List<zzsh> zzaof = new LinkedList();

    zzrj() {
    }

    final void zza(zzsi zzsi) {
        Handler handler = zzagr.zzczc;
        for (zzsh zzsg : this.zzaof) {
            handler.post(new zzsg(this, zzsg, zzsi));
        }
        this.zzaof.clear();
    }
}
