package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsPromptResult;

final class zzanb implements OnCancelListener {
    private /* synthetic */ JsPromptResult zzdkr;

    zzanb(JsPromptResult jsPromptResult) {
        this.zzdkr = jsPromptResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.zzdkr.cancel();
    }
}
