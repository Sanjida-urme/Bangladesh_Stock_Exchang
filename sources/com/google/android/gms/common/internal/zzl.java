package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

public final class zzl implements ServiceConnection {
    private /* synthetic */ zzd zzfwq;
    private final int zzfwt;

    public zzl(zzd zzd, int i) {
        this.zzfwq = zzd;
        this.zzfwt = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.zzfwq.zzcg(16);
            return;
        }
        synchronized (this.zzfwq.zzfwa) {
            zzay zzay;
            zzd zzd = this.zzfwq;
            if (iBinder == null) {
                zzay = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                zzay = (queryLocalInterface == null || !(queryLocalInterface instanceof zzay)) ? new zzaz(iBinder) : (zzay) queryLocalInterface;
            }
            zzd.zzfwb = zzay;
        }
        this.zzfwq.zza(0, null, this.zzfwt);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.zzfwq.zzfwa) {
            this.zzfwq.zzfwb = null;
        }
        this.zzfwq.mHandler.sendMessage(this.zzfwq.mHandler.obtainMessage(6, this.zzfwt, 1));
    }
}
