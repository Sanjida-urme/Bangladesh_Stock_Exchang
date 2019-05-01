package com.google.android.gms.internal;

import java.io.IOException;

public final class zzdqs extends zzfem<zzdqs, zza> implements zzffs {
    private static volatile zzffu<zzdqs> zzbas;
    private static final zzdqs zzlrs;
    private zzdqw zzlrp;
    private zzdqq zzlrq;
    private int zzlrr;

    public static final class zza extends zzfen<zzdqs, zza> implements zzffs {
        private zza() {
            super(zzdqs.zzlrs);
        }
    }

    static {
        zzfem zzdqs = new zzdqs();
        zzlrs = zzdqs;
        zzdqs.zza(zzfeu.zzpct, null, null);
        zzdqs.zzpcg.zzbin();
    }

    private zzdqs() {
    }

    public static zzdqs zzbmx() {
        return zzlrs;
    }

    protected final Object zza(int i, Object obj, Object obj2) {
        boolean z = false;
        switch (zzdqt.zzbaq[i - 1]) {
            case 1:
                return new zzdqs();
            case 2:
                return zzlrs;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzfev zzfev = (zzfev) obj;
                zzdqs zzdqs = (zzdqs) obj2;
                this.zzlrp = (zzdqw) zzfev.zza(this.zzlrp, zzdqs.zzlrp);
                this.zzlrq = (zzdqq) zzfev.zza(this.zzlrq, zzdqs.zzlrq);
                boolean z2 = this.zzlrr != 0;
                int i2 = this.zzlrr;
                if (zzdqs.zzlrr != 0) {
                    z = true;
                }
                this.zzlrr = zzfev.zza(z2, i2, z, zzdqs.zzlrr);
                return this;
            case 6:
                zzfdy zzfdy = (zzfdy) obj;
                zzfei zzfei = (zzfei) obj2;
                if (zzfei != null) {
                    while (!z) {
                        try {
                            i = zzfdy.zzctt();
                            if (i != 0) {
                                zzfem zzfem;
                                zzfen zzfen;
                                zzfen zzfen2;
                                if (i == 10) {
                                    if (this.zzlrp != null) {
                                        zzfem = this.zzlrp;
                                        zzfen = (zzfen) zzfem.zza(zzfeu.zzpcv, null, null);
                                        zzfen.zza(zzfem);
                                        zzfen2 = (com.google.android.gms.internal.zzdqw.zza) zzfen;
                                    } else {
                                        zzfen2 = null;
                                    }
                                    this.zzlrp = (zzdqw) zzfdy.zza(zzdqw.zzbng(), zzfei);
                                    if (zzfen2 != null) {
                                        zzfen2.zza(this.zzlrp);
                                        this.zzlrp = (zzdqw) zzfen2.zzcvk();
                                    }
                                } else if (i == 18) {
                                    if (this.zzlrq != null) {
                                        zzfem = this.zzlrq;
                                        zzfen = (zzfen) zzfem.zza(zzfeu.zzpcv, null, null);
                                        zzfen.zza(zzfem);
                                        zzfen2 = (com.google.android.gms.internal.zzdqq.zza) zzfen;
                                    } else {
                                        zzfen2 = null;
                                    }
                                    this.zzlrq = (zzdqq) zzfdy.zza(zzdqq.zzbms(), zzfei);
                                    if (zzfen2 != null) {
                                        zzfen2.zza(this.zzlrq);
                                        this.zzlrq = (zzdqq) zzfen2.zzcvk();
                                    }
                                } else if (i == 24) {
                                    this.zzlrr = zzfdy.zzcud();
                                } else if (zza(i, zzfdy)) {
                                }
                            }
                            z = true;
                        } catch (zzffe e) {
                            throw new RuntimeException(e.zzh(this));
                        } catch (IOException e2) {
                            throw new RuntimeException(new zzffe(e2.getMessage()).zzh(this));
                        }
                    }
                    break;
                }
                throw new NullPointerException();
            case 7:
                break;
            case 8:
                if (zzbas == null) {
                    synchronized (zzdqs.class) {
                        if (zzbas == null) {
                            zzbas = new zzfeo(zzlrs);
                        }
                    }
                }
                return zzbas;
            default:
                throw new UnsupportedOperationException();
        }
        return zzlrs;
    }

    public final void zza(zzfed zzfed) throws IOException {
        if (this.zzlrp != null) {
            zzfed.zza(1, this.zzlrp == null ? zzdqw.zzbng() : this.zzlrp);
        }
        if (this.zzlrq != null) {
            zzfed.zza(2, this.zzlrq == null ? zzdqq.zzbms() : this.zzlrq);
        }
        if (this.zzlrr != zzdqo.UNKNOWN_FORMAT.zzhn()) {
            zzfed.zzaa(3, this.zzlrr);
        }
        this.zzpcg.zza(zzfed);
    }

    public final zzdqw zzbmu() {
        return this.zzlrp == null ? zzdqw.zzbng() : this.zzlrp;
    }

    public final zzdqq zzbmv() {
        return this.zzlrq == null ? zzdqq.zzbms() : this.zzlrq;
    }

    public final zzdqo zzbmw() {
        zzdqo zzfo = zzdqo.zzfo(this.zzlrr);
        return zzfo == null ? zzdqo.UNRECOGNIZED : zzfo;
    }

    public final int zzhl() {
        int i = this.zzpch;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.zzlrp != null) {
            i2 = 0 + zzfed.zzb(1, this.zzlrp == null ? zzdqw.zzbng() : this.zzlrp);
        }
        if (this.zzlrq != null) {
            i2 += zzfed.zzb(2, this.zzlrq == null ? zzdqq.zzbms() : this.zzlrq);
        }
        if (this.zzlrr != zzdqo.UNKNOWN_FORMAT.zzhn()) {
            i2 += zzfed.zzag(3, this.zzlrr);
        }
        i2 += this.zzpcg.zzhl();
        this.zzpch = i2;
        return i2;
    }
}
