package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

final class zzagc extends zzagj {
    private /* synthetic */ Context val$context;
    private /* synthetic */ long zzcyv;

    zzagc(Context context, long j) {
        this.val$context = context;
        this.zzcyv = j;
        super();
    }

    public final void zzdg() {
        Editor edit = this.val$context.getSharedPreferences("admob", 0).edit();
        edit.putLong("first_ad_req_time_ms", this.zzcyv);
        edit.apply();
    }
}
