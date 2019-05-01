package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbs;

@zzzb
final class zzss {
    private static final zzsp zzbyr = zzsp.zzkw();
    private static final float zzbys = ((Float) zzbs.zzep().zzd(zzmq.zzbks)).floatValue();
    private static final long zzbyt = ((Long) zzbs.zzep().zzd(zzmq.zzbkq)).longValue();
    private static final float zzbyu = ((Float) zzbs.zzep().zzd(zzmq.zzbkt)).floatValue();
    private static final long zzbyv = ((Long) zzbs.zzep().zzd(zzmq.zzbkr)).longValue();

    private static int zzb(long j, int i) {
        return (int) ((j >>> ((i % 16) * 4)) & 15);
    }

    static boolean zzlg() {
        int zzld = zzbyr.zzld();
        int zzle = zzbyr.zzle();
        int zzlc = zzbyr.zzlc() + zzbyr.zzlb();
        int i = Integer.MAX_VALUE;
        int zzb = (zzld >= 16 || zzbyv == 0) ? zzbyu != 0.0f ? ((int) (zzbyu * ((float) zzld))) + 1 : Integer.MAX_VALUE : zzb(zzbyv, zzld);
        if (zzle <= zzb) {
            if (zzld < 16 && zzbyt != 0) {
                i = zzb(zzbyt, zzld);
            } else if (zzbys != 0.0f) {
                i = (int) (zzbys * ((float) zzld));
            }
            if (zzlc <= i) {
                return true;
            }
        }
        return false;
    }
}
