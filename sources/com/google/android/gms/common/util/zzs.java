package com.google.android.gms.common.util;

import android.os.Process;

public final class zzs {
    private static String zzgcj;
    private static final int zzgck = Process.myPid();

    public static String zzamd() {
        if (zzgcj == null) {
            zzgcj = zzck(zzgck);
        }
        return zzgcj;
    }

    private static java.lang.String zzck(int r6) {
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
        r0 = 0;
        if (r6 > 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = android.os.StrictMode.allowThreadDiskReads();	 Catch:{ IOException -> 0x0046, all -> 0x0041 }
        r2 = new java.io.BufferedReader;	 Catch:{ all -> 0x003c }
        r3 = new java.io.FileReader;	 Catch:{ all -> 0x003c }
        r4 = 25;	 Catch:{ all -> 0x003c }
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x003c }
        r5.<init>(r4);	 Catch:{ all -> 0x003c }
        r4 = "/proc/";	 Catch:{ all -> 0x003c }
        r5.append(r4);	 Catch:{ all -> 0x003c }
        r5.append(r6);	 Catch:{ all -> 0x003c }
        r6 = "/cmdline";	 Catch:{ all -> 0x003c }
        r5.append(r6);	 Catch:{ all -> 0x003c }
        r6 = r5.toString();	 Catch:{ all -> 0x003c }
        r3.<init>(r6);	 Catch:{ all -> 0x003c }
        r2.<init>(r3);	 Catch:{ all -> 0x003c }
        android.os.StrictMode.setThreadPolicy(r1);	 Catch:{ IOException -> 0x0047, all -> 0x0039 }
        r6 = r2.readLine();	 Catch:{ IOException -> 0x0047, all -> 0x0039 }
        r6 = r6.trim();	 Catch:{ IOException -> 0x0047, all -> 0x0039 }
        com.google.android.gms.common.util.zzn.closeQuietly(r2);
        return r6;
    L_0x0039:
        r6 = move-exception;
        r0 = r2;
        goto L_0x0042;
    L_0x003c:
        r6 = move-exception;
        android.os.StrictMode.setThreadPolicy(r1);	 Catch:{ IOException -> 0x0046, all -> 0x0041 }
        throw r6;	 Catch:{ IOException -> 0x0046, all -> 0x0041 }
    L_0x0041:
        r6 = move-exception;
    L_0x0042:
        com.google.android.gms.common.util.zzn.closeQuietly(r0);
        throw r6;
    L_0x0046:
        r2 = r0;
    L_0x0047:
        com.google.android.gms.common.util.zzn.closeQuietly(r2);
        r6 = r0;
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.zzs.zzck(int):java.lang.String");
    }
}
