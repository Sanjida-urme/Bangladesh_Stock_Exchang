package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@zzzb
public final class zzuw extends zzug {
    private final MediationAdapter zzcdy;
    private zzux zzcdz;

    public zzuw(MediationAdapter mediationAdapter) {
        this.zzcdy = mediationAdapter;
    }

    private final Bundle zza(String str, zzis zzis, String str2) throws RemoteException {
        String str3 = "Server parameters: ";
        String valueOf = String.valueOf(str);
        zzaiw.zzco(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        try {
            Bundle bundle;
            Bundle bundle2 = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                bundle = new Bundle();
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str4 = (String) keys.next();
                    bundle.putString(str4, jSONObject.getString(str4));
                }
            } else {
                bundle = bundle2;
            }
            if (this.zzcdy instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzis != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzis.zzbbz);
                }
            }
            return bundle;
        } catch (Throwable th) {
            zzaiw.zzc("Could not get Server Parameters Bundle.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    private static boolean zzn(zzis zzis) {
        if (!zzis.zzbby) {
            zzjk.zzhx();
            if (!zzais.zzqs()) {
                return false;
            }
        }
        return true;
    }

    public final void destroy() throws RemoteException {
        try {
            this.zzcdy.onDestroy();
        } catch (Throwable th) {
            zzaiw.zzc("Could not destroy adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public final Bundle getInterstitialAdapterInfo() {
        if (this.zzcdy instanceof zzanr) {
            return ((zzanr) this.zzcdy).getInterstitialAdapterInfo();
        }
        String str = "MediationAdapter is not a v2 MediationInterstitialAdapter: ";
        String valueOf = String.valueOf(this.zzcdy.getClass().getCanonicalName());
        zzaiw.zzco(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        return new Bundle();
    }

    public final zzku getVideoController() {
        if (!(this.zzcdy instanceof zza)) {
            return null;
        }
        try {
            return ((zza) this.zzcdy).getVideoController();
        } catch (Throwable th) {
            zzaiw.zzc("Could not get video controller.", th);
            return null;
        }
    }

    public final IObjectWrapper getView() throws RemoteException {
        if (this.zzcdy instanceof MediationBannerAdapter) {
            try {
                return zzn.zzy(((MediationBannerAdapter) this.zzcdy).getBannerView());
            } catch (Throwable th) {
                zzaiw.zzc("Could not get banner view from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(this.zzcdy.getClass().getCanonicalName());
            zzaiw.zzco(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    public final boolean isInitialized() throws RemoteException {
        if (this.zzcdy instanceof MediationRewardedVideoAdAdapter) {
            zzaiw.zzbw("Check if adapter is initialized.");
            try {
                return ((MediationRewardedVideoAdAdapter) this.zzcdy).isInitialized();
            } catch (Throwable th) {
                zzaiw.zzc("Could not check if adapter is initialized.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(this.zzcdy.getClass().getCanonicalName());
            zzaiw.zzco(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    public final void pause() throws RemoteException {
        try {
            this.zzcdy.onPause();
        } catch (Throwable th) {
            zzaiw.zzc("Could not pause adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public final void resume() throws RemoteException {
        try {
            this.zzcdy.onResume();
        } catch (Throwable th) {
            zzaiw.zzc("Could not resume adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public final void setImmersiveMode(boolean z) throws RemoteException {
        if (this.zzcdy instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener) this.zzcdy).onImmersiveModeUpdated(z);
                return;
            } catch (Throwable th) {
                zzaiw.zzc("Could not set immersive mode.", th);
                return;
            }
        }
        String str = "MediationAdapter is not an OnImmersiveModeUpdatedListener: ";
        String valueOf = String.valueOf(this.zzcdy.getClass().getCanonicalName());
        zzaiw.zzcn(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    public final void showInterstitial() throws RemoteException {
        if (this.zzcdy instanceof MediationInterstitialAdapter) {
            zzaiw.zzbw("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.zzcdy).showInterstitial();
            } catch (Throwable th) {
                zzaiw.zzc("Could not show interstitial from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(this.zzcdy.getClass().getCanonicalName());
            zzaiw.zzco(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    public final void showVideo() throws RemoteException {
        if (this.zzcdy instanceof MediationRewardedVideoAdAdapter) {
            zzaiw.zzbw("Show rewarded video ad from adapter.");
            try {
                ((MediationRewardedVideoAdAdapter) this.zzcdy).showVideo();
            } catch (Throwable th) {
                zzaiw.zzc("Could not show rewarded video ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(this.zzcdy.getClass().getCanonicalName());
            zzaiw.zzco(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzads zzads, List<String> list) throws RemoteException {
        if (this.zzcdy instanceof InitializableMediationRewardedVideoAdAdapter) {
            zzaiw.zzbw("Initialize rewarded video adapter.");
            try {
                InitializableMediationRewardedVideoAdAdapter initializableMediationRewardedVideoAdAdapter = (InitializableMediationRewardedVideoAdAdapter) this.zzcdy;
                List arrayList = new ArrayList();
                for (String zza : list) {
                    arrayList.add(zza(zza, null, null));
                }
                initializableMediationRewardedVideoAdAdapter.initialize((Context) zzn.zzx(iObjectWrapper), new zzadv(zzads), arrayList);
            } catch (Throwable th) {
                zzaiw.zzc("Could not initialize rewarded video adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not an InitializableMediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(this.zzcdy.getClass().getCanonicalName());
            zzaiw.zzco(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzis zzis, String str, zzads zzads, String str2) throws RemoteException {
        zzis zzis2 = zzis;
        if (this.zzcdy instanceof MediationRewardedVideoAdAdapter) {
            zzaiw.zzbw("Initialize rewarded video adapter.");
            try {
                Bundle bundle;
                MediationAdRequest mediationAdRequest;
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) r1.zzcdy;
                Bundle zza = zza(str2, zzis2, null);
                if (zzis2 != null) {
                    zzuv zzuv = new zzuv(zzis2.zzbbv == -1 ? null : new Date(zzis2.zzbbv), zzis2.zzbbw, zzis2.zzbbx != null ? new HashSet(zzis2.zzbbx) : null, zzis2.zzbcd, zzn(zzis), zzis2.zzbbz, zzis2.zzbck);
                    bundle = zzis2.zzbcf != null ? zzis2.zzbcf.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null;
                    mediationAdRequest = zzuv;
                } else {
                    mediationAdRequest = null;
                    bundle = mediationAdRequest;
                }
                mediationRewardedVideoAdAdapter.initialize((Context) zzn.zzx(iObjectWrapper), mediationAdRequest, str, new zzadv(zzads), zza, bundle);
            } catch (Throwable th) {
                zzaiw.zzc("Could not initialize rewarded video adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(r1.zzcdy.getClass().getCanonicalName());
            zzaiw.zzco(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzis zzis, String str, zzui zzui) throws RemoteException {
        zza(iObjectWrapper, zzis, str, null, zzui);
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzis zzis, String str, String str2, zzui zzui) throws RemoteException {
        zzis zzis2 = zzis;
        if (this.zzcdy instanceof MediationInterstitialAdapter) {
            zzaiw.zzbw("Requesting interstitial ad from adapter.");
            try {
                MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) r1.zzcdy;
                Bundle bundle = null;
                zzuv zzuv = new zzuv(zzis2.zzbbv == -1 ? null : new Date(zzis2.zzbbv), zzis2.zzbbw, zzis2.zzbbx != null ? new HashSet(zzis2.zzbbx) : null, zzis2.zzbcd, zzn(zzis), zzis2.zzbbz, zzis2.zzbck);
                if (zzis2.zzbcf != null) {
                    bundle = zzis2.zzbcf.getBundle(mediationInterstitialAdapter.getClass().getName());
                }
                mediationInterstitialAdapter.requestInterstitialAd((Context) zzn.zzx(iObjectWrapper), new zzux(zzui), zza(str, zzis2, str2), zzuv, bundle);
            } catch (Throwable th) {
                zzaiw.zzc("Could not request interstitial ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(r1.zzcdy.getClass().getCanonicalName());
            zzaiw.zzco(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzis zzis, String str, String str2, zzui zzui, zzom zzom, List<String> list) throws RemoteException {
        zzis zzis2 = zzis;
        if (this.zzcdy instanceof MediationNativeAdapter) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) r1.zzcdy;
                Bundle bundle = null;
                zzva zzva = new zzva(zzis2.zzbbv == -1 ? null : new Date(zzis2.zzbbv), zzis2.zzbbw, zzis2.zzbbx != null ? new HashSet(zzis2.zzbbx) : null, zzis2.zzbcd, zzn(zzis), zzis2.zzbbz, zzom, list, zzis2.zzbck);
                if (zzis2.zzbcf != null) {
                    bundle = zzis2.zzbcf.getBundle(mediationNativeAdapter.getClass().getName());
                }
                Bundle bundle2 = bundle;
                r1.zzcdz = new zzux(zzui);
                mediationNativeAdapter.requestNativeAd((Context) zzn.zzx(iObjectWrapper), r1.zzcdz, zza(str, zzis2, str2), zzva, bundle2);
            } catch (Throwable th) {
                zzaiw.zzc("Could not request native ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationNativeAdapter: ";
            String valueOf = String.valueOf(r1.zzcdy.getClass().getCanonicalName());
            zzaiw.zzco(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    public final void zza(IObjectWrapper iObjectWrapper, zziw zziw, zzis zzis, String str, zzui zzui) throws RemoteException {
        zza(iObjectWrapper, zziw, zzis, str, null, zzui);
    }

    public final void zza(IObjectWrapper iObjectWrapper, zziw zziw, zzis zzis, String str, String str2, zzui zzui) throws RemoteException {
        zziw zziw2 = zziw;
        zzis zzis2 = zzis;
        if (this.zzcdy instanceof MediationBannerAdapter) {
            zzaiw.zzbw("Requesting banner ad from adapter.");
            try {
                MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) r1.zzcdy;
                Bundle bundle = null;
                zzuv zzuv = new zzuv(zzis2.zzbbv == -1 ? null : new Date(zzis2.zzbbv), zzis2.zzbbw, zzis2.zzbbx != null ? new HashSet(zzis2.zzbbx) : null, zzis2.zzbcd, zzn(zzis), zzis2.zzbbz, zzis2.zzbck);
                if (zzis2.zzbcf != null) {
                    bundle = zzis2.zzbcf.getBundle(mediationBannerAdapter.getClass().getName());
                }
                mediationBannerAdapter.requestBannerAd((Context) zzn.zzx(iObjectWrapper), new zzux(zzui), zza(str, zzis2, str2), zzb.zza(zziw2.width, zziw2.height, zziw2.zzbda), zzuv, bundle);
            } catch (Throwable th) {
                zzaiw.zzc("Could not request banner ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(r1.zzcdy.getClass().getCanonicalName());
            zzaiw.zzco(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    public final void zza(zzis zzis, String str, String str2) throws RemoteException {
        if (this.zzcdy instanceof MediationRewardedVideoAdAdapter) {
            zzaiw.zzbw("Requesting rewarded video ad from adapter.");
            try {
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.zzcdy;
                Bundle bundle = null;
                MediationAdRequest zzuv = new zzuv(zzis.zzbbv == -1 ? null : new Date(zzis.zzbbv), zzis.zzbbw, zzis.zzbbx != null ? new HashSet(zzis.zzbbx) : null, zzis.zzbcd, zzn(zzis), zzis.zzbbz, zzis.zzbck);
                if (zzis.zzbcf != null) {
                    bundle = zzis.zzbcf.getBundle(mediationRewardedVideoAdAdapter.getClass().getName());
                }
                mediationRewardedVideoAdAdapter.loadAd(zzuv, zza(str, zzis, str2), bundle);
            } catch (Throwable th) {
                zzaiw.zzc("Could not load rewarded video ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ";
            str = String.valueOf(this.zzcdy.getClass().getCanonicalName());
            zzaiw.zzco(str.length() != 0 ? str3.concat(str) : new String(str3));
            throw new RemoteException();
        }
    }

    public final void zzc(zzis zzis, String str) throws RemoteException {
        zza(zzis, str, null);
    }

    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        try {
            ((OnContextChangedListener) this.zzcdy).onContextChanged((Context) zzn.zzx(iObjectWrapper));
        } catch (Throwable th) {
            zzaiw.zza("Could not inform adapter of changed context", th);
        }
    }

    public final zzuo zzly() {
        NativeAdMapper zzmg = this.zzcdz.zzmg();
        return zzmg instanceof NativeAppInstallAdMapper ? new zzuy((NativeAppInstallAdMapper) zzmg) : null;
    }

    public final zzur zzlz() {
        NativeAdMapper zzmg = this.zzcdz.zzmg();
        return zzmg instanceof NativeContentAdMapper ? new zzuz((NativeContentAdMapper) zzmg) : null;
    }

    public final Bundle zzma() {
        if (this.zzcdy instanceof zzanq) {
            return ((zzanq) this.zzcdy).zzma();
        }
        String str = "MediationAdapter is not a v2 MediationBannerAdapter: ";
        String valueOf = String.valueOf(this.zzcdy.getClass().getCanonicalName());
        zzaiw.zzco(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        return new Bundle();
    }

    public final Bundle zzmb() {
        return new Bundle();
    }

    public final boolean zzmc() {
        return this.zzcdy instanceof InitializableMediationRewardedVideoAdAdapter;
    }

    public final zzpu zzmd() {
        NativeCustomTemplateAd zzmh = this.zzcdz.zzmh();
        return zzmh instanceof zzpx ? ((zzpx) zzmh).zzkg() : null;
    }
}
