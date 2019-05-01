package com.google.android.gms.internal;

final class zztr implements Runnable {
    private /* synthetic */ zztp zzccz;
    private /* synthetic */ zztq zzcda;

    zztr(zztq zztq, zztp zztp) {
        this.zzcda = zztq;
        this.zzccz = zztp;
    }

    public final void run() {
        synchronized (this.zzcda.mLock) {
            if (this.zzcda.zzccx != -2) {
                return;
            }
            this.zzcda.zzccw = this.zzcda.zzlt();
            if (this.zzcda.zzccw == null) {
                this.zzcda.zzv(4);
            } else if (!this.zzcda.zzlu() || this.zzcda.zzw(1)) {
                this.zzccz.zza(this.zzcda);
                this.zzcda.zza(this.zzccz);
            } else {
                String zzf = this.zzcda.zzcco;
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(zzf).length() + 56);
                stringBuilder.append("Ignoring adapter ");
                stringBuilder.append(zzf);
                stringBuilder.append(" as delayed impression is not supported");
                zzaiw.zzco(stringBuilder.toString());
                this.zzcda.zzv(2);
            }
        }
    }
}
