package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.Stack;

final class zzffz {
    private final Stack<zzfdp> zzpea;

    private zzffz() {
        this.zzpea = new Stack();
    }

    private final void zzao(zzfdp zzfdp) {
        while (!zzfdp.zzcto()) {
            if (zzfdp instanceof zzffx) {
                zzffx zzffx = (zzffx) zzfdp;
                zzao(zzffx.zzpdw);
                zzfdp = zzffx.zzpdx;
            } else {
                String valueOf = String.valueOf(zzfdp.getClass());
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 49);
                stringBuilder.append("Has a new type of ByteString been created? Found ");
                stringBuilder.append(valueOf);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        int zzlp = zzlp(zzfdp.size());
        int i = zzffx.zzpdu[zzlp + 1];
        if (!this.zzpea.isEmpty()) {
            if (((zzfdp) this.zzpea.peek()).size() < i) {
                zzlp = zzffx.zzpdu[zzlp];
                zzfdp zzfdp2 = (zzfdp) this.zzpea.pop();
                while (!this.zzpea.isEmpty() && ((zzfdp) this.zzpea.peek()).size() < zzlp) {
                    zzfdp2 = new zzffx((zzfdp) this.zzpea.pop(), zzfdp2);
                }
                zzfdp zzffx2 = new zzffx(zzfdp2, zzfdp);
                while (!this.zzpea.isEmpty()) {
                    if (((zzfdp) this.zzpea.peek()).size() >= zzffx.zzpdu[zzlp(zzffx2.size()) + 1]) {
                        break;
                    }
                    zzffx2 = new zzffx((zzfdp) this.zzpea.pop(), zzffx2);
                }
                this.zzpea.push(zzffx2);
                return;
            }
        }
        this.zzpea.push(zzfdp);
    }

    private final zzfdp zzc(zzfdp zzfdp, zzfdp zzfdp2) {
        zzao(zzfdp);
        zzao(zzfdp2);
        zzfdp = (zzfdp) this.zzpea.pop();
        while (!this.zzpea.isEmpty()) {
            zzfdp = new zzffx((zzfdp) this.zzpea.pop(), zzfdp);
        }
        return zzfdp;
    }

    private static int zzlp(int i) {
        i = Arrays.binarySearch(zzffx.zzpdu, i);
        return i < 0 ? (-(i + 1)) - 1 : i;
    }
}
