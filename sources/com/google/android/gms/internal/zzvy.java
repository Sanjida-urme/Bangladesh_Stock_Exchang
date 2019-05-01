package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbs;
import java.util.Map;

@zzzb
public final class zzvy {
    private final zzama zzbwq;
    private final boolean zzcfk;
    private final String zzcfl;

    public zzvy(zzama zzama, Map<String, String> map) {
        this.zzbwq = zzama;
        this.zzcfl = (String) map.get("forceOrientation");
        this.zzcfk = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
    }

    public final void execute() {
        if (this.zzbwq == null) {
            zzaiw.zzco("AdWebView is null");
            return;
        }
        int zzqa = "portrait".equalsIgnoreCase(this.zzcfl) ? zzbs.zzee().zzqa() : "landscape".equalsIgnoreCase(this.zzcfl) ? zzbs.zzee().zzpz() : this.zzcfk ? -1 : zzbs.zzee().zzqb();
        this.zzbwq.setRequestedOrientation(zzqa);
    }
}
