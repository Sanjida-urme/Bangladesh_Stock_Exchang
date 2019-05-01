package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbs;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@zzzb
public final class zzajg {
    public static <V> zzajp<V> zza(zzajp<V> zzajp, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzajy zzajy = new zzajy();
        zza((zzajp) zzajy, (Future) zzajp);
        scheduledExecutorService.schedule(new zzajk(zzajy), j, timeUnit);
        zza((zzajp) zzajp, zzajy);
        return zzajy;
    }

    public static <A, B> zzajp<B> zza(zzajp<A> zzajp, zzajb<? super A, ? extends B> zzajb, Executor executor) {
        zzajp zzajy = new zzajy();
        zzajp.zza(new zzajj(zzajy, zzajb, zzajp), executor);
        zza(zzajy, (Future) zzajp);
        return zzajy;
    }

    public static <A, B> zzajp<B> zza(zzajp<A> zzajp, zzajc<A, B> zzajc, Executor executor) {
        zzajp zzajy = new zzajy();
        zzajp.zza(new zzaji(zzajy, zzajc, zzajp), executor);
        zza(zzajy, (Future) zzajp);
        return zzajy;
    }

    public static <V, X extends Throwable> zzajp<V> zza(zzajp<? extends V> zzajp, Class<X> cls, zzajb<? super X, ? extends V> zzajb, Executor executor) {
        zzajp zzajy = new zzajy();
        zza(zzajy, (Future) zzajp);
        zzajp.zza(new zzajl(zzajy, zzajp, cls, zzajb, executor), zzaju.zzdcu);
        return zzajy;
    }

    public static <T> T zza(Future<T> future, T t) {
        Throwable e;
        try {
            return future.get(((Long) zzbs.zzep().zzd(zzmq.zzblr)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            e = e2;
            future.cancel(true);
            zzaiw.zzc("InterruptedException caught while resolving future.", e);
            Thread.currentThread().interrupt();
            zzbs.zzeg().zza(e, "Futures.resolveFuture");
            return t;
        } catch (Exception e3) {
            e = e3;
            future.cancel(true);
            zzaiw.zzb("Error waiting for future.", e);
            zzbs.zzeg().zza(e, "Futures.resolveFuture");
            return t;
        }
    }

    public static <T> T zza(Future<T> future, T t, long j, TimeUnit timeUnit) {
        Throwable e;
        try {
            return future.get(j, timeUnit);
        } catch (InterruptedException e2) {
            e = e2;
            future.cancel(true);
            zzaiw.zzc("InterruptedException caught while resolving future.", e);
            Thread.currentThread().interrupt();
            zzbs.zzeg().zza(e, "Futures.resolveFuture");
            return t;
        } catch (Exception e3) {
            e = e3;
            future.cancel(true);
            zzaiw.zzb("Error waiting for future.", e);
            zzbs.zzeg().zza(e, "Futures.resolveFuture");
            return t;
        }
    }

    public static <V> void zza(zzajp<V> zzajp, zzajd<V> zzajd, Executor executor) {
        zzajp.zza(new zzajh(zzajd, zzajp), executor);
    }

    private static <V> void zza(zzajp<? extends V> zzajp, zzajy<V> zzajy) {
        zza((zzajp) zzajy, (Future) zzajp);
        zzajp.zza(new zzajm(zzajy, zzajp), zzaju.zzdcu);
    }

    private static <A, B> void zza(zzajp<A> zzajp, Future<B> future) {
        zzajp.zza(new zzajn(zzajp, future), zzaju.zzdcu);
    }

    static final /* synthetic */ void zza(com.google.android.gms.internal.zzajy r1, com.google.android.gms.internal.zzajb r2, com.google.android.gms.internal.zzajp r3) {
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
        r0 = r1.isCancelled();
        if (r0 == 0) goto L_0x0007;
    L_0x0006:
        return;
    L_0x0007:
        r3 = r3.get();	 Catch:{ CancellationException -> 0x002d, ExecutionException -> 0x0024, InterruptedException -> 0x0018, Exception -> 0x0013 }
        r2 = r2.zzc(r3);	 Catch:{ CancellationException -> 0x002d, ExecutionException -> 0x0024, InterruptedException -> 0x0018, Exception -> 0x0013 }
        zza(r2, r1);	 Catch:{ CancellationException -> 0x002d, ExecutionException -> 0x0024, InterruptedException -> 0x0018, Exception -> 0x0013 }
        return;
    L_0x0013:
        r2 = move-exception;
        r1.setException(r2);
        return;
    L_0x0018:
        r2 = move-exception;
        r3 = java.lang.Thread.currentThread();
        r3.interrupt();
        r1.setException(r2);
        return;
    L_0x0024:
        r2 = move-exception;
        r2 = r2.getCause();
        r1.setException(r2);
        return;
    L_0x002d:
        r2 = 1;
        r1.cancel(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzajg.zza(com.google.android.gms.internal.zzajy, com.google.android.gms.internal.zzajb, com.google.android.gms.internal.zzajp):void");
    }

    static final /* synthetic */ void zza(zzajy zzajy, zzajp zzajp, Class cls, zzajb zzajb, Executor executor) {
        Throwable cause;
        try {
            zzajy.set(zzajp.get());
        } catch (ExecutionException e) {
            cause = e.getCause();
            if (cls.isInstance(cause)) {
                zza(zza(zzi(cause), zzajb, executor), zzajy);
            } else {
                zzajy.setException(cause);
            }
        } catch (InterruptedException e2) {
            cause = e2;
            Thread.currentThread().interrupt();
            if (cls.isInstance(cause)) {
                zzajy.setException(cause);
            } else {
                zza(zza(zzi(cause), zzajb, executor), zzajy);
            }
        } catch (Exception e3) {
            cause = e3;
            if (cls.isInstance(cause)) {
                zza(zza(zzi(cause), zzajb, executor), zzajy);
            } else {
                zzajy.setException(cause);
            }
        }
    }

    public static <T> zzajo<T> zzi(T t) {
        return new zzajo(t);
    }
}
