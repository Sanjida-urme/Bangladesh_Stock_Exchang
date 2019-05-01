package com.google.android.gms.internal;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Future;

@zzzb
public final class zzabw {
    private WeakHashMap<Context, zzaby> zzcss = new WeakHashMap();

    public final Future<zzabu> zzp(Context context) {
        return zzagl.zza(zzagl.zzcyx, new zzabx(this, context));
    }
}
