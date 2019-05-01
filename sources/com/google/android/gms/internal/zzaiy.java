package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.zzo;

@zzzb
public final class zzaiy extends zzbej {
    public static final Creator<zzaiy> CREATOR = new zzaiz();
    public String zzcp;
    public int zzdbz;
    public int zzdca;
    public boolean zzdcb;
    public boolean zzdcc;

    public zzaiy(int i, int i2, boolean z) {
        this(i, i2, z, false, false);
    }

    public zzaiy(int i, int i2, boolean z, boolean z2) {
        this((int) zzo.GOOGLE_PLAY_SERVICES_VERSION_CODE, i2, true, false, z2);
    }

    private zzaiy(int i, int i2, boolean z, boolean z2, boolean z3) {
        String str = "afma-sdk-a-v";
        String str2 = z ? "0" : "1";
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 24) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append(i);
        stringBuilder.append(".");
        stringBuilder.append(i2);
        stringBuilder.append(".");
        stringBuilder.append(str2);
        this(stringBuilder.toString(), i, i2, z, z3);
    }

    zzaiy(String str, int i, int i2, boolean z, boolean z2) {
        this.zzcp = str;
        this.zzdbz = i;
        this.zzdca = i2;
        this.zzdcb = z;
        this.zzdcc = z2;
    }

    public static zzaiy zzqv() {
        return new zzaiy(11717208, 11717208, true);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = zzbem.zze(parcel);
        zzbem.zza(parcel, 2, this.zzcp, false);
        zzbem.zzc(parcel, 3, this.zzdbz);
        zzbem.zzc(parcel, 4, this.zzdca);
        zzbem.zza(parcel, 5, this.zzdcb);
        zzbem.zza(parcel, 6, this.zzdcc);
        zzbem.zzai(parcel, i);
    }
}
