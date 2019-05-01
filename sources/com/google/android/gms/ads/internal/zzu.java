package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.zzaiw;
import com.google.android.gms.internal.zzpu;
import com.google.android.gms.internal.zzqh;

final class zzu implements Runnable {
    private /* synthetic */ zzq zzanm;
    private /* synthetic */ zzpu zzanp;

    zzu(zzq zzq, zzpu zzpu) {
        this.zzanm = zzq;
        this.zzanp = zzpu;
    }

    public final void run() {
        try {
            ((zzqh) this.zzanm.zzamt.zzats.get(this.zzanp.getCustomTemplateId())).zzb(this.zzanp);
        } catch (Throwable e) {
            zzaiw.zzc("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", e);
        }
    }
}
