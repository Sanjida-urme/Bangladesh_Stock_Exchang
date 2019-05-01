package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.google.android.gms.ads.internal.zzbs;
import org.json.JSONObject;

@zzzb
public abstract class zzmg<T> {
    private final int zzbfn;
    private final String zzbfo;
    private final T zzbfp;

    private zzmg(int i, String str, T t) {
        this.zzbfn = i;
        this.zzbfo = str;
        this.zzbfp = t;
        zzbs.zzeo().zza(this);
    }

    public static zzmg<String> zza(int i, String str) {
        zzmg<String> zza = zza(i, str, null);
        zzbs.zzeo().zzb(zza);
        return zza;
    }

    public static zzmg<Float> zza(int i, String str, float f) {
        return new zzmk(i, str, Float.valueOf(0.0f));
    }

    public static zzmg<Integer> zza(int i, String str, int i2) {
        return new zzmi(i, str, Integer.valueOf(i2));
    }

    public static zzmg<Long> zza(int i, String str, long j) {
        return new zzmj(i, str, Long.valueOf(j));
    }

    public static zzmg<Boolean> zza(int i, String str, Boolean bool) {
        return new zzmh(i, str, bool);
    }

    public static zzmg<String> zza(int i, String str, String str2) {
        return new zzml(i, str, str2);
    }

    public static zzmg<String> zzb(int i, String str) {
        zzmg<String> zza = zza(i, str, null);
        zzbs.zzeo().zzc(zza);
        return zza;
    }

    public final String getKey() {
        return this.zzbfo;
    }

    public final int getSource() {
        return this.zzbfn;
    }

    protected abstract T zza(SharedPreferences sharedPreferences);

    public abstract void zza(Editor editor, T t);

    protected abstract T zzc(JSONObject jSONObject);

    public final T zzip() {
        return this.zzbfp;
    }
}
