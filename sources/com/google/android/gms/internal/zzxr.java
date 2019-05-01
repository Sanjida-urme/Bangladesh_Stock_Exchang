package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzba;
import com.google.android.gms.ads.internal.zzbs;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzzb
public final class zzxr implements Callable<zzaeu> {
    private static long zzciq = 10;
    private final Context mContext;
    private int mErrorCode;
    private final Object mLock = new Object();
    private final zznd zzamo;
    private final zzyg zzaqq;
    private final zzcs zzbta;
    private final zzaev zzchv;
    private final zzahy zzcir;
    private final zzba zzcis;
    private boolean zzcit;
    private List<String> zzciu;
    private JSONObject zzciv;
    private String zzciw;

    public zzxr(Context context, zzba zzba, zzahy zzahy, zzcs zzcs, zzaev zzaev, zznd zznd) {
        this.mContext = context;
        this.zzcis = zzba;
        this.zzcir = zzahy;
        this.zzchv = zzaev;
        this.zzbta = zzcs;
        this.zzamo = zznd;
        this.zzaqq = zzba.zzdk();
        this.zzcit = false;
        this.mErrorCode = -2;
        this.zzciu = null;
        this.zzciw = null;
    }

    private final zzaeu zza(zzoc zzoc) {
        int i;
        zzoc zzoc2;
        synchronized (this.mLock) {
            try {
                i = (zzoc == null && r1.mErrorCode == -2) ? 0 : r1.mErrorCode;
            } finally {
                Object obj = r0;
            }
        }
        if (i == -2) {
            zzoc2 = zzoc;
        }
        zzis zzis = r1.zzchv.zzcpe.zzclo;
        List list = r1.zzchv.zzcwe.zzcbv;
        List list2 = r1.zzchv.zzcwe.zzcbw;
        List list3 = r1.zzciu;
        int i2 = r1.zzchv.zzcwe.orientation;
        long j = r1.zzchv.zzcwe.zzccb;
        String str = r1.zzchv.zzcpe.zzclr;
        zziw zziw = r1.zzchv.zzath;
        long j2 = r1.zzchv.zzcwe.zzcnf;
        List list4 = list;
        long j3 = r1.zzchv.zzcvw;
        long j4 = j2;
        long j5 = r1.zzchv.zzcvx;
        String str2 = r1.zzchv.zzcwe.zzcnl;
        JSONObject jSONObject = r1.zzciv;
        boolean z = r1.zzchv.zzcwe.zzcny;
        zzaaf zzaaf = r1.zzchv.zzcwe.zzcnz;
        List list5 = r1.zzchv.zzcwe.zzcby;
        return new zzaeu(zzis, null, list4, i, list2, list3, i2, j, str, false, null, null, null, null, null, 0, zziw, j4, j3, j5, str2, jSONObject, zzoc2, null, null, null, z, zzaaf, null, list5, r1.zzciw, r1.zzchv.zzcwc, r1.zzchv.zzcwe.zzapy, r1.zzchv.zzcwd);
    }

    private final zzajp<zznr> zza(JSONObject jSONObject, boolean z, boolean z2) throws JSONException {
        String string = z ? jSONObject.getString("url") : jSONObject.optString("url");
        double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        if (!TextUtils.isEmpty(string)) {
            return z2 ? zzajg.zzi(new zznr(null, Uri.parse(string), optDouble)) : this.zzcir.zza(string, new zzxv(this, z, optDouble, optBoolean, string));
        } else {
            zzd(0, z);
            return zzajg.zzi(null);
        }
    }

    static zzama zzb(zzajp<zzama> zzajp) {
        try {
            return (zzama) zzajp.get((long) ((Integer) zzbs.zzep().zzd(zzmq.zzbna)).intValue(), TimeUnit.SECONDS);
        } catch (Throwable e) {
            zzaiw.zzc("InterruptedException occurred while waiting for video to load", e);
            Thread.currentThread().interrupt();
            return null;
        } catch (Throwable e2) {
            zzaiw.zzc("Exception occurred while waiting for video to load", e2);
            return null;
        }
    }

