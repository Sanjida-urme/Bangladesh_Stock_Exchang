package com.google.android.gms.internal;

import java.lang.reflect.InvocationTargetException;

public final class zzdy extends zzec {
    public zzdy(zzda zzda, String str, String str2, zzaw zzaw, int i, int i2) {
        super(zzda, str, str2, zzaw, i, 48);
    }

    protected final void zzat() throws IllegalAccessException, InvocationTargetException {
        this.zzajo.zzee = Integer.valueOf(2);
        boolean booleanValue = ((Boolean) this.zzajx.invoke(null, new Object[]{this.zzagk.getApplicationContext()})).booleanValue();
        synchronized (this.zzajo) {
            zzaw zzaw;
            Integer valueOf;
            if (booleanValue) {
                zzaw = this.zzajo;
                valueOf = Integer.valueOf(1);
            } else {
                zzaw = this.zzajo;
                valueOf = Integer.valueOf(0);
            }
            zzaw.zzee = valueOf;
        }
    }
}
