package com.google.android.gms.internal;

import java.io.IOException;

public final class zzas extends zzfhm<zzas> {
    private String stackTrace;
    public String zzch;
    public Long zzci;
    private String zzcj;
    private String zzck;
    private Long zzcl;
    private Long zzcm;
    private String zzcn;
    private Long zzco;
    private String zzcp;

    public zzas() {
        this.zzch = null;
        this.zzci = null;
        this.stackTrace = null;
        this.zzcj = null;
        this.zzck = null;
        this.zzcl = null;
        this.zzcm = null;
        this.zzcn = null;
        this.zzco = null;
        this.zzcp = null;
        this.zzpaw = -1;
    }

    public final /* synthetic */ zzfhs zza(zzfhj zzfhj) throws IOException {
        while (true) {
            int zzctt = zzfhj.zzctt();
            switch (zzctt) {
                case 0:
                    return this;
                case 10:
                    this.zzch = zzfhj.readString();
                    break;
                case 16:
                    this.zzci = Long.valueOf(zzfhj.zzcun());
                    break;
                case 26:
                    this.stackTrace = zzfhj.readString();
                    break;
                case 34:
                    this.zzcj = zzfhj.readString();
                    break;
                case 42:
                    this.zzck = zzfhj.readString();
                    break;
                case 48:
                    this.zzcl = Long.valueOf(zzfhj.zzcun());
                    break;
                case 56:
                    this.zzcm = Long.valueOf(zzfhj.zzcun());
                    break;
                case 66:
                    this.zzcn = zzfhj.readString();
                    break;
                case 72:
                    this.zzco = Long.valueOf(zzfhj.zzcun());
                    break;
                case 82:
                    this.zzcp = zzfhj.readString();
                    break;
                default:
                    if (super.zza(zzfhj, zzctt)) {
                        break;
                    }
                    return this;
            }
        }
    }

    public final void zza(zzfhk zzfhk) throws IOException {
        if (this.zzch != null) {
            zzfhk.zzn(1, this.zzch);
        }
        if (this.zzci != null) {
            zzfhk.zzf(2, this.zzci.longValue());
        }
        if (this.stackTrace != null) {
            zzfhk.zzn(3, this.stackTrace);
        }
        if (this.zzcj != null) {
            zzfhk.zzn(4, this.zzcj);
        }
        if (this.zzck != null) {
            zzfhk.zzn(5, this.zzck);
        }
        if (this.zzcl != null) {
            zzfhk.zzf(6, this.zzcl.longValue());
        }
        if (this.zzcm != null) {
            zzfhk.zzf(7, this.zzcm.longValue());
        }
        if (this.zzcn != null) {
            zzfhk.zzn(8, this.zzcn);
        }
        if (this.zzco != null) {
            zzfhk.zzf(9, this.zzco.longValue());
        }
        if (this.zzcp != null) {
            zzfhk.zzn(10, this.zzcp);
        }
        super.zza(zzfhk);
    }

    protected final int zzo() {
        int zzo = super.zzo();
        if (this.zzch != null) {
            zzo += zzfhk.zzo(1, this.zzch);
        }
        if (this.zzci != null) {
            zzo += zzfhk.zzc(2, this.zzci.longValue());
        }
        if (this.stackTrace != null) {
            zzo += zzfhk.zzo(3, this.stackTrace);
        }
        if (this.zzcj != null) {
            zzo += zzfhk.zzo(4, this.zzcj);
        }
        if (this.zzck != null) {
            zzo += zzfhk.zzo(5, this.zzck);
        }
        if (this.zzcl != null) {
            zzo += zzfhk.zzc(6, this.zzcl.longValue());
        }
        if (this.zzcm != null) {
            zzo += zzfhk.zzc(7, this.zzcm.longValue());
        }
        if (this.zzcn != null) {
            zzo += zzfhk.zzo(8, this.zzcn);
        }
        if (this.zzco != null) {
            zzo += zzfhk.zzc(9, this.zzco.longValue());
        }
        return this.zzcp != null ? zzo + zzfhk.zzo(10, this.zzcp) : zzo;
    }
}
