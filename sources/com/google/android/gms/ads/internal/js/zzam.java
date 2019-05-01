package com.google.android.gms.ads.internal.js;

import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.internal.zzafj;
import com.google.android.gms.internal.zzzb;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

@zzzb
public final class zzam implements zzal {
    private final zzak zzcaj;
    private final HashSet<SimpleEntry<String, zzt<? super zzak>>> zzcak = new HashSet();

    public zzam(zzak zzak) {
        this.zzcaj = zzak;
    }

    public final void zza(String str, zzt<? super zzak> zzt) {
        this.zzcaj.zza(str, zzt);
        this.zzcak.add(new SimpleEntry(str, zzt));
    }

    public final void zza(String str, Map<String, ?> map) {
        this.zzcaj.zza(str, (Map) map);
    }

    public final void zza(String str, JSONObject jSONObject) {
        this.zzcaj.zza(str, jSONObject);
    }

    public final void zzb(String str, zzt<? super zzak> zzt) {
        this.zzcaj.zzb(str, (zzt) zzt);
        this.zzcak.remove(new SimpleEntry(str, zzt));
    }

    public final void zzb(String str, JSONObject jSONObject) {
        this.zzcaj.zzb(str, jSONObject);
    }

    public final void zzln() {
        Iterator it = this.zzcak.iterator();
        while (it.hasNext()) {
            SimpleEntry simpleEntry = (SimpleEntry) it.next();
            String str = "Unregistering eventhandler: ";
            String valueOf = String.valueOf(((zzt) simpleEntry.getValue()).toString());
            zzafj.m5v(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            this.zzcaj.zzb((String) simpleEntry.getKey(), (zzt) simpleEntry.getValue());
        }
        this.zzcak.clear();
    }
}
