package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import android.view.View;
import java.lang.ref.WeakReference;

public final class zzfe implements zzgm {
    private WeakReference<zzoa> zzavt;

    public zzfe(zzoa zzoa) {
        this.zzavt = new WeakReference(zzoa);
    }

    @Nullable
    public final View zzfz() {
        zzoa zzoa = (zzoa) this.zzavt.get();
        return zzoa != null ? zzoa.zzkd() : null;
    }

    public final boolean zzga() {
        return this.zzavt.get() == null;
    }

    public final zzgm zzgb() {
        return new zzfg((zzoa) this.zzavt.get());
    }
}
