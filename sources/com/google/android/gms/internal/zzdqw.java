package com.google.android.gms.internal;

import java.io.IOException;

public final class zzdqw extends zzfem<zzdqw, zza> implements zzffs {
    private static volatile zzffu<zzdqw> zzbas;
    private static final zzdqw zzlsa;
    private int zzlrx;
    private int zzlry;
    private zzfdp zzlrz = zzfdp.zzpaz;

    public static final class zza extends zzfen<zzdqw, zza> implements zzffs {
        private zza() {
            super(zzdqw.zzlsa);
        }
    }

    static {
        zzfem zzdqw = new zzdqw();
        zzlsa = zzdqw;
        zzdqw.zza(zzfeu.zzpct, null, null);
        zzdqw.zzpcg.zzbin();
    }

    private zzdqw() {
    }

    public static zzdqw zzbng() {
        return zzlsa;
    }

    protected final Object zza(int i, Object obj, Object obj2) {
        boolean z = true;
        Object obj3 = null;
        switch (zzdqx.zzbaq[i - 1]) {
            case 1:
                return new zzdqw();
            case 2:
                return zzlsa;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzfev zzfev = (zzfev) obj;
                zzdqw zzdqw = (zzdqw) obj2;
                this.zzlrx = zzfev.zza(this.zzlrx != 0, this.zzlrx, zzdqw.zzlrx != 0, zzdqw.zzlrx);
                this.zzlry = zzfev.zza(this.zzlry != 0, this.zzlry, zzdqw.zzlry != 0, zzdqw.zzlry);
                boolean z2 = this.zzlrz != zzfdp.zzpaz;
                zzfdp zzfdp = this.zzlrz;
                if (zzdqw.zzlrz == zzfdp.zzpaz) {
                    z = false;
                }
                this.zzlrz = zzfev.zza(z2, zzfdp, z, zzdqw.zzlrz);
                return this;
            case 6:
                zzfdy zzfdy = (zzfdy) obj;
                if (((zzfei) obj2) != null) {
                    while (obj3 == null) {
                        try {
                            i = zzfdy.zzctt();
                            if (i != 0) {
                                if (i == 8) {
                                    this.zzlrx = zzfdy.zzcud();
                                } else if (i == 16) {
                                    this.zzlry = zzfdy.zzcud();
                                } else if (i == 90) {
                                    this.zzlrz = zzfdy.zzcub();
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
                    synchronized (zzdqw.class) {
                        if (zzbas == null) {
                            zzbas = new zzfeo(zzlsa);
                        }
                    }
                }
                return zzbas;
            default:
                throw new UnsupportedOperationException();
        }
        return zzlsa;
    }

    public final void zza(zzfed zzfed) throws IOException {
        if (this.zzlrx != zzdqy.UNKNOWN_CURVE.zzhn()) {
            zzfed.zzaa(1, this.zzlrx);
        }
        if (this.zzlry != zzdrc.UNKNOWN_HASH.zzhn()) {
            zzfed.zzaa(2, this.zzlry);
        }
        if (!this.zzlrz.isEmpty()) {
            zzfed.zza(11, this.zzlrz);
        }
        this.zzpcg.zza(zzfed);
    }

    public final zzdqy zzbnd() {
        zzdqy zzfp = zzdqy.zzfp(this.zzlrx);
        return zzfp == null ? zzdqy.UNRECOGNIZED : zzfp;
    }

    public final zzdrc zzbne() {
        zzdrc zzfq = zzdrc.zzfq(this.zzlry);
        return zzfq == null ? zzdrc.UNRECOGNIZED : zzfq;
    }

    public final zzfdp zzbnf() {
        return this.zzlrz;
    }

    public final int zzhl() {
        int i = this.zzpch;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.zzlrx != zzdqy.UNKNOWN_CURVE.zzhn()) {
            i2 = 0 + zzfed.zzag(1, this.zzlrx);
        }
        if (this.zzlry != zzdrc.UNKNOWN_HASH.zzhn()) {
            i2 += zzfed.zzag(2, this.zzlry);
        }
        if (!this.zzlrz.isEmpty()) {
            i2 += zzfed.zzb(11, this.zzlrz);
        }
        i2 += this.zzpcg.zzhl();
        this.zzpch = i2;
        return i2;
    }
}
