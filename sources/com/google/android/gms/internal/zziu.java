package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.internal.view.SupportMenu;
import java.util.List;

public final class zziu implements Creator<zzis> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int zzd = zzbek.zzd(parcel);
        Bundle bundle = null;
        List list = bundle;
        String str = list;
        zzlw zzlw = str;
        Location location = zzlw;
        String str2 = location;
        Bundle bundle2 = str2;
        Bundle bundle3 = bundle2;
        List list2 = bundle3;
        String str3 = list2;
        String str4 = str3;
        long j = 0;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            switch (SupportMenu.USER_MASK & readInt) {
                case 1:
                    i = zzbek.zzg(parcel2, readInt);
                    break;
                case 2:
                    j = zzbek.zzi(parcel2, readInt);
                    break;
                case 3:
                    bundle = zzbek.zzs(parcel2, readInt);
                    break;
                case 4:
                    i2 = zzbek.zzg(parcel2, readInt);
                    break;
                case 5:
                    list = zzbek.zzac(parcel2, readInt);
                    break;
                case 6:
                    z = zzbek.zzc(parcel2, readInt);
                    break;
                case 7:
                    i3 = zzbek.zzg(parcel2, readInt);
                    break;
                case 8:
                    z2 = zzbek.zzc(parcel2, readInt);
                    break;
                case 9:
                    str = zzbek.zzq(parcel2, readInt);
                    break;
                case 10:
                    zzlw = (zzlw) zzbek.zza(parcel2, readInt, zzlw.CREATOR);
                    break;
                case 11:
                    location = (Location) zzbek.zza(parcel2, readInt, Location.CREATOR);
                    break;
                case 12:
                    str2 = zzbek.zzq(parcel2, readInt);
                    break;
                case 13:
                    bundle2 = zzbek.zzs(parcel2, readInt);
                    break;
                case 14:
                    bundle3 = zzbek.zzs(parcel2, readInt);
                    break;
                case 15:
                    list2 = zzbek.zzac(parcel2, readInt);
                    break;
                case 16:
                    str3 = zzbek.zzq(parcel2, readInt);
                    break;
                case 17:
                    str4 = zzbek.zzq(parcel2, readInt);
                    break;
                case 18:
                    z3 = zzbek.zzc(parcel2, readInt);
                    break;
                default:
                    zzbek.zzb(parcel2, readInt);
                    break;
            }
        }
        zzbek.zzaf(parcel2, zzd);
        return new zzis(i, j, bundle, i2, list, z, i3, z2, str, zzlw, location, str2, bundle2, bundle3, list2, str3, str4, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzis[i];
    }
}
