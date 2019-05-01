package com.google.android.gms.internal;

import java.util.HashMap;

public final class zzde extends zzbq<Integer, Long> {
    public Long zzaiz;
    public Long zzaja;
    public Long zzajb;
    public Long zzajc;
    public Long zzajd;
    public Long zzaje;
    public Long zzajf;
    public Long zzajg;
    public Long zzajh;
    public Long zzfd;
    public Long zzff;
    public Long zzfj;
    public Long zzfk;

    public zzde(String str) {
        zzi(str);
    }

    protected final void zzi(String str) {
        HashMap zzj = zzbq.zzj(str);
        if (zzj != null) {
            this.zzaiz = (Long) zzj.get(Integer.valueOf(0));
            this.zzaja = (Long) zzj.get(Integer.valueOf(1));
            this.zzajb = (Long) zzj.get(Integer.valueOf(2));
            this.zzff = (Long) zzj.get(Integer.valueOf(3));
            this.zzfd = (Long) zzj.get(Integer.valueOf(4));
            this.zzajc = (Long) zzj.get(Integer.valueOf(5));
            this.zzajd = (Long) zzj.get(Integer.valueOf(6));
            this.zzaje = (Long) zzj.get(Integer.valueOf(7));
            this.zzfk = (Long) zzj.get(Integer.valueOf(8));
            this.zzfj = (Long) zzj.get(Integer.valueOf(9));
            this.zzajf = (Long) zzj.get(Integer.valueOf(10));
            this.zzajg = (Long) zzj.get(Integer.valueOf(11));
            this.zzajh = (Long) zzj.get(Integer.valueOf(12));
        }
    }

    protected final HashMap<Integer, Long> zzw() {
        HashMap<Integer, Long> hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), this.zzaiz);
        hashMap.put(Integer.valueOf(1), this.zzaja);
        hashMap.put(Integer.valueOf(2), this.zzajb);
        hashMap.put(Integer.valueOf(3), this.zzff);
        hashMap.put(Integer.valueOf(4), this.zzfd);
        hashMap.put(Integer.valueOf(5), this.zzajc);
        hashMap.put(Integer.valueOf(6), this.zzajd);
        hashMap.put(Integer.valueOf(7), this.zzaje);
        hashMap.put(Integer.valueOf(8), this.zzfk);
        hashMap.put(Integer.valueOf(9), this.zzfj);
        hashMap.put(Integer.valueOf(10), this.zzajf);
        hashMap.put(Integer.valueOf(11), this.zzajg);
        hashMap.put(Integer.valueOf(12), this.zzajh);
        return hashMap;
    }
}
