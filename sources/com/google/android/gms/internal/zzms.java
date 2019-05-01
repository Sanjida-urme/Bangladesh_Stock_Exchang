package com.google.android.gms.internal;

import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.zzbs;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

@zzzb
public final class zzms {
    private Context mContext = null;
    private String zzaus = null;
    private boolean zzbqe;
    private String zzbqf;
    private Map<String, String> zzbqg;

    public zzms(Context context, String str) {
        this.mContext = context;
        this.zzaus = str;
        this.zzbqe = ((Boolean) zzbs.zzep().zzd(zzmq.zzbhx)).booleanValue();
        this.zzbqf = (String) zzbs.zzep().zzd(zzmq.zzbhy);
        this.zzbqg = new LinkedHashMap();
        this.zzbqg.put("s", "gmob_sdk");
        this.zzbqg.put("v", "3");
        this.zzbqg.put("os", VERSION.RELEASE);
        this.zzbqg.put("sdk", VERSION.SDK);
        zzbs.zzec();
        this.zzbqg.put("device", zzagr.zzpw());
        this.zzbqg.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        Map map = this.zzbqg;
        String str2 = "is_lite_sdk";
        zzbs.zzec();
        map.put(str2, zzagr.zzat(context) ? "1" : "0");
        Future zzp = zzbs.zzem().zzp(this.mContext);
        try {
            zzp.get();
            this.zzbqg.put("network_coarse", Integer.toString(((zzabu) zzp.get()).zzcsg));
            this.zzbqg.put("network_fine", Integer.toString(((zzabu) zzp.get()).zzcsh));
        } catch (Throwable e) {
            zzbs.zzeg().zza(e, "CsiConfiguration.CsiConfiguration");
        }
    }

    final Context getContext() {
        return this.mContext;
    }

    final String zzfo() {
        return this.zzaus;
    }

    final boolean zzis() {
        return this.zzbqe;
    }

    final String zzit() {
        return this.zzbqf;
    }

    final Map<String, String> zziu() {
        return this.zzbqg;
    }
}
