package com.google.android.gms.internal;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.internal.gmsg.zzd;
import com.google.android.gms.ads.internal.zzba;
import com.google.android.gms.ads.internal.zzbs;
import java.lang.ref.WeakReference;

@zzzb
public final class zzxy {
    private final Context mContext;
    private final Object mLock = new Object();
    private final zznd zzamo;
    private int zzaug = -1;
    private int zzauh = -1;
    private zzail zzaui;
    private final zzcs zzbta;
    private final zzaev zzchv;
    private final zzba zzcjq;
    private OnGlobalLayoutListener zzcjr;
    private OnScrollChangedListener zzcjs;

    public zzxy(Context context, zzcs zzcs, zzaev zzaev, zznd zznd, zzba zzba) {
        this.mContext = context;
        this.zzbta = zzcs;
        this.zzchv = zzaev;
        this.zzamo = zznd;
        this.zzcjq = zzba;
        this.zzaui = new zzail(200);
    }

    private final OnGlobalLayoutListener zza(WeakReference<zzama> weakReference) {
        if (this.zzcjr == null) {
            this.zzcjr = new zzye(this, weakReference);
        }
        return this.zzcjr;
    }

    private final void zza(WeakReference<zzama> weakReference, boolean z) {
        if (weakReference != null) {
            zzama zzama = (zzama) weakReference.get();
            if (zzama == null) {
                return;
            }
            if (zzama == null) {
                throw null;
            }
            View view = (View) zzama;
            if (view != null) {
                if (z && !this.zzaui.tryAcquire()) {
                    return;
                }
                if (zzama == null) {
                    throw null;
                }
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                zzjk.zzhx();
                int zzd = zzais.zzd(this.mContext, iArr[0]);
                zzjk.zzhx();
                int zzd2 = zzais.zzd(this.mContext, iArr[1]);
                synchronized (this.mLock) {
                    if (!(this.zzaug == zzd && this.zzauh == zzd2)) {
                        this.zzaug = zzd;
                        this.zzauh = zzd2;
                        zzama.zzsq().zza(this.zzaug, this.zzauh, z ^ true);
                    }
                }
            }
        }
    }

    private final OnScrollChangedListener zzb(WeakReference<zzama> weakReference) {
        if (this.zzcjs == null) {
            this.zzcjs = new zzyf(this, weakReference);
        }
        return this.zzcjs;
    }

    private final void zzf(zzama zzama) {
        zzamb zzsq = zzama.zzsq();
        zzsq.zza("/video", zzd.zzbvn);
        zzsq.zza("/videoMeta", zzd.zzbvo);
        zzsq.zza("/precache", new zzalx());
        zzsq.zza("/delayPageLoaded", zzd.zzbvr);
        zzsq.zza("/instrument", zzd.zzbvp);
        zzsq.zza("/log", zzd.zzbvi);
        zzsq.zza("/videoClicked", zzd.zzbvj);
        zzsq.zza("/trackActiveViewUnit", new zzyc(this));
        zzsq.zza("/untrackActiveViewUnit", new zzyd(this));
    }

    final zzama zznd() throws zzamm {
        return zzbs.zzed().zza(this.mContext, zzanp.zztw(), "native-video", false, false, this.zzbta, this.zzchv.zzcpe.zzatd, this.zzamo, null, this.zzcjq.zzbk(), this.zzchv.zzcwc);
    }
}
