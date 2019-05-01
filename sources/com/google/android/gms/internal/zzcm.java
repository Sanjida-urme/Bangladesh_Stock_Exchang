package com.google.android.gms.internal;

import android.os.ConditionVariable;
import java.util.Random;

public class zzcm {
    private static final ConditionVariable zzagl = new ConditionVariable();
    protected static volatile zzig zzagm;
    private static volatile Random zzago;
    private zzda zzagk;
    protected volatile Boolean zzagn;

    public zzcm(zzda zzda) {
        this.zzagk = zzda;
        zzda.zzae().execute(new zzcn(this));
    }

    public static int zzaa() {
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
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ RuntimeException -> 0x0018 }
        r1 = 21;	 Catch:{ RuntimeException -> 0x0018 }
        if (r0 < r1) goto L_0x000f;	 Catch:{ RuntimeException -> 0x0018 }
    L_0x0006:
        r0 = java.util.concurrent.ThreadLocalRandom.current();	 Catch:{ RuntimeException -> 0x0018 }
        r0 = r0.nextInt();	 Catch:{ RuntimeException -> 0x0018 }
        return r0;	 Catch:{ RuntimeException -> 0x0018 }
    L_0x000f:
        r0 = zzab();	 Catch:{ RuntimeException -> 0x0018 }
        r0 = r0.nextInt();	 Catch:{ RuntimeException -> 0x0018 }
        return r0;
    L_0x0018:
        r0 = zzab();
        r0 = r0.nextInt();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzcm.zzaa():int");
    }

    private static Random zzab() {
        if (zzago == null) {
            synchronized (zzcm.class) {
                if (zzago == null) {
                    zzago = new Random();
                }
            }
        }
        return zzago;
    }

    public final void zza(int r3, int r4, long r5) throws java.io.IOException {
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
        r2 = this;
        r0 = zzagl;	 Catch:{ Exception -> 0x0039 }
        r0.block();	 Catch:{ Exception -> 0x0039 }
        r0 = r2.zzagn;	 Catch:{ Exception -> 0x0039 }
        r0 = r0.booleanValue();	 Catch:{ Exception -> 0x0039 }
        if (r0 == 0) goto L_0x0039;	 Catch:{ Exception -> 0x0039 }
    L_0x000d:
        r0 = zzagm;	 Catch:{ Exception -> 0x0039 }
        if (r0 == 0) goto L_0x0039;	 Catch:{ Exception -> 0x0039 }
    L_0x0011:
        r0 = new com.google.android.gms.internal.zzas;	 Catch:{ Exception -> 0x0039 }
        r0.<init>();	 Catch:{ Exception -> 0x0039 }
        r1 = r2.zzagk;	 Catch:{ Exception -> 0x0039 }
        r1 = r1.zzaif;	 Catch:{ Exception -> 0x0039 }
        r1 = r1.getPackageName();	 Catch:{ Exception -> 0x0039 }
        r0.zzch = r1;	 Catch:{ Exception -> 0x0039 }
        r5 = java.lang.Long.valueOf(r5);	 Catch:{ Exception -> 0x0039 }
        r0.zzci = r5;	 Catch:{ Exception -> 0x0039 }
        r5 = zzagm;	 Catch:{ Exception -> 0x0039 }
        r6 = com.google.android.gms.internal.zzfhs.zzc(r0);	 Catch:{ Exception -> 0x0039 }
        r5 = r5.zzd(r6);	 Catch:{ Exception -> 0x0039 }
        r5.zzp(r4);	 Catch:{ Exception -> 0x0039 }
        r5.zzq(r3);	 Catch:{ Exception -> 0x0039 }
        r5.zzbf();	 Catch:{ Exception -> 0x0039 }
    L_0x0039:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzcm.zza(int, int, long):void");
    }
}
