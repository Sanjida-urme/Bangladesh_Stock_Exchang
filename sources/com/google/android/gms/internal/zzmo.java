package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.ConditionVariable;
import android.support.annotation.Nullable;

@zzzb
public final class zzmo {
    private Context mContext;
    private final Object mLock = new Object();
    private volatile boolean zzaqh = false;
    private final ConditionVariable zzbft = new ConditionVariable();
    @Nullable
    private SharedPreferences zzbfu = null;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void initialize(android.content.Context r4) {
        /*
        r3 = this;
        r0 = r3.zzaqh;
        if (r0 == 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r0 = r3.mLock;
        monitor-enter(r0);
        r1 = r3.zzaqh;	 Catch:{ all -> 0x0045 }
        if (r1 == 0) goto L_0x000e;
    L_0x000c:
        monitor-exit(r0);	 Catch:{ all -> 0x0045 }
        return;
    L_0x000e:
        r3.mContext = r4;	 Catch:{ all -> 0x0045 }
        r1 = com.google.android.gms.common.zzo.getRemoteContext(r4);	 Catch:{ all -> 0x003e }
        if (r1 != 0) goto L_0x001f;
    L_0x0016:
        if (r4 == 0) goto L_0x001f;
    L_0x0018:
        r1 = r4.getApplicationContext();	 Catch:{ all -> 0x003e }
        if (r1 != 0) goto L_0x001f;
    L_0x001e:
        r1 = r4;
    L_0x001f:
        if (r1 != 0) goto L_0x0028;
    L_0x0021:
        r4 = r3.zzbft;	 Catch:{ all -> 0x0045 }
        r4.open();	 Catch:{ all -> 0x0045 }
        monitor-exit(r0);	 Catch:{ all -> 0x0045 }
        return;
    L_0x0028:
        com.google.android.gms.ads.internal.zzbs.zzen();	 Catch:{ all -> 0x003e }
        r4 = "google_ads_flags";
        r2 = 0;
        r4 = r1.getSharedPreferences(r4, r2);	 Catch:{ all -> 0x003e }
        r3.zzbfu = r4;	 Catch:{ all -> 0x003e }
        r4 = 1;
        r3.zzaqh = r4;	 Catch:{ all -> 0x003e }
        r4 = r3.zzbft;	 Catch:{ all -> 0x0045 }
        r4.open();	 Catch:{ all -> 0x0045 }
        monitor-exit(r0);	 Catch:{ all -> 0x0045 }
        return;
    L_0x003e:
        r4 = move-exception;
        r1 = r3.zzbft;	 Catch:{ all -> 0x0045 }
        r1.open();	 Catch:{ all -> 0x0045 }
        throw r4;	 Catch:{ all -> 0x0045 }
    L_0x0045:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0045 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzmo.initialize(android.content.Context):void");
    }

    public final <T> T zzd(zzmg<T> zzmg) {
        if (this.zzbft.block(5000)) {
            if (!this.zzaqh || this.zzbfu == null) {
                synchronized (this.mLock) {
                    if (this.zzaqh) {
                        if (this.zzbfu == null) {
                        }
                    }
                    T zzip = zzmg.zzip();
                    return zzip;
                }
            }
            return zzain.zza(this.mContext, new zzmp(this, zzmg));
        }
        throw new IllegalStateException("Flags.initialize() was not called!");
    }
}
