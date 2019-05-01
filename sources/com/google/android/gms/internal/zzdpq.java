package com.google.android.gms.internal;

import java.io.IOException;

public final class zzdpq extends zzfem<zzdpq, zza> implements zzffs {
    private static volatile zzffu<zzdpq> zzbas;
    private static final zzdpq zzlqo;
    private int zzlql;
    private zzdpu zzlqm;
    private zzdre zzlqn;

    public static final class zza extends zzfen<zzdpq, zza> implements zzffs {
        private zza() {
            super(zzdpq.zzlqo);
        }

        public final zza zzb(zzdpu zzdpu) {
            zzcvj();
            ((zzdpq) this.zzpcj).zza(zzdpu);
            return this;
        }

        public final zza zzb(zzdre zzdre) {
            zzcvj();
            ((zzdpq) this.zzpcj).zza(zzdre);
            return this;
        }

        public final zza zzfj(int i) {
            zzcvj();
            ((zzdpq) this.zzpcj).setVersion(i);
            return this;
        }
    }

    static {
        zzfem zzdpq = new zzdpq();
        zzlqo = zzdpq;
        zzdpq.zza(zzfeu.zzpct, null, null);
        zzdpq.zzpcg.zzbin();
    }

    private zzdpq() {
    }

    private final void setVersion(int i) {
        this.zzlql = i;
    }

    private final void zza(zzdpu zzdpu) {
        if (zzdpu == null) {
            throw new NullPointerException();
        }
        this.zzlqm = zzdpu;
    }

    private final void zza(zzdre zzdre) {
        if (zzdre == null) {
            throw new NullPointerException();
        }
        this.zzlqn = zzdre;
    }

    public static zza zzblo() {
        zzfem zzfem = zzlqo;
        zzfen zzfen = (zzfen) zzfem.zza(zzfeu.zzpcv, null, null);
        zzfen.zza(zzfem);
        return (zza) zzfen;
    }

    public static zzdpq zzh(zzfdp zzfdp) throws zzffe {
        return (zzdpq) zzfem.zza(zzlqo, zzfdp);
    }

    public final int getVersion() {
        return this.zzlql;
    }

    protected final Object zza(int i, Object obj, Object obj2) {
        boolean z = false;
        switch (zzdpr.zzbaq[i - 1]) {
            case 1:
                return new zzdpq();
            case 2:
                return zzlqo;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzfev zzfev = (zzfev) obj;
                zzdpq zzdpq = (zzdpq) obj2;
                boolean z2 = this.zzlql != 0;
                int i2 = this.zzlql;
                if (zzdpq.zzlql != 0) {
                    z = true;
                }
                this.zzlql = zzfev.zza(z2, i2, z, zzdpq.zzlql);
                this.zzlqm = (zzdpu) zzfev.zza(this.zzlqm, zzdpq.zzlqm);
                this.zzlqn = (zzdre) zzfev.zza(this.zzlqn, zzdpq.zzlqn);
                return this;
            case 6:
                zzfdy zzfdy = (zzfdy) obj;
                zzfei zzfei = (zzfei) obj2;
                if (zzfei != null) {
                    while (!z) {
                        try {
                            i = zzfdy.zzctt();
                            if (i != 0) {
                                if (i == 8) {
                                    this.zzlql = zzfdy.zzcuc();
                                } else if (i == 18) {
                                    if (this.zzlqm != null) {
                                        r5 = this.zzlqm;
                                        r3 = (zzfen) r5.zza(zzfeu.zzpcv, null, null);
                                        r3.zza(r5);
                                        r5 = (com.google.android.gms.internal.zzdpu.zza) r3;
                                    } else {
                                        r5 = null;
                                    }
                                    this.zzlqm = (zzdpu) zzfdy.zza(zzdpu.zzblw(), zzfei);
                                    if (r5 != null) {
                                        r5.zza(this.zzlqm);
                                        this.zzlqm = (zzdpu) r5.zzcvk();
                                    }
                                } else if (i == 26) {
                                    if (this.zzlqn != null) {
                                        r5 = this.zzlqn;
                                        r3 = (zzfen) r5.zza(zzfeu.zzpcv, null, null);
                                        r3.zza(r5);
                                        r5 = (com.google.android.gms.internal.zzdre.zza) r3;
                                    } else {
                                        r5 = null;
                                    }
                                    this.zzlqn = (zzdre) zzfdy.zza(zzdre.zzbnl(), zzfei);
                                    if (r5 != null) {
                                        r5.zza(this.zzlqn);
                                        this.zzlqn = (zzdre) r5.zzcvk();
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
                    synchronized (zzdpq.class) {
                        if (zzbas == null) {
                            zzbas = new zzfeo(zzlqo);
                        }
                    }
                }
                return zzbas;
            default:
                throw new UnsupportedOperationException();
        }
        return zzlqo;
    }

    public final void zza(zzfed zzfed) throws IOException {
        if (this.zzlql != 0) {
            zzfed.zzab(1, this.zzlql);
        }
        if (this.zzlqm != null) {
            zzfed.zza(2, this.zzlqm == null ? zzdpu.zzblw() : this.zzlqm);
        }
        if (this.zzlqn != null) {
            zzfed.zza(3, this.zzlqn == null ? zzdre.zzbnl() : this.zzlqn);
        }
        this.zzpcg.zza(zzfed);
    }

    public final zzdpu zzblm() {
        return this.zzlqm == null ? zzdpu.zzblw() : this.zzlqm;
    }

    public final zzdre zzbln() {
        return this.zzlqn == null ? zzdre.zzbnl() : this.zzlqn;
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
        if (this.zzlqm != null) {
            i2 += zzfed.zzb(2, this.zzlqm == null ? zzdpu.zzblw() : this.zzlqm);
        }
        if (this.zzlqn != null) {
            i2 += zzfed.zzb(3, this.zzlqn == null ? zzdre.zzbnl() : this.zzlqn);
        }
        i2 += this.zzpcg.zzhl();
        this.zzpch = i2;
        return i2;
    }
}
