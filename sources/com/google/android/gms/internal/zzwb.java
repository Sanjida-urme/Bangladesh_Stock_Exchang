package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class zzwb implements OnClickListener {
    private /* synthetic */ zzvz zzcfo;

    zzwb(zzvz zzvz) {
        this.zzcfo = zzvz;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzcfo.zzbl("User canceled the download.");
    }
}
