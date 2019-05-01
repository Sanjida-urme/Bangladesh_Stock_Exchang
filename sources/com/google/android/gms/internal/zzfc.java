package com.google.android.gms.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.PowerManager;
import android.provider.Settings.System;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzbs;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzzb
public final class zzfc implements OnGlobalLayoutListener, OnScrollChangedListener {
    private final Context mApplicationContext;
    private Object mLock = new Object();
    private boolean zzarc = false;
    private zzail zzaui;
    private final WeakReference<zzaeu> zzauy;
    private WeakReference<ViewTreeObserver> zzauz;
    private final zzgm zzava;
    protected final zzfa zzavb;
    private final WindowManager zzavc;
    private final PowerManager zzavd;
    private final KeyguardManager zzave;
    private final DisplayMetrics zzavf;
    @Nullable
    private zzfj zzavg;
    private boolean zzavh;
    private boolean zzavi = false;
    private boolean zzavj;
    private boolean zzavk;
    private boolean zzavl;
    @Nullable
    private BroadcastReceiver zzavm;
    private final HashSet<Object> zzavn = new HashSet();
    private final HashSet<zzfx> zzavo = new HashSet();
    private final Rect zzavp = new Rect();
    private final zzff zzavq;
    private float zzavr;

    public zzfc(Context context, zziw zziw, zzaeu zzaeu, zzaiy zzaiy, zzgm zzgm) {
        this.zzauy = new WeakReference(zzaeu);
        this.zzava = zzgm;
        this.zzauz = new WeakReference(null);
        this.zzavj = true;
        this.zzavl = false;
        this.zzaui = new zzail(200);
        this.zzavb = new zzfa(UUID.randomUUID().toString(), zzaiy, zziw.zzbda, zzaeu.zzcvq, zzaeu.zzfr(), zziw.zzbdd);
        this.zzavc = (WindowManager) context.getSystemService("window");
        this.zzavd = (PowerManager) context.getApplicationContext().getSystemService("power");
        this.zzave = (KeyguardManager) context.getSystemService("keyguard");
        this.mApplicationContext = context;
        this.zzavq = new zzff(this, new Handler());
        this.mApplicationContext.getContentResolver().registerContentObserver(System.CONTENT_URI, true, this.zzavq);
        this.zzavf = context.getResources().getDisplayMetrics();
        Display defaultDisplay = this.zzavc.getDefaultDisplay();
        this.zzavp.right = defaultDisplay.getWidth();
        this.zzavp.bottom = defaultDisplay.getHeight();
        zzft();
    }

    private final boolean isScreenOn() {
        return VERSION.SDK_INT >= 20 ? this.zzavd.isInteractive() : this.zzavd.isScreenOn();
    }

    private static int zza(int i, DisplayMetrics displayMetrics) {
        return (int) (((float) i) / displayMetrics.density);
    }

