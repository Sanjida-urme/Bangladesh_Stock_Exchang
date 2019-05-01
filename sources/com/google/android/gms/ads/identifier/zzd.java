package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.common.zzo;

final class zzd {
    private SharedPreferences zzamn;

    zzd(Context context) {
        try {
            context = zzo.getRemoteContext(context);
            this.zzamn = context == null ? null : context.getSharedPreferences("google_ads_flags", 0);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while getting SharedPreferences ", th);
            this.zzamn = null;
        }
    }

    final boolean getBoolean(String str, boolean z) {
        try {
            return this.zzamn == null ? false : this.zzamn.getBoolean(str, false);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return false;
        }
    }

    final float getFloat(String str, float f) {
        try {
            return this.zzamn == null ? 0.0f : this.zzamn.getFloat(str, 0.0f);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return 0.0f;
        }
    }

    final String getString(String str, String str2) {
        try {
            return this.zzamn == null ? str2 : this.zzamn.getString(str, str2);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return str2;
        }
    }
}
