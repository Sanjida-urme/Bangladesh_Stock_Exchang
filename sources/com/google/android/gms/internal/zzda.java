package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.VisibleForTesting;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.zzbs;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class zzda {
    private static final String TAG = "zzda";
    private volatile boolean zzahk = false;
    protected Context zzaif;
    private Context zzaig;
    private ExecutorService zzaih;
    private DexClassLoader zzaii;
    private zzcu zzaij;
    private byte[] zzaik;
    private volatile AdvertisingIdClient zzail = null;
    private Future zzaim = null;
    private volatile zzaw zzain = null;
    private Future zzaio = null;
    private zzcm zzaip;
    private boolean zzaiq = false;
    private boolean zzair = false;
    private Map<Pair<String, String>, zzea> zzais;
    private boolean zzait = false;
    private boolean zzaiu = true;
    private boolean zzaiv = false;

    final class zza extends BroadcastReceiver {
        private /* synthetic */ zzda zzaiw;

        private zza(zzda zzda) {
            this.zzaiw = zzda;
        }

        public final void onReceive(Context context, Intent intent) {
            if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                this.zzaiw.zzaiu = true;
                return;
            }
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                this.zzaiw.zzaiu = false;
            }
        }
    }

    private zzda(Context context) {
        this.zzaif = context;
        this.zzaig = context.getApplicationContext();
        this.zzais = new HashMap();
    }

    public static com.google.android.gms.internal.zzda zza(android.content.Context r8, java.lang.String r9, java.lang.String r10, boolean r11) {
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
        r0 = new com.google.android.gms.internal.zzda;
        r0.<init>(r8);
        r8 = java.util.concurrent.Executors.newCachedThreadPool();	 Catch:{ zzcx -> 0x0169 }
        r0.zzaih = r8;	 Catch:{ zzcx -> 0x0169 }
        r0.zzahk = r11;	 Catch:{ zzcx -> 0x0169 }
        if (r11 == 0) goto L_0x001c;	 Catch:{ zzcx -> 0x0169 }
    L_0x000f:
        r8 = r0.zzaih;	 Catch:{ zzcx -> 0x0169 }
        r11 = new com.google.android.gms.internal.zzdb;	 Catch:{ zzcx -> 0x0169 }
        r11.<init>(r0);	 Catch:{ zzcx -> 0x0169 }
        r8 = r8.submit(r11);	 Catch:{ zzcx -> 0x0169 }
        r0.zzaim = r8;	 Catch:{ zzcx -> 0x0169 }
    L_0x001c:
        r8 = r0.zzaih;	 Catch:{ zzcx -> 0x0169 }
        r11 = new com.google.android.gms.internal.zzdd;	 Catch:{ zzcx -> 0x0169 }
        r11.<init>(r0);	 Catch:{ zzcx -> 0x0169 }
        r8.execute(r11);	 Catch:{ zzcx -> 0x0169 }
        r8 = 0;
        r11 = 1;
        r1 = com.google.android.gms.common.zze.zzafn();	 Catch:{ Throwable -> 0x0046 }
        r2 = r0.zzaif;	 Catch:{ Throwable -> 0x0046 }
        r2 = com.google.android.gms.common.zze.zzcd(r2);	 Catch:{ Throwable -> 0x0046 }
        if (r2 <= 0) goto L_0x0036;	 Catch:{ Throwable -> 0x0046 }
    L_0x0034:
        r2 = 1;	 Catch:{ Throwable -> 0x0046 }
        goto L_0x0037;	 Catch:{ Throwable -> 0x0046 }
    L_0x0036:
        r2 = 0;	 Catch:{ Throwable -> 0x0046 }
    L_0x0037:
        r0.zzaiq = r2;	 Catch:{ Throwable -> 0x0046 }
        r2 = r0.zzaif;	 Catch:{ Throwable -> 0x0046 }
        r1 = r1.isGooglePlayServicesAvailable(r2);	 Catch:{ Throwable -> 0x0046 }
        if (r1 != 0) goto L_0x0043;	 Catch:{ Throwable -> 0x0046 }
    L_0x0041:
        r1 = 1;	 Catch:{ Throwable -> 0x0046 }
        goto L_0x0044;	 Catch:{ Throwable -> 0x0046 }
    L_0x0043:
        r1 = 0;	 Catch:{ Throwable -> 0x0046 }
    L_0x0044:
        r0.zzair = r1;	 Catch:{ Throwable -> 0x0046 }
    L_0x0046:
        r0.zza(r8, r11);	 Catch:{ zzcx -> 0x0169 }
        r1 = com.google.android.gms.internal.zzdf.zzas();	 Catch:{ zzcx -> 0x0169 }
        if (r1 == 0) goto L_0x0069;	 Catch:{ zzcx -> 0x0169 }
    L_0x004f:
        r1 = com.google.android.gms.internal.zzmq.zzbmd;	 Catch:{ zzcx -> 0x0169 }
        r2 = com.google.android.gms.ads.internal.zzbs.zzep();	 Catch:{ zzcx -> 0x0169 }
        r1 = r2.zzd(r1);	 Catch:{ zzcx -> 0x0169 }
        r1 = (java.lang.Boolean) r1;	 Catch:{ zzcx -> 0x0169 }
        r1 = r1.booleanValue();	 Catch:{ zzcx -> 0x0169 }
        if (r1 == 0) goto L_0x0069;	 Catch:{ zzcx -> 0x0169 }
    L_0x0061:
        r8 = new java.lang.IllegalStateException;	 Catch:{ zzcx -> 0x0169 }
        r9 = "Task Context initialization must not be called from the UI thread.";	 Catch:{ zzcx -> 0x0169 }
        r8.<init>(r9);	 Catch:{ zzcx -> 0x0169 }
        throw r8;	 Catch:{ zzcx -> 0x0169 }
    L_0x0069:
        r1 = new com.google.android.gms.internal.zzcu;	 Catch:{ zzcx -> 0x0169 }
        r2 = 0;	 Catch:{ zzcx -> 0x0169 }
        r1.<init>(r2);	 Catch:{ zzcx -> 0x0169 }
        r0.zzaij = r1;	 Catch:{ zzcx -> 0x0169 }
        r1 = r0.zzaij;	 Catch:{ zzcv -> 0x0162 }
        r9 = r1.zzk(r9);	 Catch:{ zzcv -> 0x0162 }
        r0.zzaik = r9;	 Catch:{ zzcv -> 0x0162 }
        r9 = r0.zzaif;	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        r9 = r9.getCacheDir();	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        if (r9 != 0) goto L_0x0091;	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
    L_0x0081:
        r9 = r0.zzaif;	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        r1 = "dex";	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        r9 = r9.getDir(r1, r8);	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        if (r9 != 0) goto L_0x0091;	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
    L_0x008b:
        r8 = new com.google.android.gms.internal.zzcx;	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        r8.<init>();	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        throw r8;	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
    L_0x0091:
        r1 = "1501670890290";	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        r3 = new java.io.File;	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        r4 = "%s/%s.jar";	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        r5 = 2;	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        r6 = new java.lang.Object[r5];	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        r6[r8] = r9;	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        r6[r11] = r1;	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        r4 = java.lang.String.format(r4, r6);	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        r3.<init>(r4);	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        r4 = r3.exists();	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        if (r4 != 0) goto L_0x00c2;	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
    L_0x00ab:
        r4 = r0.zzaij;	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        r6 = r0.zzaik;	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        r10 = r4.zzb(r6, r10);	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        r3.createNewFile();	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        r4 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        r4.<init>(r3);	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        r6 = r10.length;	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        r4.write(r10, r8, r6);	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        r4.close();	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
    L_0x00c2:
        r0.zzb(r9, r1);	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        r10 = new dalvik.system.DexClassLoader;	 Catch:{ all -> 0x012f }
        r4 = r3.getAbsolutePath();	 Catch:{ all -> 0x012f }
        r6 = r9.getAbsolutePath();	 Catch:{ all -> 0x012f }
        r7 = r0.zzaif;	 Catch:{ all -> 0x012f }
        r7 = r7.getClassLoader();	 Catch:{ all -> 0x012f }
        r10.<init>(r4, r6, r2, r7);	 Catch:{ all -> 0x012f }
        r0.zzaii = r10;	 Catch:{ all -> 0x012f }
        zzb(r3);	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        r0.zza(r9, r1);	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        r10 = "%s/%s.dex";	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        r3 = new java.lang.Object[r5];	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        r3[r8] = r9;	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        r3[r11] = r1;	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        r8 = java.lang.String.format(r10, r3);	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        zzl(r8);	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        r8 = com.google.android.gms.internal.zzmq.zzblx;	 Catch:{ zzcx -> 0x0169 }
        r9 = com.google.android.gms.ads.internal.zzbs.zzep();	 Catch:{ zzcx -> 0x0169 }
        r8 = r9.zzd(r8);	 Catch:{ zzcx -> 0x0169 }
        r8 = (java.lang.Boolean) r8;	 Catch:{ zzcx -> 0x0169 }
        r8 = r8.booleanValue();	 Catch:{ zzcx -> 0x0169 }
        if (r8 == 0) goto L_0x0125;	 Catch:{ zzcx -> 0x0169 }
    L_0x0101:
        r8 = r0.zzaiv;	 Catch:{ zzcx -> 0x0169 }
        if (r8 != 0) goto L_0x0125;	 Catch:{ zzcx -> 0x0169 }
    L_0x0105:
        r8 = r0.zzaig;	 Catch:{ zzcx -> 0x0169 }
        if (r8 != 0) goto L_0x010a;	 Catch:{ zzcx -> 0x0169 }
    L_0x0109:
        goto L_0x0125;	 Catch:{ zzcx -> 0x0169 }
    L_0x010a:
        r8 = new android.content.IntentFilter;	 Catch:{ zzcx -> 0x0169 }
        r8.<init>();	 Catch:{ zzcx -> 0x0169 }
        r9 = "android.intent.action.USER_PRESENT";	 Catch:{ zzcx -> 0x0169 }
        r8.addAction(r9);	 Catch:{ zzcx -> 0x0169 }
        r9 = "android.intent.action.SCREEN_OFF";	 Catch:{ zzcx -> 0x0169 }
        r8.addAction(r9);	 Catch:{ zzcx -> 0x0169 }
        r9 = r0.zzaig;	 Catch:{ zzcx -> 0x0169 }
        r10 = new com.google.android.gms.internal.zzda$zza;	 Catch:{ zzcx -> 0x0169 }
        r10.<init>();	 Catch:{ zzcx -> 0x0169 }
        r9.registerReceiver(r10, r8);	 Catch:{ zzcx -> 0x0169 }
        r0.zzaiv = r11;	 Catch:{ zzcx -> 0x0169 }
    L_0x0125:
        r8 = new com.google.android.gms.internal.zzcm;	 Catch:{ zzcx -> 0x0169 }
        r8.<init>(r0);	 Catch:{ zzcx -> 0x0169 }
        r0.zzaip = r8;	 Catch:{ zzcx -> 0x0169 }
        r0.zzait = r11;	 Catch:{ zzcx -> 0x0169 }
        return r0;
    L_0x012f:
        r10 = move-exception;
        zzb(r3);	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        r0.zza(r9, r1);	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        r2 = "%s/%s.dex";	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        r3 = new java.lang.Object[r5];	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        r3[r8] = r9;	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        r3[r11] = r1;	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        r8 = java.lang.String.format(r2, r3);	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        zzl(r8);	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
        throw r10;	 Catch:{ FileNotFoundException -> 0x015b, IOException -> 0x0154, zzcv -> 0x014d, NullPointerException -> 0x0146 }
    L_0x0146:
        r8 = move-exception;
        r9 = new com.google.android.gms.internal.zzcx;	 Catch:{ zzcx -> 0x0169 }
        r9.<init>(r8);	 Catch:{ zzcx -> 0x0169 }
        throw r9;	 Catch:{ zzcx -> 0x0169 }
    L_0x014d:
        r8 = move-exception;	 Catch:{ zzcx -> 0x0169 }
        r9 = new com.google.android.gms.internal.zzcx;	 Catch:{ zzcx -> 0x0169 }
        r9.<init>(r8);	 Catch:{ zzcx -> 0x0169 }
        throw r9;	 Catch:{ zzcx -> 0x0169 }
    L_0x0154:
        r8 = move-exception;	 Catch:{ zzcx -> 0x0169 }
        r9 = new com.google.android.gms.internal.zzcx;	 Catch:{ zzcx -> 0x0169 }
        r9.<init>(r8);	 Catch:{ zzcx -> 0x0169 }
        throw r9;	 Catch:{ zzcx -> 0x0169 }
    L_0x015b:
        r8 = move-exception;	 Catch:{ zzcx -> 0x0169 }
        r9 = new com.google.android.gms.internal.zzcx;	 Catch:{ zzcx -> 0x0169 }
        r9.<init>(r8);	 Catch:{ zzcx -> 0x0169 }
        throw r9;	 Catch:{ zzcx -> 0x0169 }
    L_0x0162:
        r8 = move-exception;	 Catch:{ zzcx -> 0x0169 }
        r9 = new com.google.android.gms.internal.zzcx;	 Catch:{ zzcx -> 0x0169 }
        r9.<init>(r8);	 Catch:{ zzcx -> 0x0169 }
        throw r9;	 Catch:{ zzcx -> 0x0169 }
    L_0x0169:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzda.zza(android.content.Context, java.lang.String, java.lang.String, boolean):com.google.android.gms.internal.zzda");
    }

    private final void zza(java.io.File r8, java.lang.String r9) {
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
        r7 = this;
        r0 = new java.io.File;
        r1 = "%s/%s.tmp";
        r2 = 2;
        r3 = new java.lang.Object[r2];
        r4 = 0;
        r3[r4] = r8;
        r5 = 1;
        r3[r5] = r9;
        r1 = java.lang.String.format(r1, r3);
        r0.<init>(r1);
        r1 = r0.exists();
        if (r1 == 0) goto L_0x001b;
    L_0x001a:
        return;
    L_0x001b:
        r1 = new java.io.File;
        r3 = "%s/%s.dex";
        r2 = new java.lang.Object[r2];
        r2[r4] = r8;
        r2[r5] = r9;
        r8 = java.lang.String.format(r3, r2);
        r1.<init>(r8);
        r8 = r1.exists();
        if (r8 != 0) goto L_0x0033;
    L_0x0032:
        return;
    L_0x0033:
        r2 = r1.length();
        r5 = 0;
        r8 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1));
        if (r8 > 0) goto L_0x003e;
    L_0x003d:
        return;
    L_0x003e:
        r8 = (int) r2;
        r8 = new byte[r8];
        r2 = 0;
        r3 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x00af, IOException -> 0x00af, IOException -> 0x00af, all -> 0x009f }
        r3.<init>(r1);	 Catch:{ IOException -> 0x00af, IOException -> 0x00af, IOException -> 0x00af, all -> 0x009f }
        r5 = r3.read(r8);	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        if (r5 > 0) goto L_0x0054;
    L_0x004d:
        r3.close();	 Catch:{ IOException -> 0x0050 }
    L_0x0050:
        zzb(r1);
        return;
    L_0x0054:
        r5 = new com.google.android.gms.internal.zzba;	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r5.<init>();	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r6 = android.os.Build.VERSION.SDK;	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r6 = r6.getBytes();	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r5.zzgg = r6;	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r9 = r9.getBytes();	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r5.zzgf = r9;	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r9 = r7.zzaij;	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r6 = r7.zzaik;	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r8 = r9.zzc(r6, r8);	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r8 = r8.getBytes();	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r5.data = r8;	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r8 = com.google.android.gms.internal.zzbt.zzb(r8);	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r5.zzge = r8;	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r0.createNewFile();	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r8 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r8.<init>(r0);	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r9 = com.google.android.gms.internal.zzfhs.zzc(r5);	 Catch:{ IOException -> 0x009b, IOException -> 0x009b, IOException -> 0x009b, all -> 0x0098 }
        r0 = r9.length;	 Catch:{ IOException -> 0x009b, IOException -> 0x009b, IOException -> 0x009b, all -> 0x0098 }
        r8.write(r9, r4, r0);	 Catch:{ IOException -> 0x009b, IOException -> 0x009b, IOException -> 0x009b, all -> 0x0098 }
        r8.close();	 Catch:{ IOException -> 0x009b, IOException -> 0x009b, IOException -> 0x009b, all -> 0x0098 }
        r3.close();	 Catch:{ IOException -> 0x0091 }
    L_0x0091:
        r8.close();	 Catch:{ IOException -> 0x0094 }
    L_0x0094:
        zzb(r1);
        return;
    L_0x0098:
        r9 = move-exception;
        r2 = r8;
        goto L_0x00a1;
    L_0x009b:
        r2 = r8;
        goto L_0x00b0;
    L_0x009d:
        r9 = move-exception;
        goto L_0x00a1;
    L_0x009f:
        r9 = move-exception;
        r3 = r2;
    L_0x00a1:
        if (r3 == 0) goto L_0x00a6;
    L_0x00a3:
        r3.close();	 Catch:{ IOException -> 0x00a6 }
    L_0x00a6:
        if (r2 == 0) goto L_0x00ab;
    L_0x00a8:
        r2.close();	 Catch:{ IOException -> 0x00ab }
    L_0x00ab:
        zzb(r1);
        throw r9;
    L_0x00af:
        r3 = r2;
    L_0x00b0:
        if (r3 == 0) goto L_0x00b5;
    L_0x00b2:
        r3.close();	 Catch:{ IOException -> 0x00b5 }
    L_0x00b5:
        if (r2 == 0) goto L_0x00ba;
    L_0x00b7:
        r2.close();	 Catch:{ IOException -> 0x00ba }
    L_0x00ba:
        zzb(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzda.zza(java.io.File, java.lang.String):void");
    }

    private static boolean zza(int i, zzaw zzaw) {
        if (i < 4) {
            if (zzaw == null) {
                return true;
            }
            if (((Boolean) zzbs.zzep().zzd(zzmq.zzbmg)).booleanValue() && (zzaw.zzcq == null || zzaw.zzcq.equals("0000000000000000000000000000000000000000000000000000000000000000"))) {
                return true;
            }
            if (((Boolean) zzbs.zzep().zzd(zzmq.zzbmh)).booleanValue() && (zzaw.zzfb == null || zzaw.zzfb.zzfz == null || zzaw.zzfb.zzfz.longValue() == -2)) {
                return true;
            }
        }
        return false;
    }

    private final void zzao() {
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
        r2 = this;
        r0 = r2.zzail;	 Catch:{ GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015 }
        if (r0 != 0) goto L_0x0014;	 Catch:{ GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015 }
    L_0x0004:
        r0 = r2.zzaig;	 Catch:{ GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015 }
        if (r0 == 0) goto L_0x0014;	 Catch:{ GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015 }
    L_0x0008:
        r0 = new com.google.android.gms.ads.identifier.AdvertisingIdClient;	 Catch:{ GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015 }
        r1 = r2.zzaig;	 Catch:{ GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015 }
        r0.<init>(r1);	 Catch:{ GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015 }
        r0.start();	 Catch:{ GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015 }
        r2.zzail = r0;	 Catch:{ GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015 }
    L_0x0014:
        return;
    L_0x0015:
        r0 = 0;
        r2.zzail = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzda.zzao():void");
    }

    @android.support.annotation.VisibleForTesting
    private final com.google.android.gms.internal.zzaw zzap() {
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
        r3 = this;
        r0 = r3.zzaif;	 Catch:{ Throwable -> 0x0024 }
        r0 = r0.getPackageManager();	 Catch:{ Throwable -> 0x0024 }
        r1 = r3.zzaif;	 Catch:{ Throwable -> 0x0024 }
        r1 = r1.getPackageName();	 Catch:{ Throwable -> 0x0024 }
        r2 = 0;	 Catch:{ Throwable -> 0x0024 }
        r0 = r0.getPackageInfo(r1, r2);	 Catch:{ Throwable -> 0x0024 }
        r1 = r3.zzaif;	 Catch:{ Throwable -> 0x0024 }
        r2 = r3.zzaif;	 Catch:{ Throwable -> 0x0024 }
        r2 = r2.getPackageName();	 Catch:{ Throwable -> 0x0024 }
        r0 = r0.versionCode;	 Catch:{ Throwable -> 0x0024 }
        r0 = java.lang.Integer.toString(r0);	 Catch:{ Throwable -> 0x0024 }
        r0 = com.google.android.gms.internal.zzcaj.zzn(r1, r2, r0);	 Catch:{ Throwable -> 0x0024 }
        return r0;
    L_0x0024:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzda.zzap():com.google.android.gms.internal.zzaw");
    }

    private static void zzb(File file) {
        if (file.exists()) {
            file.delete();
            return;
        }
        Log.d(TAG, String.format("File %s not found. No need for deletion", new Object[]{file.getAbsolutePath()}));
    }

    private final boolean zzb(java.io.File r10, java.lang.String r11) {
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
        r9 = this;
        r0 = new java.io.File;
        r1 = "%s/%s.tmp";
        r2 = 2;
        r3 = new java.lang.Object[r2];
        r4 = 0;
        r3[r4] = r10;
        r5 = 1;
        r3[r5] = r11;
        r1 = java.lang.String.format(r1, r3);
        r0.<init>(r1);
        r1 = r0.exists();
        if (r1 != 0) goto L_0x001b;
    L_0x001a:
        return r4;
    L_0x001b:
        r1 = new java.io.File;
        r3 = "%s/%s.dex";
        r2 = new java.lang.Object[r2];
        r2[r4] = r10;
        r2[r5] = r11;
        r10 = java.lang.String.format(r3, r2);
        r1.<init>(r10);
        r10 = r1.exists();
        if (r10 == 0) goto L_0x0033;
    L_0x0032:
        return r4;
    L_0x0033:
        r10 = 0;
        r2 = r0.length();	 Catch:{ IOException -> 0x00d0, IOException -> 0x00d0, IOException -> 0x00d0, all -> 0x00c3 }
        r6 = 0;	 Catch:{ IOException -> 0x00d0, IOException -> 0x00d0, IOException -> 0x00d0, all -> 0x00c3 }
        r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));	 Catch:{ IOException -> 0x00d0, IOException -> 0x00d0, IOException -> 0x00d0, all -> 0x00c3 }
        if (r8 > 0) goto L_0x0042;	 Catch:{ IOException -> 0x00d0, IOException -> 0x00d0, IOException -> 0x00d0, all -> 0x00c3 }
    L_0x003e:
        zzb(r0);	 Catch:{ IOException -> 0x00d0, IOException -> 0x00d0, IOException -> 0x00d0, all -> 0x00c3 }
        return r4;	 Catch:{ IOException -> 0x00d0, IOException -> 0x00d0, IOException -> 0x00d0, all -> 0x00c3 }
    L_0x0042:
        r2 = (int) r2;	 Catch:{ IOException -> 0x00d0, IOException -> 0x00d0, IOException -> 0x00d0, all -> 0x00c3 }
        r2 = new byte[r2];	 Catch:{ IOException -> 0x00d0, IOException -> 0x00d0, IOException -> 0x00d0, all -> 0x00c3 }
        r3 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x00d0, IOException -> 0x00d0, IOException -> 0x00d0, all -> 0x00c3 }
        r3.<init>(r0);	 Catch:{ IOException -> 0x00d0, IOException -> 0x00d0, IOException -> 0x00d0, all -> 0x00c3 }
        r6 = r3.read(r2);	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        if (r6 > 0) goto L_0x005e;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
    L_0x0050:
        r11 = TAG;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r1 = "Cannot read the cache data.";	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        android.util.Log.d(r11, r1);	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        zzb(r0);	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r3.close();	 Catch:{ IOException -> 0x005d }
    L_0x005d:
        return r4;
    L_0x005e:
        r6 = new com.google.android.gms.internal.zzba;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r6.<init>();	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r2 = com.google.android.gms.internal.zzfhs.zza(r6, r2);	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r2 = (com.google.android.gms.internal.zzba) r2;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r6 = new java.lang.String;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r7 = r2.zzgf;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r6.<init>(r7);	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r11 = r11.equals(r6);	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        if (r11 == 0) goto L_0x00ba;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
    L_0x0076:
        r11 = r2.zzge;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r6 = r2.data;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r6 = com.google.android.gms.internal.zzbt.zzb(r6);	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r11 = java.util.Arrays.equals(r11, r6);	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        if (r11 == 0) goto L_0x00ba;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
    L_0x0084:
        r11 = r2.zzgg;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r6 = android.os.Build.VERSION.SDK;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r6 = r6.getBytes();	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r11 = java.util.Arrays.equals(r11, r6);	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        if (r11 != 0) goto L_0x0093;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
    L_0x0092:
        goto L_0x00ba;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
    L_0x0093:
        r11 = r9.zzaij;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r0 = r9.zzaik;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r6 = new java.lang.String;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r2 = r2.data;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r6.<init>(r2);	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r11 = r11.zzb(r0, r6);	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r1.createNewFile();	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r0 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r0.<init>(r1);	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r10 = r11.length;	 Catch:{ IOException -> 0x00b8, IOException -> 0x00b8, IOException -> 0x00b8, all -> 0x00b5 }
        r0.write(r11, r4, r10);	 Catch:{ IOException -> 0x00b8, IOException -> 0x00b8, IOException -> 0x00b8, all -> 0x00b5 }
        r3.close();	 Catch:{ IOException -> 0x00b1 }
    L_0x00b1:
        r0.close();	 Catch:{ IOException -> 0x00b4 }
    L_0x00b4:
        return r5;
    L_0x00b5:
        r11 = move-exception;
        r10 = r0;
        goto L_0x00c5;
    L_0x00b8:
        r10 = r0;
        goto L_0x00d1;
    L_0x00ba:
        zzb(r0);	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r3.close();	 Catch:{ IOException -> 0x00c0 }
    L_0x00c0:
        return r4;
    L_0x00c1:
        r11 = move-exception;
        goto L_0x00c5;
    L_0x00c3:
        r11 = move-exception;
        r3 = r10;
    L_0x00c5:
        if (r3 == 0) goto L_0x00ca;
    L_0x00c7:
        r3.close();	 Catch:{ IOException -> 0x00ca }
    L_0x00ca:
        if (r10 == 0) goto L_0x00cf;
    L_0x00cc:
        r10.close();	 Catch:{ IOException -> 0x00cf }
    L_0x00cf:
        throw r11;
    L_0x00d0:
        r3 = r10;
    L_0x00d1:
        if (r3 == 0) goto L_0x00d6;
    L_0x00d3:
        r3.close();	 Catch:{ IOException -> 0x00d6 }
    L_0x00d6:
        if (r10 == 0) goto L_0x00db;
    L_0x00d8:
        r10.close();	 Catch:{ IOException -> 0x00db }
    L_0x00db:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzda.zzb(java.io.File, java.lang.String):boolean");
    }

    private static void zzl(String str) {
        zzb(new File(str));
    }

    public final Context getApplicationContext() {
        return this.zzaig;
    }

    public final Context getContext() {
        return this.zzaif;
    }

    public final boolean isInitialized() {
        return this.zzait;
    }

    public final Method zza(String str, String str2) {
        zzea zzea = (zzea) this.zzais.get(new Pair(str, str2));
        return zzea == null ? null : zzea.zzay();
    }

    @VisibleForTesting
    final void zza(int i, boolean z) {
        if (this.zzair) {
            Future submit = this.zzaih.submit(new zzdc(this, i, z));
            if (i == 0) {
                this.zzaio = submit;
            }
        }
    }

    public final boolean zza(String str, String str2, Class<?>... clsArr) {
        if (this.zzais.containsKey(new Pair(str, str2))) {
            return false;
        }
        this.zzais.put(new Pair(str, str2), new zzea(this, str, str2, clsArr));
        return true;
    }

    public final int zzaa() {
        return this.zzaip != null ? zzcm.zzaa() : Integer.MIN_VALUE;
    }

    public final ExecutorService zzae() {
        return this.zzaih;
    }

    public final DexClassLoader zzaf() {
        return this.zzaii;
    }

    public final zzcu zzag() {
        return this.zzaij;
    }

    public final byte[] zzah() {
        return this.zzaik;
    }

    public final boolean zzai() {
        return this.zzaiq;
    }

    public final zzcm zzaj() {
        return this.zzaip;
    }

    public final boolean zzak() {
        return this.zzair;
    }

    public final boolean zzal() {
        return this.zzaiu;
    }

    public final zzaw zzam() {
        return this.zzain;
    }

    public final Future zzan() {
        return this.zzaio;
    }

    public final com.google.android.gms.ads.identifier.AdvertisingIdClient zzaq() {
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
        r0 = r5.zzahk;
        r1 = 0;
        if (r0 != 0) goto L_0x0006;
    L_0x0005:
        return r1;
    L_0x0006:
        r0 = r5.zzail;
        if (r0 == 0) goto L_0x000d;
    L_0x000a:
        r0 = r5.zzail;
        return r0;
    L_0x000d:
        r0 = r5.zzaim;
        if (r0 == 0) goto L_0x0023;
    L_0x0011:
        r0 = r5.zzaim;	 Catch:{ InterruptedException -> 0x0023, InterruptedException -> 0x0023, TimeoutException -> 0x001d }
        r2 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;	 Catch:{ InterruptedException -> 0x0023, InterruptedException -> 0x0023, TimeoutException -> 0x001d }
        r4 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ InterruptedException -> 0x0023, InterruptedException -> 0x0023, TimeoutException -> 0x001d }
        r0.get(r2, r4);	 Catch:{ InterruptedException -> 0x0023, InterruptedException -> 0x0023, TimeoutException -> 0x001d }
        r5.zzaim = r1;	 Catch:{ InterruptedException -> 0x0023, InterruptedException -> 0x0023, TimeoutException -> 0x001d }
        goto L_0x0023;
    L_0x001d:
        r0 = r5.zzaim;
        r1 = 1;
        r0.cancel(r1);
    L_0x0023:
        r0 = r5.zzail;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzda.zzaq():com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }

    @android.support.annotation.VisibleForTesting
    final com.google.android.gms.internal.zzaw zzb(int r1, boolean r2) {
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
        r0 = this;
        if (r1 <= 0) goto L_0x000a;
    L_0x0002:
        if (r2 == 0) goto L_0x000a;
    L_0x0004:
        r1 = r1 * 1000;
        r1 = (long) r1;
        java.lang.Thread.sleep(r1);	 Catch:{ InterruptedException -> 0x000a }
    L_0x000a:
        r1 = r0.zzap();
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzda.zzb(int, boolean):com.google.android.gms.internal.zzaw");
    }
}
