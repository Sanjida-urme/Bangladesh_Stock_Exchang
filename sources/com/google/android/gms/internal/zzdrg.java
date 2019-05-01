package com.google.android.gms.internal;

import java.io.IOException;

public final class zzdrg extends zzfem<zzdrg, zza> implements zzffs {
    private static volatile zzffu<zzdrg> zzbas;
    private static final zzdrg zzlsu;
    private int zzlqv;
    private zzdri zzlss;

    public static final class zza extends zzfen<zzdrg, zza> implements zzffs {
        private zza() {
            super(zzdrg.zzlsu);
        }
    }

    static {
        zzfem zzdrg = new zzdrg();
        zzlsu = zzdrg;
        zzdrg.zza(zzfeu.zzpct, null, null);
        zzdrg.zzpcg.zzbin();
    }

    private zzdrg() {
    }

    public static zzdrg zzbnn() {
        return zzlsu;
    }

    public static zzdrg zzy(zzfdp zzfdp) throws zzffe {
        return (zzdrg) zzfem.zza(zzlsu, zzfdp);
    }

    public final int getKeySize() {
        return this.zzlqv;
    }

    protected final Object zza(int i, Object obj, Object obj2) {
        boolean z = false;
        switch (zzdrh.zzbaq[i - 1]) {
            case 1:
                return new zzdrg();
            case 2:
                return zzlsu;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzfev zzfev = (zzfev) obj;
                zzdrg zzdrg = (zzdrg) obj2;
                this.zzlss = (zzdri) zzfev.zza(this.zzlss, zzdrg.zzlss);
                boolean z2 = this.zzlqv != 0;
                int i2 = this.zzlqv;
                if (zzdrg.zzlqv != 0) {
                    z = true;
                }
                this.zzlqv = zzfev.zza(z2, i2, z, zzdrg.zzlqv);
                return this;
            case 6:
                zzfdy zzfdy = (zzfdy) obj;
                zzfei zzfei = (zzfei) obj2;
                if (zzfei != null) {
                    while (!z) {
                        try {
                            i = zzfdy.zzctt();
                            if (i != 0) {
                                if (i == 10) {
                                    zzfen zzfen;
                                    if (this.zzlss != null) {
                                        zzfem zzfem = this.zzlss;
                                        zzfen zzfen2 = (zzfen) zzfem.zza(zzfeu.zzpcv, null, null);
                                        zzfen2.zza(zzfem);
                                        zzfen = (com.google.android.gms.internal.zzdri.zza) zzfen2;
                                    } else {
                                        zzfen = null;
                                    }
                                    this.zzlss = (zzdri) zzfdy.zza(zzdri.zzbnr(), zzfei);
                                    if (zzfen != null) {
                                        zzfen.zza(this.zzlss);
                                        this.zzlss = (zzdri) zzfen.zzcvk();
                                    }
                                } else if (i == 16) {
                                    this.zzlqv = zzfdy.zzcuc();
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
                    synchronized (zzdrg.class) {
                        if (zzbas == null) {
                            zzbas = new zzfeo(zzlsu);
                        }
                    }
                }
                return zzbas;
            default:
                throw new UnsupportedOperationException();
        }
        return zzlsu;
    }

    public final void zza(zzfed zzfed) throws IOException {
        if (this.zzlss != null) {
            zzfed.zza(1, this.zzlss == null ? zzdri.zzbnr() : this.zzlss);
        }
        if (this.zzlqv != 0) {
            zzfed.zzab(2, this.zzlqv);
        }
        this.zzpcg.zza(zzfed);
    }

    public final zzdri zzbnj() {
        return this.zzlss == null ? zzdri.zzbnr() : this.zzlss;
    }

    public final int zzhl() {
        int i = this.zzpch;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.zzlss != null) {
            i2 = 0 + zzfed.zzb(1, this.zzlss == null ? zzdri.zzbnr() : this.zzlss);
        }
        if (this.zzlqv != 0) {
            i2 += zzfed.zzae(2, this.zzlqv);
        }
        i2 += this.zzpcg.zzhl();
        this.zzpch = i2;
        return i2;
    }
}
