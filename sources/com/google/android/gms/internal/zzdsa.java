package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public abstract class zzdsa implements zzdtb {
    private static final byte[] zzlup = new byte[16];
    static final int[] zzluq = zza(ByteBuffer.wrap(new byte[]{(byte) 101, (byte) 120, (byte) 112, (byte) 97, (byte) 110, (byte) 100, (byte) 32, (byte) 51, (byte) 50, (byte) 45, (byte) 98, (byte) 121, (byte) 116, (byte) 101, (byte) 32, (byte) 107}));
    final zzdta zzlur;

    zzdsa(byte[] bArr) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        this.zzlur = zzdta.zzak(bArr);
    }

    static int rotateLeft(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    private static void zza(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, zzdse zzdse) {
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        while (byteBuffer2.hasRemaining()) {
            int remaining = byteBuffer2.remaining() < 64 ? byteBuffer2.remaining() : 64;
            order.asIntBuffer().put(zzdse.zzbot());
            for (int i = 0; i < remaining; i++) {
                byteBuffer.put((byte) (byteBuffer2.get() ^ order.get(i)));
            }
        }
    }

    static int[] zza(ByteBuffer byteBuffer) {
        IntBuffer asIntBuffer = byteBuffer.order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    static zzdsa zzah(byte[] bArr) {
        return new zzdsc(bArr, null);
    }

    final void zza(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException {
        if (bArr.length > 2147483635) {
            throw new GeneralSecurityException("plaintext too long");
        } else if (byteBuffer.remaining() < bArr.length + 12) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        } else {
            byte[] zzgc = zzdtd.zzgc(12);
            byteBuffer.put(zzgc);
            zza(byteBuffer, ByteBuffer.wrap(bArr), zzai(zzgc));
        }
    }

    public final byte[] zzaf(byte[] bArr) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 12);
        zza(allocate, bArr);
        return allocate.array();
    }

    abstract zzdse zzai(byte[] bArr);

    abstract int zzbos();

    abstract int[] zzd(byte[] bArr, int i);

    final int[] zzf(int[] iArr) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        zzg(copyOf);
        for (int i = 0; i < iArr.length; i++) {
            copyOf[i] = copyOf[i] + iArr[i];
        }
        return copyOf;
    }

    abstract void zzg(int[] iArr);

    abstract void zzh(int[] iArr);
}
