package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.util.SimpleArrayMap;
import android.util.Log;
import android.view.View;
import com.google.ads.AdRequest;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.dynamic.zzn;
import com.google.android.gms.internal.zzaeu;
import com.google.android.gms.internal.zzaev;
import com.google.android.gms.internal.zzafj;
import com.google.android.gms.internal.zzagl;
import com.google.android.gms.internal.zzagr;
import com.google.android.gms.internal.zzaiw;
import com.google.android.gms.internal.zzaiy;
import com.google.android.gms.internal.zzajp;
import com.google.android.gms.internal.zzajy;
import com.google.android.gms.internal.zzama;
import com.google.android.gms.internal.zzamm;
import com.google.android.gms.internal.zzfb;
import com.google.android.gms.internal.zzfe;
import com.google.android.gms.internal.zzis;
import com.google.android.gms.internal.zziw;
import com.google.android.gms.internal.zzku;
import com.google.android.gms.internal.zzkx;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.internal.zznd;
import com.google.android.gms.internal.zznj;
import com.google.android.gms.internal.zzns;
import com.google.android.gms.internal.zznu;
import com.google.android.gms.internal.zznw;
import com.google.android.gms.internal.zzny;
import com.google.android.gms.internal.zznz;
import com.google.android.gms.internal.zzoa;
import com.google.android.gms.internal.zzob;
import com.google.android.gms.internal.zzoc;
import com.google.android.gms.internal.zzoy;
import com.google.android.gms.internal.zzpu;
import com.google.android.gms.internal.zzqe;
import com.google.android.gms.internal.zzqh;
import com.google.android.gms.internal.zztn;
import com.google.android.gms.internal.zzuc;
import com.google.android.gms.internal.zzuf;
import com.google.android.gms.internal.zzuo;
import com.google.android.gms.internal.zzur;
import com.google.android.gms.internal.zzwq;
import com.google.android.gms.internal.zzxf;
import com.google.android.gms.internal.zzyg;
import com.google.android.gms.internal.zzyk;
import com.google.android.gms.internal.zzzb;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

@zzzb
public final class zzba extends zzd implements zzob {
    private final Object mLock;
    private boolean zzane;
    private boolean zzaqm;
    private zzajy<zzoc> zzaqn;
    private zzama zzaqo;
    private int zzaqp;
    private zzyg zzaqq;
    private final String zzaqr;

    public zzba(Context context, zzv zzv, zziw zziw, String str, zzuc zzuc, zzaiy zzaiy) {
        this(context, zzv, zziw, str, zzuc, zzaiy, false);
    }

    public zzba(Context context, zzv zzv, zziw zziw, String str, zzuc zzuc, zzaiy zzaiy, boolean z) {
        super(context, zziw, str, zzuc, zzaiy, zzv);
        this.mLock = new Object();
        this.zzaqn = new zzajy();
        this.zzaqp = 1;
        this.zzaqr = UUID.randomUUID().toString();
        this.zzaqm = z;
    }

    private static void zza(zzbt zzbt, zzbt zzbt2) {
        if (zzbt2.zzatp == null) {
            zzbt2.zzatp = zzbt.zzatp;
        }
        if (zzbt2.zzatq == null) {
            zzbt2.zzatq = zzbt.zzatq;
        }
        if (zzbt2.zzatr == null) {
            zzbt2.zzatr = zzbt.zzatr;
        }
        if (zzbt2.zzats == null) {
            zzbt2.zzats = zzbt.zzats;
        }
        if (zzbt2.zzatu == null) {
            zzbt2.zzatu = zzbt.zzatu;
        }
        if (zzbt2.zzatt == null) {
            zzbt2.zzatt = zzbt.zzatt;
        }
        if (zzbt2.zzaub == null) {
            zzbt2.zzaub = zzbt.zzaub;
        }
        if (zzbt2.zzatk == null) {
            zzbt2.zzatk = zzbt.zzatk;
        }
        if (zzbt2.zzauc == null) {
            zzbt2.zzauc = zzbt.zzauc;
        }
        if (zzbt2.zzatl == null) {
            zzbt2.zzatl = zzbt.zzatl;
        }
        if (zzbt2.zzatm == null) {
            zzbt2.zzatm = zzbt.zzatm;
        }
        if (zzbt2.zzath == null) {
            zzbt2.zzath = zzbt.zzath;
        }
        if (zzbt2.zzati == null) {
            zzbt2.zzati = zzbt.zzati;
        }
        if (zzbt2.zzatj == null) {
            zzbt2.zzatj = zzbt.zzatj;
        }
    }

