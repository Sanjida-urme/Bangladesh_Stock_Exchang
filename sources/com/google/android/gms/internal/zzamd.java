package com.google.android.gms.internal;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;

final class zzamd implements OnAttachStateChangeListener {
    private /* synthetic */ zzaeh zzdiq;
    private /* synthetic */ zzamb zzdis;

    zzamd(zzamb zzamb, zzaeh zzaeh) {
        this.zzdis = zzamb;
        this.zzdiq = zzaeh;
    }

    public final void onViewAttachedToWindow(View view) {
        this.zzdis.zza(view, this.zzdiq, 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
