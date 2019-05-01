package com.google.android.gms.internal;

import android.util.Log;
import com.google.ads.AdRequest;

@zzzb
public class zzaiw {
    /* renamed from: e */
    public static void m3e(String str) {
        if (zzae(6)) {
            Log.e(AdRequest.LOGTAG, str);
        }
    }

    public static void zza(String str, Throwable th) {
        if (zzae(3)) {
            Log.d(AdRequest.LOGTAG, str, th);
        }
    }

    public static boolean zzae(int i) {
        if (i < 5) {
            if (!Log.isLoggable(AdRequest.LOGTAG, i)) {
                return false;
            }
        }
        return true;
    }

    public static void zzb(String str, Throwable th) {
        if (zzae(6)) {
            Log.e(AdRequest.LOGTAG, str, th);
        }
    }

    public static void zzbw(String str) {
        if (zzae(3)) {
            Log.d(AdRequest.LOGTAG, str);
        }
    }

    public static void zzc(String str, Throwable th) {
        if (zzae(5)) {
            Log.w(AdRequest.LOGTAG, str, th);
        }
    }

    public static void zzcn(String str) {
        if (zzae(4)) {
            Log.i(AdRequest.LOGTAG, str);
        }
    }

    public static void zzco(String str) {
        if (zzae(5)) {
            Log.w(AdRequest.LOGTAG, str);
        }
    }
}
