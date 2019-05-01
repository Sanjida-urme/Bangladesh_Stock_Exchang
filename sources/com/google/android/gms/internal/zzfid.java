package com.google.android.gms.internal;

import java.io.IOException;

public final class zzfid extends zzfhm<zzfid> {
    public String mimeType;
    public Integer zzpig;
    public byte[] zzpji;

    public zzfid() {
        this.zzpig = null;
        this.mimeType = null;
        this.zzpji = null;
        this.zzphm = null;
        this.zzpaw = -1;
    }

    private final com.google.android.gms.internal.zzfid zzap(com.google.android.gms.internal.zzfhj r7) throws java.io.IOException {
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
        if (r0 == 0) goto L_0x005a;
    L_0x0006:
        r1 = 8;
        if (r0 == r1) goto L_0x0027;
    L_0x000a:
        r1 = 18;
        if (r0 == r1) goto L_0x0020;
    L_0x000e:
        r1 = 26;
        if (r0 == r1) goto L_0x0019;
    L_0x0012:
        r0 = super.zza(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x0018:
        return r6;
    L_0x0019:
        r0 = r7.readBytes();
        r6.zzpji = r0;
        goto L_0x0000;
    L_0x0020:
        r0 = r7.readString();
        r6.mimeType = r0;
        goto L_0x0000;
    L_0x0027:
        r1 = r7.getPosition();
        r2 = r7.zzctw();	 Catch:{ IllegalArgumentException -> 0x0053 }
        switch(r2) {
            case 0: goto L_0x0035;
            case 1: goto L_0x0035;
            default: goto L_0x0032;
        };	 Catch:{ IllegalArgumentException -> 0x0053 }
    L_0x0032:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0053 }
        goto L_0x003c;	 Catch:{ IllegalArgumentException -> 0x0053 }
    L_0x0035:
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x0053 }
        r6.zzpig = r2;	 Catch:{ IllegalArgumentException -> 0x0053 }
        goto L_0x0000;	 Catch:{ IllegalArgumentException -> 0x0053 }
    L_0x003c:
        r4 = 36;	 Catch:{ IllegalArgumentException -> 0x0053 }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0053 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0053 }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0053 }
        r2 = " is not a valid enum Type";	 Catch:{ IllegalArgumentException -> 0x0053 }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0053 }
        r2 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x0053 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0053 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0053 }
    L_0x0053:
        r7.zzlw(r1);
        r6.zza(r7, r0);
        goto L_0x0000;
    L_0x005a:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzfid.zzap(com.google.android.gms.internal.zzfhj):com.google.android.gms.internal.zzfid");
    }

    public final /* synthetic */ zzfhs zza(zzfhj zzfhj) throws IOException {
        return zzap(zzfhj);
    }

    public final void zza(zzfhk zzfhk) throws IOException {
        if (this.zzpig != null) {
            zzfhk.zzaa(1, this.zzpig.intValue());
        }
        if (this.mimeType != null) {
            zzfhk.zzn(2, this.mimeType);
        }
        if (this.zzpji != null) {
            zzfhk.zzc(3, this.zzpji);
        }
        super.zza(zzfhk);
    }

    protected final int zzo() {
        int zzo = super.zzo();
        if (this.zzpig != null) {
            zzo += zzfhk.zzad(1, this.zzpig.intValue());
        }
        if (this.mimeType != null) {
            zzo += zzfhk.zzo(2, this.mimeType);
        }
        return this.zzpji != null ? zzo + zzfhk.zzd(3, this.zzpji) : zzo;
    }
}
