package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsResult;

final class zzana implements OnClickListener {
    private /* synthetic */ JsResult zzdkq;

    zzana(JsResult jsResult) {
        this.zzdkq = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzdkq.confirm();
    }
}
