package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

final class zzaga extends zzagj {
    private /* synthetic */ Context val$context;
    private /* synthetic */ int zzcyu;

    zzaga(Context context, int i) {
        this.val$context = context;
        this.zzcyu = i;
        super();
    }

    public final void zzdg() {
        Editor edit = this.val$context.getSharedPreferences("admob", 0).edit();
        edit.putInt("request_in_session_count", this.zzcyu);
        edit.apply();
    }
}
