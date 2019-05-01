package com.google.android.gms.internal;

import java.io.IOException;

public final class zzdqa extends zzfem<zzdqa, zza> implements zzffs {
    private static volatile zzffu<zzdqa> zzbas;
    private static final zzdqa zzlra;
    private int zzlql;
    private zzfdp zzlqt = zzfdp.zzpaz;
    private zzdqe zzlqz;

    public static final class zza extends zzfen<zzdqa, zza> implements zzffs {
        private zza() {
            super(zzdqa.zzlra);
        }

        public final zza zzb(zzdqe zzdqe) {
            zzcvj();
            ((zzdqa) this.zzpcj).zza(zzdqe);
            return this;
        }

        public final zza zzfl(int i) {
            zzcvj();
            ((zzdqa) this.zzpcj).setVersion(0);
            return this;
        }

        public final zza zzo(zzfdp zzfdp) {
            zzcvj();
            ((zzdqa) this.zzpcj).zzj(zzfdp);
            return this;
        }
    }

    static {
        zzfem zzdqa = new zzdqa();
        zzlra = zzdqa;
        zzdqa.zza(zzfeu.zzpct, null, null);
        zzdqa.zzpcg.zzbin();
    }

    private zzdqa() {
    }

    private final void setVersion(int i) {
        this.zzlql = i;
    }

    private final void zza(zzdqe zzdqe) {
        if (zzdqe == null) {
            throw new NullPointerException();
        }
        this.zzlqz = zzdqe;
    }

    public static zza zzbme() {
        zzfem zzfem = zzlra;
        zzfen zzfen = (zzfen) zzfem.zza(zzfeu.zzpcv, null, null);
        zzfen.zza(zzfem);
        return (zza) zzfen;
    }

    private final void zzj(zzfdp zzfdp) {
        if (zzfdp == null) {
            throw new NullPointerException();
        }
        this.zzlqt = zzfdp;
    }

    public static zzdqa zzn(zzfdp zzfdp) throws zzffe {
        return (zzdqa) zzfem.zza(zzlra, zzfdp);
    }

    public final int getVersion() {
        return this.zzlql;
    }

    protected final Object zza(int i, Object obj, Object obj2) {
        boolean z = true;
        Object obj3 = null;
        switch (zzdqb.zzbaq[i - 1]) {
            case 1:
                return new zzdqa();
            case 2:
                return zzlra;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzfev zzfev = (zzfev) obj;
                zzdqa zzdqa = (zzdqa) obj2;
                this.zzlql = zzfev.zza(this.zzlql != 0, this.zzlql, zzdqa.zzlql != 0, zzdqa.zzlql);
                this.zzlqz = (zzdqe) zzfev.zza(this.zzlqz, zzdqa.zzlqz);
                boolean z2 = this.zzlqt != zzfdp.zzpaz;
                zzfdp zzfdp = this.zzlqt;
                if (zzdqa.zzlqt == zzfdp.zzpaz) {
                    z = false;
                }
                this.zzlqt = zzfev.zza(z2, zzfdp, z, zzdqa.zzlqt);
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
                    synchronized (zzdqa.class) {
                        if (zzbas == null) {
                            zzbas = new zzfeo(zzlra);
                        }
                    }
                }
                return zzbas;
            default:
                throw new UnsupportedOperationException();
        }
        return zzlra;
    }

    public final void zza(zzfed zzfed) throws IOException {
        if (this.zzlql != 0) {
            zzfed.zzab(1, this.zzlql);
        }
        if (this.zzlqz != null) {
            zzfed.zza(2, this.zzlqz == null ? zzdqe.zzbmh() : this.zzlqz);
        }
        if (!this.zzlqt.isEmpty()) {
            zzfed.zza(3, this.zzlqt);
        }
        this.zzpcg.zza(zzfed);
    }

    public final zzfdp zzblu() {
        return this.zzlqt;
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
        if (this.zzlql != 0) {
            i2 = 0 + zzfed.zzae(1, this.zzlql);
        }
        if (this.zzlqz != null) {
            i2 += zzfed.zzb(2, this.zzlqz == null ? zzdqe.zzbmh() : this.zzlqz);
        }
        if (!this.zzlqt.isEmpty()) {
            i2 += zzfed.zzb(3, this.zzlqt);
        }
        i2 += this.zzpcg.zzhl();
        this.zzpch = i2;
        return i2;
    }
}
