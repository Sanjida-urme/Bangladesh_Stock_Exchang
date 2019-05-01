package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

final class zzafs extends zzagj {
    private /* synthetic */ Context val$context;
    private /* synthetic */ String zzcyq;
    private /* synthetic */ long zzcyr;

    zzafs(Context context, String str, long j) {
        this.val$context = context;
        this.zzcyq = str;
        this.zzcyr = j;
        super();
    }

    public final void zzdg() {
        Editor edit = this.val$context.getSharedPreferences("admob", 0).edit();
        edit.putString("app_settings_json", this.zzcyq);
        edit.putLong("app_settings_last_update_ms", this.zzcyr);
        edit.apply();
    }
}
