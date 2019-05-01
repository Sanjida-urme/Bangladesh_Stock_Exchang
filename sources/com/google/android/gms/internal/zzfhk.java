package com.google.android.gms.internal;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class zzfhk {
    private final ByteBuffer zzphl;

    private zzfhk(ByteBuffer byteBuffer) {
        this.zzphl = byteBuffer;
        this.zzphl.order(ByteOrder.LITTLE_ENDIAN);
    }

    private zzfhk(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    private static int zza(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int length = charSequence.length();
        i2 += i;
        int i3 = 0;
        while (i3 < length) {
            int i4 = i3 + i;
            if (i4 >= i2) {
                break;
            }
            char charAt = charSequence.charAt(i3);
            if (charAt >= '') {
                break;
            }
            bArr[i4] = (byte) charAt;
            i3++;
        }
        if (i3 == length) {
            return i + length;
        }
        i += i3;
        while (i3 < length) {
            int i5;
            char charAt2 = charSequence.charAt(i3);
            if (charAt2 < '' && i < i2) {
                i5 = i + 1;
                bArr[i] = (byte) charAt2;
            } else if (charAt2 < 'ࠀ' && i <= i2 - 2) {
                i5 = i + 1;
                bArr[i] = (byte) ((charAt2 >>> 6) | 960);
                i = i5 + 1;
                bArr[i5] = (byte) ((charAt2 & 63) | 128);
                i3++;
            } else if ((charAt2 < '?' || '?' < charAt2) && i <= i2 - 3) {
                i5 = i + 1;
                bArr[i] = (byte) ((charAt2 >>> 12) | 480);
                i = i5 + 1;
                bArr[i5] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i5 = i + 1;
                bArr[i] = (byte) ((charAt2 & 63) | 128);
            } else if (i <= i2 - 4) {
                i5 = i3 + 1;
                if (i5 != charSequence.length()) {
                    char charAt3 = charSequence.charAt(i5);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        i3 = Character.toCodePoint(charAt2, charAt3);
                        i4 = i + 1;
                        bArr[i] = (byte) ((i3 >>> 18) | 240);
                        i = i4 + 1;
                        bArr[i4] = (byte) (((i3 >>> 12) & 63) | 128);
                        i4 = i + 1;
                        bArr[i] = (byte) (((i3 >>> 6) & 63) | 128);
                        i = i4 + 1;
                        bArr[i4] = (byte) ((i3 & 63) | 128);
                        i3 = i5;
                        i3++;
                    } else {
                        i3 = i5;
                    }
                }
                i3--;
                StringBuilder stringBuilder = new StringBuilder(39);
                stringBuilder.append("Unpaired surrogate at index ");
                stringBuilder.append(i3);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else {
                StringBuilder stringBuilder2 = new StringBuilder(37);
                stringBuilder2.append("Failed writing ");
                stringBuilder2.append(charAt2);
                stringBuilder2.append(" at index ");
                stringBuilder2.append(i);
                throw new ArrayIndexOutOfBoundsException(stringBuilder2.toString());
            }
            i = i5;
            i3++;
        }
        return i;
    }

    private static void zza(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        } else if (byteBuffer.hasArray()) {
            try {
                byteBuffer.position(zza(charSequence, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
            } catch (Throwable e) {
                BufferOverflowException bufferOverflowException = new BufferOverflowException();
                bufferOverflowException.initCause(e);
                throw bufferOverflowException;
            }
        } else {
            zzb(charSequence, byteBuffer);
        }
    }

    public static int zzad(int i, int i2) {
        return zzkx(i) + zzky(i2);
    }

    public static int zzb(int i, zzfhs zzfhs) {
        i = zzkx(i);
        int zzhl = zzfhs.zzhl();
        return i + (zzlz(zzhl) + zzhl);
    }

    private static void zzb(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int charAt = charSequence.charAt(i);
            if (charAt >= 128) {
                int i2;
                if (charAt < 2048) {
                    i2 = (charAt >>> 6) | 960;
                } else {
                    if (charAt >= 55296) {
                        if (57343 >= charAt) {
                            i2 = i + 1;
                            if (i2 != charSequence.length()) {
                                char charAt2 = charSequence.charAt(i2);
                                if (Character.isSurrogatePair(charAt, charAt2)) {
                                    i = Character.toCodePoint(charAt, charAt2);
                                    byteBuffer.put((byte) ((i >>> 18) | 240));
                                    byteBuffer.put((byte) (((i >>> 12) & 63) | 128));
                                    byteBuffer.put((byte) (((i >>> 6) & 63) | 128));
                                    byteBuffer.put((byte) ((i & 63) | 128));
                                    i = i2;
                                    i++;
                                } else {
                                    i = i2;
                                }
                            }
                            i--;
                            StringBuilder stringBuilder = new StringBuilder(39);
                            stringBuilder.append("Unpaired surrogate at index ");
                            stringBuilder.append(i);
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    }
                    byteBuffer.put((byte) ((charAt >>> 12) | 480));
                    i2 = ((charAt >>> 6) & 63) | 128;
                }
                byteBuffer.put((byte) i2);
                charAt = (charAt & 63) | 128;
            }
            byteBuffer.put((byte) charAt);
            i++;
        }
    }

    public static zzfhk zzbe(byte[] bArr) {
        return zzo(bArr, 0, bArr.length);
    }

    public static int zzbf(byte[] bArr) {
        return zzlz(bArr.length) + bArr.length;
    }

    public static int zzc(int i, long j) {
        return zzkx(i) + zzdh(j);
    }

    public static int zzd(int i, byte[] bArr) {
        return zzkx(i) + zzbf(bArr);
    }

    private static int zzd(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < '') {
            i2++;
        }
        int i3 = length;
        while (i2 < length) {
            StringBuilder stringBuilder;
            char charAt = charSequence.charAt(i2);
            if (charAt < 'ࠀ') {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 'ࠀ') {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if ('?' <= charAt2 && charAt2 <= '?') {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                stringBuilder = new StringBuilder(39);
                                stringBuilder.append("Unpaired surrogate at index ");
                                stringBuilder.append(i2);
                                throw new IllegalArgumentException(stringBuilder.toString());
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
                if (i3 < length) {
                    return i3;
                }
                long j = ((long) i3) + 4294967296L;
                stringBuilder = new StringBuilder(54);
                stringBuilder.append("UTF-8 length does not fit in int: ");
                stringBuilder.append(j);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        if (i3 < length) {
            return i3;
        }
        long j2 = ((long) i3) + 4294967296L;
        stringBuilder = new StringBuilder(54);
        stringBuilder.append("UTF-8 length does not fit in int: ");
        stringBuilder.append(j2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private static long zzda(long j) {
        return (j << 1) ^ (j >> 63);
    }

    private final void zzdg(long j) throws IOException {
        while ((j & -128) != 0) {
            zzlx((((int) j) & 127) | 128);
            j >>>= 7;
        }
        zzlx((int) j);
    }

    public static int zzdh(long j) {
        return (j & -128) == 0 ? 1 : (j & -16384) == 0 ? 2 : (j & -2097152) == 0 ? 3 : (j & -268435456) == 0 ? 4 : (j & -34359738368L) == 0 ? 5 : (j & -4398046511104L) == 0 ? 6 : (j & -562949953421312L) == 0 ? 7 : (j & -72057594037927936L) == 0 ? 8 : (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    private final void zzdi(long j) throws IOException {
        if (this.zzphl.remaining() < 8) {
            throw new zzfhl(this.zzphl.position(), this.zzphl.limit());
        }
        this.zzphl.putLong(j);
    }

    public static int zzh(int i, long j) {
        return zzkx(i) + zzdh(zzda(j));
    }

    public static int zzkx(int i) {
        return zzlz(i << 3);
    }

    public static int zzky(int i) {
        return i >= 0 ? zzlz(i) : 10;
    }

    public static int zzlf(int i) {
        return (i >> 31) ^ (i << 1);
    }

    private final void zzlx(int i) throws IOException {
        byte b = (byte) i;
        if (this.zzphl.hasRemaining()) {
            this.zzphl.put(b);
            return;
        }
        throw new zzfhl(this.zzphl.position(), this.zzphl.limit());
    }

    public static int zzlz(int i) {
        return (i & -128) == 0 ? 1 : (i & -16384) == 0 ? 2 : (-2097152 & i) == 0 ? 3 : (i & -268435456) == 0 ? 4 : 5;
    }

    public static int zzo(int i, String str) {
        return zzkx(i) + zzte(str);
    }

    public static zzfhk zzo(byte[] bArr, int i, int i2) {
        return new zzfhk(bArr, 0, i2);
    }

    public static int zzte(String str) {
        int zzd = zzd(str);
        return zzlz(zzd) + zzd;
    }

    public final void zza(int i, double d) throws IOException {
        zzz(i, 1);
        zzdi(Double.doubleToLongBits(d));
    }

    public final void zza(int i, long j) throws IOException {
        zzz(i, 0);
        zzdg(j);
    }

    public final void zza(int i, zzfhs zzfhs) throws IOException {
        zzz(i, 2);
        zzb(zzfhs);
    }

    public final void zzaa(int i, int i2) throws IOException {
        zzz(i, 0);
        if (i2 >= 0) {
            zzly(i2);
        } else {
            zzdg((long) i2);
        }
    }

    public final void zzb(int i, long j) throws IOException {
        zzz(i, 1);
        zzdi(j);
    }

    public final void zzb(zzfhs zzfhs) throws IOException {
        zzly(zzfhs.zzcxm());
        zzfhs.zza(this);
    }

    public final void zzbg(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this.zzphl.remaining() >= length) {
            this.zzphl.put(bArr, 0, length);
            return;
        }
        throw new zzfhl(this.zzphl.position(), this.zzphl.limit());
    }

    public final void zzc(int i, float f) throws IOException {
        zzz(i, 5);
        i = Float.floatToIntBits(f);
        if (this.zzphl.remaining() < 4) {
            throw new zzfhl(this.zzphl.position(), this.zzphl.limit());
        }
        this.zzphl.putInt(i);
    }

    public final void zzc(int i, byte[] bArr) throws IOException {
        zzz(i, 2);
        zzly(bArr.length);
        zzbg(bArr);
    }

    public final void zzcut() {
        if (this.zzphl.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", new Object[]{Integer.valueOf(this.zzphl.remaining())}));
        }
    }

    public final void zzf(int i, long j) throws IOException {
        zzz(i, 0);
        zzdg(j);
    }

    public final void zzg(int i, long j) throws IOException {
        zzz(i, 0);
        zzdg(zzda(j));
    }

    public final void zzl(int i, boolean z) throws IOException {
        zzz(i, 0);
        byte b = (byte) z;
        if (this.zzphl.hasRemaining()) {
            this.zzphl.put(b);
            return;
        }
        throw new zzfhl(this.zzphl.position(), this.zzphl.limit());
    }

    public final void zzly(int i) throws IOException {
        while ((i & -128) != 0) {
            zzlx((i & 127) | 128);
            i >>>= 7;
        }
        zzlx(i);
    }

    public final void zzn(int i, String str) throws IOException {
        zzz(i, 2);
        try {
            i = zzlz(str.length());
            if (i == zzlz(str.length() * 3)) {
                int position = this.zzphl.position();
                if (this.zzphl.remaining() < i) {
                    throw new zzfhl(position + i, this.zzphl.limit());
                }
                this.zzphl.position(position + i);
                zza((CharSequence) str, this.zzphl);
                int position2 = this.zzphl.position();
                this.zzphl.position(position);
                zzly((position2 - position) - i);
                this.zzphl.position(position2);
                return;
            }
            zzly(zzd(str));
            zza((CharSequence) str, this.zzphl);
        } catch (Throwable e) {
            zzfhl zzfhl = new zzfhl(this.zzphl.position(), this.zzphl.limit());
            zzfhl.initCause(e);
            throw zzfhl;
        }
    }

    public final void zzz(int i, int i2) throws IOException {
        zzly((i << 3) | i2);
    }
}
