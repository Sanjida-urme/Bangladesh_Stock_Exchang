package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;

@zzzb
public final class zzafd {
    private final Object mLock = new Object();
    private String mSessionId;
    int zzcxo = -1;
    private long zzcxz = -1;
    private long zzcya = -1;
    private int zzcyb = -1;
    private long zzcyc = 0;
    private int zzcyd = 0;
    private int zzcye = 0;

    public zzafd(String str) {
        this.mSessionId = str;
    }

    private static boolean zzae(android.content.Context r5) {
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
        r0 = r5.getResources();
        r1 = "Theme.Translucent";
        r2 = "style";
        r3 = "android";
        r0 = r0.getIdentifier(r1, r2, r3);
        r1 = 0;
        if (r0 != 0) goto L_0x0017;
    L_0x0011:
        r5 = "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.";
        com.google.android.gms.internal.zzaiw.zzcn(r5);
        return r1;
    L_0x0017:
        r2 = new android.content.ComponentName;
        r3 = r5.getPackageName();
        r4 = "com.google.android.gms.ads.AdActivity";
        r2.<init>(r3, r4);
        r5 = r5.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0036 }
        r5 = r5.getActivityInfo(r2, r1);	 Catch:{ NameNotFoundException -> 0x0036 }
        r5 = r5.theme;	 Catch:{ NameNotFoundException -> 0x0036 }
        if (r0 != r5) goto L_0x0030;	 Catch:{ NameNotFoundException -> 0x0036 }
    L_0x002e:
        r5 = 1;	 Catch:{ NameNotFoundException -> 0x0036 }
        return r5;	 Catch:{ NameNotFoundException -> 0x0036 }
    L_0x0030:
        r5 = "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.";	 Catch:{ NameNotFoundException -> 0x0036 }
        com.google.android.gms.internal.zzaiw.zzcn(r5);	 Catch:{ NameNotFoundException -> 0x0036 }
        return r1;
    L_0x0036:
        r5 = "Fail to fetch AdActivity theme";
        com.google.android.gms.internal.zzaiw.zzco(r5);
        goto L_0x0011;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzafd.zzae(android.content.Context):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzb(com.google.android.gms.internal.zzis r11, long r12) {
        /*
        r10 = this;
        r0 = r10.mLock;
        monitor-enter(r0);
        r1 = com.google.android.gms.ads.internal.zzbs.zzeg();	 Catch:{ all -> 0x0082 }
        r1 = r1.zzpc();	 Catch:{ all -> 0x0082 }
        r3 = com.google.android.gms.ads.internal.zzbs.zzei();	 Catch:{ all -> 0x0082 }
        r3 = r3.currentTimeMillis();	 Catch:{ all -> 0x0082 }
        r5 = r10.zzcya;	 Catch:{ all -> 0x0082 }
        r7 = -1;
        r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r9 != 0) goto L_0x0043;
    L_0x001b:
        r5 = r3 - r1;
        r1 = com.google.android.gms.internal.zzmq.zzbjs;	 Catch:{ all -> 0x0082 }
        r2 = com.google.android.gms.ads.internal.zzbs.zzep();	 Catch:{ all -> 0x0082 }
        r1 = r2.zzd(r1);	 Catch:{ all -> 0x0082 }
        r1 = (java.lang.Long) r1;	 Catch:{ all -> 0x0082 }
        r1 = r1.longValue();	 Catch:{ all -> 0x0082 }
        r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1));
        if (r7 <= 0) goto L_0x0035;
    L_0x0031:
        r1 = -1;
        r10.zzcxo = r1;	 Catch:{ all -> 0x0082 }
        goto L_0x003f;
    L_0x0035:
        r1 = com.google.android.gms.ads.internal.zzbs.zzeg();	 Catch:{ all -> 0x0082 }
        r1 = r1.zzpf();	 Catch:{ all -> 0x0082 }
        r10.zzcxo = r1;	 Catch:{ all -> 0x0082 }
    L_0x003f:
        r10.zzcya = r12;	 Catch:{ all -> 0x0082 }
        r12 = r10.zzcya;	 Catch:{ all -> 0x0082 }
    L_0x0043:
        r10.zzcxz = r12;	 Catch:{ all -> 0x0082 }
        r12 = 1;
        if (r11 == 0) goto L_0x0059;
    L_0x0048:
        r13 = r11.extras;	 Catch:{ all -> 0x0082 }
        if (r13 == 0) goto L_0x0059;
    L_0x004c:
        r11 = r11.extras;	 Catch:{ all -> 0x0082 }
        r13 = "gw";
        r1 = 2;
        r11 = r11.getInt(r13, r1);	 Catch:{ all -> 0x0082 }
        if (r11 != r12) goto L_0x0059;
    L_0x0057:
        monitor-exit(r0);	 Catch:{ all -> 0x0082 }
        return;
    L_0x0059:
        r11 = r10.zzcyb;	 Catch:{ all -> 0x0082 }
        r11 = r11 + r12;
        r10.zzcyb = r11;	 Catch:{ all -> 0x0082 }
        r11 = r10.zzcxo;	 Catch:{ all -> 0x0082 }
        r11 = r11 + r12;
        r10.zzcxo = r11;	 Catch:{ all -> 0x0082 }
        r11 = r10.zzcxo;	 Catch:{ all -> 0x0082 }
        if (r11 != 0) goto L_0x0073;
    L_0x0067:
        r11 = 0;
        r10.zzcyc = r11;	 Catch:{ all -> 0x0082 }
        r11 = com.google.android.gms.ads.internal.zzbs.zzeg();	 Catch:{ all -> 0x0082 }
        r11.zzj(r3);	 Catch:{ all -> 0x0082 }
        goto L_0x0080;
    L_0x0073:
        r11 = com.google.android.gms.ads.internal.zzbs.zzeg();	 Catch:{ all -> 0x0082 }
        r11 = r11.zzpd();	 Catch:{ all -> 0x0082 }
        r13 = 0;
        r1 = r3 - r11;
        r10.zzcyc = r1;	 Catch:{ all -> 0x0082 }
    L_0x0080:
        monitor-exit(r0);	 Catch:{ all -> 0x0082 }
        return;
    L_0x0082:
        r11 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0082 }
        throw r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzafd.zzb(com.google.android.gms.internal.zzis, long):void");
    }

    public final Bundle zzl(Context context, String str) {
        Bundle bundle;
        synchronized (this.mLock) {
            bundle = new Bundle();
            bundle.putString("session_id", this.mSessionId);
            bundle.putLong("basets", this.zzcya);
            bundle.putLong("currts", this.zzcxz);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.zzcyb);
            bundle.putInt("preqs_in_session", this.zzcxo);
            bundle.putLong("time_in_session", this.zzcyc);
            bundle.putInt("pclick", this.zzcyd);
            bundle.putInt("pimp", this.zzcye);
            bundle.putBoolean("support_transparent_background", zzae(context));
        }
        return bundle;
    }

    public final void zzoi() {
        synchronized (this.mLock) {
            this.zzcye++;
        }
    }

    public final void zzoj() {
        synchronized (this.mLock) {
            this.zzcyd++;
        }
    }
}
