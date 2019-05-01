package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@zzzb
public final class zzadb extends zzbej {
    public static final Creator<zzadb> CREATOR = new zzadc();
    public final String zzatb;
    public final zzis zzclo;

    public zzadb(zzis zzis, String str) {
        this.zzclo = zzis;
        this.zzatb = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int zze = zzbem.zze(parcel);
        zzbem.zza(parcel, 2, this.zzclo, i, false);
        zzbem.zza(parcel, 3, this.zzatb, false);
        zzbem.zzai(parcel, zze);
    }
}
