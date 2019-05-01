package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.zzbs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@TargetApi(14)
final class zzgq implements ActivityLifecycleCallbacks {
    @Nullable
    private Activity mActivity;
    private Context mContext;
    private final Object mLock = new Object();
    private boolean zzaqh = false;
    private boolean zzayc = true;
    private boolean zzayd = false;
    private final List<zzgs> zzaye = new ArrayList();
    private final List<zzhf> zzayf = new ArrayList();
    private Runnable zzayg;
    private long zzayh;

    zzgq() {
    }

    private final void setActivity(Activity activity) {
        synchronized (this.mLock) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.mActivity = activity;
            }
        }
    }

    @Nullable
    public final Activity getActivity() {
        return this.mActivity;
    }

    @Nullable
    public final Context getContext() {
        return this.mContext;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.mLock) {
            if (this.mActivity == null) {
                return;
            }
            if (this.mActivity.equals(activity)) {
                this.mActivity = null;
            }
            Iterator it = this.zzayf.iterator();
            while (it.hasNext()) {
                try {
                    if (((zzhf) it.next()).zza(activity)) {
                        it.remove();
                    }
                } catch (Throwable e) {
                    zzbs.zzeg().zza(e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                    zzaiw.zzb("onActivityStateChangedListener threw exception.", e);
                }
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        setActivity(activity);
        synchronized (this.mLock) {
            Iterator it = this.zzayf.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        this.zzayd = true;
        if (this.zzayg != null) {
            zzagr.zzczc.removeCallbacks(this.zzayg);
        }
        Handler handler = zzagr.zzczc;
        Runnable zzgr = new zzgr(this);
        this.zzayg = zzgr;
        handler.postDelayed(zzgr, this.zzayh);
    }

    public final void onActivityResumed(Activity activity) {
        setActivity(activity);
        this.zzayd = false;
        int i = this.zzayc ^ 1;
        this.zzayc = true;
        if (this.zzayg != null) {
            zzagr.zzczc.removeCallbacks(this.zzayg);
        }
        synchronized (this.mLock) {
            Iterator it = this.zzayf.iterator();
            while (it.hasNext()) {
                it.next();
            }
            if (i != 0) {
                for (zzgs zzg : this.zzaye) {
                    try {
                        zzg.zzg(true);
                    } catch (Throwable e) {
                        zzaiw.zzb("OnForegroundStateChangedListener threw exception.", e);
                    }
                }
            } else {
                zzaiw.zzbw("App is still foreground.");
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        setActivity(activity);
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void zza(Application application, Context context) {
        if (!this.zzaqh) {
            application.registerActivityLifecycleCallbacks(this);
            if (context instanceof Activity) {
                setActivity((Activity) context);
            }
            this.mContext = application;
            this.zzayh = ((Long) zzbs.zzep().zzd(zzmq.zzbjr)).longValue();
            this.zzaqh = true;
        }
    }

    public final void zza(zzgs zzgs) {
        synchronized (this.mLock) {
            this.zzaye.add(zzgs);
        }
    }
}
