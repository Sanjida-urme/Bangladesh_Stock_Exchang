package com.google.android.gms.internal;

import java.io.IOException;

public final class zzdps extends zzfem<zzdps, zza> implements zzffs {
    private static volatile zzffu<zzdps> zzbas;
    private static final zzdps zzlqr;
    private zzdpw zzlqp;
    private zzdrg zzlqq;

    public static final class zza extends zzfen<zzdps, zza> implements zzffs {
        private zza() {
            super(zzdps.zzlqr);
        }
    }

    static {
        zzfem zzdps = new zzdps();
        zzlqr = zzdps;
        zzdps.zza(zzfeu.zzpct, null, null);
        zzdps.zzpcg.zzbin();
    }

    private zzdps() {
    }

    public static zzdps zzi(zzfdp zzfdp) throws zzffe {
        return (zzdps) zzfem.zza(zzlqr, zzfdp);
    }

    protected final Object zza(int i, Object obj, Object obj2) {
        switch (zzdpt.zzbaq[i - 1]) {
            case 1:
                return new zzdps();
            case 2:
                return zzlqr;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzfev zzfev = (zzfev) obj;
                zzdps zzdps = (zzdps) obj2;
                this.zzlqp = (zzdpw) zzfev.zza(this.zzlqp, zzdps.zzlqp);
                this.zzlqq = (zzdrg) zzfev.zza(this.zzlqq, zzdps.zzlqq);
                return this;
            case 6:
                zzfdy zzfdy = (zzfdy) obj;
                zzfei zzfei = (zzfei) obj2;
                if (zzfei != null) {
                    Object obj3 = null;
                    while (obj3 == null) {
                        try {
                            int zzctt = zzfdy.zzctt();
                            if (zzctt != 0) {
                                zzfem zzfem;
                                zzfen zzfen;
                                zzfen zzfen2;
                                if (zzctt == 10) {
                                    if (this.zzlqp != null) {
                                        zzfem = this.zzlqp;
                                        zzfen = (zzfen) zzfem.zza(zzfeu.zzpcv, null, null);
                                        zzfen.zza(zzfem);
                                        zzfen2 = (com.google.android.gms.internal.zzdpw.zza) zzfen;
                                    } else {
                                        zzfen2 = null;
                                    }
                                    this.zzlqp = (zzdpw) zzfdy.zza(zzdpw.zzbly(), zzfei);
                                    if (zzfen2 != null) {
                                        zzfen2.zza(this.zzlqp);
                                        this.zzlqp = (zzdpw) zzfen2.zzcvk();
                                    }
                                } else if (zzctt == 18) {
                                    if (this.zzlqq != null) {
                                        zzfem = this.zzlqq;
                                        zzfen = (zzfen) zzfem.zza(zzfeu.zzpcv, null, null);
                                        zzfen.zza(zzfem);
                                        zzfen2 = (com.google.android.gms.internal.zzdrg.zza) zzfen;
                                    } else {
                                        zzfen2 = null;
                                    }
                                    this.zzlqq = (zzdrg) zzfdy.zza(zzdrg.zzbnn(), zzfei);
                                    if (zzfen2 != null) {
                                        zzfen2.zza(this.zzlqq);
                                        this.zzlqq = (zzdrg) zzfen2.zzcvk();
                                    }
                                } else if (zza(zzctt, zzfdy)) {
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
                    synchronized (zzdps.class) {
                        if (zzbas == null) {
                            zzbas = new zzfeo(zzlqr);
                        }
                    }
                }
                return zzbas;
            default:
                throw new UnsupportedOperationException();
        }
        return zzlqr;
    }

    public final void zza(zzfed zzfed) throws IOException {
        if (this.zzlqp != null) {
            zzfed.zza(1, this.zzlqp == null ? zzdpw.zzbly() : this.zzlqp);
        }
        if (this.zzlqq != null) {
            zzfed.zza(2, this.zzlqq == null ? zzdrg.zzbnn() : this.zzlqq);
        }
        this.zzpcg.zza(zzfed);
    }

    public final zzdpw zzblq() {
        return this.zzlqp == null ? zzdpw.zzbly() : this.zzlqp;
    }

    public final zzdrg zzblr() {
        return this.zzlqq == null ? zzdrg.zzbnn() : this.zzlqq;
    }

    public final int zzhl() {
        int i = this.zzpch;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.zzlqp != null) {
            i2 = 0 + zzfed.zzb(1, this.zzlqp == null ? zzdpw.zzbly() : this.zzlqp);
        }
        if (this.zzlqq != null) {
            i2 += zzfed.zzb(2, this.zzlqq == null ? zzdrg.zzbnn() : this.zzlqq);
        }
        i2 += this.zzpcg.zzhl();
        this.zzpch = i2;
        return i2;
    }
}
