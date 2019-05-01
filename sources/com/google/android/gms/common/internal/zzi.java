package com.google.android.gms.common.internal;

import android.util.Log;

public abstract class zzi<TListener> {
    private TListener zzfsa;
    private /* synthetic */ zzd zzfwq;
    private boolean zzfwr = false;

    public zzi(zzd zzd, TListener tListener) {
        this.zzfwq = zzd;
        this.zzfsa = tListener;
    }

    public final void removeListener() {
        synchronized (this) {
            this.zzfsa = null;
        }
    }

    public final void unregister() {
        removeListener();
        synchronized (this.zzfwq.zzfwe) {
            this.zzfwq.zzfwe.remove(this);
        }
    }

    public final void zzakh() {
        synchronized (this) {
            Object obj = this.zzfsa;
            if (this.zzfwr) {
                String valueOf = String.valueOf(this);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 47);
                stringBuilder.append("Callback proxy ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" being reused. This is not safe.");
                Log.w("GmsClient", stringBuilder.toString());
            }
        }
        if (obj != null) {
            try {
                zzv(obj);
            } catch (RuntimeException e) {
                throw e;
            }
        }
        synchronized (this) {
            this.zzfwr = true;
        }
        unregister();
    }

    protected abstract void zzv(TListener tListener);
}
