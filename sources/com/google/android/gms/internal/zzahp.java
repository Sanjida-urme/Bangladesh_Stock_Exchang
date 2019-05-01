package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbs;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

@zzzb
public final class zzahp {
    private final Object mLock = new Object();
    private String zzczx = "";
    private String zzczy = "";
    private boolean zzczz = false;
    private String zzdaa = "";

    private final void zza(Context context, String str, boolean z, boolean z2) {
        if (context instanceof Activity) {
            zzagr.zzczc.post(new zzahq(this, context, str, z, z2));
        } else {
            zzaiw.zzcn("Can not create dialog without Activity Context");
        }
    }

    private final String zzay(Context context) {
        String str;
        synchronized (this.mLock) {
            if (TextUtils.isEmpty(this.zzczx)) {
                zzbs.zzec();
                this.zzczx = zzagr.zzq(context, "debug_signals_id.txt");
                if (TextUtils.isEmpty(this.zzczx)) {
                    zzbs.zzec();
                    this.zzczx = zzagr.zzpv();
                    zzbs.zzec();
                    zzagr.zzf(context, "debug_signals_id.txt", this.zzczx);
                }
            }
            str = this.zzczx;
        }
        return str;
    }

    private final Uri zzb(Context context, String str, String str2, String str3) {
        Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("linkedDeviceId", zzay(context));
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    private final boolean zzi(Context context, String str, String str2) {
        Object zzk = zzk(context, zzb(context, (String) zzbs.zzep().zzd(zzmq.zzbpc), str, str2).toString(), str2);
        if (TextUtils.isEmpty(zzk)) {
            zzaiw.zzbw("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(zzk.trim());
            String optString = jSONObject.optString("gct");
            this.zzdaa = jSONObject.optString(NotificationCompat.CATEGORY_STATUS);
            synchronized (this.mLock) {
                this.zzczy = optString;
            }
            return true;
        } catch (Throwable e) {
            zzaiw.zzc("Fail to get in app preview response json.", e);
            return false;
        }
    }

    private final boolean zzj(Context context, String str, String str2) {
        Object zzk = zzk(context, zzb(context, (String) zzbs.zzep().zzd(zzmq.zzbpd), str, str2).toString(), str2);
        if (TextUtils.isEmpty(zzk)) {
            zzaiw.zzbw("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(zzk.trim()).optString("debug_mode"));
            synchronized (this.mLock) {
                this.zzczz = equals;
            }
            return equals;
        } catch (Throwable e) {
            zzaiw.zzc("Fail to get debug mode response json.", e);
            return false;
        }
    }

    private static String zzk(Context context, String str, String str2) {
        Throwable e;
        String str3;
        Map hashMap = new HashMap();
        hashMap.put("User-Agent", zzbs.zzec().zzp(context, str2));
        zzajp zzb = new zzahy(context).zzb(str, hashMap);
        try {
            return (String) zzb.get((long) ((Integer) zzbs.zzep().zzd(zzmq.zzbpf)).intValue(), TimeUnit.MILLISECONDS);
        } catch (TimeoutException e2) {
            e = e2;
            str3 = "Timeout while retriving a response from: ";
            str = String.valueOf(str);
            if (str.length() == 0) {
                str = new String(str3);
                zzaiw.zzb(str, e);
                zzb.cancel(true);
                return null;
            }
            str = str3.concat(str);
            zzaiw.zzb(str, e);
            zzb.cancel(true);
            return null;
        } catch (InterruptedException e3) {
            e = e3;
            str3 = "Interrupted while retriving a response from: ";
            str = String.valueOf(str);
            if (str.length() != 0) {
                str = str3.concat(str);
                zzaiw.zzb(str, e);
                zzb.cancel(true);
                return null;
            }
            str = new String(str3);
            zzaiw.zzb(str, e);
            zzb.cancel(true);
            return null;
        } catch (Throwable e4) {
            str2 = "Error retriving a response from: ";
            str = String.valueOf(str);
            zzaiw.zzb(str.length() != 0 ? str2.concat(str) : new String(str2), e4);
            return null;
        }
    }

    private final void zzl(Context context, String str, String str2) {
        zzbs.zzec();
        zzagr.zza(context, zzb(context, (String) zzbs.zzep().zzd(zzmq.zzbpb), str, str2));
    }

    public final void zza(Context context, String str, String str2, String str3) {
        Builder buildUpon = zzb(context, (String) zzbs.zzep().zzd(zzmq.zzbpe), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        zzbs.zzec();
        zzagr.zze(context, str, buildUpon.build().toString());
    }

    public final void zzg(Context context, String str, String str2) {
        if (!zzi(context, str, str2)) {
            zza(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
        } else if ("2".equals(this.zzdaa)) {
            zzaiw.zzbw("Creative is not pushed for this device.");
            zza(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(this.zzdaa)) {
            zzaiw.zzbw("The app is not linked for creative preview.");
            zzl(context, str, str2);
        } else {
            if ("0".equals(this.zzdaa)) {
                zzaiw.zzbw("Device is linked for in app preview.");
                zza(context, "The device is successfully linked for creative preview.", false, true);
            }
        }
    }

    public final void zzh(Context context, String str, String str2) {
        if (zzj(context, str, str2)) {
            zzaiw.zzbw("Device is linked for debug signals.");
            zza(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        zzl(context, str, str2);
    }

    public final String zzqj() {
        String str;
        synchronized (this.mLock) {
            str = this.zzczy;
        }
        return str;
    }

    public final boolean zzqk() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzczz;
        }
        return z;
    }
}
