package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

@zzzb
final class zzajq {
    private final Object zzdco = new Object();
    private final List<Runnable> zzdcp = new ArrayList();
    private boolean zzdcq = false;

    public final void zza(Runnable runnable, Executor executor) {
        synchronized (this.zzdco) {
            if (this.zzdcq) {
                executor.execute(runnable);
            } else {
                this.zzdcp.add(new zzajr(executor, runnable));
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzqw() {
        /*
        r4 = this;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = r4.zzdco;
        monitor-enter(r1);
        r2 = r4.zzdcq;	 Catch:{ all -> 0x0032 }
        if (r2 == 0) goto L_0x000e;
    L_0x000c:
        monitor-exit(r1);	 Catch:{ all -> 0x0032 }
        return;
    L_0x000e:
        r2 = r4.zzdcp;	 Catch:{ all -> 0x0032 }
        r0.addAll(r2);	 Catch:{ all -> 0x0032 }
        r2 = r4.zzdcp;	 Catch:{ all -> 0x0032 }
        r2.clear();	 Catch:{ all -> 0x0032 }
        r2 = 1;
        r4.zzdcq = r2;	 Catch:{ all -> 0x0032 }
        monitor-exit(r1);	 Catch:{ all -> 0x0032 }
        r0 = (java.util.ArrayList) r0;
        r1 = r0.size();
        r2 = 0;
    L_0x0023:
        if (r2 >= r1) goto L_0x0031;
    L_0x0025:
        r3 = r0.get(r2);
        r2 = r2 + 1;
        r3 = (java.lang.Runnable) r3;
        r3.run();
        goto L_0x0023;
    L_0x0031:
        return;
    L_0x0032:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0032 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzajq.zzqw():void");
    }
}
