package com.google.android.gms.internal;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener;

@zzzb
public final class zzqr extends zzqf {
    private final OnCustomClickListener zzbuu;

    public zzqr(OnCustomClickListener onCustomClickListener) {
        this.zzbuu = onCustomClickListener;
    }

    public final void zzb(zzpu zzpu, String str) {
        this.zzbuu.onCustomClick(zzpx.zza(zzpu), str);
    }
}
