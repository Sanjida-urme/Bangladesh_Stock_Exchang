package com.google.android.gms.internal;

public class zzffk {
    private static final zzfei zzpax = zzfei.zzcva();
    private zzfdp zzpdk;
    private volatile zzffq zzpdl;
    private volatile zzfdp zzpdm;

    private zzfdp toByteString() {
        if (this.zzpdm != null) {
            return this.zzpdm;
        }
        synchronized (this) {
            if (this.zzpdm != null) {
                zzfdp zzfdp = this.zzpdm;
                return zzfdp;
            }
            this.zzpdm = this.zzpdl == null ? zzfdp.zzpaz : this.zzpdl.toByteString();
            zzfdp = this.zzpdm;
            return zzfdp;
        }
    }

    private com.google.android.gms.internal.zzffq zzi(com.google.android.gms.internal.zzffq r2) {
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
        r1 = this;
        r0 = r1.zzpdl;
        if (r0 != 0) goto L_0x001c;
    L_0x0004:
        monitor-enter(r1);
        r0 = r1.zzpdl;	 Catch:{ all -> 0x0019 }
        if (r0 == 0) goto L_0x000b;	 Catch:{ all -> 0x0019 }
    L_0x0009:
        monitor-exit(r1);	 Catch:{ all -> 0x0019 }
        goto L_0x001c;
    L_0x000b:
        r1.zzpdl = r2;	 Catch:{ zzffe -> 0x0012 }
        r0 = com.google.android.gms.internal.zzfdp.zzpaz;	 Catch:{ zzffe -> 0x0012 }
        r1.zzpdm = r0;	 Catch:{ zzffe -> 0x0012 }
        goto L_0x0009;
    L_0x0012:
        r1.zzpdl = r2;	 Catch:{ all -> 0x0019 }
        r2 = com.google.android.gms.internal.zzfdp.zzpaz;	 Catch:{ all -> 0x0019 }
        r1.zzpdm = r2;	 Catch:{ all -> 0x0019 }
        goto L_0x0009;	 Catch:{ all -> 0x0019 }
    L_0x0019:
        r2 = move-exception;	 Catch:{ all -> 0x0019 }
        monitor-exit(r1);	 Catch:{ all -> 0x0019 }
        throw r2;
    L_0x001c:
        r2 = r1.zzpdl;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzffk.zzi(com.google.android.gms.internal.zzffq):com.google.android.gms.internal.zzffq");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzffk)) {
            return false;
        }
        zzffk zzffk = (zzffk) obj;
        zzffq zzffq = this.zzpdl;
        zzffq zzffq2 = zzffk.zzpdl;
        return (zzffq == null && zzffq2 == null) ? toByteString().equals(zzffk.toByteString()) : (zzffq == null || zzffq2 == null) ? zzffq != null ? zzffq.equals(zzffk.zzi(zzffq.zzcvi())) : zzi(zzffq2.zzcvi()).equals(zzffq2) : zzffq.equals(zzffq2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zzhl() {
        return this.zzpdm != null ? this.zzpdm.size() : this.zzpdl != null ? this.zzpdl.zzhl() : 0;
    }

    public final zzffq zzj(zzffq zzffq) {
        zzffq zzffq2 = this.zzpdl;
        this.zzpdk = null;
        this.zzpdm = null;
        this.zzpdl = zzffq;
        return zzffq2;
    }
}
