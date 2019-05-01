package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.zzbs;

@zzzb
public final class zzafk extends Handler {
    public zzafk(Looper looper) {
        super(looper);
    }

    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Throwable e) {
            zzbs.zzeg().zza(e, "AdMobHandler.handleMessage");
        }
    }
}
