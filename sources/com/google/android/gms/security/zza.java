package com.google.android.gms.security;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.zze;
import com.google.android.gms.security.ProviderInstaller.ProviderInstallListener;

final class zza extends AsyncTask<Void, Void, Integer> {
    private /* synthetic */ Context val$context;
    private /* synthetic */ ProviderInstallListener zzjzg;

    zza(Context context, ProviderInstallListener providerInstallListener) {
        this.val$context = context;
        this.zzjzg = providerInstallListener;
    }

    private final Integer zzb(Void... voidArr) {
        int i;
        try {
            ProviderInstaller.installIfNeeded(this.val$context);
            i = 0;
        } catch (GooglePlayServicesRepairableException e) {
            i = e.getConnectionStatusCode();
        } catch (GooglePlayServicesNotAvailableException e2) {
            i = e2.errorCode;
        }
        return Integer.valueOf(i);
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return zzb((Void[]) objArr);
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() == 0) {
            this.zzjzg.onProviderInstalled();
            return;
        }
        ProviderInstaller.zzjze;
        this.zzjzg.onProviderInstallFailed(num.intValue(), zze.zza(this.val$context, num.intValue(), "pi"));
    }
}
