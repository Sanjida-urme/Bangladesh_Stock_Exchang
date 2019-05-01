package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

@zzzb
public final class zzaad extends zzbej {
    public static final Creator<zzaad> CREATOR = new zzaae();
    public String body;
    public final int errorCode;
    public final int orientation;
    private int versionCode;
    public final boolean zzapy;
    public final boolean zzbdd;
    public final boolean zzbde;
    public final boolean zzbdf;
    public final List<String> zzcbv;
    public final List<String> zzcbw;
    public final List<String> zzcby;
    public final boolean zzcbz;
    public final long zzccb;
    private zzzz zzcdj;
    public final String zzchl;
    public final boolean zzclw;
    public final boolean zzcmk;
    @Nullable
    public String zzcml;
    public final boolean zzcmw;
    public final long zzcnf;
    public final boolean zzcng;
    public final long zzcnh;
    public final List<String> zzcni;
    public final String zzcnj;
    public final long zzcnk;
    public final String zzcnl;
    public final boolean zzcnm;
    public final String zzcnn;
    public final String zzcno;
    public final boolean zzcnp;
    public final boolean zzcnq;
    public final boolean zzcnr;
    private zzaap zzcns;
    public String zzcnt;
    public final String zzcnu;
    @Nullable
    public final zzadw zzcnv;
    @Nullable
    public final List<String> zzcnw;
    @Nullable
    public final List<String> zzcnx;
    public final boolean zzcny;
    @Nullable
    public final zzaaf zzcnz;
    @Nullable
    public final String zzcoa;
    @Nullable
    public final zzaee zzcob;
    @Nullable
    public final String zzcoc;
    public final boolean zzcod;
    private Bundle zzcoe;
    public final int zzcof;

    public zzaad(int i) {
        this(19, null, null, null, i, null, -1, false, -1, null, -1, -1, null, -1, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, true, false, null, false, 0);
    }

    public zzaad(int i, long j) {
        this(19, null, null, null, i, null, -1, false, -1, null, j, -1, null, -1, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, true, false, null, false, 0);
    }

    zzaad(int i, String str, String str2, List<String> list, int i2, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i3, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, zzaap zzaap, String str7, String str8, boolean z8, boolean z9, zzadw zzadw, List<String> list4, List<String> list5, boolean z10, zzaaf zzaaf, boolean z11, String str9, List<String> list6, boolean z12, String str10, zzaee zzaee, String str11, boolean z13, boolean z14, Bundle bundle, boolean z15, int i4) {
        this.versionCode = i;
        this.zzchl = str;
        this.body = str2;
        List list7 = null;
        r0.zzcbv = list != null ? Collections.unmodifiableList(list) : null;
        r0.errorCode = i2;
        r0.zzcbw = list2 != null ? Collections.unmodifiableList(list2) : null;
        r0.zzcnf = j;
        r0.zzcng = z;
        r0.zzcnh = j2;
        if (list3 != null) {
            list7 = Collections.unmodifiableList(list3);
        }
        r0.zzcni = list7;
        r0.zzccb = j3;
        r0.orientation = i3;
        r0.zzcnj = str3;
        r0.zzcnk = j4;
        r0.zzcnl = str4;
        r0.zzcnm = z2;
        r0.zzcnn = str5;
        r0.zzcno = str6;
        r0.zzcnp = z3;
        r0.zzbdd = z4;
        r0.zzclw = z5;
        r0.zzcnq = z6;
        r0.zzcod = z13;
        r0.zzcnr = z7;
        r0.zzcns = zzaap;
        r0.zzcnt = str7;
        r0.zzcnu = str8;
        if (r0.body == null && r0.zzcns != null) {
            zzabd zzabd = (zzabd) r0.zzcns.zza(zzabd.CREATOR);
            if (!(zzabd == null || TextUtils.isEmpty(zzabd.zzbrb))) {
                r0.body = zzabd.zzbrb;
            }
        }
        r0.zzbde = z8;
        r0.zzbdf = z9;
        r0.zzcnv = zzadw;
        r0.zzcnw = list4;
        r0.zzcnx = list5;
        r0.zzcny = z10;
        r0.zzcnz = zzaaf;
        r0.zzcmk = z11;
        r0.zzcml = str9;
        r0.zzcby = list6;
        r0.zzcbz = z12;
        r0.zzcoa = str10;
        r0.zzcob = zzaee;
        r0.zzcoc = str11;
        r0.zzcmw = z14;
        r0.zzcoe = bundle;
        r0.zzapy = z15;
        r0.zzcof = i4;
    }

