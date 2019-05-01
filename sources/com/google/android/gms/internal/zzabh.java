package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbs;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

@zzzb
public final class zzabh extends zzaai {
    private static final Object sLock = new Object();
    private static zzabh zzcpt;
    private final Context mContext;
    private final zzabg zzcpu;

    private zzabh(Context context, zzabg zzabg) {
        this.mContext = context;
        this.zzcpu = zzabg;
    }

    private static com.google.android.gms.internal.zzaad zza(android.content.Context r20, com.google.android.gms.internal.zzabg r21, com.google.android.gms.internal.zzzz r22) {
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
        r1 = r20;
        r7 = r21;
        r0 = r22;
        r2 = "Starting ad request from service using: google.afma.request.getAdDictionary";
        com.google.android.gms.internal.zzaiw.zzbw(r2);
        r8 = new com.google.android.gms.internal.zznd;
        r2 = com.google.android.gms.internal.zzmq.zzbhx;
        r3 = com.google.android.gms.ads.internal.zzbs.zzep();
        r2 = r3.zzd(r2);
        r2 = (java.lang.Boolean) r2;
        r2 = r2.booleanValue();
        r3 = "load_ad";
        r4 = r0.zzath;
        r4 = r4.zzbda;
        r8.<init>(r2, r3, r4);
        r2 = r0.versionCode;
        r9 = 1;
        r10 = 0;
        r3 = 10;
        if (r2 <= r3) goto L_0x0045;
    L_0x002e:
        r2 = r0.zzcme;
        r4 = -1;
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r6 == 0) goto L_0x0045;
    L_0x0036:
        r2 = r0.zzcme;
        r2 = r8.zzc(r2);
        r3 = new java.lang.String[r9];
        r4 = "cts";
        r3[r10] = r4;
        r8.zza(r2, r3);
    L_0x0045:
        r2 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor();
        r11 = r8.zziz();
        r3 = r7.zzcpq;
        r3 = r3.zzj(r1);
        r4 = com.google.android.gms.internal.zzmq.zzbod;
        r5 = com.google.android.gms.ads.internal.zzbs.zzep();
        r4 = r5.zzd(r4);
        r4 = (java.lang.Long) r4;
        r4 = r4.longValue();
        r6 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r3 = com.google.android.gms.internal.zzajg.zza(r3, r4, r6, r2);
        r4 = r7.zzcpp;
        r4 = r4.zzq(r1);
        r5 = com.google.android.gms.internal.zzmq.zzbln;
        r6 = com.google.android.gms.ads.internal.zzbs.zzep();
        r5 = r6.zzd(r5);
        r5 = (java.lang.Long) r5;
        r5 = r5.longValue();
        r12 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r4 = com.google.android.gms.internal.zzajg.zza(r4, r5, r12, r2);
        r5 = r7.zzcpk;
        r6 = r0.zzclp;
        r6 = r6.packageName;
        r5 = r5.zzbx(r6);
        r6 = r7.zzcpr;
        r12 = r0.zzclq;
        r13 = r0.zzclp;
        r6 = r6.zza(r12, r13);
        r12 = com.google.android.gms.ads.internal.zzbs.zzem();
        r12 = r12.zzp(r1);
        r13 = 0;
        r14 = com.google.android.gms.internal.zzajg.zzi(r13);
        r15 = r0.zzclo;
        r15 = r15.extras;
        if (r15 == 0) goto L_0x00b6;
    L_0x00ac:
        r9 = "_ad";
        r9 = r15.getString(r9);
        if (r9 == 0) goto L_0x00b6;
    L_0x00b4:
        r9 = 1;
        goto L_0x00b7;
    L_0x00b6:
        r9 = 0;
    L_0x00b7:
        r15 = r0.zzcmk;
        if (r15 == 0) goto L_0x00c5;
    L_0x00bb:
        if (r9 != 0) goto L_0x00c5;
    L_0x00bd:
        r9 = r7.zzcpn;
        r14 = r0.applicationInfo;
        r14 = r9.zza(r14);
    L_0x00c5:
        r9 = com.google.android.gms.internal.zzmq.zzbnm;
        r15 = com.google.android.gms.ads.internal.zzbs.zzep();
        r9 = r15.zzd(r9);
        r9 = (java.lang.Long) r9;
        r16 = r11;
        r10 = r9.longValue();
        r9 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r9 = com.google.android.gms.internal.zzajg.zza(r14, r10, r9, r2);
        r10 = com.google.android.gms.internal.zzajg.zzi(r13);
        r11 = com.google.android.gms.internal.zzmq.zzbjt;
        r14 = com.google.android.gms.ads.internal.zzbs.zzep();
        r11 = r14.zzd(r11);
        r11 = (java.lang.Boolean) r11;
        r11 = r11.booleanValue();
        if (r11 == 0) goto L_0x010f;
    L_0x00f3:
        r10 = r7.zzcpr;
        r10 = r10.zzac(r1);
        r11 = com.google.android.gms.internal.zzmq.zzbju;
        r14 = com.google.android.gms.ads.internal.zzbs.zzep();
        r11 = r14.zzd(r11);
        r11 = (java.lang.Long) r11;
        r14 = r11.longValue();
        r11 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r10 = com.google.android.gms.internal.zzajg.zza(r10, r14, r11, r2);
    L_0x010f:
        r11 = r0.versionCode;
        r14 = 4;
        if (r11 < r14) goto L_0x011b;
    L_0x0114:
        r11 = r0.zzclv;
        if (r11 == 0) goto L_0x011b;
    L_0x0118:
        r11 = r0.zzclv;
        goto L_0x011c;
    L_0x011b:
        r11 = r13;
    L_0x011c:
        r14 = com.google.android.gms.internal.zzmq.zzbin;
        r15 = com.google.android.gms.ads.internal.zzbs.zzep();
        r14 = r15.zzd(r14);
        r14 = (java.lang.Boolean) r14;
        r14.booleanValue();
        com.google.android.gms.ads.internal.zzbs.zzec();
        r14 = r20.getPackageName();
        r15 = "android.permission.ACCESS_NETWORK_STATE";
        r14 = com.google.android.gms.internal.zzagr.zzd(r1, r14, r15);
        if (r14 == 0) goto L_0x014d;
    L_0x013a:
        r14 = "connectivity";
        r14 = r1.getSystemService(r14);
        r14 = (android.net.ConnectivityManager) r14;
        r14 = r14.getActiveNetworkInfo();
        if (r14 != 0) goto L_0x014d;
    L_0x0148:
        r14 = "Device is offline.";
        com.google.android.gms.internal.zzaiw.zzbw(r14);
    L_0x014d:
        r14 = r0.versionCode;
        r15 = 7;
        if (r14 < r15) goto L_0x0155;
    L_0x0152:
        r14 = r0.zzcmb;
        goto L_0x015d;
    L_0x0155:
        r14 = java.util.UUID.randomUUID();
        r14 = r14.toString();
    L_0x015d:
        r15 = new com.google.android.gms.internal.zzabn;
        r13 = r0.applicationInfo;
        r13 = r13.packageName;
        r15.<init>(r1, r14, r13);
        r13 = r0.zzclo;
        r13 = r13.extras;
        if (r13 == 0) goto L_0x017d;
    L_0x016c:
        r13 = r0.zzclo;
        r13 = r13.extras;
        r15 = "_ad";
        r13 = r13.getString(r15);
        if (r13 == 0) goto L_0x017d;
    L_0x0178:
        r0 = com.google.android.gms.internal.zzabm.zza(r1, r0, r13);
        return r0;
    L_0x017d:
        r13 = r7.zzcpl;
        r15 = r0.zzcmc;
        r13 = r13.zze(r15);
        r15 = com.google.android.gms.internal.zzmq.zzbod;
        r17 = r2;
        r2 = com.google.android.gms.ads.internal.zzbs.zzep();
        r2 = r2.zzd(r15);
        r2 = (java.lang.Long) r2;
        r18 = r14;
        r14 = r2.longValue();
        r2 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r19 = r8;
        r8 = 0;
        r2 = com.google.android.gms.internal.zzajg.zza(r3, r8, r14, r2);
        r2 = (android.os.Bundle) r2;
        r3 = com.google.android.gms.internal.zzajg.zza(r4, r8);
        r3 = (com.google.android.gms.internal.zzace) r3;
        r4 = com.google.android.gms.internal.zzajg.zza(r9, r8);
        r4 = (android.location.Location) r4;
        r9 = com.google.android.gms.internal.zzajg.zza(r10, r8);
        r9 = (com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) r9;
        r6 = com.google.android.gms.internal.zzajg.zza(r6, r8);
        r6 = (java.lang.String) r6;
        r5 = com.google.android.gms.internal.zzajg.zza(r5, r8);
        r5 = (java.lang.String) r5;
        r10 = com.google.android.gms.internal.zzajg.zza(r12, r8);
        r10 = (com.google.android.gms.internal.zzabu) r10;
        if (r10 != 0) goto L_0x01d6;
    L_0x01ca:
        r0 = "Error fetching device info. This is not recoverable.";
        com.google.android.gms.internal.zzaiw.zzco(r0);
        r0 = new com.google.android.gms.internal.zzaad;
        r1 = 0;
        r0.<init>(r1);
        return r0;
    L_0x01d6:
        r8 = new com.google.android.gms.internal.zzabf;
        r8.<init>();
        r8.zzcpe = r0;
        r8.zzcpf = r10;
        r8.zzcpb = r3;
        r8.zzbcd = r4;
        r8.zzcpa = r2;
        r8.zzclq = r6;
        r8.zzcpd = r9;
        if (r13 != 0) goto L_0x01f0;
    L_0x01eb:
        r2 = r8.zzcmc;
        r2.clear();
    L_0x01f0:
        r8.zzcmc = r13;
        r8.zzclv = r11;
        r8.zzcpc = r5;
        r2 = r7.zzcpj;
        r2 = r2.zzf(r1);
        r8.zzcpg = r2;
        r2 = r7.zzcph;
        r8.zzcph = r2;
        r2 = com.google.android.gms.internal.zzabm.zza(r1, r8);
        if (r2 != 0) goto L_0x020f;
    L_0x0208:
        r0 = new com.google.android.gms.internal.zzaad;
        r1 = 0;
        r0.<init>(r1);
        return r0;
    L_0x020f:
        r3 = r0.versionCode;
        r4 = 7;
        if (r3 >= r4) goto L_0x021b;
    L_0x0214:
        r3 = "request_id";	 Catch:{ JSONException -> 0x021b }
        r14 = r18;	 Catch:{ JSONException -> 0x021b }
        r2.put(r3, r14);	 Catch:{ JSONException -> 0x021b }
    L_0x021b:
        r2.toString();
        r3 = 1;
        r4 = new java.lang.String[r3];
        r3 = "arc";
        r6 = 0;
        r4[r6] = r3;
        r9 = r16;
        r8 = r19;
        r8.zza(r9, r4);
        r8.zziz();
        r3 = r7.zzcps;
        r3 = r3.zznk();
        r2 = r3.zzg(r2);
        r3 = com.google.android.gms.internal.zzabi.zzcpv;
        r4 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor();
        r2 = com.google.android.gms.internal.zzajg.zza(r2, r3, r4);
        r3 = 10;
        r6 = java.util.concurrent.TimeUnit.SECONDS;
        r10 = r17;
        r2 = com.google.android.gms.internal.zzajg.zza(r2, r3, r6, r10);
        r3 = r7.zzcpm;
        r3 = r3.zznt();
        if (r3 == 0) goto L_0x025b;
    L_0x0256:
        r4 = "AdRequestServiceImpl.loadAd.flags";
        com.google.android.gms.internal.zzaje.zza(r3, r4);
    L_0x025b:
        r3 = 0;
        r2 = com.google.android.gms.internal.zzajg.zza(r2, r3);
        r6 = r2;
        r6 = (com.google.android.gms.internal.zzabt) r6;
        if (r6 != 0) goto L_0x026c;
    L_0x0265:
        r0 = new com.google.android.gms.internal.zzaad;
        r1 = 0;
        r0.<init>(r1);
        return r0;
    L_0x026c:
        r2 = r6.getErrorCode();
        r4 = -2;
        if (r2 == r4) goto L_0x027d;
    L_0x0273:
        r0 = new com.google.android.gms.internal.zzaad;
        r1 = r6.getErrorCode();
        r0.<init>(r1);
        return r0;
    L_0x027d:
        r8.zzjc();
        r2 = r6.zznq();
        r2 = android.text.TextUtils.isEmpty(r2);
        if (r2 != 0) goto L_0x0293;
    L_0x028a:
        r2 = r6.zznq();
        r13 = com.google.android.gms.internal.zzabm.zza(r1, r0, r2);
        goto L_0x0294;
    L_0x0293:
        r13 = r3;
    L_0x0294:
        if (r13 != 0) goto L_0x02af;
    L_0x0296:
        r2 = r6.getUrl();
        r2 = android.text.TextUtils.isEmpty(r2);
        if (r2 != 0) goto L_0x02af;
    L_0x02a0:
        r2 = r0.zzatd;
        r2 = r2.zzcp;
        r3 = r6.getUrl();
        r4 = r5;
        r5 = r6;
        r6 = r8;
        r13 = zza(r0, r1, r2, r3, r4, r5, r6, r7);
    L_0x02af:
        if (r13 != 0) goto L_0x02b8;
    L_0x02b1:
        r13 = new com.google.android.gms.internal.zzaad;
        r0 = 0;
        r13.<init>(r0);
        goto L_0x02b9;
    L_0x02b8:
        r0 = 0;
    L_0x02b9:
        r1 = 1;
        r1 = new java.lang.String[r1];
        r2 = "tts";
        r1[r0] = r2;
        r8.zza(r9, r1);
        r0 = r8.zzja();
        r13.zzcnt = r0;
        return r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzabh.zza(android.content.Context, com.google.android.gms.internal.zzabg, com.google.android.gms.internal.zzzz):com.google.android.gms.internal.zzaad");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.zzaad zza(com.google.android.gms.internal.zzzz r18, android.content.Context r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, com.google.android.gms.internal.zzabt r23, com.google.android.gms.internal.zznd r24, com.google.android.gms.internal.zzabg r25) {
        /*
        r1 = r18;
        r2 = r24;
        if (r2 == 0) goto L_0x000b;
    L_0x0006:
        r4 = r24.zziz();
        goto L_0x000c;
    L_0x000b:
        r4 = 0;
    L_0x000c:
        r5 = new com.google.android.gms.internal.zzabr;	 Catch:{ IOException -> 0x0181 }
        r6 = r23.zznn();	 Catch:{ IOException -> 0x0181 }
        r5.<init>(r1, r6);	 Catch:{ IOException -> 0x0181 }
        r6 = "AdRequestServiceImpl: Sending request: ";
        r7 = java.lang.String.valueOf(r21);	 Catch:{ IOException -> 0x0181 }
        r8 = r7.length();	 Catch:{ IOException -> 0x0181 }
        if (r8 == 0) goto L_0x0026;
    L_0x0021:
        r6 = r6.concat(r7);	 Catch:{ IOException -> 0x0181 }
        goto L_0x002c;
    L_0x0026:
        r7 = new java.lang.String;	 Catch:{ IOException -> 0x0181 }
        r7.<init>(r6);	 Catch:{ IOException -> 0x0181 }
        r6 = r7;
    L_0x002c:
        com.google.android.gms.internal.zzaiw.zzbw(r6);	 Catch:{ IOException -> 0x0181 }
        r6 = new java.net.URL;	 Catch:{ IOException -> 0x0181 }
        r7 = r21;
        r6.<init>(r7);	 Catch:{ IOException -> 0x0181 }
        r7 = com.google.android.gms.ads.internal.zzbs.zzei();	 Catch:{ IOException -> 0x0181 }
        r7 = r7.elapsedRealtime();	 Catch:{ IOException -> 0x0181 }
        r9 = 0;
        r10 = 0;
    L_0x0040:
        r11 = r6.openConnection();	 Catch:{ IOException -> 0x0181 }
        r11 = (java.net.HttpURLConnection) r11;	 Catch:{ IOException -> 0x0181 }
        r12 = com.google.android.gms.ads.internal.zzbs.zzec();	 Catch:{ all -> 0x017b }
        r13 = r19;
        r14 = r20;
        r12.zza(r13, r14, r9, r11);	 Catch:{ all -> 0x017b }
        r12 = android.text.TextUtils.isEmpty(r22);	 Catch:{ all -> 0x017b }
        if (r12 != 0) goto L_0x0065;
    L_0x0057:
        r12 = r23.zznp();	 Catch:{ all -> 0x017b }
        if (r12 == 0) goto L_0x0065;
    L_0x005d:
        r12 = "x-afma-drt-cookie";
        r15 = r22;
        r11.addRequestProperty(r12, r15);	 Catch:{ all -> 0x017b }
        goto L_0x0067;
    L_0x0065:
        r15 = r22;
    L_0x0067:
        r12 = r1.zzcml;	 Catch:{ all -> 0x017b }
        r16 = android.text.TextUtils.isEmpty(r12);	 Catch:{ all -> 0x017b }
        if (r16 != 0) goto L_0x0079;
    L_0x006f:
        r3 = "Sending webview cookie in ad request header.";
        com.google.android.gms.internal.zzaiw.zzbw(r3);	 Catch:{ all -> 0x017b }
        r3 = "Cookie";
        r11.addRequestProperty(r3, r12);	 Catch:{ all -> 0x017b }
    L_0x0079:
        r3 = 1;
        if (r23 == 0) goto L_0x00af;
    L_0x007c:
        r9 = r23.zzno();	 Catch:{ all -> 0x017b }
        r9 = android.text.TextUtils.isEmpty(r9);	 Catch:{ all -> 0x017b }
        if (r9 != 0) goto L_0x00af;
    L_0x0086:
        r11.setDoOutput(r3);	 Catch:{ all -> 0x017b }
        r9 = r23.zzno();	 Catch:{ all -> 0x017b }
        r9 = r9.getBytes();	 Catch:{ all -> 0x017b }
        r3 = r9.length;	 Catch:{ all -> 0x017b }
        r11.setFixedLengthStreamingMode(r3);	 Catch:{ all -> 0x017b }
        r3 = new java.io.BufferedOutputStream;	 Catch:{ all -> 0x00a8 }
        r1 = r11.getOutputStream();	 Catch:{ all -> 0x00a8 }
        r3.<init>(r1);	 Catch:{ all -> 0x00a8 }
        r3.write(r9);	 Catch:{ all -> 0x00a5 }
        com.google.android.gms.common.util.zzn.closeQuietly(r3);	 Catch:{ all -> 0x017b }
        goto L_0x00af;
    L_0x00a5:
        r0 = move-exception;
        r1 = r0;
        goto L_0x00ab;
    L_0x00a8:
        r0 = move-exception;
        r1 = r0;
        r3 = 0;
    L_0x00ab:
        com.google.android.gms.common.util.zzn.closeQuietly(r3);	 Catch:{ all -> 0x017b }
        throw r1;	 Catch:{ all -> 0x017b }
    L_0x00af:
        r1 = r11.getResponseCode();	 Catch:{ all -> 0x017b }
        r3 = r11.getHeaderFields();	 Catch:{ all -> 0x017b }
        r9 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r13 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        if (r1 < r9) goto L_0x00ff;
    L_0x00bd:
        if (r1 >= r13) goto L_0x00ff;
    L_0x00bf:
        r6 = r6.toString();	 Catch:{ all -> 0x017b }
        r9 = new java.io.InputStreamReader;	 Catch:{ all -> 0x00f8 }
        r10 = r11.getInputStream();	 Catch:{ all -> 0x00f8 }
        r9.<init>(r10);	 Catch:{ all -> 0x00f8 }
        com.google.android.gms.ads.internal.zzbs.zzec();	 Catch:{ all -> 0x00f5 }
        r10 = com.google.android.gms.internal.zzagr.zza(r9);	 Catch:{ all -> 0x00f5 }
        com.google.android.gms.common.util.zzn.closeQuietly(r9);	 Catch:{ all -> 0x017b }
        zza(r6, r3, r10, r1);	 Catch:{ all -> 0x017b }
        r5.zza(r6, r3, r10);	 Catch:{ all -> 0x017b }
        if (r2 == 0) goto L_0x00e9;
    L_0x00de:
        r1 = 1;
        r1 = new java.lang.String[r1];	 Catch:{ all -> 0x017b }
        r3 = "ufe";
        r6 = 0;
        r1[r6] = r3;	 Catch:{ all -> 0x017b }
        r2.zza(r4, r1);	 Catch:{ all -> 0x017b }
    L_0x00e9:
        r1 = r23.zznr();	 Catch:{ all -> 0x017b }
        r1 = r5.zza(r7, r1);	 Catch:{ all -> 0x017b }
        r11.disconnect();	 Catch:{ IOException -> 0x0181 }
        return r1;
    L_0x00f5:
        r0 = move-exception;
        r1 = r0;
        goto L_0x00fb;
    L_0x00f8:
        r0 = move-exception;
        r1 = r0;
        r9 = 0;
    L_0x00fb:
        com.google.android.gms.common.util.zzn.closeQuietly(r9);	 Catch:{ all -> 0x017b }
        throw r1;	 Catch:{ all -> 0x017b }
    L_0x00ff:
        r6 = r6.toString();	 Catch:{ all -> 0x017b }
        r9 = 0;
        zza(r6, r3, r9, r1);	 Catch:{ all -> 0x017b }
        if (r1 < r13) goto L_0x015b;
    L_0x0109:
        r6 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        if (r1 >= r6) goto L_0x015b;
    L_0x010d:
        r1 = "Location";
        r1 = r11.getHeaderField(r1);	 Catch:{ all -> 0x017b }
        r6 = android.text.TextUtils.isEmpty(r1);	 Catch:{ all -> 0x017b }
        if (r6 == 0) goto L_0x0128;
    L_0x0119:
        r1 = "No location header to follow redirect.";
        com.google.android.gms.internal.zzaiw.zzco(r1);	 Catch:{ all -> 0x017b }
        r1 = new com.google.android.gms.internal.zzaad;	 Catch:{ all -> 0x017b }
        r2 = 0;
        r1.<init>(r2);	 Catch:{ all -> 0x017b }
        r11.disconnect();	 Catch:{ IOException -> 0x0181 }
        return r1;
    L_0x0128:
        r6 = new java.net.URL;	 Catch:{ all -> 0x017b }
        r6.<init>(r1);	 Catch:{ all -> 0x017b }
        r1 = 1;
        r10 = r10 + r1;
        r1 = com.google.android.gms.internal.zzmq.zzbpm;	 Catch:{ all -> 0x017b }
        r13 = com.google.android.gms.ads.internal.zzbs.zzep();	 Catch:{ all -> 0x017b }
        r1 = r13.zzd(r1);	 Catch:{ all -> 0x017b }
        r1 = (java.lang.Integer) r1;	 Catch:{ all -> 0x017b }
        r1 = r1.intValue();	 Catch:{ all -> 0x017b }
        if (r10 <= r1) goto L_0x0150;
    L_0x0141:
        r1 = "Too many redirects.";
        com.google.android.gms.internal.zzaiw.zzco(r1);	 Catch:{ all -> 0x017b }
        r1 = new com.google.android.gms.internal.zzaad;	 Catch:{ all -> 0x017b }
        r2 = 0;
        r1.<init>(r2);	 Catch:{ all -> 0x017b }
        r11.disconnect();	 Catch:{ IOException -> 0x0181 }
        return r1;
    L_0x0150:
        r5.zzn(r3);	 Catch:{ all -> 0x017b }
        r11.disconnect();	 Catch:{ IOException -> 0x0181 }
        r1 = r18;
        r9 = 0;
        goto L_0x0040;
    L_0x015b:
        r2 = 46;
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x017b }
        r3.<init>(r2);	 Catch:{ all -> 0x017b }
        r2 = "Received error HTTP response code: ";
        r3.append(r2);	 Catch:{ all -> 0x017b }
        r3.append(r1);	 Catch:{ all -> 0x017b }
        r1 = r3.toString();	 Catch:{ all -> 0x017b }
        com.google.android.gms.internal.zzaiw.zzco(r1);	 Catch:{ all -> 0x017b }
        r1 = new com.google.android.gms.internal.zzaad;	 Catch:{ all -> 0x017b }
        r2 = 0;
        r1.<init>(r2);	 Catch:{ all -> 0x017b }
        r11.disconnect();	 Catch:{ IOException -> 0x0181 }
        return r1;
    L_0x017b:
        r0 = move-exception;
        r1 = r0;
        r11.disconnect();	 Catch:{ IOException -> 0x0181 }
        throw r1;	 Catch:{ IOException -> 0x0181 }
    L_0x0181:
        r0 = move-exception;
        r1 = r0;
        r2 = "Error while connecting to ad server: ";
        r1 = r1.getMessage();
        r1 = java.lang.String.valueOf(r1);
        r3 = r1.length();
        if (r3 == 0) goto L_0x0198;
    L_0x0193:
        r1 = r2.concat(r1);
        goto L_0x019d;
    L_0x0198:
        r1 = new java.lang.String;
        r1.<init>(r2);
    L_0x019d:
        com.google.android.gms.internal.zzaiw.zzco(r1);
        r1 = new com.google.android.gms.internal.zzaad;
        r2 = 2;
        r1.<init>(r2);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzabh.zza(com.google.android.gms.internal.zzzz, android.content.Context, java.lang.String, java.lang.String, java.lang.String, com.google.android.gms.internal.zzabt, com.google.android.gms.internal.zznd, com.google.android.gms.internal.zzabg):com.google.android.gms.internal.zzaad");
    }

    public static zzabh zza(Context context, zzabg zzabg) {
        zzabh zzabh;
        synchronized (sLock) {
            if (zzcpt == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                zzmq.initialize(context);
                zzcpt = new zzabh(context, zzabg);
            }
            zzabh = zzcpt;
        }
        return zzabh;
    }

    private static void zza(String str, Map<String, List<String>> map, String str2, int i) {
        if (zzaiw.zzae(2)) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 39);
            stringBuilder.append("Http Response: {\n  URL:\n    ");
            stringBuilder.append(str);
            stringBuilder.append("\n  Headers:");
            zzafj.m5v(stringBuilder.toString());
            if (map != null) {
                for (String str3 : map.keySet()) {
                    StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str3).length() + 5);
                    stringBuilder2.append("    ");
                    stringBuilder2.append(str3);
                    stringBuilder2.append(":");
                    zzafj.m5v(stringBuilder2.toString());
                    for (String valueOf : (List) map.get(str3)) {
                        String str4 = "      ";
                        String valueOf2 = String.valueOf(valueOf2);
                        zzafj.m5v(valueOf2.length() != 0 ? str4.concat(valueOf2) : new String(str4));
                    }
                }
            }
            zzafj.m5v("  Body:");
            if (str2 != null) {
                int i2 = 0;
                while (i2 < Math.min(str2.length(), 100000)) {
                    int i3 = i2 + 1000;
                    zzafj.m5v(str2.substring(i2, Math.min(str2.length(), i3)));
                    i2 = i3;
                }
            } else {
                zzafj.m5v("    null");
            }
            StringBuilder stringBuilder3 = new StringBuilder(34);
            stringBuilder3.append("  Response Code:\n    ");
            stringBuilder3.append(i);
            stringBuilder3.append("\n}");
            zzafj.m5v(stringBuilder3.toString());
        }
    }

    public final void zza(zzaas zzaas, zzaan zzaan) {
        zzafj.m5v("Nonagon code path entered in octagon");
        throw new IllegalArgumentException();
    }

    public final void zza(zzzz zzzz, zzaak zzaak) {
        zzbs.zzeg().zzd(this.mContext, zzzz.zzatd);
        Future zza = zzagl.zza(new zzabj(this, zzzz, zzaak));
        zzbs.zzet().zzqm();
        zzbs.zzet().getHandler().postDelayed(new zzabk(this, zza), 60000);
    }

    public final zzaad zzb(zzzz zzzz) {
        return zza(this.mContext, this.zzcpu, zzzz);
    }
}
