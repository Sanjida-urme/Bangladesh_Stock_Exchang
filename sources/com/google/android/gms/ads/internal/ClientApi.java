package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;
import com.google.android.gms.internal.zzacj;
import com.google.android.gms.internal.zzacq;
import com.google.android.gms.internal.zzagr;
import com.google.android.gms.internal.zzaiy;
import com.google.android.gms.internal.zziw;
import com.google.android.gms.internal.zzjw;
import com.google.android.gms.internal.zzkb;
import com.google.android.gms.internal.zzkk;
import com.google.android.gms.internal.zzkp;
import com.google.android.gms.internal.zzoo;
import com.google.android.gms.internal.zzor;
import com.google.android.gms.internal.zzpc;
import com.google.android.gms.internal.zzph;
import com.google.android.gms.internal.zzuc;
import com.google.android.gms.internal.zzwj;
import com.google.android.gms.internal.zzwt;
import com.google.android.gms.internal.zzzb;
import java.util.HashMap;

@Keep
@zzzb
@KeepForSdkWithMembers
@DynamiteApi
public class ClientApi extends zzkk {
    public zzjw createAdLoaderBuilder(IObjectWrapper iObjectWrapper, String str, zzuc zzuc, int i) {
        Context context = (Context) zzn.zzx(iObjectWrapper);
        zzbs.zzec();
        return new zzaj(context, str, zzuc, new zzaiy(zzo.GOOGLE_PLAY_SERVICES_VERSION_CODE, i, true, zzagr.zzat(context)), zzv.zzd(context));
    }

    public zzwj createAdOverlay(IObjectWrapper iObjectWrapper) {
        return new zzd((Activity) zzn.zzx(iObjectWrapper));
    }

    public zzkb createBannerAdManager(IObjectWrapper iObjectWrapper, zziw zziw, String str, zzuc zzuc, int i) throws RemoteException {
        Context context = (Context) zzn.zzx(iObjectWrapper);
        zzbs.zzec();
        return new zzx(context, zziw, str, zzuc, new zzaiy(zzo.GOOGLE_PLAY_SERVICES_VERSION_CODE, i, true, zzagr.zzat(context)), zzv.zzd(context));
    }

    public zzwt createInAppPurchaseManager(IObjectWrapper iObjectWrapper) {
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.zzkb createInterstitialAdManager(com.google.android.gms.dynamic.IObjectWrapper r8, com.google.android.gms.internal.zziw r9, java.lang.String r10, com.google.android.gms.internal.zzuc r11, int r12) throws android.os.RemoteException {
        /*
        r7 = this;
        r8 = com.google.android.gms.dynamic.zzn.zzx(r8);
        r1 = r8;
        r1 = (android.content.Context) r1;
        com.google.android.gms.internal.zzmq.initialize(r1);
        r5 = new com.google.android.gms.internal.zzaiy;
        com.google.android.gms.ads.internal.zzbs.zzec();
        r8 = com.google.android.gms.internal.zzagr.zzat(r1);
        r0 = 1;
        r2 = 11717000; // 0xb2c988 float:1.6419014E-38 double:5.788967E-317;
        r5.<init>(r2, r12, r0, r8);
        r8 = "reward_mb";
        r12 = r9.zzbda;
        r8 = r8.equals(r12);
        if (r8 != 0) goto L_0x0036;
    L_0x0024:
        r12 = com.google.android.gms.internal.zzmq.zzbkg;
        r2 = com.google.android.gms.ads.internal.zzbs.zzep();
        r12 = r2.zzd(r12);
        r12 = (java.lang.Boolean) r12;
        r12 = r12.booleanValue();
        if (r12 != 0) goto L_0x004c;
    L_0x0036:
        if (r8 == 0) goto L_0x004b;
    L_0x0038:
        r8 = com.google.android.gms.internal.zzmq.zzbkh;
        r12 = com.google.android.gms.ads.internal.zzbs.zzep();
        r8 = r12.zzd(r8);
        r8 = (java.lang.Boolean) r8;
        r8 = r8.booleanValue();
        if (r8 == 0) goto L_0x004b;
    L_0x004a:
        goto L_0x004c;
    L_0x004b:
        r0 = 0;
    L_0x004c:
        if (r0 == 0) goto L_0x005d;
    L_0x004e:
        r8 = new com.google.android.gms.internal.zzsq;
        r9 = com.google.android.gms.ads.internal.zzv.zzd(r1);
        r0 = r8;
        r2 = r10;
        r3 = r11;
        r4 = r5;
        r5 = r9;
        r0.<init>(r1, r2, r3, r4, r5);
        return r8;
    L_0x005d:
        r8 = new com.google.android.gms.ads.internal.zzak;
        r6 = com.google.android.gms.ads.internal.zzv.zzd(r1);
        r0 = r8;
        r2 = r9;
        r3 = r10;
        r4 = r11;
        r0.<init>(r1, r2, r3, r4, r5, r6);
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.ClientApi.createInterstitialAdManager(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.internal.zziw, java.lang.String, com.google.android.gms.internal.zzuc, int):com.google.android.gms.internal.zzkb");
    }

    public zzpc createNativeAdViewDelegate(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzoo((FrameLayout) zzn.zzx(iObjectWrapper), (FrameLayout) zzn.zzx(iObjectWrapper2));
    }

    public zzph createNativeAdViewHolderDelegate(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzor((View) zzn.zzx(iObjectWrapper), (HashMap) zzn.zzx(iObjectWrapper2), (HashMap) zzn.zzx(iObjectWrapper3));
    }

    public zzacq createRewardedVideoAd(IObjectWrapper iObjectWrapper, zzuc zzuc, int i) {
        Context context = (Context) zzn.zzx(iObjectWrapper);
        zzbs.zzec();
        return new zzacj(context, zzv.zzd(context), zzuc, new zzaiy(zzo.GOOGLE_PLAY_SERVICES_VERSION_CODE, i, true, zzagr.zzat(context)));
    }

    public zzkb createSearchAdManager(IObjectWrapper iObjectWrapper, zziw zziw, String str, int i) throws RemoteException {
        Context context = (Context) zzn.zzx(iObjectWrapper);
        zzbs.zzec();
        return new zzbm(context, zziw, str, new zzaiy(zzo.GOOGLE_PLAY_SERVICES_VERSION_CODE, i, true, zzagr.zzat(context)));
    }

    @Nullable
    public zzkp getMobileAdsSettingsManager(IObjectWrapper iObjectWrapper) {
        return null;
    }

    public zzkp getMobileAdsSettingsManagerWithClientJarVersion(IObjectWrapper iObjectWrapper, int i) {
        Context context = (Context) zzn.zzx(iObjectWrapper);
        zzbs.zzec();
        return zzaw.zza(context, new zzaiy(zzo.GOOGLE_PLAY_SERVICES_VERSION_CODE, i, true, zzagr.zzat(context)));
    }
}
