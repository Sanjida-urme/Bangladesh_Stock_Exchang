package com.google.android.gms.internal;

import android.support.v4.util.SimpleArrayMap;
import android.view.View;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzzb
public final class zzyj implements zzxx<zznw> {
    private final boolean zzcjy;

    public zzyj(boolean z) {
        this.zzcjy = z;
    }

    private static <K, V> SimpleArrayMap<K, V> zza(SimpleArrayMap<K, Future<V>> simpleArrayMap) throws InterruptedException, ExecutionException {
        SimpleArrayMap<K, V> simpleArrayMap2 = new SimpleArrayMap();
        for (int i = 0; i < simpleArrayMap.size(); i++) {
            simpleArrayMap2.put(simpleArrayMap.keyAt(i), ((Future) simpleArrayMap.valueAt(i)).get());
        }
        return simpleArrayMap2;
    }

    public final /* synthetic */ zzoc zza(zzxr zzxr, JSONObject jSONObject) throws JSONException, InterruptedException, ExecutionException {
        View view;
        SimpleArrayMap simpleArrayMap = new SimpleArrayMap();
        SimpleArrayMap simpleArrayMap2 = new SimpleArrayMap();
        Future zzh = zzxr.zzh(jSONObject);
        zzajp zzc = zzxr.zzc(jSONObject, "video");
        JSONArray jSONArray = jSONObject.getJSONArray("custom_assets");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString("type");
            if ("string".equals(string)) {
                simpleArrayMap2.put(jSONObject2.getString("name"), jSONObject2.getString("string_value"));
            } else if ("image".equals(string)) {
                simpleArrayMap.put(jSONObject2.getString("name"), zzxr.zza(jSONObject2, "image_value", this.zzcjy));
            } else {
                String str = "Unknown custom asset type: ";
                string = String.valueOf(string);
                zzaiw.zzco(string.length() != 0 ? str.concat(string) : new String(str));
            }
        }
        zzama zzb = zzxr.zzb(zzc);
        String string2 = jSONObject.getString("custom_template_id");
        SimpleArrayMap zza = zza(simpleArrayMap);
        zznp zznp = (zznp) zzh.get();
        zzku zzrx = zzb != null ? zzb.zzrx() : null;
        if (zzb == null) {
            view = null;
        } else if (zzb == null) {
            throw null;
        } else {
            view = (View) zzb;
        }
        return new zznw(string2, zza, simpleArrayMap2, zznp, zzrx, view);
    }
}
