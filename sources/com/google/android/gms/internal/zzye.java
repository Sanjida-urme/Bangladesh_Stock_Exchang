package com.google.android.gms.internal;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.lang.ref.WeakReference;

final class zzye implements OnGlobalLayoutListener {
    private /* synthetic */ zzxy zzcjv;
    private /* synthetic */ WeakReference zzcjx;

    zzye(zzxy zzxy, WeakReference weakReference) {
        this.zzcjv = zzxy;
        this.zzcjx = weakReference;
    }

    public final void onGlobalLayout() {
        this.zzcjv.zza(this.zzcjx, false);
    }
}
