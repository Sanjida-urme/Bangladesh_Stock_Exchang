package com.google.android.gms.internal;

import com.google.android.gms.dynamic.zzn;

final class zzadg implements Runnable {
    private /* synthetic */ zzis zzaox;
    private /* synthetic */ zzuf zzctt;
    private /* synthetic */ zzade zzctu;
    private /* synthetic */ zzadm zzctv;

    zzadg(zzade zzade, zzuf zzuf, zzis zzis, zzadm zzadm) {
        this.zzctu = zzade;
        this.zzctt = zzuf;
        this.zzaox = zzis;
        this.zzctv = zzadm;
    }

    public final void run() {
        try {
            this.zzctt.zza(zzn.zzy(this.zzctu.mContext), this.zzaox, null, this.zzctv, this.zzctu.zzcto);
        } catch (Throwable e) {
            String str = "Fail to initialize adapter ";
            String valueOf = String.valueOf(this.zzctu.zzcco);
            zzaiw.zzc(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), e);
            this.zzctu.zza(this.zzctu.zzcco, 0);
        }
    }
}
