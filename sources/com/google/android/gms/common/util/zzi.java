package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;

public final class zzi {
    private static Boolean zzgbw;
    private static Boolean zzgbx;
    private static Boolean zzgby;
    private static Boolean zzgbz;
    private static Boolean zzgca;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean zza(android.content.res.Resources r4) {
        /*
        r0 = 0;
        if (r4 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = zzgbw;
        if (r1 != 0) goto L_0x0045;
    L_0x0008:
        r1 = r4.getConfiguration();
        r1 = r1.screenLayout;
        r1 = r1 & 15;
        r2 = 3;
        r3 = 1;
        if (r1 <= r2) goto L_0x0016;
    L_0x0014:
        r1 = 1;
        goto L_0x0017;
    L_0x0016:
        r1 = 0;
    L_0x0017:
        if (r1 != 0) goto L_0x003e;
    L_0x0019:
        r1 = zzgbx;
        if (r1 != 0) goto L_0x0036;
    L_0x001d:
        r4 = r4.getConfiguration();
        r1 = r4.screenLayout;
        r1 = r1 & 15;
        if (r1 > r2) goto L_0x002f;
    L_0x0027:
        r4 = r4.smallestScreenWidthDp;
        r1 = 600; // 0x258 float:8.41E-43 double:2.964E-321;
        if (r4 < r1) goto L_0x002f;
    L_0x002d:
        r4 = 1;
        goto L_0x0030;
    L_0x002f:
        r4 = 0;
    L_0x0030:
        r4 = java.lang.Boolean.valueOf(r4);
        zzgbx = r4;
    L_0x0036:
        r4 = zzgbx;
        r4 = r4.booleanValue();
        if (r4 == 0) goto L_0x003f;
    L_0x003e:
        r0 = 1;
    L_0x003f:
        r4 = java.lang.Boolean.valueOf(r0);
        zzgbw = r4;
    L_0x0045:
        r4 = zzgbw;
        r4 = r4.booleanValue();
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.zzi.zza(android.content.res.Resources):boolean");
    }

    @TargetApi(20)
    public static boolean zzcp(Context context) {
        if (zzgby == null) {
            boolean z = zzq.zzamb() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
            zzgby = Boolean.valueOf(z);
        }
        return zzgby.booleanValue();
    }

    @TargetApi(24)
    public static boolean zzcq(Context context) {
        return (!zzq.isAtLeastN() || zzcr(context)) && zzcp(context);
    }

    @TargetApi(21)
    public static boolean zzcr(Context context) {
        if (zzgbz == null) {
            boolean z = zzq.zzamc() && context.getPackageManager().hasSystemFeature("cn.google");
            zzgbz = Boolean.valueOf(z);
        }
        return zzgbz.booleanValue();
    }

    public static boolean zzcs(Context context) {
        if (zzgca == null) {
            boolean z;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot")) {
                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                    z = false;
                    zzgca = Boolean.valueOf(z);
                }
            }
            z = true;
            zzgca = Boolean.valueOf(z);
        }
        return zzgca.booleanValue();
    }
}
