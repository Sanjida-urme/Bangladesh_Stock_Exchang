package com.google.android.gms.ads.internal.js;

final class zzaj implements Runnable {
    private /* synthetic */ zzc zzcah;
    private /* synthetic */ zzai zzcai;

    zzaj(zzai zzai, zzc zzc) {
        this.zzcai = zzai;
        this.zzcah = zzc;
    }

    public final void run() {
        this.zzcai.zzcag.zzbzl.zzf(this.zzcah);
        this.zzcah.destroy();
    }
}
