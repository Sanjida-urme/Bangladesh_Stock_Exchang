package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@zzzb
public final class zztw implements zztl {
    private final Context mContext;
    private final Object mLock = new Object();
    private final long mStartTime;
    private final zzuc zzanb;
    private final boolean zzauu;
    private final zztn zzccq;
    private final boolean zzccu;
    private final boolean zzccv;
    private final zzzz zzcdj;
    private final long zzcdk;
    private final int zzcdl;
    private boolean zzcdm = false;
    private final Map<zzajp<zztt>, zztq> zzcdn = new HashMap();
    private final String zzcdo;
    private List<zztt> zzcdp = new ArrayList();

    public zztw(Context context, zzzz zzzz, zzuc zzuc, zztn zztn, boolean z, boolean z2, String str, long j, long j2, int i, boolean z3) {
        this.mContext = context;
        this.zzcdj = zzzz;
        this.zzanb = zzuc;
        this.zzccq = zztn;
        this.zzauu = z;
        this.zzccu = z2;
        this.zzcdo = str;
        this.mStartTime = j;
        this.zzcdk = j2;
        this.zzcdl = 2;
        this.zzccv = z3;
    }

    private final void zza(zzajp<zztt> zzajp) {
        zzagr.zzczc.post(new zzty(this, zzajp));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.zztt zzh(java.util.List<com.google.android.gms.internal.zzajp<com.google.android.gms.internal.zztt>> r4) {
        /*
        r3 = this;
        r0 = r3.mLock;
        monitor-enter(r0);
        r1 = r3.zzcdm;	 Catch:{ all -> 0x0047 }
        if (r1 == 0) goto L_0x000f;
    L_0x0007:
        r4 = new com.google.android.gms.internal.zztt;	 Catch:{ all -> 0x0047 }
        r1 = -1;
        r4.<init>(r1);	 Catch:{ all -> 0x0047 }
        monitor-exit(r0);	 Catch:{ all -> 0x0047 }
        return r4;
    L_0x000f:
        monitor-exit(r0);	 Catch:{ all -> 0x0047 }
        r4 = r4.iterator();
    L_0x0014:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x003c;
    L_0x001a:
        r0 = r4.next();
        r0 = (com.google.android.gms.internal.zzajp) r0;
        r1 = r0.get();	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        r1 = (com.google.android.gms.internal.zztt) r1;	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        r2 = r3.zzcdp;	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        r2.add(r1);	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        if (r1 == 0) goto L_0x0014;
    L_0x002d:
        r2 = r1.zzcdc;	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        if (r2 != 0) goto L_0x0014;
    L_0x0031:
        r3.zza(r0);	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        return r1;
    L_0x0035:
        r0 = move-exception;
        r1 = "Exception while processing an adapter; continuing with other adapters";
        com.google.android.gms.internal.zzaiw.zzc(r1, r0);
        goto L_0x0014;
    L_0x003c:
        r4 = 0;
        r3.zza(r4);
        r4 = new com.google.android.gms.internal.zztt;
        r0 = 1;
        r4.<init>(r0);
        return r4;
    L_0x0047:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0047 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zztw.zzh(java.util.List):com.google.android.gms.internal.zztt");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.zztt zzi(java.util.List<com.google.android.gms.internal.zzajp<com.google.android.gms.internal.zztt>> r15) {
        /*
        r14 = this;
        r0 = r14.mLock;
        monitor-enter(r0);
        r1 = r14.zzcdm;	 Catch:{ all -> 0x00ab }
        r2 = -1;
        if (r1 == 0) goto L_0x000f;
    L_0x0008:
        r15 = new com.google.android.gms.internal.zztt;	 Catch:{ all -> 0x00ab }
        r15.<init>(r2);	 Catch:{ all -> 0x00ab }
        monitor-exit(r0);	 Catch:{ all -> 0x00ab }
        return r15;
    L_0x000f:
        monitor-exit(r0);	 Catch:{ all -> 0x00ab }
        r0 = r14.zzccq;
        r0 = r0.zzccf;
        r3 = -1;
        r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r5 == 0) goto L_0x001f;
    L_0x001a:
        r0 = r14.zzccq;
        r0 = r0.zzccf;
        goto L_0x0021;
    L_0x001f:
        r0 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
    L_0x0021:
        r15 = r15.iterator();
        r3 = 0;
        r1 = r0;
        r0 = r3;
        r4 = -1;
    L_0x0029:
        r5 = r15.hasNext();
        if (r5 == 0) goto L_0x009e;
    L_0x002f:
        r5 = r15.next();
        r5 = (com.google.android.gms.internal.zzajp) r5;
        r6 = com.google.android.gms.ads.internal.zzbs.zzei();
        r6 = r6.currentTimeMillis();
        r8 = 0;
        r10 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1));
        if (r10 != 0) goto L_0x0054;
    L_0x0043:
        r10 = r5.isDone();	 Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
        if (r10 == 0) goto L_0x0054;
    L_0x0049:
        r10 = r5.get();	 Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
    L_0x004d:
        r10 = (com.google.android.gms.internal.zztt) r10;	 Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
        goto L_0x005b;
    L_0x0050:
        r15 = move-exception;
        goto L_0x008e;
    L_0x0052:
        r5 = move-exception;
        goto L_0x0078;
    L_0x0054:
        r10 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
        r10 = r5.get(r1, r10);	 Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
        goto L_0x004d;
    L_0x005b:
        r11 = r14.zzcdp;	 Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
        r11.add(r10);	 Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
        if (r10 == 0) goto L_0x007d;
    L_0x0062:
        r11 = r10.zzcdc;	 Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
        if (r11 != 0) goto L_0x007d;
    L_0x0066:
        r11 = r10.zzcdh;	 Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
        if (r11 == 0) goto L_0x007d;
    L_0x006a:
        r12 = r11.zzlw();	 Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
        if (r12 <= r4) goto L_0x007d;
    L_0x0070:
        r11 = r11.zzlw();	 Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
        r3 = r5;
        r0 = r10;
        r4 = r11;
        goto L_0x007d;
    L_0x0078:
        r10 = "Exception while processing an adapter; continuing with other adapters";
        com.google.android.gms.internal.zzaiw.zzc(r10, r5);	 Catch:{ all -> 0x0050 }
    L_0x007d:
        r5 = com.google.android.gms.ads.internal.zzbs.zzei();
        r10 = r5.currentTimeMillis();
        r12 = r10 - r6;
        r5 = r1 - r12;
        r1 = java.lang.Math.max(r5, r8);
        goto L_0x0029;
    L_0x008e:
        r0 = com.google.android.gms.ads.internal.zzbs.zzei();
        r3 = r0.currentTimeMillis();
        r10 = r3 - r6;
        r3 = r1 - r10;
        java.lang.Math.max(r3, r8);
        throw r15;
    L_0x009e:
        r14.zza(r3);
        if (r0 != 0) goto L_0x00aa;
    L_0x00a3:
        r15 = new com.google.android.gms.internal.zztt;
        r0 = 1;
        r15.<init>(r0);
        return r15;
    L_0x00aa:
        return r0;
    L_0x00ab:
        r15 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00ab }
        throw r15;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zztw.zzi(java.util.List):com.google.android.gms.internal.zztt");
    }

    public final void cancel() {
        synchronized (this.mLock) {
            this.zzcdm = true;
            for (zztq cancel : this.zzcdn.values()) {
                cancel.cancel();
            }
        }
    }

    public final zztt zzg(List<zztm> list) {
        ArrayList arrayList;
        zzaiw.zzbw("Starting mediation.");
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        ArrayList arrayList2 = new ArrayList();
        zziw zziw = this.zzcdj.zzath;
        int[] iArr = new int[2];
        if (zziw.zzbdc != null) {
            zzbs.zzew();
            if (zztv.zza(r0.zzcdo, iArr)) {
                int i = 0;
                int i2 = iArr[0];
                int i3 = iArr[1];
                zziw[] zziwArr = zziw.zzbdc;
                int length = zziwArr.length;
                while (i < length) {
                    zziw zziw2 = zziwArr[i];
                    if (i2 == zziw2.width && i3 == zziw2.height) {
                        zziw = zziw2;
                        break;
                    }
                    i++;
                }
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zztm zztm = (zztm) it.next();
            String str = "Trying mediation network: ";
            String valueOf = String.valueOf(zztm.zzcbc);
            zzaiw.zzcn(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            Iterator it2 = zztm.zzcbd.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                Context context = r0.mContext;
                zzuc zzuc = r0.zzanb;
                zztn zztn = r0.zzccq;
                zzis zzis = r0.zzcdj.zzclo;
                zzaiy zzaiy = r0.zzcdj.zzatd;
                boolean z = r0.zzauu;
                boolean z2 = r0.zzccu;
                Iterator it3 = it;
                zzom zzom = r0.zzcdj.zzatt;
                Iterator it4 = it2;
                ArrayList arrayList3 = arrayList2;
                zzaiy zzaiy2 = zzaiy;
                zztm zztm2 = zztm;
                zzis zzis2 = zzis;
                zziw zziw3 = zziw;
                zztq zztq = new zztq(context, str2, zzuc, zztn, zztm2, zzis2, zziw3, zzaiy2, z, z2, zzom, r0.zzcdj.zzaub, r0.zzcdj.zzcmd, r0.zzcdj.zzcmy, r0.zzccv);
                zzajp zza = zzagl.zza(newCachedThreadPool, new zztx(r0, zztq));
                r0.zzcdn.put(zza, zztq);
                arrayList = arrayList3;
                arrayList.add(zza);
                arrayList2 = arrayList;
                it = it3;
                it2 = it4;
            }
        }
        arrayList = arrayList2;
        return r0.zzcdl != 2 ? zzh(arrayList) : zzi(arrayList);
    }

    public final List<zztt> zzlo() {
        return this.zzcdp;
    }
}
