package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@zzzb
public final class zztz implements zztl {
    private final Context mContext;
    private final Object mLock = new Object();
    private final long mStartTime;
    private final zznd zzamo;
    private final zzuc zzanb;
    private final boolean zzauu;
    private final zztn zzccq;
    private final boolean zzccu;
    private final boolean zzccv;
    private final zzzz zzcdj;
    private final long zzcdk;
    private boolean zzcdm = false;
    private final String zzcdo;
    private List<zztt> zzcdp = new ArrayList();
    private zztq zzcdt;

    public zztz(Context context, zzzz zzzz, zzuc zzuc, zztn zztn, boolean z, boolean z2, String str, long j, long j2, zznd zznd, boolean z3) {
        this.mContext = context;
        this.zzcdj = zzzz;
        this.zzanb = zzuc;
        this.zzccq = zztn;
        this.zzauu = z;
        this.zzccu = z2;
        this.zzcdo = str;
        this.mStartTime = j;
        this.zzcdk = j2;
        this.zzamo = zznd;
        this.zzccv = z3;
    }

    public final void cancel() {
        synchronized (this.mLock) {
            this.zzcdm = true;
            if (this.zzcdt != null) {
                this.zzcdt.cancel();
            }
        }
    }

    public final zztt zzg(List<zztm> list) {
        Throwable th;
        ArrayList arrayList;
        zzaiw.zzbw("Starting mediation.");
        ArrayList arrayList2 = new ArrayList();
        zznb zziz = this.zzamo.zziz();
        zziw zziw = this.zzcdj.zzath;
        int[] iArr = new int[2];
        if (zziw.zzbdc != null) {
            zzbs.zzew();
            if (zztv.zza(r1.zzcdo, iArr)) {
                int i = iArr[0];
                int i2 = iArr[1];
                for (zziw zziw2 : zziw.zzbdc) {
                    if (i == zziw2.width && i2 == zziw2.height) {
                        zziw = zziw2;
                        break;
                    }
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
                valueOf = (String) it2.next();
                zznb zziz2 = r1.zzamo.zziz();
                Object obj = r1.mLock;
                synchronized (obj) {
                    Object obj2;
                    try {
                        if (r1.zzcdm) {
                            try {
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                obj2 = obj;
                                throw th3;
                            }
                        }
                        Iterator it3 = it;
                        Iterator it4 = it2;
                        zznb zznb = zziz;
                        zznb zznb2 = zziz2;
                        zztq zztq = zztq;
                        ArrayList arrayList3 = arrayList2;
                        zztq zztq2 = zztq;
                        obj2 = obj;
                        try {
                            zztq = new zztq(r1.mContext, valueOf, r1.zzanb, r1.zzccq, zztm, r1.zzcdj.zzclo, zziw, r1.zzcdj.zzatd, r1.zzauu, r1.zzccu, r1.zzcdj.zzatt, r1.zzcdj.zzaub, r1.zzcdj.zzcmd, r1.zzcdj.zzcmy, r1.zzccv);
                            r1.zzcdt = zztq2;
                            zztt zza = r1.zzcdt.zza(r1.mStartTime, r1.zzcdk);
                            r1.zzcdp.add(zza);
                            if (zza.zzcdc == 0) {
                                zzaiw.zzbw("Adapter succeeded.");
                                r1.zzamo.zzf("mediation_network_succeed", valueOf);
                                arrayList = arrayList3;
                                if (!arrayList.isEmpty()) {
                                    r1.zzamo.zzf("mediation_networks_fail", TextUtils.join(",", arrayList));
                                }
                                r1.zzamo.zza(zznb2, "mls");
                                r1.zzamo.zza(zznb, "ttm");
                                return zza;
                            }
                            zznb zznb3 = zznb;
                            zznb zznb4 = zznb2;
                            arrayList = arrayList3;
                            arrayList.add(valueOf);
                            r1.zzamo.zza(zznb4, "mlf");
                            if (zza.zzcde != null) {
                                zzagr.zzczc.post(new zzua(r1, zza));
                            }
                            arrayList2 = arrayList;
                            zziz = zznb3;
                            it = it3;
                            it2 = it4;
                        } catch (Throwable th4) {
                            th2 = th4;
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                        obj2 = obj;
                    }
                }
                return new zztt(-1);
            }
        }
        arrayList = arrayList2;
        if (!arrayList.isEmpty()) {
            r1.zzamo.zzf("mediation_networks_fail", TextUtils.join(",", arrayList));
        }
        return new zztt(1);
        th3 = th2;
        throw th3;
    }

    public final List<zztt> zzlo() {
        return this.zzcdp;
    }
}
