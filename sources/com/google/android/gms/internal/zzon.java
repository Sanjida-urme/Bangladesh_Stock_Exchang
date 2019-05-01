package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.internal.view.SupportMenu;

public final class zzon implements Creator<zzom> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int zzd = zzbek.zzd(parcel);
        zzma zzma = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            switch (SupportMenu.USER_MASK & readInt) {
                case 1:
                    i = zzbek.zzg(parcel, readInt);
                    break;
                case 2:
                    z = zzbek.zzc(parcel, readInt);
                    break;
                case 3:
                    i2 = zzbek.zzg(parcel, readInt);
                    break;
                case 4:
                    z2 = zzbek.zzc(parcel, readInt);
                    break;
                case 5:
                    i3 = zzbek.zzg(parcel, readInt);
                    break;
                case 6:
                    zzma = (zzma) zzbek.zza(parcel, readInt, zzma.CREATOR);
                    break;
                default:
                    zzbek.zzb(parcel, readInt);
                    break;
            }
        }
        zzbek.zzaf(parcel, zzd);
        return new zzom(i, z, i2, z2, i3, zzma);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzom[i];
    }
}
