package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

@zzzb
@TargetApi(11)
public final class zzanf extends zzanh {
    public zzanf(zzama zzama, boolean z) {
        super(zzama, z);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zza(webView, str, null);
    }
}
