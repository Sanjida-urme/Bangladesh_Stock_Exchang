package com.google.android.gms.internal;

import java.lang.reflect.InvocationTargetException;

public final class zzdq extends zzec {
    private long zzajq = -1;

    public zzdq(zzda zzda, String str, String str2, zzaw zzaw, int i, int i2) {
        super(zzda, str, str2, zzaw, i, 12);
    }

    protected final void zzat() throws IllegalAccessException, InvocationTargetException {
        this.zzajo.zzdf = Long.valueOf(-1);
        this.zzajo.zzdf = (Long) this.zzajx.invoke(null, new Object[]{this.zzagk.getContext()});
    }
}
