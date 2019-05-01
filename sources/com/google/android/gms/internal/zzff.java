package com.google.android.gms.internal;

import android.database.ContentObserver;
import android.os.Handler;

final class zzff extends ContentObserver {
    private /* synthetic */ zzfc zzavs;

    public zzff(zzfc zzfc, Handler handler) {
        this.zzavs = zzfc;
        super(handler);
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        this.zzavs.zzft();
    }
}
