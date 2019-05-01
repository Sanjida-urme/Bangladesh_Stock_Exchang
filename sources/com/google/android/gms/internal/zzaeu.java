package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

@zzzb
public final class zzaeu {
    public final int errorCode;
    public final int orientation;
    public final boolean zzapy;
    public final List<String> zzcbv;
    public final List<String> zzcbw;
    @Nullable
    public final List<String> zzcby;
    public final long zzccb;
    @Nullable
    public final zztm zzcdd;
    @Nullable
    public final zzuf zzcde;
    @Nullable
    public final String zzcdf;
    @Nullable
    public final zztp zzcdg;
    @Nullable
    public final zzama zzchj;
    public final zzis zzclo;
    public final String zzclr;
    private long zzcnf;
    public final boolean zzcng;
    private long zzcnh;
    public final List<String> zzcni;
    public final String zzcnl;
    @Nullable
    public final zzadw zzcnv;
    @Nullable
    public final List<String> zzcnx;
    public final boolean zzcny;
    private zzaaf zzcnz;
    public final String zzcoc;
    public final JSONObject zzcvq;
    public boolean zzcvr;
    public final zztn zzcvs;
    @Nullable
    public final String zzcvt;
    public final zziw zzcvu;
    @Nullable
    public final List<String> zzcvv;
    public final long zzcvw;
    public final long zzcvx;
    @Nullable
    public final zzoc zzcvy;
    public boolean zzcvz;
    public boolean zzcwa;
    public boolean zzcwb;
    public final zzib zzcwc;
    public final boolean zzcwd;

    public zzaeu(zzaev zzaev, @Nullable zzama zzama, @Nullable zztm zztm, @Nullable zzuf zzuf, @Nullable String str, @Nullable zztp zztp, @Nullable zzoc zzoc, @Nullable String str2) {
        zzaev zzaev2 = zzaev;
        zzis zzis = zzaev2.zzcpe.zzclo;
        List list = zzaev2.zzcwe.zzcbv;
        int i = zzaev2.errorCode;
        List list2 = zzaev2.zzcwe.zzcbw;
        List list3 = zzaev2.zzcwe.zzcni;
        int i2 = zzaev2.zzcwe.orientation;
        long j = zzaev2.zzcwe.zzccb;
        String str3 = zzaev2.zzcpe.zzclr;
        boolean z = zzaev2.zzcwe.zzcng;
        zztn zztn = zzaev2.zzcvs;
        long j2 = zzaev2.zzcwe.zzcnh;
        zziw zziw = zzaev2.zzath;
        long j3 = j2;
        long j4 = zzaev2.zzcwe.zzcnf;
        long j5 = zzaev2.zzcvw;
        j2 = zzaev2.zzcvx;
        String str4 = zzaev2.zzcwe.zzcnl;
        long j6 = j2;
        JSONObject jSONObject = zzaev2.zzcvq;
        zzadw zzadw = zzaev2.zzcwe.zzcnv;
        String str5 = str4;
        List list4 = zzaev2.zzcwe.zzcnw;
        List list5 = zzaev2.zzcwe.zzcnw;
        boolean z2 = zzaev2.zzcwe.zzcny;
        zzaaf zzaaf = zzaev2.zzcwe.zzcnz;
        List list6 = zzaev2.zzcwe.zzcby;
        str4 = zzaev2.zzcwe.zzcoc;
        JSONObject jSONObject2 = jSONObject;
        zzib zzib = zzaev2.zzcwc;
        zziw zziw2 = zziw;
        zzama zzama2 = null;
        zzadw zzadw2 = zzadw;
        zztm zztm2 = null;
        zzib zzib2 = zzib;
        JSONObject jSONObject3 = jSONObject2;
        zzuf zzuf2 = null;
        String str6 = null;
        zztn zztn2 = zztn;
        zztp zztp2 = null;
        long j7 = j3;
        long j8 = j4;
        long j9 = j5;
        long j10 = j6;
        this(zzis, zzama2, list, i, list2, list3, i2, j, str3, z, zztm2, zzuf2, str6, zztn2, zztp2, j7, zziw2, j8, j9, j10, str5, jSONObject3, null, zzadw2, list4, list5, z2, zzaaf, null, list6, str4, zzib2, zzaev2.zzcwe.zzapy, zzaev2.zzcwd);
    }

    public zzaeu(zzis zzis, @Nullable zzama zzama, List<String> list, int i, List<String> list2, List<String> list3, int i2, long j, String str, boolean z, @Nullable zztm zztm, @Nullable zzuf zzuf, @Nullable String str2, zztn zztn, @Nullable zztp zztp, long j2, zziw zziw, long j3, long j4, long j5, String str3, JSONObject jSONObject, @Nullable zzoc zzoc, zzadw zzadw, List<String> list4, List<String> list5, boolean z2, zzaaf zzaaf, @Nullable String str4, List<String> list6, String str5, zzib zzib, boolean z3, boolean z4) {
        this.zzcvz = false;
        this.zzcwa = false;
        this.zzcwb = false;
        this.zzclo = zzis;
        this.zzchj = zzama;
        this.zzcbv = zzp(list);
        this.errorCode = i;
        this.zzcbw = zzp(list2);
        this.zzcni = zzp(list3);
        this.orientation = i2;
        this.zzccb = j;
        this.zzclr = str;
        this.zzcng = z;
        this.zzcdd = zztm;
        this.zzcde = zzuf;
        this.zzcdf = str2;
        this.zzcvs = zztn;
        this.zzcdg = zztp;
        this.zzcnh = j2;
        this.zzcvu = zziw;
        this.zzcnf = j3;
        this.zzcvw = j4;
        this.zzcvx = j5;
        this.zzcnl = str3;
        this.zzcvq = jSONObject;
        this.zzcvy = zzoc;
        this.zzcnv = zzadw;
        this.zzcvv = zzp(list4);
        this.zzcnx = zzp(list5);
        this.zzcny = z2;
        this.zzcnz = zzaaf;
        this.zzcvt = str4;
        this.zzcby = zzp(list6);
        this.zzcoc = str5;
        this.zzcwc = zzib;
        this.zzapy = z3;
        this.zzcwd = z4;
    }

    @Nullable
    private static <T> List<T> zzp(@Nullable List<T> list) {
        return list == null ? null : Collections.unmodifiableList(list);
    }

    public final boolean zzfr() {
        if (this.zzchj != null) {
            if (this.zzchj.zzsq() != null) {
                return this.zzchj.zzsq().zzfr();
            }
        }
        return false;
    }
}
