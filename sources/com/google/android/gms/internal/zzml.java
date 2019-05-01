package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

final class zzml extends zzmg<String> {
    zzml(int i, String str, String str2) {
        super(i, str, str2);
    }

    public final /* synthetic */ Object zza(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(getKey(), (String) zzip());
    }

    public final /* synthetic */ void zza(Editor editor, Object obj) {
        editor.putString(getKey(), (String) obj);
    }

    public final /* synthetic */ Object zzc(JSONObject jSONObject) {
        return jSONObject.optString(getKey(), (String) zzip());
    }
}
