package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Debug;
import android.os.Debug.MemoryInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.PowerManager;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.common.util.zzq;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzzb
public final class zzagr {
    public static final Handler zzczc = new zzafk(Looper.getMainLooper());
    private static AtomicReference<List<String>> zzczd = new AtomicReference(null);
    private static AtomicReference<List<String>> zzcze = new AtomicReference(null);
    private final Object mLock = new Object();
    private String zzcxh;
    private boolean zzczf = true;
    private boolean zzczg = false;
    private Pattern zzczh;
    private Pattern zzczi;

    public static void runOnUiThread(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            zzczc.post(runnable);
        }
    }

    public static Bundle zza(zzgt zzgt) {
        if (zzgt == null) {
            return null;
        }
        if (!((Boolean) zzbs.zzep().zzd(zzmq.zzbig)).booleanValue()) {
            if (!((Boolean) zzbs.zzep().zzd(zzmq.zzbii)).booleanValue()) {
                return null;
            }
        }
        if (zzbs.zzeg().zzos() && zzbs.zzeg().zzot()) {
            return null;
        }
        String zzgh;
        String zzgi;
        String zzgj;
        if (zzgt.zzgu()) {
            zzgt.wakeup();
        }
        zzgn zzgs = zzgt.zzgs();
        if (zzgs != null) {
            zzgh = zzgs.zzgh();
            zzgi = zzgs.zzgi();
            zzgj = zzgs.zzgj();
            if (zzgh != null) {
                zzbs.zzeg().zzbz(zzgh);
            }
            if (zzgj != null) {
                zzbs.zzeg().zzca(zzgj);
            }
        } else {
            zzgh = zzbs.zzeg().zzoy();
            zzgj = zzbs.zzeg().zzoz();
            zzgi = null;
        }
        Bundle bundle = new Bundle(1);
        if (zzgj != null) {
            if (((Boolean) zzbs.zzep().zzd(zzmq.zzbii)).booleanValue() && !zzbs.zzeg().zzot()) {
                bundle.putString("v_fp_vertical", zzgj);
            }
        }
        if (zzgh != null) {
            if (((Boolean) zzbs.zzep().zzd(zzmq.zzbig)).booleanValue() && !zzbs.zzeg().zzos()) {
                bundle.putString("fingerprint", zzgh);
                if (!zzgh.equals(zzgi)) {
                    bundle.putString("v_fp", zzgi);
                }
            }
        }
        return !bundle.isEmpty() ? bundle : null;
    }

    public static DisplayMetrics zza(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static PopupWindow zza(View view, int i, int i2, boolean z) {
        return new PopupWindow(view, i, i2, false);
    }

    public static String zza(Context context, View view, zziw zziw) {
        if (!((Boolean) zzbs.zzep().zzd(zzmq.zzbiy)).booleanValue()) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", zziw.width);
            jSONObject2.put("height", zziw.height);
            jSONObject.put("size", jSONObject2);
            jSONObject.put("activity", zzal(context));
            if (!zziw.zzbdb) {
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent != null) {
                        int i = -1;
                        if (parent instanceof ViewGroup) {
                            i = ((ViewGroup) parent).indexOfChild(view);
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("type", parent.getClass().getName());
                        jSONObject3.put("index_of_child", i);
                        jSONArray.put(jSONObject3);
                    }
                    view = (parent == null || !(parent instanceof View)) ? null : (View) parent;
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("parents", jSONArray);
                }
            }
            return jSONObject.toString();
        } catch (Throwable e) {
            zzaiw.zzc("Fail to get view hierarchy json", e);
            return null;
        }
    }

    public static java.lang.String zza(android.content.Context r2, com.google.android.gms.internal.zzcs r3, java.lang.String r4, android.view.View r5) {
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
        if (r3 != 0) goto L_0x0003;
    L_0x0002:
        return r4;
    L_0x0003:
        r0 = android.net.Uri.parse(r4);	 Catch:{ Exception -> 0x0016 }
        r1 = r3.zzc(r0);	 Catch:{ Exception -> 0x0016 }
        if (r1 == 0) goto L_0x0011;	 Catch:{ Exception -> 0x0016 }
    L_0x000d:
        r0 = r3.zza(r0, r2, r5);	 Catch:{ Exception -> 0x0016 }
    L_0x0011:
        r2 = r0.toString();	 Catch:{ Exception -> 0x0016 }
        return r2;
    L_0x0016:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzagr.zza(android.content.Context, com.google.android.gms.internal.zzcs, java.lang.String, android.view.View):java.lang.String");
    }

    public static String zza(InputStreamReader inputStreamReader) throws IOException {
        StringBuilder stringBuilder = new StringBuilder(8192);
        char[] cArr = new char[2048];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read == -1) {
                return stringBuilder.toString();
            }
            stringBuilder.append(cArr, 0, read);
        }
    }

    private final JSONArray zza(Collection<?> collection) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object zza : collection) {
            zza(jSONArray, zza);
        }
        return jSONArray;
    }

    public static void zza(Activity activity, OnGlobalLayoutListener onGlobalLayoutListener) {
        Window window = activity.getWindow();
        if (window != null && window.getDecorView() != null && window.getDecorView().getViewTreeObserver() != null) {
            window.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void zza(Activity activity, OnScrollChangedListener onScrollChangedListener) {
        Window window = activity.getWindow();
        if (window != null && window.getDecorView() != null && window.getDecorView().getViewTreeObserver() != null) {
            window.getDecorView().getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
        }
    }

    public static void zza(android.content.Context r1, android.content.Intent r2) {
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
        r1.startActivity(r2);	 Catch:{ Throwable -> 0x0004 }
        return;
    L_0x0004:
        r0 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r2.addFlags(r0);
        r1.startActivity(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzagr.zza(android.content.Context, android.content.Intent):void");
    }

    @TargetApi(18)
    public static void zza(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            if (((Boolean) zzbs.zzep().zzd(zzmq.zzbow)).booleanValue()) {
                zzb(context, intent);
            }
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(uri2).length() + 26);
            stringBuilder.append("Opening ");
            stringBuilder.append(uri2);
            stringBuilder.append(" in a new browser.");
            zzaiw.zzbw(stringBuilder.toString());
        } catch (Throwable e) {
            zzaiw.zzb("No browser is found.", e);
        }
    }

    public static void zza(Context context, String str, List<String> list) {
        for (String zzaik : list) {
            new zzaik(context, str, zzaik).zzmx();
        }
    }

    private final void zza(JSONArray jSONArray, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            obj = zzc((Bundle) obj);
        } else if (obj instanceof Map) {
            obj = zzp((Map) obj);
        } else if (obj instanceof Collection) {
            obj = zza((Collection) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            JSONArray jSONArray2 = new JSONArray();
            for (Object zza : objArr) {
                zza(jSONArray2, zza);
            }
            jSONArray.put(jSONArray2);
            return;
        } else {
            jSONArray.put(obj);
            return;
        }
        jSONArray.put(obj);
    }

    private final void zza(JSONObject jSONObject, String str, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            obj = zzc((Bundle) obj);
        } else if (obj instanceof Map) {
            obj = zzp((Map) obj);
        } else {
            Collection collection;
            if (obj instanceof Collection) {
                if (str == null) {
                    str = "null";
                }
                collection = (Collection) obj;
            } else if (obj instanceof Object[]) {
                collection = Arrays.asList((Object[]) obj);
            } else {
                jSONObject.put(str, obj);
                return;
            }
            obj = zza(collection);
        }
        jSONObject.put(str, obj);
    }

    @TargetApi(24)
    public static boolean zza(Activity activity, Configuration configuration) {
        zzjk.zzhx();
        int zzc = zzais.zzc(activity, configuration.screenHeightDp);
        int zzc2 = zzais.zzc(activity, configuration.screenWidthDp);
        DisplayMetrics zza = zza((WindowManager) activity.getApplicationContext().getSystemService("window"));
        int i = zza.heightPixels;
        int i2 = zza.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        identifier = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int round = ((int) Math.round(((double) activity.getResources().getDisplayMetrics().density) + 0.5d)) * ((Integer) zzbs.zzep().zzd(zzmq.zzbpg)).intValue();
        return zzb(i, zzc + identifier, round) && zzb(i2, zzc2, round);
    }

    public static boolean zza(java.lang.ClassLoader r1, java.lang.Class<?> r2, java.lang.String r3) {
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
        r0 = 0;
        r1 = java.lang.Class.forName(r3, r0, r1);	 Catch:{ Throwable -> 0x000a }
        r1 = r2.isAssignableFrom(r1);	 Catch:{ Throwable -> 0x000a }
        return r1;
    L_0x000a:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzagr.zza(java.lang.ClassLoader, java.lang.Class, java.lang.String):boolean");
    }

    public static boolean zzag(Context context) {
        String format;
        Intent intent = new Intent();
        intent.setClassName(context, AdActivity.CLASS_NAME);
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity != null) {
            if (resolveActivity.activityInfo != null) {
                boolean z;
                String str = "com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".";
                if ((resolveActivity.activityInfo.configChanges & 16) == 0) {
                    zzaiw.zzco(String.format(str, new Object[]{"keyboard"}));
                    z = false;
                } else {
                    z = true;
                }
                if ((resolveActivity.activityInfo.configChanges & 32) == 0) {
                    zzaiw.zzco(String.format(str, new Object[]{"keyboardHidden"}));
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & 128) == 0) {
                    zzaiw.zzco(String.format(str, new Object[]{"orientation"}));
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & 256) == 0) {
                    zzaiw.zzco(String.format(str, new Object[]{"screenLayout"}));
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & 512) == 0) {
                    zzaiw.zzco(String.format(str, new Object[]{"uiMode"}));
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & 1024) == 0) {
                    zzaiw.zzco(String.format(str, new Object[]{"screenSize"}));
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & 2048) != 0) {
                    return z;
                }
                format = String.format(str, new Object[]{"smallestScreenSize"});
                zzaiw.zzco(format);
                return false;
            }
        }
        format = "Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.";
        zzaiw.zzco(format);
        return false;
    }

    protected static java.lang.String zzai(android.content.Context r1) {
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
        r0 = new android.webkit.WebView;	 Catch:{ Throwable -> 0x000e }
        r0.<init>(r1);	 Catch:{ Throwable -> 0x000e }
        r1 = r0.getSettings();	 Catch:{ Throwable -> 0x000e }
        r1 = r1.getUserAgentString();	 Catch:{ Throwable -> 0x000e }
        return r1;
    L_0x000e:
        r1 = zzpu();
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzagr.zzai(android.content.Context):java.lang.String");
    }

    public static Builder zzaj(Context context) {
        return new Builder(context);
    }

    public static zzmc zzak(Context context) {
        return new zzmc(context);
    }

    private static java.lang.String zzal(android.content.Context r2) {
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
        r0 = 0;
        r1 = "activity";	 Catch:{ Exception -> 0x002d }
        r2 = r2.getSystemService(r1);	 Catch:{ Exception -> 0x002d }
        r2 = (android.app.ActivityManager) r2;	 Catch:{ Exception -> 0x002d }
        if (r2 != 0) goto L_0x000c;	 Catch:{ Exception -> 0x002d }
    L_0x000b:
        return r0;	 Catch:{ Exception -> 0x002d }
    L_0x000c:
        r1 = 1;	 Catch:{ Exception -> 0x002d }
        r2 = r2.getRunningTasks(r1);	 Catch:{ Exception -> 0x002d }
        if (r2 == 0) goto L_0x002d;	 Catch:{ Exception -> 0x002d }
    L_0x0013:
        r1 = r2.isEmpty();	 Catch:{ Exception -> 0x002d }
        if (r1 != 0) goto L_0x002d;	 Catch:{ Exception -> 0x002d }
    L_0x0019:
        r1 = 0;	 Catch:{ Exception -> 0x002d }
        r2 = r2.get(r1);	 Catch:{ Exception -> 0x002d }
        r2 = (android.app.ActivityManager.RunningTaskInfo) r2;	 Catch:{ Exception -> 0x002d }
        if (r2 == 0) goto L_0x002d;	 Catch:{ Exception -> 0x002d }
    L_0x0022:
        r1 = r2.topActivity;	 Catch:{ Exception -> 0x002d }
        if (r1 == 0) goto L_0x002d;	 Catch:{ Exception -> 0x002d }
    L_0x0026:
        r2 = r2.topActivity;	 Catch:{ Exception -> 0x002d }
        r2 = r2.getClassName();	 Catch:{ Exception -> 0x002d }
        return r2;
    L_0x002d:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzagr.zzal(android.content.Context):java.lang.String");
    }

    public static boolean zzam(android.content.Context r6) {
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
        r0 = 0;
        r1 = "activity";	 Catch:{ Throwable -> 0x0055 }
        r1 = r6.getSystemService(r1);	 Catch:{ Throwable -> 0x0055 }
        r1 = (android.app.ActivityManager) r1;	 Catch:{ Throwable -> 0x0055 }
        r2 = "keyguard";	 Catch:{ Throwable -> 0x0055 }
        r2 = r6.getSystemService(r2);	 Catch:{ Throwable -> 0x0055 }
        r2 = (android.app.KeyguardManager) r2;	 Catch:{ Throwable -> 0x0055 }
        if (r1 == 0) goto L_0x0055;	 Catch:{ Throwable -> 0x0055 }
    L_0x0013:
        if (r2 != 0) goto L_0x0016;	 Catch:{ Throwable -> 0x0055 }
    L_0x0015:
        return r0;	 Catch:{ Throwable -> 0x0055 }
    L_0x0016:
        r1 = r1.getRunningAppProcesses();	 Catch:{ Throwable -> 0x0055 }
        if (r1 != 0) goto L_0x001d;	 Catch:{ Throwable -> 0x0055 }
    L_0x001c:
        return r0;	 Catch:{ Throwable -> 0x0055 }
    L_0x001d:
        r1 = r1.iterator();	 Catch:{ Throwable -> 0x0055 }
    L_0x0021:
        r3 = r1.hasNext();	 Catch:{ Throwable -> 0x0055 }
        if (r3 == 0) goto L_0x0055;	 Catch:{ Throwable -> 0x0055 }
    L_0x0027:
        r3 = r1.next();	 Catch:{ Throwable -> 0x0055 }
        r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3;	 Catch:{ Throwable -> 0x0055 }
        r4 = android.os.Process.myPid();	 Catch:{ Throwable -> 0x0055 }
        r5 = r3.pid;	 Catch:{ Throwable -> 0x0055 }
        if (r4 != r5) goto L_0x0021;	 Catch:{ Throwable -> 0x0055 }
    L_0x0035:
        r1 = r3.importance;	 Catch:{ Throwable -> 0x0055 }
        r3 = 100;	 Catch:{ Throwable -> 0x0055 }
        if (r1 != r3) goto L_0x0055;	 Catch:{ Throwable -> 0x0055 }
    L_0x003b:
        r1 = r2.inKeyguardRestrictedInputMode();	 Catch:{ Throwable -> 0x0055 }
        if (r1 != 0) goto L_0x0055;	 Catch:{ Throwable -> 0x0055 }
    L_0x0041:
        r1 = "power";	 Catch:{ Throwable -> 0x0055 }
        r6 = r6.getSystemService(r1);	 Catch:{ Throwable -> 0x0055 }
        r6 = (android.os.PowerManager) r6;	 Catch:{ Throwable -> 0x0055 }
        if (r6 != 0) goto L_0x004d;	 Catch:{ Throwable -> 0x0055 }
    L_0x004b:
        r6 = 0;	 Catch:{ Throwable -> 0x0055 }
        goto L_0x0051;	 Catch:{ Throwable -> 0x0055 }
    L_0x004d:
        r6 = r6.isScreenOn();	 Catch:{ Throwable -> 0x0055 }
    L_0x0051:
        if (r6 == 0) goto L_0x0055;
    L_0x0053:
        r6 = 1;
        return r6;
    L_0x0055:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzagr.zzam(android.content.Context):boolean");
    }

    public static Bitmap zzan(Context context) {
        if (!(context instanceof Activity)) {
            return null;
        }
        try {
            Bitmap zzp;
            if (((Boolean) zzbs.zzep().zzd(zzmq.zzbml)).booleanValue()) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    zzp = zzp(window.getDecorView().getRootView());
                }
                return null;
            }
            zzp = zzo(((Activity) context).getWindow().getDecorView());
            return zzp;
        } catch (Throwable e) {
            zzaiw.zzb("Fail to capture screen shot", e);
        }
    }

    public static AudioManager zzao(Context context) {
        return (AudioManager) context.getSystemService("audio");
    }

    public static float zzap(Context context) {
        AudioManager zzao = zzao(context);
        if (zzao == null) {
            return 0.0f;
        }
        int streamMaxVolume = zzao.getStreamMaxVolume(3);
        return streamMaxVolume == 0 ? 0.0f : ((float) zzao.getStreamVolume(3)) / ((float) streamMaxVolume);
    }

    public static int zzaq(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo == null ? 0 : applicationInfo.targetSdkVersion;
    }

    @Nullable
    private static KeyguardManager zzar(Context context) {
        Object systemService = context.getSystemService("keyguard");
        return (systemService == null || !(systemService instanceof KeyguardManager)) ? null : (KeyguardManager) systemService;
    }

    @TargetApi(16)
    public static boolean zzas(Context context) {
        if (context == null || !zzq.zzalx()) {
            return false;
        }
        KeyguardManager zzar = zzar(context);
        if (zzar != null && zzar.isKeyguardLocked()) {
            return true;
        }
        return false;
    }

    public static boolean zzat(android.content.Context r3) {
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
        r0 = 0;
        r3 = r3.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x001b, Throwable -> 0x000b }
        r1 = "com.google.android.gms.ads.internal.ClientApi";	 Catch:{ ClassNotFoundException -> 0x001b, Throwable -> 0x000b }
        r3.loadClass(r1);	 Catch:{ ClassNotFoundException -> 0x001b, Throwable -> 0x000b }
        return r0;
    L_0x000b:
        r3 = move-exception;
        r1 = "Error loading class.";
        com.google.android.gms.internal.zzaiw.zzb(r1, r3);
        r1 = com.google.android.gms.ads.internal.zzbs.zzeg();
        r2 = "AdUtil.isLiteSdk";
        r1.zza(r3, r2);
        return r0;
    L_0x001b:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzagr.zzat(android.content.Context):boolean");
    }

    public static int zzau(Context context) {
        return DynamiteModule.zzac(context, ModuleDescriptor.MODULE_ID);
    }

    public static int zzav(Context context) {
        return DynamiteModule.zzab(context, ModuleDescriptor.MODULE_ID);
    }

    public static Uri zzb(String str, String str2, String str3) throws UnsupportedOperationException {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        indexOf++;
        StringBuilder stringBuilder = new StringBuilder(str.substring(0, indexOf));
        stringBuilder.append(str2);
        stringBuilder.append("=");
        stringBuilder.append(str3);
        stringBuilder.append("&");
        stringBuilder.append(str.substring(indexOf));
        return Uri.parse(stringBuilder.toString());
    }

    public static void zzb(Activity activity, OnScrollChangedListener onScrollChangedListener) {
        Window window = activity.getWindow();
        if (window != null && window.getDecorView() != null && window.getDecorView().getViewTreeObserver() != null) {
            window.getDecorView().getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
        }
    }

    @TargetApi(18)
    public static void zzb(Context context, Intent intent) {
        if (intent != null && zzq.zzalz()) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            extras.putBinder("android.support.customtabs.extra.SESSION", null);
            extras.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(extras);
        }
    }

    public static void zzb(zzis zzis, boolean z) {
        Bundle bundle = zzis.zzbcf != null ? zzis.zzbcf : new Bundle();
        if (bundle.getBundle(AdMobAdapter.class.getName()) != null) {
            bundle = bundle.getBundle(AdMobAdapter.class.getName());
        } else {
            Bundle bundle2 = new Bundle();
            bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            bundle = bundle2;
        }
        bundle.putBoolean("render_test_label", true);
    }

    public static void zzb(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            zzagl.zza(runnable);
        }
    }

    private static boolean zzb(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    private final JSONObject zzc(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            zza(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public static String zzcc(String str) {
        return Uri.parse(str).buildUpon().query(null).build().toString();
    }

    public static int zzcd(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            str = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 22);
            stringBuilder.append("Could not parse value:");
            stringBuilder.append(str);
            zzaiw.zzco(stringBuilder.toString());
            return 0;
        }
    }

    public static boolean zzce(String str) {
        return TextUtils.isEmpty(str) ? false : str.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
    }

    public static boolean zzd(Context context, String str, String str2) {
        return zzbgc.zzcy(context).checkPermission(str2, str) == 0;
    }

    public static float zzdh() {
        return zzbs.zzfc().zzdh();
    }

    public static boolean zzdi() {
        return zzbs.zzfc().zzdi();
    }

    public static void zze(Context context, String str, String str2) {
        List arrayList = new ArrayList();
        arrayList.add(str2);
        zza(context, str, arrayList);
    }

    public static Map<String, String> zzf(Uri uri) {
        if (uri == null) {
            return null;
        }
        Map hashMap = new HashMap();
        for (String str : zzbs.zzee().zzg(uri)) {
            hashMap.put(str, uri.getQueryParameter(str));
        }
        return hashMap;
    }

    public static void zzf(Context context, String str, String str2) {
        try {
            FileOutputStream openFileOutput = context.openFileOutput(str, 0);
            openFileOutput.write(str2.getBytes("UTF-8"));
            openFileOutput.close();
        } catch (Throwable e) {
            zzaiw.zzb("Error writing to file in internal storage.", e);
        }
    }

    public static int[] zzf(Activity activity) {
        Window window = activity.getWindow();
        if (window == null || window.findViewById(16908290) == null) {
            return zzpx();
        }
        return new int[]{window.findViewById(16908290).getWidth(), window.findViewById(16908290).getHeight()};
    }

    public static Bitmap zzm(View view) {
        view.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return createBitmap;
    }

    public static Bitmap zzn(View view) {
        if (view == null) {
            return null;
        }
        Bitmap zzp = zzp(view);
        if (zzp == null) {
            zzp = zzo(view);
        }
        return zzp;
    }

    private static Bitmap zzo(@NonNull View view) {
        try {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width != 0) {
                if (height != 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Config.RGB_565);
                    Canvas canvas = new Canvas(createBitmap);
                    view.layout(0, 0, width, height);
                    view.draw(canvas);
                    return createBitmap;
                }
            }
            zzaiw.zzco("Width or height of view is zero");
            return null;
        } catch (Throwable e) {
            zzaiw.zzb("Fail to capture the webview", e);
            return null;
        }
    }

    private static Bitmap zzp(@NonNull View view) {
        Bitmap bitmap = null;
        try {
            boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
            view.setDrawingCacheEnabled(true);
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null) {
                bitmap = Bitmap.createBitmap(drawingCache);
            }
            view.setDrawingCacheEnabled(isDrawingCacheEnabled);
            return bitmap;
        } catch (Throwable e) {
            zzaiw.zzb("Fail to capture the web view", e);
            return null;
        }
    }

    public static boolean zzp(zzis zzis) {
        Bundle bundle = zzis.zzbcf != null ? zzis.zzbcf : new Bundle();
        return (bundle.getBundle(AdMobAdapter.class.getName()) != null ? bundle.getBundle(AdMobAdapter.class.getName()) : new Bundle()).getBoolean("render_test_label", false);
    }

    private static String zzpu() {
        StringBuffer stringBuffer = new StringBuffer(256);
        stringBuffer.append("Mozilla/5.0 (Linux; U; Android");
        if (VERSION.RELEASE != null) {
            stringBuffer.append(" ");
            stringBuffer.append(VERSION.RELEASE);
        }
        stringBuffer.append("; ");
        stringBuffer.append(Locale.getDefault());
        if (Build.DEVICE != null) {
            stringBuffer.append("; ");
            stringBuffer.append(Build.DEVICE);
            if (Build.DISPLAY != null) {
                stringBuffer.append(" Build/");
                stringBuffer.append(Build.DISPLAY);
            }
        }
        stringBuffer.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return stringBuffer.toString();
    }

    public static String zzpv() {
        return UUID.randomUUID().toString();
    }

    public static String zzpw() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append(" ");
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    private static int[] zzpx() {
        return new int[]{0, 0};
    }

    public static Bundle zzpy() {
        Bundle bundle = new Bundle();
        try {
            if (((Boolean) zzbs.zzep().zzd(zzmq.zzbhf)).booleanValue()) {
                Parcelable memoryInfo = new MemoryInfo();
                Debug.getMemoryInfo(memoryInfo);
                bundle.putParcelable("debug_memory_info", memoryInfo);
            }
            if (((Boolean) zzbs.zzep().zzd(zzmq.zzbhg)).booleanValue()) {
                Runtime runtime = Runtime.getRuntime();
                bundle.putLong("runtime_free_memory", runtime.freeMemory());
                bundle.putLong("runtime_max_memory", runtime.maxMemory());
                bundle.putLong("runtime_total_memory", runtime.totalMemory());
            }
            bundle.putInt("web_view_count", zzbs.zzeg().zzpp());
            return bundle;
        } catch (Throwable e) {
            zzaiw.zzc("Unable to gather memory stats", e);
            return bundle;
        }
    }

    public static java.lang.String zzq(android.content.Context r1, java.lang.String r2) {
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
        r1 = r1.openFileInput(r2);	 Catch:{ IOException -> 0x0011 }
        r2 = new java.lang.String;	 Catch:{ IOException -> 0x0011 }
        r0 = 1;	 Catch:{ IOException -> 0x0011 }
        r1 = com.google.android.gms.common.util.zzn.zza(r1, r0);	 Catch:{ IOException -> 0x0011 }
        r0 = "UTF-8";	 Catch:{ IOException -> 0x0011 }
        r2.<init>(r1, r0);	 Catch:{ IOException -> 0x0011 }
        return r2;
    L_0x0011:
        r1 = "Error reading from internal storage.";
        com.google.android.gms.internal.zzaiw.zzbw(r1);
        r1 = "";
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzagr.zzq(android.content.Context, java.lang.String):java.lang.String");
    }

    public static boolean zzq(View view) {
        Activity activity;
        Window window;
        view = view.getRootView();
        LayoutParams layoutParams = null;
        if (view != null) {
            Context context = view.getContext();
            if (context instanceof Activity) {
                activity = (Activity) context;
                if (activity == null) {
                    return false;
                }
                window = activity.getWindow();
                if (window == null) {
                    layoutParams = window.getAttributes();
                }
                return layoutParams == null && (layoutParams.flags & 524288) != 0;
            }
        }
        activity = null;
        if (activity == null) {
            return false;
        }
        window = activity.getWindow();
        if (window == null) {
            layoutParams = window.getAttributes();
        }
        if (layoutParams == null) {
        }
    }

    public static int zzr(@Nullable View view) {
        if (view == null) {
            return -1;
        }
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof AdapterView)) {
            parent = parent.getParent();
        }
        return parent == null ? -1 : ((AdapterView) parent).getPositionForView(view);
    }

    public final JSONObject zza(Bundle bundle, JSONObject jSONObject) {
        try {
            return zzc(bundle);
        } catch (Throwable e) {
            zzaiw.zzb("Error converting Bundle to JSON", e);
            return null;
        }
    }

    public final void zza(Context context, @Nullable String str, String str2, Bundle bundle, boolean z) {
        if (z) {
            zzbs.zzec();
            bundle.putString("device", zzpw());
            bundle.putString("eids", TextUtils.join(",", zzmq.zziq()));
        }
        zzjk.zzhx();
        zzais.zza(context, str, str2, bundle, z, new zzagu(this, context, str));
    }

    public final void zza(Context context, String str, boolean z, HttpURLConnection httpURLConnection) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(z);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty("User-Agent", zzp(context, str));
        httpURLConnection.setUseCaches(false);
    }

    public final void zza(Context context, List<String> list) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (!TextUtils.isEmpty(zzfll.zzfh(activity))) {
                if (list == null) {
                    zzafj.m5v("Cannot ping urls: empty list.");
                } else if (zznn.zzi(context)) {
                    zznn zznn = new zznn();
                    zznn.zza(new zzags(this, list, zznn, context));
                    zznn.zzd(activity);
                } else {
                    zzafj.m5v("Cannot ping url because custom tabs is not supported");
                }
            }
        }
    }

    public final boolean zza(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return zza(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, zzar(context));
    }

    public final boolean zza(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        Object obj;
        Object obj2;
        if (!zzbs.zzec().zzczf) {
            if (keyguardManager == null ? false : keyguardManager.inKeyguardRestrictedInputMode()) {
                if (!((Boolean) zzbs.zzep().zzd(zzmq.zzbla)).booleanValue() || !zzq(view)) {
                    obj = null;
                    if (view.getVisibility() == 0 && view.isShown()) {
                        if (powerManager != null) {
                            if (powerManager.isScreenOn()) {
                                obj2 = null;
                                if (!(obj2 == null || r6 == null)) {
                                    if (((Boolean) zzbs.zzep().zzd(zzmq.zzbky)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                                        return true;
                                    }
                                }
                            }
                        }
                        obj2 = 1;
                        if (((Boolean) zzbs.zzep().zzd(zzmq.zzbky)).booleanValue()) {
                        }
                        return true;
                    }
                    return false;
                }
            }
        }
        obj = 1;
        if (powerManager != null) {
            if (powerManager.isScreenOn()) {
                obj2 = null;
                if (((Boolean) zzbs.zzep().zzd(zzmq.zzbky)).booleanValue()) {
                }
                return true;
            }
        }
        obj2 = 1;
        if (((Boolean) zzbs.zzep().zzd(zzmq.zzbky)).booleanValue()) {
        }
        return true;
    }

    public final boolean zzah(Context context) {
        if (this.zzczg) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.getApplicationContext().registerReceiver(new zzagv(), intentFilter);
        this.zzczg = true;
        return true;
    }

    public final void zzb(Context context, String str, String str2, Bundle bundle, boolean z) {
        if (((Boolean) zzbs.zzep().zzd(zzmq.zzbld)).booleanValue()) {
            zza(context, str, str2, bundle, z);
        }
    }

    public final boolean zzcf(java.lang.String r4) {
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
        r0 = android.text.TextUtils.isEmpty(r4);
        r1 = 0;
        if (r0 == 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        monitor-enter(r3);	 Catch:{ PatternSyntaxException -> 0x0046 }
        r0 = r3.zzczh;	 Catch:{ all -> 0x0043 }
        if (r0 == 0) goto L_0x0025;	 Catch:{ all -> 0x0043 }
    L_0x000d:
        r0 = com.google.android.gms.internal.zzmq.zzbje;	 Catch:{ all -> 0x0043 }
        r2 = com.google.android.gms.ads.internal.zzbs.zzep();	 Catch:{ all -> 0x0043 }
        r0 = r2.zzd(r0);	 Catch:{ all -> 0x0043 }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x0043 }
        r2 = r3.zzczh;	 Catch:{ all -> 0x0043 }
        r2 = r2.pattern();	 Catch:{ all -> 0x0043 }
        r0 = r0.equals(r2);	 Catch:{ all -> 0x0043 }
        if (r0 != 0) goto L_0x0037;	 Catch:{ all -> 0x0043 }
    L_0x0025:
        r0 = com.google.android.gms.internal.zzmq.zzbje;	 Catch:{ all -> 0x0043 }
        r2 = com.google.android.gms.ads.internal.zzbs.zzep();	 Catch:{ all -> 0x0043 }
        r0 = r2.zzd(r0);	 Catch:{ all -> 0x0043 }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x0043 }
        r0 = java.util.regex.Pattern.compile(r0);	 Catch:{ all -> 0x0043 }
        r3.zzczh = r0;	 Catch:{ all -> 0x0043 }
    L_0x0037:
        r0 = r3.zzczh;	 Catch:{ all -> 0x0043 }
        r4 = r0.matcher(r4);	 Catch:{ all -> 0x0043 }
        r4 = r4.matches();	 Catch:{ all -> 0x0043 }
        monitor-exit(r3);	 Catch:{ all -> 0x0043 }
        return r4;	 Catch:{ all -> 0x0043 }
    L_0x0043:
        r4 = move-exception;	 Catch:{ all -> 0x0043 }
        monitor-exit(r3);	 Catch:{ all -> 0x0043 }
        throw r4;	 Catch:{ PatternSyntaxException -> 0x0046 }
    L_0x0046:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzagr.zzcf(java.lang.String):boolean");
    }

    public final boolean zzcg(java.lang.String r4) {
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
        r0 = android.text.TextUtils.isEmpty(r4);
        r1 = 0;
        if (r0 == 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        monitor-enter(r3);	 Catch:{ PatternSyntaxException -> 0x0046 }
        r0 = r3.zzczi;	 Catch:{ all -> 0x0043 }
        if (r0 == 0) goto L_0x0025;	 Catch:{ all -> 0x0043 }
    L_0x000d:
        r0 = com.google.android.gms.internal.zzmq.zzbjf;	 Catch:{ all -> 0x0043 }
        r2 = com.google.android.gms.ads.internal.zzbs.zzep();	 Catch:{ all -> 0x0043 }
        r0 = r2.zzd(r0);	 Catch:{ all -> 0x0043 }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x0043 }
        r2 = r3.zzczi;	 Catch:{ all -> 0x0043 }
        r2 = r2.pattern();	 Catch:{ all -> 0x0043 }
        r0 = r0.equals(r2);	 Catch:{ all -> 0x0043 }
        if (r0 != 0) goto L_0x0037;	 Catch:{ all -> 0x0043 }
    L_0x0025:
        r0 = com.google.android.gms.internal.zzmq.zzbjf;	 Catch:{ all -> 0x0043 }
        r2 = com.google.android.gms.ads.internal.zzbs.zzep();	 Catch:{ all -> 0x0043 }
        r0 = r2.zzd(r0);	 Catch:{ all -> 0x0043 }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x0043 }
        r0 = java.util.regex.Pattern.compile(r0);	 Catch:{ all -> 0x0043 }
        r3.zzczi = r0;	 Catch:{ all -> 0x0043 }
    L_0x0037:
        r0 = r3.zzczi;	 Catch:{ all -> 0x0043 }
        r4 = r0.matcher(r4);	 Catch:{ all -> 0x0043 }
        r4 = r4.matches();	 Catch:{ all -> 0x0043 }
        monitor-exit(r3);	 Catch:{ all -> 0x0043 }
        return r4;	 Catch:{ all -> 0x0043 }
    L_0x0043:
        r4 = move-exception;	 Catch:{ all -> 0x0043 }
        monitor-exit(r3);	 Catch:{ all -> 0x0043 }
        throw r4;	 Catch:{ PatternSyntaxException -> 0x0046 }
    L_0x0046:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzagr.zzcg(java.lang.String):boolean");
    }

    public final int[] zzg(Activity activity) {
        int[] zzf = zzf(activity);
        r1 = new int[2];
        zzjk.zzhx();
        r1[0] = zzais.zzd(activity, zzf[0]);
        zzjk.zzhx();
        r1[1] = zzais.zzd(activity, zzf[1]);
        return r1;
    }

    public final int[] zzh(Activity activity) {
        Window window = activity.getWindow();
        int[] zzpx = (window == null || window.findViewById(16908290) == null) ? zzpx() : new int[]{window.findViewById(16908290).getTop(), window.findViewById(16908290).getBottom()};
        r0 = new int[2];
        zzjk.zzhx();
        r0[0] = zzais.zzd(activity, zzpx[0]);
        zzjk.zzhx();
        r0[1] = zzais.zzd(activity, zzpx[1]);
        return r0;
    }

    public final java.lang.String zzp(android.content.Context r5, java.lang.String r6) {
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
        r0 = r4.mLock;
        monitor-enter(r0);
        r1 = r4.zzcxh;	 Catch:{ all -> 0x00d2 }
        if (r1 == 0) goto L_0x000b;	 Catch:{ all -> 0x00d2 }
    L_0x0007:
        r5 = r4.zzcxh;	 Catch:{ all -> 0x00d2 }
        monitor-exit(r0);	 Catch:{ all -> 0x00d2 }
        return r5;	 Catch:{ all -> 0x00d2 }
    L_0x000b:
        if (r6 != 0) goto L_0x0013;	 Catch:{ all -> 0x00d2 }
    L_0x000d:
        r5 = zzpu();	 Catch:{ all -> 0x00d2 }
        monitor-exit(r0);	 Catch:{ all -> 0x00d2 }
        return r5;
    L_0x0013:
        r1 = com.google.android.gms.ads.internal.zzbs.zzee();	 Catch:{ Exception -> 0x001d }
        r1 = r1.getDefaultUserAgent(r5);	 Catch:{ Exception -> 0x001d }
        r4.zzcxh = r1;	 Catch:{ Exception -> 0x001d }
    L_0x001d:
        r1 = r4.zzcxh;	 Catch:{ all -> 0x00d2 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ all -> 0x00d2 }
        if (r1 == 0) goto L_0x006e;	 Catch:{ all -> 0x00d2 }
    L_0x0025:
        com.google.android.gms.internal.zzjk.zzhx();	 Catch:{ all -> 0x00d2 }
        r1 = com.google.android.gms.internal.zzais.zzqt();	 Catch:{ all -> 0x00d2 }
        if (r1 != 0) goto L_0x0068;	 Catch:{ all -> 0x00d2 }
    L_0x002e:
        r1 = 0;	 Catch:{ all -> 0x00d2 }
        r4.zzcxh = r1;	 Catch:{ all -> 0x00d2 }
        r1 = zzczc;	 Catch:{ all -> 0x00d2 }
        r2 = new com.google.android.gms.internal.zzagt;	 Catch:{ all -> 0x00d2 }
        r2.<init>(r4, r5);	 Catch:{ all -> 0x00d2 }
        r1.post(r2);	 Catch:{ all -> 0x00d2 }
    L_0x003b:
        r1 = r4.zzcxh;	 Catch:{ all -> 0x00d2 }
        if (r1 != 0) goto L_0x006e;
    L_0x003f:
        r1 = r4.mLock;	 Catch:{ InterruptedException -> 0x0045 }
        r1.wait();	 Catch:{ InterruptedException -> 0x0045 }
        goto L_0x003b;
    L_0x0045:
        r1 = zzpu();	 Catch:{ all -> 0x00d2 }
        r4.zzcxh = r1;	 Catch:{ all -> 0x00d2 }
        r1 = "Interrupted, use default user agent: ";	 Catch:{ all -> 0x00d2 }
        r2 = r4.zzcxh;	 Catch:{ all -> 0x00d2 }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x00d2 }
        r3 = r2.length();	 Catch:{ all -> 0x00d2 }
        if (r3 == 0) goto L_0x005e;	 Catch:{ all -> 0x00d2 }
    L_0x0059:
        r1 = r1.concat(r2);	 Catch:{ all -> 0x00d2 }
        goto L_0x0064;	 Catch:{ all -> 0x00d2 }
    L_0x005e:
        r2 = new java.lang.String;	 Catch:{ all -> 0x00d2 }
        r2.<init>(r1);	 Catch:{ all -> 0x00d2 }
        r1 = r2;	 Catch:{ all -> 0x00d2 }
    L_0x0064:
        com.google.android.gms.internal.zzaiw.zzco(r1);	 Catch:{ all -> 0x00d2 }
        goto L_0x003b;	 Catch:{ all -> 0x00d2 }
    L_0x0068:
        r1 = zzai(r5);	 Catch:{ all -> 0x00d2 }
        r4.zzcxh = r1;	 Catch:{ all -> 0x00d2 }
    L_0x006e:
        r1 = r4.zzcxh;	 Catch:{ all -> 0x00d2 }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x00d2 }
        r2 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x00d2 }
        r2 = r2.length();	 Catch:{ all -> 0x00d2 }
        r2 = r2 + 10;	 Catch:{ all -> 0x00d2 }
        r3 = java.lang.String.valueOf(r6);	 Catch:{ all -> 0x00d2 }
        r3 = r3.length();	 Catch:{ all -> 0x00d2 }
        r2 = r2 + r3;	 Catch:{ all -> 0x00d2 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00d2 }
        r3.<init>(r2);	 Catch:{ all -> 0x00d2 }
        r3.append(r1);	 Catch:{ all -> 0x00d2 }
        r1 = " (Mobile; ";	 Catch:{ all -> 0x00d2 }
        r3.append(r1);	 Catch:{ all -> 0x00d2 }
        r3.append(r6);	 Catch:{ all -> 0x00d2 }
        r6 = r3.toString();	 Catch:{ all -> 0x00d2 }
        r4.zzcxh = r6;	 Catch:{ all -> 0x00d2 }
        r5 = com.google.android.gms.internal.zzbgc.zzcy(r5);	 Catch:{ Exception -> 0x00b6 }
        r5 = r5.zzamj();	 Catch:{ Exception -> 0x00b6 }
        if (r5 == 0) goto L_0x00c0;	 Catch:{ Exception -> 0x00b6 }
    L_0x00a7:
        r5 = r4.zzcxh;	 Catch:{ Exception -> 0x00b6 }
        r5 = java.lang.String.valueOf(r5);	 Catch:{ Exception -> 0x00b6 }
        r6 = ";aia";	 Catch:{ Exception -> 0x00b6 }
        r5 = r5.concat(r6);	 Catch:{ Exception -> 0x00b6 }
        r4.zzcxh = r5;	 Catch:{ Exception -> 0x00b6 }
        goto L_0x00c0;
    L_0x00b6:
        r5 = move-exception;
        r6 = com.google.android.gms.ads.internal.zzbs.zzeg();	 Catch:{ all -> 0x00d2 }
        r1 = "AdUtil.getUserAgent";	 Catch:{ all -> 0x00d2 }
        r6.zza(r5, r1);	 Catch:{ all -> 0x00d2 }
    L_0x00c0:
        r5 = r4.zzcxh;	 Catch:{ all -> 0x00d2 }
        r5 = java.lang.String.valueOf(r5);	 Catch:{ all -> 0x00d2 }
        r6 = ")";	 Catch:{ all -> 0x00d2 }
        r5 = r5.concat(r6);	 Catch:{ all -> 0x00d2 }
        r4.zzcxh = r5;	 Catch:{ all -> 0x00d2 }
        r5 = r4.zzcxh;	 Catch:{ all -> 0x00d2 }
        monitor-exit(r0);	 Catch:{ all -> 0x00d2 }
        return r5;	 Catch:{ all -> 0x00d2 }
    L_0x00d2:
        r5 = move-exception;	 Catch:{ all -> 0x00d2 }
        monitor-exit(r0);	 Catch:{ all -> 0x00d2 }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzagr.zzp(android.content.Context, java.lang.String):java.lang.String");
    }

    public final JSONObject zzp(Map<String, ?> map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                zza(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            String str2 = "Could not convert map to JSON: ";
            String valueOf = String.valueOf(e.getMessage());
            throw new JSONException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }
}
