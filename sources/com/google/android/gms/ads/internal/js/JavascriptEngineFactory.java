package com.google.android.gms.ads.internal.js;

import android.content.Context;
import android.support.annotation.Keep;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.zzagr;
import com.google.android.gms.internal.zzaiy;
import com.google.android.gms.internal.zzajp;
import com.google.android.gms.internal.zzajy;
import com.google.android.gms.internal.zzcs;
import com.google.android.gms.internal.zzzb;

@zzzb
public final class JavascriptEngineFactory {

    static class JSEngineSettableFuture extends zzajy<zzc> {
        @Keep
        zzc mEngineReference;

        private JSEngineSettableFuture() {
        }
    }

    public final zzajp<zzc> zza(Context context, zzaiy zzaiy, String str, zzcs zzcs, zzv zzv) {
        zzajp jSEngineSettableFuture = new JSEngineSettableFuture();
        zzagr.zzczc.post(new zze(this, context, zzaiy, zzcs, zzv, jSEngineSettableFuture, str));
        return jSEngineSettableFuture;
    }
}
