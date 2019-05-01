package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.zzt;
import java.util.Map;

final class zzabp implements zzt<Object> {
    private /* synthetic */ zzabn zzcqh;

    zzabp(zzabn zzabn) {
        this.zzcqh = zzabn;
    }

    public final void zza(Object obj, Map<String, String> map) {
        synchronized (this.zzcqh.mLock) {
            if (this.zzcqh.zzcqd.isDone()) {
                return;
            }
            zzabt zzabt = new zzabt(-2, map);
            if (this.zzcqh.zzcqb.equals(zzabt.getRequestId())) {
                String url = zzabt.getUrl();
                if (url == null) {
                    zzaiw.zzco("URL missing in loadAdUrl GMSG.");
                    return;
                }
                if (url.contains("%40mediation_adapters%40")) {
                    String replaceAll = url.replaceAll("%40mediation_adapters%40", zzafg.zzc(this.zzcqh.mContext, (String) map.get("check_adapters"), this.zzcqh.zzcqc));
                    zzabt.setUrl(replaceAll);
                    url = "Ad request URL modified to ";
                    replaceAll = String.valueOf(replaceAll);
                    zzafj.m5v(replaceAll.length() != 0 ? url.concat(replaceAll) : new String(url));
                }
                this.zzcqh.zzcqd.set(zzabt);
                return;
            }
        }
    }
}
