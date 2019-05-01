package com.google.android.gms.internal;

import java.util.concurrent.Executor;

@zzzb
public final class zzaju {
    public static final Executor zzdct = new zzajv();
    public static final Executor zzdcu = new zzajw();
    private static zzajt zzdcv = zza(zzdct);
    private static zzajt zzdcw = zza(zzdcu);

    private static zzajt zza(Executor executor) {
        return new zzajx(executor, null);
    }
}
