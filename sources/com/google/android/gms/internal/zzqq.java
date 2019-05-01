package com.google.android.gms.internal;

import com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener;

@zzzb
public final class zzqq extends zzqc {
    private final OnContentAdLoadedListener zzbut;

    public zzqq(OnContentAdLoadedListener onContentAdLoadedListener) {
        this.zzbut = onContentAdLoadedListener;
    }

    public final void zza(zzpq zzpq) {
        this.zzbut.onContentAdLoaded(new zzpt(zzpq));
    }
}
