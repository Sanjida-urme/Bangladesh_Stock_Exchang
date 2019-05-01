package com.google.android.gms.internal;

import java.io.IOException;

public final class zzdpw extends zzfem<zzdpw, zza> implements zzffs {
    private static volatile zzffu<zzdpw> zzbas;
    private static final zzdpw zzlqw;
    private zzdpy zzlqs;
    private int zzlqv;

    public static final class zza extends zzfen<zzdpw, zza> implements zzffs {
        private zza() {
            super(zzdpw.zzlqw);
        }
    }

    static {
        zzfem zzdpw = new zzdpw();
        zzlqw = zzdpw;
        zzdpw.zza(zzfeu.zzpct, null, null);
        zzdpw.zzpcg.zzbin();
    }

    private zzdpw() {
    }

    public static zzdpw zzbly() {
        return zzlqw;
    }

    public static zzdpw zzm(zzfdp zzfdp) throws zzffe {
        return (zzdpw) zzfem.zza(zzlqw, zzfdp);
    }

    public final int getKeySize() {
        return this.zzlqv;
    }

    protected final Object zza(int i, Object obj, Object obj2) {
        boolean z = false;
        switch (zzdpx.zzbaq[i - 1]) {
            case 1:
                return new zzdpw();
            case 2:
                return zzlqw;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzfev zzfev = (zzfev) obj;
                zzdpw zzdpw = (zzdpw) obj2;
                this.zzlqs = (zzdpy) zzfev.zza(this.zzlqs, zzdpw.zzlqs);
                boolean z2 = this.zzlqv != 0;
                int i2 = this.zzlqv;
                if (zzdpw.zzlqv != 0) {
                    z = true;
                }
                this.zzlqv = zzfev.zza(z2, i2, z, zzdpw.zzlqv);
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
                                    if (this.zzlqs != null) {
                                        zzfem zzfem = this.zzlqs;
                                        zzfen zzfen2 = (zzfen) zzfem.zza(zzfeu.zzpcv, null, null);
                                        zzfen2.zza(zzfem);
                                        zzfen = (com.google.android.gms.internal.zzdpy.zza) zzfen2;
                                    } else {
                                        zzfen = null;
                                    }
                                    this.zzlqs = (zzdpy) zzfdy.zza(zzdpy.zzbmb(), zzfei);
                                    if (zzfen != null) {
                                        zzfen.zza(this.zzlqs);
                                        this.zzlqs = (zzdpy) zzfen.zzcvk();
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
                    synchronized (zzdpw.class) {
                        if (zzbas == null) {
                            zzbas = new zzfeo(zzlqw);
                        }
                    }
                }
                return zzbas;
            default:
                throw new UnsupportedOperationException();
        }
        return zzlqw;
    }

    public final void zza(zzfed zzfed) throws IOException {
        if (this.zzlqs != null) {
            zzfed.zza(1, this.zzlqs == null ? zzdpy.zzbmb() : this.zzlqs);
        }
        if (this.zzlqv != 0) {
            zzfed.zzab(2, this.zzlqv);
        }
        this.zzpcg.zza(zzfed);
    }

    public final zzdpy zzblt() {
        return this.zzlqs == null ? zzdpy.zzbmb() : this.zzlqs;
    }

    public final int zzhl() {
        int i = this.zzpch;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.zzlqs != null) {
            i2 = 0 + zzfed.zzb(1, this.zzlqs == null ? zzdpy.zzbmb() : this.zzlqs);
        }
        if (this.zzlqv != 0) {
            i2 += zzfed.zzae(2, this.zzlqv);
        }
        i2 += this.zzpcg.zzhl();
        this.zzpch = i2;
        return i2;
    }
}
