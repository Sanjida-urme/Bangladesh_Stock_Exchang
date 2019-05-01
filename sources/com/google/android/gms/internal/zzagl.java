package com.google.android.gms.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@zzzb
public final class zzagl {
    public static final ThreadPoolExecutor zzcyx = new ThreadPoolExecutor(20, 20, 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), zzcb("Default"));
    private static final ThreadPoolExecutor zzcyy = new ThreadPoolExecutor(5, 5, 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), zzcb("Loader"));

    static {
        zzcyx.allowCoreThreadTimeOut(true);
        zzcyy.allowCoreThreadTimeOut(true);
    }

    public static zzajp<Void> zza(int i, Runnable runnable) {
        ExecutorService executorService;
        Callable zzagm;
        if (i == 1) {
            executorService = zzcyy;
            zzagm = new zzagm(runnable);
        } else {
            executorService = zzcyx;
            zzagm = new zzagn(runnable);
        }
        return zza(executorService, zzagm);
    }

    public static zzajp<Void> zza(Runnable runnable) {
        return zza(0, runnable);
    }

    public static <T> zzajp<T> zza(ExecutorService executorService, Callable<T> callable) {
        zzajp<T> zzajy = new zzajy();
        try {
            zzajy.zza(new zzagp(zzajy, executorService.submit(new zzago(zzajy, callable))), zzaju.zzdct);
            return zzajy;
        } catch (Throwable e) {
            zzaiw.zzc("Thread execution is rejected.", e);
            zzajy.setException(e);
            return zzajy;
        }
    }

    private static ThreadFactory zzcb(String str) {
        return new zzagq(str);
    }
}
