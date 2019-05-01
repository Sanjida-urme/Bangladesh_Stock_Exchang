package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbs;

final class zzabj implements Runnable {
    private /* synthetic */ zzzz zzcpw;
    private /* synthetic */ zzaak zzcpx;
    private /* synthetic */ zzabh zzcpy;

    zzabj(zzabh zzabh, zzzz zzzz, zzaak zzaak) {
        this.zzcpy = zzabh;
        this.zzcpw = zzzz;
        this.zzcpx = zzaak;
    }

    public final void run() {
        zzaad zzb;
        try {
            zzb = this.zzcpy.zzb(this.zzcpw);
        } catch (Throwable e) {
            zzbs.zzeg().zza(e, "AdRequestServiceImpl.loadAdAsync");
            zzaiw.zzc("Could not fetch ad response due to an Exception.", e);
            zzb = null;
        }
        if (zzb == null) {
            zzb = new zzaad(0);
        }
        try {
            this.zzcpx.zza(zzb);
        } catch (Throwable e2) {
            zzaiw.zzc("Fail to forward ad response.", e2);
        }
    }
}
