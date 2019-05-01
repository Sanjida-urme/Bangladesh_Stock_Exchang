package com.google.android.gms.internal;

import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;

@zzzb
public final class zzvc<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> implements MediationBannerListener, MediationInterstitialListener {
    private final zzui zzcea;

    public zzvc(zzui zzui) {
        this.zzcea = zzui;
    }

    public final void onClick(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzaiw.zzbw("Adapter called onClick.");
        zzjk.zzhx();
        if (zzais.zzqt()) {
            try {
                this.zzcea.onAdClicked();
                return;
            } catch (Throwable e) {
                zzaiw.zzc("Could not call onAdClicked.", e);
                return;
            }
        }
        zzaiw.zzco("onClick must be called on the main UI thread.");
        zzais.zzdbs.post(new zzvd(this));
    }

    public final void onDismissScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzaiw.zzbw("Adapter called onDismissScreen.");
        zzjk.zzhx();
        if (zzais.zzqt()) {
            try {
                this.zzcea.onAdClosed();
                return;
            } catch (Throwable e) {
                zzaiw.zzc("Could not call onAdClosed.", e);
                return;
            }
        }
        zzaiw.zzco("onDismissScreen must be called on the main UI thread.");
        zzais.zzdbs.post(new zzvg(this));
    }

    public final void onDismissScreen(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzaiw.zzbw("Adapter called onDismissScreen.");
        zzjk.zzhx();
        if (zzais.zzqt()) {
            try {
                this.zzcea.onAdClosed();
                return;
            } catch (Throwable e) {
                zzaiw.zzc("Could not call onAdClosed.", e);
                return;
            }
        }
        zzaiw.zzco("onDismissScreen must be called on the main UI thread.");
        zzais.zzdbs.post(new zzvl(this));
    }

    public final void onFailedToReceiveAd(MediationBannerAdapter<?, ?> mediationBannerAdapter, ErrorCode errorCode) {
        String valueOf = String.valueOf(errorCode);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 47);
        stringBuilder.append("Adapter called onFailedToReceiveAd with error. ");
        stringBuilder.append(valueOf);
        zzaiw.zzbw(stringBuilder.toString());
        zzjk.zzhx();
        if (zzais.zzqt()) {
            try {
                this.zzcea.onAdFailedToLoad(zzvo.zza(errorCode));
                return;
            } catch (Throwable e) {
                zzaiw.zzc("Could not call onAdFailedToLoad.", e);
                return;
            }
        }
        zzaiw.zzco("onFailedToReceiveAd must be called on the main UI thread.");
        zzais.zzdbs.post(new zzvh(this, errorCode));
    }

    public final void onFailedToReceiveAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, ErrorCode errorCode) {
        String valueOf = String.valueOf(errorCode);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 47);
        stringBuilder.append("Adapter called onFailedToReceiveAd with error ");
        stringBuilder.append(valueOf);
        stringBuilder.append(".");
        zzaiw.zzbw(stringBuilder.toString());
        zzjk.zzhx();
        if (zzais.zzqt()) {
            try {
                this.zzcea.onAdFailedToLoad(zzvo.zza(errorCode));
                return;
            } catch (Throwable e) {
                zzaiw.zzc("Could not call onAdFailedToLoad.", e);
                return;
            }
        }
        zzaiw.zzco("onFailedToReceiveAd must be called on the main UI thread.");
        zzais.zzdbs.post(new zzvm(this, errorCode));
    }

    public final void onLeaveApplication(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzaiw.zzbw("Adapter called onLeaveApplication.");
        zzjk.zzhx();
        if (zzais.zzqt()) {
            try {
                this.zzcea.onAdLeftApplication();
                return;
            } catch (Throwable e) {
                zzaiw.zzc("Could not call onAdLeftApplication.", e);
                return;
            }
        }
        zzaiw.zzco("onLeaveApplication must be called on the main UI thread.");
        zzais.zzdbs.post(new zzvi(this));
    }

    public final void onLeaveApplication(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzaiw.zzbw("Adapter called onLeaveApplication.");
        zzjk.zzhx();
        if (zzais.zzqt()) {
            try {
                this.zzcea.onAdLeftApplication();
                return;
            } catch (Throwable e) {
                zzaiw.zzc("Could not call onAdLeftApplication.", e);
                return;
            }
        }
        zzaiw.zzco("onLeaveApplication must be called on the main UI thread.");
        zzais.zzdbs.post(new zzvn(this));
    }

    public final void onPresentScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzaiw.zzbw("Adapter called onPresentScreen.");
        zzjk.zzhx();
        if (zzais.zzqt()) {
            try {
                this.zzcea.onAdOpened();
                return;
            } catch (Throwable e) {
                zzaiw.zzc("Could not call onAdOpened.", e);
                return;
            }
        }
        zzaiw.zzco("onPresentScreen must be called on the main UI thread.");
        zzais.zzdbs.post(new zzvj(this));
    }

    public final void onPresentScreen(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzaiw.zzbw("Adapter called onPresentScreen.");
        zzjk.zzhx();
        if (zzais.zzqt()) {
            try {
                this.zzcea.onAdOpened();
                return;
            } catch (Throwable e) {
                zzaiw.zzc("Could not call onAdOpened.", e);
                return;
            }
        }
        zzaiw.zzco("onPresentScreen must be called on the main UI thread.");
        zzais.zzdbs.post(new zzve(this));
    }

    public final void onReceivedAd(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzaiw.zzbw("Adapter called onReceivedAd.");
        zzjk.zzhx();
        if (zzais.zzqt()) {
            try {
                this.zzcea.onAdLoaded();
                return;
            } catch (Throwable e) {
                zzaiw.zzc("Could not call onAdLoaded.", e);
                return;
            }
        }
        zzaiw.zzco("onReceivedAd must be called on the main UI thread.");
        zzais.zzdbs.post(new zzvk(this));
    }

    public final void onReceivedAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzaiw.zzbw("Adapter called onReceivedAd.");
        zzjk.zzhx();
        if (zzais.zzqt()) {
            try {
                this.zzcea.onAdLoaded();
                return;
            } catch (Throwable e) {
                zzaiw.zzc("Could not call onAdLoaded.", e);
                return;
            }
        }
        zzaiw.zzco("onReceivedAd must be called on the main UI thread.");
        zzais.zzdbs.post(new zzvf(this));
    }
}
