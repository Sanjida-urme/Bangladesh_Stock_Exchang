package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.support.v4.app.NotificationCompat;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.common.util.zzi;
import com.google.android.gms.common.util.zzq;
import java.util.Locale;

public final class zzabv {
    private float zzaxd;
    private int zzclx;
    private int zzcly;
    private int zzcrt;
    private boolean zzcru;
    private boolean zzcrv;
    private String zzcrw;
    private String zzcrx;
    private boolean zzcry;
    private boolean zzcrz;
    private boolean zzcsa;
    private boolean zzcsb;
    private String zzcsc;
    private String zzcsd;
    private String zzcse;
    private int zzcsf;
    private int zzcsg;
    private int zzcsh;
    private int zzcsi;
    private int zzcsj;
    private int zzcsk;
    private double zzcsl;
    private boolean zzcsm;
    private boolean zzcsn;
    private int zzcso;
    private String zzcsp;
    private String zzcsq;
    private boolean zzcsr;

    public zzabv(Context context) {
        PackageManager packageManager = context.getPackageManager();
        zzm(context);
        zzn(context);
        zzo(context);
        Locale locale = Locale.getDefault();
        boolean z = false;
        this.zzcru = zza(packageManager, "geo:0,0?q=donuts") != null;
        if (zza(packageManager, "http://www.google.com") != null) {
            z = true;
        }
        this.zzcrv = z;
        this.zzcrx = locale.getCountry();
        zzjk.zzhx();
        this.zzcry = zzais.zzqs();
        this.zzcrz = zzi.zzcr(context);
        this.zzcsc = locale.getLanguage();
        this.zzcsd = zzb(context, packageManager);
        this.zzcse = zza(context, packageManager);
        Resources resources = context.getResources();
        if (resources != null) {
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            if (displayMetrics != null) {
                this.zzaxd = displayMetrics.density;
                this.zzclx = displayMetrics.widthPixels;
                this.zzcly = displayMetrics.heightPixels;
            }
        }
    }

    public zzabv(Context context, zzabu zzabu) {
        context.getPackageManager();
        zzm(context);
        zzn(context);
        zzo(context);
        this.zzcsp = Build.FINGERPRINT;
        this.zzcsq = Build.DEVICE;
        boolean z = zzq.zzalw() && zznn.zzi(context);
        this.zzcsr = z;
        this.zzcru = zzabu.zzcru;
        this.zzcrv = zzabu.zzcrv;
        this.zzcrx = zzabu.zzcrx;
        this.zzcry = zzabu.zzcry;
        this.zzcrz = zzabu.zzcrz;
        this.zzcsc = zzabu.zzcsc;
        this.zzcsd = zzabu.zzcsd;
        this.zzcse = zzabu.zzcse;
        this.zzaxd = zzabu.zzaxd;
        this.zzclx = zzabu.zzclx;
        this.zzcly = zzabu.zzcly;
    }

