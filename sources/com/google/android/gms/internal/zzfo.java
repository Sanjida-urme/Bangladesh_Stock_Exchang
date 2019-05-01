package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.ads.internal.gmsg.zzz;
import com.google.android.gms.ads.internal.js.zzab;
import com.google.android.gms.ads.internal.js.zzak;
import com.google.android.gms.ads.internal.js.zzo;
import com.google.android.gms.ads.internal.zzbs;
import org.json.JSONObject;

@zzzb
public final class zzfo implements zzfx {
    private final Context mContext;
    private final zzfc zzavy;
    private final zzt<zzak> zzawa = new zzft(this);
    private final zzt<zzak> zzawb = new zzfu(this);
    private final zzt<zzak> zzawc = new zzfv(this);
    private final zzz zzawe;
    private zzab zzawf;
    private boolean zzawg;
    private final zzt<zzak> zzawh = new zzfw(this);

    public zzfo(zzfc zzfc, zzo zzo, Context context) {
        this.zzavy = zzfc;
        this.mContext = context;
        this.zzawe = new zzz(this.mContext);
        this.zzawf = zzo.zzb(null);
        this.zzawf.zza(new zzfp(this), new zzfq(this));
        String str = "Core JS tracking ad unit: ";
        String valueOf = String.valueOf(this.zzavy.zzavb.zzfq());
        zzaiw.zzbw(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    final void zza(zzak zzak) {
        zzak.zza("/updateActiveView", this.zzawa);
        zzak.zza("/untrackActiveViewUnit", this.zzawb);
        zzak.zza("/visibilityChanged", this.zzawc);
        if (zzbs.zzfa().zzr(this.mContext)) {
            zzak.zza("/logScionEvent", this.zzawh);
        }
    }

    final void zzb(zzak zzak) {
        zzak.zzb("/visibilityChanged", this.zzawc);
        zzak.zzb("/untrackActiveViewUnit", this.zzawb);
        zzak.zzb("/updateActiveView", this.zzawa);
        if (zzbs.zzfa().zzr(this.mContext)) {
            zzak.zzb("/logScionEvent", this.zzawh);
        }
    }

    public final void zzb(JSONObject jSONObject, boolean z) {
        this.zzawf.zza(new zzfr(this, jSONObject), new zzakc());
    }

    public final boolean zzgc() {
        return this.zzawg;
    }

    public final void zzgd() {
        this.zzawf.zza(new zzfs(this), new zzakc());
        this.zzawf.release();
    }
}
