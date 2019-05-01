package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

@zzzb
public final class zzzz extends zzbej {
    public static final Creator<zzzz> CREATOR = new zzaab();
    public final ApplicationInfo applicationInfo;
    public final int versionCode;
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
    public final String zzclq;
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
    public final long zzcme;
    public final String zzcmf;
    public final float zzcmg;
    public final int zzcmh;
    public final int zzcmi;
    public final boolean zzcmj;
    public final boolean zzcmk;
    public final String zzcml;
    public final boolean zzcmm;
    public final String zzcmn;
    public final int zzcmo;
    public final Bundle zzcmp;
    public final String zzcmq;
    public final boolean zzcmr;
    public final Bundle zzcms;
    @Nullable
    public final String zzcmt;
    @Nullable
    public final String zzcmu;
    @Nullable
    public final String zzcmv;
    public final boolean zzcmw;
    public final String zzcmx;
    public final List<String> zzcmy;
    public final int zzcmz;
    public final boolean zzcna;
    public final boolean zzcnb;

    zzzz(int i, Bundle bundle, zzis zzis, zziw zziw, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, zzaiy zzaiy, Bundle bundle2, int i2, List<String> list, Bundle bundle3, boolean z, int i3, int i4, float f, String str5, long j, String str6, List<String> list2, String str7, zzom zzom, List<String> list3, long j2, String str8, float f2, boolean z2, int i5, int i6, boolean z3, boolean z4, String str9, String str10, boolean z5, int i7, Bundle bundle4, String str11, zzla zzla, boolean z6, Bundle bundle5, String str12, String str13, String str14, boolean z7, List<Integer> list4, String str15, List<String> list5, int i8, boolean z8, boolean z9) {
        this.versionCode = i;
        this.zzcln = bundle;
        this.zzclo = zzis;
        this.zzath = zziw;
        this.zzatb = str;
        this.applicationInfo = applicationInfo;
        this.zzclp = packageInfo;
        this.zzclq = str2;
        this.zzclr = str3;
        this.zzcls = str4;
        this.zzatd = zzaiy;
        this.zzclt = bundle2;
        this.zzclu = i2;
        this.zzaub = list;
        r0.zzcmd = list3 == null ? Collections.emptyList() : Collections.unmodifiableList(list3);
        r0.zzclv = bundle3;
        r0.zzclw = z;
        r0.zzclx = i3;
        r0.zzcly = i4;
        r0.zzaxd = f;
        r0.zzclz = str5;
        r0.zzcma = j;
        r0.zzcmb = str6;
        r0.zzcmc = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        r0.zzata = str7;
        r0.zzatt = zzom;
        r0.zzcme = j2;
        r0.zzcmf = str8;
        r0.zzcmg = f2;
        r0.zzcmm = z2;
        r0.zzcmh = i5;
        r0.zzcmi = i6;
        r0.zzcmj = z3;
        r0.zzcmk = z4;
        r0.zzcml = str9;
        r0.zzcmn = str10;
        r0.zzcbz = z5;
        r0.zzcmo = i7;
        r0.zzcmp = bundle4;
        r0.zzcmq = str11;
        r0.zzatv = zzla;
        r0.zzcmr = z6;
        r0.zzcms = bundle5;
        r0.zzcmt = str12;
        r0.zzcmu = str13;
        r0.zzcmv = str14;
        r0.zzcmw = z7;
        r0.zzatx = list4;
        r0.zzcmx = str15;
        r0.zzcmy = list5;
        r0.zzcmz = i8;
        r0.zzcna = z8;
        r0.zzcnb = z9;
    }

