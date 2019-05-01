package com.google.android.gms.internal;

import java.util.HashMap;

public final class zzcz extends zzbq<Integer, Long> {
    public Long zzaid;
    public Long zzaie;

    public zzcz(String str) {
        zzi(str);
    }

    protected final void zzi(String str) {
        HashMap zzj = zzbq.zzj(str);
        if (zzj != null) {
            this.zzaid = (Long) zzj.get(Integer.valueOf(0));
            this.zzaie = (Long) zzj.get(Integer.valueOf(1));
        }
    }

    protected final HashMap<Integer, Long> zzw() {
        HashMap<Integer, Long> hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), this.zzaid);
        hashMap.put(Integer.valueOf(1), this.zzaie);
        return hashMap;
    }
}
