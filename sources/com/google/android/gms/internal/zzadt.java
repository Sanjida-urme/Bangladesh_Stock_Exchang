package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper.zza;

public abstract class zzadt extends zzee implements zzads {
    public zzadt() {
        attachInterface(this, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static zzads zzaa(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return queryLocalInterface instanceof zzads ? (zzads) queryLocalInterface : new zzadu(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                zzm(zza.zzap(parcel.readStrongBinder()));
                break;
            case 2:
                zzc(zza.zzap(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                zzn(zza.zzap(parcel.readStrongBinder()));
                break;
            case 4:
                zzo(zza.zzap(parcel.readStrongBinder()));
                break;
            case 5:
                zzp(zza.zzap(parcel.readStrongBinder()));
                break;
            case 6:
                zzq(zza.zzap(parcel.readStrongBinder()));
                break;
            case 7:
                zza(zza.zzap(parcel.readStrongBinder()), (zzadw) zzef.zza(parcel, zzadw.CREATOR));
                break;
            case 8:
                zzr(zza.zzap(parcel.readStrongBinder()));
                break;
            case 9:
                zzd(zza.zzap(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                zzs(zza.zzap(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
