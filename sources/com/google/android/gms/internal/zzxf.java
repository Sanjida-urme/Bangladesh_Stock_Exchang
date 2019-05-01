package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzba;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.common.util.zzq;

@zzzb
public final class zzxf {
    public static zzahi zza(Context context, zza zza, zzaev zzaev, zzcs zzcs, @Nullable zzama zzama, zzuc zzuc, zzxg zzxg, zznd zznd) {
        zzahi zzxk;
        zzaad zzaad = zzaev.zzcwe;
        zzahi zzxl;
        if (zzaad.zzcng) {
            zzxl = new zzxl(context, zzaev, zzuc, zzxg, zznd, zzama);
        } else {
            if (!zzaad.zzbdd) {
                if (!(zza instanceof zzba)) {
                    zzxk = (((Boolean) zzbs.zzep().zzd(zzmq.zzbit)).booleanValue() && zzq.zzama() && !zzq.zzamc() && zzama != null && zzama.zzso().zztx()) ? new zzxk(context, zzaev, zzama, zzxg) : new zzxh(context, zzaev, zzama, zzxg);
                }
            }
            if (zzaad.zzbdd && (zza instanceof zzba)) {
                zzxl = new zzxn(context, (zzba) zza, zzaev, zzcs, zzxg, zznd);
            } else {
                zzxk = new zzxi(zzaev, zzxg);
            }
        }
        String str = "AdRenderer: ";
        String valueOf = String.valueOf(zzxk.getClass().getName());
        zzaiw.zzbw(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        zzxk.zzmx();
        return zzxk;
    }
}
