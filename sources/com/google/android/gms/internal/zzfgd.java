package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

final class zzfgd extends zzfgc<FieldDescriptorType, Object> {
    zzfgd(int i) {
        super(i);
    }

    public final void zzbin() {
        if (!isImmutable()) {
            Entry zzlr;
            for (int i = 0; i < zzcwk(); i++) {
                zzlr = zzlr(i);
                if (((zzfel) zzlr.getKey()).zzcvd()) {
                    zzlr.setValue(Collections.unmodifiableList((List) zzlr.getValue()));
                }
            }
            for (Entry zzlr2 : zzcwl()) {
                if (((zzfel) zzlr2.getKey()).zzcvd()) {
                    zzlr2.setValue(Collections.unmodifiableList((List) zzlr2.getValue()));
                }
            }
        }
        super.zzbin();
    }
}
