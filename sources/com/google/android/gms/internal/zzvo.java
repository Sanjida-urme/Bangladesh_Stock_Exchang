package com.google.android.gms.internal;

import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdRequest.Gender;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.zzb;
import java.util.Date;
import java.util.HashSet;

@zzzb
public final class zzvo {
    public static int zza(ErrorCode errorCode) {
        switch (zzvp.zzcel[errorCode.ordinal()]) {
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            default:
                return 0;
        }
    }

    public static MediationAdRequest zza(zzis zzis, boolean z) {
        Gender gender;
        HashSet hashSet = zzis.zzbbx != null ? new HashSet(zzis.zzbbx) : null;
        Date date = new Date(zzis.zzbbv);
        switch (zzis.zzbbw) {
            case 1:
                gender = Gender.MALE;
                break;
            case 2:
                gender = Gender.FEMALE;
                break;
            default:
                gender = Gender.UNKNOWN;
                break;
        }
        return new MediationAdRequest(date, gender, hashSet, z, zzis.zzbcd);
    }

    public static AdSize zzb(zziw zziw) {
        r1 = new AdSize[6];
        int i = 0;
        r1[0] = AdSize.SMART_BANNER;
        r1[1] = AdSize.BANNER;
        r1[2] = AdSize.IAB_MRECT;
        r1[3] = AdSize.IAB_BANNER;
        r1[4] = AdSize.IAB_LEADERBOARD;
        r1[5] = AdSize.IAB_WIDE_SKYSCRAPER;
        while (i < 6) {
            if (r1[i].getWidth() == zziw.width && r1[i].getHeight() == zziw.height) {
                return r1[i];
            }
            i++;
        }
        return new AdSize(zzb.zza(zziw.width, zziw.height, zziw.zzbda));
    }
}
