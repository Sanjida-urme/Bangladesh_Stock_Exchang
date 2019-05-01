package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.zzbej;

public abstract class StatsEvent extends zzbej implements ReflectedParcelable {
    public abstract int getEventType();

    public abstract long getTimeMillis();

    public String toString() {
        long timeMillis = getTimeMillis();
        String str = "\t";
        int eventType = getEventType();
        String str2 = "\t";
        long zzals = zzals();
        String zzalt = zzalt();
        StringBuilder stringBuilder = new StringBuilder(((String.valueOf(str).length() + 51) + String.valueOf(str2).length()) + String.valueOf(zzalt).length());
        stringBuilder.append(timeMillis);
        stringBuilder.append(str);
        stringBuilder.append(eventType);
        stringBuilder.append(str2);
        stringBuilder.append(zzals);
        stringBuilder.append(zzalt);
        return stringBuilder.toString();
    }

    public abstract long zzals();

    public abstract String zzalt();
}
