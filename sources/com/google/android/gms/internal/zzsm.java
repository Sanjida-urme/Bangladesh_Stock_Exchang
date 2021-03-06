package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.ads.internal.zzp;
import java.util.Arrays;

@zzzb
final class zzsm {
    private final Object[] mParams;

    zzsm(zzis zzis, String str, int i) {
        this.mParams = zzp.zza((String) zzbs.zzep().zzd(zzmq.zzbki), zzis, str, i, null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzsm)) {
            return false;
        }
        return Arrays.equals(this.mParams, ((zzsm) obj).mParams);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.mParams);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.mParams);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(arrays).length() + 24);
        stringBuilder.append("[InterstitialAdPoolKey ");
        stringBuilder.append(arrays);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