    private static ResolveInfo zza(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            zzbs.zzeg().zza(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    private static java.lang.String zza(android.content.Context r3, android.content.pm.PackageManager r4) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/558922244.run(Unknown Source)
*/
        /*
        r4 = 0;
        r3 = com.google.android.gms.internal.zzbgc.zzcy(r3);	 Catch:{ Exception -> 0x0032 }
        r0 = "com.android.vending";	 Catch:{ Exception -> 0x0032 }
        r1 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ Exception -> 0x0032 }
        r3 = r3.getPackageInfo(r0, r1);	 Catch:{ Exception -> 0x0032 }
        if (r3 == 0) goto L_0x0032;	 Catch:{ Exception -> 0x0032 }
    L_0x000f:
        r0 = r3.versionCode;	 Catch:{ Exception -> 0x0032 }
        r3 = r3.packageName;	 Catch:{ Exception -> 0x0032 }
        r1 = java.lang.String.valueOf(r3);	 Catch:{ Exception -> 0x0032 }
        r1 = r1.length();	 Catch:{ Exception -> 0x0032 }
        r1 = r1 + 12;	 Catch:{ Exception -> 0x0032 }
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0032 }
        r2.<init>(r1);	 Catch:{ Exception -> 0x0032 }
        r2.append(r0);	 Catch:{ Exception -> 0x0032 }
        r0 = ".";	 Catch:{ Exception -> 0x0032 }
        r2.append(r0);	 Catch:{ Exception -> 0x0032 }
        r2.append(r3);	 Catch:{ Exception -> 0x0032 }
        r3 = r2.toString();	 Catch:{ Exception -> 0x0032 }
        return r3;
    L_0x0032:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzabv.zza(android.content.Context, android.content.pm.PackageManager):java.lang.String");
    }

    private static java.lang.String zzb(android.content.Context r3, android.content.pm.PackageManager r4) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/558922244.run(Unknown Source)
*/
        /*
        r0 = "market://details?id=com.google.android.gms.ads";
        r4 = zza(r4, r0);
        r0 = 0;
        if (r4 != 0) goto L_0x000a;
    L_0x0009:
        return r0;
    L_0x000a:
        r4 = r4.activityInfo;
        if (r4 != 0) goto L_0x000f;
    L_0x000e:
        return r0;
    L_0x000f:
        r3 = com.google.android.gms.internal.zzbgc.zzcy(r3);	 Catch:{ NameNotFoundException -> 0x003f }
        r1 = r4.packageName;	 Catch:{ NameNotFoundException -> 0x003f }
        r2 = 0;	 Catch:{ NameNotFoundException -> 0x003f }
        r3 = r3.getPackageInfo(r1, r2);	 Catch:{ NameNotFoundException -> 0x003f }
        if (r3 == 0) goto L_0x003f;	 Catch:{ NameNotFoundException -> 0x003f }
    L_0x001c:
        r3 = r3.versionCode;	 Catch:{ NameNotFoundException -> 0x003f }
        r4 = r4.packageName;	 Catch:{ NameNotFoundException -> 0x003f }
        r1 = java.lang.String.valueOf(r4);	 Catch:{ NameNotFoundException -> 0x003f }
        r1 = r1.length();	 Catch:{ NameNotFoundException -> 0x003f }
        r1 = r1 + 12;	 Catch:{ NameNotFoundException -> 0x003f }
        r2 = new java.lang.StringBuilder;	 Catch:{ NameNotFoundException -> 0x003f }
        r2.<init>(r1);	 Catch:{ NameNotFoundException -> 0x003f }
        r2.append(r3);	 Catch:{ NameNotFoundException -> 0x003f }
        r3 = ".";	 Catch:{ NameNotFoundException -> 0x003f }
        r2.append(r3);	 Catch:{ NameNotFoundException -> 0x003f }
        r2.append(r4);	 Catch:{ NameNotFoundException -> 0x003f }
        r3 = r2.toString();	 Catch:{ NameNotFoundException -> 0x003f }
        return r3;
    L_0x003f:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzabv.zzb(android.content.Context, android.content.pm.PackageManager):java.lang.String");
    }

    private final void zzm(Context context) {
        zzbs.zzec();
        AudioManager zzao = zzagr.zzao(context);
        if (zzao != null) {
            try {
                this.zzcrt = zzao.getMode();
                this.zzcsa = zzao.isMusicActive();
                this.zzcsb = zzao.isSpeakerphoneOn();
                this.zzcsf = zzao.getStreamVolume(3);
                this.zzcsj = zzao.getRingerMode();
                this.zzcsk = zzao.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                zzbs.zzeg().zza(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.zzcrt = -2;
        this.zzcsa = false;
        this.zzcsb = false;
        this.zzcsf = 0;
        this.zzcsj = 0;
        this.zzcsk = 0;
    }

    @TargetApi(16)
    private final void zzn(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.zzcrw = telephonyManager.getNetworkOperator();
        this.zzcsh = telephonyManager.getNetworkType();
        this.zzcsi = telephonyManager.getPhoneType();
        this.zzcsg = -2;
        this.zzcsn = false;
        this.zzcso = -1;
        zzbs.zzec();
        if (zzagr.zzd(context, context.getPackageName(), "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.zzcsg = activeNetworkInfo.getType();
                this.zzcso = activeNetworkInfo.getDetailedState().ordinal();
            } else {
                this.zzcsg = -1;
            }
            if (VERSION.SDK_INT >= 16) {
                this.zzcsn = connectivityManager.isActiveNetworkMetered();
            }
        }
    }

    private final void zzo(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
            this.zzcsl = (double) (((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
            this.zzcsm = z;
            return;
        }
        this.zzcsl = -1.0d;
        this.zzcsm = false;
    }

    public final zzabu zzns() {
        int i = this.zzcrt;
        boolean z = this.zzcru;
        boolean z2 = this.zzcrv;
        String str = this.zzcrw;
        String str2 = this.zzcrx;
        boolean z3 = this.zzcry;
        boolean z4 = this.zzcrz;
        boolean z5 = this.zzcsa;
        boolean z6 = this.zzcsb;
        String str3 = this.zzcsc;
        String str4 = this.zzcsd;
        String str5 = this.zzcse;
        int i2 = this.zzcsf;
        int i3 = this.zzcsg;
        int i4 = this.zzcsh;
        int i5 = i3;
        int i6 = this.zzcsi;
        int i7 = this.zzcsj;
        int i8 = this.zzcsk;
        float f = this.zzaxd;
        int i9 = this.zzclx;
        int i10 = i2;
        int i11 = this.zzcly;
        double d = this.zzcsl;
        boolean z7 = this.zzcsm;
        boolean z8 = this.zzcsn;
        boolean z9 = z7;
        boolean z10 = z8;
        return new zzabu(i, z, z2, str, str2, z3, z4, z5, z6, str3, str4, str5, i10, i5, i4, i6, i7, i8, f, i9, i11, d, z9, z10, this.zzcso, this.zzcsp, this.zzcsr, this.zzcsq);
    }
}
