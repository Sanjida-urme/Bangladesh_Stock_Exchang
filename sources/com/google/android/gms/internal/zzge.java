package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class zzge implements zzgl {
    private /* synthetic */ Activity val$activity;
    private /* synthetic */ Bundle zzaxh;

    zzge(zzgd zzgd, Activity activity, Bundle bundle) {
        this.val$activity = activity;
        this.zzaxh = bundle;
    }

    public final void zza(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.val$activity, this.zzaxh);
    }
}
