package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import java.util.List;
import java.util.concurrent.Future;

@zzzb
public final class zzaaa {
    public final ApplicationInfo applicationInfo;
    public final String zzata;
    public final String zzatb;
    public final zzaiy zzatd;
    public final zziw zzath;
    public final zzom zzatt;
    @Nullable
    public final zzla zzatv;
    public final List<Integer> zzatx;
    public final List<String> zzaub;
    public final float zzaxd;
    public final boolean zzcbz;
    @Nullable
    public final Bundle zzcln;
    public final zzis zzclo;
    @Nullable
    public final PackageInfo zzclp;
    public final String zzclr;
    public final String zzcls;
    public final Bundle zzclt;
    public final int zzclu;
    public final Bundle zzclv;
    public final boolean zzclw;
    public final int zzclx;
    public final int zzcly;
    public final String zzclz;
    public final long zzcma;
    public final String zzcmb;
    @Nullable
    public final List<String> zzcmc;
    public final List<String> zzcmd;
    public final String zzcmf;
    public final float zzcmg;
    public final int zzcmh;
    public final int zzcmi;
    public final boolean zzcmj;
    public final boolean zzcmk;
    public final boolean zzcmm;
    public final String zzcmn;
    public final int zzcmo;
    public final Bundle zzcmp;
    public final String zzcmq;
    public final boolean zzcmr;
    @Nullable
    public final Bundle zzcms;
    public final boolean zzcmw;
    public final String zzcmx;
    public final List<String> zzcmy;
    public final int zzcmz;
    public final boolean zzcna;
    public final boolean zzcnb;
    public final Future<String> zzcnc;
    public final Future<String> zzcnd;

    public zzaaa(@Nullable Bundle bundle, zzis zzis, zziw zziw, String str, ApplicationInfo applicationInfo, @Nullable PackageInfo packageInfo, String str2, String str3, zzaiy zzaiy, Bundle bundle2, List<String> list, List<String> list2, Bundle bundle3, boolean z, int i, int i2, float f, String str4, long j, String str5, @Nullable List<String> list3, String str6, zzom zzom, String str7, float f2, boolean z2, int i3, int i4, boolean z3, boolean z4, Future<String> future, String str8, boolean z5, int i5, Bundle bundle4, String str9, @Nullable zzla zzla, boolean z6, Bundle bundle5, boolean z7, Future<String> future2, List<Integer> list4, String str10, List<String> list5, int i6, boolean z8, boolean z9) {
        List list6;
        List<String> list7 = list;
        this.zzcln = bundle;
        this.zzclo = zzis;
        this.zzath = zziw;
        this.zzatb = str;
        this.applicationInfo = applicationInfo;
        this.zzclp = packageInfo;
        this.zzclr = str2;
        this.zzcls = str3;
        this.zzatd = zzaiy;
        this.zzclt = bundle2;
        this.zzclw = z;
        this.zzclx = i;
        this.zzcly = i2;
        this.zzaxd = f;
        if (list7 == null || list7.size() <= 0) {
            r0.zzclu = 0;
            list6 = null;
            r0.zzaub = null;
        } else {
            r0.zzclu = 3;
            r0.zzaub = list7;
            list6 = list2;
        }
        r0.zzcmd = list6;
        r0.zzclv = bundle3;
        r0.zzclz = str4;
        r0.zzcma = j;
        r0.zzcmb = str5;
        r0.zzcmc = list3;
        r0.zzata = str6;
        r0.zzatt = zzom;
        r0.zzcmf = str7;
        r0.zzcmg = f2;
        r0.zzcmm = z2;
        r0.zzcmh = i3;
        r0.zzcmi = i4;
        r0.zzcmj = z3;
        r0.zzcmk = z4;
        r0.zzcnc = future;
        r0.zzcmn = str8;
        r0.zzcbz = z5;
        r0.zzcmo = i5;
        r0.zzcmp = bundle4;
        r0.zzcmq = str9;
        r0.zzatv = zzla;
        r0.zzcmr = z6;
        r0.zzcms = bundle5;
        r0.zzcmw = z7;
        r0.zzcnd = future2;
        r0.zzatx = list4;
        r0.zzcmx = str10;
        r0.zzcmy = list5;
        r0.zzcmz = i6;
        r0.zzcna = z8;
        r0.zzcnb = z9;
    }
}
