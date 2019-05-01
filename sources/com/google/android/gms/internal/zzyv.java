package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@zzzb
public class zzyv implements zzyz {
    private static final Object sLock = new Object();
    private static zzyz zzckp;
    private final Context mContext;
    private final ExecutorService zzaih = Executors.newCachedThreadPool();
    private final zzaiy zzaqi;
    private final Object zzckq = new Object();
    private final WeakHashMap<Thread, Boolean> zzckr = new WeakHashMap();

    protected zzyv(Context context) {
        this.mContext = context;
        this.zzaqi = zzaiy.zzqv();
        Thread thread = Looper.getMainLooper().getThread();
        if (thread != null) {
            synchronized (this.zzckq) {
                this.zzckr.put(thread, Boolean.valueOf(true));
            }
            thread.setUncaughtExceptionHandler(new zzyx(this, thread.getUncaughtExceptionHandler()));
        }
        Thread.setDefaultUncaughtExceptionHandler(new zzyw(this, Thread.getDefaultUncaughtExceptionHandler()));
    }

    public static zzyz zzk(Context context) {
        synchronized (sLock) {
            if (zzckp == null) {
                zzckp = new zzza();
            }
        }
        return zzckp;
    }

    private final void zzn(List<String> list) {
        for (String str : list) {
            this.zzaih.submit(new zzyy(this, new zzaix(), str));
        }
    }

    protected android.net.Uri.Builder zza(java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11) {
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
        r0 = r7.mContext;	 Catch:{ Throwable -> 0x000b }
        r0 = com.google.android.gms.internal.zzbgc.zzcy(r0);	 Catch:{ Throwable -> 0x000b }
        r0 = r0.zzamj();	 Catch:{ Throwable -> 0x000b }
        goto L_0x0012;
    L_0x000b:
        r0 = move-exception;
        r1 = "Error fetching instant app info";
        com.google.android.gms.internal.zzaiw.zzb(r1, r0);
        r0 = 0;
    L_0x0012:
        r1 = "unknown";
        r2 = r7.mContext;	 Catch:{ Throwable -> 0x0020 }
        r2 = r2.getApplicationContext();	 Catch:{ Throwable -> 0x0020 }
        r2 = r2.getPackageName();	 Catch:{ Throwable -> 0x0020 }
        r1 = r2;
        goto L_0x0025;
    L_0x0020:
        r2 = "Cannot obtain package name, proceeding.";
        com.google.android.gms.internal.zzaiw.zzco(r2);
    L_0x0025:
        r2 = new android.net.Uri$Builder;
        r2.<init>();
        r3 = "https";
        r2 = r2.scheme(r3);
        r3 = "//pagead2.googlesyndication.com/pagead/gen_204";
        r2 = r2.path(r3);
        r3 = "is_aia";
        r0 = java.lang.Boolean.toString(r0);
        r0 = r2.appendQueryParameter(r3, r0);
        r2 = "id";
        r3 = "gmob-apps-report-exception";
        r0 = r0.appendQueryParameter(r2, r3);
        r2 = "os";
        r3 = android.os.Build.VERSION.RELEASE;
        r0 = r0.appendQueryParameter(r2, r3);
        r2 = "api";
        r3 = android.os.Build.VERSION.SDK_INT;
        r3 = java.lang.String.valueOf(r3);
        r0 = r0.appendQueryParameter(r2, r3);
        r2 = "device";
        r3 = android.os.Build.MANUFACTURER;
        r4 = android.os.Build.MODEL;
        r5 = r4.startsWith(r3);
        if (r5 == 0) goto L_0x0069;
    L_0x0068:
        goto L_0x0090;
    L_0x0069:
        r5 = java.lang.String.valueOf(r3);
        r5 = r5.length();
        r5 = r5 + 1;
        r6 = java.lang.String.valueOf(r4);
        r6 = r6.length();
        r5 = r5 + r6;
        r6 = new java.lang.StringBuilder;
        r6.<init>(r5);
        r6.append(r3);
        r3 = " ";
        r6.append(r3);
        r6.append(r4);
        r4 = r6.toString();
    L_0x0090:
        r0 = r0.appendQueryParameter(r2, r4);
        r2 = "js";
        r3 = r7.zzaqi;
        r3 = r3.zzcp;
        r0 = r0.appendQueryParameter(r2, r3);
        r2 = "appid";
        r0 = r0.appendQueryParameter(r2, r1);
        r1 = "exceptiontype";
        r8 = r0.appendQueryParameter(r1, r8);
        r0 = "stacktrace";
        r8 = r8.appendQueryParameter(r0, r9);
        r9 = "exceptionkey";
        r8 = r8.appendQueryParameter(r9, r10);
        r9 = "cl";
        r10 = "173624900";
        r8 = r8.appendQueryParameter(r9, r10);
        r9 = "rc";
        r10 = "dev";
        r8 = r8.appendQueryParameter(r9, r10);
        r9 = "session_id";
        r10 = com.google.android.gms.internal.zzjk.zzhz();
        r8 = r8.appendQueryParameter(r9, r10);
        r9 = "sampling_rate";
        r10 = java.lang.Integer.toString(r11);
        r8 = r8.appendQueryParameter(r9, r10);
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzyv.zza(java.lang.String, java.lang.String, java.lang.String, int):android.net.Uri$Builder");
    }

    protected final void zza(Thread thread, Throwable th) {
        Object obj;
        String str;
        String name;
        String stringWriter;
        Object obj2 = null;
        if (th != null) {
            Throwable th2 = th;
            Object obj3 = null;
            Object obj4 = null;
            while (th2 != null) {
                Object obj5 = obj4;
                obj4 = obj3;
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    if (zzais.zzcm(stackTraceElement.getClassName())) {
                        obj4 = 1;
                    }
                    if (getClass().getName().equals(stackTraceElement.getClassName())) {
                        obj5 = 1;
                    }
                }
                th2 = th2.getCause();
                obj3 = obj4;
                obj4 = obj5;
            }
            if (obj3 != null && obj4 == null) {
                obj = 1;
                if (obj != null) {
                    str = "";
                    if (zzais.zzc(th) != null) {
                        name = th.getClass().getName();
                        Writer stringWriter2 = new StringWriter();
                        zzdtf.zza(th, new PrintWriter(stringWriter2));
                        stringWriter = stringWriter2.toString();
                        if (Math.random() < 1.0d) {
                            obj2 = 1;
                        }
                        if (obj2 != null) {
                            List arrayList = new ArrayList();
                            arrayList.add(zza(name, stringWriter, str, 1).toString());
                            zzn(arrayList);
                        }
                    }
                }
            }
        }
        obj = null;
        if (obj != null) {
            str = "";
            if (zzais.zzc(th) != null) {
                name = th.getClass().getName();
                Writer stringWriter22 = new StringWriter();
                zzdtf.zza(th, new PrintWriter(stringWriter22));
                stringWriter = stringWriter22.toString();
                if (Math.random() < 1.0d) {
                    obj2 = 1;
                }
                if (obj2 != null) {
                    List arrayList2 = new ArrayList();
                    arrayList2.add(zza(name, stringWriter, str, 1).toString());
                    zzn(arrayList2);
                }
            }
        }
    }

    public final void zza(Throwable th, String str) {
        if (zzais.zzc(th) != null) {
            String name = th.getClass().getName();
            Writer stringWriter = new StringWriter();
            zzdtf.zza(th, new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            if ((Math.random() < 1.0d ? 1 : null) != null) {
                List arrayList = new ArrayList();
                arrayList.add(zza(name, stringWriter2, str, 1).toString());
                zzn(arrayList);
            }
        }
    }
}
