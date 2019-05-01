package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.zzbs;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

@zzzb
public final class zzael {
    private final AtomicReference<ThreadPoolExecutor> zzcve = new AtomicReference(null);
    private final Object zzcvf = new Object();
    @Nullable
    private String zzcvg = null;
    private AtomicBoolean zzcvh = new AtomicBoolean(false);
    private final AtomicInteger zzcvi = new AtomicInteger(-1);
    private final AtomicReference<Object> zzcvj = new AtomicReference(null);
    private final AtomicReference<Object> zzcvk = new AtomicReference(null);
    private ConcurrentMap<String, Method> zzcvl = new ConcurrentHashMap(9);

    private static Bundle zza(Context context, String str, boolean z) {
        Bundle bundle = new Bundle();
        try {
            bundle.putLong("_aeid", Long.parseLong(str));
        } catch (Throwable e) {
            String str2 = "Invalid event ID: ";
            str = String.valueOf(str);
            zzaiw.zzb(str.length() == 0 ? new String(str2) : str2.concat(str), e);
        }
        if (z) {
            bundle.putInt("_r", 1);
        }
        return bundle;
    }

    private final Object zza(String str, Context context) {
        if (!zza(context, "com.google.android.gms.measurement.AppMeasurement", this.zzcvj, true)) {
            return null;
        }
        try {
            return zzi(context, str).invoke(this.zzcvj.get(), new Object[0]);
        } catch (Exception e) {
            zza(e, str, true);
            return null;
        }
    }

