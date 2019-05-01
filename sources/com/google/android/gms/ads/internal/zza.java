package com.google.android.gms.ads.internal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.ads.internal.gmsg.zzb;
import com.google.android.gms.ads.internal.overlay.zzq;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.common.util.zzi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;
import com.google.android.gms.internal.zzaci;
import com.google.android.gms.internal.zzacv;
import com.google.android.gms.internal.zzadw;
import com.google.android.gms.internal.zzaeo;
import com.google.android.gms.internal.zzaeu;
import com.google.android.gms.internal.zzaev;
import com.google.android.gms.internal.zzaew;
import com.google.android.gms.internal.zzafe;
import com.google.android.gms.internal.zzaff;
import com.google.android.gms.internal.zzagr;
import com.google.android.gms.internal.zzais;
import com.google.android.gms.internal.zzaiw;
import com.google.android.gms.internal.zzanp;
import com.google.android.gms.internal.zzfb;
import com.google.android.gms.internal.zzib;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzis;
import com.google.android.gms.internal.zzit;
import com.google.android.gms.internal.zziw;
import com.google.android.gms.internal.zzjk;
import com.google.android.gms.internal.zzjn;
import com.google.android.gms.internal.zzjq;
import com.google.android.gms.internal.zzkc;
import com.google.android.gms.internal.zzkg;
import com.google.android.gms.internal.zzkm;
import com.google.android.gms.internal.zzku;
import com.google.android.gms.internal.zzla;
import com.google.android.gms.internal.zzly;
import com.google.android.gms.internal.zzma;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.internal.zznb;
import com.google.android.gms.internal.zznd;
import com.google.android.gms.internal.zznj;
import com.google.android.gms.internal.zzwq;
import com.google.android.gms.internal.zzww;
import com.google.android.gms.internal.zzxg;
import com.google.android.gms.internal.zzzb;
import com.google.android.gms.internal.zzzd;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.CountDownLatch;

@zzzb
public abstract class zza extends zzkc implements zzb, zzq, zzafe, zzin, zzxg, zzzd {
    protected zznd zzamo;
    protected zznb zzamp;
    private zznb zzamq;
    protected boolean zzamr = false;
    protected final zzbi zzams;
    protected final zzbt zzamt;
    @Nullable
    protected transient zzis zzamu;
    protected final zzfb zzamv;
    protected final zzv zzamw;

    zza(zzbt zzbt, @Nullable zzbi zzbi, zzv zzv) {
        this.zzamt = zzbt;
        this.zzams = new zzbi(this);
        this.zzamw = zzv;
        zzbs.zzec().zzah(this.zzamt.zzaif);
        zzbs.zzfb().initialize(this.zzamt.zzaif);
        zzbs.zzeg().zzd(this.zzamt.zzaif, this.zzamt.zzatd);
        zzbs.zzeh().initialize(this.zzamt.zzaif);
        this.zzamv = zzbs.zzeg().zzpm();
        zzbs.zzef().initialize(this.zzamt.zzaif);
        if (((Boolean) zzbs.zzep().zzd(zzmq.zzbng)).booleanValue()) {
            Timer timer = new Timer();
            timer.schedule(new zzb(this, new CountDownLatch(((Integer) zzbs.zzep().zzd(zzmq.zzbni)).intValue()), timer), 0, ((Long) zzbs.zzep().zzd(zzmq.zzbnh)).longValue());
        }
    }

