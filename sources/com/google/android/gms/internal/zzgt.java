package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.common.util.zzq;
import java.util.List;

@zzzb
@TargetApi(14)
public final class zzgt extends Thread {
    private final Object mLock;
    private boolean mStarted = false;
    private final int zzaxi;
    private final int zzaxk;
    private boolean zzayj = false;
    private final zzgo zzayk;
    private final zzyz zzayl;
    private final int zzaym;
    private final int zzayn;
    private final int zzayo;
    private final int zzayp;
    private final int zzayq;
    private final int zzayr;
    private final String zzays;
    private final boolean zzayt;
    private boolean zzbk = false;

    public zzgt(zzgo zzgo, zzyz zzyz) {
        this.zzayk = zzgo;
        this.zzayl = zzyz;
        this.mLock = new Object();
        this.zzaxi = ((Integer) zzbs.zzep().zzd(zzmq.zzbib)).intValue();
        this.zzayn = ((Integer) zzbs.zzep().zzd(zzmq.zzbic)).intValue();
        this.zzaxk = ((Integer) zzbs.zzep().zzd(zzmq.zzbid)).intValue();
        this.zzayo = ((Integer) zzbs.zzep().zzd(zzmq.zzbie)).intValue();
        this.zzayp = ((Integer) zzbs.zzep().zzd(zzmq.zzbih)).intValue();
        this.zzayq = ((Integer) zzbs.zzep().zzd(zzmq.zzbij)).intValue();
        this.zzayr = ((Integer) zzbs.zzep().zzd(zzmq.zzbik)).intValue();
        this.zzaym = ((Integer) zzbs.zzep().zzd(zzmq.zzbif)).intValue();
        this.zzays = (String) zzbs.zzep().zzd(zzmq.zzbim);
        this.zzayt = ((Boolean) zzbs.zzep().zzd(zzmq.zzbio)).booleanValue();
        setName("ContentFetchTask");
    }

    private final zzgx zza(@Nullable View view, zzgn zzgn) {
        int i = 0;
        if (view == null) {
            return new zzgx(this, 0, 0);
        }
        Context context = zzbs.zzef().getContext();
        if (context != null) {
            String str = (String) view.getTag(context.getResources().getIdentifier((String) zzbs.zzep().zzd(zzmq.zzbil), "id", context.getPackageName()));
            if (!(TextUtils.isEmpty(this.zzays) || str == null || !str.equals(this.zzays))) {
                return new zzgx(this, 0, 0);
            }
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new zzgx(this, 0, 0);
            }
            zzgn.zzb(text.toString(), globalVisibleRect, view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
            return new zzgx(this, 1, 0);
        } else if ((view instanceof WebView) && !(view instanceof zzama)) {
            Object obj;
            zzgn.zzgm();
            WebView webView = (WebView) view;
            if (zzq.zzama()) {
                zzgn.zzgm();
                webView.post(new zzgv(this, zzgn, webView, globalVisibleRect));
                obj = 1;
            } else {
                obj = null;
            }
            return obj != null ? new zzgx(this, 0, 1) : new zzgx(this, 0, 0);
        } else if (!(view instanceof ViewGroup)) {
            return new zzgx(this, 0, 0);
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int i2 = 0;
            int i3 = 0;
            while (i < viewGroup.getChildCount()) {
                zzgx zza = zza(viewGroup.getChildAt(i), zzgn);
                i2 += zza.zzazb;
                i3 += zza.zzazc;
                i++;
            }
            return new zzgx(this, i2, i3);
        }
    }

