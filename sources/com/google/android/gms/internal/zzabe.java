package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.internal.view.SupportMenu;

public final class zzabe implements Creator<zzabd> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int zzd = zzbek.zzd(parcel);
        String str = null;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            if ((SupportMenu.USER_MASK & readInt) != 2) {
                zzbek.zzb(parcel, readInt);
            } else {
                str = zzbek.zzq(parcel, readInt);
            }
        }
        zzbek.zzaf(parcel, zzd);
        return new zzabd(str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzabd[i];
    }
}
