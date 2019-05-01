package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.zzaiw;
import com.google.android.gms.internal.zzzb;
import java.util.Map;

@zzzb
public final class zza implements zzt<Object> {
    private final zzb zzbva;

    public zza(zzb zzb) {
        this.zzbva = zzb;
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = (String) map.get("name");
        if (str == null) {
            zzaiw.zzco("App event with no name parameter.");
        } else {
            this.zzbva.onAppEvent(str, (String) map.get("info"));
        }
    }
}
