package com.google.android.gms.internal;

import android.provider.Settings.SettingNotFoundException;
import java.lang.reflect.InvocationTargetException;

public final class zzdh extends zzec {
    public zzdh(zzda zzda, String str, String str2, zzaw zzaw, int i, int i2) {
        super(zzda, str, str2, zzaw, i, 49);
    }

    protected final void zzat() throws IllegalAccessException, InvocationTargetException {
        this.zzajo.zzef = Integer.valueOf(2);
        try {
            boolean booleanValue = ((Boolean) this.zzajx.invoke(null, new Object[]{this.zzagk.getApplicationContext()})).booleanValue();
            this.zzajo.zzef = Integer.valueOf(booleanValue);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
