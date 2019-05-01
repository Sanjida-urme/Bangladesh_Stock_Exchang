package com.google.android.gms.ads.internal.js;

import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.internal.zzagr;
import com.google.android.gms.internal.zzaht;
import com.google.android.gms.internal.zzaiy;
import com.google.android.gms.internal.zzake;
import com.google.android.gms.internal.zzcs;
import com.google.android.gms.internal.zzzb;

@zzzb
public final class zzo {
    private final Context mContext;
    private final Object mLock;
    private final zzaiy zzaov;
    private final String zzbzj;
    private zzaht<zzc> zzbzk;
    private zzaht<zzc> zzbzl;
    @Nullable
    private zzaf zzbzm;
    private int zzbzn;

    public zzo(Context context, zzaiy zzaiy, String str) {
        this.mLock = new Object();
        this.zzbzn = 1;
        this.zzbzj = str;
        this.mContext = context.getApplicationContext();
        this.zzaov = zzaiy;
        this.zzbzk = new zzaa();
        this.zzbzl = new zzaa();
    }

    public zzo(Context context, zzaiy zzaiy, String str, zzaht<zzc> zzaht, zzaht<zzc> zzaht2) {
        this(context, zzaiy, str);
        this.zzbzk = zzaht;
        this.zzbzl = zzaht2;
    }

    protected final zzaf zza(@Nullable zzcs zzcs) {
        zzake zzaf = new zzaf(this.zzbzl);
        zzbs.zzec();
        zzagr.runOnUiThread(new zzp(this, zzcs, zzaf));
        zzaf.zza(new zzx(this, zzaf), new zzy(this, zzaf));
        return zzaf;
    }

    public final zzab zzb(@Nullable zzcs zzcs) {
        synchronized (this.mLock) {
            zzab zzlj;
            if (this.zzbzm != null) {
                if (this.zzbzm.getStatus() != -1) {
                    if (this.zzbzn == 0) {
                        zzlj = this.zzbzm.zzlj();
                        return zzlj;
                    } else if (this.zzbzn == 1) {
                        this.zzbzn = 2;
                        zza(null);
                        zzlj = this.zzbzm.zzlj();
                        return zzlj;
                    } else if (this.zzbzn == 2) {
                        zzlj = this.zzbzm.zzlj();
                        return zzlj;
                    } else {
                        zzlj = this.zzbzm.zzlj();
                        return zzlj;
                    }
                }
            }
            this.zzbzn = 2;
            this.zzbzm = zza(null);
            zzlj = this.zzbzm.zzlj();
            return zzlj;
        }
    }
}
