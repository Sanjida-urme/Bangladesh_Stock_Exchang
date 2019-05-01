package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.View;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.dynamic.zzn;
import com.google.android.gms.internal.zzaaf;
import com.google.android.gms.internal.zzadw;
import com.google.android.gms.internal.zzaeu;
import com.google.android.gms.internal.zzaev;
import com.google.android.gms.internal.zzagr;
import com.google.android.gms.internal.zzaiw;
import com.google.android.gms.internal.zzaiy;
import com.google.android.gms.internal.zzama;
import com.google.android.gms.internal.zzib;
import com.google.android.gms.internal.zzis;
import com.google.android.gms.internal.zziw;
import com.google.android.gms.internal.zzku;
import com.google.android.gms.internal.zzlw;
import com.google.android.gms.internal.zznd;
import com.google.android.gms.internal.zznj;
import com.google.android.gms.internal.zzns;
import com.google.android.gms.internal.zznu;
import com.google.android.gms.internal.zzny;
import com.google.android.gms.internal.zznz;
import com.google.android.gms.internal.zzoa;
import com.google.android.gms.internal.zzob;
import com.google.android.gms.internal.zzoc;
import com.google.android.gms.internal.zzoy;
import com.google.android.gms.internal.zzpu;
import com.google.android.gms.internal.zzqe;
import com.google.android.gms.internal.zztm;
import com.google.android.gms.internal.zztn;
import com.google.android.gms.internal.zzuc;
import com.google.android.gms.internal.zzuf;
import com.google.android.gms.internal.zzuo;
import com.google.android.gms.internal.zzur;
import com.google.android.gms.internal.zzxf;
import com.google.android.gms.internal.zzzb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

@zzzb
public final class zzq extends zzd implements zzob {
    private boolean zzals;
    private zzaeu zzank;
    private boolean zzanl = false;

    public zzq(Context context, zzv zzv, zziw zziw, String str, zzuc zzuc, zzaiy zzaiy) {
        super(context, zziw, str, zzuc, zzaiy, zzv);
    }

    private static zzaeu zza(zzaev zzaev, int i) {
        zzaev zzaev2 = zzaev;
        zzis zzis = zzaev2.zzcpe.zzclo;
        List list = zzaev2.zzcwe.zzcbv;
        List list2 = zzaev2.zzcwe.zzcbw;
        List list3 = zzaev2.zzcwe.zzcni;
        int i2 = zzaev2.zzcwe.orientation;
        long j = zzaev2.zzcwe.zzccb;
        String str = zzaev2.zzcpe.zzclr;
        boolean z = zzaev2.zzcwe.zzcng;
        zztn zztn = zzaev2.zzcvs;
        long j2 = zzaev2.zzcwe.zzcnh;
        zziw zziw = zzaev2.zzath;
        long j3 = j2;
        zztn zztn2 = zztn;
        long j4 = zzaev2.zzcwe.zzcnf;
        long j5 = zzaev2.zzcvw;
        long j6 = zzaev2.zzcvx;
        String str2 = zzaev2.zzcwe.zzcnl;
        JSONObject jSONObject = zzaev2.zzcvq;
        zzadw zzadw = zzaev2.zzcwe.zzcnv;
        List list4 = zzaev2.zzcwe.zzcnw;
        List list5 = zzaev2.zzcwe.zzcnw;
        boolean z2 = zzaev2.zzcwe.zzcny;
        zzaaf zzaaf = zzaev2.zzcwe.zzcnz;
        List list6 = zzaev2.zzcwe.zzcby;
        String str3 = zzaev2.zzcwe.zzcoc;
        long j7 = j6;
        zzib zzib = zzaev2.zzcwc;
        String str4 = str3;
        zzadw zzadw2 = zzadw;
        List list7 = list4;
        List list8 = list5;
        boolean z3 = z2;
        zzaaf zzaaf2 = zzaaf;
        List list9 = list6;
        zzama zzama = null;
        JSONObject jSONObject2 = jSONObject;
        int i3 = i;
        zziw zziw2 = zziw;
        zztm zztm = null;
        String str5 = str2;
        zzuf zzuf = null;
        long j8 = j4;
        zzib zzib2 = zzib;
        String str6 = null;
        boolean z4 = zzaev2.zzcwe.zzapy;
        return new zzaeu(zzis, zzama, list, i3, list2, list3, i2, j, str, z, zztm, zzuf, str6, zztn2, null, j3, zziw2, j8, j5, j7, str5, jSONObject2, null, zzadw2, list7, list8, z3, zzaaf2, null, list9, str4, zzib2, z4, zzaev2.zzcwd);
    }

