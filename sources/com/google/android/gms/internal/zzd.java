package com.google.android.gms.internal;

import java.util.concurrent.BlockingQueue;

public final class zzd extends Thread {
    private static final boolean DEBUG = zzab.DEBUG;
    private final BlockingQueue<zzp<?>> zzg;
    private final BlockingQueue<zzp<?>> zzh;
    private final zzb zzi;
    private final zzw zzj;
    private volatile boolean zzk = false;

    public zzd(BlockingQueue<zzp<?>> blockingQueue, BlockingQueue<zzp<?>> blockingQueue2, zzb zzb, zzw zzw) {
        this.zzg = blockingQueue;
        this.zzh = blockingQueue2;
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
        r10 = this;
        r0 = DEBUG;
        r1 = 0;
        if (r0 == 0) goto L_0x000c;
    L_0x0005:
        r0 = "start new dispatcher";
        r2 = new java.lang.Object[r1];
        com.google.android.gms.internal.zzab.zza(r0, r2);
    L_0x000c:
        r0 = 10;
        android.os.Process.setThreadPriority(r0);
        r0 = r10.zzi;
        r0.initialize();
    L_0x0016:
        r0 = r10.zzg;	 Catch:{ InterruptedException -> 0x0094 }
        r0 = r0.take();	 Catch:{ InterruptedException -> 0x0094 }
        r0 = (com.google.android.gms.internal.zzp) r0;	 Catch:{ InterruptedException -> 0x0094 }
        r2 = "cache-queue-take";	 Catch:{ InterruptedException -> 0x0094 }
        r0.zzb(r2);	 Catch:{ InterruptedException -> 0x0094 }
        r2 = r10.zzi;	 Catch:{ InterruptedException -> 0x0094 }
        r3 = r0.getUrl();	 Catch:{ InterruptedException -> 0x0094 }
        r2 = r2.zza(r3);	 Catch:{ InterruptedException -> 0x0094 }
        if (r2 != 0) goto L_0x003a;	 Catch:{ InterruptedException -> 0x0094 }
    L_0x002f:
        r2 = "cache-miss";	 Catch:{ InterruptedException -> 0x0094 }
        r0.zzb(r2);	 Catch:{ InterruptedException -> 0x0094 }
    L_0x0034:
        r2 = r10.zzh;	 Catch:{ InterruptedException -> 0x0094 }
        r2.put(r0);	 Catch:{ InterruptedException -> 0x0094 }
        goto L_0x0016;	 Catch:{ InterruptedException -> 0x0094 }
    L_0x003a:
        r3 = r2.zzd;	 Catch:{ InterruptedException -> 0x0094 }
        r5 = java.lang.System.currentTimeMillis();	 Catch:{ InterruptedException -> 0x0094 }
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));	 Catch:{ InterruptedException -> 0x0094 }
        r3 = 1;	 Catch:{ InterruptedException -> 0x0094 }
        if (r7 >= 0) goto L_0x0047;	 Catch:{ InterruptedException -> 0x0094 }
    L_0x0045:
        r4 = 1;	 Catch:{ InterruptedException -> 0x0094 }
        goto L_0x0048;	 Catch:{ InterruptedException -> 0x0094 }
    L_0x0047:
        r4 = 0;	 Catch:{ InterruptedException -> 0x0094 }
    L_0x0048:
        if (r4 == 0) goto L_0x0053;	 Catch:{ InterruptedException -> 0x0094 }
    L_0x004a:
        r3 = "cache-hit-expired";	 Catch:{ InterruptedException -> 0x0094 }
        r0.zzb(r3);	 Catch:{ InterruptedException -> 0x0094 }
        r0.zza(r2);	 Catch:{ InterruptedException -> 0x0094 }
        goto L_0x0034;	 Catch:{ InterruptedException -> 0x0094 }
    L_0x0053:
        r4 = "cache-hit";	 Catch:{ InterruptedException -> 0x0094 }
        r0.zzb(r4);	 Catch:{ InterruptedException -> 0x0094 }
        r4 = new com.google.android.gms.internal.zzn;	 Catch:{ InterruptedException -> 0x0094 }
        r5 = r2.data;	 Catch:{ InterruptedException -> 0x0094 }
        r6 = r2.zzf;	 Catch:{ InterruptedException -> 0x0094 }
        r4.<init>(r5, r6);	 Catch:{ InterruptedException -> 0x0094 }
        r4 = r0.zza(r4);	 Catch:{ InterruptedException -> 0x0094 }
        r5 = "cache-hit-parsed";	 Catch:{ InterruptedException -> 0x0094 }
        r0.zzb(r5);	 Catch:{ InterruptedException -> 0x0094 }
        r5 = r2.zze;	 Catch:{ InterruptedException -> 0x0094 }
        r7 = java.lang.System.currentTimeMillis();	 Catch:{ InterruptedException -> 0x0094 }
        r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));	 Catch:{ InterruptedException -> 0x0094 }
        if (r9 >= 0) goto L_0x0076;	 Catch:{ InterruptedException -> 0x0094 }
    L_0x0074:
        r5 = 1;	 Catch:{ InterruptedException -> 0x0094 }
        goto L_0x0077;	 Catch:{ InterruptedException -> 0x0094 }
    L_0x0076:
        r5 = 0;	 Catch:{ InterruptedException -> 0x0094 }
    L_0x0077:
        if (r5 != 0) goto L_0x007f;	 Catch:{ InterruptedException -> 0x0094 }
    L_0x0079:
        r2 = r10.zzj;	 Catch:{ InterruptedException -> 0x0094 }
        r2.zza(r0, r4);	 Catch:{ InterruptedException -> 0x0094 }
        goto L_0x0016;	 Catch:{ InterruptedException -> 0x0094 }
    L_0x007f:
        r5 = "cache-hit-refresh-needed";	 Catch:{ InterruptedException -> 0x0094 }
        r0.zzb(r5);	 Catch:{ InterruptedException -> 0x0094 }
        r0.zza(r2);	 Catch:{ InterruptedException -> 0x0094 }
        r4.zzbg = r3;	 Catch:{ InterruptedException -> 0x0094 }
        r2 = r10.zzj;	 Catch:{ InterruptedException -> 0x0094 }
        r3 = new com.google.android.gms.internal.zze;	 Catch:{ InterruptedException -> 0x0094 }
        r3.<init>(r10, r0);	 Catch:{ InterruptedException -> 0x0094 }
        r2.zza(r0, r4, r3);	 Catch:{ InterruptedException -> 0x0094 }
        goto L_0x0016;
    L_0x0094:
        r0 = r10.zzk;
        if (r0 == 0) goto L_0x0016;
    L_0x0098:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzd.run():void");
    }
}
