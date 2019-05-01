package com.google.android.gms.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.zzb;

@zzzb
public class zziw extends zzbej {
    public static final Creator<zziw> CREATOR = new zzix();
    public final int height;
    public final int heightPixels;
    public final int width;
    public final int widthPixels;
    public final String zzbda;
    public final boolean zzbdb;
    public final zziw[] zzbdc;
    public final boolean zzbdd;
    public final boolean zzbde;
    public boolean zzbdf;

    public zziw() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false);
    }

    public zziw(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    public zziw(Context context, AdSize[] adSizeArr) {
        int height;
        int i;
        int i2;
        String adSize;
        int i3;
        AdSize adSize2 = adSizeArr[0];
        this.zzbdb = false;
        this.zzbde = adSize2.isFluid();
        if (this.zzbde) {
            this.width = AdSize.BANNER.getWidth();
            height = AdSize.BANNER.getHeight();
        } else {
            this.width = adSize2.getWidth();
            height = adSize2.getHeight();
        }
        this.height = height;
        Object obj = this.width == -1 ? 1 : null;
        Object obj2 = this.height == -2 ? 1 : null;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (obj != null) {
            double d;
            zzjk.zzhx();
            if (zzais.zzbf(context)) {
                zzjk.zzhx();
                if (zzais.zzbg(context)) {
                    i = displayMetrics.widthPixels;
                    zzjk.zzhx();
                    i -= zzais.zzbh(context);
                    this.widthPixels = i;
                    d = (double) (((float) this.widthPixels) / displayMetrics.density);
                    i2 = (int) d;
                    if (d - ((double) i2) >= 0.01d) {
                        i2++;
                    }
                }
            }
            i = displayMetrics.widthPixels;
            this.widthPixels = i;
            d = (double) (((float) this.widthPixels) / displayMetrics.density);
            i2 = (int) d;
            if (d - ((double) i2) >= 0.01d) {
                i2++;
            }
        } else {
            i2 = this.width;
            zzjk.zzhx();
            this.widthPixels = zzais.zza(displayMetrics, this.width);
        }
        i = obj2 != null ? zzd(displayMetrics) : this.height;
        zzjk.zzhx();
        this.heightPixels = zzais.zza(displayMetrics, i);
        if (obj == null) {
            if (obj2 == null) {
                adSize = this.zzbde ? "320x50_mb" : adSize2.toString();
                this.zzbda = adSize;
                if (adSizeArr.length <= 1) {
                    this.zzbdc = new zziw[adSizeArr.length];
                    for (i3 = 0; i3 < adSizeArr.length; i3++) {
                        this.zzbdc[i3] = new zziw(context, adSizeArr[i3]);
                    }
                } else {
                    this.zzbdc = null;
                }
                this.zzbdd = false;
                this.zzbdf = false;
            }
        }
        StringBuilder stringBuilder = new StringBuilder(26);
        stringBuilder.append(i2);
        stringBuilder.append("x");
        stringBuilder.append(i);
        stringBuilder.append("_as");
        adSize = stringBuilder.toString();
        this.zzbda = adSize;
        if (adSizeArr.length <= 1) {
            this.zzbdc = null;
        } else {
            this.zzbdc = new zziw[adSizeArr.length];
            for (i3 = 0; i3 < adSizeArr.length; i3++) {
                this.zzbdc[i3] = new zziw(context, adSizeArr[i3]);
            }
        }
        this.zzbdd = false;
        this.zzbdf = false;
    }

    public zziw(zziw zziw, zziw[] zziwArr) {
        this(zziw.zzbda, zziw.height, zziw.heightPixels, zziw.zzbdb, zziw.width, zziw.widthPixels, zziwArr, zziw.zzbdd, zziw.zzbde, zziw.zzbdf);
    }

    zziw(String str, int i, int i2, boolean z, int i3, int i4, zziw[] zziwArr, boolean z2, boolean z3, boolean z4) {
        this.zzbda = str;
        this.height = i;
        this.heightPixels = i2;
        this.zzbdb = z;
        this.width = i3;
        this.widthPixels = i4;
        this.zzbdc = zziwArr;
        this.zzbdd = z2;
        this.zzbde = z3;
        this.zzbdf = z4;
    }

    public static int zzb(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    public static int zzc(DisplayMetrics displayMetrics) {
        return (int) (((float) zzd(displayMetrics)) * displayMetrics.density);
    }

    private static int zzd(DisplayMetrics displayMetrics) {
        int i = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        return i <= 400 ? 32 : i <= 720 ? 50 : 90;
    }

    public static zziw zzg(Context context) {
        return new zziw("320x50_mb", 0, 0, false, 0, 0, null, true, false, false);
    }

    public static zziw zzhp() {
        return new zziw("reward_mb", 0, 0, true, 0, 0, null, false, false, false);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int zze = zzbem.zze(parcel);
        zzbem.zza(parcel, 2, this.zzbda, false);
        zzbem.zzc(parcel, 3, this.height);
        zzbem.zzc(parcel, 4, this.heightPixels);
        zzbem.zza(parcel, 5, this.zzbdb);
        zzbem.zzc(parcel, 6, this.width);
        zzbem.zzc(parcel, 7, this.widthPixels);
        zzbem.zza(parcel, 8, this.zzbdc, i, false);
        zzbem.zza(parcel, 9, this.zzbdd);
        zzbem.zza(parcel, 10, this.zzbde);
        zzbem.zza(parcel, 11, this.zzbdf);
        zzbem.zzai(parcel, zze);
    }

    public final AdSize zzhq() {
        return zzb.zza(this.width, this.height, this.zzbda);
    }
}
