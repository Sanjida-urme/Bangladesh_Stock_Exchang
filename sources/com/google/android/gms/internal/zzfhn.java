package com.google.android.gms.internal;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public final class zzfhn<M extends zzfhm<M>, T> {
    public final int tag;
    private int type;
    protected final Class<T> zznbf;
    private zzfem<?, ?> zzpci;
    protected final boolean zzphn;

    private zzfhn(int i, Class<T> cls, int i2, boolean z) {
        this(11, cls, null, i2, false);
    }

    private zzfhn(int i, Class<T> cls, zzfem<?, ?> zzfem, int i2, boolean z) {
        this.type = i;
        this.zznbf = cls;
        this.tag = i2;
        this.zzphn = false;
        this.zzpci = null;
    }

    public static <M extends zzfhm<M>, T extends zzfhs> zzfhn<M, T> zza(int i, Class<T> cls, long j) {
        return new zzfhn(11, cls, (int) j, false);
    }

    private final Object zzan(zzfhj zzfhj) {
        String valueOf;
        Class componentType = this.zzphn ? this.zznbf.getComponentType() : this.zznbf;
        StringBuilder stringBuilder;
        try {
            zzfhs zzfhs;
            switch (this.type) {
                case 10:
                    zzfhs = (zzfhs) componentType.newInstance();
                    zzfhj.zza(zzfhs, this.tag >>> 3);
                    return zzfhs;
                case 11:
                    zzfhs = (zzfhs) componentType.newInstance();
                    zzfhj.zza(zzfhs);
                    return zzfhs;
                default:
                    int i = this.type;
                    stringBuilder = new StringBuilder(24);
                    stringBuilder.append("Unknown type ");
                    stringBuilder.append(i);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
        } catch (Throwable e) {
            valueOf = String.valueOf(componentType);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 33);
            stringBuilder.append("Error creating instance of class ");
            stringBuilder.append(valueOf);
            throw new IllegalArgumentException(stringBuilder.toString(), e);
        } catch (Throwable e2) {
            valueOf = String.valueOf(componentType);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 33);
            stringBuilder.append("Error creating instance of class ");
            stringBuilder.append(valueOf);
            throw new IllegalArgumentException(stringBuilder.toString(), e2);
        } catch (Throwable e22) {
            throw new IllegalArgumentException("Error reading extension field", e22);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfhn)) {
            return false;
        }
        zzfhn zzfhn = (zzfhn) obj;
        return this.type == zzfhn.type && this.zznbf == zzfhn.zznbf && this.tag == zzfhn.tag && this.zzphn == zzfhn.zzphn;
    }

    public final int hashCode() {
        return ((((((this.type + 1147) * 31) + this.zznbf.hashCode()) * 31) + this.tag) * 31) + this.zzphn;
    }

    protected final void zza(Object obj, zzfhk zzfhk) {
        try {
            zzfhk.zzly(this.tag);
            switch (this.type) {
                case 10:
                    int i = this.tag >>> 3;
                    ((zzfhs) obj).zza(zzfhk);
                    zzfhk.zzz(i, 4);
                    return;
                case 11:
                    zzfhk.zzb((zzfhs) obj);
                    return;
                default:
                    int i2 = this.type;
                    StringBuilder stringBuilder = new StringBuilder(24);
                    stringBuilder.append("Unknown type ");
                    stringBuilder.append(i2);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    final T zzbp(List<zzfhu> list) {
        if (list == null) {
            return null;
        }
        if (this.zzphn) {
            List arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                zzfhu zzfhu = (zzfhu) list.get(i);
                if (zzfhu.zzjkv.length != 0) {
                    arrayList.add(zzan(zzfhj.zzbd(zzfhu.zzjkv)));
                }
            }
            int size = arrayList.size();
            if (size == 0) {
                return null;
            }
            T cast = this.zznbf.cast(Array.newInstance(this.zznbf.getComponentType(), size));
            for (int i2 = 0; i2 < size; i2++) {
                Array.set(cast, i2, arrayList.get(i2));
            }
            return cast;
        } else if (list.isEmpty()) {
            return null;
        } else {
            return this.zznbf.cast(zzan(zzfhj.zzbd(((zzfhu) list.get(list.size() - 1)).zzjkv)));
        }
    }

    protected final int zzcl(Object obj) {
        int i = this.tag >>> 3;
        switch (this.type) {
            case 10:
                return (zzfhk.zzkx(i) << 1) + ((zzfhs) obj).zzhl();
            case 11:
                return zzfhk.zzb(i, (zzfhs) obj);
            default:
                i = this.type;
                StringBuilder stringBuilder = new StringBuilder(24);
                stringBuilder.append("Unknown type ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
