package com.google.android.gms.internal;

import java.util.concurrent.BlockingQueue;

public final class zzl extends Thread {
    private final zzb zzi;
    private final zzw zzj;
    private volatile boolean zzk = false;
    private final BlockingQueue<zzp<?>> zzw;
    private final zzk zzx;

    public zzl(BlockingQueue<zzp<?>> blockingQueue, zzk zzk, zzb zzb, zzw zzw) {
        this.zzw = blockingQueue;
        this.zzx = zzk;
        this.zzi = zzb;
        this.zzj = zzw;
    }

    public final void quit() {
        this.zzk = true;
        interrupt();
    }

    public final void run() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/558922244.run(Unknown Source)
*/
        /*
        r9 = this;
        r0 = 10;
        android.os.Process.setThreadPriority(r0);
    L_0x0005:
        r0 = android.os.SystemClock.elapsedRealtime();
        r2 = r9.zzw;	 Catch:{ InterruptedException -> 0x009a }
        r2 = r2.take();	 Catch:{ InterruptedException -> 0x009a }
        r2 = (com.google.android.gms.internal.zzp) r2;	 Catch:{ InterruptedException -> 0x009a }
        r3 = "network-queue-take";	 Catch:{ zzaa -> 0x0089, Exception -> 0x0064 }
        r2.zzb(r3);	 Catch:{ zzaa -> 0x0089, Exception -> 0x0064 }
        r3 = r2.zzc();	 Catch:{ zzaa -> 0x0089, Exception -> 0x0064 }
        android.net.TrafficStats.setThreadStatsTag(r3);	 Catch:{ zzaa -> 0x0089, Exception -> 0x0064 }
        r3 = r9.zzx;	 Catch:{ zzaa -> 0x0089, Exception -> 0x0064 }
        r3 = r3.zza(r2);	 Catch:{ zzaa -> 0x0089, Exception -> 0x0064 }
        r4 = "network-http-complete";	 Catch:{ zzaa -> 0x0089, Exception -> 0x0064 }
        r2.zzb(r4);	 Catch:{ zzaa -> 0x0089, Exception -> 0x0064 }
        r4 = r3.zzz;	 Catch:{ zzaa -> 0x0089, Exception -> 0x0064 }
        if (r4 == 0) goto L_0x0038;	 Catch:{ zzaa -> 0x0089, Exception -> 0x0064 }
    L_0x002c:
        r4 = r2.zzl();	 Catch:{ zzaa -> 0x0089, Exception -> 0x0064 }
        if (r4 == 0) goto L_0x0038;	 Catch:{ zzaa -> 0x0089, Exception -> 0x0064 }
    L_0x0032:
        r3 = "not-modified";	 Catch:{ zzaa -> 0x0089, Exception -> 0x0064 }
        r2.zzc(r3);	 Catch:{ zzaa -> 0x0089, Exception -> 0x0064 }
        goto L_0x0005;	 Catch:{ zzaa -> 0x0089, Exception -> 0x0064 }
    L_0x0038:
        r3 = r2.zza(r3);	 Catch:{ zzaa -> 0x0089, Exception -> 0x0064 }
        r4 = "network-parse-complete";	 Catch:{ zzaa -> 0x0089, Exception -> 0x0064 }
        r2.zzb(r4);	 Catch:{ zzaa -> 0x0089, Exception -> 0x0064 }
        r4 = r2.zzh();	 Catch:{ zzaa -> 0x0089, Exception -> 0x0064 }
        if (r4 == 0) goto L_0x005b;	 Catch:{ zzaa -> 0x0089, Exception -> 0x0064 }
    L_0x0047:
        r4 = r3.zzbe;	 Catch:{ zzaa -> 0x0089, Exception -> 0x0064 }
        if (r4 == 0) goto L_0x005b;	 Catch:{ zzaa -> 0x0089, Exception -> 0x0064 }
    L_0x004b:
        r4 = r9.zzi;	 Catch:{ zzaa -> 0x0089, Exception -> 0x0064 }
        r5 = r2.getUrl();	 Catch:{ zzaa -> 0x0089, Exception -> 0x0064 }
        r6 = r3.zzbe;	 Catch:{ zzaa -> 0x0089, Exception -> 0x0064 }
        r4.zza(r5, r6);	 Catch:{ zzaa -> 0x0089, Exception -> 0x0064 }
        r4 = "network-cache-written";	 Catch:{ zzaa -> 0x0089, Exception -> 0x0064 }
        r2.zzb(r4);	 Catch:{ zzaa -> 0x0089, Exception -> 0x0064 }
    L_0x005b:
        r2.zzk();	 Catch:{ zzaa -> 0x0089, Exception -> 0x0064 }
        r4 = r9.zzj;	 Catch:{ zzaa -> 0x0089, Exception -> 0x0064 }
        r4.zza(r2, r3);	 Catch:{ zzaa -> 0x0089, Exception -> 0x0064 }
        goto L_0x0005;
    L_0x0064:
        r3 = move-exception;
        r4 = "Unhandled exception %s";
        r5 = 1;
        r5 = new java.lang.Object[r5];
        r6 = 0;
        r7 = r3.toString();
        r5[r6] = r7;
        com.google.android.gms.internal.zzab.zza(r3, r4, r5);
        r4 = new com.google.android.gms.internal.zzaa;
        r4.<init>(r3);
        r5 = android.os.SystemClock.elapsedRealtime();
        r7 = r5 - r0;
        r4.zza(r7);
        r0 = r9.zzj;
        r0.zza(r2, r4);
        goto L_0x0005;
    L_0x0089:
        r3 = move-exception;
        r4 = android.os.SystemClock.elapsedRealtime();
        r6 = r4 - r0;
        r3.zza(r6);
        r0 = r9.zzj;
        r0.zza(r2, r3);
        goto L_0x0005;
    L_0x009a:
        r0 = r9.zzk;
        if (r0 == 0) goto L_0x0005;
    L_0x009e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzl.run():void");
    }
}
