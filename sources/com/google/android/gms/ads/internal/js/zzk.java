package com.google.android.gms.ads.internal.js;

final class zzk implements Runnable {
    private /* synthetic */ zzg zzbzf;
    private /* synthetic */ String zzbzg;

    zzk(zzg zzg, String str) {
        this.zzbzf = zzg;
        this.zzbzg = str;
    }

    public final void run() {
        this.zzbzf.zzbwq.loadData(this.zzbzg, "text/html", "UTF-8");
    }
}
