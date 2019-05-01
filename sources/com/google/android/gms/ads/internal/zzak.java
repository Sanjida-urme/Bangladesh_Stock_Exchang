package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.gmsg.zzaf;
import com.google.android.gms.ads.internal.gmsg.zzag;
import com.google.android.gms.ads.internal.gmsg.zzx;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.internal.zzaad;
import com.google.android.gms.internal.zzabm;
import com.google.android.gms.internal.zzadw;
import com.google.android.gms.internal.zzaeh;
import com.google.android.gms.internal.zzaek;
import com.google.android.gms.internal.zzaeu;
import com.google.android.gms.internal.zzaev;
import com.google.android.gms.internal.zzagr;
import com.google.android.gms.internal.zzagw;
import com.google.android.gms.internal.zzaiw;
import com.google.android.gms.internal.zzaiy;
import com.google.android.gms.internal.zzama;
import com.google.android.gms.internal.zzamb;
import com.google.android.gms.internal.zzamm;
import com.google.android.gms.internal.zzanp;
import com.google.android.gms.internal.zzfy;
import com.google.android.gms.internal.zzis;
import com.google.android.gms.internal.zziw;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.internal.zznd;
import com.google.android.gms.internal.zztm;
import com.google.android.gms.internal.zztn;
import com.google.android.gms.internal.zzuc;
import com.google.android.gms.internal.zzzb;
import com.google.android.gms.internal.zzzz;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

@zzzb
public final class zzak extends zzi implements zzag, zzx {
    private transient boolean zzapf = false;
    private int zzapg = -1;
    private boolean zzaph;
    private float zzapi;
    private boolean zzapj;
    private zzaek zzapk;
    private String zzapl;
    private final String zzapm;

    public zzak(Context context, zziw zziw, String str, zzuc zzuc, zzaiy zzaiy, zzv zzv) {
        super(context, zziw, str, zzuc, zzaiy, zzv);
        String str2 = (zziw == null || !"reward_mb".equals(zziw.zzbda)) ? "/Interstitial" : "/Rewarded";
        this.zzapm = str2;
    }

    private final void zza(Bundle bundle) {
        zzbs.zzec().zzb(this.zzamt.zzaif, this.zzamt.zzatd.zzcp, "gmob-apps", bundle, false);
    }

