package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

final class zzmi extends zzmg<Integer> {
    zzmi(int i, String str, Integer num) {
        super(i, str, num);
    }

    public final /* synthetic */ Object zza(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(getKey(), ((Integer) zzip()).intValue()));
    }

    public final /* synthetic */ void zza(Editor editor, Object obj) {
        editor.putInt(getKey(), ((Integer) obj).intValue());
    }

    public final /* synthetic */ Object zzc(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(getKey(), ((Integer) zzip()).intValue()));
    }
}
