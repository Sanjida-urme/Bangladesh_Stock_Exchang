package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.search.SearchAdRequest;

@zzzb
public final class zzlw extends zzbej {
    public static final Creator<zzlw> CREATOR = new zzlx();
    public final String zzbfj;

    public zzlw(SearchAdRequest searchAdRequest) {
        this.zzbfj = searchAdRequest.getQuery();
    }

    zzlw(String str) {
        this.zzbfj = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = zzbem.zze(parcel);
        zzbem.zza(parcel, 15, this.zzbfj, false);
        zzbem.zzai(parcel, i);
    }
}
