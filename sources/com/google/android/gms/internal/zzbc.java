package com.google.android.gms.internal;

import java.io.IOException;

public final class zzbc extends zzfhm<zzbc> {
    public byte[] zzge;
    public byte[][] zzgj;
    private Integer zzgk;
    public Integer zzgl;

    public zzbc() {
        this.zzgj = zzfhv.zzpie;
        this.zzge = null;
        this.zzpaw = -1;
    }

    private final com.google.android.gms.internal.zzbc zzd(com.google.android.gms.internal.zzfhj r7) throws java.io.IOException {
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
        if (r0 == 0) goto L_0x00b7;
    L_0x0006:
        r1 = 10;
        if (r0 == r1) goto L_0x0084;
    L_0x000a:
        r1 = 18;
        if (r0 == r1) goto L_0x007c;
    L_0x000e:
        r1 = 24;
        if (r0 == r1) goto L_0x0049;
    L_0x0012:
        r1 = 32;
        if (r0 == r1) goto L_0x001d;
    L_0x0016:
        r0 = super.zza(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x001c:
        return r6;
    L_0x001d:
        r1 = r7.getPosition();
        r2 = r7.zzcui();	 Catch:{ IllegalArgumentException -> 0x0075 }
        switch(r2) {
            case 0: goto L_0x002b;
            case 1: goto L_0x002b;
            case 2: goto L_0x002b;
            default: goto L_0x0028;
        };	 Catch:{ IllegalArgumentException -> 0x0075 }
    L_0x0028:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0075 }
        goto L_0x0032;	 Catch:{ IllegalArgumentException -> 0x0075 }
    L_0x002b:
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x0075 }
        r6.zzgl = r2;	 Catch:{ IllegalArgumentException -> 0x0075 }
        goto L_0x0000;	 Catch:{ IllegalArgumentException -> 0x0075 }
    L_0x0032:
        r4 = 48;	 Catch:{ IllegalArgumentException -> 0x0075 }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0075 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0075 }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0075 }
        r2 = " is not a valid enum EncryptionMethod";	 Catch:{ IllegalArgumentException -> 0x0075 }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0075 }
        r2 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x0075 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0075 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0075 }
    L_0x0049:
        r1 = r7.getPosition();
        r2 = r7.zzcui();	 Catch:{ IllegalArgumentException -> 0x0075 }
        switch(r2) {
            case 0: goto L_0x0057;
            case 1: goto L_0x0057;
            default: goto L_0x0054;
        };	 Catch:{ IllegalArgumentException -> 0x0075 }
    L_0x0054:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0075 }
        goto L_0x005e;	 Catch:{ IllegalArgumentException -> 0x0075 }
    L_0x0057:
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x0075 }
        r6.zzgk = r2;	 Catch:{ IllegalArgumentException -> 0x0075 }
        goto L_0x0000;	 Catch:{ IllegalArgumentException -> 0x0075 }
    L_0x005e:
        r4 = 41;	 Catch:{ IllegalArgumentException -> 0x0075 }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0075 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0075 }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0075 }
        r2 = " is not a valid enum ProtoName";	 Catch:{ IllegalArgumentException -> 0x0075 }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0075 }
        r2 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x0075 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0075 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0075 }
    L_0x0075:
        r7.zzlw(r1);
        r6.zza(r7, r0);
        goto L_0x0000;
    L_0x007c:
        r0 = r7.readBytes();
        r6.zzge = r0;
        goto L_0x0000;
    L_0x0084:
        r0 = com.google.android.gms.internal.zzfhv.zzb(r7, r1);
        r1 = r6.zzgj;
        r2 = 0;
        if (r1 != 0) goto L_0x008f;
    L_0x008d:
        r1 = 0;
        goto L_0x0092;
    L_0x008f:
        r1 = r6.zzgj;
        r1 = r1.length;
    L_0x0092:
        r0 = r0 + r1;
        r0 = new byte[r0][];
        if (r1 == 0) goto L_0x009c;
    L_0x0097:
        r3 = r6.zzgj;
        java.lang.System.arraycopy(r3, r2, r0, r2, r1);
    L_0x009c:
        r2 = r0.length;
        r2 = r2 + -1;
        if (r1 >= r2) goto L_0x00ad;
    L_0x00a1:
        r2 = r7.readBytes();
        r0[r1] = r2;
        r7.zzctt();
        r1 = r1 + 1;
        goto L_0x009c;
    L_0x00ad:
        r2 = r7.readBytes();
        r0[r1] = r2;
        r6.zzgj = r0;
        goto L_0x0000;
    L_0x00b7:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzbc.zzd(com.google.android.gms.internal.zzfhj):com.google.android.gms.internal.zzbc");
    }

    public final /* synthetic */ zzfhs zza(zzfhj zzfhj) throws IOException {
        return zzd(zzfhj);
    }

    public final void zza(zzfhk zzfhk) throws IOException {
        if (this.zzgj != null && this.zzgj.length > 0) {
            for (byte[] bArr : this.zzgj) {
                if (bArr != null) {
                    zzfhk.zzc(1, bArr);
                }
            }
        }
        if (this.zzge != null) {
            zzfhk.zzc(2, this.zzge);
        }
        if (this.zzgk != null) {
            zzfhk.zzaa(3, this.zzgk.intValue());
        }
        if (this.zzgl != null) {
            zzfhk.zzaa(4, this.zzgl.intValue());
        }
        super.zza(zzfhk);
    }

    protected final int zzo() {
        int zzo = super.zzo();
        if (this.zzgj != null && this.zzgj.length > 0) {
            int i = 0;
            int i2 = 0;
            for (byte[] bArr : this.zzgj) {
                if (bArr != null) {
                    i2++;
                    i += zzfhk.zzbf(bArr);
                }
            }
            zzo = (zzo + i) + (i2 * 1);
        }
        if (this.zzge != null) {
            zzo += zzfhk.zzd(2, this.zzge);
        }
        if (this.zzgk != null) {
            zzo += zzfhk.zzad(3, this.zzgk.intValue());
        }
        return this.zzgl != null ? zzo + zzfhk.zzad(4, this.zzgl.intValue()) : zzo;
    }
}
