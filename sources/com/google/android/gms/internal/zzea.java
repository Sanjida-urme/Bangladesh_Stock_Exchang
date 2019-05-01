package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;

public class zzea {
    private static String TAG = "zzea";
    private final String className;
    private final zzda zzagk;
    private final String zzajv;
    private final int zzajw = 2;
    private volatile Method zzajx = null;
    private final Class<?>[] zzajy;
    private CountDownLatch zzajz = new CountDownLatch(1);

    public zzea(zzda zzda, String str, String str2, Class<?>... clsArr) {
        this.zzagk = zzda;
        this.className = str;
        this.zzajv = str2;
        this.zzajy = clsArr;
        this.zzagk.zzae().submit(new zzeb(this));
    }

    private final void zzax() {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/558922244.run(Unknown Source)
*/
        /*
        r3 = this;
        r0 = r3.zzagk;	 Catch:{ zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, all -> 0x0035 }
        r0 = r0.zzaf();	 Catch:{ zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, all -> 0x0035 }
        r1 = r3.zzagk;	 Catch:{ zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, all -> 0x0035 }
        r1 = r1.zzah();	 Catch:{ zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, all -> 0x0035 }
        r2 = r3.className;	 Catch:{ zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, all -> 0x0035 }
        r1 = r3.zzc(r1, r2);	 Catch:{ zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, all -> 0x0035 }
        r0 = r0.loadClass(r1);	 Catch:{ zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, all -> 0x0035 }
        if (r0 != 0) goto L_0x001e;
    L_0x0018:
        r0 = r3.zzajz;
        r0.countDown();
        return;
    L_0x001e:
        r1 = r3.zzagk;	 Catch:{ zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, all -> 0x0035 }
        r1 = r1.zzah();	 Catch:{ zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, all -> 0x0035 }
        r2 = r3.zzajv;	 Catch:{ zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, all -> 0x0035 }
        r1 = r3.zzc(r1, r2);	 Catch:{ zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, all -> 0x0035 }
        r2 = r3.zzajy;	 Catch:{ zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, all -> 0x0035 }
        r0 = r0.getMethod(r1, r2);	 Catch:{ zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, all -> 0x0035 }
        r3.zzajx = r0;	 Catch:{ zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, all -> 0x0035 }
        r0 = r3.zzajx;	 Catch:{ zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, zzcv -> 0x0018, all -> 0x0035 }
        goto L_0x0018;
    L_0x0035:
        r0 = move-exception;
        r1 = r3.zzajz;
        r1.countDown();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzea.zzax():void");
    }

    private final String zzc(byte[] bArr, String str) throws zzcv, UnsupportedEncodingException {
        return new String(this.zzagk.zzag().zzb(bArr, str), "UTF-8");
    }

    public final java.lang.reflect.Method zzay() {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/558922244.run(Unknown Source)
*/
        /*
        r5 = this;
        r0 = r5.zzajx;
        if (r0 == 0) goto L_0x0007;
    L_0x0004:
        r0 = r5.zzajx;
        return r0;
    L_0x0007:
        r0 = 0;
        r1 = r5.zzajz;	 Catch:{ InterruptedException -> 0x0018 }
        r2 = 2;	 Catch:{ InterruptedException -> 0x0018 }
        r4 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ InterruptedException -> 0x0018 }
        r1 = r1.await(r2, r4);	 Catch:{ InterruptedException -> 0x0018 }
        if (r1 != 0) goto L_0x0015;	 Catch:{ InterruptedException -> 0x0018 }
    L_0x0014:
        return r0;	 Catch:{ InterruptedException -> 0x0018 }
    L_0x0015:
        r1 = r5.zzajx;	 Catch:{ InterruptedException -> 0x0018 }
        return r1;
    L_0x0018:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzea.zzay():java.lang.reflect.Method");
    }
}
