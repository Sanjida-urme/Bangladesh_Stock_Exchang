package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

final class zzfga implements Iterator<zzfdv> {
    private final Stack<zzffx> zzpeb;
    private zzfdv zzpec;

    private zzfga(zzfdp zzfdp) {
        this.zzpeb = new Stack();
        this.zzpec = zzap(zzfdp);
    }

    private final zzfdv zzap(zzfdp zzfdp) {
        while (zzfdp instanceof zzffx) {
            zzffx zzffx = (zzffx) zzfdp;
            this.zzpeb.push(zzffx);
            zzfdp = zzffx.zzpdw;
        }
        return (zzfdv) zzfdp;
    }

    private final zzfdv zzcwi() {
        while (!this.zzpeb.isEmpty()) {
            zzfdp zzap = zzap(((zzffx) this.zzpeb.pop()).zzpdx);
            if (!zzap.isEmpty()) {
                return zzap;
            }
        }
        return null;
    }

    public final boolean hasNext() {
        return this.zzpec != null;
    }

    public final /* synthetic */ Object next() {
        if (this.zzpec == null) {
            throw new NoSuchElementException();
        }
        zzfdv zzfdv = this.zzpec;
        this.zzpec = zzcwi();
        return zzfdv;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