    private static zzaev zzb(zzaev zzaev) {
        zzaev zzaev2 = zzaev;
        zzaev zzaev3;
        try {
            String jSONObject = zzabm.zzb(zzaev2.zzcwe).toString();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, zzaev2.zzcpe.zzatb);
            zztm zztm = new zztm(jSONObject, null, Collections.singletonList("com.google.ads.mediation.admob.AdMobAdapter"), null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), jSONObject2.toString(), null, Collections.emptyList(), Collections.emptyList(), null, null, null, null, null, Collections.emptyList(), null);
            zzaad zzaad = zzaev2.zzcwe;
            zztn zztn = new zztn(Collections.singletonList(zztm), ((Long) zzbs.zzep().zzd(zzmq.zzblt)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), zzaad.zzcby, zzaad.zzcbz, "", -1, 0, 1, null, 0, -1, -1, false);
            zzzz zzzz = zzaev2.zzcpe;
            String str = zzaad.zzchl;
            String str2 = zzaad.body;
            List emptyList = Collections.emptyList();
            List emptyList2 = Collections.emptyList();
            long j = zzaad.zzcnf;
            long j2 = zzaad.zzcnh;
            List emptyList3 = Collections.emptyList();
            long j3 = zzaad.zzccb;
            int i = zzaad.orientation;
            String str3 = zzaad.zzcnj;
            long j4 = zzaad.zzcnk;
            String str4 = zzaad.zzcnl;
            boolean z = zzaad.zzcnm;
            String str5 = zzaad.zzcnn;
            boolean z2 = zzaad.zzcnp;
            boolean z3 = zzaad.zzbdd;
            boolean z4 = zzaad.zzclw;
            boolean z5 = zzaad.zzcnq;
            boolean z6 = zzaad.zzcnr;
            String str6 = zzaad.zzcnu;
            boolean z7 = zzaad.zzbde;
            boolean z8 = zzaad.zzbdf;
            boolean z9 = z8;
            zzaad zzaad2 = new zzaad(zzzz, str, str2, emptyList, emptyList2, j, true, j2, emptyList3, j3, i, str3, j4, str4, z, str5, null, z2, z3, z4, z5, z6, str6, z7, z9, null, Collections.emptyList(), Collections.emptyList(), zzaad.zzcny, zzaad.zzcnz, zzaad.zzcmk, zzaad.zzcml, zzaad.zzcby, zzaad.zzcbz, zzaad.zzcoa, null, zzaad.zzcoc, zzaad.zzcod, zzaad.zzcmw, zzaad.zzapy, 0);
            zzaev3 = zzaev;
            return new zzaev(zzaev3.zzcpe, zzaad2, zztn, zzaev3.zzath, zzaev3.errorCode, zzaev3.zzcvw, zzaev3.zzcvx, null, zzaev3.zzcwc, null);
        } catch (Throwable e) {
            zzaev3 = zzaev2;
            zzaiw.zzb("Unable to generate ad state for an interstitial ad with pooling.", e);
            return zzaev3;
        }
    }

    public final void setImmersiveMode(boolean z) {
        zzbq.zzga("setImmersiveMode must be called on the main UI thread.");
        this.zzapj = z;
    }

    public final void showInterstitial() {
        zzbq.zzga("showInterstitial must be called on the main UI thread.");
        if (zzbs.zzfa().zzu(this.zzamt.zzaif)) {
            this.zzapl = zzbs.zzfa().zzw(this.zzamt.zzaif);
            String valueOf = String.valueOf(this.zzapl);
            String valueOf2 = String.valueOf(this.zzapm);
            this.zzapl = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        if (this.zzamt.zzati == null) {
            zzaiw.zzco("The interstitial has not loaded.");
            return;
        }
        if (((Boolean) zzbs.zzep().zzd(zzmq.zzbld)).booleanValue()) {
            Bundle bundle;
            valueOf = (this.zzamt.zzaif.getApplicationContext() != null ? this.zzamt.zzaif.getApplicationContext() : this.zzamt.zzaif).getPackageName();
            if (!this.zzapf) {
                zzaiw.zzco("It is not recommended to show an interstitial before onAdLoaded completes.");
                bundle = new Bundle();
                bundle.putString("appid", valueOf);
                bundle.putString("action", "show_interstitial_before_load_finish");
                zza(bundle);
            }
            zzbs.zzec();
            if (!zzagr.zzam(this.zzamt.zzaif)) {
                zzaiw.zzco("It is not recommended to show an interstitial when app is not in foreground.");
                bundle = new Bundle();
                bundle.putString("appid", valueOf);
                bundle.putString("action", "show_interstitial_app_not_in_foreground");
                zza(bundle);
            }
        }
        if (!this.zzamt.zzfh()) {
            if (this.zzamt.zzati.zzcng && this.zzamt.zzati.zzcde != null) {
                try {
                    if (((Boolean) zzbs.zzep().zzd(zzmq.zzbka)).booleanValue()) {
                        this.zzamt.zzati.zzcde.setImmersiveMode(this.zzapj);
                    }
                    this.zzamt.zzati.zzcde.showInterstitial();
                } catch (Throwable e) {
                    zzaiw.zzc("Could not show interstitial.", e);
                    zzde();
                }
            } else if (this.zzamt.zzati.zzchj == null) {
                zzaiw.zzco("The interstitial failed to load.");
            } else if (this.zzamt.zzati.zzchj.zzst()) {
                zzaiw.zzco("The interstitial is already showing.");
            } else {
                this.zzamt.zzati.zzchj.zzac(true);
                if (this.zzamt.zzati.zzcvq != null) {
                    this.zzamv.zza(this.zzamt.zzath, this.zzamt.zzati);
                }
                zzaeu zzaeu = this.zzamt.zzati;
                Bitmap bitmap = null;
                if (zzaeu.zzfr()) {
                    Context context = this.zzamt.zzaif;
                    zzama zzama = zzaeu.zzchj;
                    if (zzama == null) {
                        throw null;
                    }
                    new zzfy(context, (View) zzama).zza(zzaeu.zzchj);
                } else {
                    zzaeu.zzchj.zzsq().zza(new zzal(this, zzaeu));
                }
                if (this.zzamt.zzapr) {
                    zzbs.zzec();
                    bitmap = zzagr.zzan(this.zzamt.zzaif);
                }
                this.zzapg = zzbs.zzex().zzb(bitmap);
                if (!((Boolean) zzbs.zzep().zzd(zzmq.zzbmk)).booleanValue() || bitmap == null) {
                    zzao zzao = new zzao(this.zzamt.zzapr, zzdd(), false, 0.0f, -1, this.zzapj, this.zzamt.zzati.zzapy);
                    int requestedOrientation = this.zzamt.zzati.zzchj.getRequestedOrientation();
                    if (requestedOrientation == -1) {
                        requestedOrientation = this.zzamt.zzati.orientation;
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(this, this, this, this.zzamt.zzati.zzchj, requestedOrientation, this.zzamt.zzatd, this.zzamt.zzati.zzcnl, zzao);
                    zzbs.zzea();
                    zzl.zza(this.zzamt.zzaif, adOverlayInfoParcel, true);
                    return;
                }
                new zzam(this, this.zzapg).zzps();
            }
        }
    }

    protected final zzama zza(zzaev zzaev, @Nullable zzw zzw, @Nullable zzaeh zzaeh) throws zzamm {
        zzama zza = zzbs.zzed().zza(this.zzamt.zzaif, zzanp.zzc(this.zzamt.zzath), this.zzamt.zzath.zzbda, false, false, this.zzamt.zzatc, this.zzamt.zzatd, this.zzamo, this, this.zzamw, zzaev.zzcwc);
        zza.zzsq().zza(this, null, this, this, ((Boolean) zzbs.zzep().zzd(zzmq.zzbiu)).booleanValue(), this, zzw, null, zzaeh);
        zza(zza);
        zza.zzcu(zzaev.zzcpe.zzcmb);
        zza.zzsq().zza("/reward", new zzaf(this));
        return zza;
    }

    public final void zza(zzaev zzaev, zznd zznd) {
        if (!((Boolean) zzbs.zzep().zzd(zzmq.zzbkg)).booleanValue()) {
            super.zza(zzaev, zznd);
        } else if (zzaev.errorCode != -2) {
            super.zza(zzaev, zznd);
        } else {
            int i = zzaev.zzcwe.zzcng ^ 1;
            if (zza.zza(zzaev.zzcpe.zzclo) && i != 0) {
                this.zzamt.zzatj = zzb(zzaev);
            }
            super.zza(this.zzamt.zzatj, zznd);
        }
    }

    public final void zza(boolean z, float f) {
        this.zzaph = z;
        this.zzapi = f;
    }

    public final boolean zza(@Nullable zzaeu zzaeu, zzaeu zzaeu2) {
        if (!super.zza(zzaeu, zzaeu2)) {
            return false;
        }
        if (!(this.zzamt.zzfg() || this.zzamt.zzaud == null || zzaeu2.zzcvq == null)) {
            this.zzamv.zza(this.zzamt.zzath, zzaeu2, this.zzamt.zzaud);
        }
        return true;
    }

    protected final boolean zza(zzis zzis, zzaeu zzaeu, boolean z) {
        if (this.zzamt.zzfg() && zzaeu.zzchj != null) {
            zzbs.zzee();
            zzagw.zzh(zzaeu.zzchj);
        }
        return this.zzams.zzdr();
    }

    public final boolean zza(zzis zzis, zznd zznd) {
        if (this.zzamt.zzati != null) {
            zzaiw.zzco("An interstitial is already loading. Aborting.");
            return false;
        }
        if (this.zzapk == null && zza.zza(zzis) && zzbs.zzfa().zzu(this.zzamt.zzaif) && !TextUtils.isEmpty(this.zzamt.zzatb)) {
            this.zzapk = new zzaek(this.zzamt.zzaif, this.zzamt.zzatb);
        }
        return super.zza(zzis, zznd);
    }

    public final void zzb(zzadw zzadw) {
        if (this.zzamt.zzati != null) {
            if (this.zzamt.zzati.zzcnx != null) {
                zzbs.zzec();
                zzagr.zza(this.zzamt.zzaif, this.zzamt.zzatd.zzcp, this.zzamt.zzati.zzcnx);
            }
            if (this.zzamt.zzati.zzcnv != null) {
                zzadw = this.zzamt.zzati.zzcnv;
            }
        }
        zza(zzadw);
    }

    protected final void zzbp() {
        zzde();
        super.zzbp();
    }

    protected final void zzbs() {
        super.zzbs();
        this.zzapf = true;
    }

    public final void zzca() {
        super.zzca();
        this.zzamv.zzh(this.zzamt.zzati);
        if (this.zzapk != null) {
            this.zzapk.zzu(false);
        }
    }

    public final void zzcb() {
        recordImpression();
        super.zzcb();
        if (!(this.zzamt.zzati == null || this.zzamt.zzati.zzchj == null)) {
            zzamb zzsq = this.zzamt.zzati.zzchj.zzsq();
            if (zzsq != null) {
                zzsq.zztk();
            }
        }
        if (!(!zzbs.zzfa().zzu(this.zzamt.zzaif) || this.zzamt.zzati == null || this.zzamt.zzati.zzchj == null)) {
            zzbs.zzfa().zzd(this.zzamt.zzati.zzchj.getContext(), this.zzapl);
        }
        if (this.zzapk != null) {
            this.zzapk.zzu(true);
        }
    }

    public final void zzd(boolean z) {
        this.zzamt.zzapr = z;
    }

    protected final boolean zzdd() {
        if (!(this.zzamt.zzaif instanceof Activity)) {
            return false;
        }
        Window window = ((Activity) this.zzamt.zzaif).getWindow();
        if (window == null || window.getDecorView() == null) {
            return false;
        }
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        window.getDecorView().getGlobalVisibleRect(rect, null);
        window.getDecorView().getWindowVisibleDisplayFrame(rect2);
        if (!(rect.bottom == 0 || rect2.bottom == 0 || rect.top != rect2.top)) {
            return true;
        }
        return false;
    }

    public final void zzde() {
        zzbs.zzex().zzb(Integer.valueOf(this.zzapg));
        if (this.zzamt.zzfg()) {
            this.zzamt.zzfe();
            this.zzamt.zzati = null;
            this.zzamt.zzapr = false;
            this.zzapf = false;
        }
    }

    public final void zzdf() {
        if (!(this.zzamt.zzati == null || this.zzamt.zzati.zzcvv == null)) {
            zzbs.zzec();
            zzagr.zza(this.zzamt.zzaif, this.zzamt.zzatd.zzcp, this.zzamt.zzati.zzcvv);
        }
        zzbv();
    }
}