    private static java.lang.Integer zzb(org.json.JSONObject r2, java.lang.String r3) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/558922244.run(Unknown Source)
*/
        /*
        r2 = r2.getJSONObject(r3);	 Catch:{ JSONException -> 0x001f }
        r3 = "r";	 Catch:{ JSONException -> 0x001f }
        r3 = r2.getInt(r3);	 Catch:{ JSONException -> 0x001f }
        r0 = "g";	 Catch:{ JSONException -> 0x001f }
        r0 = r2.getInt(r0);	 Catch:{ JSONException -> 0x001f }
        r1 = "b";	 Catch:{ JSONException -> 0x001f }
        r2 = r2.getInt(r1);	 Catch:{ JSONException -> 0x001f }
        r2 = android.graphics.Color.rgb(r3, r0, r2);	 Catch:{ JSONException -> 0x001f }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ JSONException -> 0x001f }
        return r2;
    L_0x001f:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzxr.zzb(org.json.JSONObject, java.lang.String):java.lang.Integer");
    }

    private final void zzc(zzpu zzpu, String str) {
        try {
            zzqe zzr = this.zzcis.zzr(zzpu.getCustomTemplateId());
            if (zzr != null) {
                zzr.zzb(zzpu, str);
            }
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 40);
            stringBuilder.append("Failed to call onCustomClick for asset ");
            stringBuilder.append(str);
            stringBuilder.append(".");
            zzaiw.zzc(stringBuilder.toString(), e);
        }
    }

    private static String[] zzd(JSONObject jSONObject, String str) throws JSONException {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        String[] strArr = new String[optJSONArray.length()];
        for (int i = 0; i < optJSONArray.length(); i++) {
            strArr[i] = optJSONArray.getString(i);
        }
        return strArr;
    }

    private static <V> zzajp<List<V>> zzk(List<zzajp<V>> list) {
        zzajp zzajy = new zzajy();
        int size = list.size();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        for (zzajp zza : list) {
            zza.zza(new zzxw(atomicInteger, size, zzajy, list), zzagl.zzcyx);
        }
        return zzajy;
    }

    private static <V> List<V> zzl(List<zzajp<V>> list) throws ExecutionException, InterruptedException {
        List<V> arrayList = new ArrayList();
        for (zzajp zzajp : list) {
            Object obj = zzajp.get();
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final com.google.android.gms.internal.zzaeu zzna() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/558922244.run(Unknown Source)
*/
        /*
        r13 = this;
        r0 = 0;
        r1 = 0;
        r2 = r13.zzcis;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r11 = r2.getUuid();	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r2 = r13.zznb();	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        if (r2 != 0) goto L_0x004d;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
    L_0x000e:
        r2 = new com.google.android.gms.internal.zzajy;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r2.<init>();	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r2 = new com.google.android.gms.internal.zzxq;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r2.<init>();	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r2 = new org.json.JSONObject;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r3 = r13.zzchv;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r3 = r3.zzcwe;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r3 = r3.body;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r2.<init>(r3);	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r3 = r13.zzaqq;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r2 = r3.zzi(r2);	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r3 = zzciq;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r5 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r2 = r2.get(r3, r5);	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r2 = (org.json.JSONObject) r2;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r3 = "success";	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r3 = r2.optBoolean(r3, r1);	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        if (r3 == 0) goto L_0x004d;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
    L_0x003b:
        r3 = "json";	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r2 = r2.getJSONObject(r3);	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r3 = "ads";	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r2 = r2.optJSONArray(r3);	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r2 = r2.getJSONObject(r1);	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r8 = r2;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        goto L_0x004e;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
    L_0x004d:
        r8 = r0;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
    L_0x004e:
        r2 = r13.zznb();	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        if (r2 != 0) goto L_0x00f7;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
    L_0x0054:
        if (r8 != 0) goto L_0x0058;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
    L_0x0056:
        goto L_0x00f7;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
    L_0x0058:
        r2 = "template_id";	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r2 = r8.getString(r2);	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r3 = r13.zzchv;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r3 = r3.zzcpe;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r3 = r3.zzatt;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        if (r3 == 0) goto L_0x006f;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
    L_0x0066:
        r3 = r13.zzchv;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r3 = r3.zzcpe;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r3 = r3.zzatt;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r3 = r3.zzbtj;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        goto L_0x0070;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
    L_0x006f:
        r3 = 0;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
    L_0x0070:
        r4 = r13.zzchv;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r4 = r4.zzcpe;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r4 = r4.zzatt;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        if (r4 == 0) goto L_0x0081;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
    L_0x0078:
        r4 = r13.zzchv;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r4 = r4.zzcpe;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r4 = r4.zzatt;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r4 = r4.zzbtl;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        goto L_0x0082;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
    L_0x0081:
        r4 = 0;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
    L_0x0082:
        r5 = "2";	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r5 = r5.equals(r2);	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        if (r5 == 0) goto L_0x0094;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
    L_0x008a:
        r2 = new com.google.android.gms.internal.zzyh;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r5 = r13.zzchv;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r5 = r5.zzcwd;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r2.<init>(r3, r4, r5);	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        goto L_0x00f8;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
    L_0x0094:
        r5 = "1";	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r5 = r5.equals(r2);	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        if (r5 == 0) goto L_0x00a6;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
    L_0x009c:
        r2 = new com.google.android.gms.internal.zzyi;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r5 = r13.zzchv;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r5 = r5.zzcwd;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r2.<init>(r3, r4, r5);	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        goto L_0x00f8;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
    L_0x00a6:
        r4 = "3";	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r2 = r4.equals(r2);	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        if (r2 == 0) goto L_0x00f4;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
    L_0x00ae:
        r2 = "custom_template_id";	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r2 = r8.getString(r2);	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r4 = new com.google.android.gms.internal.zzajy;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r4.<init>();	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r5 = com.google.android.gms.internal.zzagr.zzczc;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r6 = new com.google.android.gms.internal.zzxs;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r6.<init>(r13, r4, r2);	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r5.post(r6);	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r5 = zzciq;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r2 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r2 = r4.get(r5, r2);	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        if (r2 == 0) goto L_0x00d3;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
    L_0x00cd:
        r2 = new com.google.android.gms.internal.zzyj;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r2.<init>(r3);	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        goto L_0x00f8;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
    L_0x00d3:
        r2 = "No handler for custom template: ";	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r3 = "custom_template_id";	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r3 = r8.getString(r3);	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r4 = r3.length();	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        if (r4 == 0) goto L_0x00ea;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
    L_0x00e5:
        r2 = r2.concat(r3);	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        goto L_0x00f0;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
    L_0x00ea:
        r3 = new java.lang.String;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r3.<init>(r2);	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r2 = r3;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
    L_0x00f0:
        com.google.android.gms.internal.zzaiw.m3e(r2);	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        goto L_0x00f7;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
    L_0x00f4:
        r13.zzz(r1);	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
    L_0x00f7:
        r2 = r0;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
    L_0x00f8:
        r3 = r13.zznb();	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        if (r3 != 0) goto L_0x0146;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
    L_0x00fe:
        if (r2 == 0) goto L_0x0146;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
    L_0x0100:
        if (r8 != 0) goto L_0x0103;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
    L_0x0102:
        goto L_0x0146;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
    L_0x0103:
        r3 = "tracking_urls_and_actions";	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r3 = r8.getJSONObject(r3);	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r4 = "impression_tracking_urls";	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r4 = zzd(r3, r4);	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        if (r4 != 0) goto L_0x0113;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
    L_0x0111:
        r4 = r0;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        goto L_0x0117;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
    L_0x0113:
        r4 = java.util.Arrays.asList(r4);	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
    L_0x0117:
        r13.zzciu = r4;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r4 = "active_view";	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r3 = r3.optJSONObject(r4);	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r13.zzciv = r3;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r3 = "debug_signals";	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r3 = r8.optString(r3);	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r13.zzciw = r3;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r2 = r2.zza(r13, r8);	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r12 = new com.google.android.gms.internal.zzoe;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r4 = r13.mContext;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r5 = r13.zzcis;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r6 = r13.zzaqq;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r7 = r13.zzbta;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r3 = r13.zzchv;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r3 = r3.zzcpe;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r10 = r3.zzatd;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r3 = r12;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r9 = r2;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11);	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r2.zzb(r12);	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        goto L_0x0147;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
    L_0x0146:
        r2 = r0;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
    L_0x0147:
        r3 = r2 instanceof com.google.android.gms.internal.zznw;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        if (r3 == 0) goto L_0x0161;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
    L_0x014b:
        r3 = r2;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r3 = (com.google.android.gms.internal.zznw) r3;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r4 = new com.google.android.gms.internal.zzxq;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r4.<init>();	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r5 = new com.google.android.gms.internal.zzxt;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r5.<init>(r13, r3);	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r4.zzcip = r5;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r3 = r13.zzaqq;	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r4 = "/nativeAdCustomClick";	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        r3.zza(r4, r5);	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
    L_0x0161:
        r2 = r13.zza(r2);	 Catch:{ CancellationException -> 0x0174, CancellationException -> 0x0174, CancellationException -> 0x0174, JSONException -> 0x016e, TimeoutException -> 0x016a, Exception -> 0x0166 }
        return r2;
    L_0x0166:
        r2 = move-exception;
        r3 = "Error occured while doing native ads initialization.";
        goto L_0x0171;
    L_0x016a:
        r2 = move-exception;
        r3 = "Timeout when loading native ad.";
        goto L_0x0171;
    L_0x016e:
        r2 = move-exception;
        r3 = "Malformed native JSON response.";
    L_0x0171:
        com.google.android.gms.internal.zzaiw.zzc(r3, r2);
    L_0x0174:
        r2 = r13.zzcit;
        if (r2 != 0) goto L_0x017b;
    L_0x0178:
        r13.zzz(r1);
    L_0x017b:
        r0 = r13.zza(r0);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzxr.zzna():com.google.android.gms.internal.zzaeu");
    }

    private final boolean zznb() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzcit;
        }
        return z;
    }

    private final void zzz(int i) {
        synchronized (this.mLock) {
            this.zzcit = true;
            this.mErrorCode = i;
        }
    }

    public final /* synthetic */ Object call() throws Exception {
        return zzna();
    }

