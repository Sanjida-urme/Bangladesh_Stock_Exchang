package com.google.android.gms.ads.internal.js;

import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.internal.zzagr;
import com.google.android.gms.internal.zzakd;

final class zzai implements zzakd<zzc> {
    final /* synthetic */ zzaf zzcag;

    zzai(zzaf zzaf) {
        this.zzcag = zzaf;
    }

    public final /* synthetic */ void zzf(Object obj) {
        zzc zzc = (zzc) obj;
        zzbs.zzec();
        zzagr.runOnUiThread(new zzaj(this, zzc));
    }
}
