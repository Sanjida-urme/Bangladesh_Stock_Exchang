package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.zzaiw;
import com.google.android.gms.internal.zzns;
import com.google.android.gms.internal.zznu;
import com.google.android.gms.internal.zzoc;
import java.util.List;

final class zzbd implements Runnable {
    private /* synthetic */ zzba zzaqs;
    private /* synthetic */ int zzaqt;
    private /* synthetic */ zzoc zzaqw;
    private /* synthetic */ List zzaqx;

    zzbd(zzba zzba, zzoc zzoc, int i, List list) {
        this.zzaqs = zzba;
        this.zzaqw = zzoc;
        this.zzaqt = i;
        this.zzaqx = list;
    }

    public final void run() {
        try {
            boolean z = false;
            zzba zzba;
            if ((this.zzaqw instanceof zznu) && this.zzaqs.zzamt.zzatq != null) {
                zzba = this.zzaqs;
                if (this.zzaqt != this.zzaqx.size() - 1) {
                    z = true;
                }
                zzba.zzamr = z;
                this.zzaqs.zzamt.zzatq.zza((zznu) this.zzaqw);
            } else if (!(this.zzaqw instanceof zzns) || this.zzaqs.zzamt.zzatp == null) {
                zza zza = this.zzaqs;
                if (this.zzaqt != this.zzaqx.size() - 1) {
                    z = true;
                }
                zza.zzc(3, z);
            } else {
                zzba = this.zzaqs;
                if (this.zzaqt != this.zzaqx.size() - 1) {
                    z = true;
                }
                zzba.zzamr = z;
                this.zzaqs.zzamt.zzatp.zza((zzns) this.zzaqw);
            }
        } catch (Throwable e) {
            zzaiw.zzc("Could not call onAppInstallAdLoaded or onContentAdLoaded method", e);
        }
    }
}
