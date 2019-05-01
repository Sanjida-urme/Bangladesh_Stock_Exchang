package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.zzt;
import java.lang.ref.WeakReference;
import java.util.Map;

public final class zzof implements zzt<Object> {
    private final WeakReference<zzob> zzaow;
    private final String zzaqr;

    public zzof(zzob zzob, String str) {
        this.zzaow = new WeakReference(zzob);
        this.zzaqr = str;
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = (String) map.get("ads_id");
        String str2 = (String) map.get("eventName");
        if (!TextUtils.isEmpty(str) && this.zzaqr.equals(str)) {
            try {
                Integer.parseInt((String) map.get("eventType"));
            } catch (Throwable e) {
                zzaiw.zzb("Parse Scion log event type error", e);
            }
            zzob zzob;
            if ("_ai".equals(str2)) {
                zzob = (zzob) this.zzaow.get();
                if (zzob != null) {
                    zzob.zzbt();
                }
                return;
            }
            if ("_ac".equals(str2)) {
                zzob = (zzob) this.zzaow.get();
                if (zzob != null) {
                    zzob.zzbu();
                }
            }
        }
    }
}
