package com.google.android.gms.internal;

import android.os.Process;
import com.google.android.gms.ads.internal.zzbs;
import java.util.concurrent.Callable;

final class zzago implements Runnable {
    private /* synthetic */ Callable val$callable;
    private /* synthetic */ zzajy zzbxb;

    zzago(zzajy zzajy, Callable callable) {
        this.zzbxb = zzajy;
        this.val$callable = callable;
    }

    public final void run() {
        try {
            Process.setThreadPriority(10);
            this.zzbxb.set(this.val$callable.call());
        } catch (Throwable e) {
            zzbs.zzeg().zza(e, "AdThreadPool.submit");
            this.zzbxb.setException(e);
        }
    }
}
