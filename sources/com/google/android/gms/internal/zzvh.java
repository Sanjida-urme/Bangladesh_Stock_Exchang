package com.google.android.gms.internal;

import com.google.ads.AdRequest.ErrorCode;

final class zzvh implements Runnable {
    private /* synthetic */ zzvc zzcei;
    private /* synthetic */ ErrorCode zzcej;

    zzvh(zzvc zzvc, ErrorCode errorCode) {
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
