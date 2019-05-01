package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.internal.view.SupportMenu;
import com.google.android.gms.internal.zzbek;

public final class zzap implements Creator<zzao> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int zzd = zzbek.zzd(parcel);
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f = 0.0f;
        int i = 0;
        boolean z4 = false;
        boolean z5 = false;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            switch (SupportMenu.USER_MASK & readInt) {
                case 2:
                    z = zzbek.zzc(parcel, readInt);
                    break;
                case 3:
                    z2 = zzbek.zzc(parcel, readInt);
                    break;
                case 4:
                    str = zzbek.zzq(parcel, readInt);
                    break;
                case 5:
                    z3 = zzbek.zzc(parcel, readInt);
                    break;
                case 6:
                    f = zzbek.zzl(parcel, readInt);
                    break;
                case 7:
                    i = zzbek.zzg(parcel, readInt);
                    break;
                case 8:
                    z4 = zzbek.zzc(parcel, readInt);
                    break;
                case 9:
                    z5 = zzbek.zzc(parcel, readInt);
                    break;
                default:
                    zzbek.zzb(parcel, readInt);
                    break;
            }
        }
        zzbek.zzaf(parcel, zzd);
        return new zzao(z, z2, str, z3, f, i, z4, z5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzao[i];
    }
}
