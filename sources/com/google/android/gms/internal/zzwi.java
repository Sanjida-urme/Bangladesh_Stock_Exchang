package com.google.android.gms.internal;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.dynamic.zzn;
import com.google.android.gms.dynamic.zzp;

@zzzb
public final class zzwi extends zzp<zzwm> {
    public zzwi() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public final zzwj zze(Activity activity) {
        try {
            IBinder zzl = ((zzwm) zzdb(activity)).zzl(zzn.zzy(activity));
            if (zzl == null) {
                return null;
            }
            IInterface queryLocalInterface = zzl.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return queryLocalInterface instanceof zzwj ? (zzwj) queryLocalInterface : new zzwl(zzl);
        } catch (Throwable e) {
            zzaiw.zzc("Could not create remote AdOverlay.", e);
            return null;
        }
    }

    protected final /* synthetic */ Object zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof zzwm ? (zzwm) queryLocalInterface : new zzwn(iBinder);
    }
}
