package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbs;
import java.util.WeakHashMap;

@zzzb
public final class zzyu extends zzyv {
    private static final Object sLock = new Object();
    private static zzyz zzckp;
    private final Context mContext;
    private final String mPackageName;
    private final Object zzckq = new Object();
    private final WeakHashMap<Thread, Boolean> zzckr = new WeakHashMap();

    private zzyu(Context context, String str, zzaiy zzaiy) {
        super(context);
        this.mContext = context;
        this.mPackageName = str;
    }

    public static com.google.android.gms.internal.zzyz zzc(android.content.Context r3, com.google.android.gms.internal.zzaiy r4) {
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
        r0 = sLock;
        monitor-enter(r0);
        r1 = zzckp;	 Catch:{ all -> 0x0041 }
        if (r1 != 0) goto L_0x003d;	 Catch:{ all -> 0x0041 }
    L_0x0007:
        r1 = com.google.android.gms.internal.zzmq.zzbgd;	 Catch:{ all -> 0x0041 }
        r2 = com.google.android.gms.ads.internal.zzbs.zzep();	 Catch:{ all -> 0x0041 }
        r1 = r2.zzd(r1);	 Catch:{ all -> 0x0041 }
        r1 = (java.lang.Boolean) r1;	 Catch:{ all -> 0x0041 }
        r1 = r1.booleanValue();	 Catch:{ all -> 0x0041 }
        if (r1 == 0) goto L_0x0036;	 Catch:{ all -> 0x0041 }
    L_0x0019:
        r1 = "unknown";	 Catch:{ all -> 0x0041 }
        r2 = r3.getApplicationContext();	 Catch:{ Throwable -> 0x0025 }
        r2 = r2.getPackageName();	 Catch:{ Throwable -> 0x0025 }
        r1 = r2;
        goto L_0x002a;
    L_0x0025:
        r2 = "Cannot obtain package name, proceeding.";	 Catch:{ all -> 0x0041 }
        com.google.android.gms.internal.zzaiw.zzco(r2);	 Catch:{ all -> 0x0041 }
    L_0x002a:
        r2 = new com.google.android.gms.internal.zzyu;	 Catch:{ all -> 0x0041 }
        r3 = r3.getApplicationContext();	 Catch:{ all -> 0x0041 }
        r2.<init>(r3, r1, r4);	 Catch:{ all -> 0x0041 }
        zzckp = r2;	 Catch:{ all -> 0x0041 }
        goto L_0x003d;	 Catch:{ all -> 0x0041 }
    L_0x0036:
        r3 = new com.google.android.gms.internal.zzza;	 Catch:{ all -> 0x0041 }
        r3.<init>();	 Catch:{ all -> 0x0041 }
        zzckp = r3;	 Catch:{ all -> 0x0041 }
    L_0x003d:
        monitor-exit(r0);	 Catch:{ all -> 0x0041 }
        r3 = zzckp;
        return r3;
    L_0x0041:
        r3 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0041 }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzyu.zzc(android.content.Context, com.google.android.gms.internal.zzaiy):com.google.android.gms.internal.zzyz");
    }

    protected final Builder zza(String str, String str2, String str3, int i) {
        Builder zza = super.zza(str, str2, str3, i);
        zza.appendQueryParameter("eids", TextUtils.join(",", zzmq.zziq()));
        zza.appendQueryParameter("pb_tm", String.valueOf(zzbs.zzep().zzd(zzmq.zzbpz)));
        return zza;
    }
}
