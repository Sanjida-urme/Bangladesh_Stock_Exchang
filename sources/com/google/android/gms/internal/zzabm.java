package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Debug.MemoryInfo;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbs;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzzb
public final class zzabm {
    private static final SimpleDateFormat zzcqa = new SimpleDateFormat("yyyyMMdd", Locale.US);

    public static zzaad zza(Context context, zzzz zzzz, String str) {
        zzzz zzzz2 = zzzz;
        String optString;
        String str2;
        try {
            int zzqa;
            int i;
            String str3;
            zzaad zzaad;
            long j;
            JSONArray optJSONArray;
            List list;
            List list2;
            List list3;
            List zza;
            long j2;
            String optString2;
            boolean optBoolean;
            JSONObject jSONObject = new JSONObject(str);
            optString = jSONObject.optString("ad_base_url", null);
            Object optString3 = jSONObject.optString("ad_url", null);
            String optString4 = jSONObject.optString("ad_size", null);
            String optString5 = jSONObject.optString("ad_slot_size", optString4);
            boolean z = (zzzz2 == null || zzzz2.zzclu == 0) ? false : true;
            CharSequence optString6 = jSONObject.optString("ad_json", null);
            if (optString6 == null) {
                optString6 = jSONObject.optString("ad_html", null);
            }
            if (optString6 == null) {
                optString6 = jSONObject.optString("body", null);
            }
            if (optString6 == null && jSONObject.has("ads")) {
                optString6 = jSONObject.toString();
            }
            String optString7 = jSONObject.optString("debug_dialog", null);
            String optString8 = jSONObject.optString("debug_signals", null);
            long j3 = jSONObject.has("interstitial_timeout") ? (long) (jSONObject.getDouble("interstitial_timeout") * 1000.0d) : -1;
            String optString9 = jSONObject.optString("orientation", null);
            if ("portrait".equals(optString9)) {
                zzqa = zzbs.zzee().zzqa();
            } else if ("landscape".equals(optString9)) {
                zzqa = zzbs.zzee().zzpz();
            } else {
                i = -1;
                if (TextUtils.isEmpty(optString6) || TextUtils.isEmpty(optString3)) {
                    optString9 = optString;
                    str3 = optString6;
                    zzaad = null;
                    j = -1;
                } else {
                    zzaad = zzabh.zza(zzzz2, context, zzzz2.zzatd.zzcp, optString3, null, null, null, null);
                    str2 = zzaad.zzchl;
                    optString9 = zzaad.body;
                    j = zzaad.zzcnk;
                    str3 = optString9;
                    optString9 = str2;
                }
                if (str3 == null) {
                    return new zzaad(0);
                }
                optJSONArray = jSONObject.optJSONArray("click_urls");
                list = zzaad != null ? null : zzaad.zzcbv;
                if (optJSONArray != null) {
                    list = zza(optJSONArray, list);
                }
                optJSONArray = jSONObject.optJSONArray("impression_urls");
                list2 = zzaad != null ? null : zzaad.zzcbw;
                if (optJSONArray != null) {
                    list2 = zza(optJSONArray, list2);
                }
                optJSONArray = jSONObject.optJSONArray("manual_impression_urls");
                list3 = zzaad != null ? null : zzaad.zzcni;
                zza = optJSONArray == null ? zza(optJSONArray, list3) : list3;
                if (zzaad != null) {
                    if (zzaad.orientation != -1) {
                        i = zzaad.orientation;
                    }
                    if (zzaad.zzcnf > 0) {
                        j2 = zzaad.zzcnf;
                        optString2 = jSONObject.optString("active_view");
                        optBoolean = jSONObject.optBoolean("ad_is_javascript", false);
                        return new zzaad(zzzz2, optString9, str3, list, list2, j2, jSONObject.optBoolean("mediation", false), jSONObject.optLong("mediation_config_cache_time_milliseconds", -1), zza, jSONObject.optLong("refresh_interval_milliseconds", -1), i, optString4, j, optString7, optBoolean, optBoolean ? jSONObject.optString("ad_passback_url", null) : null, optString2, jSONObject.optBoolean("custom_render_allowed", false), z, zzzz2.zzclw, jSONObject.optBoolean("content_url_opted_out", true), jSONObject.optBoolean("prefetch", false), jSONObject.optString("gws_query_id", ""), "height".equals(jSONObject.optString("fluid", "")), jSONObject.optBoolean("native_express", false), zzadw.zza(jSONObject.optJSONArray("rewards")), zza(jSONObject.optJSONArray("video_start_urls"), null), zza(jSONObject.optJSONArray("video_complete_urls"), null), jSONObject.optBoolean("use_displayed_impression", false), zzaaf.zzl(jSONObject.optJSONObject("auto_protection_configuration")), zzzz2.zzcmk, jSONObject.optString("set_cookie", ""), zza(jSONObject.optJSONArray("remote_ping_urls"), null), jSONObject.optBoolean("render_in_browser", zzzz2.zzcbz), optString5, zzaee.zzo(jSONObject.optJSONObject("safe_browsing")), optString8, jSONObject.optBoolean("content_vertical_opted_out", true), zzzz2.zzcmw, jSONObject.optBoolean("custom_close_blocked"), 0);
                    }
                }
                j2 = j3;
                optString2 = jSONObject.optString("active_view");
                optBoolean = jSONObject.optBoolean("ad_is_javascript", false);
                if (optBoolean) {
                }
                return new zzaad(zzzz2, optString9, str3, list, list2, j2, jSONObject.optBoolean("mediation", false), jSONObject.optLong("mediation_config_cache_time_milliseconds", -1), zza, jSONObject.optLong("refresh_interval_milliseconds", -1), i, optString4, j, optString7, optBoolean, optBoolean ? jSONObject.optString("ad_passback_url", null) : null, optString2, jSONObject.optBoolean("custom_render_allowed", false), z, zzzz2.zzclw, jSONObject.optBoolean("content_url_opted_out", true), jSONObject.optBoolean("prefetch", false), jSONObject.optString("gws_query_id", ""), "height".equals(jSONObject.optString("fluid", "")), jSONObject.optBoolean("native_express", false), zzadw.zza(jSONObject.optJSONArray("rewards")), zza(jSONObject.optJSONArray("video_start_urls"), null), zza(jSONObject.optJSONArray("video_complete_urls"), null), jSONObject.optBoolean("use_displayed_impression", false), zzaaf.zzl(jSONObject.optJSONObject("auto_protection_configuration")), zzzz2.zzcmk, jSONObject.optString("set_cookie", ""), zza(jSONObject.optJSONArray("remote_ping_urls"), null), jSONObject.optBoolean("render_in_browser", zzzz2.zzcbz), optString5, zzaee.zzo(jSONObject.optJSONObject("safe_browsing")), optString8, jSONObject.optBoolean("content_vertical_opted_out", true), zzzz2.zzcmw, jSONObject.optBoolean("custom_close_blocked"), 0);
            }
            i = zzqa;
            if (TextUtils.isEmpty(optString6)) {
            }
            optString9 = optString;
            str3 = optString6;
            zzaad = null;
            j = -1;
            if (str3 == null) {
                return new zzaad(0);
            }
            optJSONArray = jSONObject.optJSONArray("click_urls");
            if (zzaad != null) {
            }
            if (optJSONArray != null) {
                list = zza(optJSONArray, list);
            }
            optJSONArray = jSONObject.optJSONArray("impression_urls");
            if (zzaad != null) {
            }
            if (optJSONArray != null) {
                list2 = zza(optJSONArray, list2);
            }
            optJSONArray = jSONObject.optJSONArray("manual_impression_urls");
            if (zzaad != null) {
            }
            if (optJSONArray == null) {
            }
            if (zzaad != null) {
                if (zzaad.orientation != -1) {
                    i = zzaad.orientation;
                }
                if (zzaad.zzcnf > 0) {
                    j2 = zzaad.zzcnf;
                    optString2 = jSONObject.optString("active_view");
                    optBoolean = jSONObject.optBoolean("ad_is_javascript", false);
                    if (optBoolean) {
                    }
                    return new zzaad(zzzz2, optString9, str3, list, list2, j2, jSONObject.optBoolean("mediation", false), jSONObject.optLong("mediation_config_cache_time_milliseconds", -1), zza, jSONObject.optLong("refresh_interval_milliseconds", -1), i, optString4, j, optString7, optBoolean, optBoolean ? jSONObject.optString("ad_passback_url", null) : null, optString2, jSONObject.optBoolean("custom_render_allowed", false), z, zzzz2.zzclw, jSONObject.optBoolean("content_url_opted_out", true), jSONObject.optBoolean("prefetch", false), jSONObject.optString("gws_query_id", ""), "height".equals(jSONObject.optString("fluid", "")), jSONObject.optBoolean("native_express", false), zzadw.zza(jSONObject.optJSONArray("rewards")), zza(jSONObject.optJSONArray("video_start_urls"), null), zza(jSONObject.optJSONArray("video_complete_urls"), null), jSONObject.optBoolean("use_displayed_impression", false), zzaaf.zzl(jSONObject.optJSONObject("auto_protection_configuration")), zzzz2.zzcmk, jSONObject.optString("set_cookie", ""), zza(jSONObject.optJSONArray("remote_ping_urls"), null), jSONObject.optBoolean("render_in_browser", zzzz2.zzcbz), optString5, zzaee.zzo(jSONObject.optJSONObject("safe_browsing")), optString8, jSONObject.optBoolean("content_vertical_opted_out", true), zzzz2.zzcmw, jSONObject.optBoolean("custom_close_blocked"), 0);
                }
            }
            j2 = j3;
            optString2 = jSONObject.optString("active_view");
            optBoolean = jSONObject.optBoolean("ad_is_javascript", false);
            if (optBoolean) {
            }
            return new zzaad(zzzz2, optString9, str3, list, list2, j2, jSONObject.optBoolean("mediation", false), jSONObject.optLong("mediation_config_cache_time_milliseconds", -1), zza, jSONObject.optLong("refresh_interval_milliseconds", -1), i, optString4, j, optString7, optBoolean, optBoolean ? jSONObject.optString("ad_passback_url", null) : null, optString2, jSONObject.optBoolean("custom_render_allowed", false), z, zzzz2.zzclw, jSONObject.optBoolean("content_url_opted_out", true), jSONObject.optBoolean("prefetch", false), jSONObject.optString("gws_query_id", ""), "height".equals(jSONObject.optString("fluid", "")), jSONObject.optBoolean("native_express", false), zzadw.zza(jSONObject.optJSONArray("rewards")), zza(jSONObject.optJSONArray("video_start_urls"), null), zza(jSONObject.optJSONArray("video_complete_urls"), null), jSONObject.optBoolean("use_displayed_impression", false), zzaaf.zzl(jSONObject.optJSONObject("auto_protection_configuration")), zzzz2.zzcmk, jSONObject.optString("set_cookie", ""), zza(jSONObject.optJSONArray("remote_ping_urls"), null), jSONObject.optBoolean("render_in_browser", zzzz2.zzcbz), optString5, zzaee.zzo(jSONObject.optJSONObject("safe_browsing")), optString8, jSONObject.optBoolean("content_vertical_opted_out", true), zzzz2.zzcmw, jSONObject.optBoolean("custom_close_blocked"), 0);
        } catch (JSONException e) {
            str2 = "Could not parse the inline ad response: ";
            optString = String.valueOf(e.getMessage());
            zzaiw.zzco(optString.length() != 0 ? str2.concat(optString) : new String(str2));
            return new zzaad(0);
        }
    }