    private final void zza(zzns zzns) {
        zzagr.zzczc.post(new zzbe(this, zzns));
    }

    private final void zza(zznu zznu) {
        zzagr.zzczc.post(new zzbf(this, zznu));
    }

    @Nullable
    private final zztn zzcs() {
        return (this.zzamt.zzati == null || !this.zzamt.zzati.zzcng) ? null : this.zzamt.zzati.zzcvs;
    }

    private final void zzdq() {
        zzyg zzdk = zzdk();
        if (zzdk != null) {
            zzdk.zzlm();
        }
    }

    public final String getAdUnitId() {
        return this.zzamt.zzatb;
    }

    public final String getUuid() {
        return this.zzaqr;
    }

    public final void pause() {
        throw new IllegalStateException("Native Ad DOES NOT support pause().");
    }

    public final void resume() {
        throw new IllegalStateException("Native Ad DOES NOT support resume().");
    }

    public final void showInterstitial() {
        throw new IllegalStateException("Interstitial is NOT supported by NativeAdManager.");
    }

    public final void zza(zzaev zzaev, zznd zznd) {
        if (zzaev.zzath != null) {
            this.zzamt.zzath = zzaev.zzath;
        }
        if (zzaev.errorCode != -2) {
            zzagr.zzczc.post(new zzbb(this, zzaev));
            return;
        }
        int i = zzaev.zzcpe.zzcmz;
        int i2 = 0;
        if (i == 1) {
            this.zzamt.zzaue = 0;
            zzbt zzbt = this.zzamt;
            zzbs.zzeb();
            zzbt.zzatg = zzxf.zza(this.zzamt.zzaif, this, zzaev, this.zzamt.zzatc, null, this.zzanb, this, zznd);
            String str = "AdRenderer: ";
            String valueOf = String.valueOf(this.zzamt.zzatg.getClass().getName());
            zzaiw.zzbw(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            return;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray jSONArray2 = new JSONObject(zzaev.zzcwe.body).getJSONArray("slots");
            for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                JSONArray jSONArray3 = jSONArray2.getJSONObject(i3).getJSONArray("ads");
                for (int i4 = 0; i4 < jSONArray3.length(); i4++) {
                    jSONArray.put(jSONArray3.get(i4));
                }
            }
            zzdq();
            ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(i);
            List arrayList = new ArrayList();
            for (int i5 = 0; i5 < i; i5++) {
                arrayList.add(zzagl.zza(newFixedThreadPool, new zzbc(this, i5, jSONArray, i, zzaev)));
            }
            while (i2 < arrayList.size()) {
                try {
                    zzagr.zzczc.post(new zzbd(this, (zzoc) ((zzajp) arrayList.get(i2)).get(((Long) zzbs.zzep().zzd(zzmq.zzblt)).longValue(), TimeUnit.MILLISECONDS), i2, arrayList));
                } catch (Throwable e) {
                    zzaiw.zzc("Exception occurred while getting an ad response", e);
                    Thread.currentThread().interrupt();
                } catch (Throwable e2) {
                    zzaiw.zzc("Exception occurred while getting an ad response", e2);
                }
                i2++;
            }
        } catch (Throwable e22) {
            zzaiw.zzc("Malformed native ad response", e22);
            zzi(0);
        }
    }

    public final void zza(zznj zznj) {
        throw new IllegalStateException("CustomRendering is NOT supported by NativeAdManager.");
    }

    public final void zza(zzny zzny) {
        if (this.zzaqo != null) {
            this.zzaqo.zzb(zzny);
        }
    }

    public final void zza(zzoa zzoa) {
        if (this.zzamt.zzati.zzcvq != null) {
            zzbs.zzeg().zzpm().zza(this.zzamt.zzath, this.zzamt.zzati, new zzfe(zzoa), null);
        }
    }

    public final void zza(zzwq zzwq) {
        throw new IllegalStateException("In App Purchase is NOT supported by NativeAdManager.");
    }

