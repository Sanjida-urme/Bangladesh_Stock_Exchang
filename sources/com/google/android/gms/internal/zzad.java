package com.google.android.gms.internal;

import java.util.Map;
import java.util.TreeMap;
import org.apache.http.Header;

public class zzad implements zzk {
    private static boolean DEBUG = zzab.DEBUG;
    private zzam zzbm;
    private zzae zzbn;

    public zzad(zzam zzam) {
        this(zzam, new zzae(4096));
    }

    private zzad(zzam zzam, zzae zzae) {
        this.zzbm = zzam;
        this.zzbn = zzae;
    }

    private static Map<String, String> zza(Header[] headerArr) {
        Map<String, String> treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < headerArr.length; i++) {
            treeMap.put(headerArr[i].getName(), headerArr[i].getValue());
        }
        return treeMap;
    }

    private static void zza(String str, zzp<?> zzp, zzaa zzaa) throws zzaa {
        zzx zzj = zzp.zzj();
        int zzi = zzp.zzi();
        try {
            zzj.zza(zzaa);
            zzp.zzb(String.format("%s-retry [timeout=%s]", new Object[]{str, Integer.valueOf(zzi)}));
        } catch (zzaa zzaa2) {
            zzp.zzb(String.format("%s-timeout-giveup [timeout=%s]", new Object[]{str, Integer.valueOf(zzi)}));
            throw zzaa2;
        }
    }

    private final byte[] zza(org.apache.http.HttpEntity r7) throws java.io.IOException, com.google.android.gms.internal.zzy {
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
        r6 = this;
        r0 = new com.google.android.gms.internal.zzap;
        r1 = r6.zzbn;
        r2 = r7.getContentLength();
        r2 = (int) r2;
        r0.<init>(r1, r2);
        r1 = 0;
        r2 = 0;
        r3 = r7.getContent();	 Catch:{ all -> 0x0048 }
        if (r3 != 0) goto L_0x001a;	 Catch:{ all -> 0x0048 }
    L_0x0014:
        r3 = new com.google.android.gms.internal.zzy;	 Catch:{ all -> 0x0048 }
        r3.<init>();	 Catch:{ all -> 0x0048 }
        throw r3;	 Catch:{ all -> 0x0048 }
    L_0x001a:
        r4 = r6.zzbn;	 Catch:{ all -> 0x0048 }
        r5 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;	 Catch:{ all -> 0x0048 }
        r4 = r4.zzb(r5);	 Catch:{ all -> 0x0048 }
    L_0x0022:
        r2 = r3.read(r4);	 Catch:{ all -> 0x0045 }
        r5 = -1;	 Catch:{ all -> 0x0045 }
        if (r2 == r5) goto L_0x002d;	 Catch:{ all -> 0x0045 }
    L_0x0029:
        r0.write(r4, r1, r2);	 Catch:{ all -> 0x0045 }
        goto L_0x0022;	 Catch:{ all -> 0x0045 }
    L_0x002d:
        r2 = r0.toByteArray();	 Catch:{ all -> 0x0045 }
        r7.consumeContent();	 Catch:{ IOException -> 0x0035 }
        goto L_0x003c;
    L_0x0035:
        r7 = "Error occurred when calling consumingContent";
        r1 = new java.lang.Object[r1];
        com.google.android.gms.internal.zzab.zza(r7, r1);
    L_0x003c:
        r7 = r6.zzbn;
        r7.zza(r4);
        r0.close();
        return r2;
    L_0x0045:
        r3 = move-exception;
        r2 = r4;
        goto L_0x0049;
    L_0x0048:
        r3 = move-exception;
    L_0x0049:
        r7.consumeContent();	 Catch:{ IOException -> 0x004d }
        goto L_0x0054;
    L_0x004d:
        r7 = "Error occurred when calling consumingContent";
        r1 = new java.lang.Object[r1];
        com.google.android.gms.internal.zzab.zza(r7, r1);
    L_0x0054:
        r7 = r6.zzbn;
        r7.zza(r2);
        r0.close();
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzad.zza(org.apache.http.HttpEntity):byte[]");
    }

    public com.google.android.gms.internal.zzn zza(com.google.android.gms.internal.zzp<?> r24) throws com.google.android.gms.internal.zzaa {
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
        r23 = this;
        r1 = r23;
        r2 = r24;
        r3 = android.os.SystemClock.elapsedRealtime();
    L_0x0008:
        r5 = java.util.Collections.emptyMap();
        r8 = 0;
        r9 = 0;
        r10 = new java.util.HashMap;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x012a }
        r10.<init>();	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x012a }
        r11 = r24.zze();	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x012a }
        if (r11 == 0) goto L_0x003c;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x012a }
    L_0x0019:
        r12 = r11.zza;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x012a }
        if (r12 == 0) goto L_0x0024;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x012a }
    L_0x001d:
        r12 = "If-None-Match";	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x012a }
        r13 = r11.zza;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x012a }
        r10.put(r12, r13);	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x012a }
    L_0x0024:
        r12 = r11.zzc;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x012a }
        r14 = 0;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x012a }
        r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x012a }
        if (r16 <= 0) goto L_0x003c;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x012a }
    L_0x002c:
        r12 = new java.util.Date;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x012a }
        r13 = r11.zzc;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x012a }
        r12.<init>(r13);	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x012a }
        r11 = "If-Modified-Since";	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x012a }
        r12 = org.apache.http.impl.cookie.DateUtils.formatDate(r12);	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x012a }
        r10.put(r11, r12);	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x012a }
    L_0x003c:
        r11 = r1.zzbm;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x012a }
        r10 = r11.zza(r2, r10);	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x012a }
        r11 = r10.getStatusLine();	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0126 }
        r13 = r11.getStatusCode();	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0126 }
        r12 = r10.getAllHeaders();	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0126 }
        r12 = zza(r12);	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0126 }
        r5 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        if (r13 != r5) goto L_0x0097;
    L_0x0056:
        r5 = r24.zze();	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0091 }
        if (r5 != 0) goto L_0x0072;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0091 }
    L_0x005c:
        r5 = new com.google.android.gms.internal.zzn;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0091 }
        r15 = 304; // 0x130 float:4.26E-43 double:1.5E-321;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0091 }
        r16 = 0;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0091 }
        r18 = 1;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0091 }
        r13 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0091 }
        r11 = 0;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0091 }
        r19 = r13 - r3;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0091 }
        r14 = r5;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0091 }
        r17 = r12;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0091 }
        r14.<init>(r15, r16, r17, r18, r19);	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0091 }
        return r5;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0091 }
    L_0x0072:
        r11 = r5.zzf;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0091 }
        r11.putAll(r12);	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0091 }
        r11 = new com.google.android.gms.internal.zzn;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0091 }
        r14 = 304; // 0x130 float:4.26E-43 double:1.5E-321;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0091 }
        r15 = r5.data;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0091 }
        r5 = r5.zzf;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0091 }
        r17 = 1;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0091 }
        r18 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0091 }
        r13 = 0;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0091 }
        r20 = r18 - r3;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0091 }
        r13 = r11;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0091 }
        r16 = r5;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0091 }
        r18 = r20;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0091 }
        r13.<init>(r14, r15, r16, r17, r18);	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0091 }
        return r11;
    L_0x0091:
        r0 = move-exception;
        r5 = r0;
        r13 = r8;
        r14 = r12;
        goto L_0x012f;
    L_0x0097:
        r5 = r10.getEntity();	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0120 }
        if (r5 == 0) goto L_0x00a6;
    L_0x009d:
        r5 = r10.getEntity();	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0091 }
        r5 = r1.zza(r5);	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0091 }
        goto L_0x00a8;
    L_0x00a6:
        r5 = new byte[r9];	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0120 }
    L_0x00a8:
        r14 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x011b }
        r8 = 0;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x011b }
        r6 = r14 - r3;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x011b }
        r8 = DEBUG;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x011b }
        if (r8 != 0) goto L_0x00b9;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x011b }
    L_0x00b3:
        r14 = 3000; // 0xbb8 float:4.204E-42 double:1.482E-320;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x011b }
        r8 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1));	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x011b }
        if (r8 <= 0) goto L_0x00f6;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x011b }
    L_0x00b9:
        r8 = "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]";	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x011b }
        r14 = 5;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x011b }
        r14 = new java.lang.Object[r14];	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x011b }
        r14[r9] = r2;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x011b }
        r6 = java.lang.Long.valueOf(r6);	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x011b }
        r7 = 1;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x011b }
        r14[r7] = r6;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x011b }
        if (r5 == 0) goto L_0x00d4;
    L_0x00c9:
        r6 = r5.length;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x00cf }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x00cf }
        goto L_0x00d6;
    L_0x00cf:
        r0 = move-exception;
        r13 = r5;
        r14 = r12;
        goto L_0x012e;
    L_0x00d4:
        r6 = "null";	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x011b }
    L_0x00d6:
        r7 = 2;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x011b }
        r14[r7] = r6;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x011b }
        r6 = 3;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x011b }
        r7 = r11.getStatusCode();	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x011b }
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x011b }
        r14[r6] = r7;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x011b }
        r6 = 4;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x011b }
        r7 = r24.zzj();	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x011b }
        r7 = r7.zzb();	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x011b }
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x011b }
        r14[r6] = r7;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x011b }
        com.google.android.gms.internal.zzab.zzb(r8, r14);	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x011b }
    L_0x00f6:
        r6 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x011b }
        if (r13 < r6) goto L_0x0112;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x011b }
    L_0x00fa:
        r6 = 299; // 0x12b float:4.19E-43 double:1.477E-321;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x011b }
        if (r13 <= r6) goto L_0x00ff;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x011b }
    L_0x00fe:
        goto L_0x0112;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x011b }
    L_0x00ff:
        r6 = new com.google.android.gms.internal.zzn;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x011b }
        r16 = 0;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x011b }
        r7 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x011b }
        r11 = 0;
        r17 = r7 - r3;
        r7 = r12;
        r12 = r6;
        r14 = r5;
        r15 = r7;
        r12.<init>(r13, r14, r15, r16, r17);	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0119 }
        return r6;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0119 }
    L_0x0112:
        r7 = r12;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0119 }
        r6 = new java.io.IOException;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0119 }
        r6.<init>();	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0119 }
        throw r6;	 Catch:{ SocketTimeoutException -> 0x01cd, ConnectTimeoutException -> 0x01c5, MalformedURLException -> 0x01a3, IOException -> 0x0119 }
    L_0x0119:
        r0 = move-exception;
        goto L_0x011d;
    L_0x011b:
        r0 = move-exception;
        r7 = r12;
    L_0x011d:
        r13 = r5;
        r14 = r7;
        goto L_0x012e;
    L_0x0120:
        r0 = move-exception;
        r7 = r12;
        r5 = r0;
        r14 = r7;
        r13 = r8;
        goto L_0x012f;
    L_0x0126:
        r0 = move-exception;
        r14 = r5;
        r13 = r8;
        goto L_0x012e;
    L_0x012a:
        r0 = move-exception;
        r14 = r5;
        r10 = r8;
        r13 = r10;
    L_0x012e:
        r5 = r0;
    L_0x012f:
        if (r10 == 0) goto L_0x019d;
    L_0x0131:
        r5 = r10.getStatusLine();
        r5 = r5.getStatusCode();
        r6 = "Unexpected response code %d for %s";
        r7 = 2;
        r7 = new java.lang.Object[r7];
        r8 = java.lang.Integer.valueOf(r5);
        r7[r9] = r8;
        r8 = r24.getUrl();
        r9 = 1;
        r7[r9] = r8;
        com.google.android.gms.internal.zzab.zzc(r6, r7);
        if (r13 == 0) goto L_0x0195;
    L_0x0150:
        r6 = new com.google.android.gms.internal.zzn;
        r15 = 0;
        r7 = android.os.SystemClock.elapsedRealtime();
        r16 = r7 - r3;
        r11 = r6;
        r12 = r5;
        r11.<init>(r12, r13, r14, r15, r16);
        r7 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
        if (r5 == r7) goto L_0x0189;
    L_0x0162:
        r7 = 403; // 0x193 float:5.65E-43 double:1.99E-321;
        if (r5 != r7) goto L_0x0167;
    L_0x0166:
        goto L_0x0189;
    L_0x0167:
        r2 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        if (r5 < r2) goto L_0x0175;
    L_0x016b:
        r2 = 499; // 0x1f3 float:6.99E-43 double:2.465E-321;
        if (r5 > r2) goto L_0x0175;
    L_0x016f:
        r2 = new com.google.android.gms.internal.zzf;
        r2.<init>(r6);
        throw r2;
    L_0x0175:
        r2 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        if (r5 < r2) goto L_0x0183;
    L_0x0179:
        r2 = 599; // 0x257 float:8.4E-43 double:2.96E-321;
        if (r5 > r2) goto L_0x0183;
    L_0x017d:
        r2 = new com.google.android.gms.internal.zzy;
        r2.<init>(r6);
        throw r2;
    L_0x0183:
        r2 = new com.google.android.gms.internal.zzy;
        r2.<init>(r6);
        throw r2;
    L_0x0189:
        r5 = "auth";
        r7 = new com.google.android.gms.internal.zza;
        r7.<init>(r6);
        zza(r5, r2, r7);
        goto L_0x0008;
    L_0x0195:
        r5 = "network";
        r6 = new com.google.android.gms.internal.zzm;
        r6.<init>();
        goto L_0x01d4;
    L_0x019d:
        r2 = new com.google.android.gms.internal.zzo;
        r2.<init>(r5);
        throw r2;
    L_0x01a3:
        r0 = move-exception;
        r3 = r0;
        r4 = new java.lang.RuntimeException;
        r5 = "Bad URL ";
        r2 = r24.getUrl();
        r2 = java.lang.String.valueOf(r2);
        r6 = r2.length();
        if (r6 == 0) goto L_0x01bc;
    L_0x01b7:
        r2 = r5.concat(r2);
        goto L_0x01c1;
    L_0x01bc:
        r2 = new java.lang.String;
        r2.<init>(r5);
    L_0x01c1:
        r4.<init>(r2, r3);
        throw r4;
    L_0x01c5:
        r5 = "connection";
        r6 = new com.google.android.gms.internal.zzz;
        r6.<init>();
        goto L_0x01d4;
    L_0x01cd:
        r5 = "socket";
        r6 = new com.google.android.gms.internal.zzz;
        r6.<init>();
    L_0x01d4:
        zza(r5, r2, r6);
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzad.zza(com.google.android.gms.internal.zzp):com.google.android.gms.internal.zzn");
    }
}
