package com.google.android.gms.internal;

import java.lang.reflect.InvocationTargetException;

public final class zzdp extends zzec {
    private static final Object zzajl = new Object();
    private static volatile Long zzajp;

    public zzdp(zzda zzda, String str, String str2, zzaw zzaw, int i, int i2) {
        super(zzda, str, str2, zzaw, i, 22);
    }

    protected final void zzat() throws IllegalAccessException, InvocationTargetException {
        if (zzajp == null) {
            synchronized (zzajl) {
                if (zzajp == null) {
                    zzajp = (Long) this.zzajx.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zzajo) {
            this.zzajo.zzdo = zzajp;
        }
    }
}
