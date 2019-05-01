package com.google.android.gms.internal;

import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

@zzzb
public final class zzaey {
    private String mAppId;
    private final long zzcwq;
    private final List<String> zzcwr = new ArrayList();
    private final List<String> zzcws = new ArrayList();
    private final Map<String, zztn> zzcwt = new HashMap();
    private String zzcwu;
    private boolean zzcwv = false;

    public zzaey(String str, long j) {
        this.zzcwu = str;
        this.zzcwq = j;
        zzby(str);
    }

    private final void zzby(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int i = 0;
                if (jSONObject.optInt(NotificationCompat.CATEGORY_STATUS, -1) != 1) {
                    this.zzcwv = false;
                    zzaiw.zzco("App settings could not be fetched successfully.");
                    return;
                }
                this.zzcwv = true;
                this.mAppId = jSONObject.optString("app_id");
                JSONArray optJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    while (i < optJSONArray.length()) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        String optString = jSONObject2.optString("format");
                        CharSequence optString2 = jSONObject2.optString("ad_unit_id");
                        if (!TextUtils.isEmpty(optString)) {
                            if (!TextUtils.isEmpty(optString2)) {
                                if ("interstitial".equalsIgnoreCase(optString)) {
                                    this.zzcws.add(optString2);
                                } else if ("rewarded".equalsIgnoreCase(optString)) {
                                    jSONObject2 = jSONObject2.optJSONObject("mediation_config");
                                    if (jSONObject2 != null) {
                                        this.zzcwt.put(optString2, new zztn(jSONObject2));
                                    }
                                }
                            }
                        }
                        i++;
                    }
                }
                zzp(jSONObject);
            } catch (Throwable e) {
                zzaiw.zzc("Exception occurred while processing app setting json", e);
                zzbs.zzeg().zza(e, "AppSettings.parseAppSettingsJson");
            }
        }
    }

    private final void zzp(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("persistable_banner_ad_unit_ids");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                this.zzcwr.add(optJSONArray.optString(i));
            }
        }
    }

    public final String getAppId() {
        return this.mAppId;
    }

    public final long zzoo() {
        return this.zzcwq;
    }

    public final boolean zzop() {
        return this.zzcwv;
    }

    public final String zzoq() {
        return this.zzcwu;
    }

    public final Map<String, zztn> zzor() {
        return this.zzcwt;
    }
}