    @Nullable
    private static List<String> zza(@Nullable JSONArray jSONArray, @Nullable List<String> list) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        if (list == null) {
            list = new LinkedList();
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            list.add(jSONArray.getString(i));
        }
        return list;
    }

    @Nullable
    public static JSONObject zza(Context context, zzabf zzabf) {
        String str;
        zzabf zzabf2 = zzabf;
        zzzz zzzz = zzabf2.zzcpe;
        Location location = zzabf2.zzbcd;
        zzabu zzabu = zzabf2.zzcpf;
        Bundle bundle = zzabf2.zzclv;
        JSONObject jSONObject = zzabf2.zzcpg;
        String str2;
        try {
            Object obj;
            int i;
            String str3;
            zzzz zzzz2;
            Location location2;
            Bundle bundle2;
            JSONObject jSONObject2;
            zzabu zzabu2;
            String str4;
            Object obj2;
            Object obj3;
            Map hashMap = new HashMap();
            hashMap.put("extra_caps", zzbs.zzep().zzd(zzmq.zzbmo));
            if (zzabf2.zzcmc.size() > 0) {
                hashMap.put("eid", TextUtils.join(",", zzabf2.zzcmc));
            }
            if (zzzz.zzcln != null) {
                hashMap.put("ad_pos", zzzz.zzcln);
            }
            zzis zzis = zzzz.zzclo;
            String zzpr = zzafg.zzpr();
            if (zzpr != null) {
                hashMap.put("abf", zzpr);
            }
            if (zzis.zzbbv != -1) {
                hashMap.put("cust_age", zzcqa.format(new Date(zzis.zzbbv)));
            }
            if (zzis.extras != null) {
                hashMap.put("extras", zzis.extras);
            }
            int i2 = -1;
            if (zzis.zzbbw != -1) {
                hashMap.put("cust_gender", Integer.valueOf(zzis.zzbbw));
            }
            if (zzis.zzbbx != null) {
                hashMap.put("kw", zzis.zzbbx);
            }
            if (zzis.zzbbz != -1) {
                hashMap.put("tag_for_child_directed_treatment", Integer.valueOf(zzis.zzbbz));
            }
            if (zzis.zzbby) {
                Object valueOf;
                if (((Boolean) zzbs.zzep().zzd(zzmq.zzbqa)).booleanValue()) {
                    obj = "test_request";
                    valueOf = Boolean.valueOf(true);
                } else {
                    obj = "adtest";
                    valueOf = "on";
                }
                hashMap.put(obj, valueOf);
            }
            if (zzis.versionCode >= 2) {
                if (zzis.zzbca) {
                    hashMap.put("d_imp_hdr", Integer.valueOf(1));
                }
                if (!TextUtils.isEmpty(zzis.zzbcb)) {
                    hashMap.put("ppid", zzis.zzbcb);
                }
            }
            if (zzis.versionCode >= 3 && zzis.zzbce != null) {
                hashMap.put("url", zzis.zzbce);
            }
            if (zzis.versionCode >= 5) {
                if (zzis.zzbcg != null) {
                    hashMap.put("custom_targeting", zzis.zzbcg);
                }
                if (zzis.zzbch != null) {
                    hashMap.put("category_exclusions", zzis.zzbch);
                }
                if (zzis.zzbci != null) {
                    hashMap.put("request_agent", zzis.zzbci);
                }
            }
            if (zzis.versionCode >= 6 && zzis.zzbcj != null) {
                hashMap.put("request_pkg", zzis.zzbcj);
            }
            if (zzis.versionCode >= 7) {
                hashMap.put("is_designed_for_families", Boolean.valueOf(zzis.zzbck));
            }
            if (zzzz.zzath.zzbdc != null) {
                Object obj4 = null;
                Object obj5 = null;
                for (zziw zziw : zzzz.zzath.zzbdc) {
                    if (!zziw.zzbde && r16 == null) {
                        hashMap.put("format", zziw.zzbda);
                        obj4 = 1;
                    }
                    if (zziw.zzbde && r17 == null) {
                        hashMap.put("fluid", "height");
                        obj5 = 1;
                    }
                    if (obj4 != null && r17 != null) {
                        break;
                    }
                }
            } else {
                hashMap.put("format", zzzz.zzath.zzbda);
                if (zzzz.zzath.zzbde) {
                    hashMap.put("fluid", "height");
                }
            }
            if (zzzz.zzath.width == -1) {
                hashMap.put("smart_w", "full");
            }
            if (zzzz.zzath.height == -2) {
                hashMap.put("smart_h", "auto");
            }
            if (zzzz.zzath.zzbdc != null) {
                StringBuilder stringBuilder = new StringBuilder();
                zziw[] zziwArr = zzzz.zzath.zzbdc;
                int length = zziwArr.length;
                int i3 = 0;
                Object obj6 = null;
                while (i3 < length) {
                    zziw zziw2 = zziwArr[i3];
                    if (zziw2.zzbde) {
                        obj6 = 1;
                    } else {
                        if (stringBuilder.length() != 0) {
                            stringBuilder.append("|");
                        }
                        stringBuilder.append(zziw2.width == i2 ? (int) (((float) zziw2.widthPixels) / zzabu.zzaxd) : zziw2.width);
                        stringBuilder.append("x");
                        stringBuilder.append(zziw2.height == -2 ? (int) (((float) zziw2.heightPixels) / zzabu.zzaxd) : zziw2.height);
                    }
                    i3++;
                    i2 = -1;
                }
                if (obj6 != null) {
                    if (stringBuilder.length() != 0) {
                        i = 0;
                        stringBuilder.insert(0, "|");
                    } else {
                        i = 0;
                    }
                    stringBuilder.insert(i, "320x50");
                }
                hashMap.put("sz", stringBuilder);
            }
            if (zzzz.zzclu != 0) {
                hashMap.put("native_version", Integer.valueOf(zzzz.zzclu));
                hashMap.put("native_templates", zzzz.zzaub);
                str3 = "native_image_orientation";
                zzom zzom = zzzz.zzatt;
                if (zzom != null) {
                    switch (zzom.zzbtk) {
                        case 0:
                            break;
                        case 1:
                            obj = "portrait";
                            break;
                        case 2:
                            obj = "landscape";
                            break;
                        default:
                            obj = "not_set";
                            break;
                    }
                }
                obj = "any";
                hashMap.put(str3, obj);
                if (!zzzz.zzcmd.isEmpty()) {
                    hashMap.put("native_custom_templates", zzzz.zzcmd);
                }
                if (zzzz.versionCode >= 24) {
                    hashMap.put("max_num_ads", Integer.valueOf(zzzz.zzcmz));
                }
                if (!TextUtils.isEmpty(zzzz.zzcmx)) {
                    try {
                        hashMap.put("native_advanced_settings", new JSONArray(zzzz.zzcmx));
                    } catch (Throwable e) {
                        zzaiw.zzc("Problem creating json from native advanced settings", e);
                    }
                }
            }
            if (zzzz.zzatx != null && zzzz.zzatx.size() > 0) {
                for (Integer num : zzzz.zzatx) {
                    Object valueOf2;
                    if (num.intValue() == 2) {
                        obj = "iba";
                        valueOf2 = Boolean.valueOf(true);
                    } else if (num.intValue() == 1) {
                        obj = "ina";
                        valueOf2 = Boolean.valueOf(true);
                    }
                    hashMap.put(obj, valueOf2);
                }
            }
            if (zzzz.zzath.zzbdf) {
                hashMap.put("ene", Boolean.valueOf(true));
            }
            if (zzzz.zzatv != null) {
                hashMap.put("is_icon_ad", Boolean.valueOf(true));
                hashMap.put("icon_ad_expansion_behavior", Integer.valueOf(zzzz.zzatv.zzbee));
            }
            hashMap.put("slotname", zzzz.zzatb);
            hashMap.put("pn", zzzz.applicationInfo.packageName);
            if (zzzz.zzclp != null) {
                hashMap.put("vc", Integer.valueOf(zzzz.zzclp.versionCode));
            }
            hashMap.put("ms", zzabf2.zzclq);
            hashMap.put("seq_num", zzzz.zzclr);
            hashMap.put("session_id", zzzz.zzcls);
            hashMap.put("js", zzzz.zzatd.zzcp);
            zzace zzace = zzabf2.zzcpb;
            Bundle bundle3 = zzzz.zzcmp;
            Bundle bundle4 = zzabf2.zzcpa;
            hashMap.put("am", Integer.valueOf(zzabu.zzcrt));
            hashMap.put("cog", zzt(zzabu.zzcru));
            hashMap.put("coh", zzt(zzabu.zzcrv));
            if (!TextUtils.isEmpty(zzabu.zzcrw)) {
                hashMap.put("carrier", zzabu.zzcrw);
            }
            hashMap.put("gl", zzabu.zzcrx);
            if (zzabu.zzcry) {
                hashMap.put("simulator", Integer.valueOf(1));
            }
            if (zzabu.zzcrz) {
                hashMap.put("is_sidewinder", Integer.valueOf(1));
            }
            hashMap.put("ma", zzt(zzabu.zzcsa));
            hashMap.put("sp", zzt(zzabu.zzcsb));
            hashMap.put("hl", zzabu.zzcsc);
            if (!TextUtils.isEmpty(zzabu.zzcsd)) {
                hashMap.put("mv", zzabu.zzcsd);
            }
            hashMap.put("muv", Integer.valueOf(zzabu.zzcsf));
            if (zzabu.zzcsg != -2) {
                hashMap.put("cnt", Integer.valueOf(zzabu.zzcsg));
            }
            hashMap.put("gnt", Integer.valueOf(zzabu.zzcsh));
            hashMap.put("pt", Integer.valueOf(zzabu.zzcsi));
            hashMap.put("rm", Integer.valueOf(zzabu.zzcsj));
            hashMap.put("riv", Integer.valueOf(zzabu.zzcsk));
            Bundle bundle5 = new Bundle();
            bundle5.putString("build_build", zzabu.zzcsp);
            bundle5.putString("build_device", zzabu.zzcsq);
            Bundle bundle6 = new Bundle();
            bundle6.putBoolean("is_charging", zzabu.zzcsm);
            Bundle bundle7 = bundle3;
            bundle6.putDouble("battery_level", zzabu.zzcsl);
            bundle5.putBundle("battery", bundle6);
            Bundle bundle8 = new Bundle();
            bundle8.putInt("active_network_state", zzabu.zzcso);
            bundle8.putBoolean("active_network_metered", zzabu.zzcsn);
            if (zzace != null) {
                bundle3 = new Bundle();
                bundle3.putInt("predicted_latency_micros", zzace.zzcsz);
                bundle3.putLong("predicted_down_throughput_bps", zzace.zzcta);
                bundle3.putLong("predicted_up_throughput_bps", zzace.zzctb);
                bundle8.putBundle("predictions", bundle3);
            }
            bundle5.putBundle("network", bundle8);
            Bundle bundle9 = new Bundle();
            bundle9.putBoolean("is_browser_custom_tabs_capable", zzabu.zzcsr);
            bundle5.putBundle("browser", bundle9);
            if (bundle7 != null) {
                str3 = "android_mem_info";
                bundle8 = new Bundle();
                zzzz2 = zzzz;
                location2 = location;
                bundle2 = bundle;
                jSONObject2 = jSONObject;
                bundle6 = bundle7;
                bundle8.putString("runtime_free", Long.toString(bundle6.getLong("runtime_free_memory", -1)));
                zzabu2 = zzabu;
                bundle8.putString("runtime_max", Long.toString(bundle6.getLong("runtime_max_memory", -1)));
                bundle8.putString("runtime_total", Long.toString(bundle6.getLong("runtime_total_memory", -1)));
                i = 0;
                bundle8.putString("web_view_count", Integer.toString(bundle6.getInt("web_view_count", 0)));
                MemoryInfo memoryInfo = (MemoryInfo) bundle6.getParcelable("debug_memory_info");
                if (memoryInfo != null) {
                    bundle8.putString("debug_info_dalvik_private_dirty", Integer.toString(memoryInfo.dalvikPrivateDirty));
                    bundle8.putString("debug_info_dalvik_pss", Integer.toString(memoryInfo.dalvikPss));
                    bundle8.putString("debug_info_dalvik_shared_dirty", Integer.toString(memoryInfo.dalvikSharedDirty));
                    bundle8.putString("debug_info_native_private_dirty", Integer.toString(memoryInfo.nativePrivateDirty));
                    bundle8.putString("debug_info_native_pss", Integer.toString(memoryInfo.nativePss));
                    bundle8.putString("debug_info_native_shared_dirty", Integer.toString(memoryInfo.nativeSharedDirty));
                    bundle8.putString("debug_info_other_private_dirty", Integer.toString(memoryInfo.otherPrivateDirty));
                    bundle8.putString("debug_info_other_pss", Integer.toString(memoryInfo.otherPss));
                    bundle8.putString("debug_info_other_shared_dirty", Integer.toString(memoryInfo.otherSharedDirty));
                }
                bundle5.putBundle(str3, bundle8);
            } else {
                zzzz2 = zzzz;
                location2 = location;
                zzabu2 = zzabu;
                bundle2 = bundle;
                jSONObject2 = jSONObject;
                i = 0;
            }
            Bundle bundle10 = new Bundle();
            bundle10.putBundle("parental_controls", bundle4);
            zzabu zzabu3 = zzabu2;
            if (!TextUtils.isEmpty(zzabu3.zzcse)) {
                bundle10.putString("package_version", zzabu3.zzcse);
            }
            bundle5.putBundle("play_store", bundle10);
            hashMap.put("device", bundle5);
            bundle10 = new Bundle();
            bundle10.putString("doritos", zzabf2.zzcpc);
            if (((Boolean) zzbs.zzep().zzd(zzmq.zzbjt)).booleanValue()) {
                Object id;
                boolean isLimitAdTrackingEnabled;
                String str5;
                if (zzabf2.zzcpd != null) {
                    id = zzabf2.zzcpd.getId();
                    isLimitAdTrackingEnabled = zzabf2.zzcpd.isLimitAdTrackingEnabled();
                } else {
                    id = null;
                    isLimitAdTrackingEnabled = false;
                }
                if (TextUtils.isEmpty(id)) {
                    zzjk.zzhx();
                    bundle10.putString("pdid", zzais.zzbc(context));
                    str4 = "pdidtype";
                    str5 = "ssaid";
                } else {
                    bundle10.putString("rdid", id);
                    bundle10.putBoolean("is_lat", isLimitAdTrackingEnabled);
                    str4 = "idtype";
                    str5 = "adid";
                }
                bundle10.putString(str4, str5);
            }
            hashMap.put("pii", bundle10);
            hashMap.put("platform", Build.MANUFACTURER);
            hashMap.put("submodel", Build.MODEL);
            if (location2 != null) {
                zza((HashMap) hashMap, location2);
                zzzz = zzzz2;
            } else {
                zzzz = zzzz2;
                if (zzzz.zzclo.versionCode >= 2 && zzzz.zzclo.zzbcd != null) {
                    zza((HashMap) hashMap, zzzz.zzclo.zzbcd);
                }
            }
            if (zzzz.versionCode >= 2) {
                hashMap.put("quality_signals", zzzz.zzclt);
            }
            if (zzzz.versionCode >= 4 && zzzz.zzclw) {
                hashMap.put("forceHttps", Boolean.valueOf(zzzz.zzclw));
            }
            if (bundle2 != null) {
                hashMap.put("content_info", bundle2);
            }
            if (zzzz.versionCode >= 5) {
                hashMap.put("u_sd", Float.valueOf(zzzz.zzaxd));
                hashMap.put("sh", Integer.valueOf(zzzz.zzcly));
                hashMap.put("sw", Integer.valueOf(zzzz.zzclx));
            } else {
                hashMap.put("u_sd", Float.valueOf(zzabu3.zzaxd));
                hashMap.put("sh", Integer.valueOf(zzabu3.zzcly));
                hashMap.put("sw", Integer.valueOf(zzabu3.zzclx));
            }
            if (zzzz.versionCode >= 6) {
                if (!TextUtils.isEmpty(zzzz.zzclz)) {
                    try {
                        hashMap.put("view_hierarchy", new JSONObject(zzzz.zzclz));
                    } catch (Throwable e2) {
                        zzaiw.zzc("Problem serializing view hierarchy to JSON", e2);
                    }
                }
                hashMap.put("correlation_id", Long.valueOf(zzzz.zzcma));
            }
            if (zzzz.versionCode >= 7) {
                hashMap.put("request_id", zzzz.zzcmb);
            }
            if (zzzz.versionCode >= 12 && !TextUtils.isEmpty(zzzz.zzcmf)) {
                hashMap.put("anchor", zzzz.zzcmf);
            }
            if (zzzz.versionCode >= 13) {
                hashMap.put("android_app_volume", Float.valueOf(zzzz.zzcmg));
            }
            if (zzzz.versionCode >= 18) {
                hashMap.put("android_app_muted", Boolean.valueOf(zzzz.zzcmm));
            }
            if (zzzz.versionCode >= 14 && zzzz.zzcmh > 0) {
                hashMap.put("target_api", Integer.valueOf(zzzz.zzcmh));
            }
            if (zzzz.versionCode >= 15) {
                String str6 = "scroll_index";
                int i4 = -1;
                if (zzzz.zzcmi != -1) {
                    i4 = zzzz.zzcmi;
                }
                hashMap.put(str6, Integer.valueOf(i4));
            }
            if (zzzz.versionCode >= 16) {
                hashMap.put("_activity_context", Boolean.valueOf(zzzz.zzcmj));
            }
            if (zzzz.versionCode >= 18) {
                if (!TextUtils.isEmpty(zzzz.zzcmn)) {
                    try {
                        hashMap.put("app_settings", new JSONObject(zzzz.zzcmn));
                    } catch (Throwable e22) {
                        zzaiw.zzc("Problem creating json from app settings", e22);
                    }
                }
                hashMap.put("render_in_browser", Boolean.valueOf(zzzz.zzcbz));
            }
            if (zzzz.versionCode >= 18) {
                hashMap.put("android_num_video_cache_tasks", Integer.valueOf(zzzz.zzcmo));
            }
            zzaiy zzaiy = zzzz.zzatd;
            boolean z = zzzz.zzcna;
            boolean z2 = zzabf2.zzcph;
            bundle = new Bundle();
            Bundle bundle11 = new Bundle();
            bundle11.putString("cl", "173624900");
            bundle11.putString("rapid_rc", "dev");
            bundle11.putString("rapid_rollup", "HEAD");
            bundle.putBundle("build_meta", bundle11);
            bundle.putString("mf", Boolean.toString(((Boolean) zzbs.zzep().zzd(zzmq.zzbmq)).booleanValue()));
            bundle.putBoolean("instant_app", z);
            bundle.putBoolean("lite", zzaiy.zzdcc);
            bundle.putBoolean("local_service", z2);
            hashMap.put("sdk_env", bundle);
            hashMap.put("cache_state", jSONObject2);
            if (zzzz.versionCode >= 19) {
                hashMap.put("gct", zzzz.zzcmq);
            }
            if (zzzz.versionCode >= 21 && zzzz.zzcmr) {
                hashMap.put("de", "1");
            }
            if (((Boolean) zzbs.zzep().zzd(zzmq.zzbkg)).booleanValue()) {
                Bundle bundle12;
                Object obj7;
                Bundle bundle13;
                str2 = zzzz.zzath.zzbda;
                if (!str2.equals("interstitial_mb")) {
                    if (!str2.equals("reward_mb")) {
                        obj2 = null;
                        bundle12 = zzzz.zzcms;
                        obj7 = bundle12 == null ? 1 : null;
                        if (!(obj2 == null || obj7 == null)) {
                            bundle13 = new Bundle();
                            bundle13.putBundle("interstitial_pool", bundle12);
                            hashMap.put("counters", bundle13);
                        }
                    }
                }
                obj2 = 1;
                bundle12 = zzzz.zzcms;
                if (bundle12 == null) {
                }
                bundle13 = new Bundle();
                bundle13.putBundle("interstitial_pool", bundle12);
                hashMap.put("counters", bundle13);
            }
            if (zzzz.zzcmt != null) {
                hashMap.put("gmp_app_id", zzzz.zzcmt);
            }
            if (zzzz.zzcmu == null) {
                obj2 = "fbs_aiid";
                obj3 = "";
            } else if ("TIME_OUT".equals(zzzz.zzcmu)) {
                obj2 = "sai_timeout";
                obj3 = zzbs.zzep().zzd(zzmq.zzbjj);
            } else {
                obj2 = "fbs_aiid";
                obj3 = zzzz.zzcmu;
            }
            hashMap.put(obj2, obj3);
            if (zzzz.zzcmv != null) {
                hashMap.put("fbs_aeid", zzzz.zzcmv);
            }
            if (zzzz.versionCode >= 24) {
                hashMap.put("disable_ml", Boolean.valueOf(zzzz.zzcnb));
            }
            str2 = (String) zzbs.zzep().zzd(zzmq.zzbhh);
            if (!(str2 == null || str2.isEmpty())) {
                if (VERSION.SDK_INT >= ((Integer) zzbs.zzep().zzd(zzmq.zzbhi)).intValue()) {
                    HashMap hashMap2 = new HashMap();
                    String[] split = str2.split(",");
                    int length2 = split.length;
                    for (i = 
/*
Method generation error in method: com.google.android.gms.internal.zzabm.zza(android.content.Context, com.google.android.gms.internal.zzabf):org.json.JSONObject, dex: classes.dex
jadx.core.utils.exceptions.CodegenException: Error generate insn: PHI: (r10_113 'i' int) = (r10_111 'i' int), (r10_112 'i' int) binds: {(r10_111 'i' int)=B:188:0x052e, (r10_112 'i' int)=B:189:0x0532} in method: com.google.android.gms.internal.zzabm.zza(android.content.Context, com.google.android.gms.internal.zzabf):org.json.JSONObject, dex: classes.dex
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:226)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:184)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:61)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:118)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:57)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:118)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:57)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:279)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:187)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:320)
	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:257)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:220)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:110)
	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:75)
	at jadx.core.codegen.CodeGen.visit(CodeGen.java:12)
	at jadx.core.ProcessClass.process(ProcessClass.java:40)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/558922244.run(Unknown Source)
Caused by: jadx.core.utils.exceptions.CodegenException: PHI can be used only in fallback mode
	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:537)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:509)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:220)
	... 31 more

*/

                    private static void zza(HashMap<String, Object> hashMap, Location location) {
                        HashMap hashMap2 = new HashMap();
                        Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
                        Long valueOf2 = Long.valueOf(location.getTime() * 1000);
                        Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
                        Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
                        hashMap2.put("radius", valueOf);
                        hashMap2.put("lat", valueOf3);
                        hashMap2.put("long", valueOf4);
                        hashMap2.put("time", valueOf2);
                        hashMap.put("uule", hashMap2);
                    }

                    public static JSONObject zzb(zzaad zzaad) throws JSONException {
                        String str;
                        Object obj;
                        JSONObject jSONObject = new JSONObject();
                        if (zzaad.zzchl != null) {
                            jSONObject.put("ad_base_url", zzaad.zzchl);
                        }
                        if (zzaad.zzcnj != null) {
                            jSONObject.put("ad_size", zzaad.zzcnj);
                        }
                        jSONObject.put("native", zzaad.zzbdd);
                        jSONObject.put(zzaad.zzbdd ? "ad_json" : "ad_html", zzaad.body);
                        if (zzaad.zzcnl != null) {
                            jSONObject.put("debug_dialog", zzaad.zzcnl);
                        }
                        if (zzaad.zzcoc != null) {
                            jSONObject.put("debug_signals", zzaad.zzcoc);
                        }
                        if (zzaad.zzcnf != -1) {
                            jSONObject.put("interstitial_timeout", ((double) zzaad.zzcnf) / 1000.0d);
                        }
                        if (zzaad.orientation == zzbs.zzee().zzqa()) {
                            str = "orientation";
                            obj = "portrait";
                        } else {
                            if (zzaad.orientation == zzbs.zzee().zzpz()) {
                                str = "orientation";
                                obj = "landscape";
                            }
                            if (zzaad.zzcbv != null) {
                                jSONObject.put("click_urls", zzo(zzaad.zzcbv));
                            }
                            if (zzaad.zzcbw != null) {
                                jSONObject.put("impression_urls", zzo(zzaad.zzcbw));
                            }
                            if (zzaad.zzcni != null) {
                                jSONObject.put("manual_impression_urls", zzo(zzaad.zzcni));
                            }
                            if (zzaad.zzcno != null) {
                                jSONObject.put("active_view", zzaad.zzcno);
                            }
                            jSONObject.put("ad_is_javascript", zzaad.zzcnm);
                            if (zzaad.zzcnn != null) {
                                jSONObject.put("ad_passback_url", zzaad.zzcnn);
                            }
                            jSONObject.put("mediation", zzaad.zzcng);
                            jSONObject.put("custom_render_allowed", zzaad.zzcnp);
                            jSONObject.put("content_url_opted_out", zzaad.zzcnq);
                            jSONObject.put("content_vertical_opted_out", zzaad.zzcod);
                            jSONObject.put("prefetch", zzaad.zzcnr);
                            if (zzaad.zzccb != -1) {
                                jSONObject.put("refresh_interval_milliseconds", zzaad.zzccb);
                            }
                            if (zzaad.zzcnh != -1) {
                                jSONObject.put("mediation_config_cache_time_milliseconds", zzaad.zzcnh);
                            }
                            if (!TextUtils.isEmpty(zzaad.zzcnu)) {
                                jSONObject.put("gws_query_id", zzaad.zzcnu);
                            }
                            jSONObject.put("fluid", zzaad.zzbde ? "height" : "");
                            jSONObject.put("native_express", zzaad.zzbdf);
                            if (zzaad.zzcnw != null) {
                                jSONObject.put("video_start_urls", zzo(zzaad.zzcnw));
                            }
                            if (zzaad.zzcnx != null) {
                                jSONObject.put("video_complete_urls", zzo(zzaad.zzcnx));
                            }
                            if (zzaad.zzcnv != null) {
                                zzadw zzadw = zzaad.zzcnv;
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("rb_type", zzadw.type);
                                jSONObject2.put("rb_amount", zzadw.zzcuk);
                                JSONArray jSONArray = new JSONArray();
                                jSONArray.put(jSONObject2);
                                jSONObject.put("rewards", jSONArray);
                            }
                            jSONObject.put("use_displayed_impression", zzaad.zzcny);
                            jSONObject.put("auto_protection_configuration", zzaad.zzcnz);
                            jSONObject.put("render_in_browser", zzaad.zzcbz);
                            return jSONObject;
                        }
                        jSONObject.put(str, obj);
                        if (zzaad.zzcbv != null) {
                            jSONObject.put("click_urls", zzo(zzaad.zzcbv));
                        }
                        if (zzaad.zzcbw != null) {
                            jSONObject.put("impression_urls", zzo(zzaad.zzcbw));
                        }
                        if (zzaad.zzcni != null) {
                            jSONObject.put("manual_impression_urls", zzo(zzaad.zzcni));
                        }
                        if (zzaad.zzcno != null) {
                            jSONObject.put("active_view", zzaad.zzcno);
                        }
                        jSONObject.put("ad_is_javascript", zzaad.zzcnm);
                        if (zzaad.zzcnn != null) {
                            jSONObject.put("ad_passback_url", zzaad.zzcnn);
                        }
                        jSONObject.put("mediation", zzaad.zzcng);
                        jSONObject.put("custom_render_allowed", zzaad.zzcnp);
                        jSONObject.put("content_url_opted_out", zzaad.zzcnq);
                        jSONObject.put("content_vertical_opted_out", zzaad.zzcod);
                        jSONObject.put("prefetch", zzaad.zzcnr);
                        if (zzaad.zzccb != -1) {
                            jSONObject.put("refresh_interval_milliseconds", zzaad.zzccb);
                        }
                        if (zzaad.zzcnh != -1) {
                            jSONObject.put("mediation_config_cache_time_milliseconds", zzaad.zzcnh);
                        }
                        if (TextUtils.isEmpty(zzaad.zzcnu)) {
                            jSONObject.put("gws_query_id", zzaad.zzcnu);
                        }
                        if (zzaad.zzbde) {
                        }
                        jSONObject.put("fluid", zzaad.zzbde ? "height" : "");
                        jSONObject.put("native_express", zzaad.zzbdf);
                        if (zzaad.zzcnw != null) {
                            jSONObject.put("video_start_urls", zzo(zzaad.zzcnw));
                        }
                        if (zzaad.zzcnx != null) {
                            jSONObject.put("video_complete_urls", zzo(zzaad.zzcnx));
                        }
                        if (zzaad.zzcnv != null) {
                            zzadw zzadw2 = zzaad.zzcnv;
                            JSONObject jSONObject22 = new JSONObject();
                            jSONObject22.put("rb_type", zzadw2.type);
                            jSONObject22.put("rb_amount", zzadw2.zzcuk);
                            JSONArray jSONArray2 = new JSONArray();
                            jSONArray2.put(jSONObject22);
                            jSONObject.put("rewards", jSONArray2);
                        }
                        jSONObject.put("use_displayed_impression", zzaad.zzcny);
                        jSONObject.put("auto_protection_configuration", zzaad.zzcnz);
                        jSONObject.put("render_in_browser", zzaad.zzcbz);
                        return jSONObject;
                    }

                    @Nullable
                    private static JSONArray zzo(List<String> list) throws JSONException {
                        JSONArray jSONArray = new JSONArray();
                        for (String put : list) {
                            jSONArray.put(put);
                        }
                        return jSONArray;
                    }

                    private static Integer zzt(boolean z) {
                        return Integer.valueOf(z);
                    }
                }
