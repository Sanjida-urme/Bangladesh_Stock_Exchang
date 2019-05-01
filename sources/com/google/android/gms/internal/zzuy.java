package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;
import java.util.ArrayList;
import java.util.List;

@zzzb
public final class zzuy extends zzup {
    private final NativeAppInstallAdMapper zzced;

    public zzuy(NativeAppInstallAdMapper nativeAppInstallAdMapper) {
        this.zzced = nativeAppInstallAdMapper;
    }

    public final String getBody() {
        return this.zzced.getBody();
    }

    public final String getCallToAction() {
        return this.zzced.getCallToAction();
    }

    public final Bundle getExtras() {
        return this.zzced.getExtras();
    }

    public final String getHeadline() {
        return this.zzced.getHeadline();
    }

    public final List getImages() {
        List<Image> images = this.zzced.getImages();
        if (images == null) {
            return null;
        }
        List arrayList = new ArrayList();
        for (Image image : images) {
            arrayList.add(new zznr(image.getDrawable(), image.getUri(), image.getScale()));
        }
        return arrayList;
    }

    public final boolean getOverrideClickHandling() {
        return this.zzced.getOverrideClickHandling();
    }

    public final boolean getOverrideImpressionRecording() {
        return this.zzced.getOverrideImpressionRecording();
    }

    public final String getPrice() {
        return this.zzced.getPrice();
    }

    public final double getStarRating() {
        return this.zzced.getStarRating();
    }

    public final String getStore() {
        return this.zzced.getStore();
    }

    public final zzku getVideoController() {
        return this.zzced.getVideoController() != null ? this.zzced.getVideoController().zzbe() : null;
    }

    public final void recordImpression() {
        this.zzced.recordImpression();
    }

    public final void zzh(IObjectWrapper iObjectWrapper) {
        this.zzced.handleClick((View) zzn.zzx(iObjectWrapper));
    }

    public final void zzi(IObjectWrapper iObjectWrapper) {
        this.zzced.trackView((View) zzn.zzx(iObjectWrapper));
    }

    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zzced.untrackView((View) zzn.zzx(iObjectWrapper));
    }

    public final zzoy zzjm() {
        Image icon = this.zzced.getIcon();
        return icon != null ? new zznr(icon.getDrawable(), icon.getUri(), icon.getScale()) : null;
    }

    public final IObjectWrapper zzjr() {
        return null;
    }

    public final zzou zzjs() {
        return null;
    }

    public final IObjectWrapper zzme() {
        View adChoicesContent = this.zzced.getAdChoicesContent();
        return adChoicesContent == null ? null : zzn.zzy(adChoicesContent);
    }

    public final IObjectWrapper zzmf() {
        View zzua = this.zzced.zzua();
        return zzua == null ? null : zzn.zzy(zzua);
    }
}
