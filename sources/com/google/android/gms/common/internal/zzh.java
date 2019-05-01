package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

final class zzh extends Handler {
    private /* synthetic */ zzd zzfwq;

    public zzh(zzd zzd, Looper looper) {
        this.zzfwq = zzd;
        super(looper);
    }

    private static void zza(Message message) {
        ((zzi) message.obj).unregister();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean zzb(android.os.Message r3) {
        /*
        r0 = r3.what;
        r1 = 1;
        r2 = 2;
        if (r0 == r2) goto L_0x0012;
    L_0x0006:
        r0 = r3.what;
        if (r0 == r1) goto L_0x0012;
    L_0x000a:
        r3 = r3.what;
        r0 = 7;
        if (r3 != r0) goto L_0x0010;
    L_0x000f:
        return r1;
    L_0x0010:
        r3 = 0;
        return r3;
    L_0x0012:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzh.zzb(android.os.Message):boolean");
    }

    public final void handleMessage(Message message) {
        if (this.zzfwq.zzfwn.get() != message.arg1) {
            if (zzb(message)) {
                zza(message);
            }
        } else if ((message.what == 1 || message.what == 7 || message.what == 4 || message.what == 5) && !this.zzfwq.isConnecting()) {
            zza(message);
        } else {
            PendingIntent pendingIntent = null;
            ConnectionResult zzd;
            if (message.what == 4) {
                this.zzfwq.zzfwl = new ConnectionResult(message.arg2);
                if (!this.zzfwq.zzakf() || this.zzfwq.zzfwm) {
                    zzd = this.zzfwq.zzfwl != null ? this.zzfwq.zzfwl : new ConnectionResult(8);
                    this.zzfwq.zzfwc.zzf(zzd);
                    this.zzfwq.onConnectionFailed(zzd);
                    return;
                }
                this.zzfwq.zza(3, null);
            } else if (message.what == 5) {
                zzd = this.zzfwq.zzfwl != null ? this.zzfwq.zzfwl : new ConnectionResult(8);
                this.zzfwq.zzfwc.zzf(zzd);
                this.zzfwq.onConnectionFailed(zzd);
            } else if (message.what == 3) {
                if (message.obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) message.obj;
                }
                ConnectionResult connectionResult = new ConnectionResult(message.arg2, pendingIntent);
                this.zzfwq.zzfwc.zzf(connectionResult);
                this.zzfwq.onConnectionFailed(connectionResult);
            } else if (message.what == 6) {
                this.zzfwq.zza(5, null);
                if (this.zzfwq.zzfwh != null) {
                    this.zzfwq.zzfwh.onConnectionSuspended(message.arg2);
                }
                this.zzfwq.onConnectionSuspended(message.arg2);
                this.zzfwq.zza(5, 1, null);
            } else if (message.what == 2 && !this.zzfwq.isConnected()) {
                zza(message);
            } else if (zzb(message)) {
                ((zzi) message.obj).zzakh();
            } else {
                int i = message.what;
                StringBuilder stringBuilder = new StringBuilder(45);
                stringBuilder.append("Don't know how to handle message: ");
                stringBuilder.append(i);
                Log.wtf("GmsClient", stringBuilder.toString(), new Exception());
            }
        }
    }
}