    protected final boolean zza(zzaeu zzaeu, zzaeu zzaeu2) {
        zzaeu zzaeu3 = zzaeu2;
        List list = null;
        zzc(null);
        if (this.zzamt.zzfg()) {
            if (zzaeu3.zzcng) {
                zzdq();
                try {
                    zzuo zzly = zzaeu3.zzcde != null ? zzaeu3.zzcde.zzly() : null;
                    zzur zzlz = zzaeu3.zzcde != null ? zzaeu3.zzcde.zzlz() : null;
                    zzpu zzmd = zzaeu3.zzcde != null ? zzaeu3.zzcde.zzmd() : null;
                    String zzc = zzd.zzc(zzaeu2);
                    String headline;
                    List images;
                    String body;
                    zzoy zzjm;
                    String callToAction;
                    if (zzly != null && r7.zzamt.zzatp != null) {
                        headline = zzly.getHeadline();
                        images = zzly.getImages();
                        body = zzly.getBody();
                        zzjm = zzly.zzjm() != null ? zzly.zzjm() : null;
                        callToAction = zzly.getCallToAction();
                        double starRating = zzly.getStarRating();
                        String store = zzly.getStore();
                        String price = zzly.getPrice();
                        Bundle extras = zzly.getExtras();
                        zzku videoController = zzly.getVideoController();
                        if (zzly.zzmf() != null) {
                            list = (View) zzn.zzx(zzly.zzmf());
                        }
                        zzoc zzns = new zzns(headline, images, body, zzjm, callToAction, starRating, store, price, null, extras, videoController, list, zzly.zzjr(), zzc);
                        zzns zzns2 = zzns;
                        zzns2.zzb(new zznz(r7.zzamt.zzaif, (zzob) r7, r7.zzamt.zzatc, zzly, zzns));
                        zza(zzns2);
                    } else if (zzlz != null && r7.zzamt.zzatq != null) {
                        headline = zzlz.getHeadline();
                        images = zzlz.getImages();
                        body = zzlz.getBody();
                        zzjm = zzlz.zzjt() != null ? zzlz.zzjt() : null;
                        callToAction = zzlz.getCallToAction();
                        String advertiser = zzlz.getAdvertiser();
                        Bundle extras2 = zzlz.getExtras();
                        zzku videoController2 = zzlz.getVideoController();
                        if (zzlz.zzmf() != null) {
                            list = (View) zzn.zzx(zzlz.zzmf());
                        }
                        zznu zznu = new zznu(headline, images, body, zzjm, callToAction, advertiser, null, extras2, videoController2, list, zzlz.zzjr(), zzc);
                        zznu.zzb(new zznz(r7.zzamt.zzaif, (zzob) r7, r7.zzamt.zzatc, zzlz, (zzoc) zznu));
                        zza(zznu);
                    } else if (zzmd == null || r7.zzamt.zzats == null || r7.zzamt.zzats.get(zzmd.getCustomTemplateId()) == null) {
                        zzaiw.zzco("No matching mapper/listener for retrieved native ad template.");
                        zzi(0);
                        return false;
                    } else {
                        zzagr.zzczc.post(new zzbh(r7, zzmd));
                    }
                } catch (Throwable e) {
                    zzaiw.zzc("Failed to get native ad mapper", e);
                }
            } else {
                zzoc zzoc = zzaeu3.zzcvy;
                if (r7.zzaqm) {
                    r7.zzaqn.set(zzoc);
                } else if ((zzoc instanceof zznu) && r7.zzamt.zzatq != null) {
                    zza((zznu) zzaeu3.zzcvy);
                } else if (!(zzoc instanceof zzns) || r7.zzamt.zzatp == null) {
                    if ((zzoc instanceof zznw) && r7.zzamt.zzats != null) {
                        zznw zznw = (zznw) zzoc;
                        if (r7.zzamt.zzats.get(zznw.getCustomTemplateId()) != null) {
                            zzagr.zzczc.post(new zzbg(r7, zznw.getCustomTemplateId(), zzaeu3));
                        }
                    }
                    zzaiw.zzco("No matching listener for retrieved native ad template.");
                    zzi(0);
                    return false;
                } else {
                    zza((zzns) zzaeu3.zzcvy);
                }
            }
            return super.zza(zzaeu, zzaeu2);
        }
        throw new IllegalStateException("Native ad DOES NOT have custom rendering mode.");
    }

    protected final boolean zza(zzis zzis, zzaeu zzaeu, boolean z) {
        return this.zzams.zzdr();
    }

    public final boolean zza(zzis zzis, zznd zznd) {
        try {
            zzdj();
            return super.zza(zzis, zznd, this.zzaqp);
        } catch (Throwable e) {
            String str = "Error initializing webview.";
            if (zzaiw.zzae(4)) {
                Log.i(AdRequest.LOGTAG, str, e);
            }
            return false;
        }
    }

    protected final void zzbs() {
        zzc(false);
    }

    protected final void zzc(int i, boolean z) {
        zzdq();
        super.zzc(i, z);
    }

