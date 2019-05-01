package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.zzt;
import java.util.Map;

public final class zzabc implements zzt<Object> {
    public final void zza(Object obj, Map<String, String> map) {
        String str = (String) map.get("request_id");
        String str2 = "Invalid request: ";
        String valueOf = String.valueOf((String) map.get("errors"));
        zzaiw.zzco(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        zzaau.zzcot.zzas(str);
    }
}
