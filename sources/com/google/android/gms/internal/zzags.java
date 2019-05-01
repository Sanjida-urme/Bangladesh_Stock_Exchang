package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import java.util.List;

final class zzags implements zzno {
    private /* synthetic */ Context val$context;
    private /* synthetic */ List zzczj;
    private /* synthetic */ zznn zzczk;

    zzags(zzagr zzagr, List list, zznn zznn, Context context) {
        this.zzczj = list;
        this.zzczk = zznn;
        this.val$context = context;
    }

    public final void zzjf() {
        for (String str : this.zzczj) {
            String str2 = "Pinging url: ";
            String valueOf = String.valueOf(str);
            zzaiw.zzcn(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            this.zzczk.mayLaunchUrl(Uri.parse(str), null, null);
        }
        this.zzczk.zzc((Activity) this.val$context);
    }
}
