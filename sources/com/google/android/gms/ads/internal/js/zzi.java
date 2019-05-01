package com.google.android.gms.ads.internal.js;

import org.json.JSONObject;

final class zzi implements Runnable {
    private /* synthetic */ String zzbzd;
    private /* synthetic */ JSONObject zzbze;
    private /* synthetic */ zzg zzbzf;

    zzi(zzg zzg, String str, JSONObject jSONObject) {
        this.zzbzf = zzg;
        this.zzbzd = str;
        this.zzbze = jSONObject;
    }

    public final void run() {
        this.zzbzf.zzbwq.zzb(this.zzbzd, this.zzbze);
    }
}
