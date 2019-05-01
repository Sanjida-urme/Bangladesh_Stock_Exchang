package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbs;

@zzzb
public final class zzaeo {
    public static String zzb(String str, Context context) {
        if (zzbs.zzfa().zzr(context)) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            String zzz = zzbs.zzfa().zzz(context);
            if (zzz == null) {
                return str;
            }
            if (((Boolean) zzbs.zzep().zzd(zzmq.zzbjh)).booleanValue()) {
                String str2 = (String) zzbs.zzep().zzd(zzmq.zzbji);
                if (str.contains(str2)) {
                    if (zzbs.zzec().zzcf(str)) {
                        zzbs.zzfa().zze(context, zzz);
                        return str.replace(str2, zzz);
                    } else if (zzbs.zzec().zzcg(str)) {
                        zzbs.zzfa().zzf(context, zzz);
                        return str.replace(str2, zzz);
                    }
                }
            } else if (!str.contains("fbs_aeid")) {
                if (zzbs.zzec().zzcf(str)) {
                    zzbs.zzfa().zze(context, zzz);
                    zzbs.zzec();
                    return zzagr.zzb(str, "fbs_aeid", zzz).toString();
                } else if (zzbs.zzec().zzcg(str)) {
                    zzbs.zzfa().zzf(context, zzz);
                    zzbs.zzec();
                    str = zzagr.zzb(str, "fbs_aeid", zzz).toString();
                }
            }
        }
        return str;
    }
}
