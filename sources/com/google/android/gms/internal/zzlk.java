package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.zzo;
import com.google.android.gms.dynamic.zzn;
import com.google.android.gms.dynamic.zzp;

@zzzb
public final class zzlk extends zzp<zzks> {
    public zzlk() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    protected final /* synthetic */ Object zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return queryLocalInterface instanceof zzks ? (zzks) queryLocalInterface : new zzkt(iBinder);
    }

    public final zzkp zzh(Context context) {
        try {
            IBinder zza = ((zzks) zzdb(context)).zza(zzn.zzy(context), zzo.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            if (zza == null) {
                return null;
            }
            IInterface queryLocalInterface = zza.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof zzkp ? (zzkp) queryLocalInterface : new zzkr(zza);
        } catch (Throwable e) {
            zzaiw.zzc("Could not get remote MobileAdsSettingManager.", e);
            return null;
        }
    }
}