    protected static boolean zza(zzis zzis) {
        Bundle bundle = zzis.zzbcf.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            if (bundle.containsKey("gw")) {
                return false;
            }
        }
        return true;
    }

    private static long zzq(java.lang.String r3) {
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
        r0 = "ufe";
        r0 = r3.indexOf(r0);
        r1 = 44;
        r1 = r3.indexOf(r1, r0);
        r2 = -1;
        if (r1 != r2) goto L_0x0013;
    L_0x000f:
        r1 = r3.length();
    L_0x0013:
        r0 = r0 + 4;
        r3 = r3.substring(r0, r1);	 Catch:{ IndexOutOfBoundsException -> 0x0021, NumberFormatException -> 0x001e }
        r0 = java.lang.Long.parseLong(r3);	 Catch:{ IndexOutOfBoundsException -> 0x0021, NumberFormatException -> 0x001e }
        return r0;
    L_0x001e:
        r3 = "Cannot find valid format of Url fetch time in CSI latency info.";
        goto L_0x0023;
    L_0x0021:
        r3 = "Invalid index for Url fetch time in CSI latency info.";
    L_0x0023:
        com.google.android.gms.internal.zzaiw.zzco(r3);
        r0 = -1;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zza.zzq(java.lang.String):long");
    }

    public void destroy() {
        zzbq.zzga("destroy must be called on the main UI thread.");
        this.zzams.cancel();
        this.zzamv.zzi(this.zzamt.zzati);
        zzbt zzbt = this.zzamt;
        if (zzbt.zzate != null) {
            zzbt.zzate.zzfk();
        }
        zzbt.zzatm = null;
        zzbt.zzatn = null;
        zzbt.zzaty = null;
        zzbt.zzato = null;
        zzbt.zzf(false);
        if (zzbt.zzate != null) {
            zzbt.zzate.removeAllViews();
        }
        zzbt.zzfe();
        zzbt.zzff();
        zzbt.zzati = null;
    }

    public String getAdUnitId() {
        return this.zzamt.zzatb;
    }

    public zzku getVideoController() {
        return null;
    }

    public final boolean isLoading() {
        return this.zzamr;
    }

    public final boolean isReady() {
        zzbq.zzga("isLoaded must be called on the main UI thread.");
        return this.zzamt.zzatf == null && this.zzamt.zzatg == null && this.zzamt.zzati != null;
    }

    public void onAdClicked() {
        if (this.zzamt.zzati == null) {
            zzaiw.zzco("Ad state was null when trying to ping click URLs.");
            return;
        }
        zzaiw.zzbw("Pinging click URLs.");
        if (this.zzamt.zzatk != null) {
            this.zzamt.zzatk.zzoj();
        }
        if (this.zzamt.zzati.zzcbv != null) {
            zzbs.zzec();
            zzagr.zza(this.zzamt.zzaif, this.zzamt.zzatd.zzcp, zzb(this.zzamt.zzati.zzcbv));
        }
        if (this.zzamt.zzatl != null) {
            try {
                this.zzamt.zzatl.onAdClicked();
            } catch (Throwable e) {
                zzaiw.zzc("Could not notify onAdClicked event.", e);
            }
        }
    }

    public final void onAppEvent(String str, @Nullable String str2) {
        if (this.zzamt.zzatn != null) {
            try {
                this.zzamt.zzatn.onAppEvent(str, str2);
            } catch (Throwable e) {
                zzaiw.zzc("Could not call the AppEventListener.", e);
            }
        }
    }

    public void pause() {
        zzbq.zzga("pause must be called on the main UI thread.");
    }

    public void resume() {
        zzbq.zzga("resume must be called on the main UI thread.");
    }

    public void setImmersiveMode(boolean z) {
        throw new IllegalStateException("onImmersiveModeUpdated is not supported for current ad type");
    }

    public void setManualImpressionsEnabled(boolean z) {
        zzaiw.zzco("Attempt to call setManualImpressionsEnabled for an unsupported ad type.");
    }

    public final void setUserId(String str) {
        zzbq.zzga("setUserId must be called on the main UI thread.");
        this.zzamt.zzaua = str;
    }

    public final void stopLoading() {
        zzbq.zzga("stopLoading must be called on the main UI thread.");
        this.zzamr = false;
        this.zzamt.zzf(true);
    }

    public final void zza(zzacv zzacv) {
        zzbq.zzga("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzamt.zzatz = zzacv;
    }

    protected final void zza(@Nullable zzadw zzadw) {
        if (this.zzamt.zzatz != null) {
            try {
                String str = "";
                int i = 1;
                if (zzadw != null) {
                    str = zzadw.type;
                    i = zzadw.zzcuk;
                }
                this.zzamt.zzatz.zza(new zzaci(str, i));
            } catch (Throwable e) {
                zzaiw.zzc("Could not call RewardedVideoAdListener.onRewarded().", e);
            }
        }
    }

    public final void zza(zzaev zzaev) {
        if (!(zzaev.zzcwe.zzcnk == -1 || TextUtils.isEmpty(zzaev.zzcwe.zzcnt))) {
            long zzq = zzq(zzaev.zzcwe.zzcnt);
            if (zzq != -1) {
                zznb zzc = this.zzamo.zzc(zzaev.zzcwe.zzcnk + zzq);
                this.zzamo.zza(zzc, "stc");
            }
        }
        this.zzamo.zzan(zzaev.zzcwe.zzcnt);
        this.zzamo.zza(this.zzamp, "arf");
        this.zzamq = this.zzamo.zziz();
        this.zzamo.zzf("gqi", zzaev.zzcwe.zzcnu);
        this.zzamt.zzatf = null;
        this.zzamt.zzatj = zzaev;
        zzaev.zzcwc.zza(new zzc(this, zzaev));
        zzaev.zzcwc.zza(com.google.android.gms.internal.zzid.zza.zzb.AD_LOADED);
        zza(zzaev, this.zzamo);
    }

    protected abstract void zza(zzaev zzaev, zznd zznd);

    public final void zza(zziw zziw) {
        zzbq.zzga("setAdSize must be called on the main UI thread.");
        this.zzamt.zzath = zziw;
        if (!(this.zzamt.zzati == null || this.zzamt.zzati.zzchj == null || this.zzamt.zzaue != 0)) {
            this.zzamt.zzati.zzchj.zza(zzanp.zzc(zziw));
        }
        if (this.zzamt.zzate != null) {
            if (this.zzamt.zzate.getChildCount() > 1) {
                this.zzamt.zzate.removeView(this.zzamt.zzate.getNextView());
            }
            this.zzamt.zzate.setMinimumWidth(zziw.widthPixels);
            this.zzamt.zzate.setMinimumHeight(zziw.heightPixels);
            this.zzamt.zzate.requestLayout();
        }
    }

    public final void zza(zzjn zzjn) {
        zzbq.zzga("setAdListener must be called on the main UI thread.");
        this.zzamt.zzatl = zzjn;
    }

    public final void zza(zzjq zzjq) {
        zzbq.zzga("setAdListener must be called on the main UI thread.");
        this.zzamt.zzatm = zzjq;
    }

    public final void zza(zzkg zzkg) {
        zzbq.zzga("setAppEventListener must be called on the main UI thread.");
        this.zzamt.zzatn = zzkg;
    }

    public final void zza(zzkm zzkm) {
        zzbq.zzga("setCorrelationIdProvider must be called on the main UI thread");
        this.zzamt.zzato = zzkm;
    }

    public final void zza(@Nullable zzla zzla) {
        zzbq.zzga("setIconAdOptions must be called on the main UI thread.");
        this.zzamt.zzatv = zzla;
    }

    public final void zza(@Nullable zzma zzma) {
        zzbq.zzga("setVideoOptions must be called on the main UI thread.");
        this.zzamt.zzatu = zzma;
    }

    public final void zza(zznb zznb) {
        this.zzamo = new zznd(((Boolean) zzbs.zzep().zzd(zzmq.zzbhx)).booleanValue(), "load_ad", this.zzamt.zzath.zzbda);
        this.zzamq = new zznb(-1, null, null);
        if (zznb == null) {
            this.zzamp = new zznb(-1, null, null);
        } else {
            this.zzamp = new zznb(zznb.getTime(), zznb.zziw(), zznb.zzix());
        }
    }

    public void zza(zznj zznj) {
        throw new IllegalStateException("setOnCustomRenderedAdLoadedListener is not supported for current ad type");
    }

    public void zza(zzwq zzwq) {
        zzaiw.zzco("setInAppPurchaseListener is deprecated and should not be called.");
    }

    public final void zza(zzww zzww, String str) {
        zzaiw.zzco("setPlayStorePurchaseParams is deprecated and should not be called.");
    }

    public final void zza(HashSet<zzaew> hashSet) {
        this.zzamt.zza(hashSet);
    }

    boolean zza(zzaeu zzaeu) {
        return false;
    }

    protected abstract boolean zza(@Nullable zzaeu zzaeu, zzaeu zzaeu2);

    protected abstract boolean zza(zzis zzis, zznd zznd);

    protected final List<String> zzb(List<String> list) {
        List arrayList = new ArrayList(list.size());
        for (String zzb : list) {
            arrayList.add(zzaeo.zzb(zzb, this.zzamt.zzaif));
        }
        return arrayList;
    }

    protected final void zzb(View view) {
        zzbu zzbu = this.zzamt.zzate;
        if (zzbu != null) {
            zzbu.addView(view, zzbs.zzee().zzqc());
        }
    }

    public void zzb(zzaeu zzaeu) {
        this.zzamo.zza(this.zzamq, "awr");
        this.zzamt.zzatg = null;
        if (!(zzaeu.errorCode == -2 || zzaeu.errorCode == 3 || this.zzamt.zzfd() == null)) {
            zzbs.zzeg().zzb(this.zzamt.zzfd());
        }
        if (zzaeu.errorCode == -1) {
            this.zzamr = false;
            return;
        }
        if (zza(zzaeu)) {
            zzaiw.zzbw("Ad refresh scheduled.");
        }
        if (zzaeu.errorCode != -2) {
            zzib zzib;
            com.google.android.gms.internal.zzid.zza.zzb zzb;
            if (zzaeu.errorCode == 3) {
                zzib = zzaeu.zzcwc;
                zzb = com.google.android.gms.internal.zzid.zza.zzb.AD_FAILED_TO_LOAD_NO_FILL;
            } else {
                zzib = zzaeu.zzcwc;
                zzb = com.google.android.gms.internal.zzid.zza.zzb.AD_FAILED_TO_LOAD;
            }
            zzib.zza(zzb);
            zzi(zzaeu.errorCode);
            return;
        }
        if (this.zzamt.zzauc == null) {
            this.zzamt.zzauc = new zzaff(this.zzamt.zzatb);
        }
        this.zzamv.zzh(this.zzamt.zzati);
        if (zza(this.zzamt.zzati, zzaeu)) {
            this.zzamt.zzati = zzaeu;
            zzbt zzbt = this.zzamt;
            if (zzbt.zzatk != null) {
                if (zzbt.zzati != null) {
                    zzbt.zzatk.zzg(zzbt.zzati.zzcvw);
                    zzbt.zzatk.zzh(zzbt.zzati.zzcvx);
                    zzbt.zzatk.zzw(zzbt.zzati.zzcng);
                }
                zzbt.zzatk.zzv(zzbt.zzath.zzbdb);
            }
            this.zzamo.zzf("is_mraid", this.zzamt.zzati.zzfr() ? "1" : "0");
            this.zzamo.zzf("is_mediation", this.zzamt.zzati.zzcng ? "1" : "0");
            if (!(this.zzamt.zzati.zzchj == null || this.zzamt.zzati.zzchj.zzsq() == null)) {
                this.zzamo.zzf("is_delay_pl", this.zzamt.zzati.zzchj.zzsq().zzth() ? "1" : "0");
            }
            this.zzamo.zza(this.zzamp, "ttc");
            if (zzbs.zzeg().zzow() != null) {
                zzbs.zzeg().zzow().zza(this.zzamo);
            }
            zzbw();
            if (this.zzamt.zzfg()) {
                zzbs();
            }
        }
        if (zzaeu.zzcby != null) {
            zzbs.zzec().zza(this.zzamt.zzaif, zzaeu.zzcby);
        }
    }

    public boolean zzb(zzis zzis) {
        zzbq.zzga("loadAd must be called on the main UI thread.");
        zzbs.zzeh().zzhb();
        if (((Boolean) zzbs.zzep().zzd(zzmq.zzbjy)).booleanValue()) {
            zzis.zzh(zzis);
        }
        if (zzi.zzcr(this.zzamt.zzaif) && zzis.zzbcd != null) {
            zzis = new zzit(zzis).zza(null).zzho();
        }
        if (this.zzamt.zzatf == null) {
            if (this.zzamt.zzatg == null) {
                String str;
                zzaiw.zzcn("Starting ad request.");
                zza(null);
                this.zzamp = this.zzamo.zziz();
                if (zzis.zzbby) {
                    str = "This request is sent from a test device.";
                } else {
                    zzjk.zzhx();
                    str = zzais.zzbb(this.zzamt.zzaif);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 71);
                    stringBuilder.append("Use AdRequest.Builder.addTestDevice(\"");
                    stringBuilder.append(str);
                    stringBuilder.append("\") to get test ads on this device.");
                    str = stringBuilder.toString();
                }
                zzaiw.zzcn(str);
                this.zzams.zzf(zzis);
                this.zzamr = zza(zzis, this.zzamo);
                return this.zzamr;
            }
        }
        zzaiw.zzco(this.zzamu != null ? "Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes." : "Loading already in progress, saving this object for future refreshes.");
        this.zzamu = zzis;
        return false;
    }

    public final zzv zzbk() {
        return this.zzamw;
    }

    public final IObjectWrapper zzbl() {
        zzbq.zzga("getAdFrame must be called on the main UI thread.");
        return zzn.zzy(this.zzamt.zzate);
    }

    @Nullable
    public final zziw zzbm() {
        zzbq.zzga("getAdSize must be called on the main UI thread.");
        return this.zzamt.zzath == null ? null : new zzly(this.zzamt.zzath);
    }

    public final void zzbn() {
        zzbq();
    }

    public final void zzbo() {
        zzbq.zzga("recordManualImpression must be called on the main UI thread.");
        if (this.zzamt.zzati == null) {
            zzaiw.zzco("Ad state was null when trying to ping manual tracking URLs.");
            return;
        }
        zzaiw.zzbw("Pinging manual tracking URLs.");
        if (!this.zzamt.zzati.zzcwa) {
            List arrayList = new ArrayList();
            if (this.zzamt.zzati.zzcni != null) {
                arrayList.addAll(this.zzamt.zzati.zzcni);
            }
            if (!(this.zzamt.zzati.zzcdd == null || this.zzamt.zzati.zzcdd.zzcbi == null)) {
                arrayList.addAll(this.zzamt.zzati.zzcdd.zzcbi);
            }
            if (!arrayList.isEmpty()) {
                zzbs.zzec();
                zzagr.zza(this.zzamt.zzaif, this.zzamt.zzatd.zzcp, arrayList);
                this.zzamt.zzati.zzcwa = true;
            }
        }
    }

    protected void zzbp() {
        zzaiw.zzcn("Ad closing.");
        if (this.zzamt.zzatm != null) {
            try {
                this.zzamt.zzatm.onAdClosed();
            } catch (Throwable e) {
                zzaiw.zzc("Could not call AdListener.onAdClosed().", e);
            }
        }
        if (this.zzamt.zzatz != null) {
            try {
                this.zzamt.zzatz.onRewardedVideoAdClosed();
            } catch (Throwable e2) {
                zzaiw.zzc("Could not call RewardedVideoAdListener.onRewardedVideoAdClosed().", e2);
            }
        }
    }

    protected final void zzbq() {
        zzaiw.zzcn("Ad leaving application.");
        if (this.zzamt.zzatm != null) {
            try {
                this.zzamt.zzatm.onAdLeftApplication();
            } catch (Throwable e) {
                zzaiw.zzc("Could not call AdListener.onAdLeftApplication().", e);
            }
        }
        if (this.zzamt.zzatz != null) {
            try {
                this.zzamt.zzatz.onRewardedVideoAdLeftApplication();
            } catch (Throwable e2) {
                zzaiw.zzc("Could not call  RewardedVideoAdListener.onRewardedVideoAdLeftApplication().", e2);
            }
        }
    }

    protected final void zzbr() {
        zzaiw.zzcn("Ad opening.");
        if (this.zzamt.zzatm != null) {
            try {
                this.zzamt.zzatm.onAdOpened();
            } catch (Throwable e) {
                zzaiw.zzc("Could not call AdListener.onAdOpened().", e);
            }
        }
        if (this.zzamt.zzatz != null) {
            try {
                this.zzamt.zzatz.onRewardedVideoAdOpened();
            } catch (Throwable e2) {
                zzaiw.zzc("Could not call RewardedVideoAdListener.onRewardedVideoAdOpened().", e2);
            }
        }
    }

    protected void zzbs() {
        zzc(false);
    }

    public final void zzbt() {
        zzaiw.zzcn("Ad impression.");
        if (this.zzamt.zzatm != null) {
            try {
                this.zzamt.zzatm.onAdImpression();
            } catch (Throwable e) {
                zzaiw.zzc("Could not call AdListener.onAdImpression().", e);
            }
        }
    }

    public final void zzbu() {
        zzaiw.zzcn("Ad clicked.");
        if (this.zzamt.zzatm != null) {
            try {
                this.zzamt.zzatm.onAdClicked();
            } catch (Throwable e) {
                zzaiw.zzc("Could not call AdListener.onAdClicked().", e);
            }
        }
    }

    protected final void zzbv() {
        if (this.zzamt.zzatz != null) {
            try {
                this.zzamt.zzatz.onRewardedVideoStarted();
            } catch (Throwable e) {
                zzaiw.zzc("Could not call RewardedVideoAdListener.onVideoStarted().", e);
            }
        }
    }

    public final void zzbw() {
        zzaeu zzaeu = this.zzamt.zzati;
        if (zzaeu != null && !TextUtils.isEmpty(zzaeu.zzcoc) && !zzaeu.zzcwb && zzbs.zzel().zzqk()) {
            zzaiw.zzbw("Sending troubleshooting signals to the server.");
            zzbs.zzel().zza(this.zzamt.zzaif, this.zzamt.zzatd.zzcp, zzaeu.zzcoc, this.zzamt.zzatb);
            zzaeu.zzcwb = true;
        }
    }

    public final zzkg zzbx() {
        return this.zzamt.zzatn;
    }

    public final zzjq zzby() {
        return this.zzamt.zzatm;
    }

    protected void zzc(int i, boolean z) {
        StringBuilder stringBuilder = new StringBuilder(30);
        stringBuilder.append("Failed to load ad: ");
        stringBuilder.append(i);
        zzaiw.zzco(stringBuilder.toString());
        this.zzamr = z;
        if (this.zzamt.zzatm != null) {
            try {
                this.zzamt.zzatm.onAdFailedToLoad(i);
            } catch (Throwable e) {
                zzaiw.zzc("Could not call AdListener.onAdFailedToLoad().", e);
            }
        }
        if (this.zzamt.zzatz != null) {
            try {
                this.zzamt.zzatz.onRewardedVideoAdFailedToLoad(i);
            } catch (Throwable e2) {
                zzaiw.zzc("Could not call RewardedVideoAdListener.onRewardedVideoAdFailedToLoad().", e2);
            }
        }
    }

    protected void zzc(boolean z) {
        zzaiw.zzcn("Ad finished loading.");
        this.zzamr = z;
        if (this.zzamt.zzatm != null) {
            try {
                this.zzamt.zzatm.onAdLoaded();
            } catch (Throwable e) {
                zzaiw.zzc("Could not call AdListener.onAdLoaded().", e);
            }
        }
        if (this.zzamt.zzatz != null) {
            try {
                this.zzamt.zzatz.onRewardedVideoAdLoaded();
            } catch (Throwable e2) {
                zzaiw.zzc("Could not call RewardedVideoAdListener.onRewardedVideoAdLoaded().", e2);
            }
        }
    }

    protected boolean zzc(zzis zzis) {
        if (this.zzamt.zzate == null) {
            return false;
        }
        ViewParent parent = this.zzamt.zzate.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        return zzbs.zzec().zza(view, view.getContext());
    }

    protected void zzi(int i) {
        zzc(i, false);
    }
}
