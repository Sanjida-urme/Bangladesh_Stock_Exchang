package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.dynamic.zzn;
import java.util.List;

@zzzb
public final class zznq extends RelativeLayout {
    private static final float[] zzbrt = new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    @Nullable
    private AnimationDrawable zzbru;

    public zznq(Context context, zznp zznp, LayoutParams layoutParams) {
        View textView;
        super(context);
        zzbq.checkNotNull(zznp);
        Drawable shapeDrawable = new ShapeDrawable(new RoundRectShape(zzbrt, null, null));
        shapeDrawable.getPaint().setColor(zznp.getBackgroundColor());
        setLayoutParams(layoutParams);
        zzbs.zzee().setBackground(this, shapeDrawable);
        ViewGroup.LayoutParams layoutParams2 = new LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(zznp.getText())) {
            ViewGroup.LayoutParams layoutParams3 = new LayoutParams(-2, -2);
            textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(zznp.getText());
            textView.setTextColor(zznp.getTextColor());
            textView.setTextSize((float) zznp.getTextSize());
            zzjk.zzhx();
            int zzc = zzais.zzc(context, 4);
            zzjk.zzhx();
            textView.setPadding(zzc, 0, zzais.zzc(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        textView = new ImageView(context);
        textView.setLayoutParams(layoutParams2);
        textView.setId(1195835394);
        List<zznr> zzjh = zznp.zzjh();
        if (zzjh != null && zzjh.size() > 1) {
            this.zzbru = new AnimationDrawable();
            for (zznr zzjl : zzjh) {
                try {
                    this.zzbru.addFrame((Drawable) zzn.zzx(zzjl.zzjl()), zznp.zzji());
                } catch (Throwable e) {
                    zzaiw.zzb("Error while getting drawable.", e);
                }
            }
            zzbs.zzee().setBackground(textView, this.zzbru);
        } else if (zzjh.size() == 1) {
            try {
                textView.setImageDrawable((Drawable) zzn.zzx(((zznr) zzjh.get(0)).zzjl()));
            } catch (Throwable e2) {
                zzaiw.zzb("Error while getting drawable.", e2);
            }
        }
        addView(textView);
    }

    public final void onAttachedToWindow() {
        if (this.zzbru != null) {
            this.zzbru.start();
        }
        super.onAttachedToWindow();
    }
}
