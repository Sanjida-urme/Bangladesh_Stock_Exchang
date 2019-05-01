package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.common.internal.zzbq;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

@zzzb
public class zzoe implements zzoa {
    private final Context mContext;
    private final Object mLock = new Object();
    @Nullable
    private final zzaiy zzaov;
    @Nullable
    private zzaek zzapk;
    @Nullable
    private final zzyg zzaqq;
    @Nullable
    private String zzaqr;
    private final zzob zzbsv;
    @Nullable
    private final JSONObject zzbsy;
    @Nullable
    private final zzoc zzbsz;
    private final zzcs zzbta;
    boolean zzbtb;
    private WeakReference<View> zzbtc = null;

    public zzoe(Context context, zzob zzob, @Nullable zzyg zzyg, zzcs zzcs, @Nullable JSONObject jSONObject, @Nullable zzoc zzoc, @Nullable zzaiy zzaiy, @Nullable String str) {
        this.mContext = context;
        this.zzbsv = zzob;
        this.zzaqq = zzyg;
        this.zzbta = zzcs;
        this.zzbsy = jSONObject;
        this.zzbsz = zzoc;
        this.zzaov = zzaiy;
        this.zzaqr = str;
    }

    private final org.json.JSONObject zza(java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r12, android.view.View r13) {
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
        r11 = this;
        r0 = new org.json.JSONObject;
        r0.<init>();
        if (r12 == 0) goto L_0x00fe;
    L_0x0007:
        if (r13 != 0) goto L_0x000a;
    L_0x0009:
        return r0;
    L_0x000a:
        r13 = zzh(r13);
        r12 = r12.entrySet();
        r12 = r12.iterator();
    L_0x0016:
        r1 = r12.hasNext();
        if (r1 == 0) goto L_0x00fe;
    L_0x001c:
        r1 = r12.next();
        r1 = (java.util.Map.Entry) r1;
        r2 = r1.getValue();
        r2 = (java.lang.ref.WeakReference) r2;
        r2 = r2.get();
        r2 = (android.view.View) r2;
        if (r2 == 0) goto L_0x0016;
    L_0x0030:
        r3 = zzh(r2);
        r4 = new org.json.JSONObject;
        r4.<init>();
        r5 = new org.json.JSONObject;
        r5.<init>();
        r6 = "width";	 Catch:{ JSONException -> 0x00f7 }
        r7 = r2.getMeasuredWidth();	 Catch:{ JSONException -> 0x00f7 }
        r7 = r11.zzt(r7);	 Catch:{ JSONException -> 0x00f7 }
        r5.put(r6, r7);	 Catch:{ JSONException -> 0x00f7 }
        r6 = "height";	 Catch:{ JSONException -> 0x00f7 }
        r7 = r2.getMeasuredHeight();	 Catch:{ JSONException -> 0x00f7 }
        r7 = r11.zzt(r7);	 Catch:{ JSONException -> 0x00f7 }
        r5.put(r6, r7);	 Catch:{ JSONException -> 0x00f7 }
        r6 = "x";	 Catch:{ JSONException -> 0x00f7 }
        r7 = 0;	 Catch:{ JSONException -> 0x00f7 }
        r8 = r3[r7];	 Catch:{ JSONException -> 0x00f7 }
        r9 = r13[r7];	 Catch:{ JSONException -> 0x00f7 }
        r8 = r8 - r9;	 Catch:{ JSONException -> 0x00f7 }
        r8 = r11.zzt(r8);	 Catch:{ JSONException -> 0x00f7 }
        r5.put(r6, r8);	 Catch:{ JSONException -> 0x00f7 }
        r6 = "y";	 Catch:{ JSONException -> 0x00f7 }
        r8 = 1;	 Catch:{ JSONException -> 0x00f7 }
        r9 = r3[r8];	 Catch:{ JSONException -> 0x00f7 }
        r10 = r13[r8];	 Catch:{ JSONException -> 0x00f7 }
        r9 = r9 - r10;	 Catch:{ JSONException -> 0x00f7 }
        r9 = r11.zzt(r9);	 Catch:{ JSONException -> 0x00f7 }
        r5.put(r6, r9);	 Catch:{ JSONException -> 0x00f7 }
        r6 = "relative_to";	 Catch:{ JSONException -> 0x00f7 }
        r9 = "ad_view";	 Catch:{ JSONException -> 0x00f7 }
        r5.put(r6, r9);	 Catch:{ JSONException -> 0x00f7 }
        r6 = "frame";	 Catch:{ JSONException -> 0x00f7 }
        r4.put(r6, r5);	 Catch:{ JSONException -> 0x00f7 }
        r5 = new android.graphics.Rect;	 Catch:{ JSONException -> 0x00f7 }
        r5.<init>();	 Catch:{ JSONException -> 0x00f7 }
        r6 = r2.getLocalVisibleRect(r5);	 Catch:{ JSONException -> 0x00f7 }
        if (r6 == 0) goto L_0x0092;	 Catch:{ JSONException -> 0x00f7 }
    L_0x008d:
        r3 = r11.zzb(r5);	 Catch:{ JSONException -> 0x00f7 }
        goto L_0x00c5;	 Catch:{ JSONException -> 0x00f7 }
    L_0x0092:
        r5 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x00f7 }
        r5.<init>();	 Catch:{ JSONException -> 0x00f7 }
        r6 = "width";	 Catch:{ JSONException -> 0x00f7 }
        r5.put(r6, r7);	 Catch:{ JSONException -> 0x00f7 }
        r6 = "height";	 Catch:{ JSONException -> 0x00f7 }
        r5.put(r6, r7);	 Catch:{ JSONException -> 0x00f7 }
        r6 = "x";	 Catch:{ JSONException -> 0x00f7 }
        r9 = r3[r7];	 Catch:{ JSONException -> 0x00f7 }
        r7 = r13[r7];	 Catch:{ JSONException -> 0x00f7 }
        r9 = r9 - r7;	 Catch:{ JSONException -> 0x00f7 }
        r7 = r11.zzt(r9);	 Catch:{ JSONException -> 0x00f7 }
        r5.put(r6, r7);	 Catch:{ JSONException -> 0x00f7 }
        r6 = "y";	 Catch:{ JSONException -> 0x00f7 }
        r3 = r3[r8];	 Catch:{ JSONException -> 0x00f7 }
        r7 = r13[r8];	 Catch:{ JSONException -> 0x00f7 }
        r3 = r3 - r7;	 Catch:{ JSONException -> 0x00f7 }
        r3 = r11.zzt(r3);	 Catch:{ JSONException -> 0x00f7 }
        r5.put(r6, r3);	 Catch:{ JSONException -> 0x00f7 }
        r3 = "relative_to";	 Catch:{ JSONException -> 0x00f7 }
        r6 = "ad_view";	 Catch:{ JSONException -> 0x00f7 }
        r5.put(r3, r6);	 Catch:{ JSONException -> 0x00f7 }
        r3 = r5;	 Catch:{ JSONException -> 0x00f7 }
    L_0x00c5:
        r5 = "visible_bounds";	 Catch:{ JSONException -> 0x00f7 }
        r4.put(r5, r3);	 Catch:{ JSONException -> 0x00f7 }
        r3 = r2 instanceof android.widget.TextView;	 Catch:{ JSONException -> 0x00f7 }
        if (r3 == 0) goto L_0x00ec;	 Catch:{ JSONException -> 0x00f7 }
    L_0x00ce:
        r2 = (android.widget.TextView) r2;	 Catch:{ JSONException -> 0x00f7 }
        r3 = "text_color";	 Catch:{ JSONException -> 0x00f7 }
        r5 = r2.getCurrentTextColor();	 Catch:{ JSONException -> 0x00f7 }
        r4.put(r3, r5);	 Catch:{ JSONException -> 0x00f7 }
        r3 = "font_size";	 Catch:{ JSONException -> 0x00f7 }
        r5 = r2.getTextSize();	 Catch:{ JSONException -> 0x00f7 }
        r5 = (double) r5;	 Catch:{ JSONException -> 0x00f7 }
        r4.put(r3, r5);	 Catch:{ JSONException -> 0x00f7 }
        r3 = "text";	 Catch:{ JSONException -> 0x00f7 }
        r2 = r2.getText();	 Catch:{ JSONException -> 0x00f7 }
        r4.put(r3, r2);	 Catch:{ JSONException -> 0x00f7 }
    L_0x00ec:
        r1 = r1.getKey();	 Catch:{ JSONException -> 0x00f7 }
        r1 = (java.lang.String) r1;	 Catch:{ JSONException -> 0x00f7 }
        r0.put(r1, r4);	 Catch:{ JSONException -> 0x00f7 }
        goto L_0x0016;
    L_0x00f7:
        r1 = "Unable to get asset views information";
        com.google.android.gms.internal.zzaiw.zzco(r1);
        goto L_0x0016;
    L_0x00fe:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzoe.zza(java.util.Map, android.view.View):org.json.JSONObject");
    }

    private final void zza(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6) {
        zzbq.zzga("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.zzbsy);
            if (jSONObject2 != null) {
                jSONObject7.put("asset_view_signal", jSONObject2);
            }
            if (jSONObject != null) {
                jSONObject7.put("ad_view_signal", jSONObject);
            }
            if (jSONObject5 != null) {
                jSONObject7.put("click_signal", jSONObject5);
            }
            if (jSONObject3 != null) {
                jSONObject7.put("scroll_view_signal", jSONObject3);
            }
            if (jSONObject4 != null) {
                jSONObject7.put("lock_screen_signal", jSONObject4);
            }
            jSONObject = new JSONObject();
            jSONObject.put("asset_id", str);
            jSONObject.put("template", this.zzbsz.zzjo());
            zzbs.zzee();
            jSONObject.put("is_privileged_process", zzagw.zzqd());
            boolean z = false;
            jSONObject.put("has_custom_click_handler", this.zzbsv.zzr(this.zzbsz.getCustomTemplateId()) != null);
            String str2 = "has_custom_click_handler";
            if (this.zzbsv.zzr(this.zzbsz.getCustomTemplateId()) != null) {
                z = true;
            }
            jSONObject7.put(str2, z);
            try {
                jSONObject2 = this.zzbsy.optJSONObject("tracking_urls_and_actions");
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                jSONObject.put("click_signals", this.zzbta.zzad().zza(this.mContext, jSONObject2.optString("click_string"), view));
            } catch (Throwable e) {
                zzaiw.zzb("Exception obtaining click signals", e);
            }
            jSONObject7.put("click", jSONObject);
            if (jSONObject6 != null) {
                jSONObject7.put("provided_signals", jSONObject6);
            }
            jSONObject7.put("ads_id", this.zzaqr);
            zzaje.zza(this.zzaqq.zzj(jSONObject7), "NativeAdEngineImpl.performClick");
        } catch (Throwable e2) {
            zzaiw.zzb("Unable to create click JSON.", e2);
        }
    }

    private final boolean zza(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        zzbq.zzga("recordImpression must be called on the main UI thread.");
        if (this.zzbtb) {
            return true;
        }
        this.zzbtb = true;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.zzbsy);
            jSONObject6.put("ads_id", this.zzaqr);
            if (jSONObject2 != null) {
                jSONObject6.put("asset_view_signal", jSONObject2);
            }
            if (jSONObject != null) {
                jSONObject6.put("ad_view_signal", jSONObject);
            }
            if (jSONObject3 != null) {
                jSONObject6.put("scroll_view_signal", jSONObject3);
            }
            if (jSONObject4 != null) {
                jSONObject6.put("lock_screen_signal", jSONObject4);
            }
            if (jSONObject5 != null) {
                jSONObject6.put("provided_signals", jSONObject5);
            }
            zzaje.zza(this.zzaqq.zzk(jSONObject6), "NativeAdEngineImpl.recordImpression");
            this.zzbsv.zza((zzoa) this);
            this.zzbsv.zzbw();
            return true;
        } catch (Throwable e) {
            zzaiw.zzb("Unable to create impression JSON.", e);
            return false;
        }
    }

    private final boolean zzaq(String str) {
        JSONObject optJSONObject = this.zzbsy == null ? null : this.zzbsy.optJSONObject("allow_pub_event_reporting");
        return optJSONObject == null ? false : optJSONObject.optBoolean(str, false);
    }

    private final JSONObject zzb(Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", zzt(rect.right - rect.left));
        jSONObject.put("height", zzt(rect.bottom - rect.top));
        jSONObject.put("x", zzt(rect.left));
        jSONObject.put("y", zzt(rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    private static int[] zzh(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    private final org.json.JSONObject zzi(android.view.View r8) {
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
        r7 = this;
        r0 = new org.json.JSONObject;
        r0.<init>();
        if (r8 != 0) goto L_0x0008;
    L_0x0007:
        return r0;
    L_0x0008:
        r1 = zzh(r8);	 Catch:{ Exception -> 0x0091 }
        r2 = new org.json.JSONObject;	 Catch:{ Exception -> 0x0091 }
        r2.<init>();	 Catch:{ Exception -> 0x0091 }
        r3 = "width";	 Catch:{ Exception -> 0x0091 }
        r4 = r8.getMeasuredWidth();	 Catch:{ Exception -> 0x0091 }
        r4 = r7.zzt(r4);	 Catch:{ Exception -> 0x0091 }
        r2.put(r3, r4);	 Catch:{ Exception -> 0x0091 }
        r3 = "height";	 Catch:{ Exception -> 0x0091 }
        r4 = r8.getMeasuredHeight();	 Catch:{ Exception -> 0x0091 }
        r4 = r7.zzt(r4);	 Catch:{ Exception -> 0x0091 }
        r2.put(r3, r4);	 Catch:{ Exception -> 0x0091 }
        r3 = "x";	 Catch:{ Exception -> 0x0091 }
        r4 = 0;	 Catch:{ Exception -> 0x0091 }
        r5 = r1[r4];	 Catch:{ Exception -> 0x0091 }
        r5 = r7.zzt(r5);	 Catch:{ Exception -> 0x0091 }
        r2.put(r3, r5);	 Catch:{ Exception -> 0x0091 }
        r3 = "y";	 Catch:{ Exception -> 0x0091 }
        r5 = 1;	 Catch:{ Exception -> 0x0091 }
        r6 = r1[r5];	 Catch:{ Exception -> 0x0091 }
        r6 = r7.zzt(r6);	 Catch:{ Exception -> 0x0091 }
        r2.put(r3, r6);	 Catch:{ Exception -> 0x0091 }
        r3 = "relative_to";	 Catch:{ Exception -> 0x0091 }
        r6 = "window";	 Catch:{ Exception -> 0x0091 }
        r2.put(r3, r6);	 Catch:{ Exception -> 0x0091 }
        r3 = "frame";	 Catch:{ Exception -> 0x0091 }
        r0.put(r3, r2);	 Catch:{ Exception -> 0x0091 }
        r2 = new android.graphics.Rect;	 Catch:{ Exception -> 0x0091 }
        r2.<init>();	 Catch:{ Exception -> 0x0091 }
        r8 = r8.getGlobalVisibleRect(r2);	 Catch:{ Exception -> 0x0091 }
        if (r8 == 0) goto L_0x005f;	 Catch:{ Exception -> 0x0091 }
    L_0x005a:
        r8 = r7.zzb(r2);	 Catch:{ Exception -> 0x0091 }
        goto L_0x008b;	 Catch:{ Exception -> 0x0091 }
    L_0x005f:
        r8 = new org.json.JSONObject;	 Catch:{ Exception -> 0x0091 }
        r8.<init>();	 Catch:{ Exception -> 0x0091 }
        r2 = "width";	 Catch:{ Exception -> 0x0091 }
        r8.put(r2, r4);	 Catch:{ Exception -> 0x0091 }
        r2 = "height";	 Catch:{ Exception -> 0x0091 }
        r8.put(r2, r4);	 Catch:{ Exception -> 0x0091 }
        r2 = "x";	 Catch:{ Exception -> 0x0091 }
        r3 = r1[r4];	 Catch:{ Exception -> 0x0091 }
        r3 = r7.zzt(r3);	 Catch:{ Exception -> 0x0091 }
        r8.put(r2, r3);	 Catch:{ Exception -> 0x0091 }
        r2 = "y";	 Catch:{ Exception -> 0x0091 }
        r1 = r1[r5];	 Catch:{ Exception -> 0x0091 }
        r1 = r7.zzt(r1);	 Catch:{ Exception -> 0x0091 }
        r8.put(r2, r1);	 Catch:{ Exception -> 0x0091 }
        r1 = "relative_to";	 Catch:{ Exception -> 0x0091 }
        r2 = "window";	 Catch:{ Exception -> 0x0091 }
        r8.put(r1, r2);	 Catch:{ Exception -> 0x0091 }
    L_0x008b:
        r1 = "visible_bounds";	 Catch:{ Exception -> 0x0091 }
        r0.put(r1, r8);	 Catch:{ Exception -> 0x0091 }
        return r0;
    L_0x0091:
        r8 = "Unable to get native ad view bounding box";
        com.google.android.gms.internal.zzaiw.zzco(r8);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzoe.zzi(android.view.View):org.json.JSONObject");
    }

    private static org.json.JSONObject zzj(android.view.View r3) {
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
        r0 = new org.json.JSONObject;
        r0.<init>();
        if (r3 != 0) goto L_0x0008;
    L_0x0007:
        return r0;
    L_0x0008:
        com.google.android.gms.ads.internal.zzbs.zzec();	 Catch:{ Exception -> 0x001a }
        r3 = com.google.android.gms.internal.zzagr.zzr(r3);	 Catch:{ Exception -> 0x001a }
        r1 = "contained_in_scroll_view";	 Catch:{ Exception -> 0x001a }
        r2 = -1;	 Catch:{ Exception -> 0x001a }
        if (r3 == r2) goto L_0x0016;	 Catch:{ Exception -> 0x001a }
    L_0x0014:
        r3 = 1;	 Catch:{ Exception -> 0x001a }
        goto L_0x0017;	 Catch:{ Exception -> 0x001a }
    L_0x0016:
        r3 = 0;	 Catch:{ Exception -> 0x001a }
    L_0x0017:
        r0.put(r1, r3);	 Catch:{ Exception -> 0x001a }
    L_0x001a:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzoe.zzj(android.view.View):org.json.JSONObject");
    }

    private final org.json.JSONObject zzk(android.view.View r3) {
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
        r2 = this;
        r0 = new org.json.JSONObject;
        r0.<init>();
        if (r3 != 0) goto L_0x0008;
    L_0x0007:
        return r0;
    L_0x0008:
        r1 = "can_show_on_lock_screen";	 Catch:{ JSONException -> 0x0023 }
        com.google.android.gms.ads.internal.zzbs.zzec();	 Catch:{ JSONException -> 0x0023 }
        r3 = com.google.android.gms.internal.zzagr.zzq(r3);	 Catch:{ JSONException -> 0x0023 }
        r0.put(r1, r3);	 Catch:{ JSONException -> 0x0023 }
        r3 = "is_keyguard_locked";	 Catch:{ JSONException -> 0x0023 }
        com.google.android.gms.ads.internal.zzbs.zzec();	 Catch:{ JSONException -> 0x0023 }
        r1 = r2.mContext;	 Catch:{ JSONException -> 0x0023 }
        r1 = com.google.android.gms.internal.zzagr.zzas(r1);	 Catch:{ JSONException -> 0x0023 }
        r0.put(r3, r1);	 Catch:{ JSONException -> 0x0023 }
        return r0;
    L_0x0023:
        r3 = "Unable to get lock screen information";
        com.google.android.gms.internal.zzaiw.zzco(r3);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzoe.zzk(android.view.View):org.json.JSONObject");
    }

    private final int zzt(int i) {
        zzjk.zzhx();
        return zzais.zzd(this.mContext, i);
    }

    public final Context getContext() {
        return this.mContext;
    }

    public final void performClick(Bundle bundle) {
        if (bundle == null) {
            zzaiw.zzbw("Click data is null. No click is reported.");
        } else if (zzaq("click_reporting")) {
            zza(null, null, null, null, null, bundle.getBundle("click_signal").getString("asset_id"), null, zzbs.zzec().zza(bundle, null));
        } else {
            zzaiw.m3e("The ad slot cannot handle external click events. You must be whitelisted to be able to report your click events.");
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        if (zzaq("impression_reporting")) {
            return zza(null, null, null, null, zzbs.zzec().zza(bundle, null));
        }
        zzaiw.m3e("The ad slot cannot handle external impression events. You must be whitelisted to whitelisted to be able to report your impression events.");
        return false;
    }

    public final void reportTouchEvent(Bundle bundle) {
        if (bundle == null) {
            zzaiw.zzbw("Touch event data is null. No touch event is reported.");
        } else if (zzaq("touch_reporting")) {
            this.zzbta.zzad().zza((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
        } else {
            zzaiw.m3e("The ad slot cannot handle external touch events. You must be whitelisted to be able to report your touch events.");
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.Nullable
    public android.view.View zza(android.view.View.OnClickListener r7, boolean r8) {
        /*
        r6 = this;
        r0 = r6.zzbsz;
        r0 = r0.zzjp();
        if (r0 != 0) goto L_0x000a;
    L_0x0008:
        r7 = 0;
        return r7;
    L_0x000a:
        r1 = new android.widget.RelativeLayout$LayoutParams;
        r2 = -2;
        r1.<init>(r2, r2);
        if (r8 != 0) goto L_0x0038;
    L_0x0012:
        r8 = r0.zzjj();
        r2 = 9;
        r3 = 10;
        if (r8 == 0) goto L_0x0032;
    L_0x001c:
        r4 = 12;
        r5 = 11;
        switch(r8) {
            case 2: goto L_0x002e;
            case 3: goto L_0x002a;
            default: goto L_0x0023;
        };
    L_0x0023:
        r1.addRule(r3);
    L_0x0026:
        r1.addRule(r5);
        goto L_0x0038;
    L_0x002a:
        r1.addRule(r4);
        goto L_0x0035;
    L_0x002e:
        r1.addRule(r4);
        goto L_0x0026;
    L_0x0032:
        r1.addRule(r3);
    L_0x0035:
        r1.addRule(r2);
    L_0x0038:
        r8 = new com.google.android.gms.internal.zznq;
        r2 = r6.mContext;
        r8.<init>(r2, r0, r1);
        r8.setOnClickListener(r7);
        r7 = com.google.android.gms.internal.zzmq.zzbnb;
        r0 = com.google.android.gms.ads.internal.zzbs.zzep();
        r7 = r0.zzd(r7);
        r7 = (java.lang.CharSequence) r7;
        r8.setContentDescription(r7);
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzoe.zza(android.view.View$OnClickListener, boolean):android.view.View");
    }

    public final void zza(android.view.View r4, com.google.android.gms.internal.zzny r5) {
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
        r5 = r3.zzb(r4, r5);
        if (r5 == 0) goto L_0x0007;
    L_0x0006:
        return;
    L_0x0007:
        r5 = new android.widget.FrameLayout$LayoutParams;
        r0 = -1;
        r5.<init>(r0, r0);
        r0 = r4;
        r0 = (android.widget.FrameLayout) r0;
        r0.removeAllViews();
        r0 = r3.zzbsz;
        r0 = r0 instanceof com.google.android.gms.internal.zzod;
        if (r0 != 0) goto L_0x001a;
    L_0x0019:
        return;
    L_0x001a:
        r0 = r3.zzbsz;
        r0 = (com.google.android.gms.internal.zzod) r0;
        r1 = r0.getImages();
        if (r1 == 0) goto L_0x006b;
    L_0x0024:
        r1 = r0.getImages();
        r1 = r1.size();
        if (r1 <= 0) goto L_0x006b;
    L_0x002e:
        r0 = r0.getImages();
        r1 = 0;
        r0 = r0.get(r1);
        r1 = r0 instanceof android.os.IBinder;
        if (r1 == 0) goto L_0x0042;
    L_0x003b:
        r0 = (android.os.IBinder) r0;
        r0 = com.google.android.gms.internal.zzoz.zzk(r0);
        goto L_0x0043;
    L_0x0042:
        r0 = 0;
    L_0x0043:
        if (r0 == 0) goto L_0x006b;
    L_0x0045:
        r0 = r0.zzjl();	 Catch:{ RemoteException -> 0x0066 }
        if (r0 == 0) goto L_0x0065;	 Catch:{ RemoteException -> 0x0066 }
    L_0x004b:
        r0 = com.google.android.gms.dynamic.zzn.zzx(r0);	 Catch:{ RemoteException -> 0x0066 }
        r0 = (android.graphics.drawable.Drawable) r0;	 Catch:{ RemoteException -> 0x0066 }
        r1 = new android.widget.ImageView;	 Catch:{ RemoteException -> 0x0066 }
        r2 = r3.mContext;	 Catch:{ RemoteException -> 0x0066 }
        r1.<init>(r2);	 Catch:{ RemoteException -> 0x0066 }
        r1.setImageDrawable(r0);	 Catch:{ RemoteException -> 0x0066 }
        r0 = android.widget.ImageView.ScaleType.CENTER_INSIDE;	 Catch:{ RemoteException -> 0x0066 }
        r1.setScaleType(r0);	 Catch:{ RemoteException -> 0x0066 }
        r4 = (android.widget.FrameLayout) r4;	 Catch:{ RemoteException -> 0x0066 }
        r4.addView(r1, r5);	 Catch:{ RemoteException -> 0x0066 }
    L_0x0065:
        return;
    L_0x0066:
        r4 = "Could not get drawable from image";
        com.google.android.gms.internal.zzaiw.zzco(r4);
    L_0x006b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzoe.zza(android.view.View, com.google.android.gms.internal.zzny):void");
    }

    public final void zza(View view, String str, @Nullable Bundle bundle, Map<String, WeakReference<View>> map, View view2) {
        JSONObject jSONObject;
        Throwable e;
        JSONObject zza = zza((Map) map, view2);
        JSONObject zzi = zzi(view2);
        JSONObject zzj = zzj(view2);
        JSONObject zzk = zzk(view2);
        JSONObject jSONObject2 = null;
        try {
            JSONObject zza2 = zzbs.zzec().zza(bundle, null);
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("click_point", zza2);
                jSONObject3.put("asset_id", str);
                jSONObject = jSONObject3;
            } catch (Exception e2) {
                e = e2;
                jSONObject2 = jSONObject3;
                zzaiw.zzb("Error occurred while grabbing click signals.", e);
                jSONObject = jSONObject2;
                zza(view, zzi, zza, zzj, zzk, str, jSONObject, null);
            }
        } catch (Exception e3) {
            e = e3;
            zzaiw.zzb("Error occurred while grabbing click signals.", e);
            jSONObject = jSONObject2;
            zza(view, zzi, zza, zzj, zzk, str, jSONObject, null);
        }
        zza(view, zzi, zza, zzj, zzk, str, jSONObject, null);
    }

    public void zza(View view, Map<String, WeakReference<View>> map) {
        zza(zzi(view), zza((Map) map, view), zzj(view), zzk(view), null);
    }

    public void zza(View view, Map<String, WeakReference<View>> map, Bundle bundle, View view2) {
        zzbq.zzga("performClick must be called on the main UI thread.");
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    String str = (String) entry.getKey();
                    break;
                }
            }
        }
        if ("2".equals(this.zzbsz.zzjo())) {
            str = "2099";
            zza(view, str, bundle, (Map) map, view2);
            return;
        }
        if ("1".equals(this.zzbsz.zzjo())) {
            zza(view, "1099", bundle, (Map) map, view2);
        }
    }

    public void zza(View view, @Nullable Map<String, WeakReference<View>> map, @Nullable Map<String, WeakReference<View>> map2, OnTouchListener onTouchListener, OnClickListener onClickListener) {
        if (((Boolean) zzbs.zzep().zzd(zzmq.zzbmz)).booleanValue()) {
            View view2;
            view.setOnTouchListener(onTouchListener);
            view.setClickable(true);
            view.setOnClickListener(onClickListener);
            if (map != null) {
                for (Entry value : map.entrySet()) {
                    view2 = (View) ((WeakReference) value.getValue()).get();
                    if (view2 != null) {
                        view2.setOnTouchListener(onTouchListener);
                        view2.setClickable(true);
                        view2.setOnClickListener(onClickListener);
                    }
                }
            }
            if (map2 != null) {
                for (Entry value2 : map2.entrySet()) {
                    view2 = (View) ((WeakReference) value2.getValue()).get();
                    if (view2 != null) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                }
            }
        }
    }

    public void zzb(View view, Map<String, WeakReference<View>> map) {
        if (!((Boolean) zzbs.zzep().zzd(zzmq.zzbmy)).booleanValue()) {
            view.setOnTouchListener(null);
            view.setClickable(false);
            view.setOnClickListener(null);
            if (map != null) {
                for (Entry value : map.entrySet()) {
                    View view2 = (View) ((WeakReference) value.getValue()).get();
                    if (view2 != null) {
                        view2.setOnTouchListener(null);
                        view2.setClickable(false);
                        view2.setOnClickListener(null);
                    }
                }
            }
        }
    }

    public final boolean zzb(View view, zzny zzny) {
        LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        View zzjq = this.zzbsz.zzjq();
        if (zzjq == null) {
            return false;
        }
        ViewParent parent = zzjq.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(zzjq);
        }
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        frameLayout.addView(zzjq, layoutParams);
        this.zzbsv.zza(zzny);
        return true;
    }

    public final void zzc(View view, Map<String, WeakReference<View>> map) {
        synchronized (this.mLock) {
            if (this.zzbtb) {
            } else if (!view.isShown()) {
            } else if (view.getGlobalVisibleRect(new Rect(), null)) {
                zza(view, (Map) map);
            }
        }
    }

    public final void zzd(MotionEvent motionEvent) {
        this.zzbta.zza(motionEvent);
    }

    public final void zzg(View view) {
        this.zzbtc = new WeakReference(view);
    }

    public final void zzg(Map<String, WeakReference<View>> map) {
        if (this.zzbsz.zzjq() != null) {
            if ("2".equals(this.zzbsz.zzjo())) {
                zzbs.zzeg().zzb(this.mContext, this.zzbsv.getAdUnitId(), this.zzbsz.zzjo(), map.containsKey(NativeAppInstallAd.ASSET_MEDIA_VIDEO));
            } else if ("1".equals(this.zzbsz.zzjo())) {
                zzbs.zzeg().zzb(this.mContext, this.zzbsv.getAdUnitId(), this.zzbsz.zzjo(), map.containsKey(NativeContentAd.ASSET_MEDIA_VIDEO));
            }
        }
    }

    public boolean zzjw() {
        zznp zzjp = this.zzbsz.zzjp();
        return zzjp != null && zzjp.zzjk();
    }

    public boolean zzjx() {
        return this.zzbsy != null && this.zzbsy.optBoolean("allow_pub_owned_ad_view", false);
    }

    public zzama zzka() throws zzamm {
        if (this.zzbsy == null || this.zzbsy.optJSONObject("overlay") == null) {
            return null;
        }
        zzamk zzed = zzbs.zzed();
        Context context = this.mContext;
        zziw zzg = zziw.zzg(this.mContext);
        zzama zza = zzed.zza(context, zzanp.zzc(zzg), zzg.zzbda, false, false, this.zzbta, this.zzaov, null, null, null, zzib.zzhi());
        if (zza != null) {
            if (zza == null) {
                throw null;
            }
            ((View) zza).setVisibility(8);
            new zzog(zza).zza(this.zzaqq);
        }
        return zza;
    }

    public void zzkb() {
        this.zzaqq.zzlm();
    }

    public void zzkc() {
        this.zzbsv.zzcp();
    }

    public final View zzkd() {
        return this.zzbtc != null ? (View) this.zzbtc.get() : null;
    }

    @Nullable
    public final zzaek zzke() {
        if (!zzbs.zzfa().zzt(this.mContext)) {
            return null;
        }
        if (this.zzapk == null) {
            this.zzapk = new zzaek(this.mContext, this.zzbsv.getAdUnitId());
        }
        return this.zzapk;
    }
}
