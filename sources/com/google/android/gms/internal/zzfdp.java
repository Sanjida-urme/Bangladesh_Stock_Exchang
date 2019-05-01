package com.google.android.gms.internal;

import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

public abstract class zzfdp implements Serializable, Iterable<Byte> {
    public static final zzfdp zzpaz = new zzfdw(zzfez.EMPTY_BYTE_ARRAY);
    private static final zzfdt zzpba;
    private int zzlwn = 0;

    static {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/558922244.run(Unknown Source)
*/
        /*
        r0 = new com.google.android.gms.internal.zzfdw;
        r1 = com.google.android.gms.internal.zzfez.EMPTY_BYTE_ARRAY;
        r0.<init>(r1);
        zzpaz = r0;
        r0 = "android.content.Context";	 Catch:{ ClassNotFoundException -> 0x0010 }
        java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0010 }
        r0 = 1;
        goto L_0x0011;
    L_0x0010:
        r0 = 0;
    L_0x0011:
        r1 = 0;
        if (r0 == 0) goto L_0x001a;
    L_0x0014:
        r0 = new com.google.android.gms.internal.zzfdx;
        r0.<init>(r1);
        goto L_0x001f;
    L_0x001a:
        r0 = new com.google.android.gms.internal.zzfdr;
        r0.<init>(r1);
    L_0x001f:
        zzpba = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzfdp.<clinit>():void");
    }

    zzfdp() {
    }

    private static zzfdp zza(Iterator<zzfdp> it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", new Object[]{Integer.valueOf(i)}));
        } else if (i == 1) {
            return (zzfdp) it.next();
        } else {
            int i2 = i >>> 1;
            zzfdp zza = zza(it, i2);
            zzfdp zza2 = zza(it, i - i2);
            if (Integer.MAX_VALUE - zza.size() >= zza2.size()) {
                return zzffx.zza(zza, zza2);
            }
            i2 = zza.size();
            int size = zza2.size();
            StringBuilder stringBuilder = new StringBuilder(53);
            stringBuilder.append("ByteString would be too long: ");
            stringBuilder.append(i2);
            stringBuilder.append("+");
            stringBuilder.append(size);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public static zzfdp zzay(byte[] bArr) {
        return zze(bArr, 0, bArr.length);
    }

    static zzfdp zzaz(byte[] bArr) {
        return new zzfdw(bArr);
    }

    public static zzfdp zze(byte[] bArr, int i, int i2) {
        return new zzfdw(zzpba.zzf(bArr, i, i2));
    }

    public static zzfdp zzf(Iterable<zzfdp> iterable) {
        int size = ((Collection) iterable).size();
        return size == 0 ? zzpaz : zza(iterable.iterator(), size);
    }

    static int zzh(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((((i | i2) | i4) | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("Beginning index: ");
            stringBuilder.append(i);
            stringBuilder.append(" < 0");
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        } else if (i2 < i) {
            r1 = new StringBuilder(66);
            r1.append("Beginning index larger than ending index: ");
            r1.append(i);
            r1.append(", ");
            r1.append(i2);
            throw new IndexOutOfBoundsException(r1.toString());
        } else {
            r1 = new StringBuilder(37);
            r1.append("End index: ");
            r1.append(i2);
            r1.append(" >= ");
            r1.append(i3);
            throw new IndexOutOfBoundsException(r1.toString());
        }
    }

    static zzfdu zzkf(int i) {
        return new zzfdu(i);
    }

    public static zzfdp zztc(String str) {
        return new zzfdw(str.getBytes(zzfez.UTF_8));
    }

    static void zzy(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i < 0) {
            StringBuilder stringBuilder = new StringBuilder(22);
            stringBuilder.append("Index < 0: ");
            stringBuilder.append(i);
            throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
        }
        StringBuilder stringBuilder2 = new StringBuilder(40);
        stringBuilder2.append("Index > length: ");
        stringBuilder2.append(i);
        stringBuilder2.append(", ");
        stringBuilder2.append(i2);
        throw new ArrayIndexOutOfBoundsException(stringBuilder2.toString());
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzlwn;
        if (i == 0) {
            i = size();
            i = zzg(i, 0, i);
            if (i == 0) {
                i = 1;
            }
            this.zzlwn = i;
        }
        return i;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public /* synthetic */ Iterator iterator() {
        return new zzfdq(this);
    }

    public abstract int size();

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return zzfez.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        zzb(bArr, 0, 0, size);
        return bArr;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    abstract void zza(zzfdo zzfdo) throws IOException;

    public final void zza(byte[] bArr, int i, int i2, int i3) {
        zzh(i, i + i3, size());
        zzh(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            zzb(bArr, i, i2, i3);
        }
    }

    protected abstract void zzb(byte[] bArr, int i, int i2, int i3);

    public abstract zzfdy zzctm();

    protected abstract int zzctn();

    protected abstract boolean zzcto();

    protected final int zzctp() {
        return this.zzlwn;
    }

    protected abstract int zzg(int i, int i2, int i3);

    public abstract byte zzke(int i);

    public abstract zzfdp zzx(int i, int i2);
}
