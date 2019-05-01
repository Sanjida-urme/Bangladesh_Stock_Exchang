package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.common.util.zzi;

final class zzzq implements zzzs {
    private /* synthetic */ Context val$context;

    zzzq(Context context) {
        this.val$context = context;
    }

    public final boolean zza(zzaiy zzaiy) {
        zzjk.zzhx();
        boolean zzbd = zzais.zzbd(this.val$context);
        Object obj = (((Boolean) zzbs.zzep().zzd(zzmq.zzbpl)).booleanValue() && zzaiy.zzdcb) ? 1 : null;
        if (!zzzp.zzd(this.val$context, zzaiy.zzdcb) || !zzbd || obj != null) {
            return true;
        }
        if (zzi.zzcr(this.val$context)) {
            if (!((Boolean) zzbs.zzep().zzd(zzmq.zzbhs)).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