    public final zzajp<zznr> zza(JSONObject jSONObject, String str, boolean z, boolean z2) throws JSONException {
        jSONObject = z ? jSONObject.getJSONObject(str) : jSONObject.optJSONObject(str);
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return zza(jSONObject, z, z2);
    }

    public final List<zzajp<zznr>> zza(JSONObject jSONObject, String str, boolean z, boolean z2, boolean z3) throws JSONException {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        List<zzajp<zznr>> arrayList = new ArrayList();
        if (optJSONArray != null) {
            if (optJSONArray.length() != 0) {
                int length = z3 ? optJSONArray.length() : 1;
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                    }
                    arrayList.add(zza(jSONObject2, false, z2));
                }
                return arrayList;
            }
        }
        zzd(0, false);
        return arrayList;
    }

    public final Future<zznr> zza(JSONObject jSONObject, String str, boolean z) throws JSONException {
        jSONObject = jSONObject.getJSONObject(str);
        boolean optBoolean = jSONObject.optBoolean("require", true);
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return zza(jSONObject, optBoolean, z);
    }

    public final zzajp<zzama> zzc(JSONObject jSONObject, String str) throws JSONException {
        jSONObject = jSONObject.optJSONObject(str);
        if (jSONObject == null) {
            return zzajg.zzi(null);
        }
        if (TextUtils.isEmpty(jSONObject.optString("vast_xml"))) {
            zzaiw.zzco("Required field 'vast_xml' is missing");
            return zzajg.zzi(null);
        }
        zzxy zzxy = new zzxy(this.mContext, this.zzbta, this.zzchv, this.zzamo, this.zzcis);
        zzajp zzajy = new zzajy();
        zzbs.zzec();
        zzagr.runOnUiThread(new zzxz(zzxy, jSONObject, zzajy));
        return zzajy;
    }

    public final void zzd(int i, boolean z) {
        if (z) {
            zzz(i);
        }
    }

    public final zzajp<zznp> zzh(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return zzajg.zzi(null);
        }
        String optString = optJSONObject.optString("text");
        int optInt = optJSONObject.optInt("text_size", -1);
        Integer zzb = zzb(optJSONObject, "text_color");
        Integer zzb2 = zzb(optJSONObject, "bg_color");
        int optInt2 = optJSONObject.optInt("animation_ms", 1000);
        int optInt3 = optJSONObject.optInt("presentation_ms", 4000);
        int i = (this.zzchv.zzcpe.zzatt == null || this.zzchv.zzcpe.zzatt.versionCode < 2) ? 1 : this.zzchv.zzcpe.zzatt.zzbtm;
        boolean optBoolean = optJSONObject.optBoolean("allow_pub_rendering");
        List arrayList = new ArrayList();
        if (optJSONObject.optJSONArray("images") != null) {
            arrayList = zza(optJSONObject, "images", false, false, true);
        } else {
            arrayList.add(zza(optJSONObject, "image", false, false));
        }
        return zzajg.zza(zzk(arrayList), new zzxu(this, optString, zzb2, zzb, optInt, optInt3, optInt2, i, optBoolean), zzagl.zzcyx);
    }
}
