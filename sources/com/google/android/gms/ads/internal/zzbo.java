package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class zzbo implements OnTouchListener {
    private /* synthetic */ zzbm zzarm;

    zzbo(zzbm zzbm) {
        this.zzarm = zzbm;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.zzarm.zzark != null) {
            this.zzarm.zzark.zza(motionEvent);
        }
        return false;
    }
}
