package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzba;
import java.util.concurrent.Future;

@zzzb
public final class zzxn extends zzafh {
    private final Object mLock;
    private final zzxg zzchu;
    private final zzaev zzchv;
    private final zzaad zzchw;
    private final zzxr zzcil;
    private Future<zzaeu> zzcim;

    public zzxn(Context context, zzba zzba, zzaev zzaev, zzcs zzcs, zzxg zzxg, zznd zznd) {
        this(zzaev, zzxg, new zzxr(context, zzba, new zzahy(context), zzcs, zzaev, zznd));
    }

    private zzxn(zzaev zzaev, zzxg zzxg, zzxr zzxr) {
        this.mLock = new Object();
        this.zzchv = zzaev;
        this.zzchw = zzaev.zzcwe;
        this.zzchu = zzxg;
        this.zzcil = zzxr;
    }

    public final void onStop() {
        synchronized (this.mLock) {
            if (this.zzcim != null) {
                this.zzcim.cancel(true);
            }
        }
    }

    public final void zzdg() {
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
        r53 = this;
        r1 = r53;
        r2 = 0;
        r3 = 0;
        r4 = r1.mLock;	 Catch:{ TimeoutException -> 0x0029, ExecutionException -> 0x0027, ExecutionException -> 0x0027, ExecutionException -> 0x0027 }
        monitor-enter(r4);	 Catch:{ TimeoutException -> 0x0029, ExecutionException -> 0x0027, ExecutionException -> 0x0027, ExecutionException -> 0x0027 }
        r5 = r1.zzcil;	 Catch:{ all -> 0x0023 }
        r6 = com.google.android.gms.internal.zzagl.zzcyx;	 Catch:{ all -> 0x0023 }
        r5 = com.google.android.gms.internal.zzagl.zza(r6, r5);	 Catch:{ all -> 0x0023 }
        r1.zzcim = r5;	 Catch:{ all -> 0x0023 }
        monitor-exit(r4);	 Catch:{ all -> 0x0023 }
        r4 = r1.zzcim;	 Catch:{ TimeoutException -> 0x0029, ExecutionException -> 0x0027, ExecutionException -> 0x0027, ExecutionException -> 0x0027 }
        r5 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;	 Catch:{ TimeoutException -> 0x0029, ExecutionException -> 0x0027, ExecutionException -> 0x0027, ExecutionException -> 0x0027 }
        r7 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ TimeoutException -> 0x0029, ExecutionException -> 0x0027, ExecutionException -> 0x0027, ExecutionException -> 0x0027 }
        r4 = r4.get(r5, r7);	 Catch:{ TimeoutException -> 0x0029, ExecutionException -> 0x0027, ExecutionException -> 0x0027, ExecutionException -> 0x0027 }
        r4 = (com.google.android.gms.internal.zzaeu) r4;	 Catch:{ TimeoutException -> 0x0029, ExecutionException -> 0x0027, ExecutionException -> 0x0027, ExecutionException -> 0x0027 }
        r2 = -2;
        r3 = r4;
        r8 = -2;
        goto L_0x0036;
    L_0x0023:
        r0 = move-exception;
        r5 = r0;
        monitor-exit(r4);	 Catch:{ all -> 0x0023 }
        throw r5;	 Catch:{ TimeoutException -> 0x0029, ExecutionException -> 0x0027, ExecutionException -> 0x0027, ExecutionException -> 0x0027 }
    L_0x0027:
        r8 = 0;
        goto L_0x0036;
    L_0x0029:
        r2 = "Timed out waiting for native ad.";
        com.google.android.gms.internal.zzaiw.zzco(r2);
        r2 = 2;
        r4 = r1.zzcim;
        r5 = 1;
        r4.cancel(r5);
        r8 = 2;
    L_0x0036:
        if (r3 == 0) goto L_0x003b;
    L_0x0038:
        r2 = r3;
        goto L_0x00ce;
    L_0x003b:
        r2 = new com.google.android.gms.internal.zzaeu;
        r3 = r1.zzchv;
        r3 = r3.zzcpe;
        r5 = r3.zzclo;
        r3 = r1.zzchw;
        r11 = r3.orientation;
        r3 = r1.zzchw;
        r12 = r3.zzccb;
        r3 = r1.zzchv;
        r3 = r3.zzcpe;
        r14 = r3.zzclr;
        r16 = 0;
        r17 = 0;
        r18 = 0;
        r19 = 0;
        r20 = 0;
        r3 = r1.zzchw;
        r3 = r3.zzcnh;
        r15 = r1.zzchv;
        r15 = r15.zzath;
        r10 = r1.zzchw;
        r44 = r11;
        r10 = r10.zzcnf;
        r9 = r1.zzchv;
        r45 = r10;
        r10 = r9.zzcvw;
        r9 = r1.zzchw;
        r47 = r10;
        r10 = r9.zzcnk;
        r9 = r1.zzchw;
        r9 = r9.zzcnl;
        r7 = r1.zzchv;
        r7 = r7.zzcvq;
        r32 = 0;
        r33 = 0;
        r34 = 0;
        r35 = 0;
        r6 = r1.zzchv;
        r6 = r6.zzcwe;
        r6 = r6.zzcny;
        r49 = r3;
        r3 = r1.zzchv;
        r3 = r3.zzcwe;
        r3 = r3.zzcnz;
        r38 = 0;
        r39 = 0;
        r4 = r1.zzchw;
        r4 = r4.zzcoc;
        r51 = r4;
        r4 = r1.zzchv;
        r4 = r4.zzcwc;
        r52 = r4;
        r4 = r1.zzchv;
        r4 = r4.zzcwe;
        r4 = r4.zzapy;
        r43 = 0;
        r42 = r4;
        r21 = r49;
        r40 = r51;
        r41 = r52;
        r4 = r2;
        r36 = r6;
        r6 = 0;
        r31 = r7;
        r7 = 0;
        r30 = r9;
        r9 = 0;
        r28 = r10;
        r24 = r45;
        r26 = r47;
        r10 = 0;
        r11 = r44;
        r23 = r15;
        r15 = 0;
        r37 = r3;
        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r23, r24, r26, r28, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43);
    L_0x00ce:
        r3 = com.google.android.gms.internal.zzagr.zzczc;
        r4 = new com.google.android.gms.internal.zzxo;
        r4.<init>(r1, r2);
        r3.post(r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzxn.zzdg():void");
    }
}
