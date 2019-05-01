package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;

@zzzb
public final class zzakg {
    public static void zza(View view, OnGlobalLayoutListener onGlobalLayoutListener) {
        new zzakh(view, onGlobalLayoutListener).zzqy();
    }

    public static void zza(View view, OnScrollChangedListener onScrollChangedListener) {
        new zzaki(view, onScrollChangedListener).zzqy();
    }
}
