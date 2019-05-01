package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.internal.view.SupportMenu;

public final class zzlb implements Creator<zzla> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int zzd = zzbek.zzd(parcel);
        int i = 0;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            if ((SupportMenu.USER_MASK & readInt) != 2) {
                zzbek.zzb(parcel, readInt);
            } else {
                i = zzbek.zzg(parcel, readInt);
            }
        }
        zzbek.zzaf(parcel, zzd);
        return new zzla(i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzla[i];
    }
}
