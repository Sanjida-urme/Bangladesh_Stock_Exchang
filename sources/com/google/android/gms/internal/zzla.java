package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@zzzb
public final class zzla extends zzbej {
    public static final Creator<zzla> CREATOR = new zzlb();
    public final int zzbee;

    public zzla(int i) {
        this.zzbee = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = zzbem.zze(parcel);
        zzbem.zzc(parcel, 2, this.zzbee);
        zzbem.zzai(parcel, i);
    }
}
