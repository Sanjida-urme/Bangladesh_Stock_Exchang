package com.google.android.gms.internal;

import java.io.IOException;

public final class zzfhw extends zzfhm<zzfhw> {
    public String url;
    public Integer zzpig;
    private Integer zzpih;
    public String zzpii;
    private String zzpij;
    public zzfhx zzpik;
    public zzfie[] zzpil;
    public String zzpim;
    public zzfid zzpin;
    private Boolean zzpio;
    private String[] zzpip;
    private String zzpiq;
    private Boolean zzpir;
    private Boolean zzpis;
    private byte[] zzpit;
    public zzfif zzpiu;

    public zzfhw() {
        this.zzpig = null;
        this.zzpih = null;
        this.url = null;
        this.zzpii = null;
        this.zzpij = null;
        this.zzpik = null;
        this.zzpil = zzfie.zzcxo();
        this.zzpim = null;
        this.zzpin = null;
        this.zzpio = null;
        this.zzpip = zzfhv.EMPTY_STRING_ARRAY;
        this.zzpiq = null;
        this.zzpir = null;
        this.zzpis = null;
        this.zzpit = null;
        this.zzpiu = null;
        this.zzphm = null;
        this.zzpaw = -1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.zzfhw zzao(com.google.android.gms.internal.zzfhj r7) throws java.io.IOException {
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
            case 0: goto L_0x0163;
            case 10: goto L_0x015b;
            case 18: goto L_0x0153;
            case 26: goto L_0x014b;
            case 34: goto L_0x010b;
            case 40: goto L_0x00ff;
            case 50: goto L_0x00cb;
            case 58: goto L_0x00c3;
            case 64: goto L_0x00b7;
            case 72: goto L_0x00ab;
            case 80: goto L_0x0076;
            case 88: goto L_0x004a;
            case 98: goto L_0x0039;
            case 106: goto L_0x0032;
            case 114: goto L_0x0024;
            case 122: goto L_0x001d;
            case 138: goto L_0x000f;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.zza(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000e:
        return r6;
    L_0x000f:
        r0 = r6.zzpiu;
        if (r0 != 0) goto L_0x001a;
    L_0x0013:
        r0 = new com.google.android.gms.internal.zzfif;
        r0.<init>();
        r6.zzpiu = r0;
    L_0x001a:
        r0 = r6.zzpiu;
        goto L_0x0046;
    L_0x001d:
        r0 = r7.readBytes();
        r6.zzpit = r0;
        goto L_0x0000;
    L_0x0024:
        r0 = r6.zzpin;
        if (r0 != 0) goto L_0x002f;
    L_0x0028:
        r0 = new com.google.android.gms.internal.zzfid;
        r0.<init>();
        r6.zzpin = r0;
    L_0x002f:
        r0 = r6.zzpin;
        goto L_0x0046;
    L_0x0032:
        r0 = r7.readString();
        r6.zzpim = r0;
        goto L_0x0000;
    L_0x0039:
        r0 = r6.zzpik;
        if (r0 != 0) goto L_0x0044;
    L_0x003d:
        r0 = new com.google.android.gms.internal.zzfhx;
        r0.<init>();
        r6.zzpik = r0;
    L_0x0044:
        r0 = r6.zzpik;
    L_0x0046:
        r7.zza(r0);
        goto L_0x0000;
    L_0x004a:
        r1 = r7.getPosition();
        r2 = r7.zzctw();	 Catch:{ IllegalArgumentException -> 0x00a3 }
        switch(r2) {
            case 0: goto L_0x0058;
            case 1: goto L_0x0058;
            case 2: goto L_0x0058;
            case 3: goto L_0x0058;
            case 4: goto L_0x0058;
            default: goto L_0x0055;
        };	 Catch:{ IllegalArgumentException -> 0x00a3 }
    L_0x0055:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00a3 }
        goto L_0x005f;	 Catch:{ IllegalArgumentException -> 0x00a3 }
    L_0x0058:
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r6.zzpih = r2;	 Catch:{ IllegalArgumentException -> 0x00a3 }
        goto L_0x0000;	 Catch:{ IllegalArgumentException -> 0x00a3 }
    L_0x005f:
        r4 = 39;	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r2 = " is not a valid enum Verdict";	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r2 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x00a3 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x00a3 }
    L_0x0076:
        r1 = r7.getPosition();
        r2 = r7.zzctw();	 Catch:{ IllegalArgumentException -> 0x00a3 }
        switch(r2) {
            case 0: goto L_0x0084;
            case 1: goto L_0x0084;
            case 2: goto L_0x0084;
            case 3: goto L_0x0084;
            case 4: goto L_0x0084;
            case 5: goto L_0x0084;
            case 6: goto L_0x0084;
            case 7: goto L_0x0084;
            case 8: goto L_0x0084;
            case 9: goto L_0x0084;
            default: goto L_0x0081;
        };	 Catch:{ IllegalArgumentException -> 0x00a3 }
    L_0x0081:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00a3 }
        goto L_0x008c;	 Catch:{ IllegalArgumentException -> 0x00a3 }
    L_0x0084:
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r6.zzpig = r2;	 Catch:{ IllegalArgumentException -> 0x00a3 }
        goto L_0x0000;	 Catch:{ IllegalArgumentException -> 0x00a3 }
    L_0x008c:
        r4 = 42;	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r2 = " is not a valid enum ReportType";	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r2 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x00a3 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x00a3 }
    L_0x00a3:
        r7.zzlw(r1);
        r6.zza(r7, r0);
        goto L_0x0000;
    L_0x00ab:
        r0 = r7.zzctz();
        r0 = java.lang.Boolean.valueOf(r0);
        r6.zzpis = r0;
        goto L_0x0000;
    L_0x00b7:
        r0 = r7.zzctz();
        r0 = java.lang.Boolean.valueOf(r0);
        r6.zzpir = r0;
        goto L_0x0000;
    L_0x00c3:
        r0 = r7.readString();
        r6.zzpiq = r0;
        goto L_0x0000;
    L_0x00cb:
        r0 = 50;
        r0 = com.google.android.gms.internal.zzfhv.zzb(r7, r0);
        r2 = r6.zzpip;
        if (r2 != 0) goto L_0x00d7;
    L_0x00d5:
        r2 = 0;
        goto L_0x00da;
    L_0x00d7:
        r2 = r6.zzpip;
        r2 = r2.length;
    L_0x00da:
        r0 = r0 + r2;
        r0 = new java.lang.String[r0];
        if (r2 == 0) goto L_0x00e4;
    L_0x00df:
        r3 = r6.zzpip;
        java.lang.System.arraycopy(r3, r1, r0, r1, r2);
    L_0x00e4:
        r1 = r0.length;
        r1 = r1 + -1;
        if (r2 >= r1) goto L_0x00f5;
    L_0x00e9:
        r1 = r7.readString();
        r0[r2] = r1;
        r7.zzctt();
        r2 = r2 + 1;
        goto L_0x00e4;
    L_0x00f5:
        r1 = r7.readString();
        r0[r2] = r1;
        r6.zzpip = r0;
        goto L_0x0000;
    L_0x00ff:
        r0 = r7.zzctz();
        r0 = java.lang.Boolean.valueOf(r0);
        r6.zzpio = r0;
        goto L_0x0000;
    L_0x010b:
        r0 = 34;
        r0 = com.google.android.gms.internal.zzfhv.zzb(r7, r0);
        r2 = r6.zzpil;
        if (r2 != 0) goto L_0x0117;
    L_0x0115:
        r2 = 0;
        goto L_0x011a;
    L_0x0117:
        r2 = r6.zzpil;
        r2 = r2.length;
    L_0x011a:
        r0 = r0 + r2;
        r0 = new com.google.android.gms.internal.zzfie[r0];
        if (r2 == 0) goto L_0x0124;
    L_0x011f:
        r3 = r6.zzpil;
        java.lang.System.arraycopy(r3, r1, r0, r1, r2);
    L_0x0124:
        r1 = r0.length;
        r1 = r1 + -1;
        if (r2 >= r1) goto L_0x013b;
    L_0x0129:
        r1 = new com.google.android.gms.internal.zzfie;
        r1.<init>();
        r0[r2] = r1;
        r1 = r0[r2];
        r7.zza(r1);
        r7.zzctt();
        r2 = r2 + 1;
        goto L_0x0124;
    L_0x013b:
        r1 = new com.google.android.gms.internal.zzfie;
        r1.<init>();
        r0[r2] = r1;
        r1 = r0[r2];
        r7.zza(r1);
        r6.zzpil = r0;
        goto L_0x0000;
    L_0x014b:
        r0 = r7.readString();
        r6.zzpij = r0;
        goto L_0x0000;
    L_0x0153:
        r0 = r7.readString();
        r6.zzpii = r0;
        goto L_0x0000;
    L_0x015b:
        r0 = r7.readString();
        r6.url = r0;
        goto L_0x0000;
    L_0x0163:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzfhw.zzao(com.google.android.gms.internal.zzfhj):com.google.android.gms.internal.zzfhw");
    }

    public final /* synthetic */ zzfhs zza(zzfhj zzfhj) throws IOException {
        return zzao(zzfhj);
    }

    public final void zza(zzfhk zzfhk) throws IOException {
        if (this.url != null) {
            zzfhk.zzn(1, this.url);
        }
        if (this.zzpii != null) {
            zzfhk.zzn(2, this.zzpii);
        }
        if (this.zzpij != null) {
            zzfhk.zzn(3, this.zzpij);
        }
        if (this.zzpil != null && this.zzpil.length > 0) {
            for (zzfhs zzfhs : this.zzpil) {
                if (zzfhs != null) {
                    zzfhk.zza(4, zzfhs);
                }
            }
        }
        if (this.zzpio != null) {
            zzfhk.zzl(5, this.zzpio.booleanValue());
        }
        if (this.zzpip != null && this.zzpip.length > 0) {
            for (String str : this.zzpip) {
                if (str != null) {
                    zzfhk.zzn(6, str);
                }
            }
        }
        if (this.zzpiq != null) {
            zzfhk.zzn(7, this.zzpiq);
        }
        if (this.zzpir != null) {
            zzfhk.zzl(8, this.zzpir.booleanValue());
        }
        if (this.zzpis != null) {
            zzfhk.zzl(9, this.zzpis.booleanValue());
        }
        if (this.zzpig != null) {
            zzfhk.zzaa(10, this.zzpig.intValue());
        }
        if (this.zzpih != null) {
            zzfhk.zzaa(11, this.zzpih.intValue());
        }
        if (this.zzpik != null) {
            zzfhk.zza(12, this.zzpik);
        }
        if (this.zzpim != null) {
            zzfhk.zzn(13, this.zzpim);
        }
        if (this.zzpin != null) {
            zzfhk.zza(14, this.zzpin);
        }
        if (this.zzpit != null) {
            zzfhk.zzc(15, this.zzpit);
        }
        if (this.zzpiu != null) {
            zzfhk.zza(17, this.zzpiu);
        }
        super.zza(zzfhk);
    }

    protected final int zzo() {
        int i;
        int zzo = super.zzo();
        if (this.url != null) {
            zzo += zzfhk.zzo(1, this.url);
        }
        if (this.zzpii != null) {
            zzo += zzfhk.zzo(2, this.zzpii);
        }
        if (this.zzpij != null) {
            zzo += zzfhk.zzo(3, this.zzpij);
        }
        if (this.zzpil != null && this.zzpil.length > 0) {
            i = zzo;
            for (zzfhs zzfhs : this.zzpil) {
                if (zzfhs != null) {
                    i += zzfhk.zzb(4, zzfhs);
                }
            }
            zzo = i;
        }
        if (this.zzpio != null) {
            this.zzpio.booleanValue();
            zzo += zzfhk.zzkx(5) + 1;
        }
        if (this.zzpip != null && this.zzpip.length > 0) {
            i = 0;
            int i2 = 0;
            for (String str : this.zzpip) {
                if (str != null) {
                    i2++;
                    i += zzfhk.zzte(str);
                }
            }
            zzo = (zzo + i) + (i2 * 1);
        }
        if (this.zzpiq != null) {
            zzo += zzfhk.zzo(7, this.zzpiq);
        }
        if (this.zzpir != null) {
            this.zzpir.booleanValue();
            zzo += zzfhk.zzkx(8) + 1;
        }
        if (this.zzpis != null) {
            this.zzpis.booleanValue();
            zzo += zzfhk.zzkx(9) + 1;
        }
        if (this.zzpig != null) {
            zzo += zzfhk.zzad(10, this.zzpig.intValue());
        }
        if (this.zzpih != null) {
            zzo += zzfhk.zzad(11, this.zzpih.intValue());
        }
        if (this.zzpik != null) {
            zzo += zzfhk.zzb(12, this.zzpik);
        }
        if (this.zzpim != null) {
            zzo += zzfhk.zzo(13, this.zzpim);
        }
        if (this.zzpin != null) {
            zzo += zzfhk.zzb(14, this.zzpin);
        }
        if (this.zzpit != null) {
            zzo += zzfhk.zzd(15, this.zzpit);
        }
        return this.zzpiu != null ? zzo + zzfhk.zzb(17, this.zzpiu) : zzo;
    }
}
