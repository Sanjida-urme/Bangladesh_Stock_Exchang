package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.internal.view.SupportMenu;
import com.google.android.gms.ads.internal.zzao;
import com.google.android.gms.internal.zzaiy;
import com.google.android.gms.internal.zzbek;

public final class zzm implements Creator<AdOverlayInfoParcel> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int zzd = zzbek.zzd(parcel);
        zzc zzc = null;
        IBinder iBinder = zzc;
        IBinder iBinder2 = iBinder;
        IBinder iBinder3 = iBinder2;
        IBinder iBinder4 = iBinder3;
        String str = iBinder4;
        String str2 = str;
        IBinder iBinder5 = str2;
        String str3 = iBinder5;
        zzaiy zzaiy = str3;
        String str4 = zzaiy;
        zzao zzao = str4;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            switch (SupportMenu.USER_MASK & readInt) {
                case 2:
                    zzc = (zzc) zzbek.zza(parcel2, readInt, zzc.CREATOR);
                    break;
                case 3:
                    iBinder = zzbek.zzr(parcel2, readInt);
                    break;
                case 4:
                    iBinder2 = zzbek.zzr(parcel2, readInt);
                    break;
                case 5:
                    iBinder3 = zzbek.zzr(parcel2, readInt);
                    break;
                case 6:
                    iBinder4 = zzbek.zzr(parcel2, readInt);
                    break;
                case 7:
                    str = zzbek.zzq(parcel2, readInt);
                    break;
                case 8:
                    z = zzbek.zzc(parcel2, readInt);
                    break;
                case 9:
                    str2 = zzbek.zzq(parcel2, readInt);
                    break;
                case 10:
                    iBinder5 = zzbek.zzr(parcel2, readInt);
                    break;
                case 11:
                    i = zzbek.zzg(parcel2, readInt);
                    break;
                case 12:
                    i2 = zzbek.zzg(parcel2, readInt);
                    break;
                case 13:
                    str3 = zzbek.zzq(parcel2, readInt);
                    break;
                case 14:
                    zzaiy = (zzaiy) zzbek.zza(parcel2, readInt, zzaiy.CREATOR);
                    break;
                case 16:
                    str4 = zzbek.zzq(parcel2, readInt);
                    break;
                case 17:
                    zzao = (zzao) zzbek.zza(parcel2, readInt, zzao.CREATOR);
                    break;
                default:
                    zzbek.zzb(parcel2, readInt);
                    break;
            }
        }
        zzbek.zzaf(parcel2, zzd);
        return new AdOverlayInfoParcel(zzc, iBinder, iBinder2, iBinder3, iBinder4, str, z, str2, iBinder5, i, i2, str3, zzaiy, str4, zzao);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AdOverlayInfoParcel[i];
    }
}
