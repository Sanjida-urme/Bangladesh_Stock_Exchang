package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

final class zzafy extends zzagj {
    private /* synthetic */ Context val$context;
    private /* synthetic */ long zzcyt;

    zzafy(Context context, long j) {
        this.val$context = context;
        this.zzcyt = j;
        super();
    }

    public final void zzdg() {
        Editor edit = this.val$context.getSharedPreferences("admob", 0).edit();
        edit.putLong("app_last_background_time_ms", this.zzcyt);
        edit.apply();
    }
}
