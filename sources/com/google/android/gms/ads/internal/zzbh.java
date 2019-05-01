package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.zzaiw;
import com.google.android.gms.internal.zzpu;
import com.google.android.gms.internal.zzqh;

final class zzbh implements Runnable {
    private /* synthetic */ zzpu zzanp;
    private /* synthetic */ zzba zzaqs;

    zzbh(zzba zzba, zzpu zzpu) {
        this.zzaqs = zzba;
        this.zzanp = zzpu;
    }

    public final void run() {
        try {
            ((zzqh) this.zzaqs.zzamt.zzats.get(this.zzanp.getCustomTemplateId())).zzb(this.zzanp);
        } catch (Throwable e) {
            zzaiw.zzc("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", e);
        }
    }
}
