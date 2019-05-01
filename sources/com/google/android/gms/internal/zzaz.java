package com.google.android.gms.internal;

import java.io.IOException;

public final class zzaz extends zzfhm<zzaz> {
    private Long zzfz;
    private Integer zzga;
    private Boolean zzgb;
    private int[] zzgc;
    private Long zzgd;

    public zzaz() {
        this.zzfz = null;
        this.zzga = null;
        this.zzgb = null;
        this.zzgc = zzfhv.zzphz;
        this.zzgd = null;
        this.zzpaw = -1;
    }

    public final /* synthetic */ zzfhs zza(zzfhj zzfhj) throws IOException {
        while (true) {
            int zzctt = zzfhj.zzctt();
            if (zzctt == 0) {
                return this;
            }
            if (zzctt == 8) {
                this.zzfz = Long.valueOf(zzfhj.zzcun());
            } else if (zzctt == 16) {
                this.zzga = Integer.valueOf(zzfhj.zzcui());
            } else if (zzctt == 24) {
                this.zzgb = Boolean.valueOf(zzfhj.zzctz());
            } else if (zzctt == 32) {
                zzctt = zzfhv.zzb(zzfhj, 32);
                r1 = this.zzgc == null ? 0 : this.zzgc.length;
                Object obj = new int[(zzctt + r1)];
                if (r1 != 0) {
                    System.arraycopy(this.zzgc, 0, obj, 0, r1);
                }
                while (r1 < obj.length - 1) {
                    obj[r1] = zzfhj.zzcui();
                    zzfhj.zzctt();
                    r1++;
                }
                obj[r1] = zzfhj.zzcui();
                this.zzgc = obj;
            } else if (zzctt == 34) {
                zzctt = zzfhj.zzkj(zzfhj.zzcui());
                r1 = zzfhj.getPosition();
                int i = 0;
                while (zzfhj.zzcuk() > 0) {
                    zzfhj.zzcui();
                    i++;
                }
                zzfhj.zzlw(r1);
                r1 = this.zzgc == null ? 0 : this.zzgc.length;
                Object obj2 = new int[(i + r1)];
                if (r1 != 0) {
                    System.arraycopy(this.zzgc, 0, obj2, 0, r1);
                }
                while (r1 < obj2.length) {
                    obj2[r1] = zzfhj.zzcui();
                    r1++;
                }
                this.zzgc = obj2;
                zzfhj.zzkk(zzctt);
            } else if (zzctt == 40) {
                this.zzgd = Long.valueOf(zzfhj.zzcun());
            } else if (!super.zza(zzfhj, zzctt)) {
                return this;
            }
        }
    }

    public final void zza(zzfhk zzfhk) throws IOException {
        if (this.zzfz != null) {
            zzfhk.zzf(1, this.zzfz.longValue());
        }
        if (this.zzga != null) {
            zzfhk.zzaa(2, this.zzga.intValue());
        }
        if (this.zzgb != null) {
            zzfhk.zzl(3, this.zzgb.booleanValue());
        }
        if (this.zzgc != null && this.zzgc.length > 0) {
            for (int zzaa : this.zzgc) {
                zzfhk.zzaa(4, zzaa);
            }
        }
        if (this.zzgd != null) {
            zzfhk.zza(5, this.zzgd.longValue());
        }
        super.zza(zzfhk);
    }

    protected final int zzo() {
        int zzo = super.zzo();
        if (this.zzfz != null) {
            zzo += zzfhk.zzc(1, this.zzfz.longValue());
        }
        if (this.zzga != null) {
            zzo += zzfhk.zzad(2, this.zzga.intValue());
        }
        if (this.zzgb != null) {
            this.zzgb.booleanValue();
            zzo += zzfhk.zzkx(3) + 1;
        }
        if (this.zzgc != null && this.zzgc.length > 0) {
            int i = 0;
            for (int zzky : this.zzgc) {
                i += zzfhk.zzky(zzky);
            }
            zzo = (zzo + i) + (this.zzgc.length * 1);
        }
        if (this.zzgd == null) {
            return zzo;
        }
        return zzo + (zzfhk.zzkx(5) + zzfhk.zzdh(this.zzgd.longValue()));
    }
}
