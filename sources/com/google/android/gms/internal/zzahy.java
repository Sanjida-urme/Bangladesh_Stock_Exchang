package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.zzbs;
import java.util.Map;

@zzzb
public final class zzahy {
    private static zzs zzdaq;
    private static final Object zzdar = new Object();
    @Deprecated
    private static zzaie<Void> zzdas = new zzahz();

    public zzahy(Context context) {
        zzba(context);
    }

    private static zzs zzba(Context context) {
        zzs zzs;
        synchronized (zzdar) {
            if (zzdaq == null) {
                context = context.getApplicationContext();
                zzmq.initialize(context);
                zzdaq = ((Boolean) zzbs.zzep().zzd(zzmq.zzbot)).booleanValue() ? zzahs.zzaz(context) : zzar.zza(context, null);
            }
            zzs = zzdaq;
        }
        return zzs;
    }

    public final zzajp<String> zza(int i, String str, @Nullable Map<String, String> map, @Nullable byte[] bArr) {
        zzajp zzaif = new zzaif();
        zzdaq.zzc(new zzaid(this, i, str, zzaif, new zzaic(this, str, zzaif), bArr, map));
        return zzaif;
    }

    @Deprecated
    public final <T> zzajp<T> zza(String str, zzaie<T> zzaie) {
        zzajp zzajy = new zzajy();
        zzdaq.zzc(new zzaig(str, zzajy));
        return zzajg.zza(zzajg.zza(zzajy, new zzaib(this, zzaie), zzaju.zzdcu), Throwable.class, new zzaia(this, zzaie), zzaju.zzdcu);
    }

    public final zzajp<String> zzb(String str, Map<String, String> map) {
        return zza(0, str, map, null);
    }
}
