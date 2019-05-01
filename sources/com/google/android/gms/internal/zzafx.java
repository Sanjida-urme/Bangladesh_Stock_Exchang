package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

final class zzafx extends zzagj {
    private /* synthetic */ Context val$context;

    zzafx(Context context) {
        this.val$context = context;
        super();
    }

    public final void zzdg() {
        Editor edit = this.val$context.getSharedPreferences("admob", 0).edit();
        edit.remove("native_advanced_settings");
        edit.apply();
    }
}
