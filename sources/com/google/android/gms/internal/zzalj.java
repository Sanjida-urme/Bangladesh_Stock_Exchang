package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbs;
import java.util.concurrent.TimeUnit;

@zzzb
public final class zzalj {
    private final Context mContext;
    private final zzaiy zzaqi;
    private final String zzcqb;
    @Nullable
    private final zznd zzdeh;
    private boolean zzdel;
    @Nullable
    private final zznb zzdgr;
    private final zzahu zzdgs = new zzahx().zza("min_1", Double.MIN_VALUE, 1.0d).zza("1_5", 1.0d, 5.0d).zza("5_10", 5.0d, 10.0d).zza("10_20", 10.0d, 20.0d).zza("20_30", 20.0d, 30.0d).zza("30_max", 30.0d, Double.MAX_VALUE).zzql();
    private final long[] zzdgt;
    private final String[] zzdgu;
    private boolean zzdgv;
    private boolean zzdgw;
    private boolean zzdgx;
    private boolean zzdgy;
    private zzaku zzdgz;
    private boolean zzdha;
    private boolean zzdhb;
    private long zzdhc;

    public zzalj(Context context, zzaiy zzaiy, String str, @Nullable zznd zznd, @Nullable zznb zznb) {
        int i = 0;
        this.zzdgv = false;
        this.zzdgw = false;
        this.zzdgx = false;
        this.zzdgy = false;
        this.zzdhc = -1;
        this.mContext = context;
        this.zzaqi = zzaiy;
        this.zzcqb = str;
        this.zzdeh = zznd;
        this.zzdgr = zznb;
        String str2 = (String) zzbs.zzep().zzd(zzmq.zzbgx);
        if (str2 == null) {
            r1.zzdgu = new String[0];
            r1.zzdgt = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        r1.zzdgu = new String[split.length];
        r1.zzdgt = new long[split.length];
        while (i < split.length) {
            try {
                r1.zzdgt[i] = Long.parseLong(split[i]);
            } catch (Throwable e) {
                zzaiw.zzc("Unable to parse frame hash target time number.", e);
                r1.zzdgt[i] = -1;
            }
            i++;
        }
    }

    public final void onStop() {
        if (((Boolean) zzbs.zzep().zzd(zzmq.zzbgw)).booleanValue() && !this.zzdha) {
            String valueOf;
            String valueOf2;
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString("request", this.zzcqb);
            bundle.putString("player", this.zzdgz.zzqz());
            for (zzahw zzahw : this.zzdgs.getBuckets()) {
                valueOf = String.valueOf("fps_c_");
                valueOf2 = String.valueOf(zzahw.name);
                bundle.putString(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), Integer.toString(zzahw.count));
                valueOf = String.valueOf("fps_p_");
                valueOf2 = String.valueOf(zzahw.name);
                bundle.putString(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), Double.toString(zzahw.zzdam));
            }
            for (int i = 0; i < this.zzdgt.length; i++) {
                String str = this.zzdgu[i];
                if (str != null) {
                    valueOf = "fh_";
                    valueOf2 = String.valueOf(Long.valueOf(this.zzdgt[i]));
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
                    stringBuilder.append(valueOf);
                    stringBuilder.append(valueOf2);
                    bundle.putString(stringBuilder.toString(), str);
                }
            }
            zzbs.zzec().zza(this.mContext, this.zzaqi.zzcp, "gmob-apps", bundle, true);
            this.zzdha = true;
        }
    }

    public final void zza(zzaku zzaku) {
        zzmw.zza(this.zzdeh, this.zzdgr, "vpc2");
        this.zzdgv = true;
        if (this.zzdeh != null) {
            this.zzdeh.zzf("vpn", zzaku.zzqz());
        }
        this.zzdgz = zzaku;
    }

    public final void zzb(zzaku zzaku) {
        if (this.zzdgx && !r0.zzdgy) {
            zzmw.zza(r0.zzdeh, r0.zzdgr, "vff2");
            r0.zzdgy = true;
        }
        long nanoTime = zzbs.zzei().nanoTime();
        if (r0.zzdel && r0.zzdhb && r0.zzdhc != -1) {
            r0.zzdgs.zza(((double) TimeUnit.SECONDS.toNanos(1)) / ((double) (nanoTime - r0.zzdhc)));
        }
        r0.zzdhb = r0.zzdel;
        r0.zzdhc = nanoTime;
        nanoTime = ((Long) zzbs.zzep().zzd(zzmq.zzbgy)).longValue();
        long currentPosition = (long) zzaku.getCurrentPosition();
        int i = 0;
        while (i < r0.zzdgu.length) {
            if (r0.zzdgu[i] != null || nanoTime <= Math.abs(currentPosition - r0.zzdgt[i])) {
                zzaku zzaku2 = zzaku;
                i++;
            } else {
                String[] strArr = r0.zzdgu;
                int i2 = 8;
                Bitmap bitmap = zzaku.getBitmap(8, 8);
                long j = 63;
                int i3 = 0;
                long j2 = 0;
                while (i3 < i2) {
                    long j3 = j;
                    int i4 = 0;
                    while (i4 < i2) {
                        int pixel = bitmap.getPixel(i4, i3);
                        long j4 = j2 | (((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1 : 0) << ((int) j3));
                        i4++;
                        j3--;
                        j2 = j4;
                        i2 = 8;
                    }
                    i3++;
                    j = j3;
                    i2 = 8;
                }
                strArr[i] = String.format("%016X", new Object[]{Long.valueOf(j2)});
                return;
            }
        }
    }

    public final void zzrf() {
        if (this.zzdgv && !this.zzdgw) {
            zzmw.zza(this.zzdeh, this.zzdgr, "vfr2");
            this.zzdgw = true;
        }
    }

    public final void zzse() {
        this.zzdel = true;
        if (this.zzdgw && !this.zzdgx) {
            zzmw.zza(this.zzdeh, this.zzdgr, "vfp2");
            this.zzdgx = true;
        }
    }

    public final void zzsf() {
        this.zzdel = false;
    }
}
