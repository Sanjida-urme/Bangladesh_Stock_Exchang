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
public final class zzyh implements zzxx<zzns> {
    private final boolean zzccv;
    private final boolean zzcjy;
    private final boolean zzcjz;

    public zzyh(boolean z, boolean z2, boolean z3) {
        this.zzcjy = z;
        this.zzcjz = z2;
        this.zzccv = z3;
    }

    public final /* synthetic */ zzoc zza(zzxr zzxr, JSONObject jSONObject) throws JSONException, InterruptedException, ExecutionException {
        String string;
        String string2;
        zzoy zzoy;
        String string3;
        double optDouble;
        String optString;
        String optString2;
        zznp zznp;
        Bundle bundle;
        zzku zzrx;
        View view;
        zzxr zzxr2 = zzxr;
        JSONObject jSONObject2 = jSONObject;
        List<zzajp> zza = zzxr2.zza(jSONObject2, "images", false, this.zzcjy, this.zzcjz);
        Future zza2 = zzxr2.zza(jSONObject2, "app_icon", true, this.zzcjy);
        zzajp zzc = zzxr2.zzc(jSONObject2, "video");
        Future zzh = zzxr.zzh(jSONObject);
        List arrayList = new ArrayList();
        for (zzajp zzajp : zza) {
            arrayList.add((zznr) zzajp.get());
        }
        zzama zzb = zzxr.zzb(zzc);
        String string4 = jSONObject2.getString("headline");
        if (r0.zzccv) {
            if (((Boolean) zzbs.zzep().zzd(zzmq.zzbqc)).booleanValue()) {
                Resources resources = zzbs.zzeg().getResources();
                string = resources != null ? resources.getString(C0231R.string.s7) : "Test Ad";
                if (string4 != null) {
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(string).length() + 3) + String.valueOf(string4).length());
                    stringBuilder.append(string);
                    stringBuilder.append(" : ");
                    stringBuilder.append(string4);
                    string4 = stringBuilder.toString();
                }
                string2 = jSONObject2.getString("body");
                zzoy = (zzoy) zza2.get();
                string3 = jSONObject2.getString("call_to_action");
                optDouble = jSONObject2.optDouble("rating", -1.0d);
                optString = jSONObject2.optString("store");
                optString2 = jSONObject2.optString("price");
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
                return new zzns(string, arrayList, string2, zzoy, string3, optDouble, optString, optString2, zznp, bundle, zzrx, view, null, null);
            }
        }
        string = string4;
        string2 = jSONObject2.getString("body");
        zzoy = (zzoy) zza2.get();
        string3 = jSONObject2.getString("call_to_action");
        optDouble = jSONObject2.optDouble("rating", -1.0d);
        optString = jSONObject2.optString("store");
        optString2 = jSONObject2.optString("price");
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
        return new zzns(string, arrayList, string2, zzoy, string3, optDouble, optString, optString2, zznp, bundle, zzrx, view, null, null);
    }
}
