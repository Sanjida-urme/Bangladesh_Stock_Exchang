package com.google.android.gms.internal;

import java.io.IOException;

public final class zzij extends zzfhm<zzij> {
    public Integer zzbbk;

    public zzij() {
        this.zzbbk = null;
        this.zzphm = null;
        this.zzpaw = -1;
    }

    private final com.google.android.gms.internal.zzij zzg(com.google.android.gms.internal.zzfhj r7) throws java.io.IOException {
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
        r6 = this;
    L_0x0000:
        r0 = r7.zzctt();
        if (r0 == 0) goto L_0x0044;
    L_0x0006:
        r1 = 56;
        if (r0 == r1) goto L_0x0011;
    L_0x000a:
        r0 = super.zza(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x0010:
        return r6;
    L_0x0011:
        r1 = r7.getPosition();
        r2 = r7.zzcui();	 Catch:{ IllegalArgumentException -> 0x003d }
        switch(r2) {
            case 0: goto L_0x001f;
            case 1: goto L_0x001f;
            case 2: goto L_0x001f;
            case 3: goto L_0x001f;
            case 4: goto L_0x001f;
            case 5: goto L_0x001f;
            case 6: goto L_0x001f;
            case 7: goto L_0x001f;
            case 8: goto L_0x001f;
            case 9: goto L_0x001f;
            default: goto L_0x001c;
        };	 Catch:{ IllegalArgumentException -> 0x003d }
    L_0x001c:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003d }
        goto L_0x0026;	 Catch:{ IllegalArgumentException -> 0x003d }
    L_0x001f:
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x003d }
        r6.zzbbk = r2;	 Catch:{ IllegalArgumentException -> 0x003d }
        goto L_0x0000;	 Catch:{ IllegalArgumentException -> 0x003d }
    L_0x0026:
        r4 = 43;	 Catch:{ IllegalArgumentException -> 0x003d }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003d }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003d }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003d }
        r2 = " is not a valid enum AdInitiater";	 Catch:{ IllegalArgumentException -> 0x003d }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003d }
        r2 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x003d }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x003d }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x003d }
    L_0x003d:
        r7.zzlw(r1);
        r6.zza(r7, r0);
        goto L_0x0000;
    L_0x0044:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzij.zzg(com.google.android.gms.internal.zzfhj):com.google.android.gms.internal.zzij");
    }

    public final /* synthetic */ zzfhs zza(zzfhj zzfhj) throws IOException {
        return zzg(zzfhj);
    }

    public final void zza(zzfhk zzfhk) throws IOException {
        if (this.zzbbk != null) {
            zzfhk.zzaa(7, this.zzbbk.intValue());
        }
        super.zza(zzfhk);
    }

    protected final int zzo() {
        int zzo = super.zzo();
        return this.zzbbk != null ? zzo + zzfhk.zzad(7, this.zzbbk.intValue()) : zzo;
    }
}
