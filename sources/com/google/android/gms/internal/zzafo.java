package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

final class zzafo extends zzagj {
    private /* synthetic */ Context val$context;
    private /* synthetic */ boolean zzcyn;

    zzafo(Context context, boolean z) {
        this.val$context = context;
        this.zzcyn = z;
        super();
    }

    public final void zzdg() {
        Editor edit = this.val$context.getSharedPreferences("admob", 0).edit();
        edit.putBoolean("auto_collect_location", this.zzcyn);
        edit.apply();
    }
}
