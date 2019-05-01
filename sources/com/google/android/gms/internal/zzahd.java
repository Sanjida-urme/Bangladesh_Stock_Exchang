package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.view.View;

@TargetApi(18)
public class zzahd extends zzahc {
    public boolean isAttachedToWindow(View view) {
        if (!super.isAttachedToWindow(view)) {
            if (view.getWindowId() == null) {
                return false;
            }
        }
        return true;
    }

    public final int zzqb() {
        return 14;
    }
}
