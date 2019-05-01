package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.google.android.gms.ads.internal.zzbs;

final class zzvu implements OnClickListener {
    private /* synthetic */ zzvt zzceu;

    zzvu(zzvt zzvt) {
        this.zzceu = zzvt;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent createIntent = this.zzceu.createIntent();
        zzbs.zzec();
        zzagr.zza(this.zzceu.mContext, createIntent);
    }
}
