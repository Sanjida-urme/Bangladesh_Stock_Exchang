package com.google.android.gms.internal;

import java.util.Map;

public final class zzaig extends zzp<zzn> {
    private final zzajy<zzn> zzdax;
    private final Map<String, String> zzday;

    public zzaig(String str, zzajy<zzn> zzajy) {
        this(str, null, zzajy);
    }

    private zzaig(String str, Map<String, String> map, zzajy<zzn> zzajy) {
        super(0, str, new zzaih(zzajy));
        this.zzday = null;
        this.zzdax = zzajy;
    }

    protected final zzt<zzn> zza(zzn zzn) {
        return zzt.zza(zzn, zzal.zzb(zzn));
    }

    protected final /* synthetic */ void zza(Object obj) {
        this.zzdax.set((zzn) obj);
    }
}
