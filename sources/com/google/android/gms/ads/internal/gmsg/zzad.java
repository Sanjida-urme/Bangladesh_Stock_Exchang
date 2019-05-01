package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.google.android.gms.internal.zzaiw;
import com.google.android.gms.internal.zzzb;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@zzzb
public final class zzad implements zzt<Object> {
    private final Object mLock = new Object();
    private final Map<String, zzae> zzbws = new HashMap();

    public final void zza(Object obj, Map<String, String> map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("result");
        synchronized (this.mLock) {
            zzae zzae = (zzae) this.zzbws.remove(str);
            if (zzae == null) {
                str4 = "Received result for unexpected method invocation: ";
                str = String.valueOf(str);
                zzaiw.zzco(str.length() != 0 ? str4.concat(str) : new String(str4));
                return;
            } else if (!TextUtils.isEmpty(str2)) {
                zzae.zzat(str3);
                return;
            } else if (str4 == null) {
                zzae.zze(null);
                return;
            } else {
                try {
                    zzae.zze(new JSONObject(str4));
                } catch (JSONException e) {
                    zzae.zzat(e.getMessage());
                }
            }
        }
    }

    public final void zza(String str, zzae zzae) {
        synchronized (this.mLock) {
            this.zzbws.put(str, zzae);
        }
    }
}
