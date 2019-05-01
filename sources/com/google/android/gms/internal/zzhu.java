package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.zzbs;
import java.util.List;

@zzzb
public final class zzhu extends zzbej {
    public static final Creator<zzhu> CREATOR = new zzhv();
    @Nullable
    public final String url;
    private long zzbag;
    private String zzbah;
    private String zzbai;
    private String zzbaj;
    private Bundle zzbak;
    private boolean zzbal;
    private long zzbam;

    zzhu(@Nullable String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z, long j2) {
        this.url = str;
        this.zzbag = j;
        if (str2 == null) {
            str2 = "";
        }
        this.zzbah = str2;
        if (str3 == null) {
            str3 = "";
        }
        this.zzbai = str3;
        if (str4 == null) {
            str4 = "";
        }
        this.zzbaj = str4;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.zzbak = bundle;
        this.zzbal = z;
        this.zzbam = j2;
    }

    @Nullable
    public static zzhu zzaa(String str) {
        return zzd(Uri.parse(str));
    }

    @Nullable
    public static zzhu zzd(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder stringBuilder = new StringBuilder(62);
                stringBuilder.append("Expected 2 path parts for namespace and id, found :");
                stringBuilder.append(size);
                zzaiw.zzco(stringBuilder.toString());
                return null;
            }
            String str = (String) pathSegments.get(0);
            String str2 = (String) pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean equals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long parseLong = queryParameter2 == null ? 0 : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : zzbs.zzee().zzg(uri)) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new zzhu(queryParameter, parseLong, host, str, str2, bundle, equals, 0);
        } catch (Throwable e) {
            zzaiw.zzc("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = zzbem.zze(parcel);
        zzbem.zza(parcel, 2, this.url, false);
        zzbem.zza(parcel, 3, this.zzbag);
        zzbem.zza(parcel, 4, this.zzbah, false);
        zzbem.zza(parcel, 5, this.zzbai, false);
        zzbem.zza(parcel, 6, this.zzbaj, false);
        zzbem.zza(parcel, 7, this.zzbak, false);
        zzbem.zza(parcel, 8, this.zzbal);
        zzbem.zza(parcel, 9, this.zzbam);
        zzbem.zzai(parcel, i);
    }
}