    public zzaad(zzzz zzzz, String str, String str2, List<String> list, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i, String str3, long j4, String str4, String str5, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str6, boolean z7, boolean z8, zzadw zzadw, List<String> list4, List<String> list5, boolean z9, zzaaf zzaaf, boolean z10, String str7, List<String> list6, boolean z11, String str8, zzaee zzaee, String str9, boolean z12, boolean z13, boolean z14, int i2) {
        this(19, str, str2, list, -2, list2, j, z, -1, list3, j3, i, str3, j4, str4, false, null, str5, z2, z3, z4, z5, false, null, null, str6, z7, z8, zzadw, list4, list5, z9, zzaaf, z10, str7, list6, z11, str8, zzaee, str9, z12, z13, null, z14, i2);
        this.zzcdj = zzzz;
    }

    public zzaad(zzzz zzzz, String str, String str2, List<String> list, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str7, boolean z8, boolean z9, zzadw zzadw, List<String> list4, List<String> list5, boolean z10, zzaaf zzaaf, boolean z11, String str8, List<String> list6, boolean z12, String str9, zzaee zzaee, String str10, boolean z13, boolean z14, boolean z15, int i2) {
        this(19, str, str2, list, -2, list2, j, z, j2, list3, j3, i, str3, j4, str4, z2, str5, str6, z3, z4, z5, z6, z7, null, null, str7, z8, z9, zzadw, list4, list5, z10, zzaaf, z11, str8, list6, z12, str9, zzaee, str10, z13, z14, null, z15, 0);
        this.zzcdj = zzzz;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (!(this.zzcdj == null || this.zzcdj.versionCode < 9 || TextUtils.isEmpty(this.body))) {
            this.zzcns = new zzaap(new zzabd(this.body));
            this.body = null;
        }
        int zze = zzbem.zze(parcel);
        zzbem.zzc(parcel, 1, this.versionCode);
        zzbem.zza(parcel, 2, this.zzchl, false);
        zzbem.zza(parcel, 3, this.body, false);
        zzbem.zzb(parcel, 4, this.zzcbv, false);
        zzbem.zzc(parcel, 5, this.errorCode);
        zzbem.zzb(parcel, 6, this.zzcbw, false);
        zzbem.zza(parcel, 7, this.zzcnf);
        zzbem.zza(parcel, 8, this.zzcng);
        zzbem.zza(parcel, 9, this.zzcnh);
        zzbem.zzb(parcel, 10, this.zzcni, false);
        zzbem.zza(parcel, 11, this.zzccb);
        zzbem.zzc(parcel, 12, this.orientation);
        zzbem.zza(parcel, 13, this.zzcnj, false);
        zzbem.zza(parcel, 14, this.zzcnk);
        zzbem.zza(parcel, 15, this.zzcnl, false);
        zzbem.zza(parcel, 18, this.zzcnm);
        zzbem.zza(parcel, 19, this.zzcnn, false);
        zzbem.zza(parcel, 21, this.zzcno, false);
        zzbem.zza(parcel, 22, this.zzcnp);
        zzbem.zza(parcel, 23, this.zzbdd);
        zzbem.zza(parcel, 24, this.zzclw);
        zzbem.zza(parcel, 25, this.zzcnq);
        zzbem.zza(parcel, 26, this.zzcnr);
        zzbem.zza(parcel, 28, this.zzcns, i, false);
        zzbem.zza(parcel, 29, this.zzcnt, false);
        zzbem.zza(parcel, 30, this.zzcnu, false);
        zzbem.zza(parcel, 31, this.zzbde);
        zzbem.zza(parcel, 32, this.zzbdf);
        zzbem.zza(parcel, 33, this.zzcnv, i, false);
        zzbem.zzb(parcel, 34, this.zzcnw, false);
        zzbem.zzb(parcel, 35, this.zzcnx, false);
        zzbem.zza(parcel, 36, this.zzcny);
        zzbem.zza(parcel, 37, this.zzcnz, i, false);
        zzbem.zza(parcel, 38, this.zzcmk);
        zzbem.zza(parcel, 39, this.zzcml, false);
        zzbem.zzb(parcel, 40, this.zzcby, false);
        zzbem.zza(parcel, 42, this.zzcbz);
        zzbem.zza(parcel, 43, this.zzcoa, false);
        zzbem.zza(parcel, 44, this.zzcob, i, false);
        zzbem.zza(parcel, 45, this.zzcoc, false);
        zzbem.zza(parcel, 46, this.zzcod);
        zzbem.zza(parcel, 47, this.zzcmw);
        zzbem.zza(parcel, 48, this.zzcoe, false);
        zzbem.zza(parcel, 49, this.zzapy);
        zzbem.zzc(parcel, 50, this.zzcof);
        zzbem.zzai(parcel, zze);
    }
}
