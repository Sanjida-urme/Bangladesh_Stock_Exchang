package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.support.annotation.Nullable;

@zzzb
public final class zzala extends zzakv {
    @Nullable
    public final zzaku zza(Context context, zzali zzali, int i, boolean z, zznd zznd, zzalh zzalh) {
        Object obj;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            if (applicationInfo.targetSdkVersion < 11) {
                obj = null;
                if (obj == null) {
                    return null;
                }
                return new zzakk(context, z, zzali.zzso().zztx(), zzalh, new zzalj(context, zzali.zzsb(), zzali.getRequestId(), zznd, zzali.zzry()));
            }
        }
        obj = 1;
        if (obj == null) {
            return null;
        }
        return new zzakk(context, z, zzali.zzso().zztx(), zzalh, new zzalj(context, zzali.zzsb(), zzali.getRequestId(), zznd, zzali.zzry()));
    }
}
