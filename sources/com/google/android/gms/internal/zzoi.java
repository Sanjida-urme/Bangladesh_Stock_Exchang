package com.google.android.gms.internal;

import java.util.Map;
import org.json.JSONObject;

final class zzoi implements zzamf {
    private /* synthetic */ Map zzbth;
    private /* synthetic */ zzoh zzbti;

    zzoi(zzoh zzoh, Map map) {
        this.zzbti = zzoh;
        this.zzbth = map;
    }

    public final void zza(zzama zzama, boolean z) {
        this.zzbti.zzbtg.zzbte = (String) this.zzbth.get("id");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("messageType", "htmlLoaded");
            jSONObject.put("id", this.zzbti.zzbtg.zzbte);
            this.zzbti.zzbtf.zza("sendMessageToNativeJs", jSONObject);
        } catch (Throwable e) {
            zzaiw.zzb("Unable to dispatch sendMessageToNativeJs event", e);
        }
    }
}
