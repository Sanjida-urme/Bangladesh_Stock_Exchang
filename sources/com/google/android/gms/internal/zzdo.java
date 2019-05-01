package com.google.android.gms.internal;

import java.util.concurrent.Callable;

public final class zzdo implements Callable {
    private final zzda zzagk;
    private final zzaw zzajo;

    public zzdo(zzda zzda, zzaw zzaw) {
        this.zzagk = zzda;
        this.zzajo = zzaw;
    }

    private final java.lang.Void zzav() throws java.lang.Exception {
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
        r3 = this;
        r0 = r3.zzagk;
        r0 = r0.zzan();
        if (r0 == 0) goto L_0x0011;
    L_0x0008:
        r0 = r3.zzagk;
        r0 = r0.zzan();
        r0.get();
    L_0x0011:
        r0 = r3.zzagk;
        r0 = r0.zzam();
        if (r0 == 0) goto L_0x002a;
    L_0x0019:
        r1 = r3.zzajo;	 Catch:{ zzfhr -> 0x002a }
        monitor-enter(r1);	 Catch:{ zzfhr -> 0x002a }
        r2 = r3.zzajo;	 Catch:{ all -> 0x0027 }
        r0 = com.google.android.gms.internal.zzfhs.zzc(r0);	 Catch:{ all -> 0x0027 }
        com.google.android.gms.internal.zzfhs.zza(r2, r0);	 Catch:{ all -> 0x0027 }
        monitor-exit(r1);	 Catch:{ all -> 0x0027 }
        goto L_0x002a;	 Catch:{ all -> 0x0027 }
    L_0x0027:
        r0 = move-exception;	 Catch:{ all -> 0x0027 }
        monitor-exit(r1);	 Catch:{ all -> 0x0027 }
        throw r0;	 Catch:{ zzfhr -> 0x002a }
    L_0x002a:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzdo.zzav():java.lang.Void");
    }

    public final /* synthetic */ Object call() throws Exception {
        return zzav();
    }
}
