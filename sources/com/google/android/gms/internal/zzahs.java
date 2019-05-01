package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbs;
import java.io.File;
import java.util.regex.Pattern;

@zzzb
public final class zzahs extends zzad {
    private final Context mContext;

    private zzahs(Context context, zzam zzam) {
        super(zzam);
        this.mContext = context;
    }

    public static zzs zzaz(Context context) {
        zzs zzs = new zzs(new zzag(new File(context.getCacheDir(), "admob_volley")), new zzahs(context, new zzan()));
        zzs.start();
        return zzs;
    }

    public final zzn zza(zzp<?> zzp) throws zzaa {
        if (zzp.zzh() && zzp.getMethod() == 0) {
            if (Pattern.matches((String) zzbs.zzep().zzd(zzmq.zzbou), zzp.getUrl())) {
                zzjk.zzhx();
                if (zzais.zzbd(this.mContext)) {
                    zzn zza = new zzrc(this.mContext).zza((zzp) zzp);
                    String str;
                    if (zza != null) {
                        str = "Got gmscore asset response: ";
                        String valueOf = String.valueOf(zzp.getUrl());
                        zzafj.m5v(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                        return zza;
                    }
                    String str2 = "Failed to get gmscore asset response: ";
                    str = String.valueOf(zzp.getUrl());
                    zzafj.m5v(str.length() != 0 ? str2.concat(str) : new String(str2));
                }
            }
        }
        return super.zza((zzp) zzp);
    }
}
