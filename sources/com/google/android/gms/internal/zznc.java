package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

@zzzb
public final class zznc {
    @Nullable
    private final zznd zzamo;
    private final Map<String, zznb> zzbqu = new HashMap();

    public zznc(@Nullable zznd zznd) {
        this.zzamo = zznd;
    }

    public final void zza(String str, zznb zznb) {
        this.zzbqu.put(str, zznb);
    }

    public final void zza(String str, String str2, long j) {
        zznd zznd = this.zzamo;
        zznb zznb = (zznb) this.zzbqu.get(str2);
        String[] strArr = new String[]{str};
        if (zznd != null) {
            if (zznb != null) {
                zznd.zza(zznb, j, strArr);
            }
        }
        Map map = this.zzbqu;
        zznd = this.zzamo;
        map.put(str, zznd == null ? null : zznd.zzc(j));
    }

    @Nullable
    public final zznd zziy() {
        return this.zzamo;
    }
}
