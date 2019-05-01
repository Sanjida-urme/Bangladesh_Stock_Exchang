package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.internal.zzbem;
import java.util.List;

public final class WakeLockEvent extends StatsEvent {
    public static final Creator<WakeLockEvent> CREATOR = new zzd();
    private final long mTimeout;
    private int zzdzm;
    private final long zzgbb;
    private int zzgbc;
    private final String zzgbd;
    private final String zzgbe;
    private final String zzgbf;
    private final int zzgbg;
    private final List<String> zzgbh;
    private final String zzgbi;
    private final long zzgbj;
    private int zzgbk;
    private final String zzgbl;
    private final float zzgbm;
    private long zzgbn;

    WakeLockEvent(int i, long j, int i2, String str, int i3, List<String> list, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5) {
        this.zzdzm = i;
        this.zzgbb = j;
        this.zzgbc = i2;
        this.zzgbd = str;
        this.zzgbe = str3;
        this.zzgbf = str5;
        this.zzgbg = i3;
        this.zzgbn = -1;
        this.zzgbh = list;
        this.zzgbi = str2;
        this.zzgbj = j2;
        this.zzgbk = i4;
        this.zzgbl = str4;
        this.zzgbm = f;
        this.mTimeout = j3;
    }

    public WakeLockEvent(long j, int i, String str, int i2, List<String> list, String str2, long j2, int i3, String str3, String str4, float f, long j3, String str5) {
        this(2, j, i, str, i2, list, str2, j2, i3, str3, str4, f, j3, str5);
    }

    public final int getEventType() {
        return this.zzgbc;
    }

    public final long getTimeMillis() {
        return this.zzgbb;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = zzbem.zze(parcel);
        zzbem.zzc(parcel, 1, this.zzdzm);
        zzbem.zza(parcel, 2, getTimeMillis());
        zzbem.zza(parcel, 4, this.zzgbd, false);
        zzbem.zzc(parcel, 5, this.zzgbg);
        zzbem.zzb(parcel, 6, this.zzgbh, false);
        zzbem.zza(parcel, 8, this.zzgbj);
        zzbem.zza(parcel, 10, this.zzgbe, false);
        zzbem.zzc(parcel, 11, getEventType());
        zzbem.zza(parcel, 12, this.zzgbi, false);
        zzbem.zza(parcel, 13, this.zzgbl, false);
        zzbem.zzc(parcel, 14, this.zzgbk);
        zzbem.zza(parcel, 15, this.zzgbm);
        zzbem.zza(parcel, 16, this.mTimeout);
        zzbem.zza(parcel, 17, this.zzgbf, false);
        zzbem.zzai(parcel, i);
    }

    public final long zzals() {
        return this.zzgbn;
    }

    public final String zzalt() {
        String str = "\t";
        String str2 = this.zzgbd;
        String str3 = "\t";
        int i = this.zzgbg;
        String str4 = "\t";
        String join = this.zzgbh == null ? "" : TextUtils.join(",", r0.zzgbh);
        String str5 = "\t";
        int i2 = r0.zzgbk;
        String str6 = "\t";
        String str7 = r0.zzgbe == null ? "" : r0.zzgbe;
        String str8 = "\t";
        String str9 = r0.zzgbl == null ? "" : r0.zzgbl;
        String str10 = "\t";
        String str11 = "\t";
        float f = r0.zzgbm;
        String str12 = r0.zzgbf == null ? "" : r0.zzgbf;
        int i3 = i2;
        StringBuilder stringBuilder = new StringBuilder(((((((((((((String.valueOf(str).length() + 37) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()) + String.valueOf(join).length()) + String.valueOf(str5).length()) + String.valueOf(str6).length()) + String.valueOf(str7).length()) + String.valueOf(str8).length()) + String.valueOf(str9).length()) + String.valueOf(str10).length()) + String.valueOf(str11).length()) + String.valueOf(str12).length());
        stringBuilder.append(str);
        stringBuilder.append(str2);
        stringBuilder.append(str3);
        stringBuilder.append(i);
        stringBuilder.append(str4);
        stringBuilder.append(join);
        stringBuilder.append(str5);
        stringBuilder.append(i3);
        stringBuilder.append(str6);
        stringBuilder.append(str7);
        stringBuilder.append(str8);
        stringBuilder.append(str9);
        stringBuilder.append(str10);
        stringBuilder.append(f);
        stringBuilder.append(str11);
        stringBuilder.append(str12);
        return stringBuilder.toString();
    }
}
