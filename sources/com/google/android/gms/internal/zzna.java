package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import android.text.TextUtils;

final class zzna extends zzmx {
    zzna() {
    }

    @Nullable
    private static String zzam(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int i = 0;
        int length = str.length();
        while (i < str.length() && str.charAt(i) == ',') {
            i++;
        }
        while (length > 0 && str.charAt(length - 1) == ',') {
            length--;
        }
        return (i == 0 && length == str.length()) ? str : str.substring(i, length);
    }

    public final String zze(@Nullable String str, String str2) {
        str = zzam(str);
        Object zzam = zzam(str2);
        if (TextUtils.isEmpty(str)) {
            return zzam;
        }
        if (TextUtils.isEmpty(zzam)) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(zzam).length());
        stringBuilder.append(str);
        stringBuilder.append(",");
        stringBuilder.append(zzam);
        return stringBuilder.toString();
    }
}
