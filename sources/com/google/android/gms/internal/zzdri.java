package com.google.android.gms.internal;

import java.io.IOException;

public final class zzdri extends zzfem<zzdri, zza> implements zzffs {
    private static volatile zzffu<zzdri> zzbas;
    private static final zzdri zzlsx;
    private int zzlsv;
    private int zzlsw;

    public static final class zza extends zzfen<zzdri, zza> implements zzffs {
        private zza() {
            super(zzdri.zzlsx);
        }
    }

    static {
        zzfem zzdri = new zzdri();
        zzlsx = zzdri;
        zzdri.zza(zzfeu.zzpct, null, null);
        zzdri.zzpcg.zzbin();
    }

    private zzdri() {
    }

    public static zzdri zzbnr() {
        return zzlsx;
    }

    protected final Object zza(int i, Object obj, Object obj2) {
        boolean z = true;
        Object obj3 = null;
        switch (zzdrj.zzbaq[i - 1]) {
            case 1:
                return new zzdri();
            case 2:
                return zzlsx;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzfev zzfev = (zzfev) obj;
                zzdri zzdri = (zzdri) obj2;
                this.zzlsv = zzfev.zza(this.zzlsv != 0, this.zzlsv, zzdri.zzlsv != 0, zzdri.zzlsv);
                boolean z2 = this.zzlsw != 0;
                int i2 = this.zzlsw;
                if (zzdri.zzlsw == 0) {
                    z = false;
                }
                this.zzlsw = zzfev.zza(z2, i2, z, zzdri.zzlsw);
                return this;
            case 6:
                zzfdy zzfdy = (zzfdy) obj;
                if (((zzfei) obj2) != null) {
                    while (obj3 == null) {
                        try {
                            i = zzfdy.zzctt();
                            if (i != 0) {
                                if (i == 8) {
                                    this.zzlsv = zzfdy.zzcud();
                                } else if (i == 16) {
                                    this.zzlsw = zzfdy.zzcuc();
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
                    synchronized (zzdri.class) {
                        if (zzbas == null) {
                            zzbas = new zzfeo(zzlsx);
                        }
                    }
                }
                return zzbas;
            default:
                throw new UnsupportedOperationException();
        }
        return zzlsx;
    }

    public final void zza(zzfed zzfed) throws IOException {
        if (this.zzlsv != zzdrc.UNKNOWN_HASH.zzhn()) {
            zzfed.zzaa(1, this.zzlsv);
        }
        if (this.zzlsw != 0) {
            zzfed.zzab(2, this.zzlsw);
        }
        this.zzpcg.zza(zzfed);
    }

    public final zzdrc zzbnp() {
        zzdrc zzfq = zzdrc.zzfq(this.zzlsv);
        return zzfq == null ? zzdrc.UNRECOGNIZED : zzfq;
    }

    public final int zzbnq() {
        return this.zzlsw;
    }

    public final int zzhl() {
        int i = this.zzpch;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.zzlsv != zzdrc.UNKNOWN_HASH.zzhn()) {
            i2 = 0 + zzfed.zzag(1, this.zzlsv);
        }
        if (this.zzlsw != 0) {
            i2 += zzfed.zzae(2, this.zzlsw);
        }
        i2 += this.zzpcg.zzhl();
        this.zzpch = i2;
        return i2;
    }
}
