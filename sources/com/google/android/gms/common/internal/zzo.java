package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.support.annotation.BinderThread;
import android.support.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

public final class zzo extends zze {
    private /* synthetic */ zzd zzfwq;

    @BinderThread
    public zzo(zzd zzd, @Nullable int i, Bundle bundle) {
        this.zzfwq = zzd;
        super(zzd, i, null);
    }

    protected final boolean zzakg() {
        this.zzfwq.zzfwc.zzf(ConnectionResult.zzfii);
        return true;
    }

    protected final void zzj(ConnectionResult connectionResult) {
        this.zzfwq.zzfwc.zzf(connectionResult);
        this.zzfwq.onConnectionFailed(connectionResult);
    }
}
