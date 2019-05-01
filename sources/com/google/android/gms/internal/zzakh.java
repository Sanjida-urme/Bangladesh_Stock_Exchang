package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.gms.ads.internal.zzbs;
import java.lang.ref.WeakReference;

@zzzb
final class zzakh extends zzakj implements OnGlobalLayoutListener {
    private final WeakReference<OnGlobalLayoutListener> zzddg;

    public zzakh(View view, OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.zzddg = new WeakReference(onGlobalLayoutListener);
    }

    public final void onGlobalLayout() {
        OnGlobalLayoutListener onGlobalLayoutListener = (OnGlobalLayoutListener) this.zzddg.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
        } else {
            detach();
        }
    }

    protected final void zza(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    protected final void zzb(ViewTreeObserver viewTreeObserver) {
        zzbs.zzee().zza(viewTreeObserver, (OnGlobalLayoutListener) this);
    }
}
