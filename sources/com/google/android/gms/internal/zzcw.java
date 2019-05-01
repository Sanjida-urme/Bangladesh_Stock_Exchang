package com.google.android.gms.internal;

import java.util.HashMap;

public final class zzcw extends zzbq<Integer, Long> {
    public long zzahy;
    public long zzahz;

    public zzcw() {
        this.zzahy = -1;
        this.zzahz = -1;
    }

    public zzcw(String str) {
        this();
        zzi(str);
    }

    protected final void zzi(String str) {
        HashMap zzj = zzbq.zzj(str);
        if (zzj != null) {
            this.zzahy = ((Long) zzj.get(Integer.valueOf(0))).longValue();
            this.zzahz = ((Long) zzj.get(Integer.valueOf(1))).longValue();
        }
    }

    protected final HashMap<Integer, Long> zzw() {
        HashMap<Integer, Long> hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), Long.valueOf(this.zzahy));
        hashMap.put(Integer.valueOf(1), Long.valueOf(this.zzahz));
        return hashMap;
    }
}
