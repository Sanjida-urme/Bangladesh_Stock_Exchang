package com.google.android.gms.internal;

import java.io.IOException;

public final class zzdrk extends zzfem<zzdrk, zza> implements zzffs {
    private static volatile zzffu<zzdrk> zzbas;
    private static final zzdrk zzltb;
    private String zzlsy = "";
    private zzfdp zzlsz = zzfdp.zzpaz;
    private int zzlta;

    public enum zzb implements zzffa {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        
        private static final zzffb<zzb> zzbbb = null;
        private final int value;

        static {
            zzbbb = new zzdrm();
        }

        private zzb(int i) {
            this.value = i;
        }

        public static zzb zzfs(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_KEYMATERIAL;
                case 1:
                    return SYMMETRIC;
                case 2:
                    return ASYMMETRIC_PRIVATE;
                case 3:
                    return ASYMMETRIC_PUBLIC;
                case 4:
                    return REMOTE;
                default:
                    return null;
            }
        }

        public final int zzhn() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static final class zza extends zzfen<zzdrk, zza> implements zzffs {
        private zza() {
            super(zzdrk.zzltb);
        }

        public final zza zzaa(zzfdp zzfdp) {
            zzcvj();
            ((zzdrk) this.zzpcj).zzz(zzfdp);
            return this;
        }

        public final zza zzb(zzb zzb) {
            zzcvj();
            ((zzdrk) this.zzpcj).zza(zzb);
            return this;
        }

        public final zza zzob(String str) {
            zzcvj();
            ((zzdrk) this.zzpcj).zzoa(str);
            return this;
        }
    }

    static {
        zzfem zzdrk = new zzdrk();
        zzltb = zzdrk;
        zzdrk.zza(zzfeu.zzpct, null, null);
        zzdrk.zzpcg.zzbin();
    }

    private zzdrk() {
    }

    private final void zza(zzb zzb) {
        if (zzb == null) {
            throw new NullPointerException();
        }
        this.zzlta = zzb.zzhn();
    }

    public static zza zzbnw() {
        zzfem zzfem = zzltb;
        zzfen zzfen = (zzfen) zzfem.zza(zzfeu.zzpcv, null, null);
        zzfen.zza(zzfem);
        return (zza) zzfen;
    }

    public static zzdrk zzbnx() {
        return zzltb;
    }

    private final void zzoa(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.zzlsy = str;
    }

    private final void zzz(zzfdp zzfdp) {
        if (zzfdp == null) {
            throw new NullPointerException();
        }
        this.zzlsz = zzfdp;
    }

    protected final Object zza(int i, Object obj, Object obj2) {
        boolean z = true;
        Object obj3 = null;
        switch (zzdrl.zzbaq[i - 1]) {
            case 1:
                return new zzdrk();
            case 2:
                return zzltb;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzfev zzfev = (zzfev) obj;
                zzdrk zzdrk = (zzdrk) obj2;
                this.zzlsy = zzfev.zza(this.zzlsy.isEmpty() ^ true, this.zzlsy, zzdrk.zzlsy.isEmpty() ^ true, zzdrk.zzlsy);
                this.zzlsz = zzfev.zza(this.zzlsz != zzfdp.zzpaz, this.zzlsz, zzdrk.zzlsz != zzfdp.zzpaz, zzdrk.zzlsz);
                boolean z2 = this.zzlta != 0;
                int i2 = this.zzlta;
                if (zzdrk.zzlta == 0) {
                    z = false;
                }
                this.zzlta = zzfev.zza(z2, i2, z, zzdrk.zzlta);
                return this;
            case 6:
                zzfdy zzfdy = (zzfdy) obj;
                if (((zzfei) obj2) != null) {
                    while (obj3 == null) {
                        try {
                            i = zzfdy.zzctt();
                            if (i != 0) {
                                if (i == 10) {
                                    this.zzlsy = zzfdy.zzcua();
                                } else if (i == 18) {
                                    this.zzlsz = zzfdy.zzcub();
                                } else if (i == 24) {
                                    this.zzlta = zzfdy.zzcud();
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
                    synchronized (zzdrk.class) {
                        if (zzbas == null) {
                            zzbas = new zzfeo(zzltb);
                        }
                    }
                }
                return zzbas;
            default:
                throw new UnsupportedOperationException();
        }
        return zzltb;
    }

    public final void zza(zzfed zzfed) throws IOException {
        if (!this.zzlsy.isEmpty()) {
            zzfed.zzn(1, this.zzlsy);
        }
        if (!this.zzlsz.isEmpty()) {
            zzfed.zza(2, this.zzlsz);
        }
        if (this.zzlta != zzb.UNKNOWN_KEYMATERIAL.zzhn()) {
            zzfed.zzaa(3, this.zzlta);
        }
        this.zzpcg.zza(zzfed);
    }

    public final String zzbnt() {
        return this.zzlsy;
    }

    public final zzfdp zzbnu() {
        return this.zzlsz;
    }

    public final zzb zzbnv() {
        zzb zzfs = zzb.zzfs(this.zzlta);
        return zzfs == null ? zzb.UNRECOGNIZED : zzfs;
    }

    public final int zzhl() {
        int i = this.zzpch;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.zzlsy.isEmpty()) {
            i2 = 0 + zzfed.zzo(1, this.zzlsy);
        }
        if (!this.zzlsz.isEmpty()) {
            i2 += zzfed.zzb(2, this.zzlsz);
        }
        if (this.zzlta != zzb.UNKNOWN_KEYMATERIAL.zzhn()) {
            i2 += zzfed.zzag(3, this.zzlta);
        }
        i2 += this.zzpcg.zzhl();
        this.zzpch = i2;
        return i2;
    }
}
