package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

final class zzagh extends zzagj {
    private /* synthetic */ Context val$context;
    private /* synthetic */ String zzcym;

    zzagh(Context context, String str) {
        this.val$context = context;
        this.zzcym = str;
        super();
    }

    public final void zzdg() {
        Editor edit = this.val$context.getSharedPreferences("admob", 0).edit();
        edit.putString("content_url_hashes", this.zzcym);
        edit.apply();
    }
}
