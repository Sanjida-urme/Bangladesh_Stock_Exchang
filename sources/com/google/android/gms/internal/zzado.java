package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import org.json.JSONObject;

@zzzb
public final class zzado extends zzafh implements zzadn {
    private final Context mContext;
    private final Object mLock;
    private final zzaev zzchv;
    private final long zzctq;
    private final ArrayList<Future> zzcub;
    private final ArrayList<String> zzcuc;
    private final HashMap<String, zzade> zzcud;
    private final List<zzadh> zzcue;
    private final HashSet<String> zzcuf;
    private final zzack zzcug;

    public zzado(Context context, zzaev zzaev, zzack zzack) {
        Context context2 = context;
        zzaev zzaev2 = zzaev;
        zzack zzack2 = zzack;
        this(context2, zzaev2, zzack2, ((Long) zzbs.zzep().zzd(zzmq.zzbjp)).longValue());
    }

    private zzado(Context context, zzaev zzaev, zzack zzack, long j) {
        this.zzcub = new ArrayList();
        this.zzcuc = new ArrayList();
        this.zzcud = new HashMap();
        this.zzcue = new ArrayList();
        this.zzcuf = new HashSet();
        this.mLock = new Object();
        this.mContext = context;
        this.zzchv = zzaev;
        this.zzcug = zzack;
        this.zzctq = j;
    }

    private final zzaeu zza(int i, @Nullable String str, @Nullable zztm zztm) {
        zzis zzis = this.zzchv.zzcpe.zzclo;
        List list = this.zzchv.zzcwe.zzcbv;
        List list2 = this.zzchv.zzcwe.zzcbw;
        List list3 = this.zzchv.zzcwe.zzcni;
        int i2 = this.zzchv.zzcwe.orientation;
        long j = this.zzchv.zzcwe.zzccb;
        String str2 = this.zzchv.zzcpe.zzclr;
        boolean z = this.zzchv.zzcwe.zzcng;
        zztn zztn = this.zzchv.zzcvs;
        long j2 = this.zzchv.zzcwe.zzcnh;
        zziw zziw = this.zzchv.zzath;
        long j3 = j2;
        zztn zztn2 = zztn;
        long j4 = this.zzchv.zzcwe.zzcnf;
        long j5 = this.zzchv.zzcvw;
        long j6 = this.zzchv.zzcwe.zzcnk;
        String str3 = this.zzchv.zzcwe.zzcnl;
        JSONObject jSONObject = this.zzchv.zzcvq;
        zzadw zzadw = this.zzchv.zzcwe.zzcnv;
        List list4 = this.zzchv.zzcwe.zzcnw;
        List list5 = this.zzchv.zzcwe.zzcnx;
        boolean z2 = this.zzchv.zzcwe.zzcny;
        zzaaf zzaaf = this.zzchv.zzcwe.zzcnz;
        String zzob = zzob();
        zzaaf zzaaf2 = zzaaf;
        List list6 = this.zzchv.zzcwe.zzcby;
        String str4 = this.zzchv.zzcwe.zzcoc;
        zzib zzib = this.zzchv.zzcwc;
        JSONObject jSONObject2 = jSONObject;
        zziw zziw2 = zziw;
        String str5 = str3;
        long j7 = j3;
        j3 = j6;
        return new zzaeu(zzis, null, list, i, list2, list3, i2, j, str2, z, zztm, null, str, zztn2, null, j7, zziw2, j4, j5, j3, str5, jSONObject2, null, zzadw, list4, list5, z2, zzaaf2, zzob, list6, str4, zzib, this.zzchv.zzcwe.zzapy, this.zzchv.zzcwd);
    }

