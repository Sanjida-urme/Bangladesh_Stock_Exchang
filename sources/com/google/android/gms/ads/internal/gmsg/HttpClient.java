package com.google.android.gms.ads.internal.gmsg;

import android.content.Context;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.zzagl;
import com.google.android.gms.internal.zzagr;
import com.google.android.gms.internal.zzaiw;
import com.google.android.gms.internal.zzaiy;
import com.google.android.gms.internal.zzzb;
import java.io.BufferedOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONObject;

@Keep
@zzzb
@KeepName
public class HttpClient implements zzt<com.google.android.gms.ads.internal.js.zza> {
    private final Context mContext;
    private final zzaiy zzaov;

    @zzzb
    static class zza {
        private final String mValue;
        private final String zzbfo;

        public zza(String str, String str2) {
            this.zzbfo = str;
            this.mValue = str2;
        }

        public final String getKey() {
            return this.zzbfo;
        }

        public final String getValue() {
            return this.mValue;
        }
    }

    @zzzb
    static class zzb {
        private final String zzbvz;
        private final URL zzbwa;
        private final ArrayList<zza> zzbwb;
        private final String zzbwc;

        zzb(String str, URL url, ArrayList<zza> arrayList, String str2) {
            this.zzbvz = str;
            this.zzbwa = url;
            this.zzbwb = arrayList;
            this.zzbwc = str2;
        }

        public final String zzkh() {
            return this.zzbvz;
        }

        public final URL zzki() {
            return this.zzbwa;
        }

        public final ArrayList<zza> zzkj() {
            return this.zzbwb;
        }

        public final String zzkk() {
            return this.zzbwc;
        }
    }

    @zzzb
    class zzc {
        private final zzd zzbwd;
        private final boolean zzbwe;
        private final String zzbwf;

        public zzc(HttpClient httpClient, boolean z, zzd zzd, String str) {
            this.zzbwe = z;
            this.zzbwd = zzd;
            this.zzbwf = str;
        }

        public final String getReason() {
            return this.zzbwf;
        }

        public final boolean isSuccess() {
            return this.zzbwe;
        }

        public final zzd zzkl() {
            return this.zzbwd;
        }
    }

    @zzzb
    static class zzd {
        private final String zzbrz;
        private final String zzbvz;
        private final int zzbwg;
        private final List<zza> zzbwh;

        zzd(String str, int i, List<zza> list, String str2) {
            this.zzbvz = str;
            this.zzbwg = i;
            this.zzbwh = list;
            this.zzbrz = str2;
        }

        public final String getBody() {
            return this.zzbrz;
        }

        public final int getResponseCode() {
            return this.zzbwg;
        }

        public final String zzkh() {
            return this.zzbvz;
        }

        public final Iterable<zza> zzkm() {
            return this.zzbwh;
        }
    }

    public HttpClient(Context context, zzaiy zzaiy) {
        this.mContext = context;
        this.zzaov = zzaiy;
    }