    private static boolean zzgr() {
        boolean z = false;
        try {
            Context context = zzbs.zzef().getContext();
            if (context == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager != null) {
                if (keyguardManager == null) {
                    return false;
                }
                List<RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                if (runningAppProcesses == null) {
                    return false;
                }
                for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (Process.myPid() == runningAppProcessInfo.pid) {
                        if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode()) {
                            PowerManager powerManager = (PowerManager) context.getSystemService("power");
                            if (powerManager == null ? false : powerManager.isScreenOn()) {
                                z = true;
                            }
                        }
                    }
                }
            }
            return z;
        } catch (Throwable th) {
            zzbs.zzeg().zza(th, "ContentFetchTask.isInForeground");
            return false;
        }
    }

    private final void zzgt() {
        synchronized (this.mLock) {
            this.zzayj = true;
            boolean z = this.zzayj;
            StringBuilder stringBuilder = new StringBuilder(42);
            stringBuilder.append("ContentFetchThread: paused, mPause = ");
            stringBuilder.append(z);
            zzaiw.zzbw(stringBuilder.toString());
        }
    }

    public final void run() {
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
        r4 = this;
    L_0x0000:
        r0 = zzgr();	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        if (r0 == 0) goto L_0x0059;	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
    L_0x0006:
        r0 = com.google.android.gms.ads.internal.zzbs.zzef();	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        r0 = r0.getActivity();	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        if (r0 != 0) goto L_0x0019;	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
    L_0x0010:
        r0 = "ContentFetchThread: no activity. Sleeping.";	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        com.google.android.gms.internal.zzaiw.zzbw(r0);	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
    L_0x0015:
        r4.zzgt();	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        goto L_0x005f;
    L_0x0019:
        if (r0 == 0) goto L_0x005f;
    L_0x001b:
        r1 = 0;
        r2 = r0.getWindow();	 Catch:{ Exception -> 0x003d, InterruptedException -> 0x0076 }
        if (r2 == 0) goto L_0x004c;	 Catch:{ Exception -> 0x003d, InterruptedException -> 0x0076 }
    L_0x0022:
        r2 = r0.getWindow();	 Catch:{ Exception -> 0x003d, InterruptedException -> 0x0076 }
        r2 = r2.getDecorView();	 Catch:{ Exception -> 0x003d, InterruptedException -> 0x0076 }
        if (r2 == 0) goto L_0x004c;	 Catch:{ Exception -> 0x003d, InterruptedException -> 0x0076 }
    L_0x002c:
        r0 = r0.getWindow();	 Catch:{ Exception -> 0x003d, InterruptedException -> 0x0076 }
        r0 = r0.getDecorView();	 Catch:{ Exception -> 0x003d, InterruptedException -> 0x0076 }
        r2 = 16908290; // 0x1020002 float:2.3877235E-38 double:8.353805E-317;	 Catch:{ Exception -> 0x003d, InterruptedException -> 0x0076 }
        r0 = r0.findViewById(r2);	 Catch:{ Exception -> 0x003d, InterruptedException -> 0x0076 }
        r1 = r0;
        goto L_0x004c;
    L_0x003d:
        r0 = move-exception;
        r2 = com.google.android.gms.ads.internal.zzbs.zzeg();	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        r3 = "ContentFetchTask.extractContent";	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        r2.zza(r0, r3);	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        r0 = "Failed getting root view of activity. Content not extracted.";	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        com.google.android.gms.internal.zzaiw.zzbw(r0);	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
    L_0x004c:
        if (r1 == 0) goto L_0x005f;	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
    L_0x004e:
        if (r1 == 0) goto L_0x005f;	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
    L_0x0050:
        r0 = new com.google.android.gms.internal.zzgu;	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        r0.<init>(r4, r1);	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        r1.post(r0);	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        goto L_0x005f;	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
    L_0x0059:
        r0 = "ContentFetchTask: sleeping";	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        com.google.android.gms.internal.zzaiw.zzbw(r0);	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        goto L_0x0015;	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
    L_0x005f:
        r0 = r4.zzaym;	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        r0 = r0 * 1000;	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        r0 = (long) r0;	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        java.lang.Thread.sleep(r0);	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        goto L_0x007c;
    L_0x0068:
        r0 = move-exception;
        r1 = "Error in ContentFetchTask";
        com.google.android.gms.internal.zzaiw.zzb(r1, r0);
        r1 = r4.zzayl;
        r2 = "ContentFetchTask.run";
        r1.zza(r0, r2);
        goto L_0x007c;
    L_0x0076:
        r0 = move-exception;
        r1 = "Error in ContentFetchTask";
        com.google.android.gms.internal.zzaiw.zzb(r1, r0);
    L_0x007c:
        r0 = r4.mLock;
        monitor-enter(r0);
    L_0x007f:
        r1 = r4.zzayj;	 Catch:{ all -> 0x0091 }
        if (r1 == 0) goto L_0x008e;
    L_0x0083:
        r1 = "ContentFetchTask: waiting";	 Catch:{ InterruptedException -> 0x007f }
        com.google.android.gms.internal.zzaiw.zzbw(r1);	 Catch:{ InterruptedException -> 0x007f }
        r1 = r4.mLock;	 Catch:{ InterruptedException -> 0x007f }
        r1.wait();	 Catch:{ InterruptedException -> 0x007f }
        goto L_0x007f;
    L_0x008e:
        monitor-exit(r0);	 Catch:{ all -> 0x0091 }
        goto L_0x0000;	 Catch:{ all -> 0x0091 }
    L_0x0091:
        r1 = move-exception;	 Catch:{ all -> 0x0091 }
        monitor-exit(r0);	 Catch:{ all -> 0x0091 }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzgt.run():void");
    }

    public final void wakeup() {
        synchronized (this.mLock) {
            this.zzayj = false;
            this.mLock.notifyAll();
            zzaiw.zzbw("ContentFetchThread: wakeup");
        }
    }

    final void zza(com.google.android.gms.internal.zzgn r11, android.webkit.WebView r12, java.lang.String r13, boolean r14) {
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
        r10 = this;
        r11.zzgl();
        r0 = android.text.TextUtils.isEmpty(r13);	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        if (r0 != 0) goto L_0x007c;	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
    L_0x0009:
        r0 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r0.<init>(r13);	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r13 = "text";	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r2 = r0.optString(r13);	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r13 = r10.zzayt;	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        if (r13 != 0) goto L_0x0065;	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
    L_0x0018:
        r13 = r12.getTitle();	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r13 = android.text.TextUtils.isEmpty(r13);	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        if (r13 != 0) goto L_0x0065;	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
    L_0x0022:
        r13 = r12.getTitle();	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r0 = java.lang.String.valueOf(r13);	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r0 = r0.length();	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r0 = r0 + 1;	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r1 = java.lang.String.valueOf(r2);	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r1 = r1.length();	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r0 = r0 + r1;	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r1 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r1.<init>(r0);	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r1.append(r13);	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r13 = "\n";	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r1.append(r13);	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r1.append(r2);	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r4 = r1.toString();	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r6 = r12.getX();	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r7 = r12.getY();	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r13 = r12.getWidth();	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r8 = (float) r13;	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r12 = r12.getHeight();	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r9 = (float) r12;	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r3 = r11;	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r5 = r14;	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r3.zza(r4, r5, r6, r7, r8, r9);	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        goto L_0x007c;	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
    L_0x0065:
        r4 = r12.getX();	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r5 = r12.getY();	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r13 = r12.getWidth();	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r6 = (float) r13;	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r12 = r12.getHeight();	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r7 = (float) r12;	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r1 = r11;	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r3 = r14;	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r1.zza(r2, r3, r4, r5, r6, r7);	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
    L_0x007c:
        r12 = r11.zzgg();	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        if (r12 == 0) goto L_0x0087;	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
    L_0x0082:
        r12 = r10.zzayk;	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
        r12.zzb(r11);	 Catch:{ JSONException -> 0x0096, Throwable -> 0x0088 }
    L_0x0087:
        return;
    L_0x0088:
        r11 = move-exception;
        r12 = "Failed to get webview content.";
        com.google.android.gms.internal.zzaiw.zza(r12, r11);
        r12 = r10.zzayl;
        r13 = "ContentFetchTask.processWebViewContent";
        r12.zza(r11, r13);
        return;
    L_0x0096:
        r11 = "Json string may be malformed.";
        com.google.android.gms.internal.zzaiw.zzbw(r11);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzgt.zza(com.google.android.gms.internal.zzgn, android.webkit.WebView, java.lang.String, boolean):void");
    }

    final void zzf(View view) {
        try {
            zzgn zzgn = new zzgn(this.zzaxi, this.zzayn, this.zzaxk, this.zzayo, this.zzayp, this.zzayq, this.zzayr);
            zzgx zza = zza(view, zzgn);
            zzgn.zzgn();
            if (zza.zzazb != 0 || zza.zzazc != 0) {
                if (zza.zzazc != 0 || zzgn.zzgo() != 0) {
                    if (zza.zzazc != 0 || !this.zzayk.zza(zzgn)) {
                        this.zzayk.zzc(zzgn);
                    }
                }
            }
        } catch (Throwable e) {
            zzaiw.zzb("Exception in fetchContentOnUIThread", e);
            this.zzayl.zza(e, "ContentFetchTask.fetchContent");
        }
    }

    public final void zzgq() {
        synchronized (this.mLock) {
            if (this.mStarted) {
                zzaiw.zzbw("Content hash thread already started, quiting...");
                return;
            }
            this.mStarted = true;
            start();
        }
    }

    public final zzgn zzgs() {
        return this.zzayk.zzgp();
    }

    public final boolean zzgu() {
        return this.zzayj;
    }
}
