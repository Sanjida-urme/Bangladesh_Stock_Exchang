package com.google.android.gms.ads.internal;

import android.webkit.CookieManager;
import com.google.android.gms.internal.zzmq;
import java.util.concurrent.Callable;

final class zze implements Callable<String> {
    private /* synthetic */ zzd zzand;

    zze(zzd zzd) {
        this.zzand = zzd;
    }

    public final /* synthetic */ Object call() throws Exception {
        String str = "";
        if (!((Boolean) zzbs.zzep().zzd(zzmq.zzboh)).booleanValue()) {
            return str;
        }
        CookieManager zzax = zzbs.zzee().zzax(this.zzand.zzamt.zzaif);
        return zzax != null ? zzax.getCookie("googleads.g.doubleclick.net") : str;
    }
}
