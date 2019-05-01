package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@zzzb
public final class zzabd extends zzbej {
    public static final Creator<zzabd> CREATOR = new zzabe();
    String zzbrb;

    public zzabd(String str) {
        this.zzbrb = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = zzbem.zze(parcel);
        zzbem.zza(parcel, 2, this.zzbrb, false);
        zzbem.zzai(parcel, i);
    }
}
