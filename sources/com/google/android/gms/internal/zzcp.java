package com.google.android.gms.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.zzbs;
import java.util.LinkedList;

public abstract class zzcp implements zzco {
    protected MotionEvent zzagq;
    protected LinkedList<MotionEvent> zzagr = new LinkedList();
    protected long zzags = 0;
    protected long zzagt = 0;
    protected long zzagu = 0;
    protected long zzagv = 0;
    protected long zzagw = 0;
    protected long zzagx = 0;
    protected long zzagy = 0;
    protected double zzagz;
    private double zzaha;
    private double zzahb;
    protected float zzahc;
    protected float zzahd;
    protected float zzahe;
    protected float zzahf;
    private boolean zzahg = false;
    protected boolean zzahh = false;
    protected DisplayMetrics zzahi;

    protected zzcp(android.content.Context r3) {
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
        r2.<init>();
        r0 = new java.util.LinkedList;
        r0.<init>();
        r2.zzagr = r0;
        r0 = 0;
        r2.zzags = r0;
        r2.zzagt = r0;
        r2.zzagu = r0;
        r2.zzagv = r0;
        r2.zzagw = r0;
        r2.zzagx = r0;
        r2.zzagy = r0;
        r0 = 0;
        r2.zzahg = r0;
        r2.zzahh = r0;
        r0 = com.google.android.gms.internal.zzmq.zzbmc;	 Catch:{ Throwable -> 0x0042 }
        r1 = com.google.android.gms.ads.internal.zzbs.zzep();	 Catch:{ Throwable -> 0x0042 }
        r0 = r1.zzd(r0);	 Catch:{ Throwable -> 0x0042 }
        r0 = (java.lang.Boolean) r0;	 Catch:{ Throwable -> 0x0042 }
        r0 = r0.booleanValue();	 Catch:{ Throwable -> 0x0042 }
        if (r0 == 0) goto L_0x0035;	 Catch:{ Throwable -> 0x0042 }
    L_0x0031:
        com.google.android.gms.internal.zzbt.zzx();	 Catch:{ Throwable -> 0x0042 }
        goto L_0x0038;	 Catch:{ Throwable -> 0x0042 }
    L_0x0035:
        com.google.android.gms.internal.zzbw.zzz();	 Catch:{ Throwable -> 0x0042 }
    L_0x0038:
        r3 = r3.getResources();	 Catch:{ Throwable -> 0x0042 }
        r3 = r3.getDisplayMetrics();	 Catch:{ Throwable -> 0x0042 }
        r2.zzahi = r3;	 Catch:{ Throwable -> 0x0042 }
    L_0x0042:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzcp.<init>(android.content.Context):void");
    }

    private final java.lang.String zza(android.content.Context r1, java.lang.String r2, boolean r3, android.view.View r4, byte[] r5) {
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
        r0 = this;
        if (r3 == 0) goto L_0x000a;
    L_0x0002:
        r1 = r0.zza(r1, r4);	 Catch:{ GeneralSecurityException -> 0x0025, GeneralSecurityException -> 0x0025, Throwable -> 0x0023 }
        r3 = 1;	 Catch:{ GeneralSecurityException -> 0x0025, GeneralSecurityException -> 0x0025, Throwable -> 0x0023 }
        r0.zzahg = r3;	 Catch:{ GeneralSecurityException -> 0x0025, GeneralSecurityException -> 0x0025, Throwable -> 0x0023 }
        goto L_0x000f;	 Catch:{ GeneralSecurityException -> 0x0025, GeneralSecurityException -> 0x0025, Throwable -> 0x0023 }
    L_0x000a:
        r3 = 0;	 Catch:{ GeneralSecurityException -> 0x0025, GeneralSecurityException -> 0x0025, Throwable -> 0x0023 }
        r1 = r0.zza(r1, r3);	 Catch:{ GeneralSecurityException -> 0x0025, GeneralSecurityException -> 0x0025, Throwable -> 0x0023 }
    L_0x000f:
        if (r1 == 0) goto L_0x001d;	 Catch:{ GeneralSecurityException -> 0x0025, GeneralSecurityException -> 0x0025, Throwable -> 0x0023 }
    L_0x0011:
        r3 = r1.zzhl();	 Catch:{ GeneralSecurityException -> 0x0025, GeneralSecurityException -> 0x0025, Throwable -> 0x0023 }
        if (r3 != 0) goto L_0x0018;	 Catch:{ GeneralSecurityException -> 0x0025, GeneralSecurityException -> 0x0025, Throwable -> 0x0023 }
    L_0x0017:
        goto L_0x001d;	 Catch:{ GeneralSecurityException -> 0x0025, GeneralSecurityException -> 0x0025, Throwable -> 0x0023 }
    L_0x0018:
        r1 = com.google.android.gms.internal.zzbt.zza(r1, r2);	 Catch:{ GeneralSecurityException -> 0x0025, GeneralSecurityException -> 0x0025, Throwable -> 0x0023 }
        return r1;	 Catch:{ GeneralSecurityException -> 0x0025, GeneralSecurityException -> 0x0025, Throwable -> 0x0023 }
    L_0x001d:
        r1 = 5;	 Catch:{ GeneralSecurityException -> 0x0025, GeneralSecurityException -> 0x0025, Throwable -> 0x0023 }
        r1 = java.lang.Integer.toString(r1);	 Catch:{ GeneralSecurityException -> 0x0025, GeneralSecurityException -> 0x0025, Throwable -> 0x0023 }
        return r1;
    L_0x0023:
        r1 = 3;
        goto L_0x0026;
    L_0x0025:
        r1 = 7;
    L_0x0026:
        r1 = java.lang.Integer.toString(r1);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzcp.zza(android.content.Context, java.lang.String, boolean, android.view.View, byte[]):java.lang.String");
    }

