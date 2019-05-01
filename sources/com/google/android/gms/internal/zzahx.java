package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

public final class zzahx {
    private final List<String> zzdan = new ArrayList();
    private final List<Double> zzdao = new ArrayList();
    private final List<Double> zzdap = new ArrayList();

    public final zzahx zza(String str, double d, double d2) {
        int i = 0;
        while (i < this.zzdan.size()) {
            double doubleValue = ((Double) this.zzdap.get(i)).doubleValue();
            double doubleValue2 = ((Double) this.zzdao.get(i)).doubleValue();
            if (d < doubleValue || (doubleValue == d && d2 < doubleValue2)) {
                break;
            }
            i++;
        }
        this.zzdan.add(i, str);
        this.zzdap.add(i, Double.valueOf(d));
        this.zzdao.add(i, Double.valueOf(d2));
        return this;
    }

    public final zzahu zzql() {
        return new zzahu();
    }
}
