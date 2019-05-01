package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.SystemClock;

public final class zzj {
    private static IntentFilter zzgcb = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    private static long zzgcc = 0;
    private static float zzgcd = Float.NaN;

    @TargetApi(20)
    public static int zzct(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return -1;
        }
        Intent registerReceiver = context.getApplicationContext().registerReceiver(null, zzgcb);
        int i = 0;
        int i2 = ((registerReceiver == null ? 0 : registerReceiver.getIntExtra("plugged", 0)) & 7) != 0 ? 1 : 0;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return -1;
        }
        if (zzq.zzamb() ? powerManager.isInteractive() : powerManager.isScreenOn()) {
            i = 1;
        }
        return (i << 1) | i2;
    }

    public static synchronized float zzcu(Context context) {
        synchronized (zzj.class) {
            if (SystemClock.elapsedRealtime() - zzgcc >= 60000 || Float.isNaN(zzgcd)) {
                Intent registerReceiver = context.getApplicationContext().registerReceiver(null, zzgcb);
                if (registerReceiver != null) {
                    zzgcd = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
                }
                zzgcc = SystemClock.elapsedRealtime();
                float f = zzgcd;
                return f;
            }
            f = zzgcd;
            return f;
        }
    }
}
