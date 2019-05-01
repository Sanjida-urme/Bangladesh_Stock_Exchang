package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;

public final class zzdtc implements zzdou {
    private Mac zzlwe;
    private final int zzlwf;
    private final String zzlwg;
    private final Key zzlwh;

    public zzdtc(String str, Key key, int i) throws GeneralSecurityException {
        this.zzlwg = str;
        this.zzlwf = i;
        this.zzlwh = key;
        this.zzlwe = (Mac) zzdsr.zzlvv.zzod(str);
        this.zzlwe.init(key);
    }

    public final byte[] zzab(byte[] r4) throws java.security.GeneralSecurityException {
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
        r3 = this;
        r0 = r3.zzlwe;	 Catch:{ CloneNotSupportedException -> 0x0009 }
        r0 = r0.clone();	 Catch:{ CloneNotSupportedException -> 0x0009 }
        r0 = (javax.crypto.Mac) r0;	 Catch:{ CloneNotSupportedException -> 0x0009 }
        goto L_0x0018;
    L_0x0009:
        r0 = com.google.android.gms.internal.zzdsr.zzlvv;
        r1 = r3.zzlwg;
        r0 = r0.zzod(r1);
        r0 = (javax.crypto.Mac) r0;
        r1 = r3.zzlwh;
        r0.init(r1);
    L_0x0018:
        r0.update(r4);
        r4 = r3.zzlwf;
        r4 = new byte[r4];
        r0 = r0.doFinal();
        r1 = r3.zzlwf;
        r2 = 0;
        java.lang.System.arraycopy(r0, r2, r4, r2, r1);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzdtc.zzab(byte[]):byte[]");
    }
}
