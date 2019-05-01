package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import android.view.View;

public final class zzfh implements zzgm {
    @Nullable
    private final View mView;
    @Nullable
    private final zzaeu zzavv;

    public zzfh(View view, zzaeu zzaeu) {
        this.mView = view;
        this.zzavv = zzaeu;
    }

    public final View zzfz() {
        return this.mView;
    }

    public final boolean zzga() {
        if (this.zzavv != null) {
            if (this.mView != null) {
                return false;
            }
        }
        return true;
    }

    public final zzgm zzgb() {
        return this;
    }
}
