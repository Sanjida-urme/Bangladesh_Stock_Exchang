package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbs;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@zzzb
public final class zznd {
    private final Object mLock = new Object();
    private boolean zzbqe;
    private final List<zznb> zzbqv = new LinkedList();
    private final Map<String, String> zzbqw = new LinkedHashMap();
    private String zzbqx;
    @Nullable
    private zznd zzbqy;

    public zznd(boolean z, String str, String str2) {
        this.zzbqe = z;
        this.zzbqw.put("action", str);
        this.zzbqw.put("ad_format", str2);
    }

    public final boolean zza(zznb zznb, long j, String... strArr) {
        synchronized (this.mLock) {
            for (String zznb2 : strArr) {
                this.zzbqv.add(new zznb(j, zznb2, zznb));
            }
        }
        return true;
    }

    public final boolean zza(@Nullable zznb zznb, String... strArr) {
        if (this.zzbqe) {
            if (zznb != null) {
                return zza(zznb, zzbs.zzei().elapsedRealtime(), strArr);
            }
        }
        return false;
    }

    public final void zzan(String str) {
        if (this.zzbqe) {
            synchronized (this.mLock) {
                this.zzbqx = str;
            }
        }
    }

    @Nullable
    public final zznb zzc(long j) {
        return !this.zzbqe ? null : new zznb(j, null, null);
    }

    public final void zzc(@Nullable zznd zznd) {
        synchronized (this.mLock) {
            this.zzbqy = zznd;
        }
    }

    public final void zzf(String str, String str2) {
        if (this.zzbqe && !TextUtils.isEmpty(str2)) {
            zzmt zzow = zzbs.zzeg().zzow();
            if (zzow != null) {
                synchronized (this.mLock) {
                    zzmx zzal = zzow.zzal(str);
                    Map map = this.zzbqw;
                    map.put(str, zzal.zze((String) map.get(str), str2));
                }
            }
        }
    }

    public final zznb zziz() {
        return zzc(zzbs.zzei().elapsedRealtime());
    }

    public final String zzja() {
        String stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder();
        synchronized (this.mLock) {
            for (zznb zznb : this.zzbqv) {
                long time = zznb.getTime();
                String zziw = zznb.zziw();
                zznb zznb2 = zznb2.zzix();
                if (zznb2 != null && time > 0) {
                    long time2 = time - zznb2.getTime();
                    stringBuilder2.append(zziw);
                    stringBuilder2.append('.');
                    stringBuilder2.append(time2);
                    stringBuilder2.append(',');
                }
            }
            this.zzbqv.clear();
            if (!TextUtils.isEmpty(this.zzbqx)) {
                stringBuilder2.append(this.zzbqx);
            } else if (stringBuilder2.length() > 0) {
                stringBuilder2.setLength(stringBuilder2.length() - 1);
            }
            stringBuilder = stringBuilder2.toString();
        }
        return stringBuilder;
    }

    final Map<String, String> zzjb() {
        synchronized (this.mLock) {
            Map<String, String> zza;
            zzmt zzow = zzbs.zzeg().zzow();
            if (zzow != null) {
                if (this.zzbqy != null) {
                    zza = zzow.zza(this.zzbqw, this.zzbqy.zzjb());
                    return zza;
                }
            }
            zza = this.zzbqw;
            return zza;
        }
    }

    public final zznb zzjc() {
        synchronized (this.mLock) {
        }
        return null;
    }
}
