package com.google.android.gms.internal;

import java.io.IOException;

public final class zzdqq extends zzfem<zzdqq, zza> implements zzffs {
    private static volatile zzffu<zzdqq> zzbas;
    private static final zzdqq zzlro;
    private zzdrp zzlrn;

    public static final class zza extends zzfen<zzdqq, zza> implements zzffs {
        private zza() {
            super(zzdqq.zzlro);
        }
    }

    static {
        zzfem zzdqq = new zzdqq();
        zzlro = zzdqq;
        zzdqq.zza(zzfeu.zzpct, null, null);
        zzdqq.zzpcg.zzbin();
    }

    private zzdqq() {
    }

    public static zzdqq zzbms() {
        return zzlro;
    }

    protected final Object zza(int i, Object obj, Object obj2) {
        switch (zzdqr.zzbaq[i - 1]) {
            case 1:
                return new zzdqq();
            case 2:
                return zzlro;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                this.zzlrn = (zzdrp) ((zzfev) obj).zza(this.zzlrn, ((zzdqq) obj2).zzlrn);
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
                                if (zzctt == 18) {
                                    zzfen zzfen;
                                    if (this.zzlrn != null) {
                                        zzfem zzfem = this.zzlrn;
                                        zzfen zzfen2 = (zzfen) zzfem.zza(zzfeu.zzpcv, null, null);
                                        zzfen2.zza(zzfem);
                                        zzfen = (com.google.android.gms.internal.zzdrp.zza) zzfen2;
                                    } else {
                                        zzfen = null;
                                    }
                                    this.zzlrn = (zzdrp) zzfdy.zza(zzdrp.zzbnz(), zzfei);
                                    if (zzfen != null) {
                                        zzfen.zza(this.zzlrn);
                                        this.zzlrn = (zzdrp) zzfen.zzcvk();
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
                    synchronized (zzdqq.class) {
                        if (zzbas == null) {
                            zzbas = new zzfeo(zzlro);
                        }
                    }
                }
                return zzbas;
            default:
                throw new UnsupportedOperationException();
        }
        return zzlro;
    }

    public final void zza(zzfed zzfed) throws IOException {
        if (this.zzlrn != null) {
            zzfed.zza(2, this.zzlrn == null ? zzdrp.zzbnz() : this.zzlrn);
        }
        this.zzpcg.zza(zzfed);
    }

    public final zzdrp zzbmr() {
        return this.zzlrn == null ? zzdrp.zzbnz() : this.zzlrn;
    }

    public final int zzhl() {
        int i = this.zzpch;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.zzlrn != null) {
            i2 = 0 + zzfed.zzb(2, this.zzlrn == null ? zzdrp.zzbnz() : this.zzlrn);
        }
        i2 += this.zzpcg.zzhl();
        this.zzpch = i2;
        return i2;
    }
}
