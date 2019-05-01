package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.gmsg.HttpClient;
import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.ads.internal.gmsg.zzy;
import com.google.android.gms.ads.internal.js.zzab;
import com.google.android.gms.ads.internal.js.zzc;
import com.google.android.gms.ads.internal.js.zzo;
import com.google.android.gms.ads.internal.zzbs;
import java.util.concurrent.TimeUnit;

@zzzb
public final class zzaau extends zzafh {
    private static final Object sLock = new Object();
    private static zzo zzcke = null;
    private static long zzcoq = TimeUnit.SECONDS.toMillis(10);
    private static boolean zzcor = false;
    private static HttpClient zzcos;
    private static zzy zzcot;
    private static zzt<Object> zzcou;
    private final Context mContext;
    private final Object zzchy = new Object();
    private final zzzd zzckx;
    private final zzaaa zzcky;
    private zzig zzcla;
    private zzab zzcov;

    public zzaau(Context context, zzaaa zzaaa, zzzd zzzd, zzig zzig) {
        super(true);
        this.zzckx = zzzd;
        this.mContext = context;
        this.zzcky = zzaaa;
        this.zzcla = zzig;
        synchronized (sLock) {
            if (!zzcor) {
                zzcot = new zzy();
                zzcos = new HttpClient(context.getApplicationContext(), zzaaa.zzatd);
                zzcou = new zzabc();
                zzcke = new zzo(this.mContext.getApplicationContext(), this.zzcky.zzatd, (String) zzbs.zzep().zzd(zzmq.zzbfy), new zzabb(), new zzaba());
                zzcor = true;
            }
        }
    }