    private zzzz(@Nullable Bundle bundle, zzis zzis, zziw zziw, String str, ApplicationInfo applicationInfo, @Nullable PackageInfo packageInfo, String str2, String str3, String str4, zzaiy zzaiy, Bundle bundle2, int i, List<String> list, List<String> list2, Bundle bundle3, boolean z, int i2, int i3, float f, String str5, long j, String str6, @Nullable List<String> list3, String str7, zzom zzom, long j2, String str8, float f2, boolean z2, int i4, int i5, boolean z3, boolean z4, String str9, String str10, boolean z5, int i6, Bundle bundle4, String str11, @Nullable zzla zzla, boolean z6, Bundle bundle5, String str12, String str13, String str14, boolean z7, List<Integer> list4, String str15, List<String> list5, int i7, boolean z8, boolean z9) {
        this(24, bundle, zzis, zziw, str, applicationInfo, packageInfo, str2, str3, str4, zzaiy, bundle2, i, list, bundle3, z, i2, i3, f, str5, j, str6, list3, str7, zzom, list2, j2, str8, f2, z2, i4, i5, z3, z4, str9, str10, z5, i6, bundle4, str11, zzla, z6, bundle5, str12, str13, str14, z7, list4, str15, list5, i7, z8, z9);
    }

    public zzzz(zzaaa zzaaa, long j, String str, String str2, String str3) {
        zzaaa zzaaa2 = zzaaa;
        Bundle bundle = zzaaa2.zzcln;
        zzis zzis = zzaaa2.zzclo;
        zziw zziw = zzaaa2.zzath;
        String str4 = zzaaa2.zzatb;
        ApplicationInfo applicationInfo = zzaaa2.applicationInfo;
        PackageInfo packageInfo = zzaaa2.zzclp;
        String str5 = (String) zzajg.zza(zzaaa2.zzcnd, (Object) "");
        String str6 = zzaaa2.zzclr;
        String str7 = zzaaa2.zzcls;
        zzaiy zzaiy = zzaaa2.zzatd;
        Bundle bundle2 = zzaaa2.zzclt;
        int i = zzaaa2.zzclu;
        List list = zzaaa2.zzaub;
        List list2 = zzaaa2.zzcmd;
        Bundle bundle3 = zzaaa2.zzclv;
        boolean z = zzaaa2.zzclw;
        int i2 = zzaaa2.zzclx;
        int i3 = zzaaa2.zzcly;
        float f = zzaaa2.zzaxd;
        List list3 = list2;
        String str8 = zzaaa2.zzclz;
        long j2 = zzaaa2.zzcma;
        String str9 = zzaaa2.zzcmb;
        list2 = zzaaa2.zzcmc;
        String str10 = str9;
        String str11 = zzaaa2.zzata;
        zzom zzom = zzaaa2.zzatt;
        String str12 = zzaaa2.zzcmf;
        float f2 = zzaaa2.zzcmg;
        boolean z2 = zzaaa2.zzcmm;
        int i4 = zzaaa2.zzcmh;
        int i5 = zzaaa2.zzcmi;
        boolean z3 = zzaaa2.zzcmj;
        List list4 = list2;
        boolean z4 = zzaaa2.zzcmk;
        List list5 = list;
        Bundle bundle4 = bundle2;
        int i6 = i;
        String str13 = (String) zzajg.zza(zzaaa2.zzcnc, (Object) "", 1, TimeUnit.SECONDS);
        str9 = zzaaa2.zzcmn;
        boolean z5 = zzaaa2.zzcbz;
        int i7 = zzaaa2.zzcmo;
        Bundle bundle5 = zzaaa2.zzcmp;
        String str14 = zzaaa2.zzcmq;
        String str15 = str9;
        zzla zzla = zzaaa2.zzatv;
        boolean z6 = zzaaa2.zzcmr;
        Bundle bundle6 = zzaaa2.zzcms;
        boolean z7 = zzaaa2.zzcmw;
        List list6 = zzaaa2.zzatx;
        String str16 = zzaaa2.zzcmx;
        List list7 = zzaaa2.zzcmy;
        int i8 = zzaaa2.zzcmz;
        boolean z8 = zzaaa2.zzcna;
        String str17 = str14;
        Bundle bundle7 = bundle5;
        int i9 = i7;
        boolean z9 = z5;
        list2 = list3;
        boolean z10 = z8;
        boolean z11 = z;
        int i10 = i2;
        int i11 = i3;
        float f3 = f;
        String str18 = str8;
        String str19 = str10;
        Bundle bundle8 = bundle3;
        long j3 = j;
        String str20 = str;
        String str21 = str2;
        String str22 = str3;
        this(bundle, zzis, zziw, str4, applicationInfo, packageInfo, str5, str6, str7, zzaiy, bundle4, i6, list5, list2, bundle8, z11, i10, i11, f3, str18, j2, str19, list4, str11, zzom, j3, str12, f2, z2, i4, i5, z3, z4, str13, str15, z9, i9, bundle7, str17, zzla, z6, bundle6, str20, str21, str22, z7, list6, str16, list7, i8, z10, zzaaa2.zzcnb);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int zze = zzbem.zze(parcel);
        zzbem.zzc(parcel, 1, this.versionCode);
        zzbem.zza(parcel, 2, this.zzcln, false);
        zzbem.zza(parcel, 3, this.zzclo, i, false);
        zzbem.zza(parcel, 4, this.zzath, i, false);
        zzbem.zza(parcel, 5, this.zzatb, false);
        zzbem.zza(parcel, 6, this.applicationInfo, i, false);
        zzbem.zza(parcel, 7, this.zzclp, i, false);
        zzbem.zza(parcel, 8, this.zzclq, false);
        zzbem.zza(parcel, 9, this.zzclr, false);
        zzbem.zza(parcel, 10, this.zzcls, false);
        zzbem.zza(parcel, 11, this.zzatd, i, false);
        zzbem.zza(parcel, 12, this.zzclt, false);
        zzbem.zzc(parcel, 13, this.zzclu);
        zzbem.zzb(parcel, 14, this.zzaub, false);
        zzbem.zza(parcel, 15, this.zzclv, false);
        zzbem.zza(parcel, 16, this.zzclw);
        zzbem.zzc(parcel, 18, this.zzclx);
        zzbem.zzc(parcel, 19, this.zzcly);
        zzbem.zza(parcel, 20, this.zzaxd);
        zzbem.zza(parcel, 21, this.zzclz, false);
        zzbem.zza(parcel, 25, this.zzcma);
        zzbem.zza(parcel, 26, this.zzcmb, false);
        zzbem.zzb(parcel, 27, this.zzcmc, false);
        zzbem.zza(parcel, 28, this.zzata, false);
        zzbem.zza(parcel, 29, this.zzatt, i, false);
        zzbem.zzb(parcel, 30, this.zzcmd, false);
        zzbem.zza(parcel, 31, this.zzcme);
        zzbem.zza(parcel, 33, this.zzcmf, false);
        zzbem.zza(parcel, 34, this.zzcmg);
        zzbem.zzc(parcel, 35, this.zzcmh);
        zzbem.zzc(parcel, 36, this.zzcmi);
        zzbem.zza(parcel, 37, this.zzcmj);
        zzbem.zza(parcel, 38, this.zzcmk);
        zzbem.zza(parcel, 39, this.zzcml, false);
        zzbem.zza(parcel, 40, this.zzcmm);
        zzbem.zza(parcel, 41, this.zzcmn, false);
        zzbem.zza(parcel, 42, this.zzcbz);
        zzbem.zzc(parcel, 43, this.zzcmo);
        zzbem.zza(parcel, 44, this.zzcmp, false);
        zzbem.zza(parcel, 45, this.zzcmq, false);
        zzbem.zza(parcel, 46, this.zzatv, i, false);
        zzbem.zza(parcel, 47, this.zzcmr);
        zzbem.zza(parcel, 48, this.zzcms, false);
        zzbem.zza(parcel, 49, this.zzcmt, false);
        zzbem.zza(parcel, 50, this.zzcmu, false);
        zzbem.zza(parcel, 51, this.zzcmv, false);
        zzbem.zza(parcel, 52, this.zzcmw);
        zzbem.zza(parcel, 53, this.zzatx, false);
        zzbem.zza(parcel, 54, this.zzcmx, false);
        zzbem.zzb(parcel, 55, this.zzcmy, false);
        zzbem.zzc(parcel, 56, this.zzcmz);
        zzbem.zza(parcel, 57, this.zzcna);
        zzbem.zza(parcel, 58, this.zzcnb);
        zzbem.zzai(parcel, zze);
    }
}
