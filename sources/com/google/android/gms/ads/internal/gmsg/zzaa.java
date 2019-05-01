package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.common.util.zze;
import com.google.android.gms.internal.zzaiw;
import com.google.android.gms.internal.zzama;
import com.google.android.gms.internal.zzvt;
import com.google.android.gms.internal.zzvw;
import com.google.android.gms.internal.zzvy;
import com.google.android.gms.internal.zzvz;
import com.google.android.gms.internal.zzzb;
import java.util.Map;

@zzzb
public final class zzaa implements zzt<zzama> {
    private static Map<String, Integer> zzbwm = zze.zza("resize", Integer.valueOf(1), "playVideo", Integer.valueOf(2), "storePicture", Integer.valueOf(3), "createCalendarEvent", Integer.valueOf(4), "setOrientationProperties", Integer.valueOf(5), "closeResizedAd", Integer.valueOf(6));
    private final zzw zzbwk;
    private final zzvw zzbwl;

    public zzaa(zzw zzw, zzvw zzvw) {
        this.zzbwk = zzw;
        this.zzbwl = zzvw;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzama zzama = (zzama) obj;
        int intValue = ((Integer) zzbwm.get((String) map.get("a"))).intValue();
        if (intValue != 5 && this.zzbwk != null && !this.zzbwk.zzcu()) {
            this.zzbwk.zzs(null);
        } else if (intValue != 1) {
            switch (intValue) {
                case 3:
                    new zzvz(zzama, map).execute();
                    return;
                case 4:
                    new zzvt(zzama, map).execute();
                    return;
                case 5:
                    new zzvy(zzama, map).execute();
                    return;
                case 6:
                    this.zzbwl.zzl(true);
                    return;
                default:
                    zzaiw.zzcn("Unknown MRAID command called.");
                    return;
            }
        } else {
            this.zzbwl.execute(map);
        }
    }
}
