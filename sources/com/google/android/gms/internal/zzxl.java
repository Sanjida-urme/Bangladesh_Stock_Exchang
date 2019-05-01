package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.zzbs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@zzzb
public final class zzxl extends zzxb {
    private final zznd zzamo;
    private zzuc zzanb;
    private final zzama zzbwq;
    private zztn zzccq;
    private zztl zzcih;
    protected zztt zzcii;
    private boolean zzcij;

    zzxl(Context context, zzaev zzaev, zzuc zzuc, zzxg zzxg, zznd zznd, zzama zzama) {
        super(context, zzaev, zzxg);
        this.zzanb = zzuc;
        this.zzccq = zzaev.zzcvs;
        this.zzamo = zznd;
        this.zzbwq = zzama;
    }

    private static String zzj(List<zztt> list) {
        String str = "";
        if (list == null) {
            return str.toString();
        }
        Iterator it = list.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                return str.substring(0, Math.max(0, str.length() - 1));
            }
            zztt zztt = (zztt) it.next();
            if (!(zztt == null || zztt.zzcdd == null || TextUtils.isEmpty(zztt.zzcdd.zzcbe))) {
                str = String.valueOf(str);
                String str2 = zztt.zzcdd.zzcbe;
                switch (zztt.zzcdc) {
                    case -1:
                        i = 4;
                        break;
                    case 0:
                        break;
                    case 1:
                        i = 1;
                        break;
                    case 3:
                        i = 2;
                        break;
                    case 4:
                        i = 3;
                        break;
                    case 5:
                        i = 5;
                        break;
                    default:
                        i = 6;
                        break;
                }
                long j = zztt.zzcdi;
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 33);
                stringBuilder.append(str2);
                stringBuilder.append(".");
                stringBuilder.append(i);
                stringBuilder.append(".");
                stringBuilder.append(j);
                String stringBuilder2 = stringBuilder.toString();
                StringBuilder stringBuilder3 = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(stringBuilder2).length());
                stringBuilder3.append(str);
                stringBuilder3.append(stringBuilder2);
                stringBuilder3.append("_");
                str = stringBuilder3.toString();
            }
        }
    }

    public final void onStop() {
        synchronized (this.zzchy) {
            super.onStop();
            if (this.zzcih != null) {
                this.zzcih.cancel();
            }
        }
    }

    protected final void zzd(long j) throws zzxe {
        boolean z;
        ListIterator listIterator;
        StringBuilder stringBuilder;
        synchronized (this.zzchy) {
            zztl zztl;
            try {
                if (r1.zzccq.zzcce != -1) {
                    Context context = r1.mContext;
                    zzzz zzzz = r1.zzchv.zzcpe;
                    zzuc zzuc = r1.zzanb;
                    zztn zztn = r1.zzccq;
                    boolean z2 = r1.zzchw.zzbdd;
                    boolean z3 = r1.zzchw.zzbdf;
                    String str = r1.zzchw.zzcoa;
                    long longValue = ((Long) zzbs.zzep().zzd(zzmq.zzblt)).longValue();
                    boolean z4 = r1.zzchv.zzcwd;
                } else {
                    zztl zztz = new zztz(r1.mContext, r1.zzchv.zzcpe, r1.zzanb, r1.zzccq, r1.zzchw.zzbdd, r1.zzchw.zzbdf, r1.zzchw.zzcoa, j, ((Long) zzbs.zzep().zzd(zzmq.zzblt)).longValue(), r1.zzamo, r1.zzchv.zzcwd);
                }
                r1.zzcih = zztl;
            } finally {
                zztl = r0;
            }
        }
        List arrayList = new ArrayList(r1.zzccq.zzcbt);
        Bundle bundle = r1.zzchv.zzcpe.zzclo.zzbcf;
        String str2 = "com.google.ads.mediation.admob.AdMobAdapter";
        if (bundle != null) {
            bundle = bundle.getBundle(str2);
            if (bundle != null) {
                z = bundle.getBoolean("_skipMediation");
                if (z) {
                    listIterator = arrayList.listIterator();
                    while (listIterator.hasNext()) {
                        if (!((zztm) listIterator.next()).zzcbd.contains(str2)) {
                            listIterator.remove();
                        }
                    }
                }
                r1.zzcii = r1.zzcih.zzg(arrayList);
                switch (r1.zzcii.zzcdc) {
                    case 0:
                        if (r1.zzcii.zzcdd == null && r1.zzcii.zzcdd.zzcbn != null) {
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            zzagr.zzczc.post(new zzxm(r1, countDownLatch));
                            try {
                                countDownLatch.await(10, TimeUnit.SECONDS);
                                synchronized (r1.zzchy) {
                                    try {
                                        if (!r1.zzcij) {
                                            throw new zzxe("View could not be prepared", 0);
                                        } else if (r1.zzbwq.isDestroyed()) {
                                            throw new zzxe("Assets not loaded, web view is destroyed", 0);
                                        }
                                    } catch (Throwable th) {
                                        Throwable th2 = th;
                                    }
                                }
                                return;
                            } catch (InterruptedException e) {
                                String valueOf = String.valueOf(e);
                                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 38);
                                stringBuilder.append("Interrupted while waiting for latch : ");
                                stringBuilder.append(valueOf);
                                throw new zzxe(stringBuilder.toString(), 0);
                            }
                        }
                        return;
                    case 1:
                        throw new zzxe("No fill from any mediation ad networks.", 3);
                    default:
                        int i = r1.zzcii.zzcdc;
                        stringBuilder = new StringBuilder(40);
                        stringBuilder.append("Unexpected mediation result: ");
                        stringBuilder.append(i);
                        throw new zzxe(stringBuilder.toString(), 0);
                }
            }
        }
        z = false;
        if (z) {
            listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                if (!((zztm) listIterator.next()).zzcbd.contains(str2)) {
                    listIterator.remove();
                }
            }
        }
        r1.zzcii = r1.zzcih.zzg(arrayList);
        switch (r1.zzcii.zzcdc) {
            case 0:
                if (r1.zzcii.zzcdd == null) {
                    break;
                }
                return;
            case 1:
                throw new zzxe("No fill from any mediation ad networks.", 3);
            default:
                int i2 = r1.zzcii.zzcdc;
                stringBuilder = new StringBuilder(40);
                stringBuilder.append("Unexpected mediation result: ");
                stringBuilder.append(i2);
                throw new zzxe(stringBuilder.toString(), 0);
        }
    }

    protected final zzaeu zzy(int i) {
        zzzz zzzz = this.zzchv.zzcpe;
        zzis zzis = zzzz.zzclo;
        zzama zzama = this.zzbwq;
        List list = this.zzchw.zzcbv;
        List list2 = this.zzchw.zzcbw;
        List list3 = this.zzchw.zzcni;
        int i2 = this.zzchw.orientation;
        long j = this.zzchw.zzccb;
        String str = zzzz.zzclr;
        boolean z = this.zzchw.zzcng;
        zztm zztm = this.zzcii != null ? r0.zzcii.zzcdd : null;
        zzuf zzuf = r0.zzcii != null ? r0.zzcii.zzcde : null;
        return new zzaeu(zzis, zzama, list, i, list2, list3, i2, j, str, z, zztm, zzuf, r0.zzcii != null ? r0.zzcii.zzcdf : AdMobAdapter.class.getName(), r0.zzccq, r0.zzcii != null ? r0.zzcii.zzcdg : null, r0.zzchw.zzcnh, r0.zzchv.zzath, r0.zzchw.zzcnf, r0.zzchv.zzcvw, r0.zzchw.zzcnk, r0.zzchw.zzcnl, r0.zzchv.zzcvq, null, r0.zzchw.zzcnv, r0.zzchw.zzcnw, r0.zzchw.zzcnx, r0.zzccq != null ? r0.zzccq.zzccg : false, r0.zzchw.zzcnz, r0.zzcih != null ? zzj(r0.zzcih.zzlo()) : null, r0.zzchw.zzcby, r0.zzchw.zzcoc, r0.zzchv.zzcwc, r0.zzchw.zzapy, r0.zzchv.zzcwd);
    }
}
