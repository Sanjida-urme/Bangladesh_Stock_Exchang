package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.zzt;
import org.json.JSONObject;

@zzzb
public final class zzfk implements zzfx {
    private final zzfc zzavy;
    private final zzama zzavz;
    private final zzt<zzama> zzawa = new zzfl(this);
    private final zzt<zzama> zzawb = new zzfm(this);
    private final zzt<zzama> zzawc = new zzfn(this);

    public zzfk(zzfc zzfc, zzama zzama) {
        this.zzavy = zzfc;
        this.zzavz = zzama;
        zzama zzama2 = this.zzavz;
        zzama2.zza("/updateActiveView", this.zzawa);
        zzama2.zza("/untrackActiveViewUnit", this.zzawb);
        zzama2.zza("/visibilityChanged", this.zzawc);
        String str = "Custom JS tracking ad unit: ";
        String valueOf = String.valueOf(this.zzavy.zzavb.zzfq());
        zzaiw.zzbw(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    public final void zzb(JSONObject jSONObject, boolean z) {
        if (z) {
            this.zzavy.zzb((zzfx) this);
        } else {
            this.zzavz.zzb("AFMA_updateActiveView", jSONObject);
        }
    }

    public final boolean zzgc() {
        return true;
    }

    public final void zzgd() {
        zzama zzama = this.zzavz;
        zzama.zzb("/visibilityChanged", this.zzawc);
        zzama.zzb("/untrackActiveViewUnit", this.zzawb);
        zzama.zzb("/updateActiveView", this.zzawa);
    }
}
