package com.google.android.gms.internal;

import java.util.concurrent.ExecutionException;

final /* synthetic */ class zzajm implements Runnable {
    private final zzajy zzbxh;
    private final zzajp zzdcf;

    zzajm(zzajy zzajy, zzajp zzajp) {
        this.zzbxh = zzajy;
        this.zzdcf = zzajp;
    }

    public final void run() {
        Throwable cause;
        zzajy zzajy = this.zzbxh;
        try {
            zzajy.set(this.zzdcf.get());
        } catch (ExecutionException e) {
            cause = e.getCause();
            zzajy.setException(cause);
        } catch (InterruptedException e2) {
            cause = e2;
            Thread.currentThread().interrupt();
            zzajy.setException(cause);
        } catch (Throwable cause2) {
            zzajy.setException(cause2);
        }
    }
}
