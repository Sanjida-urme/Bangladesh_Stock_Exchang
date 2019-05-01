package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.internal.view.SupportMenu;

public final class zzqz implements Creator<zzqy> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int zzd = zzbek.zzd(parcel);
        String str = null;
        byte[] bArr = str;
        String[] strArr = bArr;
        String[] strArr2 = strArr;
        long j = 0;
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            switch (SupportMenu.USER_MASK & readInt) {
                case 1:
                    z = zzbek.zzc(parcel2, readInt);
                    break;
                case 2:
                    str = zzbek.zzq(parcel2, readInt);
                    break;
                case 3:
                    i = zzbek.zzg(parcel2, readInt);
                    break;
                case 4:
                    bArr = zzbek.zzt(parcel2, readInt);
                    break;
                case 5:
                    strArr = zzbek.zzaa(parcel2, readInt);
                    break;
                case 6:
                    strArr2 = zzbek.zzaa(parcel2, readInt);
                    break;
                case 7:
                    z2 = zzbek.zzc(parcel2, readInt);
                    break;
                case 8:
                    j = zzbek.zzi(parcel2, readInt);
                    break;
                default:
                    zzbek.zzb(parcel2, readInt);
                    break;
            }
        }
        zzbek.zzaf(parcel2, zzd);
        return new zzqy(z, str, i, bArr, strArr, strArr2, z2, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzqy[i];
    }
}