    private final JSONObject zza(@Nullable View view, @Nullable Boolean bool) throws JSONException {
        if (view == null) {
            return zzfy().put("isAttachedToWindow", false).put("isScreenOn", isScreenOn()).put("isVisible", false);
        }
        boolean isAttachedToWindow = zzbs.zzee().isAttachedToWindow(view);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        try {
            view.getLocationOnScreen(iArr);
            view.getLocationInWindow(iArr2);
        } catch (Throwable e) {
            zzaiw.zzb("Failure getting view location.", e);
        }
        Rect rect = new Rect();
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = rect.left + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        Rect rect2 = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect2, null);
        Rect rect3 = new Rect();
        boolean localVisibleRect = view.getLocalVisibleRect(rect3);
        Rect rect4 = new Rect();
        view.getHitRect(rect4);
        JSONObject zzfy = zzfy();
        zzfy.put("windowVisibility", view.getWindowVisibility()).put("isAttachedToWindow", isAttachedToWindow).put("viewBox", new JSONObject().put("top", zza(this.zzavp.top, this.zzavf)).put("bottom", zza(this.zzavp.bottom, this.zzavf)).put("left", zza(this.zzavp.left, this.zzavf)).put("right", zza(this.zzavp.right, this.zzavf))).put("adBox", new JSONObject().put("top", zza(rect.top, this.zzavf)).put("bottom", zza(rect.bottom, this.zzavf)).put("left", zza(rect.left, this.zzavf)).put("right", zza(rect.right, this.zzavf))).put("globalVisibleBox", new JSONObject().put("top", zza(rect2.top, this.zzavf)).put("bottom", zza(rect2.bottom, this.zzavf)).put("left", zza(rect2.left, this.zzavf)).put("right", zza(rect2.right, this.zzavf))).put("globalVisibleBoxVisible", globalVisibleRect).put("localVisibleBox", new JSONObject().put("top", zza(rect3.top, this.zzavf)).put("bottom", zza(rect3.bottom, this.zzavf)).put("left", zza(rect3.left, this.zzavf)).put("right", zza(rect3.right, this.zzavf))).put("localVisibleBoxVisible", localVisibleRect).put("hitBox", new JSONObject().put("top", zza(rect4.top, this.zzavf)).put("bottom", zza(rect4.bottom, this.zzavf)).put("left", zza(rect4.left, this.zzavf)).put("right", zza(rect4.right, this.zzavf))).put("screenDensity", (double) this.zzavf.density);
        if (bool == null) {
            bool = Boolean.valueOf(zzbs.zzec().zza(view, this.zzavd, this.zzave));
        }
        zzfy.put("isVisible", bool.booleanValue());
        return zzfy;
    }

    private final void zza(JSONObject jSONObject, boolean z) {
        try {
            jSONObject = zzb(jSONObject);
            ArrayList arrayList = new ArrayList(this.zzavo);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((zzfx) obj).zzb(jSONObject, z);
            }
        } catch (Throwable th) {
            zzaiw.zzb("Skipping active view message.", th);
        }
    }

    private static JSONObject zzb(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }

    private final void zzfv() {
        if (this.zzavg != null) {
            this.zzavg.zza(this);
        }
    }

    private final void zzfx() {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.zzauz.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this);
            viewTreeObserver.removeGlobalOnLayoutListener(this);
        }
    }

    private final JSONObject zzfy() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        zzbs.zzec();
        zzbs.zzec();
        jSONObject.put("afmaVersion", this.zzavb.zzfo()).put("activeViewJSON", this.zzavb.zzfp()).put("timestamp", zzbs.zzei().elapsedRealtime()).put("adFormat", this.zzavb.zzfn()).put("hashCode", this.zzavb.zzfq()).put("isMraid", this.zzavb.zzfr()).put("isStopped", this.zzavi).put("isPaused", this.zzarc).put("isNative", this.zzavb.zzfs()).put("isScreenOn", isScreenOn()).put("appMuted", zzagr.zzdi()).put("appVolume", (double) zzagr.zzdh()).put("deviceVolume", (double) this.zzavr);
        return jSONObject;
    }

    public final void onGlobalLayout() {
        zzl(2);
    }

    public final void onScrollChanged() {
        zzl(1);
    }

    public final void pause() {
        synchronized (this.mLock) {
            this.zzarc = true;
            zzl(3);
        }
    }

    public final void resume() {
        synchronized (this.mLock) {
            this.zzarc = false;
            zzl(3);
        }
    }

    public final void stop() {
        synchronized (this.mLock) {
            this.zzavi = true;
            zzl(3);
        }
    }

    public final void zza(zzfj zzfj) {
        synchronized (this.mLock) {
            this.zzavg = zzfj;
        }
    }

    public final void zza(zzfx zzfx) {
        if (this.zzavo.isEmpty()) {
            synchronized (this.mLock) {
                if (this.zzavm == null) {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                    intentFilter.addAction("android.intent.action.SCREEN_OFF");
                    this.zzavm = new zzfd(this);
                    this.mApplicationContext.registerReceiver(this.zzavm, intentFilter);
                }
            }
            zzl(3);
        }
        this.zzavo.add(zzfx);
        try {
            zzfx.zzb(zzb(zza(this.zzava.zzfz(), null)), false);
        } catch (Throwable e) {
            zzaiw.zzb("Skipping measurement update for new client.", e);
        }
    }

    final void zza(zzfx zzfx, Map<String, String> map) {
        String str = "Received request to untrack: ";
        String valueOf = String.valueOf(this.zzavb.zzfq());
        zzaiw.zzbw(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        zzb(zzfx);
    }

    public final void zzb(zzfx zzfx) {
        this.zzavo.remove(zzfx);
        zzfx.zzgd();
        if (this.zzavo.isEmpty()) {
            synchronized (this.mLock) {
                zzfx();
                synchronized (this.mLock) {
                    if (this.zzavm != null) {
                        try {
                            this.mApplicationContext.unregisterReceiver(this.zzavm);
                        } catch (Throwable e) {
                            zzaiw.zzb("Failed trying to unregister the receiver", e);
                        } catch (Throwable e2) {
                            zzbs.zzeg().zza(e2, "ActiveViewUnit.stopScreenStatusMonitoring");
                        }
                        this.zzavm = null;
                    }
                }
                this.mApplicationContext.getContentResolver().unregisterContentObserver(this.zzavq);
                int i = 0;
                this.zzavj = false;
                zzfv();
                ArrayList arrayList = new ArrayList(this.zzavo);
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    zzb((zzfx) obj);
                }
            }
        }
    }

    final boolean zzd(@Nullable Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(this.zzavb.zzfq());
    }

    final void zze(Map<String, String> map) {
        zzl(3);
    }

    final void zzf(Map<String, String> map) {
        if (map.containsKey("isVisible")) {
            if (!"1".equals(map.get("isVisible"))) {
                "true".equals(map.get("isVisible"));
            }
            Iterator it = this.zzavn.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public final void zzft() {
        zzbs.zzec();
        this.zzavr = zzagr.zzap(this.mApplicationContext);
    }

    public final void zzfu() {
        synchronized (this.mLock) {
            if (this.zzavj) {
                String str;
                String str2;
                this.zzavk = true;
                try {
                    JSONObject zzfy = zzfy();
                    zzfy.put("doneReasonCode", "u");
                    zza(zzfy, true);
                } catch (JSONException e) {
                    Throwable e2 = e;
                    str = "JSON failure while processing active view data.";
                    zzaiw.zzb(str, e2);
                    str2 = "Untracking ad unit: ";
                    str = String.valueOf(this.zzavb.zzfq());
                    zzaiw.zzbw(str.length() != 0 ? new String(str2) : str2.concat(str));
                } catch (RuntimeException e3) {
                    e2 = e3;
                    str = "Failure while processing active view data.";
                    zzaiw.zzb(str, e2);
                    str2 = "Untracking ad unit: ";
                    str = String.valueOf(this.zzavb.zzfq());
                    if (str.length() != 0) {
                    }
                    zzaiw.zzbw(str.length() != 0 ? new String(str2) : str2.concat(str));
                }
                str2 = "Untracking ad unit: ";
                str = String.valueOf(this.zzavb.zzfq());
                if (str.length() != 0) {
                }
                zzaiw.zzbw(str.length() != 0 ? new String(str2) : str2.concat(str));
            }
        }
    }

    public final boolean zzfw() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzavj;
        }
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final void zzl(int r8) {
        /*
        r7 = this;
        r0 = r7.mLock;
        monitor-enter(r0);
        r1 = r7.zzavo;	 Catch:{ all -> 0x00ce }
        r1 = r1.iterator();	 Catch:{ all -> 0x00ce }
    L_0x0009:
        r2 = r1.hasNext();	 Catch:{ all -> 0x00ce }
        r3 = 0;
        r4 = 1;
        if (r2 == 0) goto L_0x001f;
    L_0x0011:
        r2 = r1.next();	 Catch:{ all -> 0x00ce }
        r2 = (com.google.android.gms.internal.zzfx) r2;	 Catch:{ all -> 0x00ce }
        r2 = r2.zzgc();	 Catch:{ all -> 0x00ce }
        if (r2 == 0) goto L_0x0009;
    L_0x001d:
        r1 = 1;
        goto L_0x0020;
    L_0x001f:
        r1 = 0;
    L_0x0020:
        if (r1 == 0) goto L_0x00cc;
    L_0x0022:
        r1 = r7.zzavj;	 Catch:{ all -> 0x00ce }
        if (r1 != 0) goto L_0x0028;
    L_0x0026:
        goto L_0x00cc;
    L_0x0028:
        r1 = r7.zzava;	 Catch:{ all -> 0x00ce }
        r1 = r1.zzfz();	 Catch:{ all -> 0x00ce }
        if (r1 == 0) goto L_0x0040;
    L_0x0030:
        r2 = com.google.android.gms.ads.internal.zzbs.zzec();	 Catch:{ all -> 0x00ce }
        r5 = r7.zzavd;	 Catch:{ all -> 0x00ce }
        r6 = r7.zzave;	 Catch:{ all -> 0x00ce }
        r2 = r2.zza(r1, r5, r6);	 Catch:{ all -> 0x00ce }
        if (r2 == 0) goto L_0x0040;
    L_0x003e:
        r2 = 1;
        goto L_0x0041;
    L_0x0040:
        r2 = 0;
    L_0x0041:
        if (r1 == 0) goto L_0x0053;
    L_0x0043:
        if (r2 == 0) goto L_0x0053;
    L_0x0045:
        r5 = new android.graphics.Rect;	 Catch:{ all -> 0x00ce }
        r5.<init>();	 Catch:{ all -> 0x00ce }
        r6 = 0;
        r5 = r1.getGlobalVisibleRect(r5, r6);	 Catch:{ all -> 0x00ce }
        if (r5 == 0) goto L_0x0053;
    L_0x0051:
        r5 = 1;
        goto L_0x0054;
    L_0x0053:
        r5 = 0;
    L_0x0054:
        r6 = r7.zzava;	 Catch:{ all -> 0x00ce }
        r6 = r6.zzga();	 Catch:{ all -> 0x00ce }
        if (r6 == 0) goto L_0x0061;
    L_0x005c:
        r7.zzfu();	 Catch:{ all -> 0x00ce }
        monitor-exit(r0);	 Catch:{ all -> 0x00ce }
        return;
    L_0x0061:
        if (r8 != r4) goto L_0x0071;
    L_0x0063:
        r6 = r7.zzaui;	 Catch:{ all -> 0x00ce }
        r6 = r6.tryAcquire();	 Catch:{ all -> 0x00ce }
        if (r6 != 0) goto L_0x0071;
    L_0x006b:
        r6 = r7.zzavl;	 Catch:{ all -> 0x00ce }
        if (r5 != r6) goto L_0x0071;
    L_0x006f:
        monitor-exit(r0);	 Catch:{ all -> 0x00ce }
        return;
    L_0x0071:
        if (r5 != 0) goto L_0x007b;
    L_0x0073:
        r6 = r7.zzavl;	 Catch:{ all -> 0x00ce }
        if (r6 != 0) goto L_0x007b;
    L_0x0077:
        if (r8 != r4) goto L_0x007b;
    L_0x0079:
        monitor-exit(r0);	 Catch:{ all -> 0x00ce }
        return;
    L_0x007b:
        r8 = java.lang.Boolean.valueOf(r2);	 Catch:{ JSONException -> 0x0089, JSONException -> 0x0089 }
        r8 = r7.zza(r1, r8);	 Catch:{ JSONException -> 0x0089, JSONException -> 0x0089 }
        r7.zza(r8, r3);	 Catch:{ JSONException -> 0x0089, JSONException -> 0x0089 }
        r7.zzavl = r5;	 Catch:{ JSONException -> 0x0089, JSONException -> 0x0089 }
        goto L_0x008f;
    L_0x0089:
        r8 = move-exception;
        r1 = "Active view update failed.";
        com.google.android.gms.internal.zzaiw.zza(r1, r8);	 Catch:{ all -> 0x00ce }
    L_0x008f:
        r8 = r7.zzava;	 Catch:{ all -> 0x00ce }
        r8 = r8.zzgb();	 Catch:{ all -> 0x00ce }
        r8 = r8.zzfz();	 Catch:{ all -> 0x00ce }
        if (r8 == 0) goto L_0x00c7;
    L_0x009b:
        r1 = r7.zzauz;	 Catch:{ all -> 0x00ce }
        r1 = r1.get();	 Catch:{ all -> 0x00ce }
        r1 = (android.view.ViewTreeObserver) r1;	 Catch:{ all -> 0x00ce }
        r8 = r8.getViewTreeObserver();	 Catch:{ all -> 0x00ce }
        if (r8 == r1) goto L_0x00c7;
    L_0x00a9:
        r7.zzfx();	 Catch:{ all -> 0x00ce }
        r2 = r7.zzavh;	 Catch:{ all -> 0x00ce }
        if (r2 == 0) goto L_0x00b8;
    L_0x00b0:
        if (r1 == 0) goto L_0x00c0;
    L_0x00b2:
        r1 = r1.isAlive();	 Catch:{ all -> 0x00ce }
        if (r1 == 0) goto L_0x00c0;
    L_0x00b8:
        r7.zzavh = r4;	 Catch:{ all -> 0x00ce }
        r8.addOnScrollChangedListener(r7);	 Catch:{ all -> 0x00ce }
        r8.addOnGlobalLayoutListener(r7);	 Catch:{ all -> 0x00ce }
    L_0x00c0:
        r1 = new java.lang.ref.WeakReference;	 Catch:{ all -> 0x00ce }
        r1.<init>(r8);	 Catch:{ all -> 0x00ce }
        r7.zzauz = r1;	 Catch:{ all -> 0x00ce }
    L_0x00c7:
        r7.zzfv();	 Catch:{ all -> 0x00ce }
        monitor-exit(r0);	 Catch:{ all -> 0x00ce }
        return;
    L_0x00cc:
        monitor-exit(r0);	 Catch:{ all -> 0x00ce }
        return;
    L_0x00ce:
        r8 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00ce }
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzfc.zzl(int):void");
    }
}
