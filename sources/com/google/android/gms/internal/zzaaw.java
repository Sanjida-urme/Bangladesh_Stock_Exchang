package com.google.android.gms.internal;

import org.json.JSONObject;

final class zzaaw implements Runnable {
    private /* synthetic */ zzaau zzcow;
    final /* synthetic */ JSONObject zzcox;
    final /* synthetic */ String zzcoy;

    zzaaw(zzaau zzaau, JSONObject jSONObject, String str) {
        this.zzcow = zzaau;
        this.zzcox = jSONObject;
        this.zzcoy = str;
    }

    public final void run() {
        this.zzcow.zzcov = zzaau.zzcke.zzb(null);
        this.zzcow.zzcov.zza(new zzaax(this), new zzaay(this));
    }
}
