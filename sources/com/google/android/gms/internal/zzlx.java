package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.internal.view.SupportMenu;

public final class zzlx implements Creator<zzlw> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int zzd = zzbek.zzd(parcel);
        String str = null;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            if ((SupportMenu.USER_MASK & readInt) != 15) {
                zzbek.zzb(parcel, readInt);
            } else {
                str = zzbek.zzq(parcel, readInt);
            }
        }
        zzbek.zzaf(parcel, zzd);
        return new zzlw(str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzlw[i];
    }
}
