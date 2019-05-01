package com.google.android.gms.internal;

import java.util.HashMap;

public final class zzdg extends zzbq<Integer, Long> {
    public Long zzajj;
    public Long zzfx;
    public Long zzfy;

    public zzdg(String str) {
        zzi(str);
    }

    protected final void zzi(String str) {
        HashMap zzj = zzbq.zzj(str);
        if (zzj != null) {
            this.zzajj = (Long) zzj.get(Integer.valueOf(0));
            this.zzfx = (Long) zzj.get(Integer.valueOf(1));
            this.zzfy = (Long) zzj.get(Integer.valueOf(2));
        }
    }

    protected final HashMap<Integer, Long> zzw() {
        HashMap<Integer, Long> hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), this.zzajj);
        hashMap.put(Integer.valueOf(1), this.zzfx);
        hashMap.put(Integer.valueOf(2), this.zzfy);
        return hashMap;
    }
}
