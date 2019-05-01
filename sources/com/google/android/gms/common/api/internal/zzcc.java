package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.C0231R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzbf;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.common.internal.zzca;

@Deprecated
public final class zzcc {
    private static final Object sLock = new Object();
    private static zzcc zzfro;
    private final String mAppId;
    private final Status zzfrp;
    private final boolean zzfrq;
    private final boolean zzfrr;

    private zzcc(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(C0231R.string.common_google_play_services_unknown_issue));
        boolean z = true;
        if (identifier != 0) {
            if (resources.getInteger(identifier) == 0) {
                z = false;
            }
            this.zzfrr = z ^ 1;
        } else {
            this.zzfrr = false;
        }
        this.zzfrq = z;
        Object zzcm = zzbf.zzcm(context);
        if (zzcm == null) {
            zzcm = new zzca(context).getString("google_app_id");
        }
        if (TextUtils.isEmpty(zzcm)) {
            this.zzfrp = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.mAppId = null;
            return;
        }
        this.mAppId = zzcm;
        this.zzfrp = Status.zzfky;
    }

    public static String zzaiw() {
        return zzfv("getGoogleAppId").mAppId;
    }

    public static boolean zzaix() {
        return zzfv("isMeasurementExplicitlyDisabled").zzfrr;
    }

    public static Status zzci(Context context) {
        Status status;
        zzbq.checkNotNull(context, "Context must not be null.");
        synchronized (sLock) {
            if (zzfro == null) {
                zzfro = new zzcc(context);
            }
            status = zzfro.zzfrp;
        }
        return status;
    }

    private static zzcc zzfv(String str) {
        zzcc zzcc;
        synchronized (sLock) {
            if (zzfro == null) {
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 34);
                stringBuilder.append("Initialize must be called before ");
                stringBuilder.append(str);
                stringBuilder.append(".");
                throw new IllegalStateException(stringBuilder.toString());
            }
            zzcc = zzfro;
        }
        return zzcc;
    }
}
