package com.google.android.gms.internal;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.ads.internal.zzbs;

final class zzop implements Runnable {
    private /* synthetic */ zzoe zzbty;
    private /* synthetic */ zzoo zzbtz;

    zzop(zzoo zzoo, zzoe zzoe) {
        this.zzbtz = zzoo;
        this.zzbty = zzoe;
    }

    public final void run() {
        zzama zzka;
        if (this.zzbtz.zzbtr) {
            if (this.zzbtz.zzbtq == null) {
                this.zzbtz.zzbtq = new View(this.zzbtz.zzbtp.getContext());
                this.zzbtz.zzbtq.setLayoutParams(new LayoutParams(-1, 0));
            }
            if (this.zzbtz.zzbtp != this.zzbtz.zzbtq.getParent()) {
                this.zzbtz.zzbtp.addView(this.zzbtz.zzbtq);
            }
        }
        try {
            zzka = this.zzbty.zzka();
        } catch (Throwable e) {
            zzbs.zzee();
            if (zzagw.zzqd()) {
                zzaiw.zzco("Privileged processes cannot create HTML overlays.");
            } else {
                zzaiw.zzb("Error obtaining overlay.", e);
            }
            zzka = null;
        }
        if (!(zzka == null || this.zzbtz.zzaln == null)) {
            FrameLayout frameLayout = this.zzbtz.zzaln;
            if (zzka == null) {
                throw null;
            }
            frameLayout.addView((View) zzka);
        }
        this.zzbtz.zza(this.zzbty);
    }
}
