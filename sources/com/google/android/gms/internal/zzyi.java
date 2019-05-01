package com.google.android.gms.internal;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.C0231R;
import com.google.android.gms.ads.internal.zzbs;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

@zzzb
public final class zzyi implements zzxx<zznu> {
    private final boolean zzccv;
    private final boolean zzcjy;
    private final boolean zzcjz;

    public zzyi(boolean z, boolean z2, boolean z3) {
        this.zzcjy = z;
        this.zzcjz = z2;
        this.zzccv = z3;
    }

    public final /* synthetic */ zzoc zza(zzxr zzxr, JSONObject jSONObject) throws JSONException, InterruptedException, ExecutionException {
        String string;
        String string2;
        zzoy zzoy;
        String string3;
        String string4;
        zznp zznp;
        Bundle bundle;
        zzku zzrx;
        View view;
        zzxr zzxr2 = zzxr;
        JSONObject jSONObject2 = jSONObject;
        List<zzajp> zza = zzxr2.zza(jSONObject2, "images", false, this.zzcjy, this.zzcjz);
        Future zza2 = zzxr2.zza(jSONObject2, "secondary_image", false, this.zzcjy);
        Future zzh = zzxr.zzh(jSONObject);
        zzajp zzc = zzxr2.zzc(jSONObject2, "video");
        List arrayList = new ArrayList();
        for (zzajp zzajp : zza) {
            arrayList.add((zznr) zzajp.get());
        }
        zzama zzb = zzxr.zzb(zzc);
        String string5 = jSONObject2.getString("headline");
        if (r0.zzccv) {
            if (((Boolean) zzbs.zzep().zzd(zzmq.zzbqc)).booleanValue()) {
                Resources resources = zzbs.zzeg().getResources();
                string = resources != null ? resources.getString(C0231R.string.s7) : "Test Ad";
                if (string5 != null) {
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(string).length() + 3) + String.valueOf(string5).length());
                    stringBuilder.append(string);
                    stringBuilder.append(" : ");
                    stringBuilder.append(string5);
                    string5 = stringBuilder.toString();
                }
                string2 = jSONObject2.getString("body");
                zzoy = (zzoy) zza2.get();
                string3 = jSONObject2.getString("call_to_action");
                string4 = jSONObject2.getString("advertiser");
                zznp = (zznp) zzh.get();
                bundle = new Bundle();
                zzrx = zzb == null ? zzb.zzrx() : null;
                if (zzb != null) {
                    view = null;
                } else if (zzb != null) {
                    throw null;
                } else {
                    view = (View) zzb;
                }
                return new zznu(string, arrayList, string2, zzoy, string3, string4, zznp, bundle, zzrx, view, null, null);
            }
        }
        string = string5;
        string2 = jSONObject2.getString("body");
        zzoy = (zzoy) zza2.get();
        string3 = jSONObject2.getString("call_to_action");
        string4 = jSONObject2.getString("advertiser");
        zznp = (zznp) zzh.get();
        bundle = new Bundle();
        if (zzb == null) {
        }
        if (zzb != null) {
            view = null;
        } else if (zzb != null) {
            view = (View) zzb;
        } else {
            throw null;
        }
        return new zznu(string, arrayList, string2, zzoy, string3, string4, zznp, bundle, zzrx, view, null, null);
    }
}
