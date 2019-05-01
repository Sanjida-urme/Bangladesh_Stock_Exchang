package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.internal.view.SupportMenu;
import java.util.List;

public final class zzaat implements Creator<zzaas> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int zzd = zzbek.zzd(parcel);
        Bundle bundle = null;
        zzaiy zzaiy = bundle;
        ApplicationInfo applicationInfo = zzaiy;
        String str = applicationInfo;
        List list = str;
        PackageInfo packageInfo = list;
        String str2 = packageInfo;
        boolean z = false;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            switch (SupportMenu.USER_MASK & readInt) {
                case 1:
                    bundle = zzbek.zzs(parcel, readInt);
                    break;
                case 2:
                    zzaiy = (zzaiy) zzbek.zza(parcel, readInt, zzaiy.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) zzbek.zza(parcel, readInt, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str = zzbek.zzq(parcel, readInt);
                    break;
                case 5:
                    list = zzbek.zzac(parcel, readInt);
                    break;
                case 6:
                    packageInfo = (PackageInfo) zzbek.zza(parcel, readInt, PackageInfo.CREATOR);
                    break;
                case 7:
                    str2 = zzbek.zzq(parcel, readInt);
                    break;
                case 8:
                    z = zzbek.zzc(parcel, readInt);
                    break;
                default:
                    zzbek.zzb(parcel, readInt);
                    break;
            }
        }
        zzbek.zzaf(parcel, zzd);
        return new zzaas(bundle, zzaiy, applicationInfo, str, list, packageInfo, str2, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaas[i];
    }
}
