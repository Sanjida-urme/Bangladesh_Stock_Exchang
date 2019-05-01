package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.util.zzq;
import java.io.InputStream;

final class zzxv implements zzaie<zznr> {
    private /* synthetic */ String zzcfm;
    private /* synthetic */ zzxr zzciz;
    private /* synthetic */ boolean zzcjj;
    private /* synthetic */ double zzcjk;
    private /* synthetic */ boolean zzcjl;

    zzxv(zzxr zzxr, boolean z, double d, boolean z2, String str) {
        this.zzciz = zzxr;
        this.zzcjj = z;
        this.zzcjk = d;
        this.zzcjl = z2;
        this.zzcfm = str;
    }

    @TargetApi(19)
    private final zznr zzd(InputStream inputStream) {
        Bitmap decodeStream;
        Options options = new Options();
        options.inDensity = (int) (this.zzcjk * 160.0d);
        if (!this.zzcjl) {
            options.inPreferredConfig = Config.RGB_565;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            decodeStream = BitmapFactory.decodeStream(inputStream, null, options);
        } catch (Throwable e) {
            zzaiw.zzb("Error grabbing image.", e);
            decodeStream = null;
        }
        if (decodeStream == null) {
            this.zzciz.zzd(2, this.zzcjj);
            return null;
        }
        long uptimeMillis2 = SystemClock.uptimeMillis();
        if (zzq.zzama() && zzafj.zzpt()) {
            int width = decodeStream.getWidth();
            int height = decodeStream.getHeight();
            int allocationByteCount = decodeStream.getAllocationByteCount();
            long j = uptimeMillis2 - uptimeMillis;
            boolean z = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder stringBuilder = new StringBuilder(108);
            stringBuilder.append("Decoded image w: ");
            stringBuilder.append(width);
            stringBuilder.append(" h:");
            stringBuilder.append(height);
            stringBuilder.append(" bytes: ");
            stringBuilder.append(allocationByteCount);
            stringBuilder.append(" time: ");
            stringBuilder.append(j);
            stringBuilder.append(" on ui thread: ");
            stringBuilder.append(z);
            zzafj.m5v(stringBuilder.toString());
        }
        return new zznr(new BitmapDrawable(Resources.getSystem(), decodeStream), Uri.parse(this.zzcfm), this.zzcjk);
    }

    @TargetApi(19)
    public final /* synthetic */ Object zze(InputStream inputStream) {
        return zzd(inputStream);
    }

    public final /* synthetic */ Object zznc() {
        this.zzciz.zzd(2, this.zzcjj);
        return null;
    }
}
