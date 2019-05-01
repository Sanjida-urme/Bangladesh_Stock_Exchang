package com.google.android.gms.internal;

import java.io.ByteArrayInputStream;
import org.json.JSONObject;

final /* synthetic */ class zzta implements zzsw {
    static final zzsw zzcao = new zzta();

    private zzta() {
    }

    public final Object zzf(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(zzsz.UTF_8));
    }
}
