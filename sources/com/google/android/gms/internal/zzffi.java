package com.google.android.gms.internal;

import java.util.Map.Entry;

final class zzffi<K> implements Entry<K, Object> {
    private Entry<K, zzffg> zzpdj;

    private zzffi(Entry<K, zzffg> entry) {
        this.zzpdj = entry;
    }

    public final K getKey() {
        return this.zzpdj.getKey();
    }

    public final Object getValue() {
        return ((zzffg) this.zzpdj.getValue()) == null ? null : zzffg.zzcwb();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof zzffq) {
            return ((zzffg) this.zzpdj.getValue()).zzj((zzffq) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
