package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.support.annotation.BinderThread;
import com.google.android.gms.common.ConnectionResult;

abstract class zze extends zzi<Boolean> {
    private int statusCode;
    private Bundle zzfwp;
    private /* synthetic */ zzd zzfwq;

    @BinderThread
    protected zze(zzd zzd, int i, Bundle bundle) {
        this.zzfwq = zzd;
        super(zzd, Boolean.valueOf(true));
        this.statusCode = i;
        this.zzfwp = bundle;
    }

    protected abstract boolean zzakg();

    protected abstract void zzj(ConnectionResult connectionResult);

    protected final /* synthetic */ void zzv(Object obj) {
        PendingIntent pendingIntent = null;
        if (((Boolean) obj) == null) {
            this.zzfwq.zza(1, null);
            return;
        }
        int i = this.statusCode;
        if (i == 0) {
            if (!zzakg()) {
                this.zzfwq.zza(1, null);
                zzj(new ConnectionResult(8, null));
            }
        } else if (i != 10) {
            this.zzfwq.zza(1, null);
            if (this.zzfwp != null) {
                pendingIntent = (PendingIntent) this.zzfwp.getParcelable("pendingIntent");
            }
            zzj(new ConnectionResult(this.statusCode, pendingIntent));
        } else {
            this.zzfwq.zza(1, null);
            throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
        }
    }
}
