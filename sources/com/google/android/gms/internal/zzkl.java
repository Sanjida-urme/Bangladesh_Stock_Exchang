package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzkl extends zzed implements zzkj {
    zzkl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    public final zzjw createAdLoaderBuilder(IObjectWrapper iObjectWrapper, String str, zzuc zzuc, int i) throws RemoteException {
        zzjw zzjw;
        Parcel zzaz = zzaz();
        zzef.zza(zzaz, (IInterface) iObjectWrapper);
        zzaz.writeString(str);
        zzef.zza(zzaz, (IInterface) zzuc);
        zzaz.writeInt(i);
        Parcel zza = zza(3, zzaz);
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzjw = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzjw = queryLocalInterface instanceof zzjw ? (zzjw) queryLocalInterface : new zzjy(readStrongBinder);
        }
        zza.recycle();
        return zzjw;
    }

    public final zzwj createAdOverlay(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzaz = zzaz();
        zzef.zza(zzaz, (IInterface) iObjectWrapper);
        Parcel zza = zza(8, zzaz);
        zzwj zzu = zzwk.zzu(zza.readStrongBinder());
        zza.recycle();
        return zzu;
    }

    public final zzkb createBannerAdManager(IObjectWrapper iObjectWrapper, zziw zziw, String str, zzuc zzuc, int i) throws RemoteException {
        zzkb zzkb;
        Parcel zzaz = zzaz();
        zzef.zza(zzaz, (IInterface) iObjectWrapper);
        zzef.zza(zzaz, (Parcelable) zziw);
        zzaz.writeString(str);
        zzef.zza(zzaz, (IInterface) zzuc);
        zzaz.writeInt(i);
        Parcel zza = zza(1, zzaz);
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzkb = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzkb = queryLocalInterface instanceof zzkb ? (zzkb) queryLocalInterface : new zzkd(readStrongBinder);
        }
        zza.recycle();
        return zzkb;
    }

    public final zzwt createInAppPurchaseManager(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzaz = zzaz();
        zzef.zza(zzaz, (IInterface) iObjectWrapper);
        Parcel zza = zza(7, zzaz);
        zzwt zzw = zzwu.zzw(zza.readStrongBinder());
        zza.recycle();
        return zzw;
    }

    public final zzkb createInterstitialAdManager(IObjectWrapper iObjectWrapper, zziw zziw, String str, zzuc zzuc, int i) throws RemoteException {
        zzkb zzkb;
        Parcel zzaz = zzaz();
        zzef.zza(zzaz, (IInterface) iObjectWrapper);
        zzef.zza(zzaz, (Parcelable) zziw);
        zzaz.writeString(str);
        zzef.zza(zzaz, (IInterface) zzuc);
        zzaz.writeInt(i);
        Parcel zza = zza(2, zzaz);
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzkb = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzkb = queryLocalInterface instanceof zzkb ? (zzkb) queryLocalInterface : new zzkd(readStrongBinder);
        }
        zza.recycle();
        return zzkb;
    }

    public final zzpc createNativeAdViewDelegate(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zzaz = zzaz();
        zzef.zza(zzaz, (IInterface) iObjectWrapper);
        zzef.zza(zzaz, (IInterface) iObjectWrapper2);
        Parcel zza = zza(5, zzaz);
        zzpc zzl = zzpd.zzl(zza.readStrongBinder());
        zza.recycle();
        return zzl;
    }

    public final zzph createNativeAdViewHolderDelegate(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zzaz = zzaz();
        zzef.zza(zzaz, (IInterface) iObjectWrapper);
        zzef.zza(zzaz, (IInterface) iObjectWrapper2);
        zzef.zza(zzaz, (IInterface) iObjectWrapper3);
        Parcel zza = zza(11, zzaz);
        zzph zzm = zzpi.zzm(zza.readStrongBinder());
        zza.recycle();
        return zzm;
    }

    public final zzacq createRewardedVideoAd(IObjectWrapper iObjectWrapper, zzuc zzuc, int i) throws RemoteException {
        Parcel zzaz = zzaz();
        zzef.zza(zzaz, (IInterface) iObjectWrapper);
        zzef.zza(zzaz, (IInterface) zzuc);
        zzaz.writeInt(i);
        Parcel zza = zza(6, zzaz);
        zzacq zzy = zzacr.zzy(zza.readStrongBinder());
        zza.recycle();
        return zzy;
    }

    public final zzkb createSearchAdManager(IObjectWrapper iObjectWrapper, zziw zziw, String str, int i) throws RemoteException {
        zzkb zzkb;
        Parcel zzaz = zzaz();
        zzef.zza(zzaz, (IInterface) iObjectWrapper);
        zzef.zza(zzaz, (Parcelable) zziw);
        zzaz.writeString(str);
        zzaz.writeInt(i);
        Parcel zza = zza(10, zzaz);
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzkb = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzkb = queryLocalInterface instanceof zzkb ? (zzkb) queryLocalInterface : new zzkd(readStrongBinder);
        }
        zza.recycle();
        return zzkb;
    }

    public final zzkp getMobileAdsSettingsManager(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzkp zzkp;
        Parcel zzaz = zzaz();
        zzef.zza(zzaz, (IInterface) iObjectWrapper);
        Parcel zza = zza(4, zzaz);
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzkp = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzkp = queryLocalInterface instanceof zzkp ? (zzkp) queryLocalInterface : new zzkr(readStrongBinder);
        }
        zza.recycle();
        return zzkp;
    }

    public final zzkp getMobileAdsSettingsManagerWithClientJarVersion(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzkp zzkp;
        Parcel zzaz = zzaz();
        zzef.zza(zzaz, (IInterface) iObjectWrapper);
        zzaz.writeInt(i);
        Parcel zza = zza(9, zzaz);
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzkp = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzkp = queryLocalInterface instanceof zzkp ? (zzkp) queryLocalInterface : new zzkr(readStrongBinder);
        }
        zza.recycle();
        return zzkp;
    }
}
