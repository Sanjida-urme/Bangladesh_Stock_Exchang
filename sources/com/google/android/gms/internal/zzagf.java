package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

final class zzagf extends zzagj {
    private /* synthetic */ Context val$context;
    private /* synthetic */ boolean zzcyw;

    zzagf(Context context, boolean z) {
        this.val$context = context;
        this.zzcyw = z;
        super();
    }

    public final void zzdg() {
        Editor edit = this.val$context.getSharedPreferences("admob", 0).edit();
        edit.putBoolean("content_url_opted_out", this.zzcyw);
        edit.apply();
    }
}
