package com.google.android.gms.internal;

import java.io.IOException;

public final class zzdqm extends zzfem<zzdqm, zza> implements zzffs {
    private static volatile zzffu<zzdqm> zzbas;
    private static final zzdqm zzlrh;
    private int zzlql;
    private zzfdp zzlqt = zzfdp.zzpaz;

    public static final class zza extends zzfen<zzdqm, zza> implements zzffs {
        private zza() {
            super(zzdqm.zzlrh);
        }

        public final zza zzfn(int i) {
            zzcvj();
            ((zzdqm) this.zzpcj).setVersion(0);
            return this;
        }

        public final zza zzu(zzfdp zzfdp) {
            zzcvj();
            ((zzdqm) this.zzpcj).zzj(zzfdp);
            return this;
        }
    }

    static {
        zzfem zzdqm = new zzdqm();
        zzlrh = zzdqm;
        zzdqm.zza(zzfeu.zzpct, null, null);
        zzdqm.zzpcg.zzbin();
    }

    private zzdqm() {
    }

    private final void setVersion(int i) {
        this.zzlql = i;
    }

    public static zza zzbmp() {
        zzfem zzfem = zzlrh;
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

    public static zzdqm zzt(zzfdp zzfdp) throws zzffe {
        return (zzdqm) zzfem.zza(zzlrh, zzfdp);
    }

    public final int getVersion() {
        return this.zzlql;
    }

    protected final Object zza(int i, Object obj, Object obj2) {
        boolean z = true;
        Object obj3 = null;
        switch (zzdqn.zzbaq[i - 1]) {
            case 1:
                return new zzdqm();
            case 2:
                return zzlrh;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzfev zzfev = (zzfev) obj;
                zzdqm zzdqm = (zzdqm) obj2;
                this.zzlql = zzfev.zza(this.zzlql != 0, this.zzlql, zzdqm.zzlql != 0, zzdqm.zzlql);
                boolean z2 = this.zzlqt != zzfdp.zzpaz;
                zzfdp zzfdp = this.zzlqt;
                if (zzdqm.zzlqt == zzfdp.zzpaz) {
                    z = false;
                }
                this.zzlqt = zzfev.zza(z2, zzfdp, z, zzdqm.zzlqt);
                return this;
            case 6:
                zzfdy zzfdy = (zzfdy) obj;
                if (((zzfei) obj2) != null) {
                    while (obj3 == null) {
                        try {
                            i = zzfdy.zzctt();
                            if (i != 0) {
                                if (i == 8) {
                                    this.zzlql = zzfdy.zzcuc();
                                } else if (i == 18) {
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
                    synchronized (zzdqm.class) {
                        if (zzbas == null) {
                            zzbas = new zzfeo(zzlrh);
                        }
                    }
                }
                return zzbas;
            default:
                throw new UnsupportedOperationException();
        }
        return zzlrh;
    }

    public final void zza(zzfed zzfed) throws IOException {
        if (this.zzlql != 0) {
            zzfed.zzab(1, this.zzlql);
        }
        if (!this.zzlqt.isEmpty()) {
            zzfed.zza(2, this.zzlqt);
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
        if (!this.zzlqt.isEmpty()) {
            i2 += zzfed.zzb(2, this.zzlqt);
        }
        i2 += this.zzpcg.zzhl();
        this.zzpch = i2;
        return i2;
    }
}
