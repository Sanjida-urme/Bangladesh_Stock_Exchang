package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Map;
import java.util.Map.Entry;

@zzzb
public final class zzqw extends zzbej {
    public static final Creator<zzqw> CREATOR = new zzqx();
    private String url;
    private String[] zzbwu;
    private String[] zzbwv;

    zzqw(String str, String[] strArr, String[] strArr2) {
        this.url = str;
        this.zzbwu = strArr;
        this.zzbwv = strArr2;
    }

    public static zzqw zze(zzp zzp) throws zza {
        Map headers = zzp.getHeaders();
        int size = headers.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        for (Entry entry : headers.entrySet()) {
            strArr[i] = (String) entry.getKey();
            strArr2[i] = (String) entry.getValue();
            i++;
        }
        return new zzqw(zzp.getUrl(), strArr, strArr2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = zzbem.zze(parcel);
        zzbem.zza(parcel, 1, this.url, false);
        zzbem.zza(parcel, 2, this.zzbwu, false);
        zzbem.zza(parcel, 3, this.zzbwv, false);
        zzbem.zzai(parcel, i);
    }
}