    public final void zzc(@Nullable List<String> list) {
        zzbq.zzga("setNativeTemplates must be called on the main UI thread.");
        this.zzamt.zzaub = list;
    }

    protected final void zzc(boolean z) {
        super.zzc(z);
        if (this.zzane) {
            if (((Boolean) zzbs.zzep().zzd(zzmq.zzbnd)).booleanValue()) {
                zzdm();
            }
        }
    }

    public final void zzcc() {
        zzaeu zzaeu = this.zzamt.zzati;
        if (zzaeu.zzcde == null) {
            super.zzcc();
            return;
        }
        try {
            zzuf zzuf = zzaeu.zzcde;
            zzku zzku = null;
            zzuo zzly = zzuf.zzly();
            if (zzly != null) {
                zzku = zzly.getVideoController();
            } else {
                zzur zzlz = zzuf.zzlz();
                if (zzlz != null) {
                    zzku = zzlz.getVideoController();
                } else {
                    zzpu zzmd = zzuf.zzmd();
                    if (zzmd != null) {
                        zzku = zzmd.getVideoController();
                    }
                }
            }
            if (zzku != null) {
                zzkx zzid = zzku.zzid();
                if (zzid != null) {
                    zzid.onVideoEnd();
                }
            }
        } catch (Throwable e) {
            zzaiw.zzc("Unable to call onVideoEnd()", e);
        }
    }

    public final void zzcd() {
        if (this.zzamt.zzati == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.zzamt.zzati.zzcdf)) {
            super.zzcd();
        } else {
            zzbu();
        }
    }

    public final void zzci() {
        if (this.zzamt.zzati == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.zzamt.zzati.zzcdf)) {
            super.zzci();
        } else {
            zzbt();
        }
    }

    public final void zzcp() {
        if (this.zzaqo != null) {
            this.zzaqo.destroy();
            this.zzaqo = null;
        }
    }

    public final boolean zzcq() {
        return zzcs() != null ? zzcs().zzcch : false;
    }

    public final boolean zzcr() {
        return zzcs() != null ? zzcs().zzcci : false;
    }

    final void zzdj() throws zzamm {
        synchronized (this.mLock) {
            zzafj.m5v("Initializing webview native ads utills");
            this.zzaqq = new zzyk(this.zzamt.zzaif, this, this.zzaqr, this.zzamt.zzatc, this.zzamt.zzatd);
        }
    }

    @Nullable
    public final zzyg zzdk() {
        zzyg zzyg;
        synchronized (this.mLock) {
            zzyg = this.zzaqq;
        }
        return zzyg;
    }

    protected final Future<zzoc> zzdl() {
        return this.zzaqn;
    }

    public final void zzdm() {
        if (this.zzamt.zzati == null || this.zzaqo == null) {
            this.zzane = true;
            zzaiw.zzco("Request to enable ActiveView before adState is available.");
            return;
        }
        zzfb zzpm = zzbs.zzeg().zzpm();
        zziw zziw = this.zzamt.zzath;
        zzaeu zzaeu = this.zzamt.zzati;
        zzama zzama = this.zzaqo;
        if (zzama == null) {
            throw null;
        }
        zzpm.zza(zziw, zzaeu, (View) zzama, this.zzaqo);
        this.zzane = false;
    }

    public final void zzdn() {
        this.zzane = false;
        if (this.zzamt.zzati == null || this.zzaqo == null) {
            zzaiw.zzco("Request to enable ActiveView before adState is available.");
        } else {
            zzbs.zzeg().zzpm().zzh(this.zzamt.zzati);
        }
    }

    public final SimpleArrayMap<String, zzqh> zzdo() {
        zzbq.zzga("getOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        return this.zzamt.zzats;
    }

    public final void zzdp() {
        if (this.zzaqo != null && this.zzaqo.zzrx() != null && this.zzamt.zzatt != null && this.zzamt.zzatt.zzbtn != null) {
            this.zzaqo.zzrx().zzb(this.zzamt.zzatt.zzbtn);
        }
    }

    public final void zze(zzama zzama) {
        this.zzaqo = zzama;
    }

    protected final void zzi(int i) {
        zzc(i, false);
    }

    public final void zzj(int i) {
        zzbq.zzga("setMaxNumberOfAds must be called on the main UI thread.");
        this.zzaqp = i;
    }

    @Nullable
    public final zzqe zzr(String str) {
        zzbq.zzga("getOnCustomClickListener must be called on the main UI thread.");
        return this.zzamt.zzatr == null ? null : (zzqe) this.zzamt.zzatr.get(str);
    }
}
