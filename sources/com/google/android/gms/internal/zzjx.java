package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

public abstract class zzjx extends zzee implements zzjw {
    public zzjx() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        zzjq zzjq = null;
        IBinder readStrongBinder;
        IInterface queryLocalInterface;
        switch (i) {
            case 1:
                IInterface zzdc = zzdc();
                parcel2.writeNoException();
                zzef.zza(parcel2, zzdc);
                return true;
            case 2:
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzjq = queryLocalInterface instanceof zzjq ? (zzjq) queryLocalInterface : new zzjs(readStrongBinder);
                }
                zzb(zzjq);
                break;
            case 3:
                zza(zzpz.zzo(parcel.readStrongBinder()));
                break;
            case 4:
                zza(zzqc.zzp(parcel.readStrongBinder()));
                break;
            case 5:
                zza(parcel.readString(), zzqi.zzr(parcel.readStrongBinder()), zzqf.zzq(parcel.readStrongBinder()));
                break;
            case 6:
                zza((zzom) zzef.zza(parcel, zzom.CREATOR));
                break;
            case 7:
                zzkm zzko;
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzko = queryLocalInterface instanceof zzkm ? (zzkm) queryLocalInterface : new zzko(readStrongBinder);
                }
                zzb(zzko);
                break;
            case 8:
                zza(zzql.zzs(parcel.readStrongBinder()), (zziw) zzef.zza(parcel, zziw.CREATOR));
                break;
            case 9:
                zza((PublisherAdViewOptions) zzef.zza(parcel, PublisherAdViewOptions.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
