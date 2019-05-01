package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.zzaeu;
import com.google.android.gms.internal.zzaiw;
import com.google.android.gms.internal.zznw;
import com.google.android.gms.internal.zzqh;

final class zzbg implements Runnable {
    private /* synthetic */ zzaeu zzaoc;
    private /* synthetic */ zzba zzaqs;
    private /* synthetic */ String zzaqy;

    zzbg(zzba zzba, String str, zzaeu zzaeu) {
        this.zzaqs = zzba;
        this.zzaqy = str;
        this.zzaoc = zzaeu;
    }

    public final void run() {
        try {
            ((zzqh) this.zzaqs.zzamt.zzats.get(this.zzaqy)).zzb((zznw) this.zzaoc.zzcvy);
        } catch (Throwable e) {
            zzaiw.zzc("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", e);
        }
    }
}
