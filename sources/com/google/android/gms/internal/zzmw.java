package com.google.android.gms.internal;

import android.support.annotation.Nullable;

@zzzb
public final class zzmw {
    public static boolean zza(@Nullable zznd zznd, @Nullable zznb zznb, String... strArr) {
        if (zznd != null) {
            if (zznb != null) {
                return zznd.zza(zznb, strArr);
            }
        }
        return false;
    }

    @Nullable
    public static zznb zzb(@Nullable zznd zznd) {
        return zznd == null ? null : zznd.zziz();
    }
}
