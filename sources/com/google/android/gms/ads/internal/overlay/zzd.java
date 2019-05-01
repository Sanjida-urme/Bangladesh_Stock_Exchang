package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.common.util.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;
import com.google.android.gms.internal.zzagr;
import com.google.android.gms.internal.zzagw;
import com.google.android.gms.internal.zzaiw;
import com.google.android.gms.internal.zzama;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.internal.zzwg;
import com.google.android.gms.internal.zzwk;
import com.google.android.gms.internal.zzzb;
import java.util.Collections;

@zzzb
public final class zzd extends zzwk implements zzt {
    private static int zzcgi = Color.argb(0, 0, 0, 0);
    private final Activity mActivity;
    private zzama zzbwq;
    AdOverlayInfoParcel zzcgj;
    private zzi zzcgk;
    private zzo zzcgl;
    private boolean zzcgm = false;
    private FrameLayout zzcgn;
    private CustomViewCallback zzcgo;
    private boolean zzcgp = false;
    private boolean zzcgq = false;
    private zzh zzcgr;
    private boolean zzcgs = false;
    private int zzcgt = 0;
    private final Object zzcgu = new Object();
    private Runnable zzcgv;
    private boolean zzcgw;
    private boolean zzcgx;
    private boolean zzcgy = false;
    private boolean zzcgz = false;
    private boolean zzcha = true;

    public zzd(Activity activity) {
        this.mActivity = activity;
    }

    private final void zzmq() {
        if (this.mActivity.isFinishing() && !this.zzcgy) {
            this.zzcgy = true;
            if (this.zzbwq != null) {
                this.zzbwq.zzag(this.zzcgt);
                synchronized (this.zzcgu) {
                    if (this.zzcgw || !this.zzbwq.zzsx()) {
                    } else {
                        this.zzcgv = new zzf(this);
                        zzagr.zzczc.postDelayed(this.zzcgv, ((Long) zzbs.zzep().zzd(zzmq.zzbjz)).longValue());
                        return;
                    }
                }
            }
            zzmr();
        }
    }

    private final void zzmt() {
        this.zzbwq.zzmt();
    }

