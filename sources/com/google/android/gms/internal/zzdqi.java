package com.google.android.gms.internal;

import java.io.IOException;

public final class zzdqi extends zzfem<zzdqi, zza> implements zzffs {
    private static volatile zzffu<zzdqi> zzbas;
    private static final zzdqi zzlrf;
    private int zzlqv;
    private zzdqk zzlrd;

    public static final class zza extends zzfen<zzdqi, zza> implements zzffs {
        private zza() {
            super(zzdqi.zzlrf);
        }
    }

    static {
        zzfem zzdqi = new zzdqi();
        zzlrf = zzdqi;
        zzdqi.zza(zzfeu.zzpct, null, null);
        zzdqi.zzpcg.zzbin();
    }

    private zzdqi() {
    }

    public static zzdqi zzs(zzfdp zzfdp) throws zzffe {
        return (zzdqi) zzfem.zza(zzlrf, zzfdp);
    }

    public final int getKeySize() {
        return this.zzlqv;
    }

    protected final Object zza(int i, Object obj, Object obj2) {
        boolean z = false;
        switch (zzdqj.zzbaq[i - 1]) {
            case 1:
                return new zzdqi();
            case 2:
                return zzlrf;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzfev zzfev = (zzfev) obj;
                zzdqi zzdqi = (zzdqi) obj2;
                this.zzlrd = (zzdqk) zzfev.zza(this.zzlrd, zzdqi.zzlrd);
                boolean z2 = this.zzlqv != 0;
                int i2 = this.zzlqv;
                if (zzdqi.zzlqv != 0) {
                    z = true;
                }
                this.zzlqv = zzfev.zza(z2, i2, z, zzdqi.zzlqv);
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
                    synchronized (zzdqi.class) {
                        if (zzbas == null) {
                            zzbas = new zzfeo(zzlrf);
                        }
                    }
                }
                return zzbas;
            default:
                throw new UnsupportedOperationException();
        }
        return zzlrf;
    }

    public final void zza(zzfed zzfed) throws IOException {
        if (this.zzlrd != null) {
            zzfed.zza(1, this.zzlrd == null ? zzdqk.zzbmn() : this.zzlrd);
        }
        if (this.zzlqv != 0) {
            zzfed.zzab(2, this.zzlqv);
        }
        this.zzpcg.zza(zzfed);
    }

    public final zzdqk zzbml() {
        return this.zzlrd == null ? zzdqk.zzbmn() : this.zzlrd;
    }

    public final int zzhl() {
        int i = this.zzpch;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.zzlrd != null) {
            i2 = 0 + zzfed.zzb(1, this.zzlrd == null ? zzdqk.zzbmn() : this.zzlrd);
        }
        if (this.zzlqv != 0) {
            i2 += zzfed.zzae(2, this.zzlqv);
        }
        i2 += this.zzpcg.zzhl();
        this.zzpch = i2;
        return i2;
    }
}
