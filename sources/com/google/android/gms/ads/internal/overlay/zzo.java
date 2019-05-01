package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import com.google.android.gms.internal.zzais;
import com.google.android.gms.internal.zzjk;
import com.google.android.gms.internal.zzzb;

@zzzb
public final class zzo extends FrameLayout implements OnClickListener {
    private final ImageButton zzchs;
    private final zzt zzcht;

    public zzo(Context context, zzp zzp, zzt zzt) {
        super(context);
        this.zzcht = zzt;
        setOnClickListener(this);
        this.zzchs = new ImageButton(context);
        this.zzchs.setImageResource(17301527);
        this.zzchs.setBackgroundColor(0);
        this.zzchs.setOnClickListener(this);
        ImageButton imageButton = this.zzchs;
        zzjk.zzhx();
        int zzc = zzais.zzc(context, zzp.paddingLeft);
        zzjk.zzhx();
        int zzc2 = zzais.zzc(context, 0);
        zzjk.zzhx();
        int zzc3 = zzais.zzc(context, zzp.paddingRight);
        zzjk.zzhx();
        imageButton.setPadding(zzc, zzc2, zzc3, zzais.zzc(context, zzp.paddingBottom));
        this.zzchs.setContentDescription("Interstitial close button");
        zzjk.zzhx();
        zzais.zzc(context, zzp.size);
        View view = this.zzchs;
        zzjk.zzhx();
        zzc = zzais.zzc(context, (zzp.size + zzp.paddingLeft) + zzp.paddingRight);
        zzjk.zzhx();
        addView(view, new LayoutParams(zzc, zzais.zzc(context, zzp.size + zzp.paddingBottom), 17));
    }

    public final void onClick(View view) {
        if (this.zzcht != null) {
            this.zzcht.zzmn();
        }
    }

    public final void zza(boolean z, boolean z2) {
        ImageButton imageButton;
        int i;
        if (!z2) {
            imageButton = this.zzchs;
            i = 0;
        } else if (z) {
            imageButton = this.zzchs;
            i = 4;
        } else {
            imageButton = this.zzchs;
            i = 8;
        }
        imageButton.setVisibility(i);
    }
}