    private final String zzob() {
        StringBuilder stringBuilder = new StringBuilder("");
        if (this.zzcue == null) {
            return stringBuilder.toString();
        }
        Iterator it = this.zzcue.iterator();
        while (true) {
            int i = 1;
            if (!it.hasNext()) {
                return stringBuilder.substring(0, Math.max(0, stringBuilder.length() - 1));
            }
            zzadh zzadh = (zzadh) it.next();
            if (!(zzadh == null || TextUtils.isEmpty(zzadh.zzcbe))) {
                String str = zzadh.zzcbe;
                switch (zzadh.errorCode) {
                    case 3:
                        break;
                    case 4:
                        i = 2;
                        break;
                    case 5:
                        i = 4;
                        break;
                    case 6:
                        i = 0;
                        break;
                    case 7:
                        i = 3;
                        break;
                    default:
                        i = 6;
                        break;
                }
                long j = zzadh.zzcdi;
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 33);
                stringBuilder2.append(str);
                stringBuilder2.append(".");
                stringBuilder2.append(i);
                stringBuilder2.append(".");
                stringBuilder2.append(j);
                stringBuilder.append(String.valueOf(stringBuilder2.toString()).concat("_"));
            }
        }
    }

    public final void onStop() {
    }

    public final void zza(String str, int i) {
    }

    public final void zzbq(String str) {
        synchronized (this.mLock) {
            this.zzcuf.add(str);
        }
    }

    public final void zzdg() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/558922244.run(Unknown Source)
