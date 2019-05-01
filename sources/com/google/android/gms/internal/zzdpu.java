package com.google.android.gms.internal;

import java.io.IOException;

public final class zzdpu extends zzfem<zzdpu, zza> implements zzffs {
    private static volatile zzffu<zzdpu> zzbas;
    private static final zzdpu zzlqu;
    private int zzlql;
    private zzdpy zzlqs;
    private zzfdp zzlqt = zzfdp.zzpaz;

    public static final class zza extends zzfen<zzdpu, zza> implements zzffs {
        private zza() {
            super(zzdpu.zzlqu);
        }

        public final zza zzc(zzdpy zzdpy) {
            zzcvj();
            ((zzdpu) this.zzpcj).zzb(zzdpy);
            return this;
        }

        public final zza zzfk(int i) {
            zzcvj();
            ((zzdpu) this.zzpcj).setVersion(0);
            return this;
        }

        public final zza zzl(zzfdp zzfdp) {
            zzcvj();
            ((zzdpu) this.zzpcj).zzj(zzfdp);
            return this;
        }
    }

    static {
        zzfem zzdpu = new zzdpu();
        zzlqu = zzdpu;
        zzdpu.zza(zzfeu.zzpct, null, null);
        zzdpu.zzpcg.zzbin();
    }

    private zzdpu() {
    }

    private final void setVersion(int i) {
        this.zzlql = i;
    }

    private final void zzb(zzdpy zzdpy) {
        if (zzdpy == null) {
            throw new NullPointerException();
        }
        this.zzlqs = zzdpy;
    }

    public static zza zzblv() {
        zzfem zzfem = zzlqu;
        zzfen zzfen = (zzfen) zzfem.zza(zzfeu.zzpcv, null, null);
        zzfen.zza(zzfem);
        return (zza) zzfen;
    }

    public static zzdpu zzblw() {
        return zzlqu;
    }

    private final void zzj(zzfdp zzfdp) {
        if (zzfdp == null) {
            throw new NullPointerException();
        }
        this.zzlqt = zzfdp;
    }

    public static zzdpu zzk(zzfdp zzfdp) throws zzffe {
        return (zzdpu) zzfem.zza(zzlqu, zzfdp);
    }

    public final int getVersion() {
        return this.zzlql;
    }

    protected final Object zza(int i, Object obj, Object obj2) {
        boolean z = true;
        Object obj3 = null;
        switch (zzdpv.zzbaq[i - 1]) {
            case 1:
                return new zzdpu();
            case 2:
                return zzlqu;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzfev zzfev = (zzfev) obj;
                zzdpu zzdpu = (zzdpu) obj2;
                this.zzlql = zzfev.zza(this.zzlql != 0, this.zzlql, zzdpu.zzlql != 0, zzdpu.zzlql);
                this.zzlqs = (zzdpy) zzfev.zza(this.zzlqs, zzdpu.zzlqs);
                boolean z2 = this.zzlqt != zzfdp.zzpaz;
                zzfdp zzfdp = this.zzlqt;
                if (zzdpu.zzlqt == zzfdp.zzpaz) {
                    z = false;
                }
                this.zzlqt = zzfev.zza(z2, zzfdp, z, zzdpu.zzlqt);
                return this;
            case 6:
                zzfdy zzfdy = (zzfdy) obj;
                zzfei zzfei = (zzfei) obj2;
                if (zzfei != null) {
                    while (obj3 == null) {
                        try {
                            i = zzfdy.zzctt();
                            if (i != 0) {
                                if (i == 8) {
                                    this.zzlql = zzfdy.zzcuc();
                                } else if (i == 18) {
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
                                } else if (i == 26) {
                                    this.zzlqt = zzfdy.zzcub();
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
                    synchronized (zzdpu.class) {
                        if (zzbas == null) {
                            zzbas = new zzfeo(zzlqu);
                        }
                    }
                }
                return zzbas;
            default:
                throw new UnsupportedOperationException();
        }
        return zzlqu;
    }

    public final void zza(zzfed zzfed) throws IOException {
        if (this.zzlql != 0) {
            zzfed.zzab(1, this.zzlql);
        }
        if (this.zzlqs != null) {
            zzfed.zza(2, this.zzlqs == null ? zzdpy.zzbmb() : this.zzlqs);
        }
        if (!this.zzlqt.isEmpty()) {
            zzfed.zza(3, this.zzlqt);
        }
        this.zzpcg.zza(zzfed);
    }

    public final zzdpy zzblt() {
        return this.zzlqs == null ? zzdpy.zzbmb() : this.zzlqs;
    }

    public final zzfdp zzblu() {
        return this.zzlqt;
    }

    public final int zzhl() {
        int i = this.zzpch;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.zzlql != 0) {
            i2 = 0 + zzfed.zzae(1, this.zzlql);
        }
        if (this.zzlqs != null) {
            i2 += zzfed.zzb(2, this.zzlqs == null ? zzdpy.zzbmb() : this.zzlqs);
        }
        if (!this.zzlqt.isEmpty()) {
            i2 += zzfed.zzb(3, this.zzlqt);
        }
        i2 += this.zzpcg.zzhl();
        this.zzpch = i2;
        return i2;
    }
}