    protected abstract long zza(StackTraceElement[] stackTraceElementArr) throws zzcx;

    protected abstract zzaw zza(Context context, View view);

    protected abstract zzaw zza(Context context, zzat zzat);

    public final String zza(Context context) {
        if (zzdf.zzas()) {
            if (((Boolean) zzbs.zzep().zzd(zzmq.zzbme)).booleanValue()) {
                throw new IllegalStateException("The caller must not be called from the UI thread.");
            }
        }
        return zza(context, null, false, null, null);
    }

    public final String zza(Context context, String str, View view) {
        return zza(context, str, true, view, null);
    }

    public final void zza(int i, int i2, int i3) {
        MotionEvent obtain;
        if (this.zzagq != null) {
            r0.zzagq.recycle();
        }
        if (r0.zzahi != null) {
            obtain = MotionEvent.obtain(0, (long) i3, 1, r0.zzahi.density * ((float) i), r0.zzahi.density * ((float) i2), 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            obtain = null;
        }
        r0.zzagq = obtain;
        r0.zzahh = false;
    }

    public final void zza(android.view.MotionEvent r13) {
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
        r12 = this;
        r0 = r12.zzahg;
        r1 = 0;
        if (r0 == 0) goto L_0x0035;
    L_0x0005:
        r2 = 0;
        r12.zzagv = r2;
        r12.zzagu = r2;
        r12.zzagt = r2;
        r12.zzags = r2;
        r12.zzagw = r2;
        r12.zzagy = r2;
        r12.zzagx = r2;
        r0 = r12.zzagr;
        r0 = r0.iterator();
    L_0x001b:
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x002b;
    L_0x0021:
        r2 = r0.next();
        r2 = (android.view.MotionEvent) r2;
        r2.recycle();
        goto L_0x001b;
    L_0x002b:
        r0 = r12.zzagr;
        r0.clear();
        r0 = 0;
        r12.zzagq = r0;
        r12.zzahg = r1;
    L_0x0035:
        r0 = r13.getAction();
        switch(r0) {
            case 0: goto L_0x0062;
            case 1: goto L_0x003d;
            case 2: goto L_0x003d;
            default: goto L_0x003c;
        };
    L_0x003c:
        goto L_0x0074;
    L_0x003d:
        r0 = r13.getRawX();
        r2 = (double) r0;
        r0 = r13.getRawY();
        r4 = (double) r0;
        r6 = r12.zzaha;
        r6 = r2 - r6;
        r8 = r12.zzahb;
        r8 = r4 - r8;
        r10 = r12.zzagz;
        r6 = r6 * r6;
        r8 = r8 * r8;
        r6 = r6 + r8;
        r6 = java.lang.Math.sqrt(r6);
        r10 = r10 + r6;
        r12.zzagz = r10;
        r12.zzaha = r2;
        r12.zzahb = r4;
        goto L_0x0074;
    L_0x0062:
        r2 = 0;
        r12.zzagz = r2;
        r0 = r13.getRawX();
        r2 = (double) r0;
        r12.zzaha = r2;
        r0 = r13.getRawY();
        r2 = (double) r0;
        r12.zzahb = r2;
    L_0x0074:
        r0 = r13.getAction();
        r2 = 1;
        r4 = 1;
        switch(r0) {
            case 0: goto L_0x011a;
            case 1: goto L_0x00e3;
            case 2: goto L_0x0088;
            case 3: goto L_0x0080;
            default: goto L_0x007e;
        };
    L_0x007e:
        goto L_0x014a;
    L_0x0080:
        r0 = r12.zzagv;
        r5 = r0 + r2;
        r12.zzagv = r5;
        goto L_0x014a;
    L_0x0088:
        r2 = r12.zzagt;
        r0 = r13.getHistorySize();
        r0 = r0 + r4;
        r5 = (long) r0;
        r7 = r2 + r5;
        r12.zzagt = r7;
        r13 = r12.zzb(r13);	 Catch:{ zzcx -> 0x014a }
        if (r13 == 0) goto L_0x00a4;	 Catch:{ zzcx -> 0x014a }
    L_0x009a:
        r0 = r13.zzff;	 Catch:{ zzcx -> 0x014a }
        if (r0 == 0) goto L_0x00a4;	 Catch:{ zzcx -> 0x014a }
    L_0x009e:
        r0 = r13.zzajd;	 Catch:{ zzcx -> 0x014a }
        if (r0 == 0) goto L_0x00a4;	 Catch:{ zzcx -> 0x014a }
    L_0x00a2:
        r0 = 1;	 Catch:{ zzcx -> 0x014a }
        goto L_0x00a5;	 Catch:{ zzcx -> 0x014a }
    L_0x00a4:
        r0 = 0;	 Catch:{ zzcx -> 0x014a }
    L_0x00a5:
        if (r0 == 0) goto L_0x00bc;	 Catch:{ zzcx -> 0x014a }
    L_0x00a7:
        r2 = r12.zzagx;	 Catch:{ zzcx -> 0x014a }
        r0 = r13.zzff;	 Catch:{ zzcx -> 0x014a }
        r5 = r0.longValue();	 Catch:{ zzcx -> 0x014a }
        r0 = r13.zzajd;	 Catch:{ zzcx -> 0x014a }
        r7 = r0.longValue();	 Catch:{ zzcx -> 0x014a }
        r0 = 0;	 Catch:{ zzcx -> 0x014a }
        r9 = r5 + r7;	 Catch:{ zzcx -> 0x014a }
        r5 = r2 + r9;	 Catch:{ zzcx -> 0x014a }
        r12.zzagx = r5;	 Catch:{ zzcx -> 0x014a }
    L_0x00bc:
        r0 = r12.zzahi;	 Catch:{ zzcx -> 0x014a }
        if (r0 == 0) goto L_0x00cb;	 Catch:{ zzcx -> 0x014a }
    L_0x00c0:
        if (r13 == 0) goto L_0x00cb;	 Catch:{ zzcx -> 0x014a }
    L_0x00c2:
        r0 = r13.zzfd;	 Catch:{ zzcx -> 0x014a }
        if (r0 == 0) goto L_0x00cb;	 Catch:{ zzcx -> 0x014a }
    L_0x00c6:
        r0 = r13.zzaje;	 Catch:{ zzcx -> 0x014a }
        if (r0 == 0) goto L_0x00cb;	 Catch:{ zzcx -> 0x014a }
    L_0x00ca:
        r1 = 1;	 Catch:{ zzcx -> 0x014a }
    L_0x00cb:
        if (r1 == 0) goto L_0x014a;	 Catch:{ zzcx -> 0x014a }
    L_0x00cd:
        r0 = r12.zzagy;	 Catch:{ zzcx -> 0x014a }
        r2 = r13.zzfd;	 Catch:{ zzcx -> 0x014a }
        r2 = r2.longValue();	 Catch:{ zzcx -> 0x014a }
        r13 = r13.zzaje;	 Catch:{ zzcx -> 0x014a }
        r5 = r13.longValue();	 Catch:{ zzcx -> 0x014a }
        r13 = 0;	 Catch:{ zzcx -> 0x014a }
        r7 = r2 + r5;	 Catch:{ zzcx -> 0x014a }
        r2 = r0 + r7;	 Catch:{ zzcx -> 0x014a }
        r12.zzagy = r2;	 Catch:{ zzcx -> 0x014a }
        goto L_0x014a;
    L_0x00e3:
        r13 = android.view.MotionEvent.obtain(r13);
        r12.zzagq = r13;
        r13 = r12.zzagr;
        r0 = r12.zzagq;
        r13.add(r0);
        r13 = r12.zzagr;
        r13 = r13.size();
        r0 = 6;
        if (r13 <= r0) goto L_0x0104;
    L_0x00f9:
        r13 = r12.zzagr;
        r13 = r13.remove();
        r13 = (android.view.MotionEvent) r13;
        r13.recycle();
    L_0x0104:
        r0 = r12.zzagu;
        r5 = r0 + r2;
        r12.zzagu = r5;
        r13 = new java.lang.Throwable;	 Catch:{ zzcx -> 0x014a }
        r13.<init>();	 Catch:{ zzcx -> 0x014a }
        r13 = r13.getStackTrace();	 Catch:{ zzcx -> 0x014a }
        r0 = r12.zza(r13);	 Catch:{ zzcx -> 0x014a }
        r12.zzagw = r0;	 Catch:{ zzcx -> 0x014a }
        goto L_0x014a;
    L_0x011a:
        r0 = com.google.android.gms.internal.zzmq.zzblz;
        r1 = com.google.android.gms.ads.internal.zzbs.zzep();
        r0 = r1.zzd(r0);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x0144;
    L_0x012c:
        r0 = r13.getX();
        r12.zzahc = r0;
        r0 = r13.getY();
        r12.zzahd = r0;
        r0 = r13.getRawX();
        r12.zzahe = r0;
        r13 = r13.getRawY();
        r12.zzahf = r13;
    L_0x0144:
        r0 = r12.zzags;
        r5 = r0 + r2;
        r12.zzags = r5;
    L_0x014a:
        r12.zzahh = r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzcp.zza(android.view.MotionEvent):void");
    }

    protected abstract zzde zzb(MotionEvent motionEvent) throws zzcx;
}
