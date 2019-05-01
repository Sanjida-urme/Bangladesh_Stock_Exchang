package com.google.android.gms.internal;

import java.util.HashMap;

public final class zzbs extends zzbq<Integer, Object> {
    public String zzcq;
    public String zzcs;
    public String zzct;
    public String zzcu;
    public long zzyo;

    public zzbs() {
        this.zzcq = "E";
        this.zzyo = -1;
        this.zzcs = "E";
        this.zzct = "E";
        this.zzcu = "E";
    }

    public zzbs(String str) {
        this();
        zzi(str);
    }

    protected final void zzi(String str) {
        HashMap zzj = zzbq.zzj(str);
        if (zzj != null) {
            this.zzcq = zzj.get(Integer.valueOf(0)) == null ? "E" : (String) zzj.get(Integer.valueOf(0));
            this.zzyo = zzj.get(Integer.valueOf(1)) == null ? -1 : ((Long) zzj.get(Integer.valueOf(1))).longValue();
            this.zzcs = zzj.get(Integer.valueOf(2)) == null ? "E" : (String) zzj.get(Integer.valueOf(2));
            this.zzct = zzj.get(Integer.valueOf(3)) == null ? "E" : (String) zzj.get(Integer.valueOf(3));
            this.zzcu = zzj.get(Integer.valueOf(4)) == null ? "E" : (String) zzj.get(Integer.valueOf(4));
        }
    }

    protected final HashMap<Integer, Object> zzw() {
        HashMap<Integer, Object> hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), this.zzcq);
        hashMap.put(Integer.valueOf(4), this.zzcu);
        hashMap.put(Integer.valueOf(3), this.zzct);
        hashMap.put(Integer.valueOf(2), this.zzcs);
        hashMap.put(Integer.valueOf(1), Long.valueOf(this.zzyo));
        return hashMap;
    }
}
