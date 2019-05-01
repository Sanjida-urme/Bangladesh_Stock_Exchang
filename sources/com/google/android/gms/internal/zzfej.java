package com.google.android.gms.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class zzfej<FieldDescriptorType extends zzfel<FieldDescriptorType>> {
    private static final zzfej zzpcd = new zzfej(true);
    private boolean zzkra;
    private final zzfgc<FieldDescriptorType, Object> zzpcb = zzfgc.zzlq(16);
    private boolean zzpcc = false;

    private zzfej() {
    }

    private zzfej(boolean z) {
        if (!this.zzkra) {
            this.zzpcb.zzbin();
            this.zzkra = true;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int zza(com.google.android.gms.internal.zzfgz r2, int r3, java.lang.Object r4) {
        /*
        r3 = com.google.android.gms.internal.zzfed.zzkx(r3);
        r0 = com.google.android.gms.internal.zzfgz.GROUP;
        if (r2 != r0) goto L_0x0010;
    L_0x0008:
        r0 = r4;
        r0 = (com.google.android.gms.internal.zzffq) r0;
        com.google.android.gms.internal.zzfez.zzg(r0);
        r3 = r3 << 1;
    L_0x0010:
        r0 = com.google.android.gms.internal.zzfek.zzpcf;
        r2 = r2.ordinal();
        r2 = r0[r2];
        switch(r2) {
            case 1: goto L_0x00fd;
            case 2: goto L_0x00f2;
            case 3: goto L_0x00e7;
            case 4: goto L_0x00dc;
            case 5: goto L_0x00d1;
            case 6: goto L_0x00c6;
            case 7: goto L_0x00bb;
            case 8: goto L_0x00b0;
            case 9: goto L_0x00a9;
            case 10: goto L_0x0097;
            case 11: goto L_0x0083;
            case 12: goto L_0x0076;
            case 13: goto L_0x006a;
            case 14: goto L_0x005e;
            case 15: goto L_0x0052;
            case 16: goto L_0x0046;
            case 17: goto L_0x003a;
            case 18: goto L_0x0023;
            default: goto L_0x001b;
        };
    L_0x001b:
        r2 = new java.lang.RuntimeException;
        r3 = "There is no way to get here, but the compiler thinks otherwise.";
        r2.<init>(r3);
        throw r2;
    L_0x0023:
        r2 = r4 instanceof com.google.android.gms.internal.zzffa;
        if (r2 == 0) goto L_0x0033;
    L_0x0027:
        r4 = (com.google.android.gms.internal.zzffa) r4;
        r2 = r4.zzhn();
    L_0x002d:
        r2 = com.google.android.gms.internal.zzfed.zzld(r2);
        goto L_0x0107;
    L_0x0033:
        r4 = (java.lang.Integer) r4;
        r2 = r4.intValue();
        goto L_0x002d;
    L_0x003a:
        r4 = (java.lang.Long) r4;
        r0 = r4.longValue();
        r2 = com.google.android.gms.internal.zzfed.zzcx(r0);
        goto L_0x0107;
    L_0x0046:
        r4 = (java.lang.Integer) r4;
        r2 = r4.intValue();
        r2 = com.google.android.gms.internal.zzfed.zzla(r2);
        goto L_0x0107;
    L_0x0052:
        r4 = (java.lang.Long) r4;
        r0 = r4.longValue();
        r2 = com.google.android.gms.internal.zzfed.zzcz(r0);
        goto L_0x0107;
    L_0x005e:
        r4 = (java.lang.Integer) r4;
        r2 = r4.intValue();
        r2 = com.google.android.gms.internal.zzfed.zzlc(r2);
        goto L_0x0107;
    L_0x006a:
        r4 = (java.lang.Integer) r4;
        r2 = r4.intValue();
        r2 = com.google.android.gms.internal.zzfed.zzkz(r2);
        goto L_0x0107;
    L_0x0076:
        r2 = r4 instanceof com.google.android.gms.internal.zzfdp;
        if (r2 == 0) goto L_0x007b;
    L_0x007a:
        goto L_0x0087;
    L_0x007b:
        r4 = (byte[]) r4;
        r2 = com.google.android.gms.internal.zzfed.zzbc(r4);
        goto L_0x0107;
    L_0x0083:
        r2 = r4 instanceof com.google.android.gms.internal.zzfdp;
        if (r2 == 0) goto L_0x008f;
    L_0x0087:
        r4 = (com.google.android.gms.internal.zzfdp) r4;
        r2 = com.google.android.gms.internal.zzfed.zzan(r4);
        goto L_0x0107;
    L_0x008f:
        r4 = (java.lang.String) r4;
        r2 = com.google.android.gms.internal.zzfed.zzte(r4);
        goto L_0x0107;
    L_0x0097:
        r2 = r4 instanceof com.google.android.gms.internal.zzffg;
        if (r2 == 0) goto L_0x00a2;
    L_0x009b:
        r4 = (com.google.android.gms.internal.zzffg) r4;
        r2 = com.google.android.gms.internal.zzfed.zza(r4);
        goto L_0x0107;
    L_0x00a2:
        r4 = (com.google.android.gms.internal.zzffq) r4;
        r2 = com.google.android.gms.internal.zzfed.zze(r4);
        goto L_0x0107;
    L_0x00a9:
        r4 = (com.google.android.gms.internal.zzffq) r4;
        r2 = com.google.android.gms.internal.zzfed.zzf(r4);
        goto L_0x0107;
    L_0x00b0:
        r4 = (java.lang.Boolean) r4;
        r2 = r4.booleanValue();
        r2 = com.google.android.gms.internal.zzfed.zzda(r2);
        goto L_0x0107;
    L_0x00bb:
        r4 = (java.lang.Integer) r4;
        r2 = r4.intValue();
        r2 = com.google.android.gms.internal.zzfed.zzlb(r2);
        goto L_0x0107;
    L_0x00c6:
        r4 = (java.lang.Long) r4;
        r0 = r4.longValue();
        r2 = com.google.android.gms.internal.zzfed.zzcy(r0);
        goto L_0x0107;
    L_0x00d1:
        r4 = (java.lang.Integer) r4;
        r2 = r4.intValue();
        r2 = com.google.android.gms.internal.zzfed.zzky(r2);
        goto L_0x0107;
    L_0x00dc:
        r4 = (java.lang.Long) r4;
        r0 = r4.longValue();
        r2 = com.google.android.gms.internal.zzfed.zzcw(r0);
        goto L_0x0107;
    L_0x00e7:
        r4 = (java.lang.Long) r4;
        r0 = r4.longValue();
        r2 = com.google.android.gms.internal.zzfed.zzcv(r0);
        goto L_0x0107;
    L_0x00f2:
        r4 = (java.lang.Float) r4;
        r2 = r4.floatValue();
        r2 = com.google.android.gms.internal.zzfed.zzf(r2);
        goto L_0x0107;
    L_0x00fd:
        r4 = (java.lang.Double) r4;
        r0 = r4.doubleValue();
        r2 = com.google.android.gms.internal.zzfed.zzn(r0);
    L_0x0107:
        r3 = r3 + r2;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzfej.zza(com.google.android.gms.internal.zzfgz, int, java.lang.Object):int");
    }

    public static Object zza(zzfdy zzfdy, zzfgz zzfgz, boolean z) throws IOException {
        zzfhf zzfhf = zzfhf.STRICT;
        switch (zzfgy.zzpcf[zzfgz.ordinal()]) {
            case 1:
                return Double.valueOf(zzfdy.readDouble());
            case 2:
                return Float.valueOf(zzfdy.readFloat());
            case 3:
                return Long.valueOf(zzfdy.zzctv());
            case 4:
                return Long.valueOf(zzfdy.zzctu());
            case 5:
                return Integer.valueOf(zzfdy.zzctw());
            case 6:
                return Long.valueOf(zzfdy.zzctx());
            case 7:
                return Integer.valueOf(zzfdy.zzcty());
            case 8:
                return Boolean.valueOf(zzfdy.zzctz());
            case 9:
                return zzfdy.zzcub();
            case 10:
                return Integer.valueOf(zzfdy.zzcuc());
            case 11:
                return Integer.valueOf(zzfdy.zzcue());
            case 12:
                return Long.valueOf(zzfdy.zzcuf());
            case 13:
                return Integer.valueOf(zzfdy.zzcug());
            case 14:
                return Long.valueOf(zzfdy.zzcuh());
            case 15:
                return zzfhf.zzb(zzfdy);
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    static void zza(zzfed zzfed, zzfgz zzfgz, int i, Object obj) throws IOException {
        if (zzfgz == zzfgz.GROUP) {
            zzffq zzffq = (zzffq) obj;
            zzfez.zzg(zzffq);
            zzfed.zzz(i, 3);
            zzffq.zza(zzfed);
            zzfed.zzz(i, 4);
            return;
        }
        zzfed.zzz(i, zzfgz.zzcxe());
        switch (zzfek.zzpcf[zzfgz.ordinal()]) {
            case 1:
                zzfed.zzcu(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 2:
                zzfed.zzkw(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 3:
                zzfed.zzcs(((Long) obj).longValue());
                return;
            case 4:
                zzfed.zzcs(((Long) obj).longValue());
                return;
            case 5:
                zzfed.zzkt(((Integer) obj).intValue());
                return;
            case 6:
                zzfed.zzcu(((Long) obj).longValue());
                return;
            case 7:
                zzfed.zzkw(((Integer) obj).intValue());
                return;
            case 8:
                zzfed.zzb((byte) ((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzffq) obj).zza(zzfed);
                return;
            case 10:
                zzfed.zzd((zzffq) obj);
                return;
            case 11:
                if (obj instanceof zzfdp) {
                    zzfed.zzam((zzfdp) obj);
                    return;
                } else {
                    zzfed.zztd((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzfdp) {
                    zzfed.zzam((zzfdp) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzfed.zzi(bArr, 0, bArr.length);
                return;
            case 13:
                zzfed.zzku(((Integer) obj).intValue());
                return;
            case 14:
                zzfed.zzkw(((Integer) obj).intValue());
                return;
            case 15:
                zzfed.zzcu(((Long) obj).longValue());
                return;
            case 16:
                zzfed.zzkv(((Integer) obj).intValue());
                return;
            case 17:
                zzfed.zzct(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzffa) {
                    zzfed.zzkt(((zzffa) obj).zzhn());
                    return;
                } else {
                    zzfed.zzkt(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    private void zza(FieldDescriptorType fieldDescriptorType, Object obj) {
        if (!fieldDescriptorType.zzcvd()) {
            zza(fieldDescriptorType.zzcvc(), obj);
        } else if (obj instanceof List) {
            List arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            ArrayList arrayList2 = (ArrayList) arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                zza(fieldDescriptorType.zzcvc(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzffg) {
            this.zzpcc = true;
        }
        this.zzpcb.zza((Comparable) fieldDescriptorType, obj);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void zza(com.google.android.gms.internal.zzfgz r2, java.lang.Object r3) {
        /*
        com.google.android.gms.internal.zzfez.checkNotNull(r3);
        r0 = com.google.android.gms.internal.zzfek.zzpce;
        r2 = r2.zzcxd();
        r2 = r2.ordinal();
        r2 = r0[r2];
        r0 = 1;
        r1 = 0;
        switch(r2) {
            case 1: goto L_0x0040;
            case 2: goto L_0x003d;
            case 3: goto L_0x003a;
            case 4: goto L_0x0037;
            case 5: goto L_0x0034;
            case 6: goto L_0x0031;
            case 7: goto L_0x0028;
            case 8: goto L_0x001e;
            case 9: goto L_0x0015;
            default: goto L_0x0014;
        };
    L_0x0014:
        goto L_0x0043;
    L_0x0015:
        r2 = r3 instanceof com.google.android.gms.internal.zzffq;
        if (r2 != 0) goto L_0x0026;
    L_0x0019:
        r2 = r3 instanceof com.google.android.gms.internal.zzffg;
        if (r2 == 0) goto L_0x0043;
    L_0x001d:
        goto L_0x0026;
    L_0x001e:
        r2 = r3 instanceof java.lang.Integer;
        if (r2 != 0) goto L_0x0026;
    L_0x0022:
        r2 = r3 instanceof com.google.android.gms.internal.zzffa;
        if (r2 == 0) goto L_0x0043;
    L_0x0026:
        r1 = 1;
        goto L_0x0043;
    L_0x0028:
        r2 = r3 instanceof com.google.android.gms.internal.zzfdp;
        if (r2 != 0) goto L_0x0026;
    L_0x002c:
        r2 = r3 instanceof byte[];
        if (r2 == 0) goto L_0x0043;
    L_0x0030:
        goto L_0x0026;
    L_0x0031:
        r0 = r3 instanceof java.lang.String;
        goto L_0x0042;
    L_0x0034:
        r0 = r3 instanceof java.lang.Boolean;
        goto L_0x0042;
    L_0x0037:
        r0 = r3 instanceof java.lang.Double;
        goto L_0x0042;
    L_0x003a:
        r0 = r3 instanceof java.lang.Float;
        goto L_0x0042;
    L_0x003d:
        r0 = r3 instanceof java.lang.Long;
        goto L_0x0042;
    L_0x0040:
        r0 = r3 instanceof java.lang.Integer;
    L_0x0042:
        r1 = r0;
    L_0x0043:
        if (r1 != 0) goto L_0x004d;
    L_0x0045:
        r2 = new java.lang.IllegalArgumentException;
        r3 = "Wrong object type used with protocol message reflection.";
        r2.<init>(r3);
        throw r2;
    L_0x004d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzfej.zza(com.google.android.gms.internal.zzfgz, java.lang.Object):void");
    }

    public static <T extends zzfel<T>> zzfej<T> zzcvb() {
        return new zzfej();
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzfej zzfej = new zzfej();
        for (int i = 0; i < this.zzpcb.zzcwk(); i++) {
            Entry zzlr = this.zzpcb.zzlr(i);
            zzfej.zza((zzfel) zzlr.getKey(), zzlr.getValue());
        }
        for (Entry zzlr2 : this.zzpcb.zzcwl()) {
            zzfej.zza((zzfel) zzlr2.getKey(), zzlr2.getValue());
        }
        zzfej.zzpcc = this.zzpcc;
        return zzfej;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfej)) {
            return false;
        }
        return this.zzpcb.equals(((zzfej) obj).zzpcb);
    }

    public final int hashCode() {
        return this.zzpcb.hashCode();
    }

    public final Iterator<Entry<FieldDescriptorType, Object>> iterator() {
        return this.zzpcc ? new zzffj(this.zzpcb.entrySet().iterator()) : this.zzpcb.entrySet().iterator();
    }
}
