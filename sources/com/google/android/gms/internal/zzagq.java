package com.google.android.gms.internal;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class zzagq implements ThreadFactory {
    private final AtomicInteger zzcvo = new AtomicInteger(1);
    private /* synthetic */ String zzczb;

    zzagq(String str) {
        this.zzczb = str;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.zzczb;
        int andIncrement = this.zzcvo.getAndIncrement();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 23);
        stringBuilder.append("AdWorker(");
        stringBuilder.append(str);
        stringBuilder.append(") #");
        stringBuilder.append(andIncrement);
        return new Thread(runnable, stringBuilder.toString());
    }
}
