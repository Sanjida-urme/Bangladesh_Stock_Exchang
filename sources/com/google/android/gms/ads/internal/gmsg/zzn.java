package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.zzaiw;
import java.util.Map;

final class zzn implements zzt<Object> {
    zzn() {
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = "Received log message: ";
        String valueOf = String.valueOf((String) map.get("string"));
        zzaiw.zzcn(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }
}
