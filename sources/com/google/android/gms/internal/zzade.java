package com.google.android.gms.internal;

import android.content.Context;

@zzzb
public final class zzade extends zzafh implements zzadk, zzadn {
    private final Context mContext;
    private int mErrorCode = 3;
    private final Object mLock;
    private final String zzcco;
    private final zzaev zzchv;
    private final zzadr zzctm;
    private final zzadn zzctn;
    private final String zzcto;
    private final zztm zzctp;
    private final long zzctq;
    private int zzctr = 0;
    private zzadh zzcts;

    public zzade(Context context, String str, String str2, zztm zztm, zzaev zzaev, zzadr zzadr, zzadn zzadn, long j) {
        this.mContext = context;
        this.zzcco = str;
        this.zzcto = str2;
        this.zzctp = zztm;
        this.zzchv = zzaev;
        this.zzctm = zzadr;
        this.mLock = new Object();
        this.zzctn = zzadn;
        this.zzctq = j;
    }

    private final void zza(zzis zzis, zzuf zzuf) {
        this.zzctm.zzod().zza((zzadn) this);
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.zzcco)) {
                zzuf.zza(zzis, this.zzcto, this.zzctp.zzcbb);
            } else {
                zzuf.zzc(zzis, this.zzcto);
            }
        } catch (Throwable e) {
            zzaiw.zzc("Fail to load ad from adapter.", e);
            zza(this.zzcco, 0);
        }
    }

    private final boolean zze(long r7) {
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
        r6 = this;
        r0 = r6.zzctq;
        r2 = com.google.android.gms.ads.internal.zzbs.zzei();
        r2 = r2.elapsedRealtime();
        r4 = r2 - r7;
        r7 = r0 - r4;
        r0 = 0;
        r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1));
        r0 = 0;
        if (r2 > 0) goto L_0x0019;
    L_0x0015:
        r7 = 4;
    L_0x0016:
        r6.mErrorCode = r7;
        return r0;
    L_0x0019:
        r1 = r6.mLock;	 Catch:{ InterruptedException -> 0x0020 }
        r1.wait(r7);	 Catch:{ InterruptedException -> 0x0020 }
        r7 = 1;
        return r7;
    L_0x0020:
        r7 = java.lang.Thread.currentThread();
        r7.interrupt();
        r7 = 5;
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzade.zze(long):boolean");
    }

    public final void onStop() {
    }

    public final void zza(String str, int i) {
        synchronized (this.mLock) {
            this.zzctr = 2;
            this.mErrorCode = i;
            this.mLock.notify();
        }
    }

    public final void zzaa(int i) {
        zza(this.zzcco, 0);
    }

    public final void zzbq(String str) {
        synchronized (this.mLock) {
            this.zzctr = 1;
            this.mLock.notify();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzdg() {
        /*
        r11 = this;
        r0 = r11.zzctm;
        if (r0 == 0) goto L_0x00f0;
    L_0x0004:
        r0 = r11.zzctm;
        r0 = r0.zzod();
        if (r0 == 0) goto L_0x00f0;
    L_0x000c:
        r0 = r11.zzctm;
        r0 = r0.zzoc();
        if (r0 != 0) goto L_0x0015;
    L_0x0014:
        return;
    L_0x0015:
        r0 = r11.zzctm;
        r0 = r0.zzod();
        r1 = 0;
        r0.zza(r1);
        r0.zza(r11);
        r2 = r11.zzchv;
        r2 = r2.zzcpe;
        r2 = r2.zzclo;
        r3 = r11.zzctm;
        r3 = r3.zzoc();
        r4 = r3.isInitialized();	 Catch:{ RemoteException -> 0x0047 }
        if (r4 == 0) goto L_0x003f;
    L_0x0034:
        r4 = com.google.android.gms.internal.zzais.zzdbs;	 Catch:{ RemoteException -> 0x0047 }
        r5 = new com.google.android.gms.internal.zzadf;	 Catch:{ RemoteException -> 0x0047 }
        r5.<init>(r11, r2, r3);	 Catch:{ RemoteException -> 0x0047 }
    L_0x003b:
        r4.post(r5);	 Catch:{ RemoteException -> 0x0047 }
        goto L_0x0053;
    L_0x003f:
        r4 = com.google.android.gms.internal.zzais.zzdbs;	 Catch:{ RemoteException -> 0x0047 }
        r5 = new com.google.android.gms.internal.zzadg;	 Catch:{ RemoteException -> 0x0047 }
        r5.<init>(r11, r3, r2, r0);	 Catch:{ RemoteException -> 0x0047 }
        goto L_0x003b;
    L_0x0047:
        r2 = move-exception;
        r3 = "Fail to check if adapter is initialized.";
        com.google.android.gms.internal.zzaiw.zzc(r3, r2);
        r2 = r11.zzcco;
        r3 = 0;
        r11.zza(r2, r3);
    L_0x0053:
        r2 = com.google.android.gms.ads.internal.zzbs.zzei();
        r2 = r2.elapsedRealtime();
    L_0x005b:
        r4 = r11.mLock;
        monitor-enter(r4);
        r5 = r11.zzctr;	 Catch:{ all -> 0x00ed }
        r6 = 1;
        if (r5 == 0) goto L_0x0099;
    L_0x0063:
        r5 = new com.google.android.gms.internal.zzadj;	 Catch:{ all -> 0x00ed }
        r5.<init>();	 Catch:{ all -> 0x00ed }
        r7 = com.google.android.gms.ads.internal.zzbs.zzei();	 Catch:{ all -> 0x00ed }
        r7 = r7.elapsedRealtime();	 Catch:{ all -> 0x00ed }
        r9 = 0;
        r9 = r7 - r2;
        r2 = r5.zzf(r9);	 Catch:{ all -> 0x00ed }
        r3 = r11.zzctr;	 Catch:{ all -> 0x00ed }
        if (r6 != r3) goto L_0x007d;
    L_0x007b:
        r3 = 6;
        goto L_0x007f;
    L_0x007d:
        r3 = r11.mErrorCode;	 Catch:{ all -> 0x00ed }
    L_0x007f:
        r2 = r2.zzab(r3);	 Catch:{ all -> 0x00ed }
        r3 = r11.zzcco;	 Catch:{ all -> 0x00ed }
        r2 = r2.zzbr(r3);	 Catch:{ all -> 0x00ed }
        r3 = r11.zzctp;	 Catch:{ all -> 0x00ed }
        r3 = r3.zzcbe;	 Catch:{ all -> 0x00ed }
        r2 = r2.zzbs(r3);	 Catch:{ all -> 0x00ed }
        r2 = r2.zzoa();	 Catch:{ all -> 0x00ed }
        r11.zzcts = r2;	 Catch:{ all -> 0x00ed }
    L_0x0097:
        monitor-exit(r4);	 Catch:{ all -> 0x00ed }
        goto L_0x00ce;
    L_0x0099:
        r5 = r11.zze(r2);	 Catch:{ all -> 0x00ed }
        if (r5 != 0) goto L_0x00ea;
    L_0x009f:
        r5 = new com.google.android.gms.internal.zzadj;	 Catch:{ all -> 0x00ed }
        r5.<init>();	 Catch:{ all -> 0x00ed }
        r7 = r11.mErrorCode;	 Catch:{ all -> 0x00ed }
        r5 = r5.zzab(r7);	 Catch:{ all -> 0x00ed }
        r7 = com.google.android.gms.ads.internal.zzbs.zzei();	 Catch:{ all -> 0x00ed }
        r7 = r7.elapsedRealtime();	 Catch:{ all -> 0x00ed }
        r9 = 0;
        r9 = r7 - r2;
        r2 = r5.zzf(r9);	 Catch:{ all -> 0x00ed }
        r3 = r11.zzcco;	 Catch:{ all -> 0x00ed }
        r2 = r2.zzbr(r3);	 Catch:{ all -> 0x00ed }
        r3 = r11.zzctp;	 Catch:{ all -> 0x00ed }
        r3 = r3.zzcbe;	 Catch:{ all -> 0x00ed }
        r2 = r2.zzbs(r3);	 Catch:{ all -> 0x00ed }
        r2 = r2.zzoa();	 Catch:{ all -> 0x00ed }
        r11.zzcts = r2;	 Catch:{ all -> 0x00ed }
        goto L_0x0097;
    L_0x00ce:
        r0.zza(r1);
        r0.zza(r1);
        r0 = r11.zzctr;
        if (r0 != r6) goto L_0x00e0;
    L_0x00d8:
        r0 = r11.zzctn;
        r1 = r11.zzcco;
        r0.zzbq(r1);
        return;
    L_0x00e0:
        r0 = r11.zzctn;
        r1 = r11.zzcco;
        r2 = r11.mErrorCode;
        r0.zza(r1, r2);
        return;
    L_0x00ea:
        monitor-exit(r4);	 Catch:{ all -> 0x00ed }
        goto L_0x005b;
    L_0x00ed:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x00ed }
        throw r0;
    L_0x00f0:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzade.zzdg():void");
    }

    public final zzadh zznx() {
        zzadh zzadh;
        synchronized (this.mLock) {
            zzadh = this.zzcts;
        }
        return zzadh;
    }

    public final zztm zzny() {
        return this.zzctp;
    }

    public final void zznz() {
        zza(this.zzchv.zzcpe.zzclo, this.zzctm.zzoc());
    }
}
