package com.google.android.gms.internal;

import java.io.IOException;

public final class zzdrp extends zzfem<zzdrp, zza> implements zzffs {
    private static volatile zzffu<zzdrp> zzbas;
    private static final zzdrp zzltp;
    private String zzlsy = "";
    private zzfdp zzlsz = zzfdp.zzpaz;

    public static final class zza extends zzfen<zzdrp, zza> implements zzffs {
        private zza() {
            super(zzdrp.zzltp);
        }
    }

    static {
        zzfem zzdrp = new zzdrp();
        zzltp = zzdrp;
        zzdrp.zza(zzfeu.zzpct, null, null);
        zzdrp.zzpcg.zzbin();
    }

    private zzdrp() {
    }

    public static zzdrp zzbnz() {
        return zzltp;
    }

    protected final Object zza(int i, Object obj, Object obj2) {
        boolean z = true;
        Object obj3 = null;
        switch (zzdrq.zzbaq[i - 1]) {
            case 1:
                return new zzdrp();
            case 2:
                return zzltp;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzfev zzfev = (zzfev) obj;
                zzdrp zzdrp = (zzdrp) obj2;
                this.zzlsy = zzfev.zza(this.zzlsy.isEmpty() ^ true, this.zzlsy, zzdrp.zzlsy.isEmpty() ^ true, zzdrp.zzlsy);
                boolean z2 = this.zzlsz != zzfdp.zzpaz;
                zzfdp zzfdp = this.zzlsz;
                if (zzdrp.zzlsz == zzfdp.zzpaz) {
                    z = false;
                }
                this.zzlsz = zzfev.zza(z2, zzfdp, z, zzdrp.zzlsz);
                return this;
            case 6:
                zzfdy zzfdy = (zzfdy) obj;
                if (((zzfei) obj2) != null) {
                    while (obj3 == null) {
                        try {
                            i = zzfdy.zzctt();
                            if (i != 0) {
                                if (i == 10) {
                                    this.zzlsy = zzfdy.zzcua();
                                } else if (i == 18) {
                                    this.zzlsz = zzfdy.zzcub();
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
                    synchronized (zzdrp.class) {
                        if (zzbas == null) {
                            zzbas = new zzfeo(zzltp);
                        }
                    }
                }
                return zzbas;
            default:
                throw new UnsupportedOperationException();
        }
        return zzltp;
    }

    public final void zza(zzfed zzfed) throws IOException {
        if (!this.zzlsy.isEmpty()) {
            zzfed.zzn(1, this.zzlsy);
        }
        if (!this.zzlsz.isEmpty()) {
            zzfed.zza(2, this.zzlsz);
        }
        this.zzpcg.zza(zzfed);
    }

    public final String zzbnt() {
        return this.zzlsy;
    }

    public final zzfdp zzbnu() {
        return this.zzlsz;
    }

    public final int zzhl() {
        int i = this.zzpch;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.zzlsy.isEmpty()) {
            i2 = 0 + zzfed.zzo(1, this.zzlsy);
        }
        if (!this.zzlsz.isEmpty()) {
            i2 += zzfed.zzb(2, this.zzlsz);
        }
        i2 += this.zzpcg.zzhl();
        this.zzpch = i2;
        return i2;
    }
}
