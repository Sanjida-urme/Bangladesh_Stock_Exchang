package com.google.android.gms.internal;

import java.io.IOException;

public final class zzdqe extends zzfem<zzdqe, zza> implements zzffs {
    private static volatile zzffu<zzdqe> zzbas;
    private static final zzdqe zzlrc;
    private int zzlqx;

    public static final class zza extends zzfen<zzdqe, zza> implements zzffs {
        private zza() {
            super(zzdqe.zzlrc);
        }
    }

    static {
        zzfem zzdqe = new zzdqe();
        zzlrc = zzdqe;
        zzdqe.zza(zzfeu.zzpct, null, null);
        zzdqe.zzpcg.zzbin();
    }

    private zzdqe() {
    }

    public static zzdqe zzbmh() {
        return zzlrc;
    }

    protected final Object zza(int i, Object obj, Object obj2) {
        boolean z = true;
        Object obj3 = null;
        switch (zzdqf.zzbaq[i - 1]) {
            case 1:
                return new zzdqe();
            case 2:
                return zzlrc;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzfev zzfev = (zzfev) obj;
                zzdqe zzdqe = (zzdqe) obj2;
                boolean z2 = this.zzlqx != 0;
                int i2 = this.zzlqx;
                if (zzdqe.zzlqx == 0) {
                    z = false;
                }
                this.zzlqx = zzfev.zza(z2, i2, z, zzdqe.zzlqx);
                return this;
            case 6:
                zzfdy zzfdy = (zzfdy) obj;
                if (((zzfei) obj2) != null) {
                    while (obj3 == null) {
                        try {
                            i = zzfdy.zzctt();
                            if (i != 0) {
                                if (i == 8) {
                                    this.zzlqx = zzfdy.zzcuc();
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
                    synchronized (zzdqe.class) {
                        if (zzbas == null) {
                            zzbas = new zzfeo(zzlrc);
                        }
                    }
                }
                return zzbas;
            default:
                throw new UnsupportedOperationException();
        }
        return zzlrc;
    }

    public final void zza(zzfed zzfed) throws IOException {
        if (this.zzlqx != 0) {
            zzfed.zzab(1, this.zzlqx);
        }
        this.zzpcg.zza(zzfed);
    }

    public final int zzbma() {
        return this.zzlqx;
    }

    public final int zzhl() {
        int i = this.zzpch;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.zzlqx != 0) {
            i2 = 0 + zzfed.zzae(1, this.zzlqx);
        }
        i2 += this.zzpcg.zzhl();
        this.zzpch = i2;
        return i2;
    }
}
