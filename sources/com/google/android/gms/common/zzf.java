package com.google.android.gms.common;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.zzba;
import com.google.android.gms.common.internal.zzbb;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.dynamic.zzn;
import com.google.android.gms.dynamite.DynamiteModule;

final class zzf {
    private static zzba zzfio;
    private static final Object zzfip = new Object();
    private static Context zzfiq;

    static boolean zza(String str, zzg zzg) {
        return zza(str, zzg, false);
    }

    private static boolean zza(String str, zzg zzg, boolean z) {
        if (!zzafo()) {
            return false;
        }
        zzbq.checkNotNull(zzfiq);
        try {
            return zzfio.zza(new zzm(str, zzg, z), zzn.zzy(zzfiq.getPackageManager()));
        } catch (Throwable e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            return false;
        }
    }

    private static boolean zzafo() {
        if (zzfio != null) {
            return true;
        }
        zzbq.checkNotNull(zzfiq);
        synchronized (zzfip) {
            if (zzfio == null) {
                try {
                    zzfio = zzbb.zzam(DynamiteModule.zza(zzfiq, DynamiteModule.zzgup, "com.google.android.gms.googlecertificates").zzgx("com.google.android.gms.common.GoogleCertificatesImpl"));
                } catch (Throwable e) {
                    Log.e("GoogleCertificates", "Failed to load com.google.android.gms.googlecertificates", e);
                    return false;
                }
            }
        }
        return true;
    }

    static boolean zzb(String str, zzg zzg) {
        return zza(str, zzg, true);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized void zzce(android.content.Context r2) {
        /*
        r0 = com.google.android.gms.common.zzf.class;
        monitor-enter(r0);
        r1 = zzfiq;	 Catch:{ all -> 0x001a }
        if (r1 != 0) goto L_0x0011;
    L_0x0007:
        if (r2 == 0) goto L_0x0018;
    L_0x0009:
        r2 = r2.getApplicationContext();	 Catch:{ all -> 0x001a }
        zzfiq = r2;	 Catch:{ all -> 0x001a }
        monitor-exit(r0);
        return;
    L_0x0011:
        r2 = "GoogleCertificates";
        r1 = "GoogleCertificates has been initialized already";
        android.util.Log.w(r2, r1);	 Catch:{ all -> 0x001a }
    L_0x0018:
        monitor-exit(r0);
        return;
    L_0x001a:
        r2 = move-exception;
        monitor-exit(r0);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.zzf.zzce(android.content.Context):void");
    }
}
