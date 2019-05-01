package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.internal.view.SupportMenu;
import com.google.android.gms.internal.zzbek;

public final class zzg implements Creator<Status> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int zzd = zzbek.zzd(parcel);
        int i = 0;
        String str = null;
        PendingIntent pendingIntent = str;
        int i2 = 0;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            int i3 = SupportMenu.USER_MASK & readInt;
            if (i3 != 1000) {
                switch (i3) {
                    case 1:
                        i2 = zzbek.zzg(parcel, readInt);
                        break;
                    case 2:
                        str = zzbek.zzq(parcel, readInt);
                        break;
                    case 3:
                        pendingIntent = (PendingIntent) zzbek.zza(parcel, readInt, PendingIntent.CREATOR);
                        break;
                    default:
                        zzbek.zzb(parcel, readInt);
                        break;
                }
            }
            i = zzbek.zzg(parcel, readInt);
        }
        zzbek.zzaf(parcel, zzd);
        return new Status(i, i2, str, pendingIntent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
