package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

@zzzb
public final class zzahu {
    private final String[] zzdaf;
    private final double[] zzdag;
    private final double[] zzdah;
    private final int[] zzdai;
    private int zzdaj;

    private zzahu(zzahx zzahx) {
        int size = zzahx.zzdao.size();
        this.zzdaf = (String[]) zzahx.zzdan.toArray(new String[size]);
        this.zzdag = zzq(zzahx.zzdao);
        this.zzdah = zzq(zzahx.zzdap);
        this.zzdai = new int[size];
        this.zzdaj = 0;
    }

    private static double[] zzq(List<Double> list) {
        double[] dArr = new double[list.size()];
        for (int i = 0; i < dArr.length; i++) {
            dArr[i] = ((Double) list.get(i)).doubleValue();
        }
        return dArr;
    }

    public final List<zzahw> getBuckets() {
        List<zzahw> arrayList = new ArrayList(this.zzdaf.length);
        for (int i = 0; i < this.zzdaf.length; i++) {
            arrayList.add(new zzahw(this.zzdaf[i], this.zzdah[i], this.zzdag[i], ((double) this.zzdai[i]) / ((double) this.zzdaj), this.zzdai[i]));
        }
        return arrayList;
    }

    public final void zza(double d) {
        this.zzdaj++;
        int i = 0;
        while (i < this.zzdah.length) {
            if (this.zzdah[i] <= d && d < this.zzdag[i]) {
                int[] iArr = this.zzdai;
                iArr[i] = iArr[i] + 1;
            }
            if (d >= this.zzdah[i]) {
                i++;
            } else {
                return;
            }
        }
    }
}
