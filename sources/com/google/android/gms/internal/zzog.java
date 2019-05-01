package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

final class zzog {
    private final WeakReference<zzama> zzbtd;
    private String zzbte;

    public zzog(zzama zzama) {
        this.zzbtd = new WeakReference(zzama);
    }

    public final void zza(zzyg zzyg) {
        zzyg.zza("/loadHtml", new zzoh(this, zzyg));
        zzyg.zza("/showOverlay", new zzoj(this, zzyg));
        zzyg.zza("/hideOverlay", new zzok(this, zzyg));
        zzama zzama = (zzama) this.zzbtd.get();
        if (zzama != null) {
            zzama.zzsq().zza("/sendMessageToSdk", new zzol(this, zzyg));
        }
    }
}