*/
        /*
        r21 = this;
        r11 = r21;
        r1 = r11.zzchv;
        r1 = r1.zzcvs;
        r1 = r1.zzcbt;
        r12 = r1.iterator();
    L_0x000c:
        r1 = r12.hasNext();
        if (r1 == 0) goto L_0x00db;
    L_0x0012:
        r1 = r12.next();
        r13 = r1;
        r13 = (com.google.android.gms.internal.zztm) r13;
        r14 = r13.zzcbk;
        r1 = r13.zzcbd;
        r15 = r1.iterator();
    L_0x0021:
        r1 = r15.hasNext();
        if (r1 == 0) goto L_0x000c;
    L_0x0027:
        r1 = r15.next();
        r1 = (java.lang.String) r1;
        r2 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
        r2 = r2.equals(r1);
        if (r2 != 0) goto L_0x0040;
    L_0x0035:
        r2 = "com.google.ads.mediation.customevent.CustomEventAdapter";
        r2 = r2.equals(r1);
        if (r2 == 0) goto L_0x003e;
    L_0x003d:
        goto L_0x0040;
    L_0x003e:
        r9 = r1;
        goto L_0x004c;
    L_0x0040:
        r1 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x00ca }
        r1.<init>(r14);	 Catch:{ JSONException -> 0x00ca }
        r2 = "class_name";	 Catch:{ JSONException -> 0x00ca }
        r1 = r1.getString(r2);	 Catch:{ JSONException -> 0x00ca }
        goto L_0x003e;
    L_0x004c:
        r10 = r11.mLock;
        monitor-enter(r10);
        r1 = r11.zzcug;	 Catch:{ all -> 0x00c2 }
        r7 = r1.zzbp(r9);	 Catch:{ all -> 0x00c2 }
        if (r7 == 0) goto L_0x0097;	 Catch:{ all -> 0x00c2 }
    L_0x0057:
        r1 = r7.zzod();	 Catch:{ all -> 0x00c2 }
        if (r1 == 0) goto L_0x0097;	 Catch:{ all -> 0x00c2 }
    L_0x005d:
        r1 = r7.zzoc();	 Catch:{ all -> 0x00c2 }
        if (r1 != 0) goto L_0x0064;	 Catch:{ all -> 0x00c2 }
    L_0x0063:
        goto L_0x0097;	 Catch:{ all -> 0x00c2 }
    L_0x0064:
        r8 = new com.google.android.gms.internal.zzade;	 Catch:{ all -> 0x00c2 }
        r2 = r11.mContext;	 Catch:{ all -> 0x00c2 }
        r6 = r11.zzchv;	 Catch:{ all -> 0x00c2 }
        r4 = r11.zzctq;	 Catch:{ all -> 0x00c2 }
        r1 = r8;
        r3 = r9;
        r16 = r4;
        r4 = r14;
        r5 = r13;
        r18 = r12;
        r12 = r8;
        r8 = r11;
        r20 = r10;
        r19 = r14;
        r14 = r9;
        r9 = r16;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9);	 Catch:{ all -> 0x00c8 }
        r1 = r11.zzcub;	 Catch:{ all -> 0x00c8 }
        r2 = r12.zzmx();	 Catch:{ all -> 0x00c8 }
        r2 = (com.google.android.gms.internal.zzajp) r2;	 Catch:{ all -> 0x00c8 }
        r1.add(r2);	 Catch:{ all -> 0x00c8 }
        r1 = r11.zzcuc;	 Catch:{ all -> 0x00c8 }
        r1.add(r14);	 Catch:{ all -> 0x00c8 }
        r1 = r11.zzcud;	 Catch:{ all -> 0x00c8 }
        r1.put(r14, r12);	 Catch:{ all -> 0x00c8 }
    L_0x0095:
        monitor-exit(r20);	 Catch:{ all -> 0x00c8 }
        goto L_0x00d5;	 Catch:{ all -> 0x00c8 }
    L_0x0097:
        r20 = r10;	 Catch:{ all -> 0x00c8 }
        r18 = r12;	 Catch:{ all -> 0x00c8 }
        r19 = r14;	 Catch:{ all -> 0x00c8 }
        r14 = r9;	 Catch:{ all -> 0x00c8 }
        r1 = r11.zzcue;	 Catch:{ all -> 0x00c8 }
        r2 = new com.google.android.gms.internal.zzadj;	 Catch:{ all -> 0x00c8 }
        r2.<init>();	 Catch:{ all -> 0x00c8 }
        r3 = r13.zzcbe;	 Catch:{ all -> 0x00c8 }
        r2 = r2.zzbs(r3);	 Catch:{ all -> 0x00c8 }
        r2 = r2.zzbr(r14);	 Catch:{ all -> 0x00c8 }
        r3 = 0;	 Catch:{ all -> 0x00c8 }
        r2 = r2.zzf(r3);	 Catch:{ all -> 0x00c8 }
        r3 = 7;	 Catch:{ all -> 0x00c8 }
        r2 = r2.zzab(r3);	 Catch:{ all -> 0x00c8 }
        r2 = r2.zzoa();	 Catch:{ all -> 0x00c8 }
        r1.add(r2);	 Catch:{ all -> 0x00c8 }
        goto L_0x0095;	 Catch:{ all -> 0x00c8 }
    L_0x00c2:
        r0 = move-exception;	 Catch:{ all -> 0x00c8 }
        r20 = r10;	 Catch:{ all -> 0x00c8 }
    L_0x00c5:
        r1 = r0;	 Catch:{ all -> 0x00c8 }
        monitor-exit(r20);	 Catch:{ all -> 0x00c8 }
        throw r1;
    L_0x00c8:
        r0 = move-exception;
        goto L_0x00c5;
    L_0x00ca:
        r0 = move-exception;
        r18 = r12;
        r19 = r14;
        r1 = r0;
        r2 = "Unable to determine custom event class name, skipping...";
        com.google.android.gms.internal.zzaiw.zzb(r2, r1);
    L_0x00d5:
        r12 = r18;
        r14 = r19;
        goto L_0x0021;
    L_0x00db:
        r1 = 0;
    L_0x00dc:
        r2 = r11.zzcub;
        r2 = r2.size();
        r3 = 0;
        if (r1 >= r2) goto L_0x01ef;
    L_0x00e5:
        r2 = r11.zzcub;	 Catch:{ InterruptedException -> 0x0194, Exception -> 0x0160 }
        r2 = r2.get(r1);	 Catch:{ InterruptedException -> 0x0194, Exception -> 0x0160 }
        r2 = (java.util.concurrent.Future) r2;	 Catch:{ InterruptedException -> 0x0194, Exception -> 0x0160 }
        r2.get();	 Catch:{ InterruptedException -> 0x0194, Exception -> 0x0160 }
        r2 = r11.mLock;
        monitor-enter(r2);
        r4 = r11.zzcuc;	 Catch:{ all -> 0x0159 }
        r4 = r4.get(r1);	 Catch:{ all -> 0x0159 }
        r4 = (java.lang.String) r4;	 Catch:{ all -> 0x0159 }
        r5 = android.text.TextUtils.isEmpty(r4);	 Catch:{ all -> 0x0159 }
        if (r5 != 0) goto L_0x0114;	 Catch:{ all -> 0x0159 }
    L_0x0101:
        r5 = r11.zzcud;	 Catch:{ all -> 0x0159 }
        r4 = r5.get(r4);	 Catch:{ all -> 0x0159 }
        r4 = (com.google.android.gms.internal.zzade) r4;	 Catch:{ all -> 0x0159 }
        if (r4 == 0) goto L_0x0114;	 Catch:{ all -> 0x0159 }
    L_0x010b:
        r5 = r11.zzcue;	 Catch:{ all -> 0x0159 }
        r4 = r4.zznx();	 Catch:{ all -> 0x0159 }
        r5.add(r4);	 Catch:{ all -> 0x0159 }
    L_0x0114:
        monitor-exit(r2);	 Catch:{ all -> 0x0159 }
        r4 = r11.mLock;
        monitor-enter(r4);
        r2 = r11.zzcuf;	 Catch:{ all -> 0x0155 }
        r5 = r11.zzcuc;	 Catch:{ all -> 0x0155 }
        r5 = r5.get(r1);	 Catch:{ all -> 0x0155 }
        r2 = r2.contains(r5);	 Catch:{ all -> 0x0155 }
        if (r2 == 0) goto L_0x0153;	 Catch:{ all -> 0x0155 }
    L_0x0126:
        r2 = r11.zzcuc;	 Catch:{ all -> 0x0155 }
        r1 = r2.get(r1);	 Catch:{ all -> 0x0155 }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x0155 }
        r2 = r11.zzcud;	 Catch:{ all -> 0x0155 }
        r2 = r2.get(r1);	 Catch:{ all -> 0x0155 }
        if (r2 == 0) goto L_0x0142;	 Catch:{ all -> 0x0155 }
    L_0x0136:
        r2 = r11.zzcud;	 Catch:{ all -> 0x0155 }
        r2 = r2.get(r1);	 Catch:{ all -> 0x0155 }
        r2 = (com.google.android.gms.internal.zzade) r2;	 Catch:{ all -> 0x0155 }
        r3 = r2.zzny();	 Catch:{ all -> 0x0155 }
    L_0x0142:
        r2 = -2;	 Catch:{ all -> 0x0155 }
        r1 = r11.zza(r2, r1, r3);	 Catch:{ all -> 0x0155 }
        r2 = com.google.android.gms.internal.zzais.zzdbs;	 Catch:{ all -> 0x0155 }
        r3 = new com.google.android.gms.internal.zzadp;	 Catch:{ all -> 0x0155 }
        r3.<init>(r11, r1);	 Catch:{ all -> 0x0155 }
        r2.post(r3);	 Catch:{ all -> 0x0155 }
        monitor-exit(r4);	 Catch:{ all -> 0x0155 }
        return;	 Catch:{ all -> 0x0155 }
    L_0x0153:
        monitor-exit(r4);	 Catch:{ all -> 0x0155 }
        goto L_0x018c;	 Catch:{ all -> 0x0155 }
    L_0x0155:
        r0 = move-exception;	 Catch:{ all -> 0x0155 }
        r1 = r0;	 Catch:{ all -> 0x0155 }
        monitor-exit(r4);	 Catch:{ all -> 0x0155 }
        throw r1;
    L_0x0159:
        r0 = move-exception;
        r1 = r0;
        monitor-exit(r2);	 Catch:{ all -> 0x0159 }
        throw r1;
    L_0x015d:
        r0 = move-exception;
        r2 = r0;
        goto L_0x01c5;
    L_0x0160:
        r0 = move-exception;
        r2 = r0;
        r3 = "Unable to resolve rewarded adapter.";	 Catch:{ all -> 0x015d }
        com.google.android.gms.internal.zzaiw.zzc(r3, r2);	 Catch:{ all -> 0x015d }
        r2 = r11.mLock;
        monitor-enter(r2);
        r3 = r11.zzcuc;	 Catch:{ all -> 0x0190 }
        r3 = r3.get(r1);	 Catch:{ all -> 0x0190 }
        r3 = (java.lang.String) r3;	 Catch:{ all -> 0x0190 }
        r4 = android.text.TextUtils.isEmpty(r3);	 Catch:{ all -> 0x0190 }
        if (r4 != 0) goto L_0x018b;	 Catch:{ all -> 0x0190 }
    L_0x0178:
        r4 = r11.zzcud;	 Catch:{ all -> 0x0190 }
        r3 = r4.get(r3);	 Catch:{ all -> 0x0190 }
        r3 = (com.google.android.gms.internal.zzade) r3;	 Catch:{ all -> 0x0190 }
        if (r3 == 0) goto L_0x018b;	 Catch:{ all -> 0x0190 }
    L_0x0182:
        r4 = r11.zzcue;	 Catch:{ all -> 0x0190 }
        r3 = r3.zznx();	 Catch:{ all -> 0x0190 }
        r4.add(r3);	 Catch:{ all -> 0x0190 }
    L_0x018b:
        monitor-exit(r2);	 Catch:{ all -> 0x0190 }
    L_0x018c:
        r1 = r1 + 1;	 Catch:{ all -> 0x0190 }
        goto L_0x00dc;	 Catch:{ all -> 0x0190 }
    L_0x0190:
        r0 = move-exception;	 Catch:{ all -> 0x0190 }
        r1 = r0;	 Catch:{ all -> 0x0190 }
        monitor-exit(r2);	 Catch:{ all -> 0x0190 }
        throw r1;
    L_0x0194:
        r2 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x015d }
        r2.interrupt();	 Catch:{ all -> 0x015d }
        r2 = r11.mLock;
        monitor-enter(r2);
        r4 = r11.zzcuc;	 Catch:{ all -> 0x01c1 }
        r1 = r4.get(r1);	 Catch:{ all -> 0x01c1 }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x01c1 }
        r4 = android.text.TextUtils.isEmpty(r1);	 Catch:{ all -> 0x01c1 }
        if (r4 != 0) goto L_0x01bf;	 Catch:{ all -> 0x01c1 }
    L_0x01ac:
        r4 = r11.zzcud;	 Catch:{ all -> 0x01c1 }
        r1 = r4.get(r1);	 Catch:{ all -> 0x01c1 }
        r1 = (com.google.android.gms.internal.zzade) r1;	 Catch:{ all -> 0x01c1 }
        if (r1 == 0) goto L_0x01bf;	 Catch:{ all -> 0x01c1 }
    L_0x01b6:
        r4 = r11.zzcue;	 Catch:{ all -> 0x01c1 }
        r1 = r1.zznx();	 Catch:{ all -> 0x01c1 }
        r4.add(r1);	 Catch:{ all -> 0x01c1 }
    L_0x01bf:
        monitor-exit(r2);	 Catch:{ all -> 0x01c1 }
        goto L_0x01ef;	 Catch:{ all -> 0x01c1 }
    L_0x01c1:
        r0 = move-exception;	 Catch:{ all -> 0x01c1 }
        r1 = r0;	 Catch:{ all -> 0x01c1 }
        monitor-exit(r2);	 Catch:{ all -> 0x01c1 }
        throw r1;
    L_0x01c5:
        r4 = r11.mLock;
        monitor-enter(r4);
        r3 = r11.zzcuc;	 Catch:{ all -> 0x01eb }
        r1 = r3.get(r1);	 Catch:{ all -> 0x01eb }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x01eb }
        r3 = android.text.TextUtils.isEmpty(r1);	 Catch:{ all -> 0x01eb }
        if (r3 != 0) goto L_0x01e9;	 Catch:{ all -> 0x01eb }
    L_0x01d6:
        r3 = r11.zzcud;	 Catch:{ all -> 0x01eb }
        r1 = r3.get(r1);	 Catch:{ all -> 0x01eb }
        r1 = (com.google.android.gms.internal.zzade) r1;	 Catch:{ all -> 0x01eb }
        if (r1 == 0) goto L_0x01e9;	 Catch:{ all -> 0x01eb }
    L_0x01e0:
        r3 = r11.zzcue;	 Catch:{ all -> 0x01eb }
        r1 = r1.zznx();	 Catch:{ all -> 0x01eb }
        r3.add(r1);	 Catch:{ all -> 0x01eb }
    L_0x01e9:
        monitor-exit(r4);	 Catch:{ all -> 0x01eb }
        throw r2;
    L_0x01eb:
        r0 = move-exception;
        r1 = r0;
        monitor-exit(r4);	 Catch:{ all -> 0x01eb }
        throw r1;
    L_0x01ef:
        r1 = 3;
        r1 = r11.zza(r1, r3, r3);
        r2 = com.google.android.gms.internal.zzais.zzdbs;
        r3 = new com.google.android.gms.internal.zzadq;
        r3.<init>(r11, r1);
        r2.post(r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzado.zzdg():void");
    }
}
