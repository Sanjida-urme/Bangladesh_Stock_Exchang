package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;

@zzzb
public final class zzpb extends Image {
    private final Drawable mDrawable;
    private final Uri mUri;
    private final double zzbrw;
    private final zzoy zzbui;

    public zzpb(zzoy zzoy) {
        Drawable drawable;
        double d;
        this.zzbui = zzoy;
        Uri uri = null;
        try {
            IObjectWrapper zzjl = this.zzbui.zzjl();
            if (zzjl != null) {
                drawable = (Drawable) zzn.zzx(zzjl);
                this.mDrawable = drawable;
                uri = this.zzbui.getUri();
                this.mUri = uri;
                d = 1.0d;
                d = this.zzbui.getScale();
                this.zzbrw = d;
            }
        } catch (Throwable e) {
            zzaiw.zzb("Failed to get drawable.", e);
        }
        drawable = null;
        this.mDrawable = drawable;
        try {
            uri = this.zzbui.getUri();
        } catch (Throwable e2) {
            zzaiw.zzb("Failed to get uri.", e2);
        }
        this.mUri = uri;
        d = 1.0d;
        try {
            d = this.zzbui.getScale();
        } catch (Throwable e3) {
            zzaiw.zzb("Failed to get scale.", e3);
        }
        this.zzbrw = d;
    }

    public final Drawable getDrawable() {
        return this.mDrawable;
    }

    public final double getScale() {
        return this.zzbrw;
    }

    public final Uri getUri() {
        return this.mUri;
    }
}
