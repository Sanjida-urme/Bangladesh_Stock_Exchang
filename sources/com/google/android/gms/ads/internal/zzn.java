package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class zzn implements OnTouchListener {
    private /* synthetic */ zzl zzani;
    private /* synthetic */ zzw zzanj;

    zzn(zzl zzl, zzw zzw) {
        this.zzani = zzl;
        this.zzanj = zzw;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.zzanj.recordClick();
        if (this.zzani.zzang != null) {
            this.zzani.zzang.zzog();
        }
        return false;
    }
}
