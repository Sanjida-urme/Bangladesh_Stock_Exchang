package com.google.android.gms.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

final class zzadz implements Runnable {
    private /* synthetic */ Bitmap val$bitmap;
    private /* synthetic */ zzady zzcut;

    zzadz(zzady zzady, Bitmap bitmap) {
        this.zzcut = zzady;
        this.val$bitmap = bitmap;
    }

    public final void run() {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.val$bitmap.compress(CompressFormat.PNG, 0, byteArrayOutputStream);
        synchronized (this.zzcut.mLock) {
            this.zzcut.zzcul.zzpin = new zzfid();
            this.zzcut.zzcul.zzpin.zzpji = byteArrayOutputStream.toByteArray();
            this.zzcut.zzcul.zzpin.mimeType = "image/png";
            this.zzcut.zzcul.zzpin.zzpig = Integer.valueOf(1);
        }
    }
}
