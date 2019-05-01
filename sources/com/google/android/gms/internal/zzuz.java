package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;
import java.util.ArrayList;
import java.util.List;

@zzzb
public final class zzuz extends zzus {
    private final NativeContentAdMapper zzcee;

    public zzuz(NativeContentAdMapper nativeContentAdMapper) {
        this.zzcee = nativeContentAdMapper;
    }

    public final String getAdvertiser() {
        return this.zzcee.getAdvertiser();
    }

    public final String getBody() {
        return this.zzcee.getBody();
    }

    public final String getCallToAction() {
        return this.zzcee.getCallToAction();
    }

    public final Bundle getExtras() {
        return this.zzcee.getExtras();
    }

    public final String getHeadline() {
        return this.zzcee.getHeadline();
    }

    public final List getImages() {
        List<Image> images = this.zzcee.getImages();
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
        return this.zzcee.getOverrideClickHandling();
    }

    public final boolean getOverrideImpressionRecording() {
        return this.zzcee.getOverrideImpressionRecording();
    }

    public final zzku getVideoController() {
        return this.zzcee.getVideoController() != null ? this.zzcee.getVideoController().zzbe() : null;
    }

    public final void recordImpression() {
        this.zzcee.recordImpression();
    }

    public final void zzh(IObjectWrapper iObjectWrapper) {
        this.zzcee.handleClick((View) zzn.zzx(iObjectWrapper));
    }

    public final void zzi(IObjectWrapper iObjectWrapper) {
        this.zzcee.trackView((View) zzn.zzx(iObjectWrapper));
    }

    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zzcee.untrackView((View) zzn.zzx(iObjectWrapper));
    }

    public final IObjectWrapper zzjr() {
        return null;
    }

    public final zzou zzjs() {
        return null;
    }

    public final zzoy zzjt() {
        Image logo = this.zzcee.getLogo();
        return logo != null ? new zznr(logo.getDrawable(), logo.getUri(), logo.getScale()) : null;
    }

    public final IObjectWrapper zzme() {
        View adChoicesContent = this.zzcee.getAdChoicesContent();
        return adChoicesContent == null ? null : zzn.zzy(adChoicesContent);
    }

    public final IObjectWrapper zzmf() {
        View zzua = this.zzcee.zzua();
        return zzua == null ? null : zzn.zzy(zzua);
    }
}
