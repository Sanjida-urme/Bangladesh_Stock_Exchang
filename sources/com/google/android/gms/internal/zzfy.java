package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzbs;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;

@zzzb
@TargetApi(14)
public final class zzfy implements ActivityLifecycleCallbacks, OnAttachStateChangeListener, OnGlobalLayoutListener, OnScrollChangedListener {
    private static final long zzawk = ((Long) zzbs.zzep().zzd(zzmq.zzbkz)).longValue();
    private final Context mApplicationContext;
    private zzail zzaui = new zzail(zzawk);
    private final WindowManager zzavc;
    private final PowerManager zzavd;
    private final KeyguardManager zzave;
    private boolean zzavl = false;
    @Nullable
    private BroadcastReceiver zzavm;
    private Application zzawl;
    private WeakReference<ViewTreeObserver> zzawm;
    private WeakReference<View> zzawn;
    private zzgd zzawo;
    private int zzawp = -1;
    private HashSet<zzgc> zzawq = new HashSet();
    private DisplayMetrics zzawr;

    public zzfy(Context context, View view) {
        this.mApplicationContext = context.getApplicationContext();
        this.zzavc = (WindowManager) context.getSystemService("window");
        this.zzavd = (PowerManager) this.mApplicationContext.getSystemService("power");
        this.zzave = (KeyguardManager) context.getSystemService("keyguard");
        if (this.mApplicationContext instanceof Application) {
            this.zzawl = (Application) this.mApplicationContext;
            this.zzawo = new zzgd((Application) this.mApplicationContext, this);
        }
        this.zzawr = context.getResources().getDisplayMetrics();
        View view2 = this.zzawn != null ? (View) this.zzawn.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            zze(view2);
        }
        this.zzawn = new WeakReference(view);
        if (view != null) {
            if (zzbs.zzee().isAttachedToWindow(view)) {
                zzd(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    private final Rect zza(Rect rect) {
        return new Rect(zzn(rect.left), zzn(rect.top), zzn(rect.right), zzn(rect.bottom));
    }

    private final void zza(Activity activity, int i) {
        if (this.zzawn != null) {
            Window window = activity.getWindow();
            if (window != null) {
                View peekDecorView = window.peekDecorView();
                View view = (View) this.zzawn.get();
                if (!(view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView())) {
                    this.zzawp = i;
                }
            }
        }
    }

    private final void zzd(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.zzawm = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.zzavm == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.zzavm = new zzga(this);
            this.mApplicationContext.registerReceiver(this.zzavm, intentFilter);
        }
        if (this.zzawl != null) {
            try {
                this.zzawl.registerActivityLifecycleCallbacks(this.zzawo);
            } catch (Throwable e) {
                zzaiw.zzb("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    private final void zze(View view) {
        try {
            if (this.zzawm != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.zzawm.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.zzawm = null;
            }
        } catch (Throwable e) {
            zzaiw.zzb("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Throwable e2) {
            zzaiw.zzb("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        if (this.zzavm != null) {
            try {
                this.mApplicationContext.unregisterReceiver(this.zzavm);
            } catch (Throwable e22) {
                zzaiw.zzb("Failed trying to unregister the receiver", e22);
            } catch (Throwable e222) {
                zzbs.zzeg().zza(e222, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.zzavm = null;
        }
        if (this.zzawl != null) {
            try {
                this.zzawl.unregisterActivityLifecycleCallbacks(this.zzawo);
            } catch (Throwable e2222) {
                zzaiw.zzb("Error registering activity lifecycle callbacks.", e2222);
            }
        }
    }

    private final void zzge() {
        zzbs.zzec();
        zzagr.zzczc.post(new zzfz(this));
    }

    private final void zzm(int i) {
        int i2 = i;
        if (this.zzawq.size() != 0 && r1.zzawn != null) {
            boolean z;
            boolean z2;
            View view = (View) r1.zzawn.get();
            Object obj = i2 == 1 ? 1 : null;
            Object obj2 = view == null ? 1 : null;
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            Rect rect3 = new Rect();
            Rect rect4 = new Rect();
            Rect rect5 = new Rect();
            rect5.right = r1.zzavc.getDefaultDisplay().getWidth();
            rect5.bottom = r1.zzavc.getDefaultDisplay().getHeight();
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            if (view != null) {
                boolean globalVisibleRect = view.getGlobalVisibleRect(rect2);
                boolean localVisibleRect = view.getLocalVisibleRect(rect3);
                view.getHitRect(rect4);
                try {
                    view.getLocationOnScreen(iArr);
                    view.getLocationInWindow(iArr2);
                } catch (Throwable e) {
                    zzaiw.zzb("Failure getting view location.", e);
                }
                rect.left = iArr[0];
                rect.top = iArr[1];
                rect.right = rect.left + view.getWidth();
                rect.bottom = rect.top + view.getHeight();
                z = globalVisibleRect;
                z2 = localVisibleRect;
            } else {
                z = false;
                z2 = false;
            }
            int windowVisibility = view != null ? view.getWindowVisibility() : 8;
            if (r1.zzawp != -1) {
                windowVisibility = r1.zzawp;
            }
            boolean z3 = obj2 == null && zzbs.zzec().zza(view, r1.zzavd, r1.zzave) && z && z2 && windowVisibility == 0;
            if (obj != null && !r1.zzaui.tryAcquire() && z3 == r1.zzavl) {
                return;
            }
            if (z3 || r1.zzavl || i2 != 1) {
                zzgb zzgb = new zzgb(zzbs.zzei().elapsedRealtime(), r1.zzavd.isScreenOn(), view != null ? zzbs.zzee().isAttachedToWindow(view) : false, view != null ? view.getWindowVisibility() : 8, zza(rect5), zza(rect), zza(rect2), z, zza(rect3), z2, zza(rect4), r1.zzawr.density, z3);
                Iterator it = r1.zzawq.iterator();
                while (it.hasNext()) {
                    ((zzgc) it.next()).zza(zzgb);
                }
                r1.zzavl = z3;
            }
        }
    }

    private final int zzn(int i) {
        return (int) (((float) i) / this.zzawr.density);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(activity, 0);
        zzm(3);
        zzge();
    }

    public final void onActivityDestroyed(Activity activity) {
        zzm(3);
        zzge();
    }

    public final void onActivityPaused(Activity activity) {
        zza(activity, 4);
        zzm(3);
        zzge();
    }

    public final void onActivityResumed(Activity activity) {
        zza(activity, 0);
        zzm(3);
        zzge();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzm(3);
        zzge();
    }

    public final void onActivityStarted(Activity activity) {
        zza(activity, 0);
        zzm(3);
        zzge();
    }

    public final void onActivityStopped(Activity activity) {
        zzm(3);
        zzge();
    }

    public final void onGlobalLayout() {
        zzm(2);
        zzge();
    }

    public final void onScrollChanged() {
        zzm(1);
    }

    public final void onViewAttachedToWindow(View view) {
        this.zzawp = -1;
        zzd(view);
        zzm(3);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.zzawp = -1;
        zzm(3);
        zzge();
        zze(view);
    }

    public final void zza(zzgc zzgc) {
        this.zzawq.add(zzgc);
        zzm(3);
    }

    public final void zzb(zzgc zzgc) {
        this.zzawq.remove(zzgc);
    }

    public final void zzgf() {
        zzm(4);
    }
}
