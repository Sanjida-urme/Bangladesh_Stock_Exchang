package com.google.android.gms.internal;

import java.io.IOException;

public final class zzdqc extends zzfem<zzdqc, zza> implements zzffs {
    private static volatile zzffu<zzdqc> zzbas;
    private static final zzdqc zzlrb;
    private int zzlqv;
    private zzdqe zzlqz;

    public static final class zza extends zzfen<zzdqc, zza> implements zzffs {
        private zza() {
            super(zzdqc.zzlrb);
        }
    }

    static {
        zzfem zzdqc = new zzdqc();
        zzlrb = zzdqc;
        zzdqc.zza(zzfeu.zzpct, null, null);
        zzdqc.zzpcg.zzbin();
    }

    private zzdqc() {
    }

    public static zzdqc zzp(zzfdp zzfdp) throws zzffe {
        return (zzdqc) zzfem.zza(zzlrb, zzfdp);
    }

    public final int getKeySize() {
        return this.zzlqv;
    }

    protected final Object zza(int i, Object obj, Object obj2) {
        boolean z = false;
        switch (zzdqd.zzbaq[i - 1]) {
            case 1:
                return new zzdqc();
            case 2:
                return zzlrb;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzfev zzfev = (zzfev) obj;
                zzdqc zzdqc = (zzdqc) obj2;
                this.zzlqz = (zzdqe) zzfev.zza(this.zzlqz, zzdqc.zzlqz);
                boolean z2 = this.zzlqv != 0;
                int i2 = this.zzlqv;
                if (zzdqc.zzlqv != 0) {
                    z = true;
                }
                this.zzlqv = zzfev.zza(z2, i2, z, zzdqc.zzlqv);
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
                                    if (this.zzlqz != null) {
                                        zzfem zzfem = this.zzlqz;
                                        zzfen zzfen2 = (zzfen) zzfem.zza(zzfeu.zzpcv, null, null);
                                        zzfen2.zza(zzfem);
                                        zzfen = (com.google.android.gms.internal.zzdqe.zza) zzfen2;
                                    } else {
                                        zzfen = null;
                                    }
                                    this.zzlqz = (zzdqe) zzfdy.zza(zzdqe.zzbmh(), zzfei);
                                    if (zzfen != null) {
                                        zzfen.zza(this.zzlqz);
                                        this.zzlqz = (zzdqe) zzfen.zzcvk();
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
                    synchronized (zzdqc.class) {
                        if (zzbas == null) {
                            zzbas = new zzfeo(zzlrb);
                        }
                    }
                }
                return zzbas;
            default:
                throw new UnsupportedOperationException();
        }
        return zzlrb;
    }

    public final void zza(zzfed zzfed) throws IOException {
        if (this.zzlqz != null) {
            zzfed.zza(1, this.zzlqz == null ? zzdqe.zzbmh() : this.zzlqz);
        }
        if (this.zzlqv != 0) {
            zzfed.zzab(2, this.zzlqv);
        }
        this.zzpcg.zza(zzfed);
    }

    public final zzdqe zzbmd() {
        return this.zzlqz == null ? zzdqe.zzbmh() : this.zzlqz;
    }

    public final int zzhl() {
        int i = this.zzpch;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.zzlqz != null) {
            i2 = 0 + zzfed.zzb(1, this.zzlqz == null ? zzdqe.zzbmh() : this.zzlqz);
        }
        if (this.zzlqv != 0) {
            i2 += zzfed.zzae(2, this.zzlqv);
        }
        i2 += this.zzpcg.zzhl();
        this.zzpch = i2;
        return i2;
    }
}
