package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.zza;
import java.util.List;

public final class zzpo extends zzed implements zzpm {
    zzpo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    public final void destroy() throws RemoteException {
        zzb(12, zzaz());
    }

    public final String getBody() throws RemoteException {
        Parcel zza = zza(5, zzaz());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    public final String getCallToAction() throws RemoteException {
        Parcel zza = zza(7, zzaz());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    public final Bundle getExtras() throws RemoteException {
        Parcel zza = zza(11, zzaz());
        Bundle bundle = (Bundle) zzef.zza(zza, Bundle.CREATOR);
        zza.recycle();
        return bundle;
    }

    public final String getHeadline() throws RemoteException {
        Parcel zza = zza(3, zzaz());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    public final List getImages() throws RemoteException {
        Parcel zza = zza(4, zzaz());
        List zzb = zzef.zzb(zza);
        zza.recycle();
        return zzb;
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel zza = zza(19, zzaz());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    public final String getPrice() throws RemoteException {
        Parcel zza = zza(10, zzaz());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    public final double getStarRating() throws RemoteException {
        Parcel zza = zza(8, zzaz());
        double readDouble = zza.readDouble();
        zza.recycle();
        return readDouble;
    }

    public final String getStore() throws RemoteException {
        Parcel zza = zza(9, zzaz());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    public final zzku getVideoController() throws RemoteException {
        Parcel zza = zza(13, zzaz());
        zzku zzh = zzkv.zzh(zza.readStrongBinder());
        zza.recycle();
        return zzh;
    }

    public final void performClick(Bundle bundle) throws RemoteException {
        Parcel zzaz = zzaz();
        zzef.zza(zzaz, (Parcelable) bundle);
        zzb(14, zzaz);
    }

    public final boolean recordImpression(Bundle bundle) throws RemoteException {
        Parcel zzaz = zzaz();
        zzef.zza(zzaz, (Parcelable) bundle);
        Parcel zza = zza(15, zzaz);
        boolean zza2 = zzef.zza(zza);
        zza.recycle();
        return zza2;
    }

    public final void reportTouchEvent(Bundle bundle) throws RemoteException {
        Parcel zzaz = zzaz();
        zzef.zza(zzaz, (Parcelable) bundle);
        zzb(16, zzaz);
    }

    public final zzoy zzjm() throws RemoteException {
        zzoy zzoy;
        Parcel zza = zza(6, zzaz());
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzoy = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzoy = queryLocalInterface instanceof zzoy ? (zzoy) queryLocalInterface : new zzpa(readStrongBinder);
        }
        zza.recycle();
        return zzoy;
    }

    public final IObjectWrapper zzjn() throws RemoteException {
        Parcel zza = zza(2, zzaz());
        IObjectWrapper zzap = zza.zzap(zza.readStrongBinder());
        zza.recycle();
        return zzap;
    }

    public final IObjectWrapper zzjr() throws RemoteException {
        Parcel zza = zza(18, zzaz());
        IObjectWrapper zzap = zza.zzap(zza.readStrongBinder());
        zza.recycle();
        return zzap;
    }

    public final zzou zzjs() throws RemoteException {
        zzou zzou;
        Parcel zza = zza(17, zzaz());
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzou = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzou = queryLocalInterface instanceof zzou ? (zzou) queryLocalInterface : new zzow(readStrongBinder);
        }
        zza.recycle();
        return zzou;
    }
}
