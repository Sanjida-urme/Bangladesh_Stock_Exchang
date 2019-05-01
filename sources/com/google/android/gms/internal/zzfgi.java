package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.Map.Entry;

final class zzfgi implements Iterator<Entry<K, V>> {
    private int pos;
    private /* synthetic */ zzfgc zzper;
    private boolean zzpes;
    private Iterator<Entry<K, V>> zzpet;

    private zzfgi(zzfgc zzfgc) {
        this.zzper = zzfgc;
        this.pos = -1;
    }

    private final Iterator<Entry<K, V>> zzcwq() {
        if (this.zzpet == null) {
            this.zzpet = this.zzper.zzpel.entrySet().iterator();
        }
        return this.zzpet;
    }

    public final boolean hasNext() {
        return this.pos + 1 < this.zzper.zzpek.size() || zzcwq().hasNext();
    }

    public final /* synthetic */ Object next() {
        this.zzpes = true;
        int i = this.pos + 1;
        this.pos = i;
        return (Entry) (i < this.zzper.zzpek.size() ? this.zzper.zzpek.get(this.pos) : zzcwq().next());
    }

    public final void remove() {
        if (this.zzpes) {
            this.zzpes = false;
            this.zzper.zzcwm();
            if (this.pos < this.zzper.zzpek.size()) {
                zzfgc zzfgc = this.zzper;
                int i = this.pos;
                this.pos = i - 1;
                zzfgc.zzls(i);
                return;
            }
            zzcwq().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
