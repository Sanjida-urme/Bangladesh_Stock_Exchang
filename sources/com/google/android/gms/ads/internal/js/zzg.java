package com.google.android.gms.ads.internal.js;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import com.google.android.gms.ads.internal.gmsg.zzb;
import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.ads.internal.gmsg.zzx;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzq;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.internal.zzagr;
import com.google.android.gms.internal.zzais;
import com.google.android.gms.internal.zzaiy;
import com.google.android.gms.internal.zzama;
import com.google.android.gms.internal.zzamm;
import com.google.android.gms.internal.zzanp;
import com.google.android.gms.internal.zzcs;
import com.google.android.gms.internal.zzib;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzjk;
import com.google.android.gms.internal.zzwh;
import com.google.android.gms.internal.zzzb;
import java.util.Map;
import org.json.JSONObject;

@zzzb
public final class zzg implements zzc {
    private final Context mContext;
    private final zzama zzbwq;

    public zzg(Context context, zzaiy zzaiy, @Nullable zzcs zzcs, zzv zzv) throws zzamm {
        Context context2 = context;
        this.mContext = context2;
        this.zzbwq = zzbs.zzed().zza(context2, zzanp.zztw(), "", false, false, zzcs, zzaiy, null, null, zzv, zzib.zzhi());
        zzama zzama = this.zzbwq;
        if (zzama == null) {
            throw null;
        }
        ((View) zzama).setWillNotDraw(true);
    }

    private static void runOnUiThread(Runnable runnable) {
        zzjk.zzhx();
        if (zzais.zzqt()) {
            runnable.run();
        } else {
            zzagr.zzczc.post(runnable);
        }
    }

    public final void destroy() {
        this.zzbwq.destroy();
    }

    public final void zza(zzd zzd) {
        this.zzbwq.zzsq().zza(new zzm(this, zzd));
    }

    public final void zza(zzin zzin, zzn zzn, zzb zzb, zzq zzq, boolean z, zzx zzx, zzw zzw, zzwh zzwh) {
        this.zzbwq.zzsq().zza(zzin, zzn, zzb, zzq, false, null, new zzw(this.mContext, null, null), null, null);
    }

    public final void zza(String str, zzt<? super zzak> zzt) {
        this.zzbwq.zzsq().zza(str, new zzn(this, zzt));
    }

    public final void zza(String str, Map<String, ?> map) {
        this.zzbwq.zza(str, (Map) map);
    }

    public final void zza(String str, JSONObject jSONObject) {
        this.zzbwq.zza(str, jSONObject);
    }

    public final void zzb(String str, zzt<? super zzak> zzt) {
        this.zzbwq.zzsq().zza(str, new zzh(zzt));
    }

    public final void zzb(String str, JSONObject jSONObject) {
        runOnUiThread(new zzi(this, str, jSONObject));
    }

    public final void zzba(String str) {
        runOnUiThread(new zzj(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[]{str})));
    }

    public final void zzbb(String str) {
        runOnUiThread(new zzl(this, str));
    }

    public final void zzbc(String str) {
        runOnUiThread(new zzk(this, str));
    }

    public final zzal zzlh() {
        return new zzam(this);
    }
}
