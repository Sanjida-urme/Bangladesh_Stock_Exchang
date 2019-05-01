package com.google.android.gms.internal;

import java.io.IOException;
import java.util.List;

public final class zzdrr extends zzfem<zzdrr, zza> implements zzffs {
    private static volatile zzffu<zzdrr> zzbas;
    private static final zzdrr zzltt;
    private int zzltq;
    private int zzltr;
    private zzffd<zzb> zzlts = zzfem.zzcvg();

    public static final class zza extends zzfen<zzdrr, zza> implements zzffs {
        private zza() {
            super(zzdrr.zzltt);
        }
    }

    public static final class zzb extends zzfem<zzb, zza> implements zzffs {
        private static volatile zzffu<zzb> zzbas;
        private static final zzb zzlty;
        private zzdrk zzltu;
        private int zzltv;
        private int zzltw;
        private int zzltx;

        public static final class zza extends zzfen<zzb, zza> implements zzffs {
            private zza() {
                super(zzb.zzlty);
            }
        }

        static {
            zzfem zzb = new zzb();
            zzlty = zzb;
            zzb.zza(zzfeu.zzpct, null, null);
            zzb.zzpcg.zzbin();
        }

        private zzb() {
        }

        public static zzb zzbok() {
            return zzlty;
        }

        protected final Object zza(int i, Object obj, Object obj2) {
            boolean z = true;
            Object obj3 = null;
            switch (zzdrs.zzbaq[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return zzlty;
                case 3:
                    return null;
                case 4:
                    return new zza();
                case 5:
                    zzfev zzfev = (zzfev) obj;
                    zzb zzb = (zzb) obj2;
                    this.zzltu = (zzdrk) zzfev.zza(this.zzltu, zzb.zzltu);
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
                    zzfei zzfei = (zzfei) obj2;
                    if (zzfei != null) {
                        while (obj3 == null) {
                            try {
                                i = zzfdy.zzctt();
                                if (i != 0) {
                                    if (i == 10) {
                                        zzfen zzfen;
                                        if (this.zzltu != null) {
                                            zzfem zzfem = this.zzltu;
                                            zzfen zzfen2 = (zzfen) zzfem.zza(zzfeu.zzpcv, null, null);
                                            zzfen2.zza(zzfem);
                                            zzfen = (com.google.android.gms.internal.zzdrk.zza) zzfen2;
                                        } else {
                                            zzfen = null;
                                        }
                                        this.zzltu = (zzdrk) zzfdy.zza(zzdrk.zzbnx(), zzfei);
                                        if (zzfen != null) {
                                            zzfen.zza(this.zzltu);
                                            this.zzltu = (zzdrk) zzfen.zzcvk();
                                        }
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
                                zzbas = new zzfeo(zzlty);
                            }
                        }
                    }
                    return zzbas;
                default:
                    throw new UnsupportedOperationException();
            }
            return zzlty;
        }

        public final void zza(zzfed zzfed) throws IOException {
            if (this.zzltu != null) {
                zzfed.zza(1, this.zzltu == null ? zzdrk.zzbnx() : this.zzltu);
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

        public final boolean zzbof() {
            return this.zzltu != null;
        }

        public final zzdrk zzbog() {
            return this.zzltu == null ? zzdrk.zzbnx() : this.zzltu;
        }

        public final zzdrn zzboh() {
            zzdrn zzft = zzdrn.zzft(this.zzltv);
            return zzft == null ? zzdrn.UNRECOGNIZED : zzft;
        }

        public final int zzboi() {
            return this.zzltw;
        }

        public final zzdrv zzboj() {
            zzdrv zzfy = zzdrv.zzfy(this.zzltx);
            return zzfy == null ? zzdrv.UNRECOGNIZED : zzfy;
        }

        public final int zzhl() {
            int i = this.zzpch;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.zzltu != null) {
                i2 = 0 + zzfed.zzb(1, this.zzltu == null ? zzdrk.zzbnx() : this.zzltu);
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
        zzfem zzdrr = new zzdrr();
        zzltt = zzdrr;
        zzdrr.zza(zzfeu.zzpct, null, null);
        zzdrr.zzpcg.zzbin();
    }

    private zzdrr() {
    }

    public static zzdrr zzae(byte[] bArr) throws zzffe {
        return (zzdrr) zzfem.zza(zzltt, bArr);
    }

    protected final Object zza(int i, Object obj, Object obj2) {
        boolean z = true;
        Object obj3 = null;
        int i2;
        switch (zzdrs.zzbaq[i - 1]) {
            case 1:
                return new zzdrr();
            case 2:
                return zzltt;
            case 3:
                this.zzlts.zzbin();
                return null;
            case 4:
                return new zza();
            case 5:
                zzfev zzfev = (zzfev) obj;
                zzdrr zzdrr = (zzdrr) obj2;
                boolean z2 = this.zzltr != 0;
                i2 = this.zzltr;
                if (zzdrr.zzltr == 0) {
                    z = false;
                }
                this.zzltr = zzfev.zza(z2, i2, z, zzdrr.zzltr);
                this.zzlts = zzfev.zza(this.zzlts, zzdrr.zzlts);
                if (zzfev == zzfet.zzpcp) {
                    this.zzltq |= zzdrr.zzltq;
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
                                    if (!this.zzlts.zzcti()) {
                                        zzffd zzffd = this.zzlts;
                                        i2 = zzffd.size();
                                        this.zzlts = zzffd.zzlo(i2 == 0 ? 10 : i2 << 1);
                                    }
                                    this.zzlts.add((zzb) zzfdy.zza(zzb.zzbok(), zzfei));
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
                    synchronized (zzdrr.class) {
                        if (zzbas == null) {
                            zzbas = new zzfeo(zzltt);
                        }
                    }
                }
                return zzbas;
            default:
                throw new UnsupportedOperationException();
        }
        return zzltt;
    }

    public final void zza(zzfed zzfed) throws IOException {
        if (this.zzltr != 0) {
            zzfed.zzab(1, this.zzltr);
        }
        for (int i = 0; i < this.zzlts.size(); i++) {
            zzfed.zza(2, (zzffq) this.zzlts.get(i));
        }
        this.zzpcg.zza(zzfed);
    }

    public final int zzbob() {
        return this.zzltr;
    }

    public final List<zzb> zzboc() {
        return this.zzlts;
    }

    public final int zzbod() {
        return this.zzlts.size();
    }

    public final int zzhl() {
        int i = this.zzpch;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        i = this.zzltr != 0 ? zzfed.zzae(1, this.zzltr) + 0 : 0;
        while (i2 < this.zzlts.size()) {
            i += zzfed.zzb(2, (zzffq) this.zzlts.get(i2));
            i2++;
        }
        i += this.zzpcg.zzhl();
        this.zzpch = i;
        return i;
    }
}
