package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.CustomTabsIntent;
import android.support.customtabs.CustomTabsIntent.Builder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.common.util.zzq;

@zzzb
public final class zzvq implements MediationInterstitialAdapter {
    private Uri mUri;
    private Activity zzcem;
    private MediationInterstitialListener zzcen;

    public final void onDestroy() {
        zzaiw.zzbw("Destroying AdMobCustomTabsAdapter adapter.");
    }

    public final void onPause() {
        zzaiw.zzbw("Pausing AdMobCustomTabsAdapter adapter.");
    }

    public final void onResume() {
        zzaiw.zzbw("Resuming AdMobCustomTabsAdapter adapter.");
    }

    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.zzcen = mediationInterstitialListener;
        if (this.zzcen == null) {
            zzaiw.zzco("Listener not set for mediation. Returning.");
        } else if (context instanceof Activity) {
            Object obj = (zzq.zzalw() && zznn.zzi(context)) ? 1 : null;
            if (obj == null) {
                zzaiw.zzco("Default browser does not support custom tabs. Bailing out.");
                this.zzcen.onAdFailedToLoad(this, 0);
                return;
            }
            obj = bundle.getString("tab_url");
            if (TextUtils.isEmpty(obj)) {
                zzaiw.zzco("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.zzcen.onAdFailedToLoad(this, 0);
                return;
            }
            this.zzcem = (Activity) context;
            this.mUri = Uri.parse(obj);
            this.zzcen.onAdLoaded(this);
        } else {
            zzaiw.zzco("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.zzcen.onAdFailedToLoad(this, 0);
        }
    }

    public final void showInterstitial() {
        CustomTabsIntent build = new Builder().build();
        build.intent.setData(this.mUri);
        zzagr.zzczc.post(new zzvs(this, new AdOverlayInfoParcel(new zzc(build.intent), null, new zzvr(this), null, new zzaiy(0, 0, false))));
        zzbs.zzeg().zzpi();
    }
}
