package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.zzbgc;

public final class zzbf {
    private static Object sLock = new Object();
    private static boolean zzckd;
    private static String zzfys;
    private static int zzfyt;

    public static String zzcm(Context context) {
        zzco(context);
        return zzfys;
    }

    public static int zzcn(Context context) {
        zzco(context);
        return zzfyt;
    }

    private static void zzco(Context context) {
        synchronized (sLock) {
            if (zzckd) {
                return;
            }
            zzckd = true;
            try {
                Bundle bundle = zzbgc.zzcy(context).getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle == null) {
                    return;
                } else {
                    zzfys = bundle.getString("com.google.app.id");
                    zzfyt = bundle.getInt("com.google.android.gms.version");
                }
            } catch (Throwable e) {
                Log.wtf("MetadataValueReader", "This should never happen.", e);
            }
        }
    }
}
