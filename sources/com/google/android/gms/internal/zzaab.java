package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.internal.view.SupportMenu;
import java.util.List;

public final class zzaab implements Creator<zzzz> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int zzd = zzbek.zzd(parcel);
        long j = 0;
        long j2 = j;
        Bundle bundle = null;
        zzis zzis = bundle;
        zziw zziw = zzis;
        String str = zziw;
        ApplicationInfo applicationInfo = str;
        PackageInfo packageInfo = applicationInfo;
        String str2 = packageInfo;
        String str3 = str2;
        String str4 = str3;
        zzaiy zzaiy = str4;
        Bundle bundle2 = zzaiy;
        List list = bundle2;
        Bundle bundle3 = list;
        String str5 = bundle3;
        String str6 = str5;
        List list2 = str6;
        String str7 = list2;
        zzom zzom = str7;
        List list3 = zzom;
        String str8 = list3;
        String str9 = str8;
        String str10 = str9;
        Bundle bundle4 = str10;
        String str11 = bundle4;
        zzla zzla = str11;
        Bundle bundle5 = zzla;
        String str12 = bundle5;
        String str13 = str12;
        String str14 = str13;
        List list4 = str14;
        String str15 = list4;
        List list5 = str15;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i7 = 0;
        boolean z6 = false;
        boolean z7 = false;
        int i8 = 0;
        boolean z8 = false;
        boolean z9 = false;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            switch (SupportMenu.USER_MASK & readInt) {
                case 1:
                    i = zzbek.zzg(parcel2, readInt);
                    break;
                case 2:
                    bundle = zzbek.zzs(parcel2, readInt);
                    break;
                case 3:
                    zzis = (zzis) zzbek.zza(parcel2, readInt, zzis.CREATOR);
                    break;
                case 4:
                    zziw = (zziw) zzbek.zza(parcel2, readInt, zziw.CREATOR);
                    break;
                case 5:
                    str = zzbek.zzq(parcel2, readInt);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) zzbek.zza(parcel2, readInt, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) zzbek.zza(parcel2, readInt, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = zzbek.zzq(parcel2, readInt);
                    break;
                case 9:
                    str3 = zzbek.zzq(parcel2, readInt);
                    break;
                case 10:
                    str4 = zzbek.zzq(parcel2, readInt);
                    break;
                case 11:
                    zzaiy = (zzaiy) zzbek.zza(parcel2, readInt, zzaiy.CREATOR);
                    break;
                case 12:
                    bundle2 = zzbek.zzs(parcel2, readInt);
                    break;
                case 13:
                    i2 = zzbek.zzg(parcel2, readInt);
                    break;
                case 14:
                    list = zzbek.zzac(parcel2, readInt);
                    break;
                case 15:
                    bundle3 = zzbek.zzs(parcel2, readInt);
                    break;
                case 16:
                    z = zzbek.zzc(parcel2, readInt);
                    break;
                case 18:
                    i3 = zzbek.zzg(parcel2, readInt);
                    break;
                case 19:
                    i4 = zzbek.zzg(parcel2, readInt);
                    break;
                case 20:
                    f = zzbek.zzl(parcel2, readInt);
                    break;
                case 21:
                    str5 = zzbek.zzq(parcel2, readInt);
                    break;
                case 25:
                    j = zzbek.zzi(parcel2, readInt);
                    break;
                case 26:
                    str6 = zzbek.zzq(parcel2, readInt);
                    break;
                case 27:
                    list2 = zzbek.zzac(parcel2, readInt);
                    break;
                case 28:
                    str7 = zzbek.zzq(parcel2, readInt);
                    break;
                case 29:
                    zzom = (zzom) zzbek.zza(parcel2, readInt, zzom.CREATOR);
                    break;
                case 30:
                    list3 = zzbek.zzac(parcel2, readInt);
                    break;
                case 31:
                    j2 = zzbek.zzi(parcel2, readInt);
                    break;
                case 33:
                    str8 = zzbek.zzq(parcel2, readInt);
                    break;
                case 34:
                    f2 = zzbek.zzl(parcel2, readInt);
                    break;
                case 35:
                    i5 = zzbek.zzg(parcel2, readInt);
                    break;
                case 36:
                    i6 = zzbek.zzg(parcel2, readInt);
                    break;
                case 37:
                    z3 = zzbek.zzc(parcel2, readInt);
                    break;
                case 38:
                    z4 = zzbek.zzc(parcel2, readInt);
                    break;
                case 39:
                    str9 = zzbek.zzq(parcel2, readInt);
                    break;
                case 40:
                    z2 = zzbek.zzc(parcel2, readInt);
                    break;
                case 41:
                    str10 = zzbek.zzq(parcel2, readInt);
                    break;
                case 42:
                    z5 = zzbek.zzc(parcel2, readInt);
                    break;
                case 43:
                    i7 = zzbek.zzg(parcel2, readInt);
                    break;
                case 44:
                    bundle4 = zzbek.zzs(parcel2, readInt);
                    break;
                case 45:
                    str11 = zzbek.zzq(parcel2, readInt);
                    break;
                case 46:
                    zzla = (zzla) zzbek.zza(parcel2, readInt, zzla.CREATOR);
                    break;
                case 47:
                    z6 = zzbek.zzc(parcel2, readInt);
                    break;
                case 48:
                    bundle5 = zzbek.zzs(parcel2, readInt);
                    break;
                case 49:
                    str12 = zzbek.zzq(parcel2, readInt);
                    break;
                case 50:
                    str13 = zzbek.zzq(parcel2, readInt);
                    break;
                case 51:
                    str14 = zzbek.zzq(parcel2, readInt);
                    break;
                case 52:
                    z7 = zzbek.zzc(parcel2, readInt);
                    break;
                case 53:
                    list4 = zzbek.zzab(parcel2, readInt);
                    break;
                case 54:
                    str15 = zzbek.zzq(parcel2, readInt);
                    break;
                case 55:
                    list5 = zzbek.zzac(parcel2, readInt);
                    break;
                case 56:
                    i8 = zzbek.zzg(parcel2, readInt);
                    break;
                case 57:
                    z8 = zzbek.zzc(parcel2, readInt);
                    break;
                case 58:
                    z9 = zzbek.zzc(parcel2, readInt);
                    break;
                default:
                    zzbek.zzb(parcel2, readInt);
                    break;
            }
        }
        zzbek.zzaf(parcel2, zzd);
        return new zzzz(i, bundle, zzis, zziw, str, applicationInfo, packageInfo, str2, str3, str4, zzaiy, bundle2, i2, list, bundle3, z, i3, i4, f, str5, j, str6, list2, str7, zzom, list3, j2, str8, f2, z2, i5, i6, z3, z4, str9, str10, z5, i7, bundle4, str11, zzla, z6, bundle5, str12, str13, str14, z7, list4, str15, list5, i8, z8, z9);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzzz[i];
    }
}
