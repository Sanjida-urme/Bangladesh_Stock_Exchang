package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.common.util.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

@zzzb
public final class zzoo extends zzpd implements OnClickListener, OnTouchListener, OnGlobalLayoutListener, OnScrollChangedListener {
    private static String[] zzbto = new String[]{NativeAppInstallAd.ASSET_MEDIA_VIDEO, NativeContentAd.ASSET_MEDIA_VIDEO};
    private final Object mLock = new Object();
    @Nullable
    FrameLayout zzaln;
    @Nullable
    private zzoa zzbsk;
    private final FrameLayout zzbtp;
    private View zzbtq;
    private final boolean zzbtr;
    private Map<String, WeakReference<View>> zzbts = new HashMap();
    @Nullable
    private View zzbtt;
    private boolean zzbtu = false;
    private Point zzbtv = new Point();
    private Point zzbtw = new Point();
    private WeakReference<zzfy> zzbtx = new WeakReference(null);

    @TargetApi(21)
    public zzoo(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.zzbtp = frameLayout;
        this.zzaln = frameLayout2;
        zzbs.zzez();
        zzakg.zza(this.zzbtp, (OnGlobalLayoutListener) this);
        zzbs.zzez();
        zzakg.zza(this.zzbtp, (OnScrollChangedListener) this);
        this.zzbtp.setOnTouchListener(this);
        this.zzbtp.setOnClickListener(this);
        if (frameLayout2 != null && zzq.zzamc()) {
            frameLayout2.setElevation(Float.MAX_VALUE);
        }
        zzmq.initialize(this.zzbtp.getContext());
        this.zzbtr = ((Boolean) zzbs.zzep().zzd(zzmq.zzbne)).booleanValue();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zza(com.google.android.gms.internal.zzoe r7) {
        /*
        r6 = this;
        r0 = r6.mLock;
        monitor-enter(r0);
        r1 = r6.zzbts;	 Catch:{ all -> 0x0044 }
        r7.zzg(r1);	 Catch:{ all -> 0x0044 }
        r1 = r6.zzbts;	 Catch:{ all -> 0x0044 }
        if (r1 == 0) goto L_0x0028;
    L_0x000c:
        r1 = zzbto;	 Catch:{ all -> 0x0044 }
        r2 = r1.length;	 Catch:{ all -> 0x0044 }
        r3 = 0;
    L_0x0010:
        if (r3 >= r2) goto L_0x0028;
    L_0x0012:
        r4 = r1[r3];	 Catch:{ all -> 0x0044 }
        r5 = r6.zzbts;	 Catch:{ all -> 0x0044 }
        r4 = r5.get(r4);	 Catch:{ all -> 0x0044 }
        r4 = (java.lang.ref.WeakReference) r4;	 Catch:{ all -> 0x0044 }
        if (r4 == 0) goto L_0x0025;
    L_0x001e:
        r1 = r4.get();	 Catch:{ all -> 0x0044 }
        r1 = (android.view.View) r1;	 Catch:{ all -> 0x0044 }
        goto L_0x0029;
    L_0x0025:
        r3 = r3 + 1;
        goto L_0x0010;
    L_0x0028:
        r1 = 0;
    L_0x0029:
        r2 = r1 instanceof android.widget.FrameLayout;	 Catch:{ all -> 0x0044 }
        if (r2 != 0) goto L_0x0032;
    L_0x002d:
        r7.zzkc();	 Catch:{ all -> 0x0044 }
        monitor-exit(r0);	 Catch:{ all -> 0x0044 }
        return;
    L_0x0032:
        r2 = new com.google.android.gms.internal.zzoq;	 Catch:{ all -> 0x0044 }
        r2.<init>(r6, r1);	 Catch:{ all -> 0x0044 }
        r3 = r7 instanceof com.google.android.gms.internal.zznz;	 Catch:{ all -> 0x0044 }
        if (r3 == 0) goto L_0x003f;
    L_0x003b:
        r7.zzb(r1, r2);	 Catch:{ all -> 0x0044 }
        goto L_0x0042;
    L_0x003f:
        r7.zza(r1, r2);	 Catch:{ all -> 0x0044 }
    L_0x0042:
        monitor-exit(r0);	 Catch:{ all -> 0x0044 }
        return;
    L_0x0044:
        r7 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0044 }
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzoo.zza(com.google.android.gms.internal.zzoe):void");
    }

    private final void zzg(@Nullable View view) {
        if (this.zzbsk != null) {
            zzoa zzjz = this.zzbsk instanceof zznz ? ((zznz) this.zzbsk).zzjz() : this.zzbsk;
            if (zzjz != null) {
                zzjz.zzg(view);
            }
        }
    }

    private final void zzkf() {
        synchronized (this.mLock) {
            if (!this.zzbtr && this.zzbtu) {
                int measuredWidth = this.zzbtp.getMeasuredWidth();
                int measuredHeight = this.zzbtp.getMeasuredHeight();
                if (!(measuredWidth == 0 || measuredHeight == 0 || this.zzaln == null)) {
                    this.zzaln.setLayoutParams(new LayoutParams(measuredWidth, measuredHeight));
                    this.zzbtu = false;
                }
            }
        }
    }

    private final int zzt(int i) {
        zzjk.zzhx();
        return zzais.zzd(this.zzbsk.getContext(), i);
    }

    public final void destroy() {
        synchronized (this.mLock) {
            if (this.zzaln != null) {
                this.zzaln.removeAllViews();
            }
            this.zzaln = null;
            this.zzbts = null;
            this.zzbtt = null;
            this.zzbsk = null;
            this.zzbtv = null;
            this.zzbtw = null;
            this.zzbtx = null;
            this.zzbtq = null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r8) {
        /*
        r7 = this;
        r0 = r7.mLock;
        monitor-enter(r0);
        r1 = r7.zzbsk;	 Catch:{ all -> 0x0089 }
        if (r1 != 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r0);	 Catch:{ all -> 0x0089 }
        return;
    L_0x0009:
        r4 = new android.os.Bundle;	 Catch:{ all -> 0x0089 }
        r4.<init>();	 Catch:{ all -> 0x0089 }
        r1 = "x";
        r2 = r7.zzbtv;	 Catch:{ all -> 0x0089 }
        r2 = r2.x;	 Catch:{ all -> 0x0089 }
        r2 = r7.zzt(r2);	 Catch:{ all -> 0x0089 }
        r2 = (float) r2;	 Catch:{ all -> 0x0089 }
        r4.putFloat(r1, r2);	 Catch:{ all -> 0x0089 }
        r1 = "y";
        r2 = r7.zzbtv;	 Catch:{ all -> 0x0089 }
        r2 = r2.y;	 Catch:{ all -> 0x0089 }
        r2 = r7.zzt(r2);	 Catch:{ all -> 0x0089 }
        r2 = (float) r2;	 Catch:{ all -> 0x0089 }
        r4.putFloat(r1, r2);	 Catch:{ all -> 0x0089 }
        r1 = "start_x";
        r2 = r7.zzbtw;	 Catch:{ all -> 0x0089 }
        r2 = r2.x;	 Catch:{ all -> 0x0089 }
        r2 = r7.zzt(r2);	 Catch:{ all -> 0x0089 }
        r2 = (float) r2;	 Catch:{ all -> 0x0089 }
        r4.putFloat(r1, r2);	 Catch:{ all -> 0x0089 }
        r1 = "start_y";
        r2 = r7.zzbtw;	 Catch:{ all -> 0x0089 }
        r2 = r2.y;	 Catch:{ all -> 0x0089 }
        r2 = r7.zzt(r2);	 Catch:{ all -> 0x0089 }
        r2 = (float) r2;	 Catch:{ all -> 0x0089 }
        r4.putFloat(r1, r2);	 Catch:{ all -> 0x0089 }
        r1 = r7.zzbtt;	 Catch:{ all -> 0x0089 }
        if (r1 == 0) goto L_0x007e;
    L_0x004a:
        r1 = r7.zzbtt;	 Catch:{ all -> 0x0089 }
        r1 = r1.equals(r8);	 Catch:{ all -> 0x0089 }
        if (r1 == 0) goto L_0x007e;
    L_0x0052:
        r1 = r7.zzbsk;	 Catch:{ all -> 0x0089 }
        r1 = r1 instanceof com.google.android.gms.internal.zznz;	 Catch:{ all -> 0x0089 }
        if (r1 == 0) goto L_0x0075;
    L_0x0058:
        r1 = r7.zzbsk;	 Catch:{ all -> 0x0089 }
        r1 = (com.google.android.gms.internal.zznz) r1;	 Catch:{ all -> 0x0089 }
        r1 = r1.zzjz();	 Catch:{ all -> 0x0089 }
        if (r1 == 0) goto L_0x0087;
    L_0x0062:
        r1 = r7.zzbsk;	 Catch:{ all -> 0x0089 }
        r1 = (com.google.android.gms.internal.zznz) r1;	 Catch:{ all -> 0x0089 }
        r1 = r1.zzjz();	 Catch:{ all -> 0x0089 }
        r3 = "1007";
        r5 = r7.zzbts;	 Catch:{ all -> 0x0089 }
        r6 = r7.zzbtp;	 Catch:{ all -> 0x0089 }
    L_0x0070:
        r2 = r8;
        r1.zza(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x0089 }
        goto L_0x0087;
    L_0x0075:
        r1 = r7.zzbsk;	 Catch:{ all -> 0x0089 }
        r3 = "1007";
        r5 = r7.zzbts;	 Catch:{ all -> 0x0089 }
        r6 = r7.zzbtp;	 Catch:{ all -> 0x0089 }
        goto L_0x0070;
    L_0x007e:
        r1 = r7.zzbsk;	 Catch:{ all -> 0x0089 }
        r2 = r7.zzbts;	 Catch:{ all -> 0x0089 }
        r3 = r7.zzbtp;	 Catch:{ all -> 0x0089 }
        r1.zza(r8, r2, r4, r3);	 Catch:{ all -> 0x0089 }
    L_0x0087:
        monitor-exit(r0);	 Catch:{ all -> 0x0089 }
        return;
    L_0x0089:
        r8 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0089 }
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzoo.onClick(android.view.View):void");
    }

    public final void onGlobalLayout() {
        synchronized (this.mLock) {
            zzkf();
            if (this.zzbsk != null) {
                this.zzbsk.zzc(this.zzbtp, this.zzbts);
            }
        }
    }

    public final void onScrollChanged() {
        synchronized (this.mLock) {
            if (this.zzbsk != null) {
                this.zzbsk.zzc(this.zzbtp, this.zzbts);
            }
            zzkf();
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.mLock) {
            if (this.zzbsk == null) {
                return false;
            }
            int[] iArr = new int[2];
            this.zzbtp.getLocationOnScreen(iArr);
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

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.dynamic.IObjectWrapper r11) {
        /*
        r10 = this;
        r0 = r10.mLock;
        monitor-enter(r0);
        r1 = 0;
        r10.zzg(r1);	 Catch:{ all -> 0x01a7 }
        r11 = com.google.android.gms.dynamic.zzn.zzx(r11);	 Catch:{ all -> 0x01a7 }
        r2 = r11 instanceof com.google.android.gms.internal.zzoe;	 Catch:{ all -> 0x01a7 }
        if (r2 != 0) goto L_0x0016;
    L_0x000f:
        r11 = "Not an instance of native engine. This is most likely a transient error";
        com.google.android.gms.internal.zzaiw.zzco(r11);	 Catch:{ all -> 0x01a7 }
        monitor-exit(r0);	 Catch:{ all -> 0x01a7 }
        return;
    L_0x0016:
        r2 = r10.zzbtr;	 Catch:{ all -> 0x01a7 }
        r3 = 0;
        if (r2 != 0) goto L_0x002e;
    L_0x001b:
        r2 = r10.zzaln;	 Catch:{ all -> 0x01a7 }
        if (r2 == 0) goto L_0x002e;
    L_0x001f:
        r2 = r10.zzaln;	 Catch:{ all -> 0x01a7 }
        r4 = new android.widget.FrameLayout$LayoutParams;	 Catch:{ all -> 0x01a7 }
        r4.<init>(r3, r3);	 Catch:{ all -> 0x01a7 }
        r2.setLayoutParams(r4);	 Catch:{ all -> 0x01a7 }
        r2 = r10.zzbtp;	 Catch:{ all -> 0x01a7 }
        r2.requestLayout();	 Catch:{ all -> 0x01a7 }
    L_0x002e:
        r2 = 1;
        r10.zzbtu = r2;	 Catch:{ all -> 0x01a7 }
        r11 = (com.google.android.gms.internal.zzoe) r11;	 Catch:{ all -> 0x01a7 }
        r4 = r10.zzbsk;	 Catch:{ all -> 0x01a7 }
        if (r4 == 0) goto L_0x0052;
    L_0x0037:
        r4 = com.google.android.gms.internal.zzmq.zzbmx;	 Catch:{ all -> 0x01a7 }
        r5 = com.google.android.gms.ads.internal.zzbs.zzep();	 Catch:{ all -> 0x01a7 }
        r4 = r5.zzd(r4);	 Catch:{ all -> 0x01a7 }
        r4 = (java.lang.Boolean) r4;	 Catch:{ all -> 0x01a7 }
        r4 = r4.booleanValue();	 Catch:{ all -> 0x01a7 }
        if (r4 == 0) goto L_0x0052;
    L_0x0049:
        r4 = r10.zzbsk;	 Catch:{ all -> 0x01a7 }
        r5 = r10.zzbtp;	 Catch:{ all -> 0x01a7 }
        r6 = r10.zzbts;	 Catch:{ all -> 0x01a7 }
        r4.zzb(r5, r6);	 Catch:{ all -> 0x01a7 }
    L_0x0052:
        r4 = r10.zzbsk;	 Catch:{ all -> 0x01a7 }
        r4 = r4 instanceof com.google.android.gms.internal.zzoe;	 Catch:{ all -> 0x01a7 }
        if (r4 == 0) goto L_0x008c;
    L_0x0058:
        r4 = r10.zzbsk;	 Catch:{ all -> 0x01a7 }
        r4 = (com.google.android.gms.internal.zzoe) r4;	 Catch:{ all -> 0x01a7 }
        if (r4 == 0) goto L_0x008c;
    L_0x005e:
        r5 = r4.getContext();	 Catch:{ all -> 0x01a7 }
        if (r5 == 0) goto L_0x008c;
    L_0x0064:
        r5 = com.google.android.gms.ads.internal.zzbs.zzfa();	 Catch:{ all -> 0x01a7 }
        r6 = r10.zzbtp;	 Catch:{ all -> 0x01a7 }
        r6 = r6.getContext();	 Catch:{ all -> 0x01a7 }
        r5 = r5.zzt(r6);	 Catch:{ all -> 0x01a7 }
        if (r5 == 0) goto L_0x008c;
    L_0x0074:
        r4 = r4.zzke();	 Catch:{ all -> 0x01a7 }
        if (r4 == 0) goto L_0x007d;
    L_0x007a:
        r4.zzu(r3);	 Catch:{ all -> 0x01a7 }
    L_0x007d:
        r5 = r10.zzbtx;	 Catch:{ all -> 0x01a7 }
        r5 = r5.get();	 Catch:{ all -> 0x01a7 }
        r5 = (com.google.android.gms.internal.zzfy) r5;	 Catch:{ all -> 0x01a7 }
        if (r5 == 0) goto L_0x008c;
    L_0x0087:
        if (r4 == 0) goto L_0x008c;
    L_0x0089:
        r5.zzb(r4);	 Catch:{ all -> 0x01a7 }
    L_0x008c:
        r4 = r10.zzbsk;	 Catch:{ all -> 0x01a7 }
        r4 = r4 instanceof com.google.android.gms.internal.zznz;	 Catch:{ all -> 0x01a7 }
        if (r4 == 0) goto L_0x00a4;
    L_0x0092:
        r4 = r10.zzbsk;	 Catch:{ all -> 0x01a7 }
        r4 = (com.google.android.gms.internal.zznz) r4;	 Catch:{ all -> 0x01a7 }
        r4 = r4.zzjy();	 Catch:{ all -> 0x01a7 }
        if (r4 == 0) goto L_0x00a4;
    L_0x009c:
        r4 = r10.zzbsk;	 Catch:{ all -> 0x01a7 }
        r4 = (com.google.android.gms.internal.zznz) r4;	 Catch:{ all -> 0x01a7 }
        r4.zzc(r11);	 Catch:{ all -> 0x01a7 }
        goto L_0x00b0;
    L_0x00a4:
        r10.zzbsk = r11;	 Catch:{ all -> 0x01a7 }
        r4 = r11 instanceof com.google.android.gms.internal.zznz;	 Catch:{ all -> 0x01a7 }
        if (r4 == 0) goto L_0x00b0;
    L_0x00aa:
        r4 = r11;
        r4 = (com.google.android.gms.internal.zznz) r4;	 Catch:{ all -> 0x01a7 }
        r4.zzc(r1);	 Catch:{ all -> 0x01a7 }
    L_0x00b0:
        r4 = r10.zzaln;	 Catch:{ all -> 0x01a7 }
        if (r4 != 0) goto L_0x00b6;
    L_0x00b4:
        monitor-exit(r0);	 Catch:{ all -> 0x01a7 }
        return;
    L_0x00b6:
        r4 = com.google.android.gms.internal.zzmq.zzbmx;	 Catch:{ all -> 0x01a7 }
        r5 = com.google.android.gms.ads.internal.zzbs.zzep();	 Catch:{ all -> 0x01a7 }
        r4 = r5.zzd(r4);	 Catch:{ all -> 0x01a7 }
        r4 = (java.lang.Boolean) r4;	 Catch:{ all -> 0x01a7 }
        r4 = r4.booleanValue();	 Catch:{ all -> 0x01a7 }
        if (r4 == 0) goto L_0x00cd;
    L_0x00c8:
        r4 = r10.zzaln;	 Catch:{ all -> 0x01a7 }
        r4.setClickable(r3);	 Catch:{ all -> 0x01a7 }
    L_0x00cd:
        r4 = r10.zzaln;	 Catch:{ all -> 0x01a7 }
        r4.removeAllViews();	 Catch:{ all -> 0x01a7 }
        r4 = r11.zzjw();	 Catch:{ all -> 0x01a7 }
        if (r4 == 0) goto L_0x00f7;
    L_0x00d8:
        r5 = r10.zzbts;	 Catch:{ all -> 0x01a7 }
        if (r5 == 0) goto L_0x00f7;
    L_0x00dc:
        r5 = r10.zzbts;	 Catch:{ all -> 0x01a7 }
        r6 = "1098";
        r5 = r5.get(r6);	 Catch:{ all -> 0x01a7 }
        r5 = (java.lang.ref.WeakReference) r5;	 Catch:{ all -> 0x01a7 }
        if (r5 == 0) goto L_0x00ef;
    L_0x00e8:
        r5 = r5.get();	 Catch:{ all -> 0x01a7 }
        r5 = (android.view.View) r5;	 Catch:{ all -> 0x01a7 }
        goto L_0x00f0;
    L_0x00ef:
        r5 = r1;
    L_0x00f0:
        r6 = r5 instanceof android.view.ViewGroup;	 Catch:{ all -> 0x01a7 }
        if (r6 == 0) goto L_0x00f7;
    L_0x00f4:
        r1 = r5;
        r1 = (android.view.ViewGroup) r1;	 Catch:{ all -> 0x01a7 }
    L_0x00f7:
        if (r4 == 0) goto L_0x00fc;
    L_0x00f9:
        if (r1 == 0) goto L_0x00fc;
    L_0x00fb:
        goto L_0x00fd;
    L_0x00fc:
        r2 = 0;
    L_0x00fd:
        r3 = r11.zza(r10, r2);	 Catch:{ all -> 0x01a7 }
        r10.zzbtt = r3;	 Catch:{ all -> 0x01a7 }
        r3 = r10.zzbtt;	 Catch:{ all -> 0x01a7 }
        if (r3 == 0) goto L_0x0144;
    L_0x0107:
        r3 = r10.zzbts;	 Catch:{ all -> 0x01a7 }
        if (r3 == 0) goto L_0x0119;
    L_0x010b:
        r3 = r10.zzbts;	 Catch:{ all -> 0x01a7 }
        r4 = "1007";
        r5 = new java.lang.ref.WeakReference;	 Catch:{ all -> 0x01a7 }
        r6 = r10.zzbtt;	 Catch:{ all -> 0x01a7 }
        r5.<init>(r6);	 Catch:{ all -> 0x01a7 }
        r3.put(r4, r5);	 Catch:{ all -> 0x01a7 }
    L_0x0119:
        if (r2 == 0) goto L_0x0124;
    L_0x011b:
        r1.removeAllViews();	 Catch:{ all -> 0x01a7 }
        r2 = r10.zzbtt;	 Catch:{ all -> 0x01a7 }
        r1.addView(r2);	 Catch:{ all -> 0x01a7 }
        goto L_0x0144;
    L_0x0124:
        r1 = r11.getContext();	 Catch:{ all -> 0x01a7 }
        r2 = new com.google.android.gms.ads.formats.AdChoicesView;	 Catch:{ all -> 0x01a7 }
        r2.<init>(r1);	 Catch:{ all -> 0x01a7 }
        r1 = new android.widget.FrameLayout$LayoutParams;	 Catch:{ all -> 0x01a7 }
        r3 = -1;
        r1.<init>(r3, r3);	 Catch:{ all -> 0x01a7 }
        r2.setLayoutParams(r1);	 Catch:{ all -> 0x01a7 }
        r1 = r10.zzbtt;	 Catch:{ all -> 0x01a7 }
        r2.addView(r1);	 Catch:{ all -> 0x01a7 }
        r1 = r10.zzaln;	 Catch:{ all -> 0x01a7 }
        if (r1 == 0) goto L_0x0144;
    L_0x013f:
        r1 = r10.zzaln;	 Catch:{ all -> 0x01a7 }
        r1.addView(r2);	 Catch:{ all -> 0x01a7 }
    L_0x0144:
        r5 = r10.zzbtp;	 Catch:{ all -> 0x01a7 }
        r6 = r10.zzbts;	 Catch:{ all -> 0x01a7 }
        r7 = 0;
        r4 = r11;
        r8 = r10;
        r9 = r10;
        r4.zza(r5, r6, r7, r8, r9);	 Catch:{ all -> 0x01a7 }
        r1 = com.google.android.gms.internal.zzagr.zzczc;	 Catch:{ all -> 0x01a7 }
        r2 = new com.google.android.gms.internal.zzop;	 Catch:{ all -> 0x01a7 }
        r2.<init>(r10, r11);	 Catch:{ all -> 0x01a7 }
        r1.post(r2);	 Catch:{ all -> 0x01a7 }
        r11 = r10.zzbtp;	 Catch:{ all -> 0x01a7 }
        r10.zzg(r11);	 Catch:{ all -> 0x01a7 }
        r11 = r10.zzbsk;	 Catch:{ all -> 0x01a7 }
        r11 = r11 instanceof com.google.android.gms.internal.zzoe;	 Catch:{ all -> 0x01a7 }
        if (r11 == 0) goto L_0x01a5;
    L_0x0164:
        r11 = r10.zzbsk;	 Catch:{ all -> 0x01a7 }
        r11 = (com.google.android.gms.internal.zzoe) r11;	 Catch:{ all -> 0x01a7 }
        if (r11 == 0) goto L_0x01a5;
    L_0x016a:
        r1 = r11.getContext();	 Catch:{ all -> 0x01a7 }
        if (r1 == 0) goto L_0x01a5;
    L_0x0170:
        r1 = com.google.android.gms.ads.internal.zzbs.zzfa();	 Catch:{ all -> 0x01a7 }
        r2 = r10.zzbtp;	 Catch:{ all -> 0x01a7 }
        r2 = r2.getContext();	 Catch:{ all -> 0x01a7 }
        r1 = r1.zzt(r2);	 Catch:{ all -> 0x01a7 }
        if (r1 == 0) goto L_0x01a5;
    L_0x0180:
        r1 = r10.zzbtx;	 Catch:{ all -> 0x01a7 }
        r1 = r1.get();	 Catch:{ all -> 0x01a7 }
        r1 = (com.google.android.gms.internal.zzfy) r1;	 Catch:{ all -> 0x01a7 }
        if (r1 != 0) goto L_0x019e;
    L_0x018a:
        r1 = new com.google.android.gms.internal.zzfy;	 Catch:{ all -> 0x01a7 }
        r2 = r10.zzbtp;	 Catch:{ all -> 0x01a7 }
        r2 = r2.getContext();	 Catch:{ all -> 0x01a7 }
        r3 = r10.zzbtp;	 Catch:{ all -> 0x01a7 }
        r1.<init>(r2, r3);	 Catch:{ all -> 0x01a7 }
        r2 = new java.lang.ref.WeakReference;	 Catch:{ all -> 0x01a7 }
        r2.<init>(r1);	 Catch:{ all -> 0x01a7 }
        r10.zzbtx = r2;	 Catch:{ all -> 0x01a7 }
    L_0x019e:
        r11 = r11.zzke();	 Catch:{ all -> 0x01a7 }
        r1.zza(r11);	 Catch:{ all -> 0x01a7 }
    L_0x01a5:
        monitor-exit(r0);	 Catch:{ all -> 0x01a7 }
        return;
    L_0x01a7:
        r11 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x01a7 }
        throw r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzoo.zza(com.google.android.gms.dynamic.IObjectWrapper):void");
    }

    public final IObjectWrapper zzak(String str) {
        synchronized (this.mLock) {
            Object obj = null;
            if (this.zzbts == null) {
                return null;
            }
            WeakReference weakReference = (WeakReference) this.zzbts.get(str);
            if (weakReference != null) {
                obj = (View) weakReference.get();
            }
            IObjectWrapper zzy = zzn.zzy(obj);
            return zzy;
        }
    }

    public final void zzb(IObjectWrapper iObjectWrapper, int i) {
        if (zzbs.zzfa().zzt(this.zzbtp.getContext()) && this.zzbtx != null) {
            zzfy zzfy = (zzfy) this.zzbtx.get();
            if (zzfy != null) {
                zzfy.zzgf();
            }
        }
        zzkf();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzb(java.lang.String r4, com.google.android.gms.dynamic.IObjectWrapper r5) {
        /*
        r3 = this;
        r5 = com.google.android.gms.dynamic.zzn.zzx(r5);
        r5 = (android.view.View) r5;
        r0 = r3.mLock;
        monitor-enter(r0);
        r1 = r3.zzbts;	 Catch:{ all -> 0x0037 }
        if (r1 != 0) goto L_0x000f;
    L_0x000d:
        monitor-exit(r0);	 Catch:{ all -> 0x0037 }
        return;
    L_0x000f:
        if (r5 != 0) goto L_0x0017;
    L_0x0011:
        r5 = r3.zzbts;	 Catch:{ all -> 0x0037 }
        r5.remove(r4);	 Catch:{ all -> 0x0037 }
        goto L_0x0035;
    L_0x0017:
        r1 = r3.zzbts;	 Catch:{ all -> 0x0037 }
        r2 = new java.lang.ref.WeakReference;	 Catch:{ all -> 0x0037 }
        r2.<init>(r5);	 Catch:{ all -> 0x0037 }
        r1.put(r4, r2);	 Catch:{ all -> 0x0037 }
        r1 = "1098";
        r4 = r1.equals(r4);	 Catch:{ all -> 0x0037 }
        if (r4 == 0) goto L_0x002b;
    L_0x0029:
        monitor-exit(r0);	 Catch:{ all -> 0x0037 }
        return;
    L_0x002b:
        r5.setOnTouchListener(r3);	 Catch:{ all -> 0x0037 }
        r4 = 1;
        r5.setClickable(r4);	 Catch:{ all -> 0x0037 }
        r5.setOnClickListener(r3);	 Catch:{ all -> 0x0037 }
    L_0x0035:
        monitor-exit(r0);	 Catch:{ all -> 0x0037 }
        return;
    L_0x0037:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0037 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzoo.zzb(java.lang.String, com.google.android.gms.dynamic.IObjectWrapper):void");
    }
}
