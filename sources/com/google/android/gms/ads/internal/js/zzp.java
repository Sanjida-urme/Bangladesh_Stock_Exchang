package com.google.android.gms.ads.internal.js;

import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.internal.zzagr;
import com.google.android.gms.internal.zzaim;
import com.google.android.gms.internal.zzaiw;
import com.google.android.gms.internal.zzcs;

final class zzp implements Runnable {
    final /* synthetic */ zzcs zzbzo;
    final /* synthetic */ zzaf zzbzp;
    final /* synthetic */ zzo zzbzq;

    zzp(zzo zzo, zzcs zzcs, zzaf zzaf) {
        this.zzbzq = zzo;
        this.zzbzo = zzcs;
        this.zzbzp = zzaf;
    }

    public final void run() {
        try {
            zzc zzg = new zzg(this.zzbzq.mContext, this.zzbzq.zzaov, this.zzbzo, null);
            zzg.zza(new zzq(this, zzg));
            zzg.zza("/jsLoaded", new zzt(this, zzg));
            zzaim zzaim = new zzaim();
            zzt zzu = new zzu(this, zzg, zzaim);
            zzaim.set(zzu);
            zzg.zza("/requestReload", zzu);
            if (this.zzbzq.zzbzj.endsWith(".js")) {
                zzg.zzba(this.zzbzq.zzbzj);
            } else if (this.zzbzq.zzbzj.startsWith("<html>")) {
                zzg.zzbc(this.zzbzq.zzbzj);
            } else {
                zzg.zzbb(this.zzbzq.zzbzj);
            }
            zzagr.zzczc.postDelayed(new zzv(this, zzg), (long) zzz.zzbzy);
        } catch (Throwable th) {
            zzaiw.zzb("Error creating webview.", th);
            zzbs.zzeg().zza(th, "SdkJavascriptFactory.loadJavascriptEngine");
            this.zzbzp.reject();
        }
    }
}
