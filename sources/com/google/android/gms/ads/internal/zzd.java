package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.internal.zzaaa;
import com.google.android.gms.internal.zzaau;
import com.google.android.gms.internal.zzaeu;
import com.google.android.gms.internal.zzaey;
import com.google.android.gms.internal.zzafh;
import com.google.android.gms.internal.zzagr;
import com.google.android.gms.internal.zzaiw;
import com.google.android.gms.internal.zzaiy;
import com.google.android.gms.internal.zzgt;
import com.google.android.gms.internal.zzid.zza.zzb;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzis;
import com.google.android.gms.internal.zziw;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.internal.zznd;
import com.google.android.gms.internal.zzpu;
import com.google.android.gms.internal.zzqe;
import com.google.android.gms.internal.zzto;
import com.google.android.gms.internal.zztv;
import com.google.android.gms.internal.zzuc;
import com.google.android.gms.internal.zzzb;
import com.google.android.gms.internal.zzze;

@zzzb
public abstract class zzd extends zza implements zzn, zzbl, zzto {
    protected final zzuc zzanb;
    private transient boolean zzanc;

    public zzd(Context context, zziw zziw, String str, zzuc zzuc, zzaiy zzaiy, zzv zzv) {
        this(new zzbt(context, zziw, str, zzaiy), zzuc, null, zzv);
    }

    private zzd(zzbt zzbt, zzuc zzuc, @Nullable zzbi zzbi, zzv zzv) {
        super(zzbt, null, zzv);
        this.zzanb = zzuc;
        this.zzanc = false;
    }