    private final boolean zzb(zzaeu zzaeu, zzaeu zzaeu2) {
        zzaeu zzaeu3 = zzaeu2;
        List list = null;
        zzc(null);
        if (this.zzamt.zzfg()) {
            try {
                Handler handler;
                Runnable zzs;
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
                    zzoc zzoc = zzns;
                    zzoc.zzb(new zznz(r7.zzamt.zzaif, (zzob) r7, r7.zzamt.zzatc, zzly, zzns));
                    handler = zzagr.zzczc;
                    zzs = new zzs(r7, zzoc);
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
                    handler = zzagr.zzczc;
                    zzs = new zzt(r7, zznu);
                } else if (zzmd == null || r7.zzamt.zzats == null || r7.zzamt.zzats.get(zzmd.getCustomTemplateId()) == null) {
                    zzaiw.zzco("No matching mapper/listener for retrieved native ad template.");
                    zzi(0);
                    return false;
                } else {
                    zzagr.zzczc.post(new zzu(r7, zzmd));
                    return super.zza(zzaeu, zzaeu2);
                }
                handler.post(zzs);
                return super.zza(zzaeu, zzaeu2);
            } catch (Throwable e) {
                zzaiw.zzc("Failed to get native ad mapper", e);
            }
        } else {
            zzaiw.zzco("Native ad does not have custom rendering mode.");
        }
        zzi(0);
        return false;
    }

    private final boolean zzc(zzaeu zzaeu, zzaeu zzaeu2) {
        View zze = zzaq.zze(zzaeu2);
        if (zze == null) {
            return false;
        }
        View nextView = this.zzamt.zzate.getNextView();
        if (nextView != null) {
            if (nextView instanceof zzama) {
                ((zzama) nextView).destroy();
            }
            this.zzamt.zzate.removeView(nextView);
        }
        if (!zzaq.zzf(zzaeu2)) {
            try {
                zzb(zze);
            } catch (Throwable th) {
                zzbs.zzeg().zza(th, "AdLoaderManager.swapBannerViews");
                zzaiw.zzc("Could not add mediation view to view hierarchy.", th);
                return false;
            }
        }
        if (this.zzamt.zzate.getChildCount() > 1) {
            this.zzamt.zzate.showNext();
        }
        if (zzaeu != null) {
            View nextView2 = this.zzamt.zzate.getNextView();
            if (nextView2 != null) {
                this.zzamt.zzate.removeView(nextView2);
            }
            this.zzamt.zzff();
        }
        this.zzamt.zzate.setMinimumWidth(zzbm().widthPixels);
        this.zzamt.zzate.setMinimumHeight(zzbm().heightPixels);
        this.zzamt.zzate.requestLayout();
        this.zzamt.zzate.setVisibility(0);
        return true;
    }

    @Nullable
    private final zztn zzcs() {
        return (this.zzamt.zzati == null || !this.zzamt.zzati.zzcng) ? null : this.zzamt.zzati.zzcvs;
    }

    @Nullable
    public final zzku getVideoController() {
        return null;
    }

    public final void pause() {
        if (this.zzanl) {
            super.pause();
            return;
        }
        throw new IllegalStateException("Native Ad does not support pause().");
    }

    public final void resume() {
        if (this.zzanl) {
            super.resume();
            return;
        }
        throw new IllegalStateException("Native Ad does not support resume().");
    }

    public final void setManualImpressionsEnabled(boolean z) {
        zzbq.zzga("setManualImpressionsEnabled must be called from the main thread.");
        this.zzals = z;
    }

    public final void showInterstitial() {
        throw new IllegalStateException("Interstitial is not supported by AdLoaderManager.");
    }

    public final void zza(zzaev zzaev, zznd zznd) {
        zzaeu zza;
        this.zzank = null;
        if (zzaev.errorCode != -2) {
            zza = zza(zzaev, zzaev.errorCode);
        } else {
            if (!zzaev.zzcwe.zzcng) {
                zzaiw.zzco("partialAdState is not mediation");
                zza = zza(zzaev, 0);
            }
            if (this.zzank == null) {
                zzagr.zzczc.post(new zzr(this));
            }
            if (zzaev.zzath != null) {
                this.zzamt.zzath = zzaev.zzath;
            }
            this.zzamt.zzaue = 0;
            zzbt zzbt = this.zzamt;
            zzbs.zzeb();
            zzbt.zzatg = zzxf.zza(this.zzamt.zzaif, this, zzaev, this.zzamt.zzatc, null, this.zzanb, this, zznd);
            return;
        }
        this.zzank = zza;
        if (this.zzank == null) {
            if (zzaev.zzath != null) {
                this.zzamt.zzath = zzaev.zzath;
            }
            this.zzamt.zzaue = 0;
            zzbt zzbt2 = this.zzamt;
            zzbs.zzeb();
            zzbt2.zzatg = zzxf.zza(this.zzamt.zzaif, this, zzaev, this.zzamt.zzatc, null, this.zzanb, this, zznd);
            return;
        }
        zzagr.zzczc.post(new zzr(this));
    }

    public final void zza(zznj zznj) {
        throw new IllegalStateException("CustomRendering is not supported by AdLoaderManager.");
    }

    public final void zza(zzny zzny) {
        zzaiw.zzco("Unexpected call to AdLoaderManager method");
    }

    public final void zza(zzoa zzoa) {
        zzaiw.zzco("Unexpected call to AdLoaderManager method");
    }

    protected final boolean zza(@Nullable zzaeu zzaeu, zzaeu zzaeu2) {
        if (this.zzamt.zzfg()) {
            String str;
            if (zzaeu2.zzcng) {
                if (zzaeu2.zzcdd != null && zzaeu2.zzcdd.zzlp()) {
                    Object obj;
                    if (this.zzamt.zzfg() && this.zzamt.zzate != null) {
                        this.zzamt.zzate.zzfj().zzcj(zzaeu2.zzcnl);
                    }
                    if (super.zza(zzaeu, zzaeu2)) {
                        if (!this.zzamt.zzfg() || zzc(zzaeu, zzaeu2)) {
                            if (!this.zzamt.zzfh()) {
                                super.zza(zzaeu2, false);
                            }
                            obj = 1;
                            if (obj == null) {
                                return false;
                            }
                            this.zzanl = true;
                        } else {
                            zzi(0);
                        }
                    }
                    obj = null;
                    if (obj == null) {
                        return false;
                    }
                    this.zzanl = true;
                } else if (zzaeu2.zzcdd == null || !zzaeu2.zzcdd.zzlq()) {
                    zzi(0);
                    str = "Response is neither banner nor native.";
                } else if (!zzb(zzaeu, zzaeu2)) {
                    return false;
                }
                zzd(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(2)})));
                return true;
            }
            zzi(0);
            str = "newState is not mediation.";
            zzaiw.zzco(str);
            return false;
        }
        throw new IllegalStateException("AdLoader API does not support custom rendering.");
    }

    protected final boolean zza(zzis zzis, zzaeu zzaeu, boolean z) {
        return false;
    }

    public final boolean zzb(zzis zzis) {
        zzd zzd;
        zzis zzis2 = zzis;
        Object obj = (this.zzamt.zzatx != null && zzd.zzamt.zzatx.size() == 1 && ((Integer) zzd.zzamt.zzatx.get(0)).intValue() == 2) ? 1 : null;
        if (obj != null) {
            zzaiw.m3e("Requesting only banner Ad from AdLoader or calling loadAd on returned banner is not yet supported");
            zzi(0);
            return false;
        } else if (zzd.zzamt.zzatw == null) {
            return super.zzb(zzis);
        } else {
            if (zzis2.zzbca != zzd.zzals) {
                boolean z;
                String str;
                zzlw zzlw;
                int i = zzis2.versionCode;
                long j = zzis2.zzbbv;
                Bundle bundle = zzis2.extras;
                int i2 = zzis2.zzbbw;
                List list = zzis2.zzbbx;
                boolean z2 = zzis2.zzbby;
                int i3 = zzis2.zzbbz;
                if (!zzis2.zzbca) {
                    if (!zzd.zzals) {
                        z = false;
                        str = zzis2.zzbcb;
                        zzlw = zzis2.zzbcc;
                        zzis2 = new zzis(i, j, bundle, i2, list, z2, i3, z, str, zzlw, zzis2.zzbcd, zzis2.zzbce, zzis2.zzbcf, zzis2.zzbcg, zzis2.zzbch, zzis2.zzbci, zzis2.zzbcj, zzis2.zzbck);
                        zzd = this;
                    }
                }
                z = true;
                str = zzis2.zzbcb;
                zzlw = zzis2.zzbcc;
                zzis2 = new zzis(i, j, bundle, i2, list, z2, i3, z, str, zzlw, zzis2.zzbcd, zzis2.zzbce, zzis2.zzbcf, zzis2.zzbcg, zzis2.zzbch, zzis2.zzbci, zzis2.zzbcj, zzis2.zzbck);
                zzd = this;
            }
            return super.zzb(zzis2);
        }
    }

    protected final void zzbs() {
        super.zzbs();
        zzaeu zzaeu = this.zzamt.zzati;
        if (!(zzaeu == null || zzaeu.zzcdd == null || !zzaeu.zzcdd.zzlp() || this.zzamt.zzatw == null)) {
            try {
                this.zzamt.zzatw.zza(this, zzn.zzy(this.zzamt.zzaif));
            } catch (Throwable e) {
                zzaiw.zzc("Could not call PublisherAdViewLoadedListener.onPublisherAdViewLoaded().", e);
            }
        }
    }

    public final void zzc(@Nullable List<String> list) {
        zzbq.zzga("setNativeTemplates must be called on the main UI thread.");
        this.zzamt.zzaub = list;
    }

    public final void zzcd() {
        if (this.zzamt.zzati == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.zzamt.zzati.zzcdf) || this.zzamt.zzati.zzcdd == null || !this.zzamt.zzati.zzcdd.zzlq()) {
            super.zzcd();
        } else {
            zzbu();
        }
    }

    public final void zzci() {
        if (this.zzamt.zzati == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.zzamt.zzati.zzcdf) || this.zzamt.zzati.zzcdd == null || !this.zzamt.zzati.zzcdd.zzlq()) {
            super.zzci();
        } else {
            zzbt();
        }
    }

    public final void zzcp() {
        zzaiw.zzco("Unexpected call to AdLoaderManager method");
    }

    public final boolean zzcq() {
        return zzcs() != null ? zzcs().zzcch : false;
    }

    public final boolean zzcr() {
        return zzcs() != null ? zzcs().zzcci : false;
    }

    public final void zzd(List<Integer> list) {
        zzbq.zzga("setAllowedAdTypes must be called on the main UI thread.");
        this.zzamt.zzatx = list;
    }

    @Nullable
    public final zzqe zzr(String str) {
        zzbq.zzga("getOnCustomClickListener must be called on the main UI thread.");
        return (zzqe) this.zzamt.zzatr.get(str);
    }
}
