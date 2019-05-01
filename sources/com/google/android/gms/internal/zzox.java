package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo;
import com.google.android.gms.ads.formats.NativeAd.Image;
import java.util.ArrayList;
import java.util.List;

@zzzb
public final class zzox extends AdChoicesInfo {
    private final List<Image> zzbrm = new ArrayList();
    private final zzou zzbug;
    private String zzbuh;

    public zzox(zzou zzou) {
        this.zzbug = zzou;
        try {
            this.zzbuh = this.zzbug.getText();
        } catch (Throwable e) {
            zzaiw.zzb("Error while obtaining attribution text.", e);
            this.zzbuh = "";
        }
        try {
            for (Object next : zzou.zzjg()) {
                zzoy zzpa;
                if (next instanceof IBinder) {
                    IBinder iBinder = (IBinder) next;
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        zzpa = queryLocalInterface instanceof zzoy ? (zzoy) queryLocalInterface : new zzpa(iBinder);
                        if (zzpa != null) {
                            this.zzbrm.add(new zzpb(zzpa));
                        }
                    }
                }
                zzpa = null;
                if (zzpa != null) {
                    this.zzbrm.add(new zzpb(zzpa));
                }
            }
        } catch (Throwable e2) {
            zzaiw.zzb("Error while obtaining image.", e2);
        }
    }

    public final List<Image> getImages() {
        return this.zzbrm;
    }

    public final CharSequence getText() {
        return this.zzbuh;
    }
}
