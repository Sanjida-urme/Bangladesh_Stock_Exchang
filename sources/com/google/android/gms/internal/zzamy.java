package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsResult;

final class zzamy implements OnCancelListener {
    private /* synthetic */ JsResult zzdkq;

    zzamy(JsResult jsResult) {
        this.zzdkq = jsResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.zzdkq.cancel();
    }
}
