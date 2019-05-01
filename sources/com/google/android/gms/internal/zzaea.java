package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbs;
import java.util.Map;

final class zzaea implements Runnable {
    private /* synthetic */ zzady zzcut;
    private /* synthetic */ zzajp zzcuu;

    zzaea(zzady zzady, zzajp zzajp) {
        this.zzcut = zzady;
        this.zzcuu = zzajp;
    }

    public final void run() {
        try {
            this.zzcut.zzo((Map) this.zzcuu.get());
            if (this.zzcut.zzcuo) {
                synchronized (this.zzcut.mLock) {
                    this.zzcut.zzcul.zzpig = Integer.valueOf(9);
                }
            }
            this.zzcut.send();
        } catch (Throwable e) {
            String str = "Failed to get SafeBrowsing metadata";
            if (((Boolean) zzbs.zzep().zzd(zzmq.zzbog)).booleanValue()) {
                zzaiw.zza(str, e);
            }
        }
    }
}
