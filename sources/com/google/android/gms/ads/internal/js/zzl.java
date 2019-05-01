package com.google.android.gms.ads.internal.js;

final class zzl implements Runnable {
    private /* synthetic */ String zzbza;
    private /* synthetic */ zzg zzbzf;

    zzl(zzg zzg, String str) {
        this.zzbzf = zzg;
        this.zzbza = str;
    }

    public final void run() {
        this.zzbzf.zzbwq.loadUrl(this.zzbza);
    }
}
