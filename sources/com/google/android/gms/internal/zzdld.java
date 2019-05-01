package com.google.android.gms.internal;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public class zzdld {
    private static Uri CONTENT_URI = Uri.parse("content://com.google.android.gsf.gservices");
    private static Uri zzlkb = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    private static Pattern zzlkc = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    private static Pattern zzlkd = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    private static final AtomicBoolean zzlke = new AtomicBoolean();
    private static HashMap<String, String> zzlkf;
    private static HashMap<String, Boolean> zzlkg = new HashMap();
    private static HashMap<String, Integer> zzlkh = new HashMap();
    private static HashMap<String, Long> zzlki = new HashMap();
    private static HashMap<String, Float> zzlkj = new HashMap();
    private static Object zzlkk;
    private static boolean zzlkl;
    private static String[] zzlkm = new String[0];

    public static long getLong(android.content.ContentResolver r4, java.lang.String r5, long r6) {
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
        r6 = zzb(r4);
        r7 = zzlki;
        r0 = 0;
        r2 = java.lang.Long.valueOf(r0);
        r7 = zza(r7, r5, r2);
        r7 = (java.lang.Long) r7;
        if (r7 == 0) goto L_0x0019;
    L_0x0014:
        r4 = r7.longValue();
        return r4;
    L_0x0019:
        r2 = 0;
        r4 = zza(r4, r5, r2);
        if (r4 != 0) goto L_0x0021;
    L_0x0020:
        goto L_0x002b;
    L_0x0021:
        r2 = java.lang.Long.parseLong(r4);	 Catch:{ NumberFormatException -> 0x002b }
        r4 = java.lang.Long.valueOf(r2);	 Catch:{ NumberFormatException -> 0x002b }
        r7 = r4;
        r0 = r2;
    L_0x002b:
        r4 = zzlki;
        zza(r6, r4, r5, r7);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzdld.getLong(android.content.ContentResolver, java.lang.String, long):long");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T> T zza(java.util.HashMap<java.lang.String, T> r2, java.lang.String r3, T r4) {
        /*
        r0 = com.google.android.gms.internal.zzdld.class;
        monitor-enter(r0);
        r1 = r2.containsKey(r3);	 Catch:{ all -> 0x0016 }
        if (r1 == 0) goto L_0x0013;
    L_0x0009:
        r2 = r2.get(r3);	 Catch:{ all -> 0x0016 }
        if (r2 == 0) goto L_0x0010;
    L_0x000f:
        goto L_0x0011;
    L_0x0010:
        r2 = r4;
    L_0x0011:
        monitor-exit(r0);	 Catch:{ all -> 0x0016 }
        return r2;
    L_0x0013:
        monitor-exit(r0);	 Catch:{ all -> 0x0016 }
        r2 = 0;
        return r2;
    L_0x0016:
        r2 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0016 }
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzdld.zza(java.util.HashMap, java.lang.String, java.lang.Object):T");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String zza(android.content.ContentResolver r13, java.lang.String r14, java.lang.String r15) {
        /*
        r15 = com.google.android.gms.internal.zzdld.class;
        monitor-enter(r15);
        zza(r13);	 Catch:{ all -> 0x00a6 }
        r0 = zzlkk;	 Catch:{ all -> 0x00a6 }
        r1 = zzlkf;	 Catch:{ all -> 0x00a6 }
        r1 = r1.containsKey(r14);	 Catch:{ all -> 0x00a6 }
        r2 = 0;
        if (r1 == 0) goto L_0x001f;
    L_0x0011:
        r13 = zzlkf;	 Catch:{ all -> 0x00a6 }
        r13 = r13.get(r14);	 Catch:{ all -> 0x00a6 }
        r13 = (java.lang.String) r13;	 Catch:{ all -> 0x00a6 }
        if (r13 == 0) goto L_0x001c;
    L_0x001b:
        goto L_0x001d;
    L_0x001c:
        r13 = r2;
    L_0x001d:
        monitor-exit(r15);	 Catch:{ all -> 0x00a6 }
        return r13;
    L_0x001f:
        r1 = zzlkm;	 Catch:{ all -> 0x00a6 }
        r3 = r1.length;	 Catch:{ all -> 0x00a6 }
        r4 = 0;
        r5 = 0;
    L_0x0024:
        r6 = 1;
        if (r5 >= r3) goto L_0x0063;
    L_0x0027:
        r7 = r1[r5];	 Catch:{ all -> 0x00a6 }
        r7 = r14.startsWith(r7);	 Catch:{ all -> 0x00a6 }
        if (r7 == 0) goto L_0x0060;
    L_0x002f:
        r0 = zzlkl;	 Catch:{ all -> 0x00a6 }
        if (r0 == 0) goto L_0x003b;
    L_0x0033:
        r0 = zzlkf;	 Catch:{ all -> 0x00a6 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x00a6 }
        if (r0 == 0) goto L_0x005e;
    L_0x003b:
        r0 = zzlkm;	 Catch:{ all -> 0x00a6 }
        r1 = zzlkf;	 Catch:{ all -> 0x00a6 }
        r13 = zza(r13, r0);	 Catch:{ all -> 0x00a6 }
        r1.putAll(r13);	 Catch:{ all -> 0x00a6 }
        zzlkl = r6;	 Catch:{ all -> 0x00a6 }
        r13 = zzlkf;	 Catch:{ all -> 0x00a6 }
        r13 = r13.containsKey(r14);	 Catch:{ all -> 0x00a6 }
        if (r13 == 0) goto L_0x005e;
    L_0x0050:
        r13 = zzlkf;	 Catch:{ all -> 0x00a6 }
        r13 = r13.get(r14);	 Catch:{ all -> 0x00a6 }
        r13 = (java.lang.String) r13;	 Catch:{ all -> 0x00a6 }
        if (r13 == 0) goto L_0x005b;
    L_0x005a:
        goto L_0x005c;
    L_0x005b:
        r13 = r2;
    L_0x005c:
        monitor-exit(r15);	 Catch:{ all -> 0x00a6 }
        return r13;
    L_0x005e:
        monitor-exit(r15);	 Catch:{ all -> 0x00a6 }
        return r2;
    L_0x0060:
        r5 = r5 + 1;
        goto L_0x0024;
    L_0x0063:
        monitor-exit(r15);	 Catch:{ all -> 0x00a6 }
        r8 = CONTENT_URI;
        r9 = 0;
        r10 = 0;
        r11 = new java.lang.String[r6];
        r11[r4] = r14;
        r12 = 0;
        r7 = r13;
        r13 = r7.query(r8, r9, r10, r11, r12);
        if (r13 == 0) goto L_0x0097;
    L_0x0074:
        r15 = r13.moveToFirst();	 Catch:{ all -> 0x0095 }
        if (r15 != 0) goto L_0x007b;
    L_0x007a:
        goto L_0x0097;
    L_0x007b:
        r15 = r13.getString(r6);	 Catch:{ all -> 0x0095 }
        if (r15 == 0) goto L_0x0088;
    L_0x0081:
        r1 = r15.equals(r2);	 Catch:{ all -> 0x0095 }
        if (r1 == 0) goto L_0x0088;
    L_0x0087:
        r15 = r2;
    L_0x0088:
        zza(r0, r14, r15);	 Catch:{ all -> 0x0095 }
        if (r15 == 0) goto L_0x008e;
    L_0x008d:
        goto L_0x008f;
    L_0x008e:
        r15 = r2;
    L_0x008f:
        if (r13 == 0) goto L_0x0094;
    L_0x0091:
        r13.close();
    L_0x0094:
        return r15;
    L_0x0095:
        r14 = move-exception;
        goto L_0x00a0;
    L_0x0097:
        zza(r0, r14, r2);	 Catch:{ all -> 0x0095 }
        if (r13 == 0) goto L_0x009f;
    L_0x009c:
        r13.close();
    L_0x009f:
        return r2;
    L_0x00a0:
        if (r13 == 0) goto L_0x00a5;
    L_0x00a2:
        r13.close();
    L_0x00a5:
        throw r14;
    L_0x00a6:
        r13 = move-exception;
        monitor-exit(r15);	 Catch:{ all -> 0x00a6 }
        throw r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzdld.zza(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String");
    }

    private static Map<String, String> zza(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(zzlkb, null, null, strArr, null);
        Map<String, String> treeMap = new TreeMap();
        if (query == null) {
            return treeMap;
        }
        while (query.moveToNext()) {
            try {
                treeMap.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return treeMap;
    }

    private static void zza(ContentResolver contentResolver) {
        if (zzlkf == null) {
            zzlke.set(false);
            zzlkf = new HashMap();
            zzlkk = new Object();
            zzlkl = false;
            contentResolver.registerContentObserver(CONTENT_URI, true, new zzdle(null));
            return;
        }
        if (zzlke.getAndSet(false)) {
            zzlkf.clear();
            zzlkg.clear();
            zzlkh.clear();
            zzlki.clear();
            zzlkj.clear();
            zzlkk = new Object();
            zzlkl = false;
        }
    }

    private static void zza(Object obj, String str, String str2) {
        synchronized (zzdld.class) {
            if (obj == zzlkk) {
                zzlkf.put(str, str2);
            }
        }
    }

    private static <T> void zza(Object obj, HashMap<String, T> hashMap, String str, T t) {
        synchronized (zzdld.class) {
            if (obj == zzlkk) {
                hashMap.put(str, t);
                zzlkf.remove(str);
            }
        }
    }

    public static boolean zza(ContentResolver contentResolver, String str, boolean z) {
        Object zzb = zzb(contentResolver);
        boolean z2 = false;
        Object obj = (Boolean) zza(zzlkg, str, Boolean.valueOf(false));
        if (obj != null) {
            return obj.booleanValue();
        }
        Object zza = zza(contentResolver, str, null);
        if (zza != null) {
            if (!zza.equals("")) {
                if (zzlkc.matcher(zza).matches()) {
                    obj = Boolean.valueOf(true);
                    z2 = true;
                } else if (zzlkd.matcher(zza).matches()) {
                    obj = Boolean.valueOf(false);
                } else {
                    StringBuilder stringBuilder = new StringBuilder("attempt to read gservices key ");
                    stringBuilder.append(str);
                    stringBuilder.append(" (value \"");
                    stringBuilder.append(zza);
                    stringBuilder.append("\") as boolean");
                    Log.w("Gservices", stringBuilder.toString());
                }
            }
        }
        zza(zzb, zzlkg, str, obj);
        return z2;
    }

    private static Object zzb(ContentResolver contentResolver) {
        Object obj;
        synchronized (zzdld.class) {
            zza(contentResolver);
            obj = zzlkk;
        }
        return obj;
    }
}
