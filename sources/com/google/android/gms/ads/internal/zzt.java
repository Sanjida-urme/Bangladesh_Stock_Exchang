package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.zzaiw;
import com.google.android.gms.internal.zznu;

final class zzt implements Runnable {
    private /* synthetic */ zzq zzanm;
    private /* synthetic */ zznu zzano;

    zzt(zzq zzq, zznu zznu) {
        this.zzanm = zzq;
        this.zzano = zznu;
    }

    public final void run() {
        try {
            if (this.zzanm.zzamt.zzatq != null) {
                this.zzanm.zzamt.zzatq.zza(this.zzano);
            }
        } catch (Throwable e) {
            zzaiw.zzc("Could not call OnContentAdLoadedListener.onContentAdLoaded().", e);
        }
    }
}
