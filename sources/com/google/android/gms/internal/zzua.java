package com.google.android.gms.internal;

final class zzua implements Runnable {
    private /* synthetic */ zztt zzcdu;

    zzua(zztz zztz, zztt zztt) {
        this.zzcdu = zztt;
    }

    public final void run() {
        try {
            this.zzcdu.zzcde.destroy();
        } catch (Throwable e) {
            zzaiw.zzc("Could not destroy mediation adapter.", e);
        }
    }
}
