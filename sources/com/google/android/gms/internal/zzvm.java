package com.google.android.gms.internal;

import com.google.ads.AdRequest.ErrorCode;

final class zzvm implements Runnable {
    private /* synthetic */ zzvc zzcei;
    private /* synthetic */ ErrorCode zzcej;

    zzvm(zzvc zzvc, ErrorCode errorCode) {
        this.zzcei = zzvc;
        this.zzcej = errorCode;
    }

    public final void run() {
        try {
            this.zzcei.zzcea.onAdFailedToLoad(zzvo.zza(this.zzcej));
        } catch (Throwable e) {
            zzaiw.zzc("Could not call onAdFailedToLoad.", e);
        }
    }
}
