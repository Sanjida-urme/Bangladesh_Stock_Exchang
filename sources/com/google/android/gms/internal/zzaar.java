package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import android.support.v4.internal.view.SupportMenu;

public final class zzaar implements Creator<zzaap> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int zzd = zzbek.zzd(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            if ((SupportMenu.USER_MASK & readInt) != 2) {
                zzbek.zzb(parcel, readInt);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) zzbek.zza(parcel, readInt, ParcelFileDescriptor.CREATOR);
            }
        }
        zzbek.zzaf(parcel, zzd);
        return new zzaap(parcelFileDescriptor);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaap[i];
    }
}
