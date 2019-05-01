package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.zzbs;

@zzzb
public final class zzgp {
    private final Object zzaxz = new Object();
    private zzgq zzaya = null;
    private boolean zzayb = false;

    @Nullable
    public final Activity getActivity() {
        synchronized (this.zzaxz) {
            if (this.zzaya != null) {
                Activity activity = this.zzaya.getActivity();
                return activity;
            }
            return null;
        }
    }

    @Nullable
    public final Context getContext() {
        synchronized (this.zzaxz) {
            if (this.zzaya != null) {
                Context context = this.zzaya.getContext();
                return context;
            }
            return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void initialize(android.content.Context r5) {
        /*
        r4 = this;
        r0 = r4.zzaxz;
        monitor-enter(r0);
        r1 = r4.zzayb;	 Catch:{ all -> 0x0048 }
        if (r1 != 0) goto L_0x0046;
    L_0x0007:
        r1 = com.google.android.gms.internal.zzmq.zzbjq;	 Catch:{ all -> 0x0048 }
        r2 = com.google.android.gms.ads.internal.zzbs.zzep();	 Catch:{ all -> 0x0048 }
        r1 = r2.zzd(r1);	 Catch:{ all -> 0x0048 }
        r1 = (java.lang.Boolean) r1;	 Catch:{ all -> 0x0048 }
        r1 = r1.booleanValue();	 Catch:{ all -> 0x0048 }
        if (r1 != 0) goto L_0x001b;
    L_0x0019:
        monitor-exit(r0);	 Catch:{ all -> 0x0048 }
        return;
    L_0x001b:
        r1 = 0;
        r2 = r5.getApplicationContext();	 Catch:{ all -> 0x0048 }
        if (r2 != 0) goto L_0x0023;
    L_0x0022:
        r2 = r5;
    L_0x0023:
        r3 = r2 instanceof android.app.Application;	 Catch:{ all -> 0x0048 }
        if (r3 == 0) goto L_0x002a;
    L_0x0027:
        r1 = r2;
        r1 = (android.app.Application) r1;	 Catch:{ all -> 0x0048 }
    L_0x002a:
        if (r1 != 0) goto L_0x0033;
    L_0x002c:
        r5 = "Can not cast Context to Application";
        com.google.android.gms.internal.zzaiw.zzco(r5);	 Catch:{ all -> 0x0048 }
        monitor-exit(r0);	 Catch:{ all -> 0x0048 }
        return;
    L_0x0033:
        r2 = r4.zzaya;	 Catch:{ all -> 0x0048 }
        if (r2 != 0) goto L_0x003e;
    L_0x0037:
        r2 = new com.google.android.gms.internal.zzgq;	 Catch:{ all -> 0x0048 }
        r2.<init>();	 Catch:{ all -> 0x0048 }
        r4.zzaya = r2;	 Catch:{ all -> 0x0048 }
    L_0x003e:
        r2 = r4.zzaya;	 Catch:{ all -> 0x0048 }
        r2.zza(r1, r5);	 Catch:{ all -> 0x0048 }
        r5 = 1;
        r4.zzayb = r5;	 Catch:{ all -> 0x0048 }
    L_0x0046:
        monitor-exit(r0);	 Catch:{ all -> 0x0048 }
        return;
    L_0x0048:
        r5 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0048 }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzgp.initialize(android.content.Context):void");
    }

    public final void zza(zzgs zzgs) {
        synchronized (this.zzaxz) {
            if (((Boolean) zzbs.zzep().zzd(zzmq.zzbjq)).booleanValue()) {
                if (this.zzaya == null) {
                    this.zzaya = new zzgq();
                }
                this.zzaya.zza(zzgs);
                return;
            }
        }
    }
}
