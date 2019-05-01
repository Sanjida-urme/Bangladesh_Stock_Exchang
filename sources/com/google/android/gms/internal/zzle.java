package com.google.android.gms.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;
import java.util.concurrent.atomic.AtomicBoolean;

@zzzb
public final class zzle {
    private final zziv zzakq;
    private VideoOptions zzalm;
    private boolean zzals;
    private AppEventListener zzalu;
    private String zzaou;
    private zzin zzbbt;
    private AdListener zzbbu;
    private AdSize[] zzbdg;
    private final zzub zzbeo;
    private final AtomicBoolean zzbep;
    private final VideoController zzbeq;
    private zzjm zzber;
    private Correlator zzbes;
    private zzkb zzbet;
    private OnCustomRenderedAdLoadedListener zzbeu;
    private ViewGroup zzbev;
    private int zzbew;

    public zzle(ViewGroup viewGroup) {
        this(viewGroup, null, false, zziv.zzbcz, 0);
    }

    public zzle(ViewGroup viewGroup, int i) {
        this(viewGroup, null, false, zziv.zzbcz, i);
    }

    public zzle(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, zziv.zzbcz, 0);
    }

    public zzle(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int i) {
        this(viewGroup, attributeSet, false, zziv.zzbcz, i);
    }

    private zzle(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, zziv zziv, int i) {
        this(viewGroup, attributeSet, z, zziv, null, i);
    }

    private zzle(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, zziv zziv, zzkb zzkb, int i) {
        this.zzbeo = new zzub();
        this.zzbeq = new VideoController();
        this.zzber = new zzlf(this);
        this.zzbev = viewGroup;
        this.zzakq = zziv;
        this.zzbet = null;
        this.zzbep = new AtomicBoolean(false);
        this.zzbew = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zziz zziz = new zziz(context, attributeSet);
                this.zzbdg = zziz.zzh(z);
                this.zzaou = zziz.getAdUnitId();
                if (viewGroup.isInEditMode()) {
                    zzais zzhx = zzjk.zzhx();
                    AdSize adSize = this.zzbdg[0];
                    int i2 = this.zzbew;
                    zziw zziw = new zziw(context, adSize);
                    zziw.zzbdf = zzs(i2);
                    zzhx.zza(viewGroup, zziw, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                zzjk.zzhx().zza(viewGroup, new zziw(context, AdSize.BANNER), e.getMessage(), e.getMessage());
            }
        }
    }

    private static zziw zza(Context context, AdSize[] adSizeArr, int i) {
        zziw zziw = new zziw(context, adSizeArr);
        zziw.zzbdf = zzs(i);
        return zziw;
    }

    private static boolean zzs(int i) {
        return i == 1;
    }

    public final void destroy() {
        try {
            if (this.zzbet != null) {
                this.zzbet.destroy();
            }
        } catch (Throwable e) {
            zzaiw.zzc("Failed to destroy AdView.", e);
        }
    }

    public final AdListener getAdListener() {
        return this.zzbbu;
    }

    public final AdSize getAdSize() {
        try {
            if (this.zzbet != null) {
                zziw zzbm = this.zzbet.zzbm();
                if (zzbm != null) {
                    return zzbm.zzhq();
                }
            }
        } catch (Throwable e) {
            zzaiw.zzc("Failed to get the current AdSize.", e);
        }
        return this.zzbdg != null ? this.zzbdg[0] : null;
    }

    public final AdSize[] getAdSizes() {
        return this.zzbdg;
    }

    public final String getAdUnitId() {
        if (this.zzaou == null && this.zzbet != null) {
            try {
                this.zzaou = this.zzbet.getAdUnitId();
            } catch (Throwable e) {
                zzaiw.zzc("Failed to get ad unit id.", e);
            }
        }
        return this.zzaou;
    }

    public final AppEventListener getAppEventListener() {
        return this.zzalu;
    }

    public final String getMediationAdapterClassName() {
        try {
            if (this.zzbet != null) {
                return this.zzbet.zzcj();
            }
        } catch (Throwable e) {
            zzaiw.zzc("Failed to get the mediation adapter class name.", e);
        }
        return null;
    }

    public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.zzbeu;
    }

    public final VideoController getVideoController() {
        return this.zzbeq;
    }

    public final VideoOptions getVideoOptions() {
        return this.zzalm;
    }

    public final boolean isLoading() {
        try {
            if (this.zzbet != null) {
                return this.zzbet.isLoading();
            }
        } catch (Throwable e) {
            zzaiw.zzc("Failed to check if ad is loading.", e);
        }
        return false;
    }

    public final void pause() {
        try {
            if (this.zzbet != null) {
                this.zzbet.pause();
            }
        } catch (Throwable e) {
            zzaiw.zzc("Failed to call pause.", e);
        }
    }

    public final void recordManualImpression() {
        if (!this.zzbep.getAndSet(true)) {
            try {
                if (this.zzbet != null) {
                    this.zzbet.zzbo();
                }
            } catch (Throwable e) {
                zzaiw.zzc("Failed to record impression.", e);
            }
        }
    }

    public final void resume() {
        try {
            if (this.zzbet != null) {
                this.zzbet.resume();
            }
        } catch (Throwable e) {
            zzaiw.zzc("Failed to call resume.", e);
        }
    }

    public final void setAdListener(AdListener adListener) {
        this.zzbbu = adListener;
        this.zzber.zza(adListener);
    }

    public final void setAdSizes(AdSize... adSizeArr) {
        if (this.zzbdg != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        zza(adSizeArr);
    }

    public final void setAdUnitId(String str) {
        if (this.zzaou != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.zzaou = str;
    }

    public final void setAppEventListener(AppEventListener appEventListener) {
        try {
            this.zzalu = appEventListener;
            if (this.zzbet != null) {
                this.zzbet.zza(appEventListener != null ? new zziy(appEventListener) : null);
            }
        } catch (Throwable e) {
            zzaiw.zzc("Failed to set the AppEventListener.", e);
        }
    }

    public final void setCorrelator(Correlator correlator) {
        this.zzbes = correlator;
        try {
            if (this.zzbet != null) {
                this.zzbet.zza(this.zzbes == null ? null : this.zzbes.zzbc());
            }
        } catch (Throwable e) {
            zzaiw.zzc("Failed to set correlator.", e);
        }
    }

    public final void setManualImpressionsEnabled(boolean z) {
        this.zzals = z;
        try {
            if (this.zzbet != null) {
                this.zzbet.setManualImpressionsEnabled(this.zzals);
            }
        } catch (Throwable e) {
            zzaiw.zzc("Failed to set manual impressions.", e);
        }
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.zzbeu = onCustomRenderedAdLoadedListener;
        try {
            if (this.zzbet != null) {
                this.zzbet.zza(onCustomRenderedAdLoadedListener != null ? new zznm(onCustomRenderedAdLoadedListener) : null);
            }
        } catch (Throwable e) {
            zzaiw.zzc("Failed to set the onCustomRenderedAdLoadedListener.", e);
        }
    }

    public final void setVideoOptions(VideoOptions videoOptions) {
        this.zzalm = videoOptions;
        try {
            if (this.zzbet != null) {
                this.zzbet.zza(videoOptions == null ? null : new zzma(videoOptions));
            }
        } catch (Throwable e) {
            zzaiw.zzc("Failed to set video options.", e);
        }
    }

    public final void zza(zzin zzin) {
        try {
            this.zzbbt = zzin;
            if (this.zzbet != null) {
                this.zzbet.zza(zzin != null ? new zzio(zzin) : null);
            }
        } catch (Throwable e) {
            zzaiw.zzc("Failed to set the AdClickListener.", e);
        }
    }

    public final void zza(zzlc zzlc) {
        try {
            if (this.zzbet == null) {
                if ((this.zzbdg == null || this.zzaou == null) && this.zzbet == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Object zza;
                Context context = this.zzbev.getContext();
                zziw zza2 = zza(context, this.zzbdg, this.zzbew);
                if ("search_v2".equals(zza2.zzbda)) {
                    zza = zzja.zza(context, false, new zzjc(zzjk.zzhy(), context, zza2, this.zzaou));
                } else {
                    zza = zzja.zza(context, false, new zzjb(zzjk.zzhy(), context, zza2, this.zzaou, this.zzbeo));
                }
                this.zzbet = (zzkb) zza;
                this.zzbet.zza(new zzip(this.zzber));
                if (this.zzbbt != null) {
                    this.zzbet.zza(new zzio(this.zzbbt));
                }
                if (this.zzalu != null) {
                    this.zzbet.zza(new zziy(this.zzalu));
                }
                if (this.zzbeu != null) {
                    this.zzbet.zza(new zznm(this.zzbeu));
                }
                if (this.zzbes != null) {
                    this.zzbet.zza(this.zzbes.zzbc());
                }
                if (this.zzalm != null) {
                    this.zzbet.zza(new zzma(this.zzalm));
                }
                this.zzbet.setManualImpressionsEnabled(this.zzals);
                try {
                    IObjectWrapper zzbl = this.zzbet.zzbl();
                    if (zzbl != null) {
                        this.zzbev.addView((View) zzn.zzx(zzbl));
                    }
                } catch (Throwable e) {
                    zzaiw.zzc("Failed to get an ad frame.", e);
                }
            }
            if (this.zzbet.zzb(zziv.zza(this.zzbev.getContext(), zzlc))) {
                this.zzbeo.zzm(zzlc.zzig());
            }
        } catch (Throwable e2) {
            zzaiw.zzc("Failed to load ad.", e2);
        }
    }

    public final void zza(AdSize... adSizeArr) {
        this.zzbdg = adSizeArr;
        try {
            if (this.zzbet != null) {
                this.zzbet.zza(zza(this.zzbev.getContext(), this.zzbdg, this.zzbew));
            }
        } catch (Throwable e) {
            zzaiw.zzc("Failed to set the ad size.", e);
        }
        this.zzbev.requestLayout();
    }

    public final boolean zza(zzkb zzkb) {
        if (zzkb == null) {
            return false;
        }
        try {
            IObjectWrapper zzbl = zzkb.zzbl();
            if (zzbl == null || ((View) zzn.zzx(zzbl)).getParent() != null) {
                return false;
            }
            this.zzbev.addView((View) zzn.zzx(zzbl));
            this.zzbet = zzkb;
            return true;
        } catch (Throwable e) {
            zzaiw.zzc("Failed to get an ad frame.", e);
            return false;
        }
    }

    public final zzku zzbe() {
        if (this.zzbet == null) {
            return null;
        }
        try {
            return this.zzbet.getVideoController();
        } catch (Throwable e) {
            zzaiw.zzc("Failed to retrieve VideoController.", e);
            return null;
        }
    }
}
