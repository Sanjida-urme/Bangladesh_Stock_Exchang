package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.internal.zzaiw;
import com.google.android.gms.internal.zzama;
import com.google.android.gms.internal.zzzb;
import java.util.Map;

@zzzb
public final class zzc implements zzt<zzama> {
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzama zzama = (zzama) obj;
        String str = (String) map.get("action");
        String str2;
        if ("tick".equals(str)) {
            str = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            str2 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str)) {
                zzaiw.zzco("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str2)) {
                zzaiw.zzco("No timestamp given for CSI tick.");
            } else {
                try {
                    long elapsedRealtime = zzbs.zzei().elapsedRealtime() + (Long.parseLong(str2) - zzbs.zzei().currentTimeMillis());
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    zzama.zzsa().zza(str, str3, elapsedRealtime);
                } catch (Throwable e) {
                    zzaiw.zzc("Malformed timestamp for CSI tick.", e);
                }
            }
        } else if ("experiment".equals(str)) {
            str2 = (String) map.get("value");
            if (TextUtils.isEmpty(str2)) {
                zzaiw.zzco("No value given for CSI experiment.");
                return;
            }
            r11 = zzama.zzsa().zziy();
            if (r11 == null) {
                zzaiw.zzco("No ticker for WebView, dropping experiment ID.");
            } else {
                r11.zzf("e", str2);
            }
        } else {
            if ("extra".equals(str)) {
                str = (String) map.get("name");
                str2 = (String) map.get("value");
                if (TextUtils.isEmpty(str2)) {
                    zzaiw.zzco("No value given for CSI extra.");
                } else if (TextUtils.isEmpty(str)) {
                    zzaiw.zzco("No name given for CSI extra.");
                } else {
                    r11 = zzama.zzsa().zziy();
                    if (r11 == null) {
                        zzaiw.zzco("No ticker for WebView, dropping extra parameter.");
                        return;
                    }
                    r11.zzf(str, str2);
                }
            }
        }
    }
}
