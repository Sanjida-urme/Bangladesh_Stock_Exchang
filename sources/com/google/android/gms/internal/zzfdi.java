package com.google.android.gms.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class zzfdi<MessageType extends zzfdh<MessageType, BuilderType>, BuilderType extends zzfdi<MessageType, BuilderType>> implements zzffr {
    protected static <T> void zza(Iterable<T> iterable, List<? super T> list) {
        zzfez.checkNotNull(iterable);
        if (iterable instanceof zzffl) {
            List zzcwc = ((zzffl) iterable).zzcwc();
            zzffl zzffl = (zzffl) list;
            int size = list.size();
            for (Object next : zzcwc) {
                if (next == null) {
                    int size2 = zzffl.size() - size;
                    StringBuilder stringBuilder = new StringBuilder(37);
                    stringBuilder.append("Element at index ");
                    stringBuilder.append(size2);
                    stringBuilder.append(" is null.");
                    String stringBuilder2 = stringBuilder.toString();
                    for (int size3 = zzffl.size() - 1; size3 >= size; size3--) {
                        zzffl.remove(size3);
                    }
                    throw new NullPointerException(stringBuilder2);
                } else if (!(next instanceof zzfdp)) {
                    zzffl.add((String) next);
                }
            }
        } else if (iterable instanceof zzffv) {
            list.addAll((Collection) iterable);
        } else {
            zzb((Iterable) iterable, (List) list);
        }
    }

    private static <T> void zzb(Iterable<T> iterable, List<? super T> list) {
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
        }
        int size = list.size();
        for (Object next : iterable) {
            if (next == null) {
                int size2 = list.size() - size;
                StringBuilder stringBuilder = new StringBuilder(37);
                stringBuilder.append("Element at index ");
                stringBuilder.append(size2);
                stringBuilder.append(" is null.");
                String stringBuilder2 = stringBuilder.toString();
                for (int size3 = list.size() - 1; size3 >= size; size3--) {
                    list.remove(size3);
                }
                throw new NullPointerException(stringBuilder2);
            }
            list.add(next);
        }
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return zzcth();
    }

    protected abstract BuilderType zza(MessageType messageType);

    public abstract BuilderType zza(zzfdy zzfdy, zzfei zzfei) throws IOException;

    public /* synthetic */ zzffr zzb(zzfdy zzfdy, zzfei zzfei) throws IOException {
        return zza(zzfdy, zzfei);
    }

    public final /* synthetic */ zzffr zzc(zzffq zzffq) {
        if (zzcvi().getClass().isInstance(zzffq)) {
            return zza((zzfdh) zzffq);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public abstract BuilderType zzcth();
}
