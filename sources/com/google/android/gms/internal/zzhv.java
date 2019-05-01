package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.internal.view.SupportMenu;

public final class zzhv implements Creator<zzhu> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int zzd = zzbek.zzd(parcel);
        long j = 0;
        long j2 = j;
        String str = null;
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        Bundle bundle = str4;
        boolean z = false;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            switch (SupportMenu.USER_MASK & readInt) {
                case 2:
                    str = zzbek.zzq(parcel2, readInt);
                    break;
                case 3:
                    j = zzbek.zzi(parcel2, readInt);
                    break;
                case 4:
                    str2 = zzbek.zzq(parcel2, readInt);
                    break;
                case 5:
                    str3 = zzbek.zzq(parcel2, readInt);
                    break;
                case 6:
                    str4 = zzbek.zzq(parcel2, readInt);
                    break;
                case 7:
                    bundle = zzbek.zzs(parcel2, readInt);
                    break;
                case 8:
                    z = zzbek.zzc(parcel2, readInt);
                    break;
                case 9:
                    j2 = zzbek.zzi(parcel2, readInt);
                    break;
                default:
                    zzbek.zzb(parcel2, readInt);
                    break;
            }
        }
        zzbek.zzaf(parcel2, zzd);
        return new zzhu(str, j, str2, str3, str4, bundle, z, j2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzhu[i];
    }
}
