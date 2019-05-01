package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class zzffp<K, V> extends LinkedHashMap<K, V> {
    private static final zzffp zzpdr;
    private boolean zzpav = true;

    static {
        zzffp zzffp = new zzffp();
        zzpdr = zzffp;
        zzffp.zzpav = false;
    }

    private zzffp() {
    }

    private zzffp(Map<K, V> map) {
        super(map);
    }

    private static int zzck(Object obj) {
        if (obj instanceof byte[]) {
            return zzfez.hashCode((byte[]) obj);
        }
        if (!(obj instanceof zzffa)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public static <K, V> zzffp<K, V> zzcwd() {
        return zzpdr;
    }

    private final void zzcwf() {
        if (!this.zzpav) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        zzcwf();
        super.clear();
    }

    public final Set<Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Map) {
            obj = (Map) obj;
            if (this != obj) {
                if (size() == obj.size()) {
                    for (Entry entry : entrySet()) {
                        if (obj.containsKey(entry.getKey())) {
                            boolean equals;
                            Object value = entry.getValue();
                            Object obj2 = obj.get(entry.getKey());
                            if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                                equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                                continue;
                            } else {
                                equals = value.equals(obj2);
                                continue;
                            }
                            if (!equals) {
                            }
                        }
                    }
                }
                obj = null;
                if (obj != null) {
                }
            }
            obj = 1;
            return obj != null;
        }
    }

    public final int hashCode() {
        int i = 0;
        for (Entry entry : entrySet()) {
            i += zzck(entry.getValue()) ^ zzck(entry.getKey());
        }
        return i;
    }

    public final boolean isMutable() {
        return this.zzpav;
    }

    public final V put(K k, V v) {
        zzcwf();
        zzfez.checkNotNull(k);
        zzfez.checkNotNull(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        zzcwf();
        for (Object next : map.keySet()) {
            zzfez.checkNotNull(next);
            zzfez.checkNotNull(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        zzcwf();
        return super.remove(obj);
    }

    public final void zza(zzffp<K, V> zzffp) {
        zzcwf();
        if (!zzffp.isEmpty()) {
            putAll(zzffp);
        }
    }

    public final void zzbin() {
        this.zzpav = false;
    }

    public final zzffp<K, V> zzcwe() {
        return isEmpty() ? new zzffp() : new zzffp(this);
    }
}