    private final com.google.android.gms.internal.zzaaa zza(com.google.android.gms.internal.zzis r62, android.os.Bundle r63, com.google.android.gms.internal.zzaey r64, int r65) {
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
        r61 = this;
        r0 = r61;
        r1 = r0.zzamt;
        r1 = r1.zzaif;
        r7 = r1.getApplicationInfo();
        r1 = 0;
        r2 = 0;
        r3 = r0.zzamt;	 Catch:{ NameNotFoundException -> 0x001c }
        r3 = r3.zzaif;	 Catch:{ NameNotFoundException -> 0x001c }
        r3 = com.google.android.gms.internal.zzbgc.zzcy(r3);	 Catch:{ NameNotFoundException -> 0x001c }
        r4 = r7.packageName;	 Catch:{ NameNotFoundException -> 0x001c }
        r3 = r3.getPackageInfo(r4, r2);	 Catch:{ NameNotFoundException -> 0x001c }
        r8 = r3;
        goto L_0x001d;
    L_0x001c:
        r8 = r1;
    L_0x001d:
        r3 = r0.zzamt;
        r3 = r3.zzaif;
        r3 = r3.getResources();
        r3 = r3.getDisplayMetrics();
        r4 = r0.zzamt;
        r4 = r4.zzate;
        if (r4 == 0) goto L_0x0094;
    L_0x002f:
        r4 = r0.zzamt;
        r4 = r4.zzate;
        r4 = r4.getParent();
        if (r4 == 0) goto L_0x0094;
    L_0x0039:
        r4 = 2;
        r4 = new int[r4];
        r5 = r0.zzamt;
        r5 = r5.zzate;
        r5.getLocationOnScreen(r4);
        r5 = r4[r2];
        r6 = 1;
        r4 = r4[r6];
        r9 = r0.zzamt;
        r9 = r9.zzate;
        r9 = r9.getWidth();
        r10 = r0.zzamt;
        r10 = r10.zzate;
        r10 = r10.getHeight();
        r11 = r0.zzamt;
        r11 = r11.zzate;
        r11 = r11.isShown();
        if (r11 == 0) goto L_0x0073;
    L_0x0062:
        r11 = r5 + r9;
        if (r11 <= 0) goto L_0x0073;
    L_0x0066:
        r11 = r4 + r10;
        if (r11 <= 0) goto L_0x0073;
    L_0x006a:
        r11 = r3.widthPixels;
        if (r5 > r11) goto L_0x0073;
    L_0x006e:
        r11 = r3.heightPixels;
        if (r4 > r11) goto L_0x0073;
    L_0x0072:
        goto L_0x0074;
    L_0x0073:
        r6 = 0;
    L_0x0074:
        r11 = new android.os.Bundle;
        r12 = 5;
        r11.<init>(r12);
        r12 = "x";
        r11.putInt(r12, r5);
        r5 = "y";
        r11.putInt(r5, r4);
        r4 = "width";
        r11.putInt(r4, r9);
        r4 = "height";
        r11.putInt(r4, r10);
        r4 = "visible";
        r11.putInt(r4, r6);
        goto L_0x0095;
    L_0x0094:
        r11 = r1;
    L_0x0095:
        r4 = com.google.android.gms.ads.internal.zzbs.zzeg();
        r9 = r4.zzou();
        r4 = r0.zzamt;
        r5 = new com.google.android.gms.internal.zzaew;
        r6 = r0.zzamt;
        r6 = r6.zzatb;
        r5.<init>(r9, r6);
        r4.zzatk = r5;
        r4 = r0.zzamt;
        r4 = r4.zzatk;
        r5 = r62;
        r4.zzo(r5);
        com.google.android.gms.ads.internal.zzbs.zzec();
        r4 = r0.zzamt;
        r4 = r4.zzaif;
        r6 = r0.zzamt;
        r6 = r6.zzate;
        r10 = r0.zzamt;
        r10 = r10.zzath;
        r20 = com.google.android.gms.internal.zzagr.zza(r4, r6, r10);
        r12 = 0;
        r4 = r0.zzamt;
        r4 = r4.zzato;
        if (r4 == 0) goto L_0x00de;
    L_0x00ce:
        r4 = r0.zzamt;	 Catch:{ RemoteException -> 0x00d9 }
        r4 = r4.zzato;	 Catch:{ RemoteException -> 0x00d9 }
        r14 = r4.getValue();	 Catch:{ RemoteException -> 0x00d9 }
        r21 = r14;
        goto L_0x00e0;
    L_0x00d9:
        r4 = "Cannot get correlation id, default to 0.";
        com.google.android.gms.internal.zzaiw.zzco(r4);
    L_0x00de:
        r21 = r12;
    L_0x00e0:
        r4 = java.util.UUID.randomUUID();
        r23 = r4.toString();
        r4 = com.google.android.gms.ads.internal.zzbs.zzeg();
        r6 = r0.zzamt;
        r6 = r6.zzaif;
        r12 = r4.zza(r6, r0, r9);
        r14 = new java.util.ArrayList;
        r14.<init>();
        r15 = new java.util.ArrayList;
        r15.<init>();
        r4 = 0;
    L_0x00ff:
        r6 = r0.zzamt;
        r6 = r6.zzats;
        r6 = r6.size();
        if (r4 >= r6) goto L_0x0130;
    L_0x0109:
        r6 = r0.zzamt;
        r6 = r6.zzats;
        r6 = r6.keyAt(r4);
        r6 = (java.lang.String) r6;
        r14.add(r6);
        r10 = r0.zzamt;
        r10 = r10.zzatr;
        r10 = r10.containsKey(r6);
        if (r10 == 0) goto L_0x012d;
    L_0x0120:
        r10 = r0.zzamt;
        r10 = r10.zzatr;
        r10 = r10.get(r6);
        if (r10 == 0) goto L_0x012d;
    L_0x012a:
        r15.add(r6);
    L_0x012d:
        r4 = r4 + 1;
        goto L_0x00ff;
    L_0x0130:
        r4 = new com.google.android.gms.ads.internal.zze;
        r4.<init>(r0);
        r6 = com.google.android.gms.internal.zzagl.zzcyx;
        r34 = com.google.android.gms.internal.zzagl.zza(r6, r4);
        r4 = new com.google.android.gms.ads.internal.zzf;
        r4.<init>(r0);
        r6 = com.google.android.gms.internal.zzagl.zzcyx;
        r44 = com.google.android.gms.internal.zzagl.zza(r6, r4);
        if (r64 == 0) goto L_0x014f;
    L_0x0148:
        r4 = r64.zzoq();
        r35 = r4;
        goto L_0x0151;
    L_0x014f:
        r35 = r1;
    L_0x0151:
        r4 = r0.zzamt;
        r4 = r4.zzaub;
        if (r4 == 0) goto L_0x0198;
    L_0x0157:
        r4 = r0.zzamt;
        r4 = r4.zzaub;
        r4 = r4.size();
        if (r4 <= 0) goto L_0x0198;
    L_0x0161:
        if (r8 == 0) goto L_0x0166;
    L_0x0163:
        r4 = r8.versionCode;
        goto L_0x0167;
    L_0x0166:
        r4 = 0;
    L_0x0167:
        r6 = com.google.android.gms.ads.internal.zzbs.zzeg();
        r6 = r6.zzpe();
        if (r4 <= r6) goto L_0x0180;
    L_0x0171:
        r6 = com.google.android.gms.ads.internal.zzbs.zzeg();
        r6.zzpl();
        r6 = com.google.android.gms.ads.internal.zzbs.zzeg();
        r6.zzac(r4);
        goto L_0x0198;
    L_0x0180:
        r4 = com.google.android.gms.ads.internal.zzbs.zzeg();
        r4 = r4.zzpk();
        if (r4 == 0) goto L_0x0198;
    L_0x018a:
        r6 = r0.zzamt;
        r6 = r6.zzatb;
        r4 = r4.optJSONArray(r6);
        if (r4 == 0) goto L_0x0198;
    L_0x0194:
        r1 = r4.toString();
    L_0x0198:
        r46 = r1;
        r1 = new com.google.android.gms.internal.zzaaa;
        r4 = r0.zzamt;
        r6 = r4.zzath;
        r4 = r0.zzamt;
        r10 = r4.zzatb;
        r13 = com.google.android.gms.internal.zzjk.zzhz();
        r4 = r0.zzamt;
        r4 = r4.zzatd;
        r2 = r0.zzamt;
        r2 = r2.zzaub;
        r51 = r2;
        r2 = com.google.android.gms.ads.internal.zzbs.zzeg();
        r16 = r2.zzox();
        r2 = r3.widthPixels;
        r52 = r15;
        r15 = r3.heightPixels;
        r3 = r3.density;
        r24 = com.google.android.gms.internal.zzmq.zziq();
        r53 = r2;
        r2 = r0.zzamt;
        r2 = r2.zzata;
        r54 = r2;
        r2 = r0.zzamt;
        r2 = r2.zzatt;
        r55 = r2;
        r2 = r0.zzamt;
        r27 = r2.zzfi();
        com.google.android.gms.ads.internal.zzbs.zzec();
        r28 = com.google.android.gms.internal.zzagr.zzdh();
        com.google.android.gms.ads.internal.zzbs.zzec();
        r29 = com.google.android.gms.internal.zzagr.zzdi();
        com.google.android.gms.ads.internal.zzbs.zzec();
        r2 = r0.zzamt;
        r2 = r2.zzaif;
        r30 = com.google.android.gms.internal.zzagr.zzaq(r2);
        com.google.android.gms.ads.internal.zzbs.zzec();
        r2 = r0.zzamt;
        r2 = r2.zzate;
        r31 = com.google.android.gms.internal.zzagr.zzr(r2);
        r2 = r0.zzamt;
        r2 = r2.zzaif;
        r2 = r2 instanceof android.app.Activity;
        r56 = r2;
        r2 = com.google.android.gms.ads.internal.zzbs.zzeg();
        r33 = r2.zzpb();
        r2 = com.google.android.gms.ads.internal.zzbs.zzeg();
        r36 = r2.zzpg();
        r2 = com.google.android.gms.ads.internal.zzbs.zzey();
        r37 = r2.zzsi();
        com.google.android.gms.ads.internal.zzbs.zzec();
        r38 = com.google.android.gms.internal.zzagr.zzpy();
        r2 = com.google.android.gms.ads.internal.zzbs.zzel();
        r39 = r2.zzqj();
        r2 = r0.zzamt;
        r2 = r2.zzatv;
        r57 = r2;
        r2 = com.google.android.gms.ads.internal.zzbs.zzel();
        r41 = r2.zzqk();
        r2 = com.google.android.gms.internal.zzsp.zzkw();
        r42 = r2.asBundle();
        com.google.android.gms.ads.internal.zzbs.zzeg();
        r2 = r0.zzamt;
        r2 = r2.zzaif;
        r58 = r3;
        r3 = r0.zzamt;
        r3 = r3.zzatb;
        r59 = r4;
        r4 = "admob";
        r60 = r15;
        r15 = 0;
        r2 = r2.getSharedPreferences(r4, r15);
        r4 = java.util.Collections.emptySet();
        r15 = "never_pool_slots";
        r2 = r2.getStringSet(r15, r4);
        r43 = r2.contains(r3);
        r2 = r0.zzamt;
        r15 = r2.zzatx;
        r2 = r0.zzamt;
        r2 = r2.zzaif;
        r2 = com.google.android.gms.internal.zzbgc.zzcy(r2);
        r49 = r2.zzamj();
        r2 = com.google.android.gms.ads.internal.zzbs.zzeg();
        r50 = r2.zzph();
        r17 = r51;
        r18 = r53;
        r25 = r54;
        r26 = r55;
        r32 = r56;
        r40 = r57;
        r2 = r1;
        r19 = r58;
        r3 = r11;
        r11 = r59;
        r4 = r5;
        r5 = r6;
        r6 = r10;
        r10 = r13;
        r13 = r17;
        r48 = r15;
        r47 = r52;
        r45 = r60;
        r15 = r63;
        r17 = r18;
        r18 = r45;
        r45 = r48;
        r48 = r65;
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzd.zza(com.google.android.gms.internal.zzis, android.os.Bundle, com.google.android.gms.internal.zzaey, int):com.google.android.gms.internal.zzaaa");
    }

