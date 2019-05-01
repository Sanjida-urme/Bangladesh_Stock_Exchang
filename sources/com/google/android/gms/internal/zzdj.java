package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbs;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class zzdj extends zzec {
    private static final Object zzajl = new Object();
    private static volatile zzbs zzajm;
    private zzat zzajn = null;

    public zzdj(zzda zzda, String str, String str2, zzaw zzaw, int i, int i2, zzat zzat) {
        super(zzda, str, str2, zzaw, i, 27);
        this.zzajn = zzat;
    }

    private final java.lang.String zzau() {
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
        r0 = r2.zzagk;	 Catch:{ InterruptedException -> 0x0020, InterruptedException -> 0x0020 }
        r0 = r0.zzan();	 Catch:{ InterruptedException -> 0x0020, InterruptedException -> 0x0020 }
        if (r0 == 0) goto L_0x0011;	 Catch:{ InterruptedException -> 0x0020, InterruptedException -> 0x0020 }
    L_0x0008:
        r0 = r2.zzagk;	 Catch:{ InterruptedException -> 0x0020, InterruptedException -> 0x0020 }
        r0 = r0.zzan();	 Catch:{ InterruptedException -> 0x0020, InterruptedException -> 0x0020 }
        r0.get();	 Catch:{ InterruptedException -> 0x0020, InterruptedException -> 0x0020 }
    L_0x0011:
        r0 = r2.zzagk;	 Catch:{ InterruptedException -> 0x0020, InterruptedException -> 0x0020 }
        r0 = r0.zzam();	 Catch:{ InterruptedException -> 0x0020, InterruptedException -> 0x0020 }
        if (r0 == 0) goto L_0x0020;	 Catch:{ InterruptedException -> 0x0020, InterruptedException -> 0x0020 }
    L_0x0019:
        r1 = r0.zzcq;	 Catch:{ InterruptedException -> 0x0020, InterruptedException -> 0x0020 }
        if (r1 == 0) goto L_0x0020;	 Catch:{ InterruptedException -> 0x0020, InterruptedException -> 0x0020 }
    L_0x001d:
        r0 = r0.zzcq;	 Catch:{ InterruptedException -> 0x0020, InterruptedException -> 0x0020 }
        return r0;
    L_0x0020:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzdj.zzau():java.lang.String");
    }

    protected final void zzat() throws IllegalAccessException, InvocationTargetException {
        Object obj;
        Object obj2;
        String zzau;
        boolean z = false;
        if (!(zzajm == null || zzdf.zzn(zzajm.zzcq) || zzajm.zzcq.equals("E"))) {
            if (!zzajm.zzcq.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                obj = null;
                if (obj != null) {
                    synchronized (zzajl) {
                        zzbs zzbs;
                        zzat zzat = this.zzajn;
                        if (zzdf.zzn(null)) {
                            obj2 = 4;
                        } else {
                            zzat zzat2 = this.zzajn;
                            zzdf.zzn(null);
                            if (Boolean.valueOf(false).booleanValue()) {
                                if (this.zzagk.zzak()) {
                                    if (((Boolean) zzbs.zzep().zzd(zzmq.zzbmf)).booleanValue()) {
                                        if (((Boolean) zzbs.zzep().zzd(zzmq.zzbmg)).booleanValue()) {
                                            obj2 = 1;
                                            if (obj2 != null) {
                                                obj2 = 3;
                                            }
                                        }
                                    }
                                }
                                obj2 = null;
                                if (obj2 != null) {
                                    obj2 = 3;
                                }
                            }
                            obj2 = 2;
                        }
                        Method method = this.zzajx;
                        Object[] objArr = new Object[2];
                        objArr[0] = this.zzagk.getContext();
                        if (obj2 == 2) {
                            z = true;
                        }
                        objArr[1] = Boolean.valueOf(z);
                        zzbs = new zzbs((String) method.invoke(null, objArr));
                        zzajm = zzbs;
                        if (zzdf.zzn(zzbs.zzcq) || zzajm.zzcq.equals("E")) {
                            switch (obj2) {
                                case 3:
                                    zzau = zzau();
                                    if (!zzdf.zzn(zzau)) {
                                        zzajm.zzcq = zzau;
                                        break;
                                    }
                                    break;
                                case 4:
                                    zzajm.zzcq = null.zzcq;
                                    break;
                                default:
                                    break;
                            }
                        }
                    }
                }
                synchronized (this.zzajo) {
                    if (zzajm != null) {
                        this.zzajo.zzcq = zzajm.zzcq;
                        this.zzajo.zzdu = Long.valueOf(zzajm.zzyo);
                        this.zzajo.zzcs = zzajm.zzcs;
                        this.zzajo.zzct = zzajm.zzct;
                        this.zzajo.zzcu = zzajm.zzcu;
                    }
                }
            }
        }
        obj = 1;
        if (obj != null) {
            synchronized (zzajl) {
                zzat zzat3 = this.zzajn;
                if (zzdf.zzn(null)) {
                    zzat zzat22 = this.zzajn;
                    zzdf.zzn(null);
                    if (Boolean.valueOf(false).booleanValue()) {
                        if (this.zzagk.zzak()) {
                            if (((Boolean) zzbs.zzep().zzd(zzmq.zzbmf)).booleanValue()) {
                                if (((Boolean) zzbs.zzep().zzd(zzmq.zzbmg)).booleanValue()) {
                                    obj2 = 1;
                                    if (obj2 != null) {
                                        obj2 = 3;
                                    }
                                }
                            }
                        }
                        obj2 = null;
                        if (obj2 != null) {
                            obj2 = 3;
                        }
                    }
                    obj2 = 2;
                } else {
                    obj2 = 4;
                }
                Method method2 = this.zzajx;
                Object[] objArr2 = new Object[2];
                objArr2[0] = this.zzagk.getContext();
                if (obj2 == 2) {
                    z = true;
                }
                objArr2[1] = Boolean.valueOf(z);
                zzbs = new zzbs((String) method2.invoke(null, objArr2));
                zzajm = zzbs;
                switch (obj2) {
                    case 3:
                        zzau = zzau();
                        if (zzdf.zzn(zzau)) {
                            zzajm.zzcq = zzau;
                            break;
                        }
                        break;
                    case 4:
                        zzajm.zzcq = null.zzcq;
                        break;
                    default:
                        break;
                }
            }
        }
        synchronized (this.zzajo) {
            if (zzajm != null) {
                this.zzajo.zzcq = zzajm.zzcq;
                this.zzajo.zzdu = Long.valueOf(zzajm.zzyo);
                this.zzajo.zzcs = zzajm.zzcs;
                this.zzajo.zzct = zzajm.zzct;
                this.zzajo.zzcu = zzajm.zzcu;
            }
        }
    }
}
