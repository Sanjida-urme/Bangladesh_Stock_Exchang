package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.zzbs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzzb
public final class zztm {
    public final String zzcbb;
    public final String zzcbc;
    public final List<String> zzcbd;
    public final String zzcbe;
    public final String zzcbf;
    public final List<String> zzcbg;
    public final List<String> zzcbh;
    public final List<String> zzcbi;
    public final List<String> zzcbj;
    public final String zzcbk;
    public final List<String> zzcbl;
    public final List<String> zzcbm;
    @Nullable
    public final String zzcbn;
    @Nullable
    public final String zzcbo;
    public final String zzcbp;
    @Nullable
    public final List<String> zzcbq;
    public final String zzcbr;
    @Nullable
    private String zzcbs;

    public zztm(String str, String str2, List<String> list, String str3, String str4, List<String> list2, List<String> list3, List<String> list4, String str5, String str6, List<String> list5, List<String> list6, String str7, String str8, String str9, List<String> list7, String str10, List<String> list8, String str11) {
        this.zzcbb = str;
        this.zzcbc = null;
        this.zzcbd = list;
        this.zzcbe = null;
        this.zzcbf = null;
        this.zzcbg = list2;
        this.zzcbh = list3;
        this.zzcbi = list4;
        this.zzcbk = str5;
        this.zzcbl = list5;
        this.zzcbm = list6;
        this.zzcbn = null;
        this.zzcbo = null;
        this.zzcbp = null;
        this.zzcbq = null;
        this.zzcbr = null;
        this.zzcbj = list8;
        this.zzcbs = null;
    }

    public zztm(JSONObject jSONObject) throws JSONException {
        List zza;
        this.zzcbc = jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        List arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.zzcbd = Collections.unmodifiableList(arrayList);
        this.zzcbe = jSONObject.optString("allocation_id", null);
        zzbs.zzew();
        this.zzcbg = zztv.zza(jSONObject, "clickurl");
        zzbs.zzew();
        this.zzcbh = zztv.zza(jSONObject, "imp_urls");
        zzbs.zzew();
        this.zzcbj = zztv.zza(jSONObject, "fill_urls");
        zzbs.zzew();
        this.zzcbl = zztv.zza(jSONObject, "video_start_urls");
        zzbs.zzew();
        this.zzcbm = zztv.zza(jSONObject, "video_complete_urls");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            zzbs.zzew();
            zza = zztv.zza(optJSONObject, "manual_impression_urls");
        } else {
            zza = null;
        }
        this.zzcbi = zza;
        this.zzcbb = optJSONObject != null ? optJSONObject.toString() : null;
        optJSONObject = jSONObject.optJSONObject("data");
        this.zzcbk = optJSONObject != null ? optJSONObject.toString() : null;
        this.zzcbf = optJSONObject != null ? optJSONObject.optString("class_name") : null;
        this.zzcbn = jSONObject.optString("html_template", null);
        this.zzcbo = jSONObject.optString("ad_base_url", null);
        optJSONObject = jSONObject.optJSONObject("assets");
        this.zzcbp = optJSONObject != null ? optJSONObject.toString() : null;
        zzbs.zzew();
        this.zzcbq = zztv.zza(jSONObject, "template_ids");
        optJSONObject = jSONObject.optJSONObject("ad_loader_options");
        this.zzcbr = optJSONObject != null ? optJSONObject.toString() : null;
        this.zzcbs = jSONObject.optString("response_type", null);
    }

    public final boolean zzlp() {
        return "banner".equalsIgnoreCase(this.zzcbs);
    }

    public final boolean zzlq() {
        return "native".equalsIgnoreCase(this.zzcbs);
    }
}
