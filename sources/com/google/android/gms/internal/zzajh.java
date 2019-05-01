package com.google.android.gms.internal;

import java.util.concurrent.ExecutionException;

final /* synthetic */ class zzajh implements Runnable {
    private final zzajd zzdce;
    private final zzajp zzdcf;

    zzajh(zzajd zzajd, zzajp zzajp) {
        this.zzdce = zzajd;
        this.zzdcf = zzajp;
    }

    public final void run() {
        Throwable cause;
        zzajd zzajd = this.zzdce;
        try {
            zzajd.onSuccess(this.zzdcf.get());
        } catch (ExecutionException e) {
            cause = e.getCause();
            zzajd.zzb(cause);
        } catch (InterruptedException e2) {
            cause = e2;
            Thread.currentThread().interrupt();
            zzajd.zzb(cause);
        } catch (Exception e3) {
            cause = e3;
            zzajd.zzb(cause);
        }
    }
}
