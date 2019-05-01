package com.google.android.gms.internal;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class zzaen implements ThreadFactory {
    private final AtomicInteger zzcvo = new AtomicInteger(1);

    zzaen(zzael zzael) {
    }

    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.zzcvo.getAndIncrement();
        StringBuilder stringBuilder = new StringBuilder(42);
        stringBuilder.append("AdWorker(SCION_TASK_EXECUTOR) #");
        stringBuilder.append(andIncrement);
        return new Thread(runnable, stringBuilder.toString());
    }
}
