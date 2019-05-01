package com.google.android.gms.internal;

public final class zzar {
    public static com.google.android.gms.internal.zzs zza(android.content.Context r4, com.google.android.gms.internal.zzam r5) {
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
        r5 = new java.io.File;
        r0 = r4.getCacheDir();
        r1 = "volley";
        r5.<init>(r0, r1);
        r0 = "volley/0";
        r1 = r4.getPackageName();	 Catch:{ NameNotFoundException -> 0x003b }
        r4 = r4.getPackageManager();	 Catch:{ NameNotFoundException -> 0x003b }
        r2 = 0;	 Catch:{ NameNotFoundException -> 0x003b }
        r4 = r4.getPackageInfo(r1, r2);	 Catch:{ NameNotFoundException -> 0x003b }
        r4 = r4.versionCode;	 Catch:{ NameNotFoundException -> 0x003b }
        r2 = java.lang.String.valueOf(r1);	 Catch:{ NameNotFoundException -> 0x003b }
        r2 = r2.length();	 Catch:{ NameNotFoundException -> 0x003b }
        r2 = r2 + 12;	 Catch:{ NameNotFoundException -> 0x003b }
        r3 = new java.lang.StringBuilder;	 Catch:{ NameNotFoundException -> 0x003b }
        r3.<init>(r2);	 Catch:{ NameNotFoundException -> 0x003b }
        r3.append(r1);	 Catch:{ NameNotFoundException -> 0x003b }
        r1 = "/";	 Catch:{ NameNotFoundException -> 0x003b }
        r3.append(r1);	 Catch:{ NameNotFoundException -> 0x003b }
        r3.append(r4);	 Catch:{ NameNotFoundException -> 0x003b }
        r4 = r3.toString();	 Catch:{ NameNotFoundException -> 0x003b }
        goto L_0x003c;
    L_0x003b:
        r4 = r0;
    L_0x003c:
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 9;
        if (r0 < r1) goto L_0x0048;
    L_0x0042:
        r4 = new com.google.android.gms.internal.zzan;
        r4.<init>();
        goto L_0x0052;
    L_0x0048:
        r0 = new com.google.android.gms.internal.zzaj;
        r4 = android.net.http.AndroidHttpClient.newInstance(r4);
        r0.<init>(r4);
        r4 = r0;
    L_0x0052:
        r0 = new com.google.android.gms.internal.zzad;
        r0.<init>(r4);
        r4 = new com.google.android.gms.internal.zzs;
        r1 = new com.google.android.gms.internal.zzag;
        r1.<init>(r5);
        r4.<init>(r1, r0);
        r4.start();
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzar.zza(android.content.Context, com.google.android.gms.internal.zzam):com.google.android.gms.internal.zzs");
    }
}
