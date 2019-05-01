package com.google.android.gms.ads.internal;

import android.os.Debug;
import com.google.android.gms.internal.zzaiw;
import com.google.android.gms.internal.zzmq;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;

final class zzb extends TimerTask {
    private /* synthetic */ CountDownLatch zzamx;
    private /* synthetic */ Timer zzamy;
    private /* synthetic */ zza zzamz;

    zzb(zza zza, CountDownLatch countDownLatch, Timer timer) {
        this.zzamz = zza;
        this.zzamx = countDownLatch;
        this.zzamy = timer;
    }

    public final void run() {
        if (((long) ((Integer) zzbs.zzep().zzd(zzmq.zzbni)).intValue()) != this.zzamx.getCount()) {
            zzaiw.zzbw("Stopping method tracing");
            Debug.stopMethodTracing();
            if (this.zzamx.getCount() == 0) {
                this.zzamy.cancel();
                return;
            }
        }
        String concat = String.valueOf(this.zzamz.zzamt.zzaif.getPackageName()).concat("_adsTrace_");
        try {
            zzaiw.zzbw("Starting method tracing");
            this.zzamx.countDown();
            long currentTimeMillis = zzbs.zzei().currentTimeMillis();
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(concat).length() + 20);
            stringBuilder.append(concat);
            stringBuilder.append(currentTimeMillis);
            Debug.startMethodTracing(stringBuilder.toString(), ((Integer) zzbs.zzep().zzd(zzmq.zzbnj)).intValue());
        } catch (Throwable e) {
            zzaiw.zzc("Exception occurred while starting method tracing.", e);
        }
    }
}
