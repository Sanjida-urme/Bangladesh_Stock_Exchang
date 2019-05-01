package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.zzae;
import com.google.android.gms.ads.internal.js.zzab;

final class zzti implements zzae {
    private /* synthetic */ zztf zzcay;
    private final zzab zzcaz;
    private final zzajy zzcba;

    public zzti(zztf zztf, zzab zzab, zzajy zzajy) {
        this.zzcay = zztf;
        this.zzcaz = zzab;
        this.zzcba = zzajy;
    }

    public final void zzat(java.lang.String r3) {
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
        r2 = this;
        if (r3 != 0) goto L_0x000f;
    L_0x0002:
        r3 = r2.zzcba;	 Catch:{ IllegalStateException -> 0x0019, all -> 0x000d }
        r0 = new com.google.android.gms.internal.zzst;	 Catch:{ IllegalStateException -> 0x0019, all -> 0x000d }
        r0.<init>();	 Catch:{ IllegalStateException -> 0x0019, all -> 0x000d }
        r3.setException(r0);	 Catch:{ IllegalStateException -> 0x0019, all -> 0x000d }
        goto L_0x0019;	 Catch:{ IllegalStateException -> 0x0019, all -> 0x000d }
    L_0x000d:
        r3 = move-exception;	 Catch:{ IllegalStateException -> 0x0019, all -> 0x000d }
        goto L_0x001f;	 Catch:{ IllegalStateException -> 0x0019, all -> 0x000d }
    L_0x000f:
        r0 = r2.zzcba;	 Catch:{ IllegalStateException -> 0x0019, all -> 0x000d }
        r1 = new com.google.android.gms.internal.zzst;	 Catch:{ IllegalStateException -> 0x0019, all -> 0x000d }
        r1.<init>(r3);	 Catch:{ IllegalStateException -> 0x0019, all -> 0x000d }
        r0.setException(r1);	 Catch:{ IllegalStateException -> 0x0019, all -> 0x000d }
    L_0x0019:
        r3 = r2.zzcaz;
        r3.release();
        return;
    L_0x001f:
        r0 = r2.zzcaz;
        r0.release();
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzti.zzat(java.lang.String):void");
    }

    public final void zze(org.json.JSONObject r3) {
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
        r2 = this;
        r0 = r2.zzcba;	 Catch:{ IllegalStateException -> 0x000f, JSONException -> 0x0017 }
        r1 = r2.zzcay;	 Catch:{ IllegalStateException -> 0x000f, JSONException -> 0x0017 }
        r1 = r1.zzcas;	 Catch:{ IllegalStateException -> 0x000f, JSONException -> 0x0017 }
        r3 = r1.zzf(r3);	 Catch:{ IllegalStateException -> 0x000f, JSONException -> 0x0017 }
        r0.set(r3);	 Catch:{ IllegalStateException -> 0x000f, JSONException -> 0x0017 }
    L_0x000f:
        r3 = r2.zzcaz;
        r3.release();
        return;
    L_0x0015:
        r3 = move-exception;
        goto L_0x001e;
    L_0x0017:
        r3 = move-exception;
        r0 = r2.zzcba;	 Catch:{ all -> 0x0015 }
        r0.set(r3);	 Catch:{ all -> 0x0015 }
        goto L_0x000f;
    L_0x001e:
        r0 = r2.zzcaz;
        r0.release();
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzti.zze(org.json.JSONObject):void");
    }
}
