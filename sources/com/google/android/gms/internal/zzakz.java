package com.google.android.gms.internal;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.common.internal.zzbq;

@zzzb
public final class zzakz {
    private final Context zzaif;
    private final zzali zzdew;
    private final ViewGroup zzdex;
    private zzakw zzdey;

    private zzakz(Context context, ViewGroup viewGroup, zzali zzali, zzakw zzakw) {
        this.zzaif = context;
        this.zzdex = viewGroup;
        this.zzdew = zzali;
        this.zzdey = null;
    }

    public zzakz(Context context, ViewGroup viewGroup, zzama zzama) {
        this(context, viewGroup, zzama, null);
    }

    public final void onDestroy() {
        zzbq.zzga("onDestroy must be called from the UI thread.");
        if (this.zzdey != null) {
            this.zzdey.destroy();
            this.zzdex.removeView(this.zzdey);
            this.zzdey = null;
        }
    }

    public final void onPause() {
        zzbq.zzga("onPause must be called from the UI thread.");
        if (this.zzdey != null) {
            this.zzdey.pause();
        }
    }

    public final void zza(int i, int i2, int i3, int i4, int i5, boolean z, zzalh zzalh) {
        if (this.zzdey == null) {
            zzmw.zza(r0.zzdew.zzsa().zziy(), r0.zzdew.zzry(), "vpr2");
            r0.zzdey = new zzakw(r0.zzaif, r0.zzdew, i5, z, r0.zzdew.zzsa().zziy(), zzalh);
            r0.zzdex.addView(r0.zzdey, 0, new LayoutParams(-1, -1));
            r0.zzdey.zzd(i, i2, i3, i4);
            r0.zzdew.zzab(false);
        }
    }

    public final void zze(int i, int i2, int i3, int i4) {
        zzbq.zzga("The underlay may only be modified from the UI thread.");
        if (this.zzdey != null) {
            this.zzdey.zzd(i, i2, i3, i4);
        }
    }

    public final zzakw zzrr() {
        zzbq.zzga("getAdVideoUnderlay must be called from the UI thread.");
        return this.zzdey;
    }
}
