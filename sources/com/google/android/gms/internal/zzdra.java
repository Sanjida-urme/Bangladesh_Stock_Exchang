package com.google.android.gms.internal;

import java.io.IOException;

public final class zzdra extends zzfem<zzdra, zza> implements zzffs {
    private static volatile zzffu<zzdra> zzbas;
    private static final zzdra zzlsk;
    private zzfdp zzlsi = zzfdp.zzpaz;
    private zzdrt zzlsj;

    public static final class zza extends zzfen<zzdra, zza> implements zzffs {
        private zza() {
            super(zzdra.zzlsk);
        }
    }

    static {
        zzfem zzdra = new zzdra();
        zzlsk = zzdra;
        zzdra.zza(zzfeu.zzpct, null, null);
        zzdra.zzpcg.zzbin();
    }

    private zzdra() {
    }

    protected final Object zza(int i, Object obj, Object obj2) {
        boolean z = false;
        switch (zzdrb.zzbaq[i - 1]) {
            case 1:
                return new zzdra();
            case 2:
                return zzlsk;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzfev zzfev = (zzfev) obj;
                zzdra zzdra = (zzdra) obj2;
                boolean z2 = this.zzlsi != zzfdp.zzpaz;
                zzfdp zzfdp = this.zzlsi;
                if (zzdra.zzlsi != zzfdp.zzpaz) {
                    z = true;
                }
                this.zzlsi = zzfev.zza(z2, zzfdp, z, zzdra.zzlsi);
                this.zzlsj = (zzdrt) zzfev.zza(this.zzlsj, zzdra.zzlsj);
                return this;
            case 6:
                zzfdy zzfdy = (zzfdy) obj;
                zzfei zzfei = (zzfei) obj2;
                if (zzfei != null) {
                    while (!z) {
                        try {
                            i = zzfdy.zzctt();
                            if (i != 0) {
                                if (i == 18) {
                                    this.zzlsi = zzfdy.zzcub();
                                } else if (i == 26) {
                                    zzfen zzfen;
                                    if (this.zzlsj != null) {
                                        zzfem zzfem = this.zzlsj;
                                        zzfen zzfen2 = (zzfen) zzfem.zza(zzfeu.zzpcv, null, null);
                                        zzfen2.zza(zzfem);
                                        zzfen = (com.google.android.gms.internal.zzdrt.zza) zzfen2;
                                    } else {
                                        zzfen = null;
                                    }
                                    this.zzlsj = (zzdrt) zzfdy.zza(zzdrt.zzbon(), zzfei);
                                    if (zzfen != null) {
                                        zzfen.zza(this.zzlsj);
                                        this.zzlsj = (zzdrt) zzfen.zzcvk();
                                    }
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
                    synchronized (zzdra.class) {
                        if (zzbas == null) {
                            zzbas = new zzfeo(zzlsk);
                        }
                    }
                }
                return zzbas;
            default:
                throw new UnsupportedOperationException();
        }
        return zzlsk;
    }

    public final void zza(zzfed zzfed) throws IOException {
        if (!this.zzlsi.isEmpty()) {
            zzfed.zza(2, this.zzlsi);
        }
        if (this.zzlsj != null) {
            zzfed.zza(3, this.zzlsj == null ? zzdrt.zzbon() : this.zzlsj);
        }
        this.zzpcg.zza(zzfed);
    }

    public final int zzhl() {
        int i = this.zzpch;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.zzlsi.isEmpty()) {
            i2 = 0 + zzfed.zzb(2, this.zzlsi);
        }
        if (this.zzlsj != null) {
            i2 += zzfed.zzb(3, this.zzlsj == null ? zzdrt.zzbon() : this.zzlsj);
        }
        i2 += this.zzpcg.zzhl();
        this.zzpch = i2;
        return i2;
    }
}
