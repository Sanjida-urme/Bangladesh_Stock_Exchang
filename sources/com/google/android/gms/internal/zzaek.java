package com.google.android.gms.internal;

import android.content.Context;

@zzzb
public final class zzaek implements zzgc {
    private final Context mContext;
    private final Object mLock = new Object();
    private String zzaou;
    private boolean zzcvd = false;

    public zzaek(Context context, String str) {
        this.mContext = context;
        this.zzaou = str;
    }

    public final void setAdUnitId(String str) {
        this.zzaou = str;
    }

    public final void zza(zzgb zzgb) {
        zzu(zzgb.zzaxe);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzu(boolean r4) {
        /*
        r3 = this;
        r0 = com.google.android.gms.ads.internal.zzbs.zzfa();
        r1 = r3.mContext;
        r0 = r0.zzr(r1);
        if (r0 != 0) goto L_0x000d;
    L_0x000c:
        return;
    L_0x000d:
        r0 = r3.mLock;
        monitor-enter(r0);
        r1 = r3.zzcvd;	 Catch:{ all -> 0x003f }
        if (r1 != r4) goto L_0x0016;
    L_0x0014:
        monitor-exit(r0);	 Catch:{ all -> 0x003f }
        return;
    L_0x0016:
        r3.zzcvd = r4;	 Catch:{ all -> 0x003f }
        r4 = r3.zzaou;	 Catch:{ all -> 0x003f }
        r4 = android.text.TextUtils.isEmpty(r4);	 Catch:{ all -> 0x003f }
        if (r4 == 0) goto L_0x0022;
    L_0x0020:
        monitor-exit(r0);	 Catch:{ all -> 0x003f }
        return;
    L_0x0022:
        r4 = r3.zzcvd;	 Catch:{ all -> 0x003f }
        if (r4 == 0) goto L_0x0032;
    L_0x0026:
        r4 = com.google.android.gms.ads.internal.zzbs.zzfa();	 Catch:{ all -> 0x003f }
        r1 = r3.mContext;	 Catch:{ all -> 0x003f }
        r2 = r3.zzaou;	 Catch:{ all -> 0x003f }
        r4.zzb(r1, r2);	 Catch:{ all -> 0x003f }
        goto L_0x003d;
    L_0x0032:
        r4 = com.google.android.gms.ads.internal.zzbs.zzfa();	 Catch:{ all -> 0x003f }
        r1 = r3.mContext;	 Catch:{ all -> 0x003f }
        r2 = r3.zzaou;	 Catch:{ all -> 0x003f }
        r4.zzc(r1, r2);	 Catch:{ all -> 0x003f }
    L_0x003d:
        monitor-exit(r0);	 Catch:{ all -> 0x003f }
        return;
    L_0x003f:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x003f }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzaek.zzu(boolean):void");
    }
}
