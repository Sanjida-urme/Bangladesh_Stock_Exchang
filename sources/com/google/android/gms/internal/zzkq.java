package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper.zza;

public abstract class zzkq extends zzee implements zzkp {
    public zzkq() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                initialize();
                break;
            case 2:
                setAppVolume(parcel.readFloat());
                break;
            case 3:
                zzt(parcel.readString());
                break;
            case 4:
                setAppMuted(zzef.zza(parcel));
                break;
            case 5:
                zzb(zza.zzap(parcel.readStrongBinder()), parcel.readString());
                break;
            case 6:
                zza(parcel.readString(), zza.zzap(parcel.readStrongBinder()));
                break;
            case 7:
                float zzdh = zzdh();
                parcel2.writeNoException();
                parcel2.writeFloat(zzdh);
                return true;
            case 8:
                boolean zzdi = zzdi();
                parcel2.writeNoException();
                zzef.zza(parcel2, zzdi);
                return true;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
