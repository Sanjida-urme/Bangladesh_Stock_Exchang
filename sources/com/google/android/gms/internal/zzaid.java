package com.google.android.gms.internal;

import java.util.Map;

final class zzaid extends zzaq {
    private /* synthetic */ byte[] zzdav;
    private /* synthetic */ Map zzdaw;

    zzaid(zzahy zzahy, int i, String str, zzv zzv, zzu zzu, byte[] bArr, Map map) {
        this.zzdav = bArr;
        this.zzdaw = map;
        super(i, str, zzv, zzu);
    }

    public final Map<String, String> getHeaders() throws zza {
        return this.zzdaw == null ? super.getHeaders() : this.zzdaw;
    }

    public final byte[] zzg() throws zza {
        return this.zzdav == null ? super.zzg() : this.zzdav;
    }
}
