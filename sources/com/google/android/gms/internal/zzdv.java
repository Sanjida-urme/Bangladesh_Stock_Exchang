package com.google.android.gms.internal;

import java.lang.reflect.InvocationTargetException;

public final class zzdv extends zzec {
    private final StackTraceElement[] zzajs;

    public zzdv(zzda zzda, String str, String str2, zzaw zzaw, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(zzda, str, str2, zzaw, i, 45);
        this.zzajs = stackTraceElementArr;
    }

    protected final void zzat() throws IllegalAccessException, InvocationTargetException {
        if (this.zzajs != null) {
            zzcy zzcy = new zzcy((String) this.zzajx.invoke(null, new Object[]{this.zzajs}));
            synchronized (this.zzajo) {
                this.zzajo.zzed = zzcy.zzaia;
                if (zzcy.zzaib.booleanValue()) {
                    this.zzajo.zzel = Integer.valueOf(zzcy.zzaic.booleanValue() ^ 1);
                }
            }
        }
    }
}
