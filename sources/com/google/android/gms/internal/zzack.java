package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.ads.internal.zzbt;
import com.google.android.gms.ads.internal.zzd;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.dynamic.zzn;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

@zzzb
public final class zzack extends zzd implements zzadl {
    private static zzack zzctf;
    private static final zzub zzctg = new zzub();
    private boolean zzapj;
    private zzaek zzapk;
    private final Map<String, zzadr> zzcth = new HashMap();
    private boolean zzcti;

    public zzack(Context context, zzv zzv, zziw zziw, zzuc zzuc, zzaiy zzaiy) {
        super(context, zziw, null, zzuc, zzaiy, zzv);
        zzctf = this;
        this.zzapk = new zzaek(context, null);
    }

    private static zzaev zzc(zzaev zzaev) {
        zzaev zzaev2 = zzaev;
        zzafj.m5v("Creating mediation ad response for non-mediated rewarded ad.");
        try {
            String jSONObject = zzabm.zzb(zzaev2.zzcwe).toString();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, zzaev2.zzcpe.zzatb);
            String jSONObject3 = jSONObject2.toString();
            zztm zztm = new zztm(jSONObject, null, Arrays.asList(new String[]{"com.google.ads.mediation.admob.AdMobAdapter"}), null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), jSONObject3, null, Collections.emptyList(), Collections.emptyList(), null, null, null, null, null, Collections.emptyList(), null);
            zztn zztn = new zztn(Arrays.asList(new zztm[]{zztm}), ((Long) zzbs.zzep().zzd(zzmq.zzblt)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), false, "", -1, 0, 1, null, 0, -1, -1, false);
            return new zzaev(zzaev2.zzcpe, zzaev2.zzcwe, zztn, zzaev2.zzath, zzaev2.errorCode, zzaev2.zzcvw, zzaev2.zzcvx, zzaev2.zzcvq, zzaev2.zzcwc, null);
        } catch (Throwable e) {
            zzaiw.zzb("Unable to generate ad state for non-mediated rewarded video.", e);
            return new zzaev(zzaev2.zzcpe, zzaev2.zzcwe, null, zzaev2.zzath, 0, zzaev2.zzcvw, zzaev2.zzcvx, zzaev2.zzcvq, zzaev2.zzcwc, null);
        }
    }

    public static zzack zznu() {
        return zzctf;
    }

    public final void destroy() {
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
        r0 = "destroy must be called on the main UI thread.";
        com.google.android.gms.common.internal.zzbq.zzga(r0);
        r0 = r4.zzcth;
        r0 = r0.keySet();
        r0 = r0.iterator();
    L_0x000f:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x004d;
    L_0x0015:
        r1 = r0.next();
        r1 = (java.lang.String) r1;
        r2 = r4.zzcth;	 Catch:{ RemoteException -> 0x0033 }
        r2 = r2.get(r1);	 Catch:{ RemoteException -> 0x0033 }
        r2 = (com.google.android.gms.internal.zzadr) r2;	 Catch:{ RemoteException -> 0x0033 }
        if (r2 == 0) goto L_0x000f;	 Catch:{ RemoteException -> 0x0033 }
    L_0x0025:
        r3 = r2.zzoc();	 Catch:{ RemoteException -> 0x0033 }
        if (r3 == 0) goto L_0x000f;	 Catch:{ RemoteException -> 0x0033 }
    L_0x002b:
        r2 = r2.zzoc();	 Catch:{ RemoteException -> 0x0033 }
        r2.destroy();	 Catch:{ RemoteException -> 0x0033 }
        goto L_0x000f;
    L_0x0033:
        r2 = "Fail to destroy adapter: ";
        r1 = java.lang.String.valueOf(r1);
        r3 = r1.length();
        if (r3 == 0) goto L_0x0044;
    L_0x003f:
        r1 = r2.concat(r1);
        goto L_0x0049;
    L_0x0044:
        r1 = new java.lang.String;
        r1.<init>(r2);
    L_0x0049:
        com.google.android.gms.internal.zzaiw.zzco(r1);
        goto L_0x000f;
    L_0x004d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzack.destroy():void");
    }

    public final boolean isLoaded() {
        zzbq.zzga("isLoaded must be called on the main UI thread.");
        return this.zzamt.zzatf == null && this.zzamt.zzatg == null && this.zzamt.zzati != null && !this.zzcti;
    }

    public final void onContextChanged(@NonNull Context context) {
        for (zzadr zzoc : this.zzcth.values()) {
            try {
                zzoc.zzoc().zzg(zzn.zzy(context));
            } catch (Throwable e) {
                zzaiw.zzb("Unable to call Adapter.onContextChanged.", e);
            }
        }
    }

    public final void onRewardedVideoAdClosed() {
        if (zzbs.zzfa().zzv(this.zzamt.zzaif)) {
            this.zzapk.zzu(false);
        }
        zzbp();
    }

    public final void onRewardedVideoAdLeftApplication() {
        zzbq();
    }

    public final void onRewardedVideoAdOpened() {
        if (zzbs.zzfa().zzv(this.zzamt.zzaif)) {
            this.zzapk.zzu(true);
        }
        zza(this.zzamt.zzati, false);
        zzbr();
    }

    public final void onRewardedVideoStarted() {
        if (!(this.zzamt.zzati == null || this.zzamt.zzati.zzcdd == null)) {
            zzbs.zzew();
            zztv.zza(this.zzamt.zzaif, this.zzamt.zzatd.zzcp, this.zzamt.zzati, this.zzamt.zzatb, false, this.zzamt.zzati.zzcdd.zzcbl);
        }
        zzbv();
    }

    public final void pause() {
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
        r0 = "pause must be called on the main UI thread.";
        com.google.android.gms.common.internal.zzbq.zzga(r0);
        r0 = r4.zzcth;
        r0 = r0.keySet();
        r0 = r0.iterator();
    L_0x000f:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x004d;
    L_0x0015:
        r1 = r0.next();
        r1 = (java.lang.String) r1;
        r2 = r4.zzcth;	 Catch:{ RemoteException -> 0x0033 }
        r2 = r2.get(r1);	 Catch:{ RemoteException -> 0x0033 }
        r2 = (com.google.android.gms.internal.zzadr) r2;	 Catch:{ RemoteException -> 0x0033 }
        if (r2 == 0) goto L_0x000f;	 Catch:{ RemoteException -> 0x0033 }
    L_0x0025:
        r3 = r2.zzoc();	 Catch:{ RemoteException -> 0x0033 }
        if (r3 == 0) goto L_0x000f;	 Catch:{ RemoteException -> 0x0033 }
    L_0x002b:
        r2 = r2.zzoc();	 Catch:{ RemoteException -> 0x0033 }
        r2.pause();	 Catch:{ RemoteException -> 0x0033 }
        goto L_0x000f;
    L_0x0033:
        r2 = "Fail to pause adapter: ";
        r1 = java.lang.String.valueOf(r1);
        r3 = r1.length();
        if (r3 == 0) goto L_0x0044;
    L_0x003f:
        r1 = r2.concat(r1);
        goto L_0x0049;
    L_0x0044:
        r1 = new java.lang.String;
        r1.<init>(r2);
    L_0x0049:
        com.google.android.gms.internal.zzaiw.zzco(r1);
        goto L_0x000f;
    L_0x004d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzack.pause():void");
    }

    public final void resume() {
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
        r0 = "resume must be called on the main UI thread.";
        com.google.android.gms.common.internal.zzbq.zzga(r0);
        r0 = r4.zzcth;
        r0 = r0.keySet();
        r0 = r0.iterator();
    L_0x000f:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x004d;
    L_0x0015:
        r1 = r0.next();
        r1 = (java.lang.String) r1;
        r2 = r4.zzcth;	 Catch:{ RemoteException -> 0x0033 }
        r2 = r2.get(r1);	 Catch:{ RemoteException -> 0x0033 }
        r2 = (com.google.android.gms.internal.zzadr) r2;	 Catch:{ RemoteException -> 0x0033 }
        if (r2 == 0) goto L_0x000f;	 Catch:{ RemoteException -> 0x0033 }
    L_0x0025:
        r3 = r2.zzoc();	 Catch:{ RemoteException -> 0x0033 }
        if (r3 == 0) goto L_0x000f;	 Catch:{ RemoteException -> 0x0033 }
    L_0x002b:
        r2 = r2.zzoc();	 Catch:{ RemoteException -> 0x0033 }
        r2.resume();	 Catch:{ RemoteException -> 0x0033 }
        goto L_0x000f;
    L_0x0033:
        r2 = "Fail to resume adapter: ";
        r1 = java.lang.String.valueOf(r1);
        r3 = r1.length();
        if (r3 == 0) goto L_0x0044;
    L_0x003f:
        r1 = r2.concat(r1);
        goto L_0x0049;
    L_0x0044:
        r1 = new java.lang.String;
        r1.<init>(r2);
    L_0x0049:
        com.google.android.gms.internal.zzaiw.zzco(r1);
        goto L_0x000f;
    L_0x004d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzack.resume():void");
    }

    public final void setImmersiveMode(boolean z) {
        zzbq.zzga("setImmersiveMode must be called on the main UI thread.");
        this.zzapj = z;
    }

    public final void zza(zzadb zzadb) {
        zzbq.zzga("loadAd must be called on the main UI thread.");
        if (TextUtils.isEmpty(zzadb.zzatb)) {
            zzaiw.zzco("Invalid ad unit id. Aborting.");
            zzagr.zzczc.post(new zzacl(this));
            return;
        }
        this.zzcti = false;
        this.zzamt.zzatb = zzadb.zzatb;
        this.zzapk.setAdUnitId(zzadb.zzatb);
        super.zzb(zzadb.zzclo);
    }

    public final void zza(zzaev zzaev, zznd zznd) {
        if (zzaev.errorCode != -2) {
            zzagr.zzczc.post(new zzacm(this, zzaev));
            return;
        }
        this.zzamt.zzatj = zzaev;
        if (zzaev.zzcvs == null) {
            this.zzamt.zzatj = zzc(zzaev);
        }
        this.zzamt.zzaue = 0;
        zzbt zzbt = this.zzamt;
        zzbs.zzeb();
        zzahi zzado = new zzado(this.zzamt.zzaif, this.zzamt.zzatj, this);
        String str = "AdRenderer: ";
        String valueOf = String.valueOf(zzado.getClass().getName());
        zzaiw.zzbw(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        zzado.zzmx();
        zzbt.zzatg = zzado;
    }

    public final boolean zza(zzaeu zzaeu, zzaeu zzaeu2) {
        return true;
    }

    protected final boolean zza(zzis zzis, zzaeu zzaeu, boolean z) {
        return false;
    }

    @Nullable
    public final zzadr zzbp(String str) {
        Throwable e;
        String str2;
        zzadr zzadr = (zzadr) this.zzcth.get(str);
        if (zzadr == null) {
            try {
                zzuc zzuc = this.zzanb;
                if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                    zzuc = zzctg;
                }
                zzadr zzadr2 = new zzadr(zzuc.zzbf(str), this);
                try {
                    this.zzcth.put(str, zzadr2);
                    return zzadr2;
                } catch (Exception e2) {
                    e = e2;
                    zzadr = zzadr2;
                    str2 = "Fail to instantiate adapter ";
                    str = String.valueOf(str);
                    zzaiw.zzc(str.length() == 0 ? new String(str2) : str2.concat(str), e);
                    return zzadr;
                }
            } catch (Exception e3) {
                e = e3;
                str2 = "Fail to instantiate adapter ";
                str = String.valueOf(str);
                if (str.length() == 0) {
                }
                zzaiw.zzc(str.length() == 0 ? new String(str2) : str2.concat(str), e);
                return zzadr;
            }
        }
        return zzadr;
    }

    protected final void zzbp() {
        this.zzamt.zzati = null;
        super.zzbp();
    }

    public final void zzc(@Nullable zzadw zzadw) {
        if (!(this.zzamt.zzati == null || this.zzamt.zzati.zzcvs == null || TextUtils.isEmpty(this.zzamt.zzati.zzcvs.zzccc))) {
            zzadw = new zzadw(this.zzamt.zzati.zzcvs.zzccc, this.zzamt.zzati.zzcvs.zzccd);
        }
        if (!(this.zzamt.zzati == null || this.zzamt.zzati.zzcdd == null)) {
            zzbs.zzew();
            zztv.zza(this.zzamt.zzaif, this.zzamt.zzatd.zzcp, this.zzamt.zzati.zzcdd.zzcbm, this.zzamt.zzaua, zzadw);
        }
        zza(zzadw);
    }

    public final void zznv() {
        zzbq.zzga("showAd must be called on the main UI thread.");
        if (isLoaded()) {
            this.zzcti = true;
            zzadr zzbp = zzbp(this.zzamt.zzati.zzcdf);
            if (!(zzbp == null || zzbp.zzoc() == null)) {
                try {
                    zzbp.zzoc().setImmersiveMode(this.zzapj);
                    zzbp.zzoc().showVideo();
                    return;
                } catch (Throwable e) {
                    zzaiw.zzc("Could not call showVideo.", e);
                }
            }
            return;
        }
        zzaiw.zzco("The reward video has not loaded.");
    }

    public final void zznw() {
        onAdClicked();
    }
}
