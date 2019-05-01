package com.google.android.gms.internal;

import java.util.List;
import org.json.JSONObject;

@zzzb
public final class zzxi extends zzafh {
    private final zzxg zzchu;
    private final zzaev zzchv;
    private final zzaad zzchw = this.zzchv.zzcwe;

    public zzxi(zzaev zzaev, zzxg zzxg) {
        this.zzchv = zzaev;
        this.zzchu = zzxg;
    }

    public final void onStop() {
    }

    public final void zzdg() {
        zzis zzis = this.zzchv.zzcpe.zzclo;
        int i = this.zzchw.orientation;
        long j = this.zzchw.zzccb;
        String str = this.zzchv.zzcpe.zzclr;
        long j2 = this.zzchw.zzcnh;
        zziw zziw = this.zzchv.zzath;
        long j3 = this.zzchw.zzcnf;
        long j4 = this.zzchv.zzcvw;
        long j5 = j2;
        j2 = this.zzchw.zzcnk;
        String str2 = this.zzchw.zzcnl;
        JSONObject jSONObject = this.zzchv.zzcvq;
        boolean z = this.zzchv.zzcwe.zzcny;
        zzaaf zzaaf = this.zzchv.zzcwe.zzcnz;
        zzib zzib = this.zzchv.zzcwc;
        String str3 = str2;
        zzama zzama = null;
        long j6 = j4;
        List list = null;
        int i2 = 0;
        long j7 = j3;
        List list2 = null;
        List list3 = null;
        zziw zziw2 = zziw;
        boolean z2 = false;
        long j8 = j5;
        j5 = j2;
        zztm zztm = null;
        zzuf zzuf = null;
        zzaeu zzaeu = r1;
        String str4 = null;
        zztn zztn = null;
        zztp zztp = null;
        long j9 = j7;
        long j10 = j6;
        long j11 = j5;
        zzaeu zzaeu2 = new zzaeu(zzis, zzama, list, i2, list2, list3, i, j, str, z2, zztm, zzuf, str4, zztn, zztp, j8, zziw2, j9, j10, j11, str3, jSONObject, null, null, null, null, z, zzaaf, null, null, null, zzib, this.zzchv.zzcwe.zzapy, this.zzchv.zzcwd);
        zzagr.zzczc.post(new zzxj(this, zzaeu));
    }
}
