package com.google.android.gms.internal;

import java.util.HashMap;

public final class zzcy extends zzbq<Integer, Object> {
    public Long zzaia;
    public Boolean zzaib;
    public Boolean zzaic;

    public zzcy(String str) {
        zzi(str);
    }

    protected final void zzi(String str) {
        HashMap zzj = zzbq.zzj(str);
        if (zzj != null) {
            this.zzaia = (Long) zzj.get(Integer.valueOf(0));
            this.zzaib = (Boolean) zzj.get(Integer.valueOf(1));
            this.zzaic = (Boolean) zzj.get(Integer.valueOf(2));
        }
    }

    protected final HashMap<Integer, Object> zzw() {
        HashMap<Integer, Object> hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), this.zzaia);
        hashMap.put(Integer.valueOf(1), this.zzaib);
        hashMap.put(Integer.valueOf(2), this.zzaic);
        return hashMap;
    }
}
