package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.ViewSwitcher;
import com.google.android.gms.internal.zzafj;
import com.google.android.gms.internal.zzahj;
import com.google.android.gms.internal.zzair;
import com.google.android.gms.internal.zzama;
import java.util.ArrayList;
import java.util.List;

public final class zzbu extends ViewSwitcher {
    private final zzahj zzaum;
    @Nullable
    private final zzair zzaun;
    private boolean zzauo = true;

    public zzbu(Context context, String str, String str2, OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        super(context);
        this.zzaum = new zzahj(context);
        this.zzaum.setAdUnitId(str);
        this.zzaum.zzci(str2);
        if (context instanceof Activity) {
            this.zzaun = new zzair((Activity) context, this, onGlobalLayoutListener, onScrollChangedListener);
        } else {
            this.zzaun = new zzair(null, this, onGlobalLayoutListener, onScrollChangedListener);
        }
        this.zzaun.zzqo();
    }

    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.zzaun != null) {
            this.zzaun.onAttachedToWindow();
        }
    }

    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.zzaun != null) {
            this.zzaun.onDetachedFromWindow();
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.zzauo) {
            this.zzaum.zze(motionEvent);
        }
        return false;
    }

    public final void removeAllViews() {
        int i;
        List arrayList = new ArrayList();
        int i2 = 0;
        for (i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != null && (childAt instanceof zzama)) {
                arrayList.add((zzama) childAt);
            }
        }
        super.removeAllViews();
        ArrayList arrayList2 = (ArrayList) arrayList;
        i = arrayList2.size();
        while (i2 < i) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((zzama) obj).destroy();
        }
    }

    public final zzahj zzfj() {
        return this.zzaum;
    }

    public final void zzfk() {
        zzafj.m5v("Disable position monitoring on adFrame.");
        if (this.zzaun != null) {
            this.zzaun.zzqp();
        }
    }

    public final void zzfl() {
        zzafj.m5v("Enable debug gesture detector on adFrame.");
        this.zzauo = true;
    }

    public final void zzfm() {
        zzafj.m5v("Disable debug gesture detector on adFrame.");
        this.zzauo = false;
    }
}
