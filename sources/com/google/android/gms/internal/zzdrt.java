package com.google.android.gms.internal;

import java.io.IOException;

public final class zzdrt extends zzfem<zzdrt, zza> implements zzffs {
    private static volatile zzffu<zzdrt> zzbas;
    private static final zzdrt zzlua;
    private int zzltq;
    private int zzltr;
    private zzffd<zzb> zzltz = zzfem.zzcvg();

    public static final class zza extends zzfen<zzdrt, zza> implements zzffs {
        private zza() {
            super(zzdrt.zzlua);
        }

        public final zza zzb(zzb zzb) {
            zzcvj();
            ((zzdrt) this.zzpcj).zza(zzb);
            return this;
        }

        public final zza zzfv(int i) {
            zzcvj();
            ((zzdrt) this.zzpcj).zzfu(i);
            return this;
        }
    }

    public static final class zzb extends zzfem<zzb, zza> implements zzffs {
        private static volatile zzffu<zzb> zzbas;
        private static final zzb zzlub;
        private String zzlsy = "";
        private int zzltv;
        private int zzltw;
        private int zzltx;

        public static final class zza extends zzfen<zzb, zza> implements zzffs {
            private zza() {
                super(zzb.zzlub);
            }

            public final zza zzb(zzdrn zzdrn) {
                zzcvj();
                ((zzb) this.zzpcj).zza(zzdrn);
                return this;
            }

            public final zza zzb(zzdrv zzdrv) {
                zzcvj();
                ((zzb) this.zzpcj).zza(zzdrv);
                return this;
            }

            public final zza zzfx(int i) {
                zzcvj();
                ((zzb) this.zzpcj).zzfw(i);
                return this;
            }

            public final zza zzoc(String str) {
                zzcvj();
                ((zzb) this.zzpcj).zzoa(str);
                return this;
            }
        }

        static {
            zzfem zzb = new zzb();
            zzlub = zzb;
            zzb.zza(zzfeu.zzpct, null, null);
            zzb.zzpcg.zzbin();
        }

        private zzb() {
        }

        private final void zza(zzdrn zzdrn) {
            if (zzdrn == null) {
                throw new NullPointerException();
            }
            this.zzltv = zzdrn.zzhn();
        }

        private final void zza(zzdrv zzdrv) {
            if (zzdrv == null) {
                throw new NullPointerException();
            }
            this.zzltx = zzdrv.zzhn();
        }

        public static zza zzbop() {
            zzfem zzfem = zzlub;
            zzfen zzfen = (zzfen) zzfem.zza(zzfeu.zzpcv, null, null);
            zzfen.zza(zzfem);
            return (zza) zzfen;
        }

        public static zzb zzboq() {
            return zzlub;
        }

        private final void zzfw(int i) {
            this.zzltw = i;
        }

        private final void zzoa(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.zzlsy = str;
        }

        protected final Object zza(int i, Object obj, Object obj2) {
            boolean z = true;
            Object obj3 = null;
            switch (zzdru.zzbaq[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return zzlub;
                case 3:
                    return null;
                case 4:
                    return new zza();
                case 5:
                    zzfev zzfev = (zzfev) obj;
                    zzb zzb = (zzb) obj2;
                    this.zzlsy = zzfev.zza(this.zzlsy.isEmpty() ^ true, this.zzlsy, zzb.zzlsy.isEmpty() ^ true, zzb.zzlsy);
                    this.zzltv = zzfev.zza(this.zzltv != 0, this.zzltv, zzb.zzltv != 0, zzb.zzltv);
                    this.zzltw = zzfev.zza(this.zzltw != 0, this.zzltw, zzb.zzltw != 0, zzb.zzltw);
                    boolean z2 = this.zzltx != 0;
                    int i2 = this.zzltx;
                    if (zzb.zzltx == 0) {
                        z = false;
                    }
                    this.zzltx = zzfev.zza(z2, i2, z, zzb.zzltx);
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
                                    } else if (i == 16) {
                                        this.zzltv = zzfdy.zzcud();
                                    } else if (i == 24) {
                                        this.zzltw = zzfdy.zzcuc();
                                    } else if (i == 32) {
                                        this.zzltx = zzfdy.zzcud();
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
                        synchronized (zzb.class) {
                            if (zzbas == null) {
                                zzbas = new zzfeo(zzlub);
                            }
                        }
                    }
                    return zzbas;
                default:
                    throw new UnsupportedOperationException();
            }
            return zzlub;
        }

