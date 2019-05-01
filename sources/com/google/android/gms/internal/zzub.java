package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import java.util.Map;

@zzzb
public final class zzub extends zzud {
    private Map<Class<? extends NetworkExtras>, NetworkExtras> zzcdv;

    private final <NETWORK_EXTRAS extends com.google.ads.mediation.NetworkExtras, SERVER_PARAMETERS extends com.google.ads.mediation.MediationServerParameters> com.google.android.gms.internal.zzuf zzbh(java.lang.String r4) throws android.os.RemoteException {
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
        r0 = 0;
        r1 = com.google.android.gms.internal.zzub.class;	 Catch:{ Throwable -> 0x0068 }
        r1 = r1.getClassLoader();	 Catch:{ Throwable -> 0x0068 }
        r0 = java.lang.Class.forName(r4, r0, r1);	 Catch:{ Throwable -> 0x0068 }
        r1 = com.google.ads.mediation.MediationAdapter.class;	 Catch:{ Throwable -> 0x0068 }
        r1 = r1.isAssignableFrom(r0);	 Catch:{ Throwable -> 0x0068 }
        if (r1 == 0) goto L_0x002b;	 Catch:{ Throwable -> 0x0068 }
    L_0x0013:
        r0 = r0.newInstance();	 Catch:{ Throwable -> 0x0068 }
        r0 = (com.google.ads.mediation.MediationAdapter) r0;	 Catch:{ Throwable -> 0x0068 }
        r1 = r3.zzcdv;	 Catch:{ Throwable -> 0x0068 }
        r2 = r0.getAdditionalParametersType();	 Catch:{ Throwable -> 0x0068 }
        r1 = r1.get(r2);	 Catch:{ Throwable -> 0x0068 }
        r1 = (com.google.ads.mediation.NetworkExtras) r1;	 Catch:{ Throwable -> 0x0068 }
        r2 = new com.google.android.gms.internal.zzvb;	 Catch:{ Throwable -> 0x0068 }
        r2.<init>(r0, r1);	 Catch:{ Throwable -> 0x0068 }
        return r2;	 Catch:{ Throwable -> 0x0068 }
    L_0x002b:
        r1 = com.google.android.gms.ads.mediation.MediationAdapter.class;	 Catch:{ Throwable -> 0x0068 }
        r1 = r1.isAssignableFrom(r0);	 Catch:{ Throwable -> 0x0068 }
        if (r1 == 0) goto L_0x003f;	 Catch:{ Throwable -> 0x0068 }
    L_0x0033:
        r0 = r0.newInstance();	 Catch:{ Throwable -> 0x0068 }
        r0 = (com.google.android.gms.ads.mediation.MediationAdapter) r0;	 Catch:{ Throwable -> 0x0068 }
        r1 = new com.google.android.gms.internal.zzuw;	 Catch:{ Throwable -> 0x0068 }
        r1.<init>(r0);	 Catch:{ Throwable -> 0x0068 }
        return r1;	 Catch:{ Throwable -> 0x0068 }
    L_0x003f:
        r0 = java.lang.String.valueOf(r4);	 Catch:{ Throwable -> 0x0068 }
        r0 = r0.length();	 Catch:{ Throwable -> 0x0068 }
        r0 = r0 + 64;	 Catch:{ Throwable -> 0x0068 }
        r1 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0068 }
        r1.<init>(r0);	 Catch:{ Throwable -> 0x0068 }
        r0 = "Could not instantiate mediation adapter: ";	 Catch:{ Throwable -> 0x0068 }
        r1.append(r0);	 Catch:{ Throwable -> 0x0068 }
        r1.append(r4);	 Catch:{ Throwable -> 0x0068 }
        r0 = " (not a valid adapter).";	 Catch:{ Throwable -> 0x0068 }
        r1.append(r0);	 Catch:{ Throwable -> 0x0068 }
        r0 = r1.toString();	 Catch:{ Throwable -> 0x0068 }
        com.google.android.gms.internal.zzaiw.zzco(r0);	 Catch:{ Throwable -> 0x0068 }
        r0 = new android.os.RemoteException;	 Catch:{ Throwable -> 0x0068 }
        r0.<init>();	 Catch:{ Throwable -> 0x0068 }
        throw r0;	 Catch:{ Throwable -> 0x0068 }
    L_0x0068:
        r4 = r3.zzbi(r4);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzub.zzbh(java.lang.String):com.google.android.gms.internal.zzuf");
    }

    private final zzuf zzbi(String str) throws RemoteException {
        try {
            zzaiw.zzbw("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                return new zzuw(new AdMobAdapter());
            }
            if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                return new zzuw(new AdUrlAdapter());
            }
            if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                return new zzuw(new CustomEventAdapter());
            }
            if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                MediationAdapter customEventAdapter = new com.google.ads.mediation.customevent.CustomEventAdapter();
                return new zzvb(customEventAdapter, (CustomEventExtras) this.zzcdv.get(customEventAdapter.getAdditionalParametersType()));
            }
            throw new RemoteException();
        } catch (Throwable th) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 43);
            stringBuilder.append("Could not instantiate mediation adapter: ");
            stringBuilder.append(str);
            stringBuilder.append(". ");
            zzaiw.zzc(stringBuilder.toString(), th);
        }
    }

    public final zzuf zzbf(String str) throws RemoteException {
        return zzbh(str);
    }

    public final boolean zzbg(java.lang.String r4) throws android.os.RemoteException {
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
        r0 = 0;
        r1 = com.google.android.gms.internal.zzub.class;	 Catch:{ Throwable -> 0x0012 }
        r1 = r1.getClassLoader();	 Catch:{ Throwable -> 0x0012 }
        r1 = java.lang.Class.forName(r4, r0, r1);	 Catch:{ Throwable -> 0x0012 }
        r2 = com.google.android.gms.ads.mediation.customevent.CustomEvent.class;	 Catch:{ Throwable -> 0x0012 }
        r1 = r2.isAssignableFrom(r1);	 Catch:{ Throwable -> 0x0012 }
        return r1;
    L_0x0012:
        r1 = java.lang.String.valueOf(r4);
        r1 = r1.length();
        r1 = r1 + 80;
        r2 = new java.lang.StringBuilder;
        r2.<init>(r1);
        r1 = "Could not load custom event implementation class: ";
        r2.append(r1);
        r2.append(r4);
        r4 = ", assuming old implementation.";
        r2.append(r4);
        r4 = r2.toString();
        com.google.android.gms.internal.zzaiw.zzco(r4);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzub.zzbg(java.lang.String):boolean");
    }

    public final void zzm(Map<Class<? extends NetworkExtras>, NetworkExtras> map) {
        this.zzcdv = map;
    }
}
