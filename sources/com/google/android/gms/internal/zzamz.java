package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsResult;

final class zzamz implements OnClickListener {
    private /* synthetic */ JsResult zzdkq;

    zzamz(JsResult jsResult) {
        this.zzdkq = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzdkq.cancel();
    }
}
