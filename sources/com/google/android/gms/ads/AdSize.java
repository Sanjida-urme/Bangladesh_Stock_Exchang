package com.google.android.gms.ads;

import android.content.Context;
import android.support.v4.provider.FontsContractCompat.FontRequestCallback;
import com.google.android.gms.internal.zzais;
import com.google.android.gms.internal.zziw;
import com.google.android.gms.internal.zzjk;

public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final AdSize BANNER = new AdSize(320, 50, "320x50_mb");
    public static final AdSize FLUID = new AdSize(-3, -4, "fluid");
    public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");
    public static final int FULL_WIDTH = -1;
    public static final AdSize LARGE_BANNER = new AdSize(320, 100, "320x100_as");
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, 250, "300x250_as");
    public static final AdSize SEARCH = new AdSize(-3, 0, "search_v2");
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");
    public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, 600, "160x600_as");
    public static final AdSize zzakv = new AdSize(50, 50, "50x50_mb");
    private final int zzakw;
    private final int zzakx;
    private final String zzaky;

    public AdSize(int i, int i2) {
        String valueOf = i == -1 ? "FULL" : String.valueOf(i);
        String valueOf2 = i2 == -2 ? "AUTO" : String.valueOf(i2);
        String str = "_as";
        StringBuilder stringBuilder = new StringBuilder(((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()) + String.valueOf(str).length());
        stringBuilder.append(valueOf);
        stringBuilder.append("x");
        stringBuilder.append(valueOf2);
        stringBuilder.append(str);
        this(i, i2, stringBuilder.toString());
    }

    AdSize(int i, int i2, String str) {
        StringBuilder stringBuilder;
        if (i < 0 && i != -1 && i != -3) {
            stringBuilder = new StringBuilder(37);
            stringBuilder.append("Invalid width for AdSize: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i2 >= 0 || i2 == -2 || i2 == -4) {
            this.zzakw = i;
            this.zzakx = i2;
            this.zzaky = str;
        } else {
            stringBuilder = new StringBuilder(38);
            stringBuilder.append("Invalid height for AdSize: ");
            stringBuilder.append(i2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdSize)) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        return this.zzakw == adSize.zzakw && this.zzakx == adSize.zzakx && this.zzaky.equals(adSize.zzaky);
    }

    public final int getHeight() {
        return this.zzakx;
    }

    public final int getHeightInPixels(Context context) {
        switch (this.zzakx) {
            case -4:
            case FontRequestCallback.FAIL_REASON_FONT_LOAD_ERROR /*-3*/:
                return -1;
            case -2:
                return zziw.zzc(context.getResources().getDisplayMetrics());
            default:
                zzjk.zzhx();
                return zzais.zzc(context, this.zzakx);
        }
    }

    public final int getWidth() {
        return this.zzakw;
    }

    public final int getWidthInPixels(Context context) {
        int i = this.zzakw;
        if (i == -1) {
            return zziw.zzb(context.getResources().getDisplayMetrics());
        }
        switch (i) {
            case -4:
            case FontRequestCallback.FAIL_REASON_FONT_LOAD_ERROR /*-3*/:
                return -1;
            default:
                zzjk.zzhx();
                return zzais.zzc(context, this.zzakw);
        }
    }

    public final int hashCode() {
        return this.zzaky.hashCode();
    }

    public final boolean isAutoHeight() {
        return this.zzakx == -2;
    }

    public final boolean isFluid() {
        return this.zzakw == -3 && this.zzakx == -4;
    }

    public final boolean isFullWidth() {
        return this.zzakw == -1;
    }

    public final String toString() {
        return this.zzaky;
    }
}
