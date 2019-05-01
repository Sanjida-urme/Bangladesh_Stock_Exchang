package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.Map.Entry;

final class zzffj<K> implements Iterator<Entry<K, Object>> {
    private Iterator<Entry<K, Object>> zzmhv;

    public zzffj(Iterator<Entry<K, Object>> it) {
        this.zzmhv = it;
    }

    public final boolean hasNext() {
        return this.zzmhv.hasNext();
    }

    public final /* synthetic */ Object next() {
        Entry entry = (Entry) this.zzmhv.next();
        return entry.getValue() instanceof zzffg ? new zzffi(entry) : entry;
    }

    public final void remove() {
        this.zzmhv.remove();
    }
}
