package com.google.android.gms.internal;

import java.io.IOException;

public final class zzax extends zzfhm<zzax> {
    private static volatile zzax[] zzfc;
    public Long zzdh;
    public Long zzdi;
    public Long zzfd;
    public Long zzfe;
    public Long zzff;
    public Long zzfg;
    public Integer zzfh;
    public Long zzfi;
    public Long zzfj;
    public Long zzfk;
    public Integer zzfl;
    public Long zzfm;
    public Long zzfn;
    public Long zzfo;
    public Long zzfp;
    public Long zzfq;
    public Long zzfr;
    public Long zzfs;
    public Long zzft;
    public Long zzfu;
    public Long zzfv;

    public zzax() {
        this.zzdh = null;
        this.zzdi = null;
        this.zzfd = null;
        this.zzfe = null;
        this.zzff = null;
        this.zzfg = null;
        this.zzfi = null;
        this.zzfj = null;
        this.zzfk = null;
        this.zzfm = null;
        this.zzfn = null;
        this.zzfo = null;
        this.zzfp = null;
        this.zzfq = null;
        this.zzfr = null;
        this.zzfs = null;
        this.zzft = null;
        this.zzfu = null;
        this.zzfv = null;
        this.zzpaw = -1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.zzax zzc(com.google.android.gms.internal.zzfhj r4) throws java.io.IOException {
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
    L_0x0000:
        r0 = r4.zzctt();
        switch(r0) {
            case 0: goto L_0x0118;
            case 8: goto L_0x010c;
            case 16: goto L_0x0100;
            case 24: goto L_0x00f4;
            case 32: goto L_0x00e8;
            case 40: goto L_0x00dc;
            case 48: goto L_0x00d0;
            case 56: goto L_0x00b4;
            case 64: goto L_0x00a8;
            case 72: goto L_0x009c;
            case 80: goto L_0x0090;
            case 88: goto L_0x007c;
            case 96: goto L_0x0071;
            case 104: goto L_0x0066;
            case 112: goto L_0x005b;
            case 120: goto L_0x0050;
            case 128: goto L_0x0045;
            case 136: goto L_0x003a;
            case 144: goto L_0x002f;
            case 152: goto L_0x0024;
            case 160: goto L_0x0019;
            case 168: goto L_0x000e;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.zza(r4, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r3;
    L_0x000e:
        r0 = r4.zzcun();
        r0 = java.lang.Long.valueOf(r0);
        r3.zzfv = r0;
        goto L_0x0000;
    L_0x0019:
        r0 = r4.zzcun();
        r0 = java.lang.Long.valueOf(r0);
        r3.zzfu = r0;
        goto L_0x0000;
    L_0x0024:
        r0 = r4.zzcun();
        r0 = java.lang.Long.valueOf(r0);
        r3.zzft = r0;
        goto L_0x0000;
    L_0x002f:
        r0 = r4.zzcun();
        r0 = java.lang.Long.valueOf(r0);
        r3.zzfs = r0;
        goto L_0x0000;
    L_0x003a:
        r0 = r4.zzcun();
        r0 = java.lang.Long.valueOf(r0);
        r3.zzfr = r0;
        goto L_0x0000;
    L_0x0045:
        r0 = r4.zzcun();
        r0 = java.lang.Long.valueOf(r0);
        r3.zzfq = r0;
        goto L_0x0000;
    L_0x0050:
        r0 = r4.zzcun();
        r0 = java.lang.Long.valueOf(r0);
        r3.zzfp = r0;
        goto L_0x0000;
    L_0x005b:
        r0 = r4.zzcun();
        r0 = java.lang.Long.valueOf(r0);
        r3.zzfo = r0;
        goto L_0x0000;
    L_0x0066:
        r0 = r4.zzcun();
        r0 = java.lang.Long.valueOf(r0);
        r3.zzfn = r0;
        goto L_0x0000;
    L_0x0071:
        r0 = r4.zzcun();
        r0 = java.lang.Long.valueOf(r0);
        r3.zzfm = r0;
        goto L_0x0000;
    L_0x007c:
        r1 = r4.getPosition();
        r2 = r4.zzcui();	 Catch:{ IllegalArgumentException -> 0x00c8 }
        r2 = com.google.android.gms.internal.zzav.zzd(r2);	 Catch:{ IllegalArgumentException -> 0x00c8 }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x00c8 }
        r3.zzfl = r2;	 Catch:{ IllegalArgumentException -> 0x00c8 }
        goto L_0x0000;
    L_0x0090:
        r0 = r4.zzcun();
        r0 = java.lang.Long.valueOf(r0);
        r3.zzfk = r0;
        goto L_0x0000;
    L_0x009c:
        r0 = r4.zzcun();
        r0 = java.lang.Long.valueOf(r0);
        r3.zzfj = r0;
        goto L_0x0000;
    L_0x00a8:
        r0 = r4.zzcun();
        r0 = java.lang.Long.valueOf(r0);
        r3.zzfi = r0;
        goto L_0x0000;
    L_0x00b4:
        r1 = r4.getPosition();
        r2 = r4.zzcui();	 Catch:{ IllegalArgumentException -> 0x00c8 }
        r2 = com.google.android.gms.internal.zzav.zzd(r2);	 Catch:{ IllegalArgumentException -> 0x00c8 }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x00c8 }
        r3.zzfh = r2;	 Catch:{ IllegalArgumentException -> 0x00c8 }
        goto L_0x0000;
    L_0x00c8:
        r4.zzlw(r1);
        r3.zza(r4, r0);
        goto L_0x0000;
    L_0x00d0:
        r0 = r4.zzcun();
        r0 = java.lang.Long.valueOf(r0);
        r3.zzfg = r0;
        goto L_0x0000;
    L_0x00dc:
        r0 = r4.zzcun();
        r0 = java.lang.Long.valueOf(r0);
        r3.zzff = r0;
        goto L_0x0000;
    L_0x00e8:
        r0 = r4.zzcun();
        r0 = java.lang.Long.valueOf(r0);
        r3.zzfe = r0;
        goto L_0x0000;
    L_0x00f4:
        r0 = r4.zzcun();
        r0 = java.lang.Long.valueOf(r0);
        r3.zzfd = r0;
        goto L_0x0000;
    L_0x0100:
        r0 = r4.zzcun();
        r0 = java.lang.Long.valueOf(r0);
        r3.zzdi = r0;
        goto L_0x0000;
    L_0x010c:
        r0 = r4.zzcun();
        r0 = java.lang.Long.valueOf(r0);
        r3.zzdh = r0;
        goto L_0x0000;
    L_0x0118:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzax.zzc(com.google.android.gms.internal.zzfhj):com.google.android.gms.internal.zzax");
    }

    public static zzax[] zzp() {
        if (zzfc == null) {
            synchronized (zzfhq.zzphu) {
                if (zzfc == null) {
                    zzfc = new zzax[0];
                }
            }
        }
        return zzfc;
    }

    public final /* synthetic */ zzfhs zza(zzfhj zzfhj) throws IOException {
        return zzc(zzfhj);
    }

    public final void zza(zzfhk zzfhk) throws IOException {
        if (this.zzdh != null) {
            zzfhk.zzf(1, this.zzdh.longValue());
        }
        if (this.zzdi != null) {
            zzfhk.zzf(2, this.zzdi.longValue());
        }
        if (this.zzfd != null) {
            zzfhk.zzf(3, this.zzfd.longValue());
        }
        if (this.zzfe != null) {
            zzfhk.zzf(4, this.zzfe.longValue());
        }
        if (this.zzff != null) {
            zzfhk.zzf(5, this.zzff.longValue());
        }
        if (this.zzfg != null) {
            zzfhk.zzf(6, this.zzfg.longValue());
        }
        if (this.zzfh != null) {
            zzfhk.zzaa(7, this.zzfh.intValue());
        }
        if (this.zzfi != null) {
            zzfhk.zzf(8, this.zzfi.longValue());
        }
        if (this.zzfj != null) {
            zzfhk.zzf(9, this.zzfj.longValue());
        }
        if (this.zzfk != null) {
            zzfhk.zzf(10, this.zzfk.longValue());
        }
        if (this.zzfl != null) {
            zzfhk.zzaa(11, this.zzfl.intValue());
        }
        if (this.zzfm != null) {
            zzfhk.zzf(12, this.zzfm.longValue());
        }
        if (this.zzfn != null) {
            zzfhk.zzf(13, this.zzfn.longValue());
        }
        if (this.zzfo != null) {
            zzfhk.zzf(14, this.zzfo.longValue());
        }
        if (this.zzfp != null) {
            zzfhk.zzf(15, this.zzfp.longValue());
        }
        if (this.zzfq != null) {
            zzfhk.zzf(16, this.zzfq.longValue());
        }
        if (this.zzfr != null) {
            zzfhk.zzf(17, this.zzfr.longValue());
        }
        if (this.zzfs != null) {
            zzfhk.zzf(18, this.zzfs.longValue());
        }
        if (this.zzft != null) {
            zzfhk.zzf(19, this.zzft.longValue());
        }
        if (this.zzfu != null) {
            zzfhk.zzf(20, this.zzfu.longValue());
        }
        if (this.zzfv != null) {
            zzfhk.zzf(21, this.zzfv.longValue());
        }
        super.zza(zzfhk);
    }

    protected final int zzo() {
        int zzo = super.zzo();
        if (this.zzdh != null) {
            zzo += zzfhk.zzc(1, this.zzdh.longValue());
        }
        if (this.zzdi != null) {
            zzo += zzfhk.zzc(2, this.zzdi.longValue());
        }
        if (this.zzfd != null) {
            zzo += zzfhk.zzc(3, this.zzfd.longValue());
        }
        if (this.zzfe != null) {
            zzo += zzfhk.zzc(4, this.zzfe.longValue());
        }
        if (this.zzff != null) {
            zzo += zzfhk.zzc(5, this.zzff.longValue());
        }
        if (this.zzfg != null) {
            zzo += zzfhk.zzc(6, this.zzfg.longValue());
        }
        if (this.zzfh != null) {
            zzo += zzfhk.zzad(7, this.zzfh.intValue());
        }
        if (this.zzfi != null) {
            zzo += zzfhk.zzc(8, this.zzfi.longValue());
        }
        if (this.zzfj != null) {
            zzo += zzfhk.zzc(9, this.zzfj.longValue());
        }
        if (this.zzfk != null) {
            zzo += zzfhk.zzc(10, this.zzfk.longValue());
        }
        if (this.zzfl != null) {
            zzo += zzfhk.zzad(11, this.zzfl.intValue());
        }
        if (this.zzfm != null) {
            zzo += zzfhk.zzc(12, this.zzfm.longValue());
        }
        if (this.zzfn != null) {
            zzo += zzfhk.zzc(13, this.zzfn.longValue());
        }
        if (this.zzfo != null) {
            zzo += zzfhk.zzc(14, this.zzfo.longValue());
        }
        if (this.zzfp != null) {
            zzo += zzfhk.zzc(15, this.zzfp.longValue());
        }
        if (this.zzfq != null) {
            zzo += zzfhk.zzc(16, this.zzfq.longValue());
        }
        if (this.zzfr != null) {
            zzo += zzfhk.zzc(17, this.zzfr.longValue());
        }
        if (this.zzfs != null) {
            zzo += zzfhk.zzc(18, this.zzfs.longValue());
        }
        if (this.zzft != null) {
            zzo += zzfhk.zzc(19, this.zzft.longValue());
        }
        if (this.zzfu != null) {
            zzo += zzfhk.zzc(20, this.zzfu.longValue());
        }
        return this.zzfv != null ? zzo + zzfhk.zzc(21, this.zzfv.longValue()) : zzo;
    }
}
