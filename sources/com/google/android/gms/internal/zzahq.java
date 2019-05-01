package com.google.android.gms.internal;

import android.app.AlertDialog.Builder;
import android.content.Context;

final class zzahq implements Runnable {
    final /* synthetic */ Context val$context;
    private /* synthetic */ String zzdab;
    private /* synthetic */ boolean zzdac;
    private /* synthetic */ boolean zzdad;

    zzahq(zzahp zzahp, Context context, String str, boolean z, boolean z2) {
        this.val$context = context;
        this.zzdab = str;
        this.zzdac = z;
        this.zzdad = z2;
    }

    public final void run() {
        Builder builder = new Builder(this.val$context);
        builder.setMessage(this.zzdab);
        builder.setTitle(this.zzdac ? "Error" : "Info");
        if (this.zzdad) {
            builder.setNeutralButton("Dismiss", null);
        } else {
            builder.setPositiveButton("Learn More", new zzahr(this));
            builder.setNegativeButton("Dismiss", null);
        }
        builder.create().show();
    }
}
