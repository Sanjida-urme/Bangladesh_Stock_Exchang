package com.google.android.gms.internal;

import java.io.IOException;

public final class zzdqg extends zzfem<zzdqg, zza> implements zzffs {
    private static volatile zzffu<zzdqg> zzbas;
    private static final zzdqg zzlre;
    private int zzlql;
    private zzfdp zzlqt = zzfdp.zzpaz;
    private zzdqk zzlrd;

    public static final class zza extends zzfen<zzdqg, zza> implements zzffs {
        private zza() {
            super(zzdqg.zzlre);
        }

        public final zza zzb(zzdqk zzdqk) {
            zzcvj();
            ((zzdqg) this.zzpcj).zza(zzdqk);
            return this;
        }

        public final zza zzfm(int i) {
            zzcvj();
            ((zzdqg) this.zzpcj).setVersion(0);
            return this;
        }

        public final zza zzr(zzfdp zzfdp) {
            zzcvj();
            ((zzdqg) this.zzpcj).zzj(zzfdp);
            return this;
        }
    }

    static {
        zzfem zzdqg = new zzdqg();
        zzlre = zzdqg;
        zzdqg.zza(zzfeu.zzpct, null, null);
        zzdqg.zzpcg.zzbin();
    }

    private zzdqg() {
    }

    private final void setVersion(int i) {
        this.zzlql = i;
    }

    private final void zza(zzdqk zzdqk) {
        if (zzdqk == null) {
            throw new NullPointerException();
        }
        this.zzlrd = zzdqk;
    }

    public static zza zzbmj() {
        zzfem zzfem = zzlre;
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

    public static zzdqg zzq(zzfdp zzfdp) throws zzffe {
        return (zzdqg) zzfem.zza(zzlre, zzfdp);
    }

    public final int getVersion() {
        return this.zzlql;
    }

    protected final Object zza(int i, Object obj, Object obj2) {
        boolean z = true;
        Object obj3 = null;
        switch (zzdqh.zzbaq[i - 1]) {
            case 1:
                return new zzdqg();
            case 2:
                return zzlre;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzfev zzfev = (zzfev) obj;
                zzdqg zzdqg = (zzdqg) obj2;
                this.zzlql = zzfev.zza(this.zzlql != 0, this.zzlql, zzdqg.zzlql != 0, zzdqg.zzlql);
                this.zzlrd = (zzdqk) zzfev.zza(this.zzlrd, zzdqg.zzlrd);
                boolean z2 = this.zzlqt != zzfdp.zzpaz;
                zzfdp zzfdp = this.zzlqt;
                if (zzdqg.zzlqt == zzfdp.zzpaz) {
                    z = false;
                }
                this.zzlqt = zzfev.zza(z2, zzfdp, z, zzdqg.zzlqt);
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
                                    if (this.zzlrd != null) {
                                        zzfem zzfem = this.zzlrd;
                                        zzfen zzfen2 = (zzfen) zzfem.zza(zzfeu.zzpcv, null, null);
                                        zzfen2.zza(zzfem);
                                        zzfen = (com.google.android.gms.internal.zzdqk.zza) zzfen2;
                                    } else {
                                        zzfen = null;
                                    }
                                    this.zzlrd = (zzdqk) zzfdy.zza(zzdqk.zzbmn(), zzfei);
                                    if (zzfen != null) {
                                        zzfen.zza(this.zzlrd);
                                        this.zzlrd = (zzdqk) zzfen.zzcvk();
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
                    synchronized (zzdqg.class) {
                        if (zzbas == null) {
                            zzbas = new zzfeo(zzlre);
                        }
                    }
                }
                return zzbas;
            default:
                throw new UnsupportedOperationException();
        }
        return zzlre;
    }

    public final void zza(zzfed zzfed) throws IOException {
        if (this.zzlql != 0) {
            zzfed.zzab(1, this.zzlql);
        }
        if (this.zzlrd != null) {
            zzfed.zza(2, this.zzlrd == null ? zzdqk.zzbmn() : this.zzlrd);
        }
        if (!this.zzlqt.isEmpty()) {
            zzfed.zza(3, this.zzlqt);
        }
        this.zzpcg.zza(zzfed);
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
        if (this.zzlrd != null) {
            i2 += zzfed.zzb(2, this.zzlrd == null ? zzdqk.zzbmn() : this.zzlrd);
        }
        if (!this.zzlqt.isEmpty()) {
            i2 += zzfed.zzb(3, this.zzlqt);
        }
        i2 += this.zzpcg.zzhl();
        this.zzpch = i2;
        return i2;
    }
}
