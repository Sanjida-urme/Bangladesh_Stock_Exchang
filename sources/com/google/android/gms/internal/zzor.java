package com.google.android.gms.internal;

import android.graphics.Point;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

@zzzb
public final class zzor extends zzpi implements OnClickListener, OnTouchListener, OnGlobalLayoutListener, OnScrollChangedListener {
    static final String[] zzbto = new String[]{NativeAppInstallAd.ASSET_MEDIA_VIDEO, NativeContentAd.ASSET_MEDIA_VIDEO};
    private final Object mLock = new Object();
    @Nullable
    private zzoa zzbsk;
    @Nullable
    private View zzbtt;
    private Point zzbtv = new Point();
    private Point zzbtw = new Point();
    @Nullable
    private WeakReference<zzfy> zzbtx = new WeakReference(null);
    private final WeakReference<View> zzbub;
    private final Map<String, WeakReference<View>> zzbuc = new HashMap();
    private final Map<String, WeakReference<View>> zzbud = new HashMap();
    private final Map<String, WeakReference<View>> zzbue = new HashMap();

    public zzor(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        zzbs.zzez();
        zzakg.zza(view, (OnGlobalLayoutListener) this);
        zzbs.zzez();
        zzakg.zza(view, (OnScrollChangedListener) this);
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        this.zzbub = new WeakReference(view);
        zzh(hashMap);
        this.zzbue.putAll(this.zzbuc);
        zzi(hashMap2);
        this.zzbue.putAll(this.zzbud);
        zzmq.initialize(view.getContext());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zza(com.google.android.gms.internal.zzoe r7) {
        /*
        r6 = this;
        r0 = r6.mLock;
        monitor-enter(r0);
        r1 = zzbto;	 Catch:{ all -> 0x003b }
        r2 = r1.length;	 Catch:{ all -> 0x003b }
        r3 = 0;
    L_0x0007:
        if (r3 >= r2) goto L_0x001f;
    L_0x0009:
        r4 = r1[r3];	 Catch:{ all -> 0x003b }
        r5 = r6.zzbue;	 Catch:{ all -> 0x003b }
        r4 = r5.get(r4);	 Catch:{ all -> 0x003b }
        r4 = (java.lang.ref.WeakReference) r4;	 Catch:{ all -> 0x003b }
        if (r4 == 0) goto L_0x001c;
    L_0x0015:
        r1 = r4.get();	 Catch:{ all -> 0x003b }
        r1 = (android.view.View) r1;	 Catch:{ all -> 0x003b }
        goto L_0x0020;
    L_0x001c:
        r3 = r3 + 1;
        goto L_0x0007;
    L_0x001f:
        r1 = 0;
    L_0x0020:
        r2 = r1 instanceof android.widget.FrameLayout;	 Catch:{ all -> 0x003b }
        if (r2 != 0) goto L_0x0029;
    L_0x0024:
        r7.zzkc();	 Catch:{ all -> 0x003b }
        monitor-exit(r0);	 Catch:{ all -> 0x003b }
        return;
    L_0x0029:
        r2 = new com.google.android.gms.internal.zzot;	 Catch:{ all -> 0x003b }
        r2.<init>(r6, r1);	 Catch:{ all -> 0x003b }
        r3 = r7 instanceof com.google.android.gms.internal.zznz;	 Catch:{ all -> 0x003b }
        if (r3 == 0) goto L_0x0036;
    L_0x0032:
        r7.zzb(r1, r2);	 Catch:{ all -> 0x003b }
        goto L_0x0039;
    L_0x0036:
        r7.zza(r1, r2);	 Catch:{ all -> 0x003b }
    L_0x0039:
        monitor-exit(r0);	 Catch:{ all -> 0x003b }
        return;
    L_0x003b:
        r7 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x003b }
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzor.zza(com.google.android.gms.internal.zzoe):void");
    }

    private final boolean zza(String[] strArr) {
        for (Object obj : strArr) {
            if (this.zzbuc.get(obj) != null) {
                return true;
            }
        }
        for (Object obj2 : strArr) {
            if (this.zzbud.get(obj2) != null) {
                return false;
            }
        }
        return false;
    }

    private final void zzg(@Nullable View view) {
        synchronized (this.mLock) {
            if (this.zzbsk != null) {
                zzoa zzjz = this.zzbsk instanceof zznz ? ((zznz) this.zzbsk).zzjz() : this.zzbsk;
                if (zzjz != null) {
                    zzjz.zzg(view);
                }
            }
        }
    }

    private final void zzh(Map<String, View> map) {
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            View view = (View) entry.getValue();
            if (view != null) {
                this.zzbuc.put(str, new WeakReference(view));
                if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str)) {
                    view.setOnTouchListener(this);
                    view.setClickable(true);
                    view.setOnClickListener(this);
                }
            }
        }
    }

    private final void zzi(Map<String, View> map) {
        for (Entry entry : map.entrySet()) {
            View view = (View) entry.getValue();
            if (view != null) {
                this.zzbud.put((String) entry.getKey(), new WeakReference(view));
                view.setOnTouchListener(this);
            }
        }
    }

    private final int zzt(int i) {
        synchronized (this.mLock) {
            zzjk.zzhx();
            i = zzais.zzd(this.zzbsk.getContext(), i);
        }
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r9) {
        /*
        r8 = this;
        r0 = r8.mLock;
        monitor-enter(r0);
        r1 = r8.zzbsk;	 Catch:{ all -> 0x0090 }
        if (r1 != 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r0);	 Catch:{ all -> 0x0090 }
        return;
    L_0x0009:
        r1 = r8.zzbub;	 Catch:{ all -> 0x0090 }
        r1 = r1.get();	 Catch:{ all -> 0x0090 }
        r7 = r1;
        r7 = (android.view.View) r7;	 Catch:{ all -> 0x0090 }
        if (r7 != 0) goto L_0x0016;
    L_0x0014:
        monitor-exit(r0);	 Catch:{ all -> 0x0090 }
        return;
    L_0x0016:
        r5 = new android.os.Bundle;	 Catch:{ all -> 0x0090 }
        r5.<init>();	 Catch:{ all -> 0x0090 }
        r1 = "x";
        r2 = r8.zzbtv;	 Catch:{ all -> 0x0090 }
        r2 = r2.x;	 Catch:{ all -> 0x0090 }
        r2 = r8.zzt(r2);	 Catch:{ all -> 0x0090 }
        r2 = (float) r2;	 Catch:{ all -> 0x0090 }
        r5.putFloat(r1, r2);	 Catch:{ all -> 0x0090 }
        r1 = "y";
        r2 = r8.zzbtv;	 Catch:{ all -> 0x0090 }
        r2 = r2.y;	 Catch:{ all -> 0x0090 }
        r2 = r8.zzt(r2);	 Catch:{ all -> 0x0090 }
        r2 = (float) r2;	 Catch:{ all -> 0x0090 }
        r5.putFloat(r1, r2);	 Catch:{ all -> 0x0090 }
        r1 = "start_x";
        r2 = r8.zzbtw;	 Catch:{ all -> 0x0090 }
        r2 = r2.x;	 Catch:{ all -> 0x0090 }
        r2 = r8.zzt(r2);	 Catch:{ all -> 0x0090 }
        r2 = (float) r2;	 Catch:{ all -> 0x0090 }
        r5.putFloat(r1, r2);	 Catch:{ all -> 0x0090 }
        r1 = "start_y";
        r2 = r8.zzbtw;	 Catch:{ all -> 0x0090 }
        r2 = r2.y;	 Catch:{ all -> 0x0090 }
        r2 = r8.zzt(r2);	 Catch:{ all -> 0x0090 }
        r2 = (float) r2;	 Catch:{ all -> 0x0090 }
        r5.putFloat(r1, r2);	 Catch:{ all -> 0x0090 }
        r1 = r8.zzbtt;	 Catch:{ all -> 0x0090 }
        if (r1 == 0) goto L_0x0087;
    L_0x0057:
        r1 = r8.zzbtt;	 Catch:{ all -> 0x0090 }
        r1 = r1.equals(r9);	 Catch:{ all -> 0x0090 }
        if (r1 == 0) goto L_0x0087;
    L_0x005f:
        r1 = r8.zzbsk;	 Catch:{ all -> 0x0090 }
        r1 = r1 instanceof com.google.android.gms.internal.zznz;	 Catch:{ all -> 0x0090 }
        if (r1 == 0) goto L_0x0080;
    L_0x0065:
        r1 = r8.zzbsk;	 Catch:{ all -> 0x0090 }
        r1 = (com.google.android.gms.internal.zznz) r1;	 Catch:{ all -> 0x0090 }
        r1 = r1.zzjz();	 Catch:{ all -> 0x0090 }
        if (r1 == 0) goto L_0x008e;
    L_0x006f:
        r1 = r8.zzbsk;	 Catch:{ all -> 0x0090 }
        r1 = (com.google.android.gms.internal.zznz) r1;	 Catch:{ all -> 0x0090 }
        r2 = r1.zzjz();	 Catch:{ all -> 0x0090 }
        r4 = "1007";
        r6 = r8.zzbue;	 Catch:{ all -> 0x0090 }
    L_0x007b:
        r3 = r9;
        r2.zza(r3, r4, r5, r6, r7);	 Catch:{ all -> 0x0090 }
        goto L_0x008e;
    L_0x0080:
        r2 = r8.zzbsk;	 Catch:{ all -> 0x0090 }
        r4 = "1007";
        r6 = r8.zzbue;	 Catch:{ all -> 0x0090 }
        goto L_0x007b;
    L_0x0087:
        r1 = r8.zzbsk;	 Catch:{ all -> 0x0090 }
        r2 = r8.zzbue;	 Catch:{ all -> 0x0090 }
        r1.zza(r9, r2, r5, r7);	 Catch:{ all -> 0x0090 }
    L_0x008e:
        monitor-exit(r0);	 Catch:{ all -> 0x0090 }
        return;
    L_0x0090:
        r9 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0090 }
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzor.onClick(android.view.View):void");
    }

    public final void onGlobalLayout() {
        synchronized (this.mLock) {
            if (this.zzbsk != null) {
                View view = (View) this.zzbub.get();
                if (view != null) {
                    this.zzbsk.zzc(view, this.zzbue);
                }
            }
        }
    }

    public final void onScrollChanged() {
        synchronized (this.mLock) {
            if (this.zzbsk != null) {
                View view = (View) this.zzbub.get();
                if (view != null) {
                    this.zzbsk.zzc(view, this.zzbue);
                }
            }
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.mLock) {
            if (this.zzbsk == null) {
                return false;
            }
            View view2 = (View) this.zzbub.get();
            if (view2 == null) {
                return false;
            }
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            Point point = new Point((int) (motionEvent.getRawX() - ((float) iArr[0])), (int) (motionEvent.getRawY() - ((float) iArr[1])));
            this.zzbtv = point;
            if (motionEvent.getAction() == 0) {
                this.zzbtw = point;
            }
            motionEvent = MotionEvent.obtain(motionEvent);
            motionEvent.setLocation((float) point.x, (float) point.y);
            this.zzbsk.zzd(motionEvent);
            motionEvent.recycle();
            return false;
        }
    }

    public final void unregisterNativeAd() {
        synchronized (this.mLock) {
            this.zzbtt = null;
            this.zzbsk = null;
            this.zzbtv = null;
            this.zzbtw = null;
        }
    }

    public final void zza(IObjectWrapper iObjectWrapper) {
        synchronized (this.mLock) {
            ViewGroup viewGroup = null;
            zzg(null);
            Object zzx = zzn.zzx(iObjectWrapper);
            if (zzx instanceof zzoe) {
                zzoe zzoe = (zzoe) zzx;
                if (zzoe.zzjx()) {
                    View view;
                    View view2 = (View) this.zzbub.get();
                    if (!(this.zzbsk == null || view2 == null)) {
                        if (((Boolean) zzbs.zzep().zzd(zzmq.zzbmx)).booleanValue()) {
                            this.zzbsk.zzb(view2, this.zzbue);
                        }
                    }
                    synchronized (this.mLock) {
                        if (this.zzbsk instanceof zzoe) {
                            zzoe zzoe2 = (zzoe) this.zzbsk;
                            View view3 = (View) this.zzbub.get();
                            if (!(zzoe2 == null || zzoe2.getContext() == null || view3 == null || !zzbs.zzfa().zzt(view3.getContext()))) {
                                zzgc zzke = zzoe2.zzke();
                                if (zzke != null) {
                                    zzke.zzu(false);
                                }
                                zzfy zzfy = (zzfy) this.zzbtx.get();
                                if (!(zzfy == null || zzke == null)) {
                                    zzfy.zzb(zzke);
                                }
                            }
                        }
                    }
                    if ((this.zzbsk instanceof zznz) && ((zznz) this.zzbsk).zzjy()) {
                        ((zznz) this.zzbsk).zzc(zzoe);
                    } else {
                        this.zzbsk = zzoe;
                        if (zzoe instanceof zznz) {
                            ((zznz) zzoe).zzc(null);
                        }
                    }
                    WeakReference weakReference = (WeakReference) this.zzbue.get(NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW);
                    if (weakReference == null) {
                        zzaiw.zzco("Ad choices asset view is not provided.");
                    } else {
                        view = (View) weakReference.get();
                        if (view instanceof ViewGroup) {
                            viewGroup = (ViewGroup) view;
                        }
                        if (viewGroup != null) {
                            this.zzbtt = zzoe.zza((OnClickListener) this, true);
                            if (this.zzbtt != null) {
                                this.zzbue.put(NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE, new WeakReference(this.zzbtt));
                                this.zzbuc.put(NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE, new WeakReference(this.zzbtt));
                                viewGroup.removeAllViews();
                                viewGroup.addView(this.zzbtt);
                            }
                        }
                    }
                    zzoe.zza(view2, this.zzbuc, this.zzbud, (OnTouchListener) this, (OnClickListener) this);
                    zzagr.zzczc.post(new zzos(this, zzoe));
                    zzg(view2);
                    synchronized (this.mLock) {
                        if (this.zzbsk instanceof zzoe) {
                            zzoe zzoe3 = (zzoe) this.zzbsk;
                            view = (View) this.zzbub.get();
                            if (!(zzoe3 == null || zzoe3.getContext() == null || view == null || !zzbs.zzfa().zzt(view.getContext()))) {
                                zzfy zzfy2 = (zzfy) this.zzbtx.get();
                                if (zzfy2 == null) {
                                    zzfy2 = new zzfy(view.getContext(), view);
                                    this.zzbtx = new WeakReference(zzfy2);
                                }
                                zzfy2.zza(zzoe3.zzke());
                            }
                        }
                    }
                    return;
                }
                zzaiw.m3e("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
                return;
            }
            zzaiw.zzco("Not an instance of native engine. This is most likely a transient error");
        }
    }
}
