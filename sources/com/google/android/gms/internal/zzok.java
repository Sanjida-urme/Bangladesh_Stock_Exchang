package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.ads.internal.gmsg.zzt;
import java.util.Map;

final class zzok implements zzt<Object> {
    private /* synthetic */ zzyg zzbtf;
    private /* synthetic */ zzog zzbtg;

    zzok(zzog zzog, zzyg zzyg) {
        this.zzbtg = zzog;
        this.zzbtf = zzyg;
    }

    public final void zza(Object obj, Map<String, String> map) {
        zzama zzama = (zzama) this.zzbtg.zzbtd.get();
        if (zzama == null) {
            this.zzbtf.zzb("/hideOverlay", this);
        } else if (zzama == null) {
            throw null;
        } else {
            ((View) zzama).setVisibility(8);
        }
    }
}
