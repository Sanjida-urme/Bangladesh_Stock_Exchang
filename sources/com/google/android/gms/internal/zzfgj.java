package com.google.android.gms.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

final class zzfgj extends AbstractSet<Entry<K, V>> {
    private /* synthetic */ zzfgc zzper;

    private zzfgj(zzfgc zzfgc) {
        this.zzper = zzfgc;
    }

    public final /* synthetic */ boolean add(Object obj) {
        Entry entry = (Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.zzper.zza((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.zzper.clear();
    }

    public final boolean contains(Object obj) {
        Entry entry = (Entry) obj;
        Object obj2 = this.zzper.get(entry.getKey());
        obj = entry.getValue();
        if (obj2 != obj) {
            if (obj2 == null || !obj2.equals(obj)) {
                return false;
            }
        }
        return true;
    }

    public final Iterator<Entry<K, V>> iterator() {
        return new zzfgi(this.zzper, null);
    }

    public final boolean remove(Object obj) {
        Entry entry = (Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.zzper.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.zzper.size();
    }
}
