package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.List;

public final class zzbi {
    private final Object zzdbh;
    private final List<String> zzfyu;

    private zzbi(Object obj) {
        this.zzdbh = zzbq.checkNotNull(obj);
        this.zzfyu = new ArrayList();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(100);
        stringBuilder.append(this.zzdbh.getClass().getSimpleName());
        stringBuilder.append('{');
        int size = this.zzfyu.size();
        for (int i = 0; i < size; i++) {
            stringBuilder.append((String) this.zzfyu.get(i));
            if (i < size - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final zzbi zzg(String str, Object obj) {
        List list = this.zzfyu;
        str = (String) zzbq.checkNotNull(str);
        String valueOf = String.valueOf(obj);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(valueOf).length());
        stringBuilder.append(str);
        stringBuilder.append("=");
        stringBuilder.append(valueOf);
        list.add(stringBuilder.toString());
        return this;
    }
}
