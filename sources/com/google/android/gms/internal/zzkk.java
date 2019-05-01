package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper.zza;

public abstract class zzkk extends zzee implements zzkj {
    public zzkk() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    public static zzkj asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
        return queryLocalInterface instanceof zzkj ? (zzkj) queryLocalInterface : new zzkl(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        IInterface createBannerAdManager;
        switch (i) {
            case 1:
                createBannerAdManager = createBannerAdManager(zza.zzap(parcel.readStrongBinder()), (zziw) zzef.zza(parcel, zziw.CREATOR), parcel.readString(), zzud.zzt(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 2:
                createBannerAdManager = createInterstitialAdManager(zza.zzap(parcel.readStrongBinder()), (zziw) zzef.zza(parcel, zziw.CREATOR), parcel.readString(), zzud.zzt(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                createBannerAdManager = createAdLoaderBuilder(zza.zzap(parcel.readStrongBinder()), parcel.readString(), zzud.zzt(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 4:
                createBannerAdManager = getMobileAdsSettingsManager(zza.zzap(parcel.readStrongBinder()));
                break;
            case 5:
                createBannerAdManager = createNativeAdViewDelegate(zza.zzap(parcel.readStrongBinder()), zza.zzap(parcel.readStrongBinder()));
                break;
            case 6:
                createBannerAdManager = createRewardedVideoAd(zza.zzap(parcel.readStrongBinder()), zzud.zzt(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 7:
                createBannerAdManager = createInAppPurchaseManager(zza.zzap(parcel.readStrongBinder()));
                break;
            case 8:
                createBannerAdManager = createAdOverlay(zza.zzap(parcel.readStrongBinder()));
                break;
            case 9:
                createBannerAdManager = getMobileAdsSettingsManagerWithClientJarVersion(zza.zzap(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                createBannerAdManager = createSearchAdManager(zza.zzap(parcel.readStrongBinder()), (zziw) zzef.zza(parcel, zziw.CREATOR), parcel.readString(), parcel.readInt());
                break;
            case 11:
                createBannerAdManager = createNativeAdViewHolderDelegate(zza.zzap(parcel.readStrongBinder()), zza.zzap(parcel.readStrongBinder()), zza.zzap(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        zzef.zza(parcel2, createBannerAdManager);
        return true;
    }
}
