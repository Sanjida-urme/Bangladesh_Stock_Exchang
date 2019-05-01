package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.google.android.gms.internal.zzadw;
import com.google.android.gms.internal.zzaiw;
import com.google.android.gms.internal.zzzb;
import java.util.Map;

@zzzb
public final class zzaf implements zzt<Object> {
    private final zzag zzbwt;

    public zzaf(zzag zzag) {
        this.zzbwt = zzag;
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = (String) map.get("action");
        if ("grant".equals(str)) {
            zzadw zzadw = null;
            try {
                int parseInt = Integer.parseInt((String) map.get("amount"));
                String str2 = (String) map.get("type");
                if (!TextUtils.isEmpty(str2)) {
                    zzadw = new zzadw(str2, parseInt);
                }
            } catch (Throwable e) {
                zzaiw.zzc("Unable to parse reward amount.", e);
            }
            this.zzbwt.zzb(zzadw);
            return;
        }
        if ("video_start".equals(str)) {
            this.zzbwt.zzdf();
        }
    }
}