    @android.support.annotation.Nullable
    static java.lang.String zzc(com.google.android.gms.internal.zzaeu r2) {
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
        if (r2 != 0) goto L_0x0004;
    L_0x0002:
        r2 = 0;
        return r2;
    L_0x0004:
        r0 = r2.zzcdf;
        r1 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
        r1 = r1.equals(r0);
        if (r1 != 0) goto L_0x0019;
    L_0x000e:
        r1 = "com.google.ads.mediation.customevent.CustomEventAdapter";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x0017;
    L_0x0016:
        goto L_0x0019;
    L_0x0017:
        r1 = 0;
        goto L_0x001a;
    L_0x0019:
        r1 = 1;
    L_0x001a:
        if (r1 == 0) goto L_0x0030;
    L_0x001c:
        r1 = r2.zzcdd;
        if (r1 == 0) goto L_0x0030;
    L_0x0020:
        r2 = r2.zzcdd;
        r2 = r2.zzcbk;
        r1 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0030, JSONException -> 0x0030 }
        r1.<init>(r2);	 Catch:{ JSONException -> 0x0030, JSONException -> 0x0030 }
        r2 = "class_name";	 Catch:{ JSONException -> 0x0030, JSONException -> 0x0030 }
        r2 = r1.getString(r2);	 Catch:{ JSONException -> 0x0030, JSONException -> 0x0030 }
        return r2;
    L_0x0030:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzd.zzc(com.google.android.gms.internal.zzaeu):java.lang.String");
    }

    @Nullable
    public final String getMediationAdapterClassName() {
        return this.zzamt.zzati == null ? null : this.zzamt.zzati.zzcdf;
    }

    public void onAdClicked() {
        if (this.zzamt.zzati == null) {
            zzaiw.zzco("Ad state was null when trying to ping click URLs.");
            return;
        }
        if (!(this.zzamt.zzati.zzcvs == null || this.zzamt.zzati.zzcvs.zzcbv == null)) {
            zzbs.zzew();
            zztv.zza(this.zzamt.zzaif, this.zzamt.zzatd.zzcp, this.zzamt.zzati, this.zzamt.zzatb, false, zzb(this.zzamt.zzati.zzcvs.zzcbv));
        }
        if (!(this.zzamt.zzati.zzcdd == null || this.zzamt.zzati.zzcdd.zzcbg == null)) {
            zzbs.zzew();
            zztv.zza(this.zzamt.zzaif, this.zzamt.zzatd.zzcp, this.zzamt.zzati, this.zzamt.zzatb, false, this.zzamt.zzati.zzcdd.zzcbg);
        }
        super.onAdClicked();
    }

    public final void onPause() {
        this.zzamv.zzj(this.zzamt.zzati);
    }

    public final void onResume() {
        this.zzamv.zzk(this.zzamt.zzati);
    }

    public void pause() {
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
        r2 = this;
        r0 = "pause must be called on the main UI thread.";
        com.google.android.gms.common.internal.zzbq.zzga(r0);
        r0 = r2.zzamt;
        r0 = r0.zzati;
        if (r0 == 0) goto L_0x0027;
    L_0x000b:
        r0 = r2.zzamt;
        r0 = r0.zzati;
        r0 = r0.zzchj;
        if (r0 == 0) goto L_0x0027;
    L_0x0013:
        r0 = r2.zzamt;
        r0 = r0.zzfg();
        if (r0 == 0) goto L_0x0027;
    L_0x001b:
        com.google.android.gms.ads.internal.zzbs.zzee();
        r0 = r2.zzamt;
        r0 = r0.zzati;
        r0 = r0.zzchj;
        com.google.android.gms.internal.zzagw.zzh(r0);
    L_0x0027:
        r0 = r2.zzamt;
        r0 = r0.zzati;
        if (r0 == 0) goto L_0x0044;
    L_0x002d:
        r0 = r2.zzamt;
        r0 = r0.zzati;
        r0 = r0.zzcde;
        if (r0 == 0) goto L_0x0044;
    L_0x0035:
        r0 = r2.zzamt;	 Catch:{ RemoteException -> 0x003f }
        r0 = r0.zzati;	 Catch:{ RemoteException -> 0x003f }
        r0 = r0.zzcde;	 Catch:{ RemoteException -> 0x003f }
        r0.pause();	 Catch:{ RemoteException -> 0x003f }
        goto L_0x0044;
    L_0x003f:
        r0 = "Could not pause mediation adapter.";
        com.google.android.gms.internal.zzaiw.zzco(r0);
    L_0x0044:
        r0 = r2.zzamv;
        r1 = r2.zzamt;
        r1 = r1.zzati;
        r0.zzj(r1);
        r0 = r2.zzams;
        r0.pause();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzd.pause():void");
    }

    public final void recordImpression() {
        zza(this.zzamt.zzati, false);
    }

    public void resume() {
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
        r2 = this;
        r0 = "resume must be called on the main UI thread.";
        com.google.android.gms.common.internal.zzbq.zzga(r0);
        r0 = r2.zzamt;
        r0 = r0.zzati;
        if (r0 == 0) goto L_0x001a;
    L_0x000b:
        r0 = r2.zzamt;
        r0 = r0.zzati;
        r0 = r0.zzchj;
        if (r0 == 0) goto L_0x001a;
    L_0x0013:
        r0 = r2.zzamt;
        r0 = r0.zzati;
        r0 = r0.zzchj;
        goto L_0x001b;
    L_0x001a:
        r0 = 0;
    L_0x001b:
        if (r0 == 0) goto L_0x0031;
    L_0x001d:
        r1 = r2.zzamt;
        r1 = r1.zzfg();
        if (r1 == 0) goto L_0x0031;
    L_0x0025:
        com.google.android.gms.ads.internal.zzbs.zzee();
        r1 = r2.zzamt;
        r1 = r1.zzati;
        r1 = r1.zzchj;
        com.google.android.gms.internal.zzagw.zzi(r1);
    L_0x0031:
        r1 = r2.zzamt;
        r1 = r1.zzati;
        if (r1 == 0) goto L_0x004e;
    L_0x0037:
        r1 = r2.zzamt;
        r1 = r1.zzati;
        r1 = r1.zzcde;
        if (r1 == 0) goto L_0x004e;
    L_0x003f:
        r1 = r2.zzamt;	 Catch:{ RemoteException -> 0x0049 }
        r1 = r1.zzati;	 Catch:{ RemoteException -> 0x0049 }
        r1 = r1.zzcde;	 Catch:{ RemoteException -> 0x0049 }
        r1.resume();	 Catch:{ RemoteException -> 0x0049 }
        goto L_0x004e;
    L_0x0049:
        r1 = "Could not resume mediation adapter.";
        com.google.android.gms.internal.zzaiw.zzco(r1);
    L_0x004e:
        if (r0 == 0) goto L_0x0056;
    L_0x0050:
        r0 = r0.zzsw();
        if (r0 != 0) goto L_0x005b;
    L_0x0056:
        r0 = r2.zzams;
        r0.resume();
    L_0x005b:
        r0 = r2.zzamv;
        r1 = r2.zzamt;
        r1 = r1.zzati;
        r0.zzk(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzd.resume():void");
    }

    public void showInterstitial() {
        zzaiw.zzco("showInterstitial is not supported for current ad type");
    }

    protected void zza(@Nullable zzaeu zzaeu, boolean z) {
        if (zzaeu == null) {
            zzaiw.zzco("Ad state was null when trying to ping impression URLs.");
            return;
        }
        if (zzaeu == null) {
            zzaiw.zzco("Ad state was null when trying to ping impression URLs.");
        } else {
            zzaiw.zzbw("Pinging Impression URLs.");
            if (this.zzamt.zzatk != null) {
                this.zzamt.zzatk.zzoi();
            }
            zzaeu.zzcwc.zza(zzb.AD_IMPRESSION);
            if (!(zzaeu.zzcbw == null || zzaeu.zzcvz)) {
                zzbs.zzec();
                zzagr.zza(this.zzamt.zzaif, this.zzamt.zzatd.zzcp, zzb(zzaeu.zzcbw));
                zzaeu.zzcvz = true;
            }
        }
        if (!(zzaeu.zzcvs == null || zzaeu.zzcvs.zzcbw == null)) {
            zzbs.zzew();
            zztv.zza(this.zzamt.zzaif, this.zzamt.zzatd.zzcp, zzaeu, this.zzamt.zzatb, z, zzb(zzaeu.zzcvs.zzcbw));
        }
        if (!(zzaeu.zzcdd == null || zzaeu.zzcdd.zzcbh == null)) {
            zzbs.zzew();
            zztv.zza(this.zzamt.zzaif, this.zzamt.zzatd.zzcp, zzaeu, this.zzamt.zzatb, z, zzaeu.zzcdd.zzcbh);
        }
    }

    public final void zza(zzpu zzpu, String str) {
        zzqe zzqe = null;
        if (zzpu != null) {
            try {
                Object customTemplateId = zzpu.getCustomTemplateId();
            } catch (Throwable e) {
                zzaiw.zzc("Unable to call onCustomClick.", e);
                return;
            }
        }
        customTemplateId = null;
        if (!(this.zzamt.zzatr == null || customTemplateId == null)) {
            zzqe = (zzqe) this.zzamt.zzatr.get(customTemplateId);
        }
        if (zzqe == null) {
            zzaiw.zzco("Mediation adapter invoked onCustomClick but no listeners were set.");
        } else {
            zzqe.zzb(zzpu, str);
        }
    }

    public final boolean zza(zzaaa zzaaa, zznd zznd) {
        this.zzamo = zznd;
        zznd.zzf("seq_num", zzaaa.zzclr);
        zznd.zzf("request_id", zzaaa.zzcmb);
        zznd.zzf("session_id", zzaaa.zzcls);
        if (zzaaa.zzclp != null) {
            zznd.zzf("app_version", String.valueOf(zzaaa.zzclp.versionCode));
        }
        zzbt zzbt = this.zzamt;
        zzbs.zzdy();
        Context context = this.zzamt.zzaif;
        zzig zzig = this.zzamw.zzant;
        zzafh zzaau = zzaaa.zzclo.extras.getBundle("sdk_less_server_data") != null ? new zzaau(context, zzaaa, this, zzig) : new zzze(context, zzaaa, this, zzig);
        zzaau.zzps();
        zzbt.zzatf = zzaau;
        return true;
    }

    final boolean zza(zzaeu zzaeu) {
        zzis zzis;
        boolean z = false;
        if (this.zzamu != null) {
            zzis = this.zzamu;
            this.zzamu = null;
        } else {
            zzis = zzaeu.zzclo;
            if (zzis.extras != null) {
                z = zzis.extras.getBoolean("_noRefresh", false);
            }
        }
        return zza(zzis, zzaeu, z);
    }

    protected boolean zza(@Nullable zzaeu zzaeu, zzaeu zzaeu2) {
        int i;
        if (!(zzaeu == null || zzaeu.zzcdg == null)) {
            zzaeu.zzcdg.zza(null);
        }
        if (zzaeu2.zzcdg != null) {
            zzaeu2.zzcdg.zza((zzto) this);
        }
        int i2 = 0;
        if (zzaeu2.zzcvs != null) {
            i2 = zzaeu2.zzcvs.zzccj;
            i = zzaeu2.zzcvs.zzcck;
        } else {
            i = 0;
        }
        this.zzamt.zzauc.zze(i2, i);
        return true;
    }

    protected boolean zza(zzis zzis, zzaeu zzaeu, boolean z) {
        if (!z && this.zzamt.zzfg()) {
            zzbi zzbi;
            long j;
            if (zzaeu.zzccb > 0) {
                zzbi = this.zzams;
                j = zzaeu.zzccb;
            } else if (zzaeu.zzcvs != null && zzaeu.zzcvs.zzccb > 0) {
                zzbi = this.zzams;
                j = zzaeu.zzcvs.zzccb;
            } else if (!zzaeu.zzcng && zzaeu.errorCode == 2) {
                this.zzams.zzg(zzis);
            }
            zzbi.zza(zzis, j);
        }
        return this.zzams.zzdr();
    }

    public boolean zza(zzis zzis, zznd zznd) {
        return zza(zzis, zznd, 1);
    }

    public final boolean zza(zzis zzis, zznd zznd, int i) {
        if (!zzbz()) {
            return false;
        }
        zzaey zzpj;
        zzbs.zzec();
        zzgt zzad = zzbs.zzeg().zzad(this.zzamt.zzaif);
        String str = null;
        Bundle zza = zzad == null ? null : zzagr.zza(zzad);
        this.zzams.cancel();
        this.zzamt.zzaue = 0;
        if (((Boolean) zzbs.zzep().zzd(zzmq.zzbnq)).booleanValue()) {
            zzpj = zzbs.zzeg().zzpj();
            zzac zzej = zzbs.zzej();
            Context context = this.zzamt.zzaif;
            zzaiy zzaiy = this.zzamt.zzatd;
            String str2 = this.zzamt.zzatb;
            if (zzpj != null) {
                str = zzpj.getAppId();
            }
            zzej.zza(context, zzaiy, false, zzpj, str, str2, null);
        } else {
            zzpj = null;
        }
        return zza(zza(zzis, zza, zzpj, i), zznd);
    }

    public final void zzb(zzaeu zzaeu) {
        super.zzb(zzaeu);
        if (zzaeu.zzcdd != null) {
            zzaiw.zzbw("Disable the debug gesture detector on the mediation ad frame.");
            if (this.zzamt.zzate != null) {
                this.zzamt.zzate.zzfm();
            }
            zzaiw.zzbw("Pinging network fill URLs.");
            zzbs.zzew();
            zztv.zza(this.zzamt.zzaif, this.zzamt.zzatd.zzcp, zzaeu, this.zzamt.zzatb, false, zzaeu.zzcdd.zzcbj);
            if (!(zzaeu.zzcvs == null || zzaeu.zzcvs.zzcby == null || zzaeu.zzcvs.zzcby.size() <= 0)) {
                zzaiw.zzbw("Pinging urls remotely");
                zzbs.zzec().zza(this.zzamt.zzaif, zzaeu.zzcvs.zzcby);
            }
        } else {
            zzaiw.zzbw("Enable the debug gesture detector on the admob ad frame.");
            if (this.zzamt.zzate != null) {
                this.zzamt.zzate.zzfl();
            }
        }
        if (zzaeu.errorCode == 3 && zzaeu.zzcvs != null && zzaeu.zzcvs.zzcbx != null) {
            zzaiw.zzbw("Pinging no fill URLs.");
            zzbs.zzew();
            zztv.zza(this.zzamt.zzaif, this.zzamt.zzatd.zzcp, zzaeu, this.zzamt.zzatb, false, zzaeu.zzcvs.zzcbx);
        }
    }

    protected boolean zzbz() {
        zzbs.zzec();
        if (zzagr.zzd(this.zzamt.zzaif, this.zzamt.zzaif.getPackageName(), "android.permission.INTERNET")) {
            zzbs.zzec();
            if (zzagr.zzag(this.zzamt.zzaif)) {
                return true;
            }
        }
        return false;
    }

    public final void zzc(String str, String str2) {
        onAppEvent(str, str2);
    }

    protected final boolean zzc(zzis zzis) {
        return super.zzc(zzis) && !this.zzanc;
    }

    public void zzca() {
        this.zzanc = false;
        zzbp();
        this.zzamt.zzatk.zzok();
    }

    public void zzcb() {
        this.zzanc = true;
        zzbr();
    }

    public void zzcc() {
        zzaiw.zzco("Mediated ad does not support onVideoEnd callback");
    }

    public void zzcd() {
        onAdClicked();
    }

    public final void zzce() {
        zzca();
    }

    public final void zzcf() {
        zzbq();
    }

    public final void zzcg() {
        zzcb();
    }

    public final void zzch() {
        if (this.zzamt.zzati != null) {
            String str = this.zzamt.zzati.zzcdf;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 74);
            stringBuilder.append("Mediation adapter ");
            stringBuilder.append(str);
            stringBuilder.append(" refreshed, but mediation adapters should never refresh.");
            zzaiw.zzco(stringBuilder.toString());
        }
        zza(this.zzamt.zzati, true);
        zzbs();
    }

    public void zzci() {
        recordImpression();
    }

    @Nullable
    public final String zzcj() {
        return this.zzamt.zzati == null ? null : zzc(this.zzamt.zzati);
    }

    public final void zzck() {
        zzbs.zzec();
        zzagr.runOnUiThread(new zzg(this));
    }

    public final void zzcl() {
        zzbs.zzec();
        zzagr.runOnUiThread(new zzh(this));
    }
}
