package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.internal.view.SupportMenu;
import java.util.List;

public final class zzaae implements Creator<zzaad> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int zzd = zzbek.zzd(parcel);
        long j = 0;
        long j2 = j;
        long j3 = j2;
        long j4 = j3;
        String str = null;
        String str2 = str;
        List list = str2;
        List list2 = list;
        List list3 = list2;
        String str3 = list3;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        zzaap zzaap = str6;
        String str7 = zzaap;
        String str8 = str7;
        zzadw zzadw = str8;
        List list4 = zzadw;
        List list5 = list4;
        zzaaf zzaaf = list5;
        String str9 = zzaaf;
        List list6 = str9;
        String str10 = list6;
        zzaee zzaee = str10;
        String str11 = zzaee;
        Bundle bundle = str11;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        int i4 = 0;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            switch (SupportMenu.USER_MASK & readInt) {
                case 1:
                    i = zzbek.zzg(parcel2, readInt);
                    break;
                case 2:
                    str = zzbek.zzq(parcel2, readInt);
                    break;
                case 3:
                    str2 = zzbek.zzq(parcel2, readInt);
                    break;
                case 4:
                    list = zzbek.zzac(parcel2, readInt);
                    break;
                case 5:
                    i2 = zzbek.zzg(parcel2, readInt);
                    break;
                case 6:
                    list2 = zzbek.zzac(parcel2, readInt);
                    break;
                case 7:
                    j = zzbek.zzi(parcel2, readInt);
                    break;
                case 8:
                    z = zzbek.zzc(parcel2, readInt);
                    break;
                case 9:
                    j2 = zzbek.zzi(parcel2, readInt);
                    break;
                case 10:
                    list3 = zzbek.zzac(parcel2, readInt);
                    break;
                case 11:
                    j3 = zzbek.zzi(parcel2, readInt);
                    break;
                case 12:
                    i3 = zzbek.zzg(parcel2, readInt);
                    break;
                case 13:
                    str3 = zzbek.zzq(parcel2, readInt);
                    break;
                case 14:
                    j4 = zzbek.zzi(parcel2, readInt);
                    break;
                case 15:
                    str4 = zzbek.zzq(parcel2, readInt);
                    break;
                case 18:
                    z2 = zzbek.zzc(parcel2, readInt);
                    break;
                case 19:
                    str5 = zzbek.zzq(parcel2, readInt);
                    break;
                case 21:
                    str6 = zzbek.zzq(parcel2, readInt);
                    break;
                case 22:
                    z3 = zzbek.zzc(parcel2, readInt);
                    break;
                case 23:
                    z4 = zzbek.zzc(parcel2, readInt);
                    break;
                case 24:
                    z5 = zzbek.zzc(parcel2, readInt);
                    break;
                case 25:
                    z6 = zzbek.zzc(parcel2, readInt);
                    break;
                case 26:
                    z7 = zzbek.zzc(parcel2, readInt);
                    break;
                case 28:
                    zzaap = (zzaap) zzbek.zza(parcel2, readInt, zzaap.CREATOR);
                    break;
                case 29:
                    str7 = zzbek.zzq(parcel2, readInt);
                    break;
                case 30:
                    str8 = zzbek.zzq(parcel2, readInt);
                    break;
                case 31:
                    z8 = zzbek.zzc(parcel2, readInt);
                    break;
                case 32:
                    z9 = zzbek.zzc(parcel2, readInt);
                    break;
                case 33:
                    zzadw = (zzadw) zzbek.zza(parcel2, readInt, zzadw.CREATOR);
                    break;
                case 34:
                    list4 = zzbek.zzac(parcel2, readInt);
                    break;
                case 35:
                    list5 = zzbek.zzac(parcel2, readInt);
                    break;
                case 36:
                    z10 = zzbek.zzc(parcel2, readInt);
                    break;
                case 37:
                    zzaaf = (zzaaf) zzbek.zza(parcel2, readInt, zzaaf.CREATOR);
                    break;
                case 38:
                    z11 = zzbek.zzc(parcel2, readInt);
                    break;
                case 39:
                    str9 = zzbek.zzq(parcel2, readInt);
                    break;
                case 40:
                    list6 = zzbek.zzac(parcel2, readInt);
                    break;
                case 42:
                    z12 = zzbek.zzc(parcel2, readInt);
                    break;
                case 43:
                    str10 = zzbek.zzq(parcel2, readInt);
                    break;
                case 44:
                    zzaee = (zzaee) zzbek.zza(parcel2, readInt, zzaee.CREATOR);
                    break;
                case 45:
                    str11 = zzbek.zzq(parcel2, readInt);
                    break;
                case 46:
                    z13 = zzbek.zzc(parcel2, readInt);
                    break;
                case 47:
                    z14 = zzbek.zzc(parcel2, readInt);
                    break;
                case 48:
                    bundle = zzbek.zzs(parcel2, readInt);
                    break;
                case 49:
                    z15 = zzbek.zzc(parcel2, readInt);
                    break;
                case 50:
                    i4 = zzbek.zzg(parcel2, readInt);
                    break;
                default:
                    zzbek.zzb(parcel2, readInt);
                    break;
            }
        }
        zzbek.zzaf(parcel2, zzd);
        return new zzaad(i, str, str2, list, i2, list2, j, z, j2, list3, j3, i3, str3, j4, str4, z2, str5, str6, z3, z4, z5, z6, z7, zzaap, str7, str8, z8, z9, zzadw, list4, list5, z10, zzaaf, z11, str9, list6, z12, str10, zzaee, str11, z13, z14, bundle, z15, i4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaad[i];
    }
}
