package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public final class zzae {
    private static Comparator<byte[]> zzbs = new zzaf();
    private final List<byte[]> zzbo = new LinkedList();
    private final List<byte[]> zzbp = new ArrayList(64);
    private int zzbq = 0;
    private final int zzbr = 4096;

    public zzae(int i) {
    }

    private final synchronized void zzm() {
        while (this.zzbq > this.zzbr) {
            byte[] bArr = (byte[]) this.zzbo.remove(0);
            this.zzbp.remove(bArr);
            this.zzbq -= bArr.length;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zza(byte[] r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        if (r3 == 0) goto L_0x002e;
    L_0x0003:
        r0 = r3.length;	 Catch:{ all -> 0x002b }
        r1 = r2.zzbr;	 Catch:{ all -> 0x002b }
        if (r0 <= r1) goto L_0x0009;
    L_0x0008:
        goto L_0x002e;
    L_0x0009:
        r0 = r2.zzbo;	 Catch:{ all -> 0x002b }
        r0.add(r3);	 Catch:{ all -> 0x002b }
        r0 = r2.zzbp;	 Catch:{ all -> 0x002b }
        r1 = zzbs;	 Catch:{ all -> 0x002b }
        r0 = java.util.Collections.binarySearch(r0, r3, r1);	 Catch:{ all -> 0x002b }
        if (r0 >= 0) goto L_0x001b;
    L_0x0018:
        r0 = -r0;
        r0 = r0 + -1;
    L_0x001b:
        r1 = r2.zzbp;	 Catch:{ all -> 0x002b }
        r1.add(r0, r3);	 Catch:{ all -> 0x002b }
        r0 = r2.zzbq;	 Catch:{ all -> 0x002b }
        r3 = r3.length;	 Catch:{ all -> 0x002b }
        r0 = r0 + r3;
        r2.zzbq = r0;	 Catch:{ all -> 0x002b }
        r2.zzm();	 Catch:{ all -> 0x002b }
        monitor-exit(r2);
        return;
    L_0x002b:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
    L_0x002e:
        monitor-exit(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzae.zza(byte[]):void");
    }

    public final synchronized byte[] zzb(int i) {
        for (int i2 = 0; i2 < this.zzbp.size(); i2++) {
            byte[] bArr = (byte[]) this.zzbp.get(i2);
            if (bArr.length >= i) {
                this.zzbq -= bArr.length;
                this.zzbp.remove(i2);
                this.zzbo.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }
}
