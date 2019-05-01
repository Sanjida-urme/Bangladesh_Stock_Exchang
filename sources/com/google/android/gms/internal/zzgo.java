package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.zzbs;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@zzzb
public final class zzgo {
    private final Object mLock = new Object();
    private int zzaxx;
    private List<zzgn> zzaxy = new LinkedList();

    public final boolean zza(zzgn zzgn) {
        synchronized (this.mLock) {
            if (this.zzaxy.contains(zzgn)) {
                return true;
            }
            return false;
        }
    }

    public final boolean zzb(zzgn zzgn) {
        synchronized (this.mLock) {
            Iterator it = this.zzaxy.iterator();
            while (it.hasNext()) {
                zzgn zzgn2 = (zzgn) it.next();
                if (!((Boolean) zzbs.zzep().zzd(zzmq.zzbig)).booleanValue() || zzbs.zzeg().zzos()) {
                    if (((Boolean) zzbs.zzep().zzd(zzmq.zzbii)).booleanValue() && !zzbs.zzeg().zzot() && zzgn != zzgn2 && zzgn2.zzgj().equals(zzgn.zzgj())) {
                        it.remove();
                        return true;
                    }
                } else if (zzgn != zzgn2 && zzgn2.zzgh().equals(zzgn.zzgh())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final void zzc(zzgn zzgn) {
        synchronized (this.mLock) {
            int size;
            if (this.zzaxy.size() >= 10) {
                size = this.zzaxy.size();
                StringBuilder stringBuilder = new StringBuilder(41);
                stringBuilder.append("Queue is full, current size = ");
                stringBuilder.append(size);
                zzaiw.zzbw(stringBuilder.toString());
                this.zzaxy.remove(0);
            }
            size = this.zzaxx;
            this.zzaxx = size + 1;
            zzgn.zzo(size);
            this.zzaxy.add(zzgn);
        }
    }

    @Nullable
    public final zzgn zzgp() {
        synchronized (this.mLock) {
            zzgn zzgn = null;
            if (this.zzaxy.size() == 0) {
                zzaiw.zzbw("Queue empty");
                return null;
            }
            int i = 0;
            if (this.zzaxy.size() >= 2) {
                int i2 = Integer.MIN_VALUE;
                int i3 = 0;
                for (zzgn zzgn2 : this.zzaxy) {
                    int score = zzgn2.getScore();
                    if (score > i2) {
                        i = i3;
                        zzgn = zzgn2;
                        i2 = score;
                    }
                    i3++;
                }
                this.zzaxy.remove(i);
                return zzgn;
            }
            zzgn zzgn3 = (zzgn) this.zzaxy.get(0);
            zzgn3.zzgk();
            return zzgn3;
        }
    }
}
