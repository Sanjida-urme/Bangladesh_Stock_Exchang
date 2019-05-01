package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

final class zzafm extends zzagj {
    private /* synthetic */ Context val$context;
    private /* synthetic */ boolean zzcyl;

    zzafm(Context context, boolean z) {
        this.val$context = context;
        this.zzcyl = z;
        super();
    }

    public final void zzdg() {
        Editor edit = this.val$context.getSharedPreferences("admob", 0).edit();
        edit.putBoolean("use_https", this.zzcyl);
        edit.apply();
    }
}
