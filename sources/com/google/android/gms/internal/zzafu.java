package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

final class zzafu extends zzagj {
    private /* synthetic */ Context val$context;
    private /* synthetic */ String zzcys;

    zzafu(Context context, String str) {
        this.val$context = context;
        this.zzcys = str;
        super();
    }

    public final void zzdg() {
        Editor edit = this.val$context.getSharedPreferences("admob", 0).edit();
        edit.putString("native_advanced_settings", this.zzcys);
        edit.apply();
    }
}
