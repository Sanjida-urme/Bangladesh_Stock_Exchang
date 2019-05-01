package com.google.android.gms.internal;

import android.content.Context;
import android.os.Binder;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.zzbs;

@zzzb
public final class zzhm {
    @Nullable
    private Context mContext;
    private final Object mLock = new Object();
    private final Runnable zzbab = new zzhn(this);
    @Nullable
    private zzht zzbac;
    @Nullable
    private zzhx zzbad;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void connect() {
        /*
        r6 = this;
        r0 = r6.mLock;
        monitor-enter(r0);
        r1 = r6.mContext;	 Catch:{ all -> 0x0030 }
        if (r1 == 0) goto L_0x002e;
    L_0x0007:
        r1 = r6.zzbac;	 Catch:{ all -> 0x0030 }
        if (r1 == 0) goto L_0x000c;
    L_0x000b:
        goto L_0x002e;
    L_0x000c:
        r1 = new com.google.android.gms.internal.zzhp;	 Catch:{ all -> 0x0030 }
        r1.<init>(r6);	 Catch:{ all -> 0x0030 }
        r2 = new com.google.android.gms.internal.zzhq;	 Catch:{ all -> 0x0030 }
        r2.<init>(r6);	 Catch:{ all -> 0x0030 }
        r3 = new com.google.android.gms.internal.zzht;	 Catch:{ all -> 0x0030 }
        r4 = r6.mContext;	 Catch:{ all -> 0x0030 }
        r5 = com.google.android.gms.ads.internal.zzbs.zzet();	 Catch:{ all -> 0x0030 }
        r5 = r5.zzqm();	 Catch:{ all -> 0x0030 }
        r3.<init>(r4, r5, r1, r2);	 Catch:{ all -> 0x0030 }
        r6.zzbac = r3;	 Catch:{ all -> 0x0030 }
        r1 = r6.zzbac;	 Catch:{ all -> 0x0030 }
        r1.zzajy();	 Catch:{ all -> 0x0030 }
        monitor-exit(r0);	 Catch:{ all -> 0x0030 }
        return;
    L_0x002e:
        monitor-exit(r0);	 Catch:{ all -> 0x0030 }
        return;
    L_0x0030:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0030 }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzhm.connect():void");
    }

    private final void disconnect() {
        synchronized (this.mLock) {
            if (this.zzbac == null) {
                return;
            }
            if (this.zzbac.isConnected() || this.zzbac.isConnecting()) {
                this.zzbac.disconnect();
            }
            this.zzbac = null;
            this.zzbad = null;
            Binder.flushPendingCommands();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void initialize(android.content.Context r3) {
        /*
        r2 = this;
        if (r3 != 0) goto L_0x0003;
    L_0x0002:
        return;
    L_0x0003:
        r0 = r2.mLock;
        monitor-enter(r0);
        r1 = r2.mContext;	 Catch:{ all -> 0x0048 }
        if (r1 == 0) goto L_0x000c;
    L_0x000a:
        monitor-exit(r0);	 Catch:{ all -> 0x0048 }
        return;
    L_0x000c:
        r3 = r3.getApplicationContext();	 Catch:{ all -> 0x0048 }
        r2.mContext = r3;	 Catch:{ all -> 0x0048 }
        r3 = com.google.android.gms.internal.zzmq.zzbom;	 Catch:{ all -> 0x0048 }
        r1 = com.google.android.gms.ads.internal.zzbs.zzep();	 Catch:{ all -> 0x0048 }
        r3 = r1.zzd(r3);	 Catch:{ all -> 0x0048 }
        r3 = (java.lang.Boolean) r3;	 Catch:{ all -> 0x0048 }
        r3 = r3.booleanValue();	 Catch:{ all -> 0x0048 }
        if (r3 == 0) goto L_0x0028;
    L_0x0024:
        r2.connect();	 Catch:{ all -> 0x0048 }
        goto L_0x0046;
    L_0x0028:
        r3 = com.google.android.gms.internal.zzmq.zzbol;	 Catch:{ all -> 0x0048 }
        r1 = com.google.android.gms.ads.internal.zzbs.zzep();	 Catch:{ all -> 0x0048 }
        r3 = r1.zzd(r3);	 Catch:{ all -> 0x0048 }
        r3 = (java.lang.Boolean) r3;	 Catch:{ all -> 0x0048 }
        r3 = r3.booleanValue();	 Catch:{ all -> 0x0048 }
        if (r3 == 0) goto L_0x0046;
    L_0x003a:
        r3 = new com.google.android.gms.internal.zzho;	 Catch:{ all -> 0x0048 }
        r3.<init>(r2);	 Catch:{ all -> 0x0048 }
        r1 = com.google.android.gms.ads.internal.zzbs.zzef();	 Catch:{ all -> 0x0048 }
        r1.zza(r3);	 Catch:{ all -> 0x0048 }
    L_0x0046:
        monitor-exit(r0);	 Catch:{ all -> 0x0048 }
        return;
    L_0x0048:
        r3 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0048 }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzhm.initialize(android.content.Context):void");
    }

    public final zzhr zza(zzhu zzhu) {
        synchronized (this.mLock) {
            if (this.zzbad == null) {
                zzhr zzhr = new zzhr();
                return zzhr;
            }
            try {
                zzhr = this.zzbad.zza(zzhu);
                return zzhr;
            } catch (Throwable e) {
                zzaiw.zzb("Unable to call into cache service.", e);
                return new zzhr();
            }
        }
    }

    public final void zzhb() {
        if (((Boolean) zzbs.zzep().zzd(zzmq.zzbon)).booleanValue()) {
            synchronized (this.mLock) {
                connect();
                zzbs.zzec();
                zzagr.zzczc.removeCallbacks(this.zzbab);
                zzbs.zzec();
                zzagr.zzczc.postDelayed(this.zzbab, ((Long) zzbs.zzep().zzd(zzmq.zzboo)).longValue());
            }
        }
    }
}
