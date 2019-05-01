package com.google.android.gms.internal;

import android.content.Context;
import android.os.SystemClock;

@zzzb
public abstract class zzxb extends zzafh {
    protected final Context mContext;
    protected final Object mLock = new Object();
    protected final zzxg zzchu;
    protected final zzaev zzchv;
    protected zzaad zzchw;
    protected final Object zzchy = new Object();

    protected zzxb(Context context, zzaev zzaev, zzxg zzxg) {
        super(true);
        this.mContext = context;
        this.zzchv = zzaev;
        this.zzchw = zzaev.zzcwe;
        this.zzchu = zzxg;
    }

    public void onStop() {
    }

    protected abstract void zzd(long j) throws zzxe;

    public final void zzdg() {
        int errorCode;
        synchronized (this.mLock) {
            zzaiw.zzbw("AdRendererBackgroundTask started.");
            int i = this.zzchv.errorCode;
            try {
                zzd(SystemClock.elapsedRealtime());
            } catch (zzxe e) {
                errorCode = e.getErrorCode();
                if (errorCode != 3) {
                    if (errorCode != -1) {
                        zzaiw.zzco(e.getMessage());
                        this.zzchw = this.zzchw != null ? new zzaad(errorCode) : new zzaad(errorCode, this.zzchw.zzccb);
                        zzagr.zzczc.post(new zzxc(this));
                        i = errorCode;
                    }
                }
                zzaiw.zzcn(e.getMessage());
                if (this.zzchw != null) {
                }
                this.zzchw = this.zzchw != null ? new zzaad(errorCode) : new zzaad(errorCode, this.zzchw.zzccb);
                zzagr.zzczc.post(new zzxc(this));
                i = errorCode;
            }
            zzagr.zzczc.post(new zzxd(this, zzy(i)));
        }
    }

    protected abstract zzaeu zzy(int i);
}
