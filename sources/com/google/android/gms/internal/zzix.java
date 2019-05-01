package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.internal.view.SupportMenu;

public final class zzix implements Creator<zziw> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int zzd = zzbek.zzd(parcel);
        String str = null;
        zziw[] zziwArr = str;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
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
                    i = zzbek.zzg(parcel, readInt);
                    break;
                case 4:
                    i2 = zzbek.zzg(parcel, readInt);
                    break;
                case 5:
                    z = zzbek.zzc(parcel, readInt);
                    break;
                case 6:
                    i3 = zzbek.zzg(parcel, readInt);
                    break;
                case 7:
                    i4 = zzbek.zzg(parcel, readInt);
                    break;
                case 8:
                    zziwArr = (zziw[]) zzbek.zzb(parcel, readInt, zziw.CREATOR);
                    break;
                case 9:
                    z2 = zzbek.zzc(parcel, readInt);
                    break;
                case 10:
                    z3 = zzbek.zzc(parcel, readInt);
                    break;
                case 11:
                    z4 = zzbek.zzc(parcel, readInt);
                    break;
                default:
                    zzbek.zzb(parcel, readInt);
                    break;
            }
        }
        zzbek.zzaf(parcel, zzd);
        return new zziw(str, i, i2, z, i3, i4, zziwArr, z2, z3, z4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zziw[i];
    }
}
