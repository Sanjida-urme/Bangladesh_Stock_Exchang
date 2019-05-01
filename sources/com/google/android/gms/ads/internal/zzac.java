package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.internal.zzaey;
import com.google.android.gms.internal.zzaiw;
import com.google.android.gms.internal.zzaiy;
import com.google.android.gms.internal.zzaje;
import com.google.android.gms.internal.zzajg;
import com.google.android.gms.internal.zzajp;
import com.google.android.gms.internal.zzaju;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.internal.zzsu;
import com.google.android.gms.internal.zzsz;
import com.google.android.gms.internal.zzzb;
import org.json.JSONObject;

@zzzb
public final class zzac {
    private Context mContext;
    private final Object mLock = new Object();
    private long zzaod = 0;

    final /* synthetic */ zzajp zza(JSONObject jSONObject) throws Exception {
        if (!jSONObject.optBoolean("isSuccessful", false)) {
            return zzajg.zzi(null);
        }
        return zzbs.zzeg().zzk(this.mContext, jSONObject.getString("appSettingsJson"));
    }

    public final void zza(Context context, zzaiy zzaiy, String str, @Nullable Runnable runnable) {
        zza(context, zzaiy, true, null, str, null, runnable);
    }

    final void zza(Context context, zzaiy zzaiy, boolean z, @Nullable zzaey zzaey, String str, @Nullable String str2, @Nullable Runnable runnable) {
        if (zzbs.zzei().elapsedRealtime() - this.zzaod < 5000) {
            zzaiw.zzco("Not retrying to fetch app settings");
            return;
        }
        this.zzaod = zzbs.zzei().elapsedRealtime();
        Object obj = 1;
        if (zzaey != null) {
            if ((zzbs.zzei().currentTimeMillis() - zzaey.zzoo() > ((Long) zzbs.zzep().zzd(zzmq.zzbns)).longValue() ? 1 : null) == null) {
                if (zzaey.zzop()) {
                    obj = null;
                }
            }
        }
        if (obj != null) {
            if (context == null) {
                zzaiw.zzco("Context not provided to fetch application settings");
            } else if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                zzaiw.zzco("App settings could not be fetched. Required parameters missing");
            } else {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                this.mContext = applicationContext;
                zzsu zza = zzbs.zzes().zzb(this.mContext, zzaiy).zza("google.afma.config.fetchAppSettings", zzsz.zzcam, zzsz.zzcam);
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.put("app_id", str);
                    } else if (!TextUtils.isEmpty(str2)) {
                        jSONObject.put("ad_unit_id", str2);
                    }
                    jSONObject.put("is_init", z);
                    jSONObject.put("pn", context.getPackageName());
                    zzajp zzg = zza.zzg(jSONObject);
                    zzajp zza2 = zzajg.zza(zzg, new zzad(this), zzaju.zzdcu);
                    if (runnable != null) {
                        zzg.zza(runnable, zzaju.zzdcu);
                    }
                    zzaje.zza(zza2, "ConfigLoader.maybeFetchNewAppSettings");
                } catch (Throwable e) {
                    zzaiw.zzb("Error requesting application settings", e);
                }
            }
        }
    }
}
