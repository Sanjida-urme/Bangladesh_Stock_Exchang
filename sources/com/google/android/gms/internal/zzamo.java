package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zzbl;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.zzq;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

@zzzb
final class zzamo extends WebView implements OnGlobalLayoutListener, DownloadListener, zzama {
    private final Object mLock = new Object();
    private String zzaky;
    private final zzv zzamw;
    private final zzaiy zzaov;
    private zzair zzaun;
    private final WindowManager zzavc;
    @Nullable
    private final zzcs zzbta;
    private int zzcfw = -1;
    private int zzcfx = -1;
    private int zzcfz = -1;
    private int zzcga = -1;
    private final zzib zzckz;
    private String zzcqb = "";
    private Boolean zzcxg;
    private zznb zzdgr;
    private final zzano zzdjd;
    private final zzbl zzdje;
    private zzamb zzdjf;
    private zzd zzdjg;
    private zzanp zzdjh;
    private boolean zzdji;
    private boolean zzdjj;
    private boolean zzdjk;
    private boolean zzdjl;
    private int zzdjm;
    private boolean zzdjn = true;
    private boolean zzdjo = false;
    private zzamr zzdjp;
    private boolean zzdjq;
    private boolean zzdjr;
    private zzny zzdjs;
    private int zzdjt;
    private int zzdju;
    private zznb zzdjv;
    private zznb zzdjw;
    private zznc zzdjx;
    private WeakReference<OnClickListener> zzdjy;
    private zzd zzdjz;
    private boolean zzdka;
    private Map<String, zzalt> zzdkb;

