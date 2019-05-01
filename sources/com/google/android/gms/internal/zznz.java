package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;
import java.lang.ref.WeakReference;
import java.util.Map;

@zzzb
public final class zznz extends zzoe {
    private Object mLock;
    @Nullable
    private zzuo zzbst;
    @Nullable
    private zzur zzbsu;
    private final zzob zzbsv;
    @Nullable
    private zzoa zzbsw;
    private boolean zzbsx;

    private zznz(Context context, zzob zzob, zzcs zzcs, zzoc zzoc) {
        super(context, zzob, null, zzcs, null, zzoc, null, null);
        this.zzbsx = false;
        this.mLock = new Object();
        this.zzbsv = zzob;
    }

    public zznz(Context context, zzob zzob, zzcs zzcs, zzuo zzuo, zzoc zzoc) {
        this(context, zzob, zzcs, zzoc);
        this.zzbst = zzuo;
    }

    public zznz(Context context, zzob zzob, zzcs zzcs, zzur zzur, zzoc zzoc) {
        this(context, zzob, zzcs, zzoc);
        this.zzbsu = zzur;
    }

    @Nullable
    public final View zza(OnClickListener onClickListener, boolean z) {
        synchronized (this.mLock) {
            if (this.zzbsw != null) {
                View zza = this.zzbsw.zza(onClickListener, z);
                return zza;
            }
            IObjectWrapper zzme;
            try {
                if (this.zzbst != null) {
                    zzme = this.zzbst.zzme();
                } else {
                    if (this.zzbsu != null) {
                        zzme = this.zzbsu.zzme();
                    }
                    zzme = null;
                }
            } catch (Throwable e) {
                zzaiw.zzc("Failed to call getAdChoicesContent", e);
            }
            if (zzme != null) {
                zza = (View) zzn.zzx(zzme);
                return zza;
            }
            return null;
        }
    }

    public final void zza(View view, Map<String, WeakReference<View>> map) {
        zzbq.zzga("recordImpression must be called on the main UI thread.");
        synchronized (this.mLock) {
            this.zzbtb = true;
            if (this.zzbsw != null) {
                this.zzbsw.zza(view, (Map) map);
                this.zzbsv.recordImpression();
            } else {
                try {
                    zzob zzob;
                    if (this.zzbst != null && !this.zzbst.getOverrideImpressionRecording()) {
                        this.zzbst.recordImpression();
                        zzob = this.zzbsv;
                    } else if (!(this.zzbsu == null || this.zzbsu.getOverrideImpressionRecording())) {
                        this.zzbsu.recordImpression();
                        zzob = this.zzbsv;
                    }
                    zzob.recordImpression();
                } catch (Throwable e) {
                    zzaiw.zzc("Failed to call recordImpression", e);
                }
            }
        }
    }

    public final void zza(View view, Map<String, WeakReference<View>> map, Bundle bundle, View view2) {
        zzbq.zzga("performClick must be called on the main UI thread.");
        synchronized (this.mLock) {
            if (this.zzbsw != null) {
                this.zzbsw.zza(view, map, bundle, view2);
                this.zzbsv.onAdClicked();
            } else {
                try {
                    if (!(this.zzbst == null || this.zzbst.getOverrideClickHandling())) {
                        this.zzbst.zzh(zzn.zzy(view));
                        this.zzbsv.onAdClicked();
                    }
                    if (!(this.zzbsu == null || this.zzbsu.getOverrideClickHandling())) {
                        this.zzbsu.zzh(zzn.zzy(view));
                        this.zzbsv.onAdClicked();
                    }
                } catch (Throwable e) {
                    zzaiw.zzc("Failed to call performClick", e);
                }
            }
        }
    }

    public final void zza(View view, @Nullable Map<String, WeakReference<View>> map, @Nullable Map<String, WeakReference<View>> map2, OnTouchListener onTouchListener, OnClickListener onClickListener) {
        synchronized (this.mLock) {
            this.zzbsx = true;
            try {
                if (this.zzbst != null) {
                    this.zzbst.zzi(zzn.zzy(view));
                } else if (this.zzbsu != null) {
                    this.zzbsu.zzi(zzn.zzy(view));
                }
            } catch (Throwable e) {
                zzaiw.zzc("Failed to call prepareAd", e);
            }
            this.zzbsx = false;
        }
    }

    public final void zzb(View view, Map<String, WeakReference<View>> map) {
        synchronized (this.mLock) {
            try {
                if (this.zzbst != null) {
                    this.zzbst.zzj(zzn.zzy(view));
                } else if (this.zzbsu != null) {
                    this.zzbsu.zzj(zzn.zzy(view));
                }
            } catch (Throwable e) {
                zzaiw.zzc("Failed to call untrackView", e);
            }
        }
    }

    public final void zzc(@Nullable zzoa zzoa) {
        synchronized (this.mLock) {
            this.zzbsw = zzoa;
        }
    }

    public final boolean zzjw() {
        synchronized (this.mLock) {
            if (this.zzbsw != null) {
                boolean zzjw = this.zzbsw.zzjw();
                return zzjw;
            }
            zzjw = this.zzbsv.zzcq();
            return zzjw;
        }
    }

    public final boolean zzjx() {
        synchronized (this.mLock) {
            if (this.zzbsw != null) {
                boolean zzjx = this.zzbsw.zzjx();
                return zzjx;
            }
            zzjx = this.zzbsv.zzcr();
            return zzjx;
        }
    }

    public final boolean zzjy() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzbsx;
        }
        return z;
    }

    public final zzoa zzjz() {
        zzoa zzoa;
        synchronized (this.mLock) {
            zzoa = this.zzbsw;
        }
        return zzoa;
    }

    @Nullable
    public final zzama zzka() {
        return null;
    }

    public final void zzkb() {
    }

    public final void zzkc() {
    }
}
