package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

final class zzafq extends zzagj {
    private /* synthetic */ Context val$context;
    private /* synthetic */ int zzcyp;

    zzafq(Context context, int i) {
        this.val$context = context;
        this.zzcyp = i;
        super();
    }

    public final void zzdg() {
        Editor edit = this.val$context.getSharedPreferences("admob", 0).edit();
        edit.putInt("version_code", this.zzcyp);
        edit.apply();
    }
}
