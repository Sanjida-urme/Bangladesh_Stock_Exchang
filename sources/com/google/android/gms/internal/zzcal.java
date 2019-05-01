package com.google.android.gms.internal;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzg;

public final class zzcal extends zzd<zzcaq> {
    public zzcal(Context context, Looper looper, zzf zzf, zzg zzg) {
        super(context, looper, 116, zzf, zzg, null);
    }

    public final zzcaq zzauf() throws DeadObjectException {
        return (zzcaq) super.zzakc();
    }

    protected final /* synthetic */ IInterface zzd(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return queryLocalInterface instanceof zzcaq ? (zzcaq) queryLocalInterface : new zzcar(iBinder);
    }

    protected final String zzhf() {
        return "com.google.android.gms.gass.START";
    }

    protected final String zzhg() {
        return "com.google.android.gms.gass.internal.IGassService";
    }
}
