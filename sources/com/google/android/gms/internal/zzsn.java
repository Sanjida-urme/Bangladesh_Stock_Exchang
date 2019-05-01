package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.zzbq;
import java.util.Iterator;
import java.util.LinkedList;

@zzzb
final class zzsn {
    private final String zzaou;
    private final LinkedList<zzso> zzbxz = new LinkedList();
    private zzis zzbya;
    private final int zzbyb;
    private boolean zzbyc;

    zzsn(zzis zzis, String str, int i) {
        zzbq.checkNotNull(zzis);
        zzbq.checkNotNull(str);
        this.zzbya = zzis;
        this.zzaou = str;
        this.zzbyb = i;
    }

    final String getAdUnitId() {
        return this.zzaou;
    }

    final int getNetworkType() {
        return this.zzbyb;
    }

    final int size() {
        return this.zzbxz.size();
    }

    final void zza(zzri zzri, zzis zzis) {
        this.zzbxz.add(new zzso(this, zzri, zzis));
    }

    final boolean zzb(zzri zzri) {
        zzso zzso = new zzso(this, zzri);
        this.zzbxz.add(zzso);
        return zzso.load();
    }

    final zzis zzkr() {
        return this.zzbya;
    }

    final int zzks() {
        Iterator it = this.zzbxz.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((zzso) it.next()).zzbyh) {
                i++;
            }
        }
        return i;
    }

    final int zzkt() {
        Iterator it = this.zzbxz.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((zzso) it.next()).load()) {
                i++;
            }
        }
        return i;
    }

    final void zzku() {
        this.zzbyc = true;
    }

    final boolean zzkv() {
        return this.zzbyc;
    }

    final zzso zzm(@Nullable zzis zzis) {
        if (zzis != null) {
            this.zzbya = zzis;
        }
        return (zzso) this.zzbxz.remove();
    }
}