    private final void zzr(boolean z) {
        int intValue = ((Integer) zzbs.zzep().zzd(zzmq.zzbpj)).intValue();
        zzp zzp = new zzp();
        zzp.size = 50;
        zzp.paddingLeft = z ? intValue : 0;
        zzp.paddingRight = z ? 0 : intValue;
        zzp.paddingTop = 0;
        zzp.paddingBottom = intValue;
        this.zzcgl = new zzo(this.mActivity, zzp, this);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        zza(z, this.zzcgj.zzchm);
        this.zzcgr.addView(this.zzcgl, layoutParams);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzs(boolean r21) throws com.google.android.gms.ads.internal.overlay.zzg {
        /*
        r20 = this;
        r1 = r20;
        r3 = r1.zzcgx;
        r4 = 1;
        if (r3 != 0) goto L_0x000c;
    L_0x0007:
        r3 = r1.mActivity;
        r3.requestWindowFeature(r4);
    L_0x000c:
        r3 = r1.mActivity;
        r3 = r3.getWindow();
        if (r3 != 0) goto L_0x001c;
    L_0x0014:
        r2 = new com.google.android.gms.ads.internal.overlay.zzg;
        r3 = "Invalid activity, no window available.";
        r2.<init>(r3);
        throw r2;
    L_0x001c:
        r5 = com.google.android.gms.common.util.zzq.isAtLeastN();
        if (r5 == 0) goto L_0x0048;
    L_0x0022:
        r5 = com.google.android.gms.internal.zzmq.zzbph;
        r6 = com.google.android.gms.ads.internal.zzbs.zzep();
        r5 = r6.zzd(r5);
        r5 = (java.lang.Boolean) r5;
        r5 = r5.booleanValue();
        if (r5 == 0) goto L_0x0048;
    L_0x0034:
        com.google.android.gms.ads.internal.zzbs.zzec();
        r5 = r1.mActivity;
        r6 = r1.mActivity;
        r6 = r6.getResources();
        r6 = r6.getConfiguration();
        r5 = com.google.android.gms.internal.zzagr.zza(r5, r6);
        goto L_0x0049;
    L_0x0048:
        r5 = 1;
    L_0x0049:
        r6 = r1.zzcgj;
        r6 = r6.zzchr;
        r7 = 0;
        if (r6 == 0) goto L_0x005a;
    L_0x0050:
        r6 = r1.zzcgj;
        r6 = r6.zzchr;
        r6 = r6.zzaps;
        if (r6 == 0) goto L_0x005a;
    L_0x0058:
        r6 = 1;
        goto L_0x005b;
    L_0x005a:
        r6 = 0;
    L_0x005b:
        r8 = r1.zzcgq;
        if (r8 == 0) goto L_0x0061;
    L_0x005f:
        if (r6 == 0) goto L_0x0097;
    L_0x0061:
        if (r5 == 0) goto L_0x0097;
    L_0x0063:
        r5 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r3.setFlags(r5, r5);
        r5 = com.google.android.gms.internal.zzmq.zzbka;
        r6 = com.google.android.gms.ads.internal.zzbs.zzep();
        r5 = r6.zzd(r5);
        r5 = (java.lang.Boolean) r5;
        r5 = r5.booleanValue();
        if (r5 == 0) goto L_0x0097;
    L_0x007a:
        r5 = com.google.android.gms.common.util.zzq.zzama();
        if (r5 == 0) goto L_0x0097;
    L_0x0080:
        r5 = r1.zzcgj;
        r5 = r5.zzchr;
        if (r5 == 0) goto L_0x0097;
    L_0x0086:
        r5 = r1.zzcgj;
        r5 = r5.zzchr;
        r5 = r5.zzapx;
        if (r5 == 0) goto L_0x0097;
    L_0x008e:
        r5 = r3.getDecorView();
        r6 = 4098; // 0x1002 float:5.743E-42 double:2.0247E-320;
        r5.setSystemUiVisibility(r6);
    L_0x0097:
        r5 = r1.zzcgj;
        r5 = r5.zzchj;
        r6 = 0;
        if (r5 == 0) goto L_0x00a7;
    L_0x009e:
        r5 = r1.zzcgj;
        r5 = r5.zzchj;
        r5 = r5.zzsq();
        goto L_0x00a8;
    L_0x00a7:
        r5 = r6;
    L_0x00a8:
        if (r5 == 0) goto L_0x00af;
    L_0x00aa:
        r5 = r5.zzfr();
        goto L_0x00b0;
    L_0x00af:
        r5 = 0;
    L_0x00b0:
        r1.zzcgs = r7;
        if (r5 == 0) goto L_0x00f2;
    L_0x00b4:
        r8 = r1.zzcgj;
        r8 = r8.orientation;
        r9 = com.google.android.gms.ads.internal.zzbs.zzee();
        r9 = r9.zzpz();
        if (r8 != r9) goto L_0x00d4;
    L_0x00c2:
        r8 = r1.mActivity;
        r8 = r8.getResources();
        r8 = r8.getConfiguration();
        r8 = r8.orientation;
        if (r8 != r4) goto L_0x00d1;
    L_0x00d0:
        r7 = 1;
    L_0x00d1:
        r1.zzcgs = r7;
        goto L_0x00f2;
    L_0x00d4:
        r8 = r1.zzcgj;
        r8 = r8.orientation;
        r9 = com.google.android.gms.ads.internal.zzbs.zzee();
        r9 = r9.zzqa();
        if (r8 != r9) goto L_0x00f2;
    L_0x00e2:
        r8 = r1.mActivity;
        r8 = r8.getResources();
        r8 = r8.getConfiguration();
        r8 = r8.orientation;
        r9 = 2;
        if (r8 != r9) goto L_0x00d1;
    L_0x00f1:
        goto L_0x00d0;
    L_0x00f2:
        r7 = r1.zzcgs;
        r8 = 46;
        r9 = new java.lang.StringBuilder;
        r9.<init>(r8);
        r8 = "Delay onShow to next orientation change: ";
        r9.append(r8);
        r9.append(r7);
        r7 = r9.toString();
        com.google.android.gms.internal.zzaiw.zzbw(r7);
        r7 = r1.zzcgj;
        r7 = r7.orientation;
        r1.setRequestedOrientation(r7);
        r7 = com.google.android.gms.ads.internal.zzbs.zzee();
        r3 = r7.zza(r3);
        if (r3 == 0) goto L_0x0120;
    L_0x011b:
        r3 = "Hardware acceleration on the AdActivity window enabled.";
        com.google.android.gms.internal.zzaiw.zzbw(r3);
    L_0x0120:
        r3 = r1.zzcgq;
        if (r3 != 0) goto L_0x012c;
    L_0x0124:
        r3 = r1.zzcgr;
        r7 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
    L_0x0128:
        r3.setBackgroundColor(r7);
        goto L_0x0131;
    L_0x012c:
        r3 = r1.zzcgr;
        r7 = zzcgi;
        goto L_0x0128;
    L_0x0131:
        r3 = r1.mActivity;
        r7 = r1.zzcgr;
        r3.setContentView(r7);
        r1.zzcgx = r4;
        if (r21 == 0) goto L_0x0214;
    L_0x013c:
        r8 = com.google.android.gms.ads.internal.zzbs.zzed();	 Catch:{ Exception -> 0x0205 }
        r9 = r1.mActivity;	 Catch:{ Exception -> 0x0205 }
        r3 = r1.zzcgj;	 Catch:{ Exception -> 0x0205 }
        r3 = r3.zzchj;	 Catch:{ Exception -> 0x0205 }
        if (r3 == 0) goto L_0x0152;
    L_0x0148:
        r3 = r1.zzcgj;	 Catch:{ Exception -> 0x0205 }
        r3 = r3.zzchj;	 Catch:{ Exception -> 0x0205 }
        r3 = r3.zzso();	 Catch:{ Exception -> 0x0205 }
        r10 = r3;
        goto L_0x0153;
    L_0x0152:
        r10 = r6;
    L_0x0153:
        r3 = r1.zzcgj;	 Catch:{ Exception -> 0x0205 }
        r3 = r3.zzchj;	 Catch:{ Exception -> 0x0205 }
        if (r3 == 0) goto L_0x0163;
    L_0x0159:
        r3 = r1.zzcgj;	 Catch:{ Exception -> 0x0205 }
        r3 = r3.zzchj;	 Catch:{ Exception -> 0x0205 }
        r3 = r3.zzsp();	 Catch:{ Exception -> 0x0205 }
        r11 = r3;
        goto L_0x0164;
    L_0x0163:
        r11 = r6;
    L_0x0164:
        r12 = 1;
        r14 = 0;
        r3 = r1.zzcgj;	 Catch:{ Exception -> 0x0205 }
        r15 = r3.zzatd;	 Catch:{ Exception -> 0x0205 }
        r16 = 0;
        r17 = 0;
        r3 = r1.zzcgj;	 Catch:{ Exception -> 0x0205 }
        r3 = r3.zzchj;	 Catch:{ Exception -> 0x0205 }
        if (r3 == 0) goto L_0x017f;
    L_0x0174:
        r3 = r1.zzcgj;	 Catch:{ Exception -> 0x0205 }
        r3 = r3.zzchj;	 Catch:{ Exception -> 0x0205 }
        r3 = r3.zzbk();	 Catch:{ Exception -> 0x0205 }
        r18 = r3;
        goto L_0x0181;
    L_0x017f:
        r18 = r6;
    L_0x0181:
        r19 = com.google.android.gms.internal.zzib.zzhi();	 Catch:{ Exception -> 0x0205 }
        r13 = r5;
        r3 = r8.zza(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19);	 Catch:{ Exception -> 0x0205 }
        r1.zzbwq = r3;	 Catch:{ Exception -> 0x0205 }
        r3 = r1.zzbwq;
        r7 = r3.zzsq();
        r8 = 0;
        r9 = 0;
        r3 = r1.zzcgj;
        r10 = r3.zzchk;
        r3 = r1.zzcgj;
        r11 = r3.zzcho;
        r12 = 1;
        r13 = 0;
        r3 = r1.zzcgj;
        r3 = r3.zzchj;
        if (r3 == 0) goto L_0x01b2;
    L_0x01a4:
        r3 = r1.zzcgj;
        r3 = r3.zzchj;
        r3 = r3.zzsq();
        r3 = r3.zztd();
        r14 = r3;
        goto L_0x01b3;
    L_0x01b2:
        r14 = r6;
    L_0x01b3:
        r15 = 0;
        r16 = 0;
        r7.zza(r8, r9, r10, r11, r12, r13, r14, r15, r16);
        r3 = r1.zzbwq;
        r3 = r3.zzsq();
        r7 = new com.google.android.gms.ads.internal.overlay.zze;
        r7.<init>(r1);
        r3.zza(r7);
        r3 = r1.zzcgj;
        r3 = r3.url;
        if (r3 == 0) goto L_0x01d7;
    L_0x01cd:
        r3 = r1.zzbwq;
        r7 = r1.zzcgj;
        r7 = r7.url;
        r3.loadUrl(r7);
        goto L_0x01ef;
    L_0x01d7:
        r3 = r1.zzcgj;
        r3 = r3.zzchn;
        if (r3 == 0) goto L_0x01fd;
    L_0x01dd:
        r7 = r1.zzbwq;
        r3 = r1.zzcgj;
        r8 = r3.zzchl;
        r3 = r1.zzcgj;
        r9 = r3.zzchn;
        r10 = "text/html";
        r11 = "UTF-8";
        r12 = 0;
        r7.loadDataWithBaseURL(r8, r9, r10, r11, r12);
    L_0x01ef:
        r3 = r1.zzcgj;
        r3 = r3.zzchj;
        if (r3 == 0) goto L_0x0221;
    L_0x01f5:
        r3 = r1.zzcgj;
        r3 = r3.zzchj;
        r3.zzc(r1);
        goto L_0x0221;
    L_0x01fd:
        r2 = new com.google.android.gms.ads.internal.overlay.zzg;
        r3 = "No URL or HTML to display in ad overlay.";
        r2.<init>(r3);
        throw r2;
    L_0x0205:
        r0 = move-exception;
        r2 = r0;
        r3 = "Error obtaining webview.";
        com.google.android.gms.internal.zzaiw.zzb(r3, r2);
        r2 = new com.google.android.gms.ads.internal.overlay.zzg;
        r3 = "Could not obtain webview for the overlay.";
        r2.<init>(r3);
        throw r2;
    L_0x0214:
        r3 = r1.zzcgj;
        r3 = r3.zzchj;
        r1.zzbwq = r3;
        r3 = r1.zzbwq;
        r7 = r1.mActivity;
        r3.setContext(r7);
    L_0x0221:
        r3 = r1.zzbwq;
        r3.zzb(r1);
        r3 = r1.zzbwq;
        r3 = r3.getParent();
        if (r3 == 0) goto L_0x023e;
    L_0x022e:
        r7 = r3 instanceof android.view.ViewGroup;
        if (r7 == 0) goto L_0x023e;
    L_0x0232:
        r3 = (android.view.ViewGroup) r3;
        r7 = r1.zzbwq;
        if (r7 != 0) goto L_0x0239;
    L_0x0238:
        throw r6;
    L_0x0239:
        r7 = (android.view.View) r7;
        r3.removeView(r7);
    L_0x023e:
        r3 = r1.zzcgq;
        if (r3 == 0) goto L_0x0247;
    L_0x0242:
        r3 = r1.zzbwq;
        r3.zztb();
    L_0x0247:
        r3 = r1.zzcgr;
        r7 = r1.zzbwq;
        if (r7 != 0) goto L_0x024e;
    L_0x024d:
        throw r6;
    L_0x024e:
        r7 = (android.view.View) r7;
        r6 = -1;
        r3.addView(r7, r6, r6);
        if (r21 != 0) goto L_0x025d;
    L_0x0256:
        r2 = r1.zzcgs;
        if (r2 != 0) goto L_0x025d;
    L_0x025a:
        r20.zzmt();
    L_0x025d:
        r1.zzr(r5);
        r2 = r1.zzbwq;
        r2 = r2.zzsr();
        if (r2 == 0) goto L_0x026b;
    L_0x0268:
        r1.zza(r5, r4);
    L_0x026b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzd.zzs(boolean):void");
    }

    public final void close() {
        this.zzcgt = 2;
        this.mActivity.finish();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onBackPressed() {
        this.zzcgt = 0;
    }

    public final void onCreate(Bundle bundle) {
        this.mActivity.requestWindowFeature(1);
        this.zzcgp = bundle != null ? bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false) : false;
        try {
            this.zzcgj = AdOverlayInfoParcel.zzc(this.mActivity.getIntent());
            if (this.zzcgj == null) {
                throw new zzg("Could not get info for ad overlay.");
            }
            if (this.zzcgj.zzatd.zzdca > 7500000) {
                this.zzcgt = 3;
            }
            if (this.mActivity.getIntent() != null) {
                this.zzcha = this.mActivity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            if (this.zzcgj.zzchr != null) {
                this.zzcgq = this.zzcgj.zzchr.zzapr;
            } else {
                this.zzcgq = false;
            }
            if (((Boolean) zzbs.zzep().zzd(zzmq.zzbmk)).booleanValue() && this.zzcgq && this.zzcgj.zzchr.zzapw != -1) {
                new zzj().zzps();
            }
            if (bundle == null) {
                if (this.zzcgj.zzchi != null && this.zzcha) {
                    this.zzcgj.zzchi.zzcb();
                }
                if (!(this.zzcgj.zzchp == 1 || this.zzcgj.zzchh == null)) {
                    this.zzcgj.zzchh.onAdClicked();
                }
            }
            this.zzcgr = new zzh(this.mActivity, this.zzcgj.zzchq, this.zzcgj.zzatd.zzcp);
            this.zzcgr.setId(1000);
            switch (this.zzcgj.zzchp) {
                case 1:
                    zzs(false);
                    return;
                case 2:
                    this.zzcgk = new zzi(this.zzcgj.zzchj);
                    zzs(false);
                    return;
                case 3:
                    zzs(true);
                    return;
                case 4:
                    if (this.zzcgp) {
                        this.zzcgt = 3;
                        this.mActivity.finish();
                        return;
                    }
                    zzbs.zzdz();
                    if (!zza.zza(this.mActivity, this.zzcgj.zzchg, this.zzcgj.zzcho)) {
                        this.zzcgt = 3;
                        this.mActivity.finish();
                    }
                    return;
                default:
                    throw new zzg("Could not determine ad overlay type.");
            }
        } catch (zzg e) {
            zzaiw.zzco(e.getMessage());
            this.zzcgt = 3;
            this.mActivity.finish();
        }
    }

    public final void onDestroy() {
        if (this.zzbwq != null) {
            zzh zzh = this.zzcgr;
            zzama zzama = this.zzbwq;
            if (zzama == null) {
                throw null;
            }
            zzh.removeView((View) zzama);
        }
        zzmq();
    }

    public final void onPause() {
        zzmm();
        if (this.zzcgj.zzchi != null) {
            this.zzcgj.zzchi.onPause();
        }
        if (!(((Boolean) zzbs.zzep().zzd(zzmq.zzbpi)).booleanValue() || this.zzbwq == null || (this.mActivity.isFinishing() && this.zzcgk != null))) {
            zzbs.zzee();
            zzagw.zzh(this.zzbwq);
        }
        zzmq();
    }

    public final void onRestart() {
    }

    public final void onResume() {
        if (this.zzcgj != null && this.zzcgj.zzchp == 4) {
            if (this.zzcgp) {
                this.zzcgt = 3;
                this.mActivity.finish();
            } else {
                this.zzcgp = true;
            }
        }
        if (this.zzcgj.zzchi != null) {
            this.zzcgj.zzchi.onResume();
        }
        if (!((Boolean) zzbs.zzep().zzd(zzmq.zzbpi)).booleanValue()) {
            if (this.zzbwq == null || this.zzbwq.isDestroyed()) {
                zzaiw.zzco("The webview does not exist. Ignoring action.");
            } else {
                zzbs.zzee();
                zzagw.zzi(this.zzbwq);
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzcgp);
    }

    public final void onStart() {
        if (((Boolean) zzbs.zzep().zzd(zzmq.zzbpi)).booleanValue()) {
            if (this.zzbwq == null || this.zzbwq.isDestroyed()) {
                zzaiw.zzco("The webview does not exist. Ignoring action.");
            } else {
                zzbs.zzee();
                zzagw.zzi(this.zzbwq);
            }
        }
    }

    public final void onStop() {
        if (((Boolean) zzbs.zzep().zzd(zzmq.zzbpi)).booleanValue() && this.zzbwq != null && (!this.mActivity.isFinishing() || this.zzcgk == null)) {
            zzbs.zzee();
            zzagw.zzh(this.zzbwq);
        }
        zzmq();
    }

    public final void setRequestedOrientation(int i) {
        this.mActivity.setRequestedOrientation(i);
    }

    public final void zza(View view, CustomViewCallback customViewCallback) {
        this.zzcgn = new FrameLayout(this.mActivity);
        this.zzcgn.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.zzcgn.addView(view, -1, -1);
        this.mActivity.setContentView(this.zzcgn);
        this.zzcgx = true;
        this.zzcgo = customViewCallback;
        this.zzcgm = true;
    }

    public final void zza(boolean z, boolean z2) {
        boolean z3 = false;
        Object obj = (!((Boolean) zzbs.zzep().zzd(zzmq.zzbkb)).booleanValue() || this.zzcgj == null || this.zzcgj.zzchr == null || !this.zzcgj.zzchr.zzapy) ? null : 1;
        if (z && z2 && obj != null) {
            new zzwg(this.zzbwq, "useCustomClose").zzbl("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        if (this.zzcgl != null) {
            zzo zzo = this.zzcgl;
            if (z2 && obj == null) {
                z3 = true;
            }
            zzo.zza(z, z3);
        }
    }

    public final void zzba() {
        this.zzcgx = true;
    }

    public final void zzk(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzbs.zzep().zzd(zzmq.zzbph)).booleanValue() && zzq.isAtLeastN()) {
            Configuration configuration = (Configuration) zzn.zzx(iObjectWrapper);
            zzbs.zzec();
            if (zzagr.zza(this.mActivity, configuration)) {
                this.mActivity.getWindow().addFlags(1024);
                this.mActivity.getWindow().clearFlags(2048);
                return;
            }
            this.mActivity.getWindow().addFlags(2048);
            this.mActivity.getWindow().clearFlags(1024);
        }
    }

    public final void zzmm() {
        if (this.zzcgj != null && this.zzcgm) {
            setRequestedOrientation(this.zzcgj.orientation);
        }
        if (this.zzcgn != null) {
            this.mActivity.setContentView(this.zzcgr);
            this.zzcgx = true;
            this.zzcgn.removeAllViews();
            this.zzcgn = null;
        }
        if (this.zzcgo != null) {
            this.zzcgo.onCustomViewHidden();
            this.zzcgo = null;
        }
        this.zzcgm = false;
    }

    public final void zzmn() {
        this.zzcgt = 1;
        this.mActivity.finish();
    }

    public final boolean zzmo() {
        this.zzcgt = 0;
        if (this.zzbwq == null) {
            return true;
        }
        boolean zzsv = this.zzbwq.zzsv();
        if (!zzsv) {
            this.zzbwq.zza("onbackblocked", Collections.emptyMap());
        }
        return zzsv;
    }

    public final void zzmp() {
        this.zzcgr.removeView(this.zzcgl);
        zzr(true);
    }

    final void zzmr() {
        if (!this.zzcgz) {
            this.zzcgz = true;
            if (this.zzbwq != null) {
                zzh zzh = this.zzcgr;
                zzama zzama = this.zzbwq;
                if (zzama == null) {
                    throw null;
                }
                zzh.removeView((View) zzama);
                if (this.zzcgk != null) {
                    this.zzbwq.setContext(this.zzcgk.zzaif);
                    this.zzbwq.zzac(false);
                    ViewGroup viewGroup = this.zzcgk.parent;
                    zzama = this.zzbwq;
                    if (zzama == null) {
                        throw null;
                    }
                    viewGroup.addView((View) zzama, this.zzcgk.index, this.zzcgk.zzchd);
                    this.zzcgk = null;
                } else if (this.mActivity.getApplicationContext() != null) {
                    this.zzbwq.setContext(this.mActivity.getApplicationContext());
                }
                this.zzbwq = null;
            }
            if (!(this.zzcgj == null || this.zzcgj.zzchi == null)) {
                this.zzcgj.zzchi.zzca();
            }
        }
    }

    public final void zzms() {
        if (this.zzcgs) {
            this.zzcgs = false;
            zzmt();
        }
    }

    public final void zzmu() {
        this.zzcgr.zzchc = true;
    }

    public final void zzmv() {
        synchronized (this.zzcgu) {
            this.zzcgw = true;
            if (this.zzcgv != null) {
                zzagr.zzczc.removeCallbacks(this.zzcgv);
                zzagr.zzczc.post(this.zzcgv);
            }
        }
    }
}
