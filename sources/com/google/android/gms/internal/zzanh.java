package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.Nullable;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.zzbs;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@zzzb
@TargetApi(11)
public class zzanh extends zzamb {
    public zzanh(zzama zzama, boolean z) {
        super(zzama, z);
    }

    protected final WebResourceResponse zza(WebView webView, String str, @Nullable Map<String, String> map) {
        if (webView instanceof zzama) {
            zzama zzama = (zzama) webView;
            if (this.zzanv != null) {
                this.zzanv.zza(str, map, 1);
            }
            if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
                return super.shouldInterceptRequest(webView, str);
            }
            if (zzama.zzsq() != null) {
                zzama.zzsq().zzmp();
            }
            zzmg zzmg = zzama.zzso().zztx() ? zzmq.zzbhw : zzama.zzst() ? zzmq.zzbhv : zzmq.zzbhu;
            String str2 = (String) zzbs.zzep().zzd(zzmg);
            try {
                Context context = zzama.getContext();
                String str3 = zzama.zzsb().zzcp;
                Map hashMap = new HashMap();
                hashMap.put("User-Agent", zzbs.zzec().zzp(context, str3));
                hashMap.put("Cache-Control", "max-stale=3600");
                str2 = (String) new zzahy(context).zzb(str2, hashMap).get(60, TimeUnit.SECONDS);
                return str2 == null ? null : new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str2.getBytes("UTF-8")));
            } catch (Exception e) {
                str = "Could not fetch MRAID JS. ";
                str2 = String.valueOf(e.getMessage());
                zzaiw.zzco(str2.length() == 0 ? new String(str) : str.concat(str2));
                return null;
            }
        }
        zzaiw.zzco("Tried to intercept request from a WebView that wasn't an AdWebView.");
        return null;
    }
}
