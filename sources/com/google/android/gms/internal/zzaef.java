package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.internal.view.SupportMenu;
import java.util.List;

public final class zzaef implements Creator<zzaee> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int zzd = zzbek.zzd(parcel);
        String str = null;
        String str2 = str;
        List list = str2;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            switch (SupportMenu.USER_MASK & readInt) {
                case 2:
                    str = zzbek.zzq(parcel, readInt);
                    break;
                case 3:
                    str2 = zzbek.zzq(parcel, readInt);
                    break;
                case 4:
                    z = zzbek.zzc(parcel, readInt);
                    break;
                case 5:
                    z2 = zzbek.zzc(parcel, readInt);
                    break;
                case 6:
                    list = zzbek.zzac(parcel, readInt);
                    break;
                case 7:
                    z3 = zzbek.zzc(parcel, readInt);
                    break;
                case 8:
                    z4 = zzbek.zzc(parcel, readInt);
                    break;
                default:
                    zzbek.zzb(parcel, readInt);
                    break;
            }
        }
        zzbek.zzaf(parcel, zzd);
        return new zzaee(str, str2, z, z2, list, z3, z4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaee[i];
    }
}
