package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.zzaiw;
import com.google.android.gms.internal.zzis;
import java.lang.ref.WeakReference;

final class zzbj implements Runnable {
    private /* synthetic */ WeakReference zzare;
    private /* synthetic */ zzbi zzarf;

    zzbj(zzbi zzbi, WeakReference weakReference) {
        this.zzarf = zzbi;
        this.zzare = weakReference;
    }

    public final void run() {
        this.zzarf.zzarb = false;
        zza zza = (zza) this.zzare.get();
        if (zza != null) {
            zzis zza2 = this.zzarf.zzara;
            if (zza.zzc(zza2)) {
                zza.zzb(zza2);
            } else {
                zzaiw.zzcn("Ad is not visible. Not refreshing ad.");
                zza.zzams.zzg(zza2);
            }
        }
    }
}
