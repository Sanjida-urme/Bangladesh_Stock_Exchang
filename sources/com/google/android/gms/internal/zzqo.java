package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.dynamic.zzn;
import com.google.android.gms.dynamic.zzp;
import java.util.HashMap;

@zzzb
public final class zzqo extends zzp<zzpk> {
    public zzqo() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    public final zzph zzb(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        try {
            IBinder zza = ((zzpk) zzdb(view.getContext())).zza(zzn.zzy(view), zzn.zzy(hashMap), zzn.zzy(hashMap2));
            if (zza == null) {
                return null;
            }
            IInterface queryLocalInterface = zza.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            return queryLocalInterface instanceof zzph ? (zzph) queryLocalInterface : new zzpj(zza);
        } catch (Throwable e) {
            zzaiw.zzc("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        }
    }

    protected final /* synthetic */ Object zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return queryLocalInterface instanceof zzpk ? (zzpk) queryLocalInterface : new zzpl(iBinder);
    }
}
