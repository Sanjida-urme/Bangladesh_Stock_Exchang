package com.google.android.gms.internal;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public final class zzdt extends zzec {
    private List<Long> zzajr = null;

    public zzdt(zzda zzda, String str, String str2, zzaw zzaw, int i, int i2) {
        super(zzda, str, str2, zzaw, i, 31);
    }

    protected final void zzat() throws IllegalAccessException, InvocationTargetException {
        this.zzajo.zzdr = Long.valueOf(-1);
        this.zzajo.zzds = Long.valueOf(-1);
        if (this.zzajr == null) {
            this.zzajr = (List) this.zzajx.invoke(null, new Object[]{this.zzagk.getContext()});
        }
        if (this.zzajr != null && this.zzajr.size() == 2) {
            synchronized (this.zzajo) {
                this.zzajo.zzdr = Long.valueOf(((Long) this.zzajr.get(0)).longValue());
                this.zzajo.zzds = Long.valueOf(((Long) this.zzajr.get(1)).longValue());
            }
        }
    }
}