    private final org.json.JSONObject zza(com.google.android.gms.internal.zzzz r6, java.lang.String r7) {
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
        r5 = this;
        r0 = r6.zzclo;
        r0 = r0.extras;
        r1 = "sdk_less_server_data";
        r0 = r0.getBundle(r1);
        r1 = 0;
        if (r0 != 0) goto L_0x000e;
    L_0x000d:
        return r1;
    L_0x000e:
        r2 = com.google.android.gms.ads.internal.zzbs.zzem();	 Catch:{ Exception -> 0x001f }
        r3 = r5.mContext;	 Catch:{ Exception -> 0x001f }
        r2 = r2.zzp(r3);	 Catch:{ Exception -> 0x001f }
        r2 = r2.get();	 Catch:{ Exception -> 0x001f }
        r2 = (com.google.android.gms.internal.zzabu) r2;	 Catch:{ Exception -> 0x001f }
        goto L_0x0026;
    L_0x001f:
        r2 = move-exception;
        r3 = "Error grabbing device info: ";
        com.google.android.gms.internal.zzaiw.zzc(r3, r2);
        r2 = r1;
    L_0x0026:
        r3 = r5.mContext;
        r4 = new com.google.android.gms.internal.zzabf;
        r4.<init>();
        r4.zzcpe = r6;
        r4.zzcpf = r2;
        r6 = com.google.android.gms.internal.zzabm.zza(r3, r4);
        if (r6 != 0) goto L_0x0038;
    L_0x0037:
        return r1;
    L_0x0038:
        r2 = r5.mContext;	 Catch:{ IOException -> 0x003f, IOException -> 0x003f, IOException -> 0x003f, IOException -> 0x003f }
        r2 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r2);	 Catch:{ IOException -> 0x003f, IOException -> 0x003f, IOException -> 0x003f, IOException -> 0x003f }
        goto L_0x0046;
    L_0x003f:
        r2 = move-exception;
        r3 = "Cannot get advertising id info";
        com.google.android.gms.internal.zzaiw.zzc(r3, r2);
        r2 = r1;
    L_0x0046:
        r3 = new java.util.HashMap;
        r3.<init>();
        r4 = "request_id";
        r3.put(r4, r7);
        r7 = "request_param";
        r3.put(r7, r6);
        r6 = "data";
        r3.put(r6, r0);
        if (r2 == 0) goto L_0x0072;
    L_0x005c:
        r6 = "adid";
        r7 = r2.getId();
        r3.put(r6, r7);
        r6 = "lat";
        r7 = r2.isLimitAdTrackingEnabled();
        r7 = java.lang.Integer.valueOf(r7);
        r3.put(r6, r7);
    L_0x0072:
        r6 = com.google.android.gms.ads.internal.zzbs.zzec();	 Catch:{ JSONException -> 0x007b }
        r6 = r6.zzp(r3);	 Catch:{ JSONException -> 0x007b }
        return r6;
    L_0x007b:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzaau.zza(com.google.android.gms.internal.zzzz, java.lang.String):org.json.JSONObject");
    }

    protected static void zzb(zzc zzc) {
        zzc.zza("/loadAd", zzcot);
        zzc.zza("/fetchHttpRequest", zzcos);
        zzc.zza("/invalidRequest", zzcou);
    }

    private final com.google.android.gms.internal.zzaad zzc(com.google.android.gms.internal.zzzz r11) {
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
        r10 = this;
        com.google.android.gms.ads.internal.zzbs.zzec();
        r0 = com.google.android.gms.internal.zzagr.zzpv();
        r1 = r10.zza(r11, r0);
        r2 = 0;
        if (r1 != 0) goto L_0x0014;
    L_0x000e:
        r11 = new com.google.android.gms.internal.zzaad;
        r11.<init>(r2);
        return r11;
    L_0x0014:
        r3 = com.google.android.gms.ads.internal.zzbs.zzei();
        r3 = r3.elapsedRealtime();
        r5 = zzcot;
        r5 = r5.zzar(r0);
        r6 = com.google.android.gms.internal.zzais.zzdbs;
        r7 = new com.google.android.gms.internal.zzaaw;
        r7.<init>(r10, r1, r0);
        r6.post(r7);
        r0 = zzcoq;
        r6 = com.google.android.gms.ads.internal.zzbs.zzei();
        r6 = r6.elapsedRealtime();
        r8 = r6 - r3;
        r3 = r0 - r8;
        r0 = -1;
        r1 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ CancellationException -> 0x0076, CancellationException -> 0x0076, TimeoutException -> 0x006f, ExecutionException -> 0x0069 }
        r1 = r5.get(r3, r1);	 Catch:{ CancellationException -> 0x0076, CancellationException -> 0x0076, TimeoutException -> 0x006f, ExecutionException -> 0x0069 }
        r1 = (org.json.JSONObject) r1;	 Catch:{ CancellationException -> 0x0076, CancellationException -> 0x0076, TimeoutException -> 0x006f, ExecutionException -> 0x0069 }
        if (r1 != 0) goto L_0x004b;
    L_0x0045:
        r11 = new com.google.android.gms.internal.zzaad;
        r11.<init>(r0);
        return r11;
    L_0x004b:
        r0 = r10.mContext;
        r1 = r1.toString();
        r11 = com.google.android.gms.internal.zzabm.zza(r0, r11, r1);
        r0 = r11.errorCode;
        r1 = -3;
        if (r0 == r1) goto L_0x0068;
    L_0x005a:
        r0 = r11.body;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x0068;
    L_0x0062:
        r11 = new com.google.android.gms.internal.zzaad;
        r0 = 3;
        r11.<init>(r0);
    L_0x0068:
        return r11;
    L_0x0069:
        r11 = new com.google.android.gms.internal.zzaad;
        r11.<init>(r2);
        return r11;
    L_0x006f:
        r11 = new com.google.android.gms.internal.zzaad;
        r0 = 2;
        r11.<init>(r0);
        return r11;
    L_0x0076:
        r11 = new com.google.android.gms.internal.zzaad;
        r11.<init>(r0);
        return r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzaau.zzc(com.google.android.gms.internal.zzzz):com.google.android.gms.internal.zzaad");
    }

    protected static void zzc(zzc zzc) {
        zzc.zzb("/loadAd", zzcot);
        zzc.zzb("/fetchHttpRequest", zzcos);
        zzc.zzb("/invalidRequest", zzcou);
    }

    public final void onStop() {
        synchronized (this.zzchy) {
            zzais.zzdbs.post(new zzaaz(this));
        }
    }

    public final void zzdg() {
        zzaiw.zzbw("SdkLessAdLoaderBackgroundTask started.");
        String zzz = zzbs.zzfa().zzz(this.mContext);
        zzzz zzzz = new zzzz(this.zzcky, -1, zzbs.zzfa().zzx(this.mContext), zzbs.zzfa().zzy(this.mContext), zzz);
        zzbs.zzfa().zzg(this.mContext, zzz);
        zzaad zzc = zzc(zzzz);
        long elapsedRealtime = zzbs.zzei().elapsedRealtime();
        zzzz = zzzz;
        zzais.zzdbs.post(new zzaav(this, new zzaev(zzzz, zzc, null, null, zzc.errorCode, elapsedRealtime, zzc.zzcnk, null, this.zzcla)));
    }
}
