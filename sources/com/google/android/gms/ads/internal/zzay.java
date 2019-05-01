package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;
import com.google.android.gms.internal.zzack;
import com.google.android.gms.internal.zzadr;
import com.google.android.gms.internal.zzaiw;
import com.google.android.gms.internal.zztm;
import com.google.android.gms.internal.zztn;
import com.google.android.gms.internal.zzuf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

final class zzay implements Runnable {
    private /* synthetic */ zzax zzaql;

    zzay(zzax zzax) {
        this.zzaql = zzax;
    }

    public final void run() {
        Context zza = this.zzaql.zzaqk.mContext;
        Runnable runnable = this.zzaql.zzaqj;
        zzbq.zzga("Adapters must be initialized on the main thread.");
        Map zzor = zzbs.zzeg().zzpj().zzor();
        if (zzor != null && !zzor.isEmpty()) {
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    zzaiw.zzc("Could not initialize rewarded ads.", th);
                    return;
                }
            }
            zzack zznu = zzack.zznu();
            if (zznu != null) {
                Collection<zztn> values = zzor.values();
                Map hashMap = new HashMap();
                IObjectWrapper zzy = zzn.zzy(zza);
                for (zztn zztn : values) {
                    for (zztm zztm : zztn.zzcbt) {
                        String str = zztm.zzcbk;
                        for (String str2 : zztm.zzcbd) {
                            if (!hashMap.containsKey(str2)) {
                                hashMap.put(str2, new ArrayList());
                            }
                            if (str != null) {
                                ((Collection) hashMap.get(str2)).add(str);
                            }
                        }
                    }
                }
                for (Entry entry : hashMap.entrySet()) {
                    String str3 = (String) entry.getKey();
                    try {
                        zzadr zzbp = zznu.zzbp(str3);
                        if (zzbp != null) {
                            zzuf zzoc = zzbp.zzoc();
                            if (!zzoc.isInitialized()) {
                                if (zzoc.zzmc()) {
                                    zzoc.zza(zzy, zzbp.zzod(), (List) entry.getValue());
                                    String str4 = "Initialized rewarded video mediation adapter ";
                                    String valueOf = String.valueOf(str3);
                                    zzaiw.zzbw(valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str3).length() + 56);
                        stringBuilder.append("Failed to initialize rewarded video mediation adapter \"");
                        stringBuilder.append(str3);
                        stringBuilder.append("\"");
                        zzaiw.zzc(stringBuilder.toString(), th2);
                    }
                }
            }
        }
    }
}
