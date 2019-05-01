package com.google.android.gms.ads.internal.js;

import android.content.Context;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.zzaiy;
import com.google.android.gms.internal.zzcs;

final class zze implements Runnable {
    private /* synthetic */ Context val$context;
    private /* synthetic */ zzaiy zzbyw;
    private /* synthetic */ zzcs zzbyx;
    private /* synthetic */ zzv zzbyy;
    final /* synthetic */ JSEngineSettableFuture zzbyz;
    private /* synthetic */ String zzbza;

    zze(JavascriptEngineFactory javascriptEngineFactory, Context context, zzaiy zzaiy, zzcs zzcs, zzv zzv, JSEngineSettableFuture jSEngineSettableFuture, String str) {
        this.val$context = context;
        this.zzbyw = zzaiy;
        this.zzbyx = zzcs;
        this.zzbyy = zzv;
        this.zzbyz = jSEngineSettableFuture;
        this.zzbza = str;
    }

    public final void run() {
        try {
            zzc zzg = new zzg(this.val$context, this.zzbyw, this.zzbyx, this.zzbyy);
            this.zzbyz.mEngineReference = zzg;
            zzg.zza(new zzf(this));
            zzg.zzbb(this.zzbza);
        } catch (Throwable e) {
            this.zzbyz.setException(e);
        }
    }
}
