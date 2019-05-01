package com.google.android.gms.internal;

import java.io.IOException;

public final class zzfib extends zzfhm<zzfib> {
    private byte[] body;
    private zzfhy[] zzpiy;
    private byte[] zzpiz;
    private Integer zzpja;
    private zzfic zzpje;
    private byte[] zzpjf;

    public zzfib() {
        this.zzpje = null;
        this.zzpiy = zzfhy.zzcxn();
        this.body = null;
        this.zzpiz = null;
        this.zzpja = null;
        this.zzpjf = null;
        this.zzphm = null;
        this.zzpaw = -1;
    }

    public final /* synthetic */ zzfhs zza(zzfhj zzfhj) throws IOException {
        while (true) {
            int zzctt = zzfhj.zzctt();
            if (zzctt == 0) {
                return this;
            }
            if (zzctt == 10) {
                if (this.zzpje == null) {
                    this.zzpje = new zzfic();
                }
                zzfhj.zza(this.zzpje);
            } else if (zzctt == 18) {
                zzctt = zzfhv.zzb(zzfhj, 18);
                int length = this.zzpiy == null ? 0 : this.zzpiy.length;
                Object obj = new zzfhy[(zzctt + length)];
                if (length != 0) {
                    System.arraycopy(this.zzpiy, 0, obj, 0, length);
                }
                while (length < obj.length - 1) {
                    obj[length] = new zzfhy();
                    zzfhj.zza(obj[length]);
                    zzfhj.zzctt();
                    length++;
                }
                obj[length] = new zzfhy();
                zzfhj.zza(obj[length]);
                this.zzpiy = obj;
            } else if (zzctt == 26) {
                this.body = zzfhj.readBytes();
            } else if (zzctt == 34) {
                this.zzpiz = zzfhj.readBytes();
            } else if (zzctt == 40) {
                this.zzpja = Integer.valueOf(zzfhj.zzctw());
            } else if (zzctt == 50) {
                this.zzpjf = zzfhj.readBytes();
            } else if (!super.zza(zzfhj, zzctt)) {
                return this;
            }
        }
    }

    public final void zza(zzfhk zzfhk) throws IOException {
        if (this.zzpje != null) {
            zzfhk.zza(1, this.zzpje);
        }
        if (this.zzpiy != null && this.zzpiy.length > 0) {
            for (zzfhs zzfhs : this.zzpiy) {
                if (zzfhs != null) {
                    zzfhk.zza(2, zzfhs);
                }
            }
        }
        if (this.body != null) {
            zzfhk.zzc(3, this.body);
        }
        if (this.zzpiz != null) {
            zzfhk.zzc(4, this.zzpiz);
        }
        if (this.zzpja != null) {
            zzfhk.zzaa(5, this.zzpja.intValue());
        }
        if (this.zzpjf != null) {
            zzfhk.zzc(6, this.zzpjf);
        }
        super.zza(zzfhk);
    }

    protected final int zzo() {
        int zzo = super.zzo();
        if (this.zzpje != null) {
            zzo += zzfhk.zzb(1, this.zzpje);
        }
        if (this.zzpiy != null && this.zzpiy.length > 0) {
            for (zzfhs zzfhs : this.zzpiy) {
                if (zzfhs != null) {
                    zzo += zzfhk.zzb(2, zzfhs);
                }
            }
        }
        if (this.body != null) {
            zzo += zzfhk.zzd(3, this.body);
        }
        if (this.zzpiz != null) {
            zzo += zzfhk.zzd(4, this.zzpiz);
        }
        if (this.zzpja != null) {
            zzo += zzfhk.zzad(5, this.zzpja.intValue());
        }
        return this.zzpjf != null ? zzo + zzfhk.zzd(6, this.zzpjf) : zzo;
    }
}
