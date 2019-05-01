package com.google.android.gms.internal;

import android.content.Context;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAdOptions.Builder;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.dynamic.zzn;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

@zzzb
public final class zztq implements zztu {
    private final Context mContext;
    private final Object mLock = new Object();
    private final zzuc zzanb;
    private final zzom zzaor;
    private final List<String> zzaos;
    private final zzaiy zzaov;
    private zzis zzara;
    private final zziw zzarg;
    private final boolean zzauu;
    private final String zzcco;
    private final long zzccp;
    private final zztn zzccq;
    private final zztm zzccr;
    private final List<String> zzccs;
    private final List<String> zzcct;
    private final boolean zzccu;
    private final boolean zzccv;
    private zzuf zzccw;
    private int zzccx = -2;
    private zzul zzccy;

    public zztq(Context context, String str, zzuc zzuc, zztn zztn, zztm zztm, zzis zzis, zziw zziw, zzaiy zzaiy, boolean z, boolean z2, zzom zzom, List<String> list, List<String> list2, List<String> list3, boolean z3) {
        String str2 = str;
        zztn zztn2 = zztn;
        this.mContext = context;
        this.zzanb = zzuc;
        this.zzccr = zztm;
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str2)) {
            str2 = zzlr();
        }
        r0.zzcco = str2;
        r0.zzccq = zztn2;
        r0.zzccp = zztn2.zzcbu != -1 ? zztn2.zzcbu : 10000;
        r0.zzara = zzis;
        r0.zzarg = zziw;
        r0.zzaov = zzaiy;
        r0.zzauu = z;
        r0.zzccu = z2;
        r0.zzaor = zzom;
        r0.zzaos = list;
        r0.zzccs = list2;
        r0.zzcct = list3;
        r0.zzccv = z3;
    }

    private static zzuf zza(MediationAdapter mediationAdapter) {
        return new zzuw(mediationAdapter);
    }

    private final void zza(zztp zztp) {
        String zzbd = zzbd(this.zzccr.zzcbk);
        try {
            if (this.zzaov.zzdca >= 4100000) {
                if (!this.zzauu) {
                    if (!this.zzccr.zzlq()) {
                        if (this.zzarg.zzbdb) {
                            this.zzccw.zza(zzn.zzy(this.mContext), this.zzara, zzbd, this.zzccr.zzcbb, (zzui) zztp);
                            return;
                        } else if (!this.zzccu) {
                            this.zzccw.zza(zzn.zzy(this.mContext), this.zzarg, this.zzara, zzbd, this.zzccr.zzcbb, zztp);
                            return;
                        } else if (this.zzccr.zzcbn != null) {
                            this.zzccw.zza(zzn.zzy(this.mContext), this.zzara, zzbd, this.zzccr.zzcbb, zztp, new zzom(zzbe(this.zzccr.zzcbr)), this.zzccr.zzcbq);
                            return;
                        } else {
                            this.zzccw.zza(zzn.zzy(this.mContext), this.zzarg, this.zzara, zzbd, this.zzccr.zzcbb, zztp);
                            return;
                        }
                    }
                }
                List arrayList = new ArrayList(this.zzaos);
                if (this.zzccs != null) {
                    for (String str : this.zzccs) {
                        String str2 = ":false";
                        if (this.zzcct != null && this.zzcct.contains(str)) {
                            str2 = ":true";
                        }
                        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 7) + String.valueOf(str2).length());
                        stringBuilder.append("custom:");
                        stringBuilder.append(str);
                        stringBuilder.append(str2);
                        arrayList.add(stringBuilder.toString());
                    }
                }
                this.zzccw.zza(zzn.zzy(this.mContext), this.zzara, zzbd, this.zzccr.zzcbb, zztp, this.zzaor, arrayList);
            } else if (this.zzarg.zzbdb) {
                this.zzccw.zza(zzn.zzy(this.mContext), this.zzara, zzbd, zztp);
            } else {
                this.zzccw.zza(zzn.zzy(this.mContext), this.zzarg, this.zzara, zzbd, (zzui) zztp);
            }
        } catch (Throwable e) {
            zzaiw.zzc("Could not request ad from mediation adapter.", e);
            zzv(5);
        }
    }

    private final java.lang.String zzbd(java.lang.String r3) {
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
        r2 = this;
        if (r3 == 0) goto L_0x0024;
    L_0x0002:
        r0 = r2.zzlu();
        if (r0 == 0) goto L_0x0024;
    L_0x0008:
        r0 = 2;
        r0 = r2.zzw(r0);
        if (r0 == 0) goto L_0x0010;
    L_0x000f:
        return r3;
    L_0x0010:
        r0 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x001f }
        r0.<init>(r3);	 Catch:{ JSONException -> 0x001f }
        r1 = "cpm_floor_cents";	 Catch:{ JSONException -> 0x001f }
        r0.remove(r1);	 Catch:{ JSONException -> 0x001f }
        r0 = r0.toString();	 Catch:{ JSONException -> 0x001f }
        return r0;
    L_0x001f:
        r0 = "Could not remove field. Returning the original value";
        com.google.android.gms.internal.zzaiw.zzco(r0);
    L_0x0024:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zztq.zzbd(java.lang.String):java.lang.String");
    }

    private static NativeAdOptions zzbe(String str) {
        Builder builder = new Builder();
        if (str == null) {
            return builder.build();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = 0;
            builder.setRequestMultipleImages(jSONObject.optBoolean("multiple_images", false));
            builder.setReturnUrlsForImageAssets(jSONObject.optBoolean("only_urls", false));
            str = jSONObject.optString("native_image_orientation", "any");
            if ("landscape".equals(str)) {
                i = 2;
            } else if ("portrait".equals(str)) {
                i = 1;
            } else if (!"any".equals(str)) {
                i = -1;
            }
            builder.setImageOrientation(i);
        } catch (Throwable e) {
            zzaiw.zzc("Exception occurred when creating native ad options", e);
        }
        return builder.build();
    }

    private final java.lang.String zzlr() {
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
        r2 = this;
        r0 = r2.zzccr;	 Catch:{ RemoteException -> 0x001c }
        r0 = r0.zzcbf;	 Catch:{ RemoteException -> 0x001c }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ RemoteException -> 0x001c }
        if (r0 != 0) goto L_0x0021;	 Catch:{ RemoteException -> 0x001c }
    L_0x000a:
        r0 = r2.zzanb;	 Catch:{ RemoteException -> 0x001c }
        r1 = r2.zzccr;	 Catch:{ RemoteException -> 0x001c }
        r1 = r1.zzcbf;	 Catch:{ RemoteException -> 0x001c }
        r0 = r0.zzbg(r1);	 Catch:{ RemoteException -> 0x001c }
        if (r0 == 0) goto L_0x0019;	 Catch:{ RemoteException -> 0x001c }
    L_0x0016:
        r0 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";	 Catch:{ RemoteException -> 0x001c }
        return r0;	 Catch:{ RemoteException -> 0x001c }
    L_0x0019:
        r0 = "com.google.ads.mediation.customevent.CustomEventAdapter";	 Catch:{ RemoteException -> 0x001c }
        return r0;
    L_0x001c:
        r0 = "Fail to determine the custom event's version, assuming the old one.";
        com.google.android.gms.internal.zzaiw.zzco(r0);
    L_0x0021:
        r0 = "com.google.ads.mediation.customevent.CustomEventAdapter";
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zztq.zzlr():java.lang.String");
    }

    private final com.google.android.gms.internal.zzul zzls() {
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
        r2 = this;
        r0 = r2.zzccx;
        if (r0 != 0) goto L_0x0030;
    L_0x0004:
        r0 = r2.zzlu();
        if (r0 != 0) goto L_0x000b;
    L_0x000a:
        goto L_0x0030;
    L_0x000b:
        r0 = 4;
        r0 = r2.zzw(r0);	 Catch:{ RemoteException -> 0x0021 }
        if (r0 == 0) goto L_0x0026;	 Catch:{ RemoteException -> 0x0021 }
    L_0x0012:
        r0 = r2.zzccy;	 Catch:{ RemoteException -> 0x0021 }
        if (r0 == 0) goto L_0x0026;	 Catch:{ RemoteException -> 0x0021 }
    L_0x0016:
        r0 = r2.zzccy;	 Catch:{ RemoteException -> 0x0021 }
        r0 = r0.zzlw();	 Catch:{ RemoteException -> 0x0021 }
        if (r0 == 0) goto L_0x0026;	 Catch:{ RemoteException -> 0x0021 }
    L_0x001e:
        r0 = r2.zzccy;	 Catch:{ RemoteException -> 0x0021 }
        return r0;
    L_0x0021:
        r0 = "Could not get cpm value from MediationResponseMetadata";
        com.google.android.gms.internal.zzaiw.zzco(r0);
    L_0x0026:
        r0 = r2.zzlv();
        r1 = new com.google.android.gms.internal.zzts;
        r1.<init>(r0);
        return r1;
    L_0x0030:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zztq.zzls():com.google.android.gms.internal.zzul");
    }

    private final zzuf zzlt() {
        String str = "Instantiating mediation adapter: ";
        String valueOf = String.valueOf(this.zzcco);
        zzaiw.zzcn(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        if (!(this.zzauu || this.zzccr.zzlq())) {
            if (((Boolean) zzbs.zzep().zzd(zzmq.zzblo)).booleanValue() && "com.google.ads.mediation.admob.AdMobAdapter".equals(this.zzcco)) {
                return zza(new AdMobAdapter());
            }
            if (((Boolean) zzbs.zzep().zzd(zzmq.zzblp)).booleanValue() && "com.google.ads.mediation.AdUrlAdapter".equals(this.zzcco)) {
                return zza(new AdUrlAdapter());
            }
            if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(this.zzcco)) {
                return new zzuw(new zzvq());
            }
        }
        try {
            return this.zzanb.zzbf(this.zzcco);
        } catch (Throwable e) {
            valueOf = "Could not instantiate mediation adapter: ";
            String valueOf2 = String.valueOf(this.zzcco);
            zzaiw.zza(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), e);
            return null;
        }
    }

    private final boolean zzlu() {
        return this.zzccq.zzcce != -1;
    }

    private final int zzlv() {
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
        r0 = r4.zzccr;
        r0 = r0.zzcbk;
        r1 = 0;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x003a }
        r2 = r4.zzccr;	 Catch:{ JSONException -> 0x003a }
        r2 = r2.zzcbk;	 Catch:{ JSONException -> 0x003a }
        r0.<init>(r2);	 Catch:{ JSONException -> 0x003a }
        r2 = "com.google.ads.mediation.admob.AdMobAdapter";
        r3 = r4.zzcco;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0022;
    L_0x001b:
        r2 = "cpm_cents";
        r0 = r0.optInt(r2, r1);
        return r0;
    L_0x0022:
        r2 = 2;
        r2 = r4.zzw(r2);
        if (r2 == 0) goto L_0x0030;
    L_0x0029:
        r2 = "cpm_floor_cents";
        r2 = r0.optInt(r2, r1);
        goto L_0x0031;
    L_0x0030:
        r2 = 0;
    L_0x0031:
        if (r2 != 0) goto L_0x0039;
    L_0x0033:
        r2 = "penalized_average_cpm_cents";
        r2 = r0.optInt(r2, r1);
    L_0x0039:
        return r2;
    L_0x003a:
        r0 = "Could not convert to json. Returning 0";
        com.google.android.gms.internal.zzaiw.zzco(r0);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zztq.zzlv():int");
    }

    private final boolean zzw(int r4) {
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
        r1 = r3.zzauu;	 Catch:{ RemoteException -> 0x002d }
        if (r1 == 0) goto L_0x000c;	 Catch:{ RemoteException -> 0x002d }
    L_0x0005:
        r1 = r3.zzccw;	 Catch:{ RemoteException -> 0x002d }
        r1 = r1.zzmb();	 Catch:{ RemoteException -> 0x002d }
        goto L_0x001f;	 Catch:{ RemoteException -> 0x002d }
    L_0x000c:
        r1 = r3.zzarg;	 Catch:{ RemoteException -> 0x002d }
        r1 = r1.zzbdb;	 Catch:{ RemoteException -> 0x002d }
        if (r1 == 0) goto L_0x0019;	 Catch:{ RemoteException -> 0x002d }
    L_0x0012:
        r1 = r3.zzccw;	 Catch:{ RemoteException -> 0x002d }
        r1 = r1.getInterstitialAdapterInfo();	 Catch:{ RemoteException -> 0x002d }
        goto L_0x001f;	 Catch:{ RemoteException -> 0x002d }
    L_0x0019:
        r1 = r3.zzccw;	 Catch:{ RemoteException -> 0x002d }
        r1 = r1.zzma();	 Catch:{ RemoteException -> 0x002d }
    L_0x001f:
        if (r1 == 0) goto L_0x002c;
    L_0x0021:
        r2 = "capabilities";
        r1 = r1.getInt(r2, r0);
        r1 = r1 & r4;
        if (r1 != r4) goto L_0x002c;
    L_0x002a:
        r4 = 1;
        return r4;
    L_0x002c:
        return r0;
    L_0x002d:
        r4 = "Could not get adapter info. Returning false";
        com.google.android.gms.internal.zzaiw.zzco(r4);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zztq.zzw(int):boolean");
    }

    public final void cancel() {
        synchronized (this.mLock) {
            try {
                if (this.zzccw != null) {
                    this.zzccw.destroy();
                }
            } catch (Throwable e) {
                zzaiw.zzc("Could not destroy mediation adapter.", e);
            }
            this.zzccx = -1;
            this.mLock.notify();
        }
    }

    public final com.google.android.gms.internal.zztt zza(long r20, long r22) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Not initialized variable reg: 16, insn: 0x006e: MOVE  (r3 ?[long, double]) = (r16 ?[long, double]), block:B:22:0x006e, method: com.google.android.gms.internal.zztq.zza(long, long):com.google.android.gms.internal.zztt
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:168)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:132)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
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
        r19 = this;
        r1 = r19;
        r2 = r1.mLock;
        monitor-enter(r2);
        r3 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x0071 }
        r9 = new com.google.android.gms.internal.zztp;	 Catch:{ all -> 0x0071 }
        r9.<init>();	 Catch:{ all -> 0x0071 }
        r5 = com.google.android.gms.internal.zzagr.zzczc;	 Catch:{ all -> 0x0071 }
        r6 = new com.google.android.gms.internal.zztr;	 Catch:{ all -> 0x0071 }
        r6.<init>(r1, r9);	 Catch:{ all -> 0x0071 }
        r5.post(r6);	 Catch:{ all -> 0x0071 }
        r5 = r1.zzccp;	 Catch:{ all -> 0x0071 }
    L_0x001a:
        r7 = r1.zzccx;	 Catch:{ all -> 0x0071 }
        r8 = -2;	 Catch:{ all -> 0x0071 }
        if (r7 == r8) goto L_0x003e;	 Catch:{ all -> 0x0071 }
    L_0x001f:
        r5 = com.google.android.gms.ads.internal.zzbs.zzei();	 Catch:{ all -> 0x0071 }
        r5 = r5.elapsedRealtime();	 Catch:{ all -> 0x0071 }
        r7 = 0;	 Catch:{ all -> 0x0071 }
        r12 = r5 - r3;	 Catch:{ all -> 0x0071 }
        r3 = new com.google.android.gms.internal.zztt;	 Catch:{ all -> 0x0071 }
        r6 = r1.zzccr;	 Catch:{ all -> 0x0071 }
        r7 = r1.zzccw;	 Catch:{ all -> 0x0071 }
        r8 = r1.zzcco;	 Catch:{ all -> 0x0071 }
        r10 = r1.zzccx;	 Catch:{ all -> 0x0071 }
        r11 = zzls();	 Catch:{ all -> 0x0071 }
        r5 = r3;	 Catch:{ all -> 0x0071 }
        r5.<init>(r6, r7, r8, r9, r10, r11, r12);	 Catch:{ all -> 0x0071 }
        monitor-exit(r2);	 Catch:{ all -> 0x0071 }
        return r3;	 Catch:{ all -> 0x0071 }
    L_0x003e:
        r7 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x0071 }
        r10 = 0;
        r10 = r7 - r3;
        r12 = r5 - r10;
        r14 = r7 - r20;
        r16 = r3;
        r3 = r22 - r14;
        r14 = 0;
        r18 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));
        if (r18 <= 0) goto L_0x0066;
    L_0x0053:
        r18 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1));
        if (r18 > 0) goto L_0x0058;
    L_0x0057:
        goto L_0x0066;
    L_0x0058:
        r14 = r1.mLock;	 Catch:{ InterruptedException -> 0x0062 }
        r3 = java.lang.Math.min(r12, r3);	 Catch:{ InterruptedException -> 0x0062 }
        r14.wait(r3);	 Catch:{ InterruptedException -> 0x0062 }
        goto L_0x006e;
    L_0x0062:
        r3 = 5;
        r1.zzccx = r3;	 Catch:{ all -> 0x0071 }
        goto L_0x006e;	 Catch:{ all -> 0x0071 }
    L_0x0066:
        r3 = "Timed out waiting for adapter.";	 Catch:{ all -> 0x0071 }
        com.google.android.gms.internal.zzaiw.zzcn(r3);	 Catch:{ all -> 0x0071 }
        r3 = 3;	 Catch:{ all -> 0x0071 }
        r1.zzccx = r3;	 Catch:{ all -> 0x0071 }
    L_0x006e:
        r3 = r16;	 Catch:{ all -> 0x0071 }
        goto L_0x001a;	 Catch:{ all -> 0x0071 }
    L_0x0071:
        r0 = move-exception;	 Catch:{ all -> 0x0071 }
        r3 = r0;	 Catch:{ all -> 0x0071 }
        monitor-exit(r2);	 Catch:{ all -> 0x0071 }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zztq.zza(long, long):com.google.android.gms.internal.zztt");
    }

    public final void zza(int i, zzul zzul) {
        synchronized (this.mLock) {
            this.zzccx = 0;
            this.zzccy = zzul;
            this.mLock.notify();
        }
    }

    public final void zzv(int i) {
        synchronized (this.mLock) {
            this.zzccx = i;
            this.mLock.notify();
        }
    }
}
