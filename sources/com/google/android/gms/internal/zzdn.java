package com.google.android.gms.internal;

import java.lang.reflect.InvocationTargetException;

public final class zzdn extends zzec {
    public zzdn(zzda zzda, String str, String str2, zzaw zzaw, int i, int i2) {
        super(zzda, str, str2, zzaw, i, 24);
    }

    private final void zzaw() {
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
        r4 = this;
        r0 = r4.zzagk;
        r0 = r0.zzaq();
        if (r0 != 0) goto L_0x0009;
    L_0x0008:
        return;
    L_0x0009:
        r0 = r0.getInfo();	 Catch:{ IOException -> 0x0038 }
        r1 = r0.getId();	 Catch:{ IOException -> 0x0038 }
        r1 = com.google.android.gms.internal.zzdf.zzm(r1);	 Catch:{ IOException -> 0x0038 }
        if (r1 == 0) goto L_0x0038;	 Catch:{ IOException -> 0x0038 }
    L_0x0017:
        r2 = r4.zzajo;	 Catch:{ IOException -> 0x0038 }
        monitor-enter(r2);	 Catch:{ IOException -> 0x0038 }
        r3 = r4.zzajo;	 Catch:{ all -> 0x0035 }
        r3.zzew = r1;	 Catch:{ all -> 0x0035 }
        r1 = r4.zzajo;	 Catch:{ all -> 0x0035 }
        r0 = r0.isLimitAdTrackingEnabled();	 Catch:{ all -> 0x0035 }
        r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ all -> 0x0035 }
        r1.zzey = r0;	 Catch:{ all -> 0x0035 }
        r0 = r4.zzajo;	 Catch:{ all -> 0x0035 }
        r1 = 5;	 Catch:{ all -> 0x0035 }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ all -> 0x0035 }
        r0.zzex = r1;	 Catch:{ all -> 0x0035 }
        monitor-exit(r2);	 Catch:{ all -> 0x0035 }
        return;	 Catch:{ all -> 0x0035 }
    L_0x0035:
        r0 = move-exception;	 Catch:{ all -> 0x0035 }
        monitor-exit(r2);	 Catch:{ all -> 0x0035 }
        throw r0;	 Catch:{ IOException -> 0x0038 }
    L_0x0038:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzdn.zzaw():void");
    }

    public final /* synthetic */ Object call() throws Exception {
        return zzav();
    }

    protected final void zzat() throws IllegalAccessException, InvocationTargetException {
        if (this.zzagk.zzai()) {
            zzaw();
            return;
        }
        synchronized (this.zzajo) {
            this.zzajo.zzew = (String) this.zzajx.invoke(null, new Object[]{this.zzagk.getApplicationContext()});
        }
    }

    public final Void zzav() throws Exception {
        if (this.zzagk.isInitialized()) {
            return super.zzav();
        }
        if (this.zzagk.zzai()) {
            zzaw();
        }
        return null;
    }
}
