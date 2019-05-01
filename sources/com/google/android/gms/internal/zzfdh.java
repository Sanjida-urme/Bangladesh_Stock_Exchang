package com.google.android.gms.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

public abstract class zzfdh<MessageType extends zzfdh<MessageType, BuilderType>, BuilderType extends zzfdi<MessageType, BuilderType>> implements zzffq {
    private static boolean zzpau = false;
    protected int zzpat = 0;

    protected static <T> void zza(Iterable<T> iterable, List<? super T> list) {
        zzfdi.zza((Iterable) iterable, (List) list);
    }

    public final byte[] toByteArray() {
        try {
            byte[] bArr = new byte[zzhl()];
            zzfed zzbb = zzfed.zzbb(bArr);
            zza(zzbb);
            zzbb.zzcut();
            return bArr;
        } catch (Throwable e) {
            String str = "byte array";
            String name = getClass().getName();
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(name).length() + 62) + String.valueOf(str).length());
            stringBuilder.append("Serializing ");
            stringBuilder.append(name);
            stringBuilder.append(" to a ");
            stringBuilder.append(str);
            stringBuilder.append(" threw an IOException (should never happen).");
            throw new RuntimeException(stringBuilder.toString(), e);
        }
    }

    public final zzfdp toByteString() {
        try {
            zzfdu zzkf = zzfdp.zzkf(zzhl());
            zza(zzkf.zzcts());
            return zzkf.zzctr();
        } catch (Throwable e) {
            String str = "ByteString";
            String name = getClass().getName();
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(name).length() + 62) + String.valueOf(str).length());
            stringBuilder.append("Serializing ");
            stringBuilder.append(name);
            stringBuilder.append(" to a ");
            stringBuilder.append(str);
            stringBuilder.append(" threw an IOException (should never happen).");
            throw new RuntimeException(stringBuilder.toString(), e);
        }
    }

    public final void writeTo(OutputStream outputStream) throws IOException {
        zzfed zzb = zzfed.zzb(outputStream, zzfed.zzks(zzhl()));
        zza(zzb);
        zzb.flush();
    }
}
