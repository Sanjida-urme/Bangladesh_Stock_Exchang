package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import com.google.android.gms.internal.zzama;
import com.google.android.gms.internal.zzzb;

@zzzb
public final class zzi {
    public final int index;
    public final ViewGroup parent;
    public final Context zzaif;
    public final LayoutParams zzchd;

    public zzi(zzama zzama) throws zzg {
        this.zzchd = zzama.getLayoutParams();
        ViewParent parent = zzama.getParent();
        this.zzaif = zzama.zzsl();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new zzg("Could not get the parent of the WebView for an overlay.");
        }
        this.parent = (ViewGroup) parent;
        ViewGroup viewGroup = this.parent;
        if (zzama == null) {
            throw null;
        }
        View view = (View) zzama;
        this.index = viewGroup.indexOfChild(view);
        viewGroup = this.parent;
        if (zzama == null) {
            throw null;
        }
        viewGroup.removeView(view);
        zzama.zzac(true);
    }
}
