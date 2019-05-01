package com.google.android.gms.internal;

import java.io.IOException;

public final class zzfie extends zzfhm<zzfie> {
    private static volatile zzfie[] zzpjj;
    public String url;
    public Integer zzjhl;
    public zzfhz zzpjk;
    private zzfib zzpjl;
    private Integer zzpjm;
    private int[] zzpjn;
    private String zzpjo;
    public Integer zzpjp;
    public String[] zzpjq;

    public zzfie() {
        this.zzjhl = null;
        this.url = null;
        this.zzpjk = null;
        this.zzpjl = null;
        this.zzpjm = null;
        this.zzpjn = zzfhv.zzphz;
        this.zzpjo = null;
        this.zzpjp = null;
        this.zzpjq = zzfhv.EMPTY_STRING_ARRAY;
        this.zzphm = null;
        this.zzpaw = -1;
    }

    private final com.google.android.gms.internal.zzfie zzaq(com.google.android.gms.internal.zzfhj r7) throws java.io.IOException {
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
        r1 = 0;
        switch(r0) {
            case 0: goto L_0x0132;
            case 8: goto L_0x0126;
            case 18: goto L_0x011e;
            case 26: goto L_0x010c;
            case 34: goto L_0x00fe;
            case 40: goto L_0x00f2;
            case 48: goto L_0x00be;
            case 50: goto L_0x007c;
            case 58: goto L_0x0075;
            case 64: goto L_0x0042;
            case 74: goto L_0x000f;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.zza(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000e:
        return r6;
    L_0x000f:
        r0 = 74;
        r0 = com.google.android.gms.internal.zzfhv.zzb(r7, r0);
        r2 = r6.zzpjq;
        if (r2 != 0) goto L_0x001b;
    L_0x0019:
        r2 = 0;
        goto L_0x001e;
    L_0x001b:
        r2 = r6.zzpjq;
        r2 = r2.length;
    L_0x001e:
        r0 = r0 + r2;
        r0 = new java.lang.String[r0];
        if (r2 == 0) goto L_0x0028;
    L_0x0023:
        r3 = r6.zzpjq;
        java.lang.System.arraycopy(r3, r1, r0, r1, r2);
    L_0x0028:
        r1 = r0.length;
        r1 = r1 + -1;
        if (r2 >= r1) goto L_0x0039;
    L_0x002d:
        r1 = r7.readString();
        r0[r2] = r1;
        r7.zzctt();
        r2 = r2 + 1;
        goto L_0x0028;
    L_0x0039:
        r1 = r7.readString();
        r0[r2] = r1;
        r6.zzpjq = r0;
        goto L_0x0000;
    L_0x0042:
        r1 = r7.getPosition();
        r2 = r7.zzctw();	 Catch:{ IllegalArgumentException -> 0x006e }
        switch(r2) {
            case 0: goto L_0x0050;
            case 1: goto L_0x0050;
            case 2: goto L_0x0050;
            case 3: goto L_0x0050;
            default: goto L_0x004d;
        };	 Catch:{ IllegalArgumentException -> 0x006e }
    L_0x004d:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x006e }
        goto L_0x0057;	 Catch:{ IllegalArgumentException -> 0x006e }
    L_0x0050:
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x006e }
        r6.zzpjp = r2;	 Catch:{ IllegalArgumentException -> 0x006e }
        goto L_0x0000;	 Catch:{ IllegalArgumentException -> 0x006e }
    L_0x0057:
        r4 = 46;	 Catch:{ IllegalArgumentException -> 0x006e }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x006e }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x006e }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x006e }
        r2 = " is not a valid enum AdResourceType";	 Catch:{ IllegalArgumentException -> 0x006e }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x006e }
        r2 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x006e }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x006e }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x006e }
    L_0x006e:
        r7.zzlw(r1);
        r6.zza(r7, r0);
        goto L_0x0000;
    L_0x0075:
        r0 = r7.readString();
        r6.zzpjo = r0;
        goto L_0x0000;
    L_0x007c:
        r0 = r7.zzcui();
        r0 = r7.zzkj(r0);
        r2 = r7.getPosition();
        r3 = 0;
    L_0x0089:
        r4 = r7.zzcuk();
        if (r4 <= 0) goto L_0x0095;
    L_0x008f:
        r7.zzctw();
        r3 = r3 + 1;
        goto L_0x0089;
    L_0x0095:
        r7.zzlw(r2);
        r2 = r6.zzpjn;
        if (r2 != 0) goto L_0x009e;
    L_0x009c:
        r2 = 0;
        goto L_0x00a1;
    L_0x009e:
        r2 = r6.zzpjn;
        r2 = r2.length;
    L_0x00a1:
        r3 = r3 + r2;
        r3 = new int[r3];
        if (r2 == 0) goto L_0x00ab;
    L_0x00a6:
        r4 = r6.zzpjn;
        java.lang.System.arraycopy(r4, r1, r3, r1, r2);
    L_0x00ab:
        r1 = r3.length;
        if (r2 >= r1) goto L_0x00b7;
    L_0x00ae:
        r1 = r7.zzctw();
        r3[r2] = r1;
        r2 = r2 + 1;
        goto L_0x00ab;
    L_0x00b7:
        r6.zzpjn = r3;
        r7.zzkk(r0);
        goto L_0x0000;
    L_0x00be:
        r0 = 48;
        r0 = com.google.android.gms.internal.zzfhv.zzb(r7, r0);
        r2 = r6.zzpjn;
        if (r2 != 0) goto L_0x00ca;
    L_0x00c8:
        r2 = 0;
        goto L_0x00cd;
    L_0x00ca:
        r2 = r6.zzpjn;
        r2 = r2.length;
    L_0x00cd:
        r0 = r0 + r2;
        r0 = new int[r0];
        if (r2 == 0) goto L_0x00d7;
    L_0x00d2:
        r3 = r6.zzpjn;
        java.lang.System.arraycopy(r3, r1, r0, r1, r2);
    L_0x00d7:
        r1 = r0.length;
        r1 = r1 + -1;
        if (r2 >= r1) goto L_0x00e8;
    L_0x00dc:
        r1 = r7.zzctw();
        r0[r2] = r1;
        r7.zzctt();
        r2 = r2 + 1;
        goto L_0x00d7;
    L_0x00e8:
        r1 = r7.zzctw();
        r0[r2] = r1;
        r6.zzpjn = r0;
        goto L_0x0000;
    L_0x00f2:
        r0 = r7.zzctw();
        r0 = java.lang.Integer.valueOf(r0);
        r6.zzpjm = r0;
        goto L_0x0000;
    L_0x00fe:
        r0 = r6.zzpjl;
        if (r0 != 0) goto L_0x0109;
    L_0x0102:
        r0 = new com.google.android.gms.internal.zzfib;
        r0.<init>();
        r6.zzpjl = r0;
    L_0x0109:
        r0 = r6.zzpjl;
        goto L_0x0119;
    L_0x010c:
        r0 = r6.zzpjk;
        if (r0 != 0) goto L_0x0117;
    L_0x0110:
        r0 = new com.google.android.gms.internal.zzfhz;
        r0.<init>();
        r6.zzpjk = r0;
    L_0x0117:
        r0 = r6.zzpjk;
    L_0x0119:
        r7.zza(r0);
        goto L_0x0000;
    L_0x011e:
        r0 = r7.readString();
        r6.url = r0;
        goto L_0x0000;
    L_0x0126:
        r0 = r7.zzctw();
        r0 = java.lang.Integer.valueOf(r0);
        r6.zzjhl = r0;
        goto L_0x0000;
    L_0x0132:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzfie.zzaq(com.google.android.gms.internal.zzfhj):com.google.android.gms.internal.zzfie");
    }

    public static zzfie[] zzcxo() {
        if (zzpjj == null) {
            synchronized (zzfhq.zzphu) {
                if (zzpjj == null) {
                    zzpjj = new zzfie[0];
                }
            }
        }
        return zzpjj;
    }

    public final /* synthetic */ zzfhs zza(zzfhj zzfhj) throws IOException {
        return zzaq(zzfhj);
    }

    public final void zza(zzfhk zzfhk) throws IOException {
        zzfhk.zzaa(1, this.zzjhl.intValue());
        if (this.url != null) {
            zzfhk.zzn(2, this.url);
        }
        if (this.zzpjk != null) {
            zzfhk.zza(3, this.zzpjk);
        }
        if (this.zzpjl != null) {
            zzfhk.zza(4, this.zzpjl);
        }
        if (this.zzpjm != null) {
            zzfhk.zzaa(5, this.zzpjm.intValue());
        }
        if (this.zzpjn != null && this.zzpjn.length > 0) {
            for (int zzaa : this.zzpjn) {
                zzfhk.zzaa(6, zzaa);
            }
        }
        if (this.zzpjo != null) {
            zzfhk.zzn(7, this.zzpjo);
        }
        if (this.zzpjp != null) {
            zzfhk.zzaa(8, this.zzpjp.intValue());
        }
        if (this.zzpjq != null && this.zzpjq.length > 0) {
            for (String str : this.zzpjq) {
                if (str != null) {
                    zzfhk.zzn(9, str);
                }
            }
        }
        super.zza(zzfhk);
    }

    protected final int zzo() {
        int i;
        int i2;
        int zzo = super.zzo() + zzfhk.zzad(1, this.zzjhl.intValue());
        if (this.url != null) {
            zzo += zzfhk.zzo(2, this.url);
        }
        if (this.zzpjk != null) {
            zzo += zzfhk.zzb(3, this.zzpjk);
        }
        if (this.zzpjl != null) {
            zzo += zzfhk.zzb(4, this.zzpjl);
        }
        if (this.zzpjm != null) {
            zzo += zzfhk.zzad(5, this.zzpjm.intValue());
        }
        if (this.zzpjn != null && this.zzpjn.length > 0) {
            i = 0;
            for (int zzky : this.zzpjn) {
                i += zzfhk.zzky(zzky);
            }
            zzo = (zzo + i) + (this.zzpjn.length * 1);
        }
        if (this.zzpjo != null) {
            zzo += zzfhk.zzo(7, this.zzpjo);
        }
        if (this.zzpjp != null) {
            zzo += zzfhk.zzad(8, this.zzpjp.intValue());
        }
        if (this.zzpjq == null || this.zzpjq.length <= 0) {
            return zzo;
        }
        i2 = 0;
        i = 0;
        for (String str : this.zzpjq) {
            if (str != null) {
                i++;
                i2 += zzfhk.zzte(str);
            }
        }
        return (zzo + i2) + (i * 1);
    }
}
