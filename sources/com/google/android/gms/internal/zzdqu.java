package com.google.android.gms.internal;

import java.io.IOException;

public final class zzdqu extends zzfem<zzdqu, zza> implements zzffs {
    private static volatile zzffu<zzdqu> zzbas;
    private static final zzdqu zzlrw;
    private int zzlql;
    private zzdqs zzlrt;
    private zzfdp zzlru = zzfdp.zzpaz;
    private zzfdp zzlrv = zzfdp.zzpaz;

    public static final class zza extends zzfen<zzdqu, zza> implements zzffs {
        private zza() {
            super(zzdqu.zzlrw);
        }
    }

    static {
        zzfem zzdqu = new zzdqu();
        zzlrw = zzdqu;
        zzdqu.zza(zzfeu.zzpct, null, null);
        zzdqu.zzpcg.zzbin();
    }

    private zzdqu() {
    }

    public static zzdqu zzv(zzfdp zzfdp) throws zzffe {
        return (zzdqu) zzfem.zza(zzlrw, zzfdp);
    }

    public final int getVersion() {
        return this.zzlql;
    }

    protected final Object zza(int i, Object obj, Object obj2) {
        boolean z = true;
        Object obj3 = null;
        switch (zzdqv.zzbaq[i - 1]) {
            case 1:
                return new zzdqu();
            case 2:
                return zzlrw;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzfev zzfev = (zzfev) obj;
                zzdqu zzdqu = (zzdqu) obj2;
                this.zzlql = zzfev.zza(this.zzlql != 0, this.zzlql, zzdqu.zzlql != 0, zzdqu.zzlql);
                this.zzlrt = (zzdqs) zzfev.zza(this.zzlrt, zzdqu.zzlrt);
                this.zzlru = zzfev.zza(this.zzlru != zzfdp.zzpaz, this.zzlru, zzdqu.zzlru != zzfdp.zzpaz, zzdqu.zzlru);
                boolean z2 = this.zzlrv != zzfdp.zzpaz;
                zzfdp zzfdp = this.zzlrv;
                if (zzdqu.zzlrv == zzfdp.zzpaz) {
                    z = false;
                }
                this.zzlrv = zzfev.zza(z2, zzfdp, z, zzdqu.zzlrv);
                return this;
            case 6:
                zzfdy zzfdy = (zzfdy) obj;
                zzfei zzfei = (zzfei) obj2;
                if (zzfei != null) {
                    while (obj3 == null) {
                        try {
                            i = zzfdy.zzctt();
                            if (i != 0) {
                                if (i == 8) {
                                    this.zzlql = zzfdy.zzcuc();
                                } else if (i == 18) {
                                    zzfen zzfen;
                                    if (this.zzlrt != null) {
                                        zzfem zzfem = this.zzlrt;
                                        zzfen zzfen2 = (zzfen) zzfem.zza(zzfeu.zzpcv, null, null);
                                        zzfen2.zza(zzfem);
                                        zzfen = (com.google.android.gms.internal.zzdqs.zza) zzfen2;
                                    } else {
                                        zzfen = null;
                                    }
                                    this.zzlrt = (zzdqs) zzfdy.zza(zzdqs.zzbmx(), zzfei);
                                    if (zzfen != null) {
                                        zzfen.zza(this.zzlrt);
                                        this.zzlrt = (zzdqs) zzfen.zzcvk();
                                    }
                                } else if (i == 26) {
                                    this.zzlru = zzfdy.zzcub();
                                } else if (i == 34) {
                                    this.zzlrv = zzfdy.zzcub();
                                } else if (zza(i, zzfdy)) {
                                }
                            }
                            obj3 = 1;
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
                    synchronized (zzdqu.class) {
                        if (zzbas == null) {
                            zzbas = new zzfeo(zzlrw);
                        }
                    }
                }
                return zzbas;
            default:
                throw new UnsupportedOperationException();
        }
        return zzlrw;
    }

    public final void zza(zzfed zzfed) throws IOException {
        if (this.zzlql != 0) {
            zzfed.zzab(1, this.zzlql);
        }
        if (this.zzlrt != null) {
            zzfed.zza(2, this.zzlrt == null ? zzdqs.zzbmx() : this.zzlrt);
        }
        if (!this.zzlru.isEmpty()) {
            zzfed.zza(3, this.zzlru);
        }
        if (!this.zzlrv.isEmpty()) {
            zzfed.zza(4, this.zzlrv);
        }
        this.zzpcg.zza(zzfed);
    }

    public final zzdqs zzbmz() {
        return this.zzlrt == null ? zzdqs.zzbmx() : this.zzlrt;
    }

    public final zzfdp zzbna() {
        return this.zzlru;
    }

    public final zzfdp zzbnb() {
        return this.zzlrv;
    }

    public final int zzhl() {
        int i = this.zzpch;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.zzlql != 0) {
            i2 = 0 + zzfed.zzae(1, this.zzlql);
        }
        if (this.zzlrt != null) {
            i2 += zzfed.zzb(2, this.zzlrt == null ? zzdqs.zzbmx() : this.zzlrt);
        }
        if (!this.zzlru.isEmpty()) {
            i2 += zzfed.zzb(3, this.zzlru);
        }
        if (!this.zzlrv.isEmpty()) {
            i2 += zzfed.zzb(4, this.zzlrv);
        }
        i2 += this.zzpcg.zzhl();
        this.zzpch = i2;
        return i2;
    }
}
