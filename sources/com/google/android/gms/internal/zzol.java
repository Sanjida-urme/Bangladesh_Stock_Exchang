package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.zzt;
import java.util.Map;
import org.json.JSONObject;

final class zzol implements zzt<Object> {
    private /* synthetic */ zzyg zzbtf;
    private /* synthetic */ zzog zzbtg;

    zzol(zzog zzog, zzyg zzyg) {
        this.zzbtg = zzog;
        this.zzbtf = zzyg;
    }

    public final void zza(Object obj, Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : map.keySet()) {
                jSONObject.put(str, map.get(str));
            }
            jSONObject.put("id", this.zzbtg.zzbte);
            this.zzbtf.zza("sendMessageToNativeJs", jSONObject);
        } catch (Throwable e) {
            zzaiw.zzb("Unable to dispatch sendMessageToNativeJs event", e);
        }
    }
}