    private final zzc zza(zzb zzb) {
        Exception e;
        zzc zzc;
        Throwable th;
        HttpURLConnection httpURLConnection;
        try {
            httpURLConnection = (HttpURLConnection) zzb.zzki().openConnection();
            try {
                zzbs.zzec().zza(this.mContext, this.zzaov.zzcp, false, httpURLConnection);
                ArrayList zzkj = zzb.zzkj();
                int size = zzkj.size();
                int i = 0;
                while (i < size) {
                    Object obj = zzkj.get(i);
                    i++;
                    zza zza = (zza) obj;
                    httpURLConnection.addRequestProperty(zza.getKey(), zza.getValue());
                }
                if (!TextUtils.isEmpty(zzb.zzkk())) {
                    httpURLConnection.setDoOutput(true);
                    byte[] bytes = zzb.zzkk().getBytes();
                    httpURLConnection.setFixedLengthStreamingMode(bytes.length);
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                    bufferedOutputStream.write(bytes);
                    bufferedOutputStream.close();
                }
                List arrayList = new ArrayList();
                if (httpURLConnection.getHeaderFields() != null) {
                    for (Entry entry : httpURLConnection.getHeaderFields().entrySet()) {
                        for (String zza2 : (List) entry.getValue()) {
                            arrayList.add(new zza((String) entry.getKey(), zza2));
                        }
                    }
                }
                String zzkh = zzb.zzkh();
                int responseCode = httpURLConnection.getResponseCode();
                zzbs.zzec();
                zzc zzc2 = new zzc(this, true, new zzd(zzkh, responseCode, arrayList, zzagr.zza(new InputStreamReader(httpURLConnection.getInputStream()))), null);
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return zzc2;
            } catch (Exception e2) {
                e = e2;
                try {
                    zzc = new zzc(this, false, null, e.toString());
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return zzc;
                } catch (Throwable th2) {
                    th = th2;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            httpURLConnection = null;
            zzc = new zzc(this, false, null, e.toString());
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            return zzc;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    private static JSONObject zza(zzd zzd) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("http_request_id", zzd.zzkh());
            if (zzd.getBody() != null) {
                jSONObject.put("body", zzd.getBody());
            }
            JSONArray jSONArray = new JSONArray();
            for (zza zza : zzd.zzkm()) {
                jSONArray.put(new JSONObject().put("key", zza.getKey()).put("value", zza.getValue()));
            }
            jSONObject.put("headers", jSONArray);
            jSONObject.put("response_code", zzd.getResponseCode());
            return jSONObject;
        } catch (Throwable e) {
            zzaiw.zzb("Error constructing JSON for http response.", e);
            return jSONObject;
        }
    }

    private static zzb zzd(JSONObject jSONObject) {
        String optString = jSONObject.optString("http_request_id");
        String optString2 = jSONObject.optString("url");
        URL url = null;
        String optString3 = jSONObject.optString("post_body", null);
        try {
            url = new URL(optString2);
        } catch (Throwable e) {
            zzaiw.zzb("Error constructing http request.", e);
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("headers");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                arrayList.add(new zza(optJSONObject.optString("key"), optJSONObject.optString("value")));
            }
        }
        return new zzb(optString, url, arrayList, optString3);
    }

    @Keep
    @KeepName
    public JSONObject send(JSONObject jSONObject) {
        Throwable e;
        JSONObject jSONObject2 = new JSONObject();
        String str = "";
        Object optString;
        try {
            optString = jSONObject.optString("http_request_id");
            try {
                zzc zza = zza(zzd(jSONObject));
                if (zza.isSuccess()) {
                    jSONObject2.put("response", zza(zza.zzkl()));
                    jSONObject2.put("success", true);
                    return jSONObject2;
                }
                jSONObject2.put("response", new JSONObject().put("http_request_id", optString));
                jSONObject2.put("success", false);
                jSONObject2.put("reason", zza.getReason());
                return jSONObject2;
            } catch (Exception e2) {
                e = e2;
                zzaiw.zzb("Error executing http request.", e);
                try {
                    jSONObject2.put("response", new JSONObject().put("http_request_id", optString));
                    jSONObject2.put("success", false);
                    jSONObject2.put("reason", e.toString());
                    return jSONObject2;
                } catch (Throwable e3) {
                    zzaiw.zzb("Error executing http request.", e3);
                    return jSONObject2;
                }
            }
        } catch (Exception e4) {
            e3 = e4;
            optString = str;
            zzaiw.zzb("Error executing http request.", e3);
            jSONObject2.put("response", new JSONObject().put("http_request_id", optString));
            jSONObject2.put("success", false);
            jSONObject2.put("reason", e3.toString());
            return jSONObject2;
        }
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzagl.zza(new zzu(this, map, (com.google.android.gms.ads.internal.js.zza) obj));
    }
}
