package com.google.android.gms.internal;

import java.io.IOException;

public final class zzdqk extends zzfem<zzdqk, zza> implements zzffs {
    private static volatile zzffu<zzdqk> zzbas;
    private static final zzdqk zzlrg;

    public static final class zza extends zzfen<zzdqk, zza> implements zzffs {
        private zza() {
            super(zzdqk.zzlrg);
        }
    }

    static {
        zzfem zzdqk = new zzdqk();
        zzlrg = zzdqk;
        zzdqk.zza(zzfeu.zzpct, null, null);
        zzdqk.zzpcg.zzbin();
    }

    private zzdqk() {
    }

    public static zzdqk zzbmn() {
        return zzlrg;
    }

    protected final Object zza(int i, Object obj, Object obj2) {
        switch (zzdql.zzbaq[i - 1]) {
            case 1:
                return new zzdqk();
            case 2:
                return zzlrg;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                return this;
            case 6:
                zzfdy zzfdy = (zzfdy) obj;
                if (((zzfei) obj2) != null) {
                    Object obj3 = null;
                    while (obj3 == null) {
                        try {
                            int zzctt = zzfdy.zzctt();
                            if (zzctt == 0 || !zza(zzctt, zzfdy)) {
                                obj3 = 1;
                            }
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
                    synchronized (zzdqk.class) {
                        if (zzbas == null) {
                            zzbas = new zzfeo(zzlrg);
                        }
                    }
                }
                return zzbas;
            default:
                throw new UnsupportedOperationException();
        }
        return zzlrg;
    }

    public final void zza(zzfed zzfed) throws IOException {
        this.zzpcg.zza(zzfed);
    }

    public final int zzhl() {
        int i = this.zzpch;
        if (i != -1) {
            return i;
        }
        i = this.zzpcg.zzhl() + 0;
        this.zzpch = i;
        return i;
    }
}