    private final void zza(Exception exception, String str, boolean z) {
        if (!this.zzcvh.get()) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 30);
            stringBuilder.append("Invoke Firebase method ");
            stringBuilder.append(str);
            stringBuilder.append(" error.");
            zzaiw.zzco(stringBuilder.toString());
            if (z) {
                zzaiw.zzco("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
                this.zzcvh.set(true);
            }
        }
    }

    private final boolean zza(Context context, String str, AtomicReference<Object> atomicReference, boolean z) {
        if (atomicReference.get() != null) {
            return true;
        }
        try {
            atomicReference.compareAndSet(null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke(null, new Object[]{context}));
            return true;
        } catch (Exception e) {
            zza(e, "getInstance", z);
            return false;
        }
    }

    private final Method zzaa(Context context) {
        Method method = (Method) this.zzcvl.get("logEventInternal");
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", new Class[]{String.class, String.class, Bundle.class});
            this.zzcvl.put("logEventInternal", declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            zza(e, "logEventInternal", true);
            return null;
        }
    }

    private final void zzb(Context context, String str, String str2) {
        if (zza(context, "com.google.android.gms.measurement.AppMeasurement", this.zzcvj, true)) {
            Method zzh = zzh(context, str2);
            try {
                zzh.invoke(this.zzcvj.get(), new Object[]{str});
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 37) + String.valueOf(str).length());
                stringBuilder.append("Invoke Firebase method ");
                stringBuilder.append(str2);
                stringBuilder.append(", Ad Unit Id: ");
                stringBuilder.append(str);
                zzafj.m5v(stringBuilder.toString());
            } catch (Exception e) {
                zza(e, str2, false);
            }
        }
    }

    private final Method zzh(Context context, String str) {
        Method method = (Method) this.zzcvl.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[]{String.class});
            this.zzcvl.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            zza(e, str, false);
            return null;
        }
    }

    private final Method zzi(Context context, String str) {
        Method method = (Method) this.zzcvl.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.zzcvl.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            zza(e, str, false);
            return null;
        }
    }

    private final Method zzj(Context context, String str) {
        Method method = (Method) this.zzcvl.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod(str, new Class[]{Activity.class, String.class, String.class});
            this.zzcvl.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            zza(e, str, false);
            return null;
        }
    }

    public final void zza(Context context, String str, String str2) {
        if (zzr(context) && zza(context, "com.google.android.gms.measurement.AppMeasurement", this.zzcvj, true)) {
            Method zzaa = zzaa(context);
            Bundle zza = zza(context, str2, "_ac".equals(str));
            try {
                zzaa.invoke(this.zzcvj.get(), new Object[]{"am", str, zza});
            } catch (Exception e) {
                zza(e, "logEventInternal", true);
            }
        }
    }

    final /* synthetic */ String zzab(Context context) throws Exception {
        return (String) zza("getAppInstanceId", context);
    }

    public final void zzb(Context context, String str) {
        if (zzr(context)) {
            zzb(context, str, "beginAdUnitExposure");
        }
    }

    public final void zzc(Context context, String str) {
        if (zzr(context)) {
            zzb(context, str, "endAdUnitExposure");
        }
    }

    public final void zzd(Context context, String str) {
        if (zzr(context) && (context instanceof Activity) && zza(context, "com.google.firebase.analytics.FirebaseAnalytics", this.zzcvk, false)) {
            Method zzj = zzj(context, "setCurrentScreen");
            try {
                Activity activity = (Activity) context;
                zzj.invoke(this.zzcvk.get(), new Object[]{activity, str, context.getPackageName()});
            } catch (Exception e) {
                zza(e, "setCurrentScreen", false);
            }
        }
    }

    public final void zze(Context context, String str) {
        zza(context, "_ac", str);
    }

    public final void zzf(Context context, String str) {
        zza(context, "_ai", str);
    }

    public final void zzg(Context context, String str) {
        zza(context, "_aq", str);
    }

    public final boolean zzr(Context context) {
        if (!((Boolean) zzbs.zzep().zzd(zzmq.zzbiz)).booleanValue() || this.zzcvh.get()) {
            return false;
        }
        if (this.zzcvi.get() == -1) {
            zzjk.zzhx();
            if (!zzais.zzbd(context)) {
                zzjk.zzhx();
                if (zzais.zzbe(context)) {
                    zzaiw.zzco("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                    this.zzcvi.set(0);
                }
            }
            this.zzcvi.set(1);
        }
        return this.zzcvi.get() == 1;
    }

    public final boolean zzs(Context context) {
        return ((Boolean) zzbs.zzep().zzd(zzmq.zzbja)).booleanValue() && zzr(context);
    }

    public final boolean zzt(Context context) {
        return ((Boolean) zzbs.zzep().zzd(zzmq.zzbjb)).booleanValue() && zzr(context);
    }

    public final boolean zzu(Context context) {
        return ((Boolean) zzbs.zzep().zzd(zzmq.zzbjc)).booleanValue() && zzr(context);
    }

    public final boolean zzv(Context context) {
        return ((Boolean) zzbs.zzep().zzd(zzmq.zzbjd)).booleanValue() && zzr(context);
    }

    public final String zzw(Context context) {
        if (!zzr(context)) {
            return "";
        }
        if (!zza(context, "com.google.android.gms.measurement.AppMeasurement", this.zzcvj, true)) {
            return "";
        }
        try {
            String str = (String) zzi(context, "getCurrentScreenName").invoke(this.zzcvj.get(), new Object[0]);
            if (str == null) {
                str = (String) zzi(context, "getCurrentScreenClass").invoke(this.zzcvj.get(), new Object[0]);
            }
            return str != null ? str : "";
        } catch (Exception e) {
            zza(e, "getCurrentScreenName", false);
            return "";
        }
    }

    @Nullable
    public final String zzx(Context context) {
        if (!zzr(context)) {
            return null;
        }
        synchronized (this.zzcvf) {
            if (this.zzcvg != null) {
                String str = this.zzcvg;
                return str;
            }
            this.zzcvg = (String) zza("getGmpAppId", context);
            str = this.zzcvg;
            return str;
        }
    }

    @Nullable
    public final String zzy(Context context) {
        if (!zzr(context)) {
            return null;
        }
        long longValue = ((Long) zzbs.zzep().zzd(zzmq.zzbjj)).longValue();
        if (longValue < 0) {
            return (String) zza("getAppInstanceId", context);
        }
        if (this.zzcve.get() == null) {
            this.zzcve.compareAndSet(null, new ThreadPoolExecutor(((Integer) zzbs.zzep().zzd(zzmq.zzbjk)).intValue(), ((Integer) zzbs.zzep().zzd(zzmq.zzbjk)).intValue(), 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), new zzaen(this)));
        }
        Future submit = ((ThreadPoolExecutor) this.zzcve.get()).submit(new zzaem(this, context));
        try {
            return (String) submit.get(longValue, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            submit.cancel(true);
            return e instanceof TimeoutException ? "TIME_OUT" : null;
        }
    }

    @Nullable
    public final String zzz(Context context) {
        if (!zzr(context)) {
            return null;
        }
        Object zza = zza("generateEventId", context);
        return zza != null ? zza.toString() : null;
    }
}
