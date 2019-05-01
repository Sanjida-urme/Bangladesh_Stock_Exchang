package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbs;
import java.lang.reflect.InvocationTargetException;

public final class zzdk extends zzec {
    public zzdk(zzda zzda, String str, String str2, zzaw zzaw, int i, int i2) {
        super(zzda, str, str2, zzaw, i, 5);
    }

    protected final void zzat() throws IllegalAccessException, InvocationTargetException {
        this.zzajo.zzcy = Long.valueOf(-1);
        this.zzajo.zzcz = Long.valueOf(-1);
        int[] iArr = (int[]) this.zzajx.invoke(null, new Object[]{this.zzagk.getContext()});
        synchronized (this.zzajo) {
            this.zzajo.zzcy = Long.valueOf((long) iArr[0]);
            this.zzajo.zzcz = Long.valueOf((long) iArr[1]);
            if (((Boolean) zzbs.zzep().zzd(zzmq.zzblw)).booleanValue() && iArr[2] != Integer.MIN_VALUE) {
                this.zzajo.zzeq = Long.valueOf((long) iArr[2]);
            }
        }
    }
}
