package com.google.android.gms.internal;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class zzfem<MessageType extends zzfem<MessageType, BuilderType>, BuilderType extends zzfen<MessageType, BuilderType>> extends zzfdh<MessageType, BuilderType> {
    protected zzfgq zzpcg = zzfgq.zzcwv();
    protected int zzpch = -1;

    protected static <T extends zzfem<T, ?>> T zza(T t, zzfdp zzfdp) throws zzffe {
        t = zza((zzfem) t, zzfdp, zzfei.zzcva());
        Object obj = null;
        if (t != null) {
            if ((t.zza(zzfeu.zzpcq, Boolean.TRUE, null) != null ? 1 : null) == null) {
                throw new zzfgp(t).zzcwu().zzh(t);
            }
        }
        if (t != null) {
            if (t.zza(zzfeu.zzpcq, Boolean.TRUE, null) != null) {
                obj = 1;
            }
            if (obj == null) {
                throw new zzfgp(t).zzcwu().zzh(t);
            }
        }
        return t;
    }

    private static <T extends zzfem<T, ?>> T zza(T t, zzfdp zzfdp, zzfei zzfei) throws zzffe {
        try {
            zzfdy zzctm = zzfdp.zzctm();
            t = zza((zzfem) t, zzctm, zzfei);
            zzctm.zzkg(0);
            return t;
        } catch (zzffe e) {
            throw e.zzh(t);
        } catch (zzffe e2) {
            throw e2;
        }
    }

    static <T extends zzfem<T, ?>> T zza(T t, zzfdy zzfdy, zzfei zzfei) throws zzffe {
        zzfem zzfem = (zzfem) t.zza(zzfeu.zzpcu, null, null);
        try {
            zzfem.zza(zzfeu.zzpcs, (Object) zzfdy, (Object) zzfei);
            zzfem.zza(zzfeu.zzpct, null, null);
            zzfem.zzpcg.zzbin();
            return zzfem;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof zzffe) {
                throw ((zzffe) e.getCause());
            }
            throw e;
        }
    }

    protected static <T extends zzfem<T, ?>> T zza(T t, byte[] bArr) throws zzffe {
        t = zza((zzfem) t, bArr, zzfei.zzcva());
        if (t != null) {
            if ((t.zza(zzfeu.zzpcq, Boolean.TRUE, null) != null ? 1 : null) == null) {
                throw new zzfgp(t).zzcwu().zzh(t);
            }
        }
        return t;
    }

    private static <T extends zzfem<T, ?>> T zza(T t, byte[] bArr, zzfei zzfei) throws zzffe {
        try {
            zzfdy zzba = zzfdy.zzba(bArr);
            t = zza((zzfem) t, zzba, zzfei);
            zzba.zzkg(0);
            return t;
        } catch (zzffe e) {
            throw e.zzh(t);
        } catch (zzffe e2) {
            throw e2;
        }
    }

    static Object zza(Method method, Object obj, Object... objArr) {
        Throwable e;
        try {
            return method.invoke(obj, objArr);
        } catch (Throwable e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            e2 = e3.getCause();
            if (e2 instanceof RuntimeException) {
                throw ((RuntimeException) e2);
            } else if (e2 instanceof Error) {
                throw ((Error) e2);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", e2);
            }
        }
    }

    protected static zzffc zzcvf() {
        return zzfey.zzcvr();
    }

    protected static <E> zzffd<E> zzcvg() {
        return zzffw.zzcwg();
    }

    public boolean equals(java.lang.Object r5) {
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
        r4 = this;
        r0 = 1;
        if (r4 != r5) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = com.google.android.gms.internal.zzfeu.zzpcw;
        r2 = 0;
        r1 = r4.zza(r1, r2, r2);
        r1 = (com.google.android.gms.internal.zzfem) r1;
        r1 = r1.getClass();
        r1 = r1.isInstance(r5);
        r2 = 0;
        if (r1 != 0) goto L_0x0019;
    L_0x0018:
        return r2;
    L_0x0019:
        r1 = com.google.android.gms.internal.zzfep.zzpcl;	 Catch:{ zzfeq -> 0x002d }
        r5 = (com.google.android.gms.internal.zzfem) r5;	 Catch:{ zzfeq -> 0x002d }
        r3 = com.google.android.gms.internal.zzfeu.zzpcr;	 Catch:{ zzfeq -> 0x002d }
        r4.zza(r3, r1, r5);	 Catch:{ zzfeq -> 0x002d }
        r3 = r4.zzpcg;	 Catch:{ zzfeq -> 0x002d }
        r5 = r5.zzpcg;	 Catch:{ zzfeq -> 0x002d }
        r5 = r1.zza(r3, r5);	 Catch:{ zzfeq -> 0x002d }
        r4.zzpcg = r5;	 Catch:{ zzfeq -> 0x002d }
        return r0;
    L_0x002d:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzfem.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        if (this.zzpat != 0) {
            return this.zzpat;
        }
        Object zzfes = new zzfes();
        zza(zzfeu.zzpcr, zzfes, (Object) this);
        this.zzpcg = zzfes.zza(this.zzpcg, this.zzpcg);
        this.zzpat = zzfes.zzpco;
        return this.zzpat;
    }

    public final boolean isInitialized() {
        return zza(zzfeu.zzpcq, Boolean.TRUE, null) != null;
    }

    public String toString() {
        return zzfft.zza(this, super.toString());
    }

    protected abstract Object zza(int i, Object obj, Object obj2);

    protected final boolean zza(int i, zzfdy zzfdy) throws IOException {
        if ((i & 7) == 4) {
            return false;
        }
        if (this.zzpcg == zzfgq.zzcwv()) {
            this.zzpcg = zzfgq.zzcww();
        }
        return this.zzpcg.zzb(i, zzfdy);
    }

    public final zzffu<MessageType> zzcve() {
        return (zzffu) zza(zzfeu.zzpcx, null, null);
    }

    public final /* synthetic */ zzffr zzcvh() {
        zzfen zzfen = (zzfen) zza(zzfeu.zzpcv, null, null);
        zzfen.zza(this);
        return zzfen;
    }

    public final /* synthetic */ zzffq zzcvi() {
        return (zzfem) zza(zzfeu.zzpcw, null, null);
    }
}