        public final void zza(zzfed zzfed) throws IOException {
            if (!this.zzlsy.isEmpty()) {
                zzfed.zzn(1, this.zzlsy);
            }
            if (this.zzltv != zzdrn.UNKNOWN_STATUS.zzhn()) {
                zzfed.zzaa(2, this.zzltv);
            }
            if (this.zzltw != 0) {
                zzfed.zzab(3, this.zzltw);
            }
            if (this.zzltx != zzdrv.UNKNOWN_PREFIX.zzhn()) {
                zzfed.zzaa(4, this.zzltx);
            }
            this.zzpcg.zza(zzfed);
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
            if (this.zzltv != zzdrn.UNKNOWN_STATUS.zzhn()) {
                i2 += zzfed.zzag(2, this.zzltv);
            }
            if (this.zzltw != 0) {
                i2 += zzfed.zzae(3, this.zzltw);
            }
            if (this.zzltx != zzdrv.UNKNOWN_PREFIX.zzhn()) {
                i2 += zzfed.zzag(4, this.zzltx);
            }
            i2 += this.zzpcg.zzhl();
            this.zzpch = i2;
            return i2;
        }
    }

    static {
        zzfem zzdrt = new zzdrt();
        zzlua = zzdrt;
        zzdrt.zza(zzfeu.zzpct, null, null);
        zzdrt.zzpcg.zzbin();
    }

    private zzdrt() {
    }

    private final void zza(zzb zzb) {
        if (zzb == null) {
            throw new NullPointerException();
        }
        if (!this.zzltz.zzcti()) {
            zzffd zzffd = this.zzltz;
            int size = zzffd.size();
            this.zzltz = zzffd.zzlo(size == 0 ? 10 : size << 1);
        }
        this.zzltz.add(zzb);
    }

    public static zza zzbom() {
        zzfem zzfem = zzlua;
        zzfen zzfen = (zzfen) zzfem.zza(zzfeu.zzpcv, null, null);
        zzfen.zza(zzfem);
        return (zza) zzfen;
    }

    public static zzdrt zzbon() {
        return zzlua;
    }

    private final void zzfu(int i) {
        this.zzltr = i;
    }

    protected final Object zza(int i, Object obj, Object obj2) {
        boolean z = true;
        Object obj3 = null;
        int i2;
        switch (zzdru.zzbaq[i - 1]) {
            case 1:
                return new zzdrt();
            case 2:
                return zzlua;
            case 3:
                this.zzltz.zzbin();
                return null;
            case 4:
                return new zza();
            case 5:
                zzfev zzfev = (zzfev) obj;
                zzdrt zzdrt = (zzdrt) obj2;
                boolean z2 = this.zzltr != 0;
                i2 = this.zzltr;
                if (zzdrt.zzltr == 0) {
                    z = false;
                }
                this.zzltr = zzfev.zza(z2, i2, z, zzdrt.zzltr);
                this.zzltz = zzfev.zza(this.zzltz, zzdrt.zzltz);
                if (zzfev == zzfet.zzpcp) {
                    this.zzltq |= zzdrt.zzltq;
                }
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
                                    this.zzltr = zzfdy.zzcuc();
                                } else if (i == 18) {
                                    if (!this.zzltz.zzcti()) {
                                        zzffd zzffd = this.zzltz;
                                        i2 = zzffd.size();
                                        this.zzltz = zzffd.zzlo(i2 == 0 ? 10 : i2 << 1);
                                    }
                                    this.zzltz.add((zzb) zzfdy.zza(zzb.zzboq(), zzfei));
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
                    synchronized (zzdrt.class) {
                        if (zzbas == null) {
                            zzbas = new zzfeo(zzlua);
                        }
                    }
                }
                return zzbas;
            default:
                throw new UnsupportedOperationException();
        }
        return zzlua;
    }

    public final void zza(zzfed zzfed) throws IOException {
        if (this.zzltr != 0) {
            zzfed.zzab(1, this.zzltr);
        }
        for (int i = 0; i < this.zzltz.size(); i++) {
            zzfed.zza(2, (zzffq) this.zzltz.get(i));
        }
        this.zzpcg.zza(zzfed);
    }

    public final int zzhl() {
        int i = this.zzpch;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        i = this.zzltr != 0 ? zzfed.zzae(1, this.zzltr) + 0 : 0;
        while (i2 < this.zzltz.size()) {
            i += zzfed.zzb(2, (zzffq) this.zzltz.get(i2));
            i2++;
        }
        i += this.zzpcg.zzhl();
        this.zzpch = i;
        return i;
    }
}
