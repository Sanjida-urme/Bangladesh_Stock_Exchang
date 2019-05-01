package com.google.android.gms.internal;

import com.google.android.gms.internal.zzid.zza.zzb;

@zzzb
public final class zzib {
    private final zzig zzban;
    private final zzil zzbao;
    private final boolean zzbap;

    private zzib() {
        this.zzbap = false;
        this.zzban = new zzig();
        this.zzbao = new zzil();
        zzhj();
    }

    public zzib(zzig zzig, boolean z) {
        this.zzban = zzig;
        this.zzbap = z;
        this.zzbao = new zzil();
        zzhj();
    }

    public static zzib zzhi() {
        return new zzib();
    }

    private final synchronized void zzhj() {
        this.zzbao.zzbbp = new zzij();
        this.zzbao.zzbbo = new zzik();
    }

    private static int[] zzhk() {
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
        r0 = com.google.android.gms.internal.zzmq.zzir();
        r1 = new java.util.ArrayList;
        r1.<init>();
        r0 = r0.iterator();
    L_0x000d:
        r2 = r0.hasNext();
        r3 = 0;
        if (r2 == 0) goto L_0x0035;
    L_0x0014:
        r2 = r0.next();
        r2 = (java.lang.String) r2;
        r4 = ",";
        r2 = r2.split(r4);
        r4 = r2.length;
    L_0x0021:
        if (r3 >= r4) goto L_0x000d;
    L_0x0023:
        r5 = r2[r3];
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ NumberFormatException -> 0x002d }
        r1.add(r5);	 Catch:{ NumberFormatException -> 0x002d }
        goto L_0x0032;
    L_0x002d:
        r5 = "Experiment ID is not a number";
        com.google.android.gms.internal.zzafj.m5v(r5);
    L_0x0032:
        r3 = r3 + 1;
        goto L_0x0021;
    L_0x0035:
        r0 = r1.size();
        r0 = new int[r0];
        r1 = (java.util.ArrayList) r1;
        r2 = r1.size();
        r4 = 0;
    L_0x0042:
        if (r3 >= r2) goto L_0x0055;
    L_0x0044:
        r5 = r1.get(r3);
        r3 = r3 + 1;
        r5 = (java.lang.Integer) r5;
        r5 = r5.intValue();
        r0[r4] = r5;
        r4 = r4 + 1;
        goto L_0x0042;
    L_0x0055:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzib.zzhk():int[]");
    }

    public final synchronized void zza(zzic zzic) {
        if (this.zzbap) {
            zzic.zza(this.zzbao);
        }
    }

    public final synchronized void zza(zzb zzb) {
        if (this.zzbap) {
            this.zzban.zzd(zzfhs.zzc(this.zzbao)).zzq(zzb.zzhn()).zzb(zzhk()).zzbf();
            String str = "Logging Event with event code : ";
            String valueOf = String.valueOf(Integer.toString(zzb.zzhn(), 10));
            zzafj.m5v(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }
}