    private zzamo(zzano zzano, zzanp zzanp, String str, boolean z, boolean z2, @Nullable zzcs zzcs, zzaiy zzaiy, zznd zznd, zzbl zzbl, zzv zzv, zzib zzib) {
        super(zzano);
        this.zzdjd = zzano;
        this.zzdjh = zzanp;
        this.zzaky = str;
        this.zzdjk = z;
        this.zzdjm = -1;
        this.zzbta = zzcs;
        this.zzaov = zzaiy;
        this.zzdje = zzbl;
        this.zzamw = zzv;
        this.zzavc = (WindowManager) getContext().getSystemService("window");
        this.zzckz = zzib;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (Throwable e) {
            zzaiw.zzb("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(zzbs.zzec().zzp(zzano, zzaiy.zzcp));
        zzbs.zzee().zza(getContext(), settings);
        setDownloadListener(this);
        zzts();
        if (zzq.zzaly()) {
            addJavascriptInterface(new zzamu(this), "googleAdsJsInterface");
        }
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        this.zzaun = new zzair(this.zzdjd.zzrz(), this, this, null);
        zztv();
        this.zzdjx = new zznc(new zznd(true, "make_wv", this.zzaky));
        this.zzdjx.zziy().zzc(zznd);
        this.zzdgr = zzmw.zzb(this.zzdjx.zziy());
        this.zzdjx.zza("native:view_create", this.zzdgr);
        this.zzdjw = null;
        this.zzdjv = null;
        zzbs.zzee().zzaw(zzano);
    }

    private final void zza(Boolean bool) {
        synchronized (this.mLock) {
            this.zzcxg = bool;
        }
        zzbs.zzeg().zza(bool);
    }

    private final void zzag(boolean z) {
        Map hashMap = new HashMap();
        hashMap.put("isVisible", z ? "1" : "0");
        zza("onAdVisibilityChanged", hashMap);
    }

    static zzamo zzb(Context context, zzanp zzanp, String str, boolean z, boolean z2, @Nullable zzcs zzcs, zzaiy zzaiy, zznd zznd, zzbl zzbl, zzv zzv, zzib zzib) {
        return new zzamo(new zzano(context), zzanp, str, z, z2, zzcs, zzaiy, zznd, zzbl, zzv, zzib);
    }

    private final void zzcv(String str) {
        synchronized (this.mLock) {
            if (isDestroyed()) {
                zzaiw.zzco("The webview is destroyed. Ignoring action.");
            } else {
                loadUrl(str);
            }
        }
    }

    private final void zzcw(java.lang.String r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/558922244.run(Unknown Source)
*/
        /*
        r3 = this;
        r0 = com.google.android.gms.common.util.zzq.zzama();
        if (r0 == 0) goto L_0x0074;
    L_0x0006:
        r0 = r3.zzpa();
        r1 = 0;
        if (r0 != 0) goto L_0x0039;
    L_0x000d:
        r0 = r3.mLock;
        monitor-enter(r0);
        r2 = com.google.android.gms.ads.internal.zzbs.zzeg();	 Catch:{ all -> 0x0036 }
        r2 = r2.zzpa();	 Catch:{ all -> 0x0036 }
        r3.zzcxg = r2;	 Catch:{ all -> 0x0036 }
        r2 = r3.zzcxg;	 Catch:{ all -> 0x0036 }
        if (r2 != 0) goto L_0x0034;
    L_0x001e:
        r2 = "(function(){})()";	 Catch:{ IllegalStateException -> 0x002c }
        r3.evaluateJavascript(r2, r1);	 Catch:{ IllegalStateException -> 0x002c }
        r2 = 1;	 Catch:{ IllegalStateException -> 0x002c }
        r2 = java.lang.Boolean.valueOf(r2);	 Catch:{ IllegalStateException -> 0x002c }
        r3.zza(r2);	 Catch:{ IllegalStateException -> 0x002c }
        goto L_0x0034;
    L_0x002c:
        r2 = 0;
        r2 = java.lang.Boolean.valueOf(r2);	 Catch:{ all -> 0x0036 }
        r3.zza(r2);	 Catch:{ all -> 0x0036 }
    L_0x0034:
        monitor-exit(r0);	 Catch:{ all -> 0x0036 }
        goto L_0x0039;	 Catch:{ all -> 0x0036 }
    L_0x0036:
        r4 = move-exception;	 Catch:{ all -> 0x0036 }
        monitor-exit(r0);	 Catch:{ all -> 0x0036 }
        throw r4;
    L_0x0039:
        r0 = r3.zzpa();
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x005a;
    L_0x0043:
        r0 = r3.mLock;
        monitor-enter(r0);
        r2 = r3.isDestroyed();	 Catch:{ all -> 0x0057 }
        if (r2 != 0) goto L_0x0050;	 Catch:{ all -> 0x0057 }
    L_0x004c:
        r3.evaluateJavascript(r4, r1);	 Catch:{ all -> 0x0057 }
        goto L_0x0055;	 Catch:{ all -> 0x0057 }
    L_0x0050:
        r4 = "The webview is destroyed. Ignoring action.";	 Catch:{ all -> 0x0057 }
        com.google.android.gms.internal.zzaiw.zzco(r4);	 Catch:{ all -> 0x0057 }
    L_0x0055:
        monitor-exit(r0);	 Catch:{ all -> 0x0057 }
        return;	 Catch:{ all -> 0x0057 }
    L_0x0057:
        r4 = move-exception;	 Catch:{ all -> 0x0057 }
        monitor-exit(r0);	 Catch:{ all -> 0x0057 }
        throw r4;
    L_0x005a:
        r0 = "javascript:";
        r4 = java.lang.String.valueOf(r4);
        r1 = r4.length();
        if (r1 == 0) goto L_0x006b;
    L_0x0066:
        r4 = r0.concat(r4);
        goto L_0x0070;
    L_0x006b:
        r4 = new java.lang.String;
        r4.<init>(r0);
    L_0x0070:
        r3.zzcv(r4);
        return;
    L_0x0074:
        r0 = "javascript:";
        r4 = java.lang.String.valueOf(r4);
        r1 = r4.length();
        if (r1 == 0) goto L_0x0085;
    L_0x0080:
        r4 = r0.concat(r4);
        goto L_0x008a;
    L_0x0085:
        r4 = new java.lang.String;
        r4.<init>(r0);
    L_0x008a:
        r3.zzcv(r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzamo.zzcw(java.lang.String):void");
    }

    private final Boolean zzpa() {
        Boolean bool;
        synchronized (this.mLock) {
            bool = this.zzcxg;
        }
        return bool;
    }

    private final void zzpo() {
        synchronized (this.mLock) {
            if (!this.zzdka) {
                this.zzdka = true;
                zzbs.zzeg().zzpo();
            }
        }
    }

    private final boolean zztq() {
        boolean z = false;
        if (!this.zzdjf.zzfr() && !this.zzdjf.zzte()) {
            return false;
        }
        int zzb;
        int zzb2;
        zzbs.zzec();
        DisplayMetrics zza = zzagr.zza(this.zzavc);
        zzjk.zzhx();
        int zzb3 = zzais.zzb(zza, zza.widthPixels);
        zzjk.zzhx();
        int zzb4 = zzais.zzb(zza, zza.heightPixels);
        Activity zzrz = this.zzdjd.zzrz();
        if (zzrz != null) {
            if (zzrz.getWindow() != null) {
                zzbs.zzec();
                int[] zzf = zzagr.zzf(zzrz);
                zzjk.zzhx();
                zzb = zzais.zzb(zza, zzf[0]);
                zzjk.zzhx();
                zzb2 = zzais.zzb(zza, zzf[1]);
                if (this.zzcfw != zzb3 && this.zzcfx == zzb4 && this.zzcfz == zzb && this.zzcga == zzb2) {
                    return false;
                }
                if (!(this.zzcfw == zzb3 && this.zzcfx == zzb4)) {
                    z = true;
                }
                this.zzcfw = zzb3;
                this.zzcfx = zzb4;
                this.zzcfz = zzb;
                this.zzcga = zzb2;
                new zzwg(this).zza(zzb3, zzb4, zzb, zzb2, zza.density, this.zzavc.getDefaultDisplay().getRotation());
                return z;
            }
        }
        zzb = zzb3;
        zzb2 = zzb4;
        if (this.zzcfw != zzb3) {
        }
        z = true;
        this.zzcfw = zzb3;
        this.zzcfx = zzb4;
        this.zzcfz = zzb;
        this.zzcga = zzb2;
        new zzwg(this).zza(zzb3, zzb4, zzb, zzb2, zza.density, this.zzavc.getDefaultDisplay().getRotation());
        return z;
    }

    private final void zztr() {
        zzmw.zza(this.zzdjx.zziy(), this.zzdgr, "aeh2");
    }

    private final void zzts() {
        synchronized (this.mLock) {
            if (!this.zzdjk) {
                if (!this.zzdjh.zztx()) {
                    if (VERSION.SDK_INT < 18) {
                        zzaiw.zzbw("Disabling hardware acceleration on an AdView.");
                        synchronized (this.mLock) {
                            if (!this.zzdjl) {
                                zzbs.zzee().zzt(this);
                            }
                            this.zzdjl = true;
                        }
                    } else {
                        zzaiw.zzbw("Enabling hardware acceleration on an AdView.");
                        zztt();
                    }
                }
            }
            zzaiw.zzbw("Enabling hardware acceleration on an overlay.");
            zztt();
        }
    }

    private final void zztt() {
        synchronized (this.mLock) {
            if (this.zzdjl) {
                zzbs.zzee().zzs(this);
            }
            this.zzdjl = false;
        }
    }

    private final void zztu() {
        synchronized (this.mLock) {
            this.zzdkb = null;
        }
    }

    private final void zztv() {
        if (this.zzdjx != null) {
            zznd zziy = this.zzdjx.zziy();
            if (!(zziy == null || zzbs.zzeg().zzow() == null)) {
                zzbs.zzeg().zzow().zza(zziy);
            }
        }
    }

    public final void destroy() {
        synchronized (this.mLock) {
            zztv();
            this.zzaun.zzqp();
            if (this.zzdjg != null) {
                this.zzdjg.close();
                this.zzdjg.onDestroy();
                this.zzdjg = null;
            }
            this.zzdjf.reset();
            if (this.zzdjj) {
                return;
            }
            zzbs.zzey();
            zzals.zzb((zzali) this);
            zztu();
            this.zzdjj = true;
            zzafj.m5v("Initiating WebView self destruct sequence in 3...");
            this.zzdjf.zzti();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.TargetApi(19)
    public final void evaluateJavascript(java.lang.String r3, android.webkit.ValueCallback<java.lang.String> r4) {
        /*
        r2 = this;
        r0 = r2.mLock;
        monitor-enter(r0);
        r1 = r2.isDestroyed();	 Catch:{ all -> 0x001b }
        if (r1 == 0) goto L_0x0016;
    L_0x0009:
        r3 = "The webview is destroyed. Ignoring action.";
        com.google.android.gms.internal.zzaiw.zzco(r3);	 Catch:{ all -> 0x001b }
        if (r4 == 0) goto L_0x0014;
    L_0x0010:
        r3 = 0;
        r4.onReceiveValue(r3);	 Catch:{ all -> 0x001b }
    L_0x0014:
        monitor-exit(r0);	 Catch:{ all -> 0x001b }
        return;
    L_0x0016:
        super.evaluateJavascript(r3, r4);	 Catch:{ all -> 0x001b }
        monitor-exit(r0);	 Catch:{ all -> 0x001b }
        return;
    L_0x001b:
        r3 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x001b }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzamo.evaluateJavascript(java.lang.String, android.webkit.ValueCallback):void");
    }

    protected final void finalize() throws Throwable {
        try {
            if (this.mLock != null) {
                synchronized (this.mLock) {
                    if (!this.zzdjj) {
                        this.zzdjf.reset();
                        zzbs.zzey();
                        zzals.zzb((zzali) this);
                        zztu();
                        zzpo();
                    }
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }

    public final OnClickListener getOnClickListener() {
        return (OnClickListener) this.zzdjy.get();
    }

    public final String getRequestId() {
        String str;
        synchronized (this.mLock) {
            str = this.zzcqb;
        }
        return str;
    }

    public final int getRequestedOrientation() {
        int i;
        synchronized (this.mLock) {
            i = this.zzdjm;
        }
        return i;
    }

    public final WebView getWebView() {
        return this;
    }

    public final boolean isDestroyed() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzdjj;
        }
        return z;
    }

    public final void loadData(String str, String str2, String str3) {
        synchronized (this.mLock) {
            if (isDestroyed()) {
                zzaiw.zzco("The webview is destroyed. Ignoring action.");
            } else {
                super.loadData(str, str2, str3);
            }
        }
    }

    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        synchronized (this.mLock) {
            if (isDestroyed()) {
                zzaiw.zzco("The webview is destroyed. Ignoring action.");
            } else {
                super.loadDataWithBaseURL(str, str2, str3, str4, str5);
            }
        }
    }

    public final void loadUrl(String str) {
        synchronized (this.mLock) {
            if (isDestroyed()) {
                zzaiw.zzco("The webview is destroyed. Ignoring action.");
            } else {
                try {
                    super.loadUrl(str);
                } catch (Throwable e) {
                    zzbs.zzeg().zza(e, "AdWebViewImpl.loadUrl");
                    zzaiw.zzc("Could not call loadUrl. ", e);
                }
            }
        }
    }

    protected final void onAttachedToWindow() {
        synchronized (this.mLock) {
            super.onAttachedToWindow();
            if (!isDestroyed()) {
                this.zzaun.onAttachedToWindow();
            }
            boolean z = this.zzdjq;
            if (this.zzdjf != null && this.zzdjf.zzte()) {
                if (!this.zzdjr) {
                    OnGlobalLayoutListener zztf = this.zzdjf.zztf();
                    if (zztf != null) {
                        zzbs.zzez();
                        if (this == null) {
                            throw null;
                        }
                        zzakg.zza((View) this, zztf);
                    }
                    OnScrollChangedListener zztg = this.zzdjf.zztg();
                    if (zztg != null) {
                        zzbs.zzez();
                        if (this == null) {
                            throw null;
                        }
                        zzakg.zza((View) this, zztg);
                    }
                    this.zzdjr = true;
                }
                zztq();
                z = true;
            }
            zzag(z);
        }
    }

    protected final void onDetachedFromWindow() {
        synchronized (this.mLock) {
            if (!isDestroyed()) {
                this.zzaun.onDetachedFromWindow();
            }
            super.onDetachedFromWindow();
            if (this.zzdjr && this.zzdjf != null && this.zzdjf.zzte() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                OnGlobalLayoutListener zztf = this.zzdjf.zztf();
                if (zztf != null) {
                    zzbs.zzee().zza(getViewTreeObserver(), zztf);
                }
                OnScrollChangedListener zztg = this.zzdjf.zztg();
                if (zztg != null) {
                    getViewTreeObserver().removeOnScrollChangedListener(zztg);
                }
                this.zzdjr = false;
            }
        }
        zzag(false);
    }

    public final void onDownloadStart(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, long r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/558922244.run(Unknown Source)
*/
        /*
        r0 = this;
        r2 = new android.content.Intent;	 Catch:{ ActivityNotFoundException -> 0x0019 }
        r3 = "android.intent.action.VIEW";	 Catch:{ ActivityNotFoundException -> 0x0019 }
        r2.<init>(r3);	 Catch:{ ActivityNotFoundException -> 0x0019 }
        r3 = android.net.Uri.parse(r1);	 Catch:{ ActivityNotFoundException -> 0x0019 }
        r2.setDataAndType(r3, r4);	 Catch:{ ActivityNotFoundException -> 0x0019 }
        com.google.android.gms.ads.internal.zzbs.zzec();	 Catch:{ ActivityNotFoundException -> 0x0019 }
        r3 = r0.getContext();	 Catch:{ ActivityNotFoundException -> 0x0019 }
        com.google.android.gms.internal.zzagr.zza(r3, r2);	 Catch:{ ActivityNotFoundException -> 0x0019 }
        return;
    L_0x0019:
        r2 = java.lang.String.valueOf(r1);
        r2 = r2.length();
        r2 = r2 + 51;
        r3 = java.lang.String.valueOf(r4);
        r3 = r3.length();
        r2 = r2 + r3;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r2);
        r2 = "Couldn't find an Activity to view url/mimetype: ";
        r3.append(r2);
        r3.append(r1);
        r1 = " / ";
        r3.append(r1);
        r3.append(r4);
        r1 = r3.toString();
        com.google.android.gms.internal.zzaiw.zzbw(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzamo.onDownloadStart(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):void");
    }

    @TargetApi(21)
    protected final void onDraw(Canvas canvas) {
        if (!isDestroyed()) {
            if (VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
                super.onDraw(canvas);
                if (!(this.zzdjf == null || this.zzdjf.zztp() == null)) {
                    this.zzdjf.zztp().zzcv();
                }
            }
        }
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (((Boolean) zzbs.zzep().zzd(zzmq.zzbjm)).booleanValue()) {
            float axisValue = motionEvent.getAxisValue(9);
            float axisValue2 = motionEvent.getAxisValue(10);
            if (motionEvent.getActionMasked() == 8 && ((axisValue > 0.0f && !canScrollVertically(-1)) || ((axisValue < 0.0f && !canScrollVertically(1)) || ((axisValue2 > 0.0f && !canScrollHorizontally(-1)) || (axisValue2 < 0.0f && !canScrollHorizontally(1)))))) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public final void onGlobalLayout() {
        boolean zztq = zztq();
        zzd zzsm = zzsm();
        if (zzsm != null && zztq) {
            zzsm.zzms();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.SuppressLint({"DrawAllocation"})
    protected final void onMeasure(int r8, int r9) {
        /*
        r7 = this;
        r0 = r7.mLock;
        monitor-enter(r0);
        r1 = r7.isDestroyed();	 Catch:{ all -> 0x014d }
        r2 = 0;
        if (r1 == 0) goto L_0x000f;
    L_0x000a:
        r7.setMeasuredDimension(r2, r2);	 Catch:{ all -> 0x014d }
        monitor-exit(r0);	 Catch:{ all -> 0x014d }
        return;
    L_0x000f:
        r1 = r7.isInEditMode();	 Catch:{ all -> 0x014d }
        if (r1 != 0) goto L_0x0148;
    L_0x0015:
        r1 = r7.zzdjk;	 Catch:{ all -> 0x014d }
        if (r1 != 0) goto L_0x0148;
    L_0x0019:
        r1 = r7.zzdjh;	 Catch:{ all -> 0x014d }
        r1 = r1.zzty();	 Catch:{ all -> 0x014d }
        if (r1 == 0) goto L_0x0023;
    L_0x0021:
        goto L_0x0148;
    L_0x0023:
        r1 = r7.zzdjh;	 Catch:{ all -> 0x014d }
        r1 = r1.isFluid();	 Catch:{ all -> 0x014d }
        if (r1 == 0) goto L_0x007d;
    L_0x002b:
        r1 = com.google.android.gms.internal.zzmq.zzbnf;	 Catch:{ all -> 0x014d }
        r2 = com.google.android.gms.ads.internal.zzbs.zzep();	 Catch:{ all -> 0x014d }
        r1 = r2.zzd(r1);	 Catch:{ all -> 0x014d }
        r1 = (java.lang.Boolean) r1;	 Catch:{ all -> 0x014d }
        r1 = r1.booleanValue();	 Catch:{ all -> 0x014d }
        if (r1 != 0) goto L_0x0078;
    L_0x003d:
        r1 = com.google.android.gms.common.util.zzq.zzaly();	 Catch:{ all -> 0x014d }
        if (r1 != 0) goto L_0x0044;
    L_0x0043:
        goto L_0x0078;
    L_0x0044:
        r1 = "/contentHeight";
        r2 = new com.google.android.gms.internal.zzamp;	 Catch:{ all -> 0x014d }
        r2.<init>(r7);	 Catch:{ all -> 0x014d }
        r7.zza(r1, r2);	 Catch:{ all -> 0x014d }
        r1 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();";
        r7.zzcw(r1);	 Catch:{ all -> 0x014d }
        r1 = r7.zzdjd;	 Catch:{ all -> 0x014d }
        r1 = r1.getResources();	 Catch:{ all -> 0x014d }
        r1 = r1.getDisplayMetrics();	 Catch:{ all -> 0x014d }
        r1 = r1.density;	 Catch:{ all -> 0x014d }
        r8 = android.view.View.MeasureSpec.getSize(r8);	 Catch:{ all -> 0x014d }
        r2 = r7.zzdju;	 Catch:{ all -> 0x014d }
        r3 = -1;
        if (r2 == r3) goto L_0x006f;
    L_0x0068:
        r9 = r7.zzdju;	 Catch:{ all -> 0x014d }
        r9 = (float) r9;	 Catch:{ all -> 0x014d }
        r9 = r9 * r1;
        r9 = (int) r9;	 Catch:{ all -> 0x014d }
        goto L_0x0073;
    L_0x006f:
        r9 = android.view.View.MeasureSpec.getSize(r9);	 Catch:{ all -> 0x014d }
    L_0x0073:
        r7.setMeasuredDimension(r8, r9);	 Catch:{ all -> 0x014d }
        monitor-exit(r0);	 Catch:{ all -> 0x014d }
        return;
    L_0x0078:
        super.onMeasure(r8, r9);	 Catch:{ all -> 0x014d }
        monitor-exit(r0);	 Catch:{ all -> 0x014d }
        return;
    L_0x007d:
        r1 = r7.zzdjh;	 Catch:{ all -> 0x014d }
        r1 = r1.zztx();	 Catch:{ all -> 0x014d }
        if (r1 == 0) goto L_0x009c;
    L_0x0085:
        r8 = new android.util.DisplayMetrics;	 Catch:{ all -> 0x014d }
        r8.<init>();	 Catch:{ all -> 0x014d }
        r9 = r7.zzavc;	 Catch:{ all -> 0x014d }
        r9 = r9.getDefaultDisplay();	 Catch:{ all -> 0x014d }
        r9.getMetrics(r8);	 Catch:{ all -> 0x014d }
        r9 = r8.widthPixels;	 Catch:{ all -> 0x014d }
        r8 = r8.heightPixels;	 Catch:{ all -> 0x014d }
        r7.setMeasuredDimension(r9, r8);	 Catch:{ all -> 0x014d }
        monitor-exit(r0);	 Catch:{ all -> 0x014d }
        return;
    L_0x009c:
        r1 = android.view.View.MeasureSpec.getMode(r8);	 Catch:{ all -> 0x014d }
        r8 = android.view.View.MeasureSpec.getSize(r8);	 Catch:{ all -> 0x014d }
        r3 = android.view.View.MeasureSpec.getMode(r9);	 Catch:{ all -> 0x014d }
        r9 = android.view.View.MeasureSpec.getSize(r9);	 Catch:{ all -> 0x014d }
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r5 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r6 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r1 == r5) goto L_0x00bc;
    L_0x00b5:
        if (r1 != r4) goto L_0x00b8;
    L_0x00b7:
        goto L_0x00bc;
    L_0x00b8:
        r1 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        goto L_0x00bd;
    L_0x00bc:
        r1 = r8;
    L_0x00bd:
        if (r3 == r5) goto L_0x00c1;
    L_0x00bf:
        if (r3 != r4) goto L_0x00c2;
    L_0x00c1:
        r6 = r9;
    L_0x00c2:
        r3 = r7.zzdjh;	 Catch:{ all -> 0x014d }
        r3 = r3.widthPixels;	 Catch:{ all -> 0x014d }
        r4 = 8;
        if (r3 > r1) goto L_0x00e6;
    L_0x00ca:
        r1 = r7.zzdjh;	 Catch:{ all -> 0x014d }
        r1 = r1.heightPixels;	 Catch:{ all -> 0x014d }
        if (r1 <= r6) goto L_0x00d1;
    L_0x00d0:
        goto L_0x00e6;
    L_0x00d1:
        r8 = r7.getVisibility();	 Catch:{ all -> 0x014d }
        if (r8 == r4) goto L_0x00da;
    L_0x00d7:
        r7.setVisibility(r2);	 Catch:{ all -> 0x014d }
    L_0x00da:
        r8 = r7.zzdjh;	 Catch:{ all -> 0x014d }
        r8 = r8.widthPixels;	 Catch:{ all -> 0x014d }
        r9 = r7.zzdjh;	 Catch:{ all -> 0x014d }
        r9 = r9.heightPixels;	 Catch:{ all -> 0x014d }
        r7.setMeasuredDimension(r8, r9);	 Catch:{ all -> 0x014d }
        goto L_0x0146;
    L_0x00e6:
        r1 = r7.zzdjd;	 Catch:{ all -> 0x014d }
        r1 = r1.getResources();	 Catch:{ all -> 0x014d }
        r1 = r1.getDisplayMetrics();	 Catch:{ all -> 0x014d }
        r1 = r1.density;	 Catch:{ all -> 0x014d }
        r3 = r7.zzdjh;	 Catch:{ all -> 0x014d }
        r3 = r3.widthPixels;	 Catch:{ all -> 0x014d }
        r3 = (float) r3;	 Catch:{ all -> 0x014d }
        r3 = r3 / r1;
        r3 = (int) r3;	 Catch:{ all -> 0x014d }
        r5 = r7.zzdjh;	 Catch:{ all -> 0x014d }
        r5 = r5.heightPixels;	 Catch:{ all -> 0x014d }
        r5 = (float) r5;	 Catch:{ all -> 0x014d }
        r5 = r5 / r1;
        r5 = (int) r5;	 Catch:{ all -> 0x014d }
        r8 = (float) r8;	 Catch:{ all -> 0x014d }
        r8 = r8 / r1;
        r8 = (int) r8;	 Catch:{ all -> 0x014d }
        r9 = (float) r9;	 Catch:{ all -> 0x014d }
        r9 = r9 / r1;
        r9 = (int) r9;	 Catch:{ all -> 0x014d }
        r1 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x014d }
        r6.<init>(r1);	 Catch:{ all -> 0x014d }
        r1 = "Not enough space to show ad. Needs ";
        r6.append(r1);	 Catch:{ all -> 0x014d }
        r6.append(r3);	 Catch:{ all -> 0x014d }
        r1 = "x";
        r6.append(r1);	 Catch:{ all -> 0x014d }
        r6.append(r5);	 Catch:{ all -> 0x014d }
        r1 = " dp, but only has ";
        r6.append(r1);	 Catch:{ all -> 0x014d }
        r6.append(r8);	 Catch:{ all -> 0x014d }
        r8 = "x";
        r6.append(r8);	 Catch:{ all -> 0x014d }
        r6.append(r9);	 Catch:{ all -> 0x014d }
        r8 = " dp.";
        r6.append(r8);	 Catch:{ all -> 0x014d }
        r8 = r6.toString();	 Catch:{ all -> 0x014d }
        com.google.android.gms.internal.zzaiw.zzco(r8);	 Catch:{ all -> 0x014d }
        r8 = r7.getVisibility();	 Catch:{ all -> 0x014d }
        if (r8 == r4) goto L_0x0143;
    L_0x013f:
        r8 = 4;
        r7.setVisibility(r8);	 Catch:{ all -> 0x014d }
    L_0x0143:
        r7.setMeasuredDimension(r2, r2);	 Catch:{ all -> 0x014d }
    L_0x0146:
        monitor-exit(r0);	 Catch:{ all -> 0x014d }
        return;
    L_0x0148:
        super.onMeasure(r8, r9);	 Catch:{ all -> 0x014d }
        monitor-exit(r0);	 Catch:{ all -> 0x014d }
        return;
    L_0x014d:
        r8 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x014d }
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzamo.onMeasure(int, int):void");
    }

    public final void onPause() {
        if (!isDestroyed()) {
            try {
                super.onPause();
            } catch (Throwable e) {
                zzaiw.zzb("Could not pause webview.", e);
            }
        }
    }

    public final void onResume() {
        if (!isDestroyed()) {
            try {
                super.onResume();
            } catch (Throwable e) {
                zzaiw.zzb("Could not resume webview.", e);
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.zzdjf.zzte()) {
            synchronized (this.mLock) {
                if (this.zzdjs != null) {
                    this.zzdjs.zzc(motionEvent);
                }
            }
        } else if (this.zzbta != null) {
            this.zzbta.zza(motionEvent);
        }
        return isDestroyed() ? false : super.onTouchEvent(motionEvent);
    }

    public final void setContext(Context context) {
        this.zzdjd.setBaseContext(context);
        this.zzaun.zzi(this.zzdjd.zzrz());
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.zzdjy = new WeakReference(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    public final void setRequestedOrientation(int i) {
        synchronized (this.mLock) {
            this.zzdjm = i;
            if (this.zzdjg != null) {
                this.zzdjg.setRequestedOrientation(this.zzdjm);
            }
        }
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzamb) {
            this.zzdjf = (zzamb) webViewClient;
        }
    }

    public final void stopLoading() {
        if (!isDestroyed()) {
            try {
                super.stopLoading();
            } catch (Throwable e) {
                zzaiw.zzb("Could not stop loading webview.", e);
            }
        }
    }

    public final void zza(zzc zzc) {
        this.zzdjf.zza(zzc);
    }

    public final void zza(zzamr zzamr) {
        synchronized (this.mLock) {
            if (this.zzdjp != null) {
                zzaiw.m3e("Attempt to create multiple AdWebViewVideoControllers.");
                return;
            }
            this.zzdjp = zzamr;
        }
    }

    public final void zza(zzanp zzanp) {
        synchronized (this.mLock) {
            this.zzdjh = zzanp;
            requestLayout();
        }
    }

    public final void zza(zzgb zzgb) {
        synchronized (this.mLock) {
            this.zzdjq = zzgb.zzaxe;
        }
        zzag(zzgb.zzaxe);
    }

    public final void zza(String str, zzt<? super zzama> zzt) {
        if (this.zzdjf != null) {
            this.zzdjf.zza(str, (zzt) zzt);
        }
    }

    public final void zza(java.lang.String r2, java.util.Map<java.lang.String, ?> r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/558922244.run(Unknown Source)
*/
        /*
        r1 = this;
        r0 = com.google.android.gms.ads.internal.zzbs.zzec();	 Catch:{ JSONException -> 0x000c }
        r3 = r0.zzp(r3);	 Catch:{ JSONException -> 0x000c }
        r1.zza(r2, r3);
        return;
    L_0x000c:
        r2 = "Could not convert parameters to JSON.";
        com.google.android.gms.internal.zzaiw.zzco(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzamo.zza(java.lang.String, java.util.Map):void");
    }

    public final void zza(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(window.AFMA_ReceiveMessage || function() {})('");
        stringBuilder.append(str);
        stringBuilder.append("'");
        stringBuilder.append(",");
        stringBuilder.append(jSONObject2);
        stringBuilder.append(");");
        str = "Dispatching AFMA event: ";
        jSONObject2 = String.valueOf(stringBuilder.toString());
        zzaiw.zzbw(jSONObject2.length() != 0 ? str.concat(jSONObject2) : new String(str));
        zzcw(stringBuilder.toString());
    }

    public final void zza(boolean z, int i) {
        this.zzdjf.zza(z, i);
    }

    public final void zza(boolean z, int i, String str) {
        this.zzdjf.zza(z, i, str);
    }

    public final void zza(boolean z, int i, String str, String str2) {
        this.zzdjf.zza(z, i, str, str2);
    }

    public final void zzab(boolean z) {
        this.zzdjf.zzab(z);
    }

    public final void zzac(boolean z) {
        synchronized (this.mLock) {
            Object obj = z != this.zzdjk ? 1 : null;
            this.zzdjk = z;
            zzts();
            if (obj != null) {
                new zzwg(this).zzbn(z ? "expanded" : "default");
            }
        }
    }

    public final void zzad(boolean z) {
        synchronized (this.mLock) {
            if (this.zzdjg != null) {
                this.zzdjg.zza(this.zzdjf.zzfr(), z);
            } else {
                this.zzdji = z;
            }
        }
    }

    public final void zzae(boolean z) {
        synchronized (this.mLock) {
            this.zzdjn = z;
        }
    }

    public final void zzaf(boolean z) {
        synchronized (this.mLock) {
            this.zzdjt += z ? 1 : -1;
            if (this.zzdjt <= 0 && this.zzdjg != null) {
                this.zzdjg.zzmv();
            }
        }
    }

    public final void zzag(int i) {
        if (i == 0) {
            zzmw.zza(this.zzdjx.zziy(), this.zzdgr, "aebb2");
        }
        zztr();
        if (this.zzdjx.zziy() != null) {
            this.zzdjx.zziy().zzf("close_type", String.valueOf(i));
        }
        Map hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.zzaov.zzcp);
        zza("onhide", hashMap);
    }

    public final void zzb(zzd zzd) {
        synchronized (this.mLock) {
            this.zzdjg = zzd;
        }
    }

    public final void zzb(zzny zzny) {
        synchronized (this.mLock) {
            this.zzdjs = zzny;
        }
    }

    public final void zzb(String str, zzt<? super zzama> zzt) {
        if (this.zzdjf != null) {
            this.zzdjf.zzb(str, (zzt) zzt);
        }
    }

    public final void zzb(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 3) + String.valueOf(jSONObject2).length());
        stringBuilder.append(str);
        stringBuilder.append("(");
        stringBuilder.append(jSONObject2);
        stringBuilder.append(");");
        zzcw(stringBuilder.toString());
    }

    public final zzv zzbk() {
        return this.zzamw;
    }

    public final void zzc(zzd zzd) {
        synchronized (this.mLock) {
            this.zzdjz = zzd;
        }
    }

    public final void zzck() {
        synchronized (this.mLock) {
            this.zzdjo = true;
            if (this.zzdje != null) {
                this.zzdje.zzck();
            }
        }
    }

    public final void zzcl() {
        synchronized (this.mLock) {
            this.zzdjo = false;
            if (this.zzdje != null) {
                this.zzdje.zzcl();
            }
        }
    }

    public final void zzct(String str) {
        synchronized (this.mLock) {
            try {
                super.loadUrl(str);
            } catch (Throwable e) {
                zzbs.zzeg().zza(e, "AdWebViewImpl.loadUrlUnsafe");
                zzaiw.zzc("Could not call loadUrl. ", e);
            }
        }
    }

    public final void zzcu(String str) {
        synchronized (this.mLock) {
            if (str == null) {
                str = "";
            }
            this.zzcqb = str;
        }
    }

    public final void zzmt() {
        if (this.zzdjv == null) {
            zzmw.zza(this.zzdjx.zziy(), this.zzdgr, "aes2");
            this.zzdjv = zzmw.zzb(this.zzdjx.zziy());
            this.zzdjx.zza("native:view_show", this.zzdjv);
        }
        Map hashMap = new HashMap(1);
        hashMap.put("version", this.zzaov.zzcp);
        zza("onshow", hashMap);
    }

    public final void zzmu() {
        zzd zzsm = zzsm();
        if (zzsm != null) {
            zzsm.zzmu();
        }
    }

    public final zzakz zzrw() {
        return null;
    }

    public final zzamr zzrx() {
        zzamr zzamr;
        synchronized (this.mLock) {
            zzamr = this.zzdjp;
        }
        return zzamr;
    }

    public final zznb zzry() {
        return this.zzdgr;
    }

    public final Activity zzrz() {
        return this.zzdjd.zzrz();
    }

    public final zznc zzsa() {
        return this.zzdjx;
    }

    public final zzaiy zzsb() {
        return this.zzaov;
    }

    public final int zzsc() {
        return getMeasuredHeight();
    }

    public final int zzsd() {
        return getMeasuredWidth();
    }

    public final void zzsj() {
        zztr();
        Map hashMap = new HashMap(1);
        hashMap.put("version", this.zzaov.zzcp);
        zza("onhide", hashMap);
    }

    public final void zzsk() {
        Map hashMap = new HashMap(3);
        zzbs.zzec();
        hashMap.put("app_muted", String.valueOf(zzagr.zzdi()));
        zzbs.zzec();
        hashMap.put("app_volume", String.valueOf(zzagr.zzdh()));
        zzbs.zzec();
        hashMap.put("device_volume", String.valueOf(zzagr.zzap(getContext())));
        zza("volume", hashMap);
    }

    public final Context zzsl() {
        return this.zzdjd.zzsl();
    }

    public final zzd zzsm() {
        zzd zzd;
        synchronized (this.mLock) {
            zzd = this.zzdjg;
        }
        return zzd;
    }

    public final zzd zzsn() {
        zzd zzd;
        synchronized (this.mLock) {
            zzd = this.zzdjz;
        }
        return zzd;
    }

    public final zzanp zzso() {
        zzanp zzanp;
        synchronized (this.mLock) {
            zzanp = this.zzdjh;
        }
        return zzanp;
    }

    public final String zzsp() {
        String str;
        synchronized (this.mLock) {
            str = this.zzaky;
        }
        return str;
    }

    public final zzamb zzsq() {
        return this.zzdjf;
    }

    public final boolean zzsr() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzdji;
        }
        return z;
    }

    public final zzcs zzss() {
        return this.zzbta;
    }

    public final boolean zzst() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzdjk;
        }
        return z;
    }

    public final void zzsu() {
        synchronized (this.mLock) {
            zzafj.m5v("Destroying WebView!");
            zzpo();
            zzagr.zzczc.post(new zzamq(this));
        }
    }

    public final boolean zzsv() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzdjn;
        }
        return z;
    }

    public final boolean zzsw() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzdjo;
        }
        return z;
    }

    public final boolean zzsx() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzdjt > 0;
        }
        return z;
    }

    public final void zzsy() {
        this.zzaun.zzqo();
    }

    public final void zzsz() {
        if (this.zzdjw == null) {
            this.zzdjw = zzmw.zzb(this.zzdjx.zziy());
            this.zzdjx.zza("native:view_load", this.zzdjw);
        }
    }

    public final zzny zzta() {
        zzny zzny;
        synchronized (this.mLock) {
            zzny = this.zzdjs;
        }
        return zzny;
    }

    public final void zztb() {
        setBackgroundColor(0);
    }

    public final void zztc() {
        zzafj.m5v("Cannot add text view to inner AdWebView");
    }
}
