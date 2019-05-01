package com.google.android.gms.internal;

import android.support.v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

@zzzb
public final class zzhe extends zzgz {
    private MessageDigest zzazp;

    public final byte[] zzx(String str) {
        byte[] array;
        String[] split = str.split(" ");
        int i = 4;
        if (split.length == 1) {
            int zzz = zzhd.zzz(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(zzz);
            array = allocate.array();
        } else if (split.length < 5) {
            array = new byte[(split.length << 1)];
            for (r4 = 0; r4 < split.length; r4++) {
                int zzz2 = zzhd.zzz(split[r4]);
                zzz2 = (zzz2 >> 16) ^ (SupportMenu.USER_MASK & zzz2);
                byte[] bArr = new byte[]{(byte) zzz2, (byte) (zzz2 >> 8)};
                zzz2 = r4 << 1;
                array[zzz2] = bArr[0];
                array[zzz2 + 1] = bArr[1];
            }
        } else {
            array = new byte[split.length];
            for (int i2 = 0; i2 < split.length; i2++) {
                r4 = zzhd.zzz(split[i2]);
                array[i2] = (byte) ((r4 >> 24) ^ (((r4 & 255) ^ ((r4 >> 8) & 255)) ^ ((r4 >> 16) & 255)));
            }
        }
        this.zzazp = zzha();
        synchronized (this.mLock) {
            if (this.zzazp == null) {
                array = new byte[0];
                return array;
            }
            this.zzazp.reset();
            this.zzazp.update(array);
            Object digest = this.zzazp.digest();
            if (digest.length <= 4) {
                i = digest.length;
            }
            Object obj = new byte[i];
            System.arraycopy(digest, 0, obj, 0, obj.length);
            return obj;
        }
    }
}
