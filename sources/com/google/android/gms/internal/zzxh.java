package com.google.android.gms.internal;

import android.content.Context;

@zzzb
public class zzxh extends zzwz implements zzamf {
    zzxh(Context context, zzaev zzaev, zzama zzama, zzxg zzxg) {
        super(context, zzaev, zzama, zzxg);
    }

    protected final void zzmw() {
        if (this.zzchw.errorCode == -2) {
            this.zzbwq.zzsq().zza((zzamf) this);
            zzmy();
            zzaiw.zzbw("Loading HTML in WebView.");
            this.zzbwq.loadDataWithBaseURL(this.zzchw.zzchl, this.zzchw.body, "text/html", "UTF-8", null);
        }
    }

    protected void zzmy() {
    }
}
