package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.common.internal.zzbg;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;

@zzzb
public final class zzadw extends zzbej {
    public static final Creator<zzadw> CREATOR = new zzadx();
    public final String type;
    public final int zzcuk;

    public zzadw(RewardItem rewardItem) {
        this(rewardItem.getType(), rewardItem.getAmount());
    }

    public zzadw(String str, int i) {
        this.type = str;
        this.zzcuk = i;
    }

    @Nullable
    public static zzadw zza(JSONArray jSONArray) throws JSONException {
        if (jSONArray != null) {
            if (jSONArray.length() != 0) {
                return new zzadw(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
            }
        }
        return null;
    }

    @android.support.annotation.Nullable
    public static com.google.android.gms.internal.zzadw zzbt(@android.support.annotation.Nullable java.lang.String r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/558922244.run(Unknown Source)
*/
        /*
        r0 = android.text.TextUtils.isEmpty(r2);
        r1 = 0;
        if (r0 == 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x0012 }
        r0.<init>(r2);	 Catch:{ JSONException -> 0x0012 }
        r2 = zza(r0);	 Catch:{ JSONException -> 0x0012 }
        return r2;
    L_0x0012:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzadw.zzbt(java.lang.String):com.google.android.gms.internal.zzadw");
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof zzadw)) {
            return false;
        }
        zzadw zzadw = (zzadw) obj;
        if (zzbg.equal(this.type, zzadw.type) && zzbg.equal(Integer.valueOf(this.zzcuk), Integer.valueOf(zzadw.zzcuk))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.type, Integer.valueOf(this.zzcuk)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = zzbem.zze(parcel);
        zzbem.zza(parcel, 2, this.type, false);
        zzbem.zzc(parcel, 3, this.zzcuk);
        zzbem.zzai(parcel, i);
    }
}
