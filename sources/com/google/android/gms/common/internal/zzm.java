package com.google.android.gms.common.internal;

import android.support.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;

public final class zzm implements zzj {
    private /* synthetic */ zzd zzfwq;

    public zzm(zzd zzd) {
        this.zzfwq = zzd;
    }

    public final void zzf(@NonNull ConnectionResult connectionResult) {
        if (connectionResult.isSuccess()) {
            this.zzfwq.zza(null, this.zzfwq.zzake());
            return;
        }
        if (this.zzfwq.zzfwi != null) {
            this.zzfwq.zzfwi.onConnectionFailed(connectionResult);
        }
    }
}
