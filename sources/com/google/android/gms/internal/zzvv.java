package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class zzvv implements OnClickListener {
    private /* synthetic */ zzvt zzceu;

    zzvv(zzvt zzvt) {
        this.zzceu = zzvt;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzceu.zzbl("Operation denied by user.");
    }
}
