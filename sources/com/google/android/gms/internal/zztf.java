package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.zzd;
import com.google.android.gms.ads.internal.js.zzab;
import com.google.android.gms.ads.internal.js.zzak;
import com.google.android.gms.ads.internal.js.zzo;
import com.google.android.gms.ads.internal.zzbs;
import org.json.JSONObject;

@zzzb
public final class zztf<I, O> implements zzsu<I, O> {
    private final zzo zzcar;
    private final zzsw<O> zzcas;
    private final zzsx<I> zzcat;
    private final String zzcau;

    zztf(zzo zzo, String str, zzsx<I> zzsx, zzsw<O> zzsw) {
        this.zzcar = zzo;
        this.zzcau = str;
        this.zzcat = zzsx;
        this.zzcas = zzsw;
    }

    private final void zza(zzab zzab, zzak zzak, I i, zzajy<O> zzajy) {
        try {
            zzbs.zzec();
            String zzpv = zzagr.zzpv();
            zzd.zzbvq.zza(zzpv, new zzti(this, zzab, zzajy));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", zzpv);
            jSONObject.put("args", this.zzcat.zzh(i));
            zzak.zzb(this.zzcau, jSONObject);
        } catch (Throwable e) {
            zzajy.setException(e);
            zzaiw.zzb("Unable to invokeJavaScript", e);
        } finally {
            zzab.release();
        }
    }

    public final zzajp<O> zzc(I i) throws Exception {
        return zzg(i);
    }

    public final zzajp<O> zzg(I i) {
        zzajp zzajy = new zzajy();
        zzake zzb = this.zzcar.zzb(null);
        zzb.zza(new zztg(this, zzb, i, zzajy), new zzth(this, zzajy, zzb));
        return zzajy;
    }
}
