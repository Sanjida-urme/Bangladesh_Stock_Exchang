package com.google.android.gms.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public abstract class zzec implements Callable {
    private String TAG = getClass().getSimpleName();
    private String className;
    protected final zzda zzagk;
    protected final zzaw zzajo;
    private String zzajv;
    protected Method zzajx;
    private int zzakb;
    private int zzakc;

    public zzec(zzda zzda, String str, String str2, zzaw zzaw, int i, int i2) {
        this.zzagk = zzda;
        this.className = str;
        this.zzajv = str2;
        this.zzajo = zzaw;
        this.zzakb = i;
        this.zzakc = i2;
    }

    public /* synthetic */ Object call() throws Exception {
        return zzav();
    }

    protected abstract void zzat() throws IllegalAccessException, InvocationTargetException;

    public java.lang.Void zzav() throws java.lang.Exception {
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
        r0 = 0;
        r1 = java.lang.System.nanoTime();	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
        r3 = r10.zzagk;	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
        r4 = r10.className;	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
        r5 = r10.zzajv;	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
        r3 = r3.zza(r4, r5);	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
        r10.zzajx = r3;	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
        r3 = r10.zzajx;	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
        if (r3 != 0) goto L_0x0016;	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
    L_0x0015:
        return r0;	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
    L_0x0016:
        r10.zzat();	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
        r3 = r10.zzagk;	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
        r3 = r3.zzaj();	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
        if (r3 == 0) goto L_0x0038;	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
    L_0x0021:
        r4 = r10.zzakb;	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
        r5 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
        if (r4 == r5) goto L_0x0038;	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
    L_0x0027:
        r4 = r10.zzakc;	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
        r5 = r10.zzakb;	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
        r6 = java.lang.System.nanoTime();	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
        r8 = 0;	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
        r8 = r6 - r1;	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
        r1 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
        r8 = r8 / r1;	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
        r3.zza(r4, r5, r8);	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
    L_0x0038:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzec.zzav():java.lang.Void");
    }
}
