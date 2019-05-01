package com.google.android.gms.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.ads.internal.zzbs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

@zzzb
public final class zzmm {
    private final Collection<zzmg<?>> zzbfq = new ArrayList();
    private final Collection<zzmg<String>> zzbfr = new ArrayList();
    private final Collection<zzmg<String>> zzbfs = new ArrayList();

    public final void zza(Editor editor, int i, JSONObject jSONObject) {
        for (zzmg zzmg : this.zzbfq) {
            if (zzmg.getSource() == 1) {
                zzmg.zza(editor, zzmg.zzc(jSONObject));
            }
        }
    }

    public final void zza(zzmg zzmg) {
        this.zzbfq.add(zzmg);
    }

    public final void zzb(zzmg<String> zzmg) {
        this.zzbfr.add(zzmg);
    }

    public final void zzc(zzmg<String> zzmg) {
        this.zzbfs.add(zzmg);
    }

    public final List<String> zziq() {
        List<String> arrayList = new ArrayList();
        for (zzmg zzd : this.zzbfr) {
            String str = (String) zzbs.zzep().zzd(zzd);
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public final List<String> zzir() {
        List<String> zziq = zziq();
        for (zzmg zzd : this.zzbfs) {
            String str = (String) zzbs.zzep().zzd(zzd);
            if (str != null) {
                zziq.add(str);
            }
        }
        return zziq;
    }
}
