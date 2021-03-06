package com.google.android.gms.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.Secure;
import android.support.annotation.Nullable;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.search.SearchAdView;
import com.google.android.gms.common.zze;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.LinkedList;

@zzzb
public final class zzais {
    public static final Handler zzdbs = new Handler(Looper.getMainLooper());
    private static final String zzdbt = AdView.class.getName();
    private static final String zzdbu = InterstitialAd.class.getName();
    private static final String zzdbv = PublisherAdView.class.getName();
    private static final String zzdbw = PublisherInterstitialAd.class.getName();
    private static final String zzdbx = SearchAdView.class.getName();
    private static final String zzdby = AdLoader.class.getName();

    public static int zza(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, displayMetrics);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.Nullable
    public static java.lang.String zza(java.lang.StackTraceElement[] r5, java.lang.String r6) {
        /*
        r0 = 0;
    L_0x0001:
        r1 = r0 + 1;
        r2 = r5.length;
        r3 = 0;
        if (r1 >= r2) goto L_0x0052;
    L_0x0007:
        r0 = r5[r0];
        r2 = r0.getClassName();
        r0 = r0.getMethodName();
        r4 = "loadAd";
        r0 = r4.equalsIgnoreCase(r0);
        if (r0 == 0) goto L_0x0050;
    L_0x0019:
        r0 = zzdbt;
        r0 = r0.equalsIgnoreCase(r2);
        if (r0 != 0) goto L_0x0049;
    L_0x0021:
        r0 = zzdbu;
        r0 = r0.equalsIgnoreCase(r2);
        if (r0 != 0) goto L_0x0049;
    L_0x0029:
        r0 = zzdbv;
        r0 = r0.equalsIgnoreCase(r2);
        if (r0 != 0) goto L_0x0049;
    L_0x0031:
        r0 = zzdbw;
        r0 = r0.equalsIgnoreCase(r2);
        if (r0 != 0) goto L_0x0049;
    L_0x0039:
        r0 = zzdbx;
        r0 = r0.equalsIgnoreCase(r2);
        if (r0 != 0) goto L_0x0049;
    L_0x0041:
        r0 = zzdby;
        r0 = r0.equalsIgnoreCase(r2);
        if (r0 == 0) goto L_0x0050;
    L_0x0049:
        r5 = r5[r1];
        r5 = r5.getClassName();
        goto L_0x0053;
    L_0x0050:
        r0 = r1;
        goto L_0x0001;
    L_0x0052:
        r5 = r3;
    L_0x0053:
        if (r6 == 0) goto L_0x0094;
    L_0x0055:
        r0 = ".";
        r1 = new java.util.StringTokenizer;
        r1.<init>(r6, r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = 2;
        r4 = r1.hasMoreElements();
        if (r4 == 0) goto L_0x008b;
    L_0x0068:
        r6 = r1.nextToken();
        r0.append(r6);
    L_0x006f:
        r6 = r2 + -1;
        if (r2 <= 0) goto L_0x0087;
    L_0x0073:
        r2 = r1.hasMoreElements();
        if (r2 == 0) goto L_0x0087;
    L_0x0079:
        r2 = ".";
        r0.append(r2);
        r2 = r1.nextToken();
        r0.append(r2);
        r2 = r6;
        goto L_0x006f;
    L_0x0087:
        r6 = r0.toString();
    L_0x008b:
        if (r5 == 0) goto L_0x0094;
    L_0x008d:
        r6 = r5.contains(r6);
        if (r6 != 0) goto L_0x0094;
    L_0x0093:
        return r5;
    L_0x0094:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzais.zza(java.lang.StackTraceElement[], java.lang.String):java.lang.String");
    }

    public static void zza(Context context, @Nullable String str, String str2, Bundle bundle, boolean z, zzaiv zzaiv) {
        if (z) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            bundle.putString("os", VERSION.RELEASE);
            bundle.putString("api", String.valueOf(VERSION.SDK_INT));
            bundle.putString("appid", applicationContext.getPackageName());
            if (str == null) {
                zze.zzafn();
                int zzcd = zze.zzcd(context);
                StringBuilder stringBuilder = new StringBuilder(23);
                stringBuilder.append(zzcd);
                stringBuilder.append(".11717000");
                str = stringBuilder.toString();
            }
            bundle.putString("js", str);
        }
        Builder appendQueryParameter = new Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", str2);
        for (String str22 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str22, bundle.getString(str22));
        }
        zzaiv.zzch(appendQueryParameter.toString());
    }

    private final void zza(ViewGroup viewGroup, zziw zziw, String str, int i, int i2) {
        if (viewGroup.getChildCount() == 0) {
            Context context = viewGroup.getContext();
            View textView = new TextView(context);
            textView.setGravity(17);
            textView.setText(str);
            textView.setTextColor(i);
            textView.setBackgroundColor(i2);
            View frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(i);
            i = zzc(context, 3);
            frameLayout.addView(textView, new LayoutParams(zziw.widthPixels - i, zziw.heightPixels - i, 17));
            viewGroup.addView(frameLayout, zziw.widthPixels, zziw.heightPixels);
        }
    }

    public static void zza(boolean z, HttpURLConnection httpURLConnection, @Nullable String str) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setReadTimeout(60000);
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setUseCaches(false);
    }

    public static int zzau(Context context) {
        return DynamiteModule.zzac(context, ModuleDescriptor.MODULE_ID);
    }

    public static int zzav(Context context) {
        return DynamiteModule.zzab(context, ModuleDescriptor.MODULE_ID);
    }

    public static int zzb(DisplayMetrics displayMetrics, int i) {
        return Math.round(((float) i) / displayMetrics.density);
    }

    public static String zzbb(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Secure.getString(contentResolver, "android_id");
        if (string == null || zzqs()) {
            string = "emulator";
        }
        return zzcl(string);
    }

    @Nullable
    public static String zzbc(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        return contentResolver == null ? null : Secure.getString(contentResolver, "android_id");
    }

    public static boolean zzbd(Context context) {
        return zze.zzafn().isGooglePlayServicesAvailable(context) == 0;
    }

    public static boolean zzbe(Context context) {
        int isGooglePlayServicesAvailable = zze.zzafn().isGooglePlayServicesAvailable(context);
        if (isGooglePlayServicesAvailable != 0) {
            if (isGooglePlayServicesAvailable != 2) {
                return false;
            }
        }
        return true;
    }

    public static boolean zzbf(Context context) {
        if (context.getResources().getConfiguration().orientation != 2) {
            return false;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return ((int) (((float) displayMetrics.heightPixels) / displayMetrics.density)) < 600;
    }

    @android.annotation.TargetApi(17)
    public static boolean zzbg(android.content.Context r6) {
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
        r0 = r6.getResources();
        r0 = r0.getDisplayMetrics();
        r1 = "window";
        r6 = r6.getSystemService(r1);
        r6 = (android.view.WindowManager) r6;
        r6 = r6.getDefaultDisplay();
        r1 = com.google.android.gms.common.util.zzq.zzaly();
        r2 = 0;
        if (r1 == 0) goto L_0x0023;
    L_0x001b:
        r6.getRealMetrics(r0);
        r1 = r0.heightPixels;
        r3 = r0.widthPixels;
        goto L_0x004f;
    L_0x0023:
        r1 = android.view.Display.class;	 Catch:{ Exception -> 0x005c }
        r3 = "getRawHeight";	 Catch:{ Exception -> 0x005c }
        r4 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x005c }
        r1 = r1.getMethod(r3, r4);	 Catch:{ Exception -> 0x005c }
        r3 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x005c }
        r1 = r1.invoke(r6, r3);	 Catch:{ Exception -> 0x005c }
        r1 = (java.lang.Integer) r1;	 Catch:{ Exception -> 0x005c }
        r1 = r1.intValue();	 Catch:{ Exception -> 0x005c }
        r3 = android.view.Display.class;	 Catch:{ Exception -> 0x005c }
        r4 = "getRawWidth";	 Catch:{ Exception -> 0x005c }
        r5 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x005c }
        r3 = r3.getMethod(r4, r5);	 Catch:{ Exception -> 0x005c }
        r4 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x005c }
        r3 = r3.invoke(r6, r4);	 Catch:{ Exception -> 0x005c }
        r3 = (java.lang.Integer) r3;	 Catch:{ Exception -> 0x005c }
        r3 = r3.intValue();	 Catch:{ Exception -> 0x005c }
    L_0x004f:
        r6.getMetrics(r0);
        r6 = r0.heightPixels;
        r0 = r0.widthPixels;
        if (r6 != r1) goto L_0x005c;
    L_0x0058:
        if (r0 != r3) goto L_0x005c;
    L_0x005a:
        r6 = 1;
        return r6;
    L_0x005c:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzais.zzbg(android.content.Context):boolean");
    }

    public static int zzbh(Context context) {
        int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
        return identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0;
    }

    public static int zzc(Context context, int i) {
        return zza(context.getResources().getDisplayMetrics(), i);
    }

    public static Throwable zzc(Throwable th) {
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.push(th);
            th = th.getCause();
        }
        th = null;
        while (!linkedList.isEmpty()) {
            Throwable th2 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th2.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th2.getClass().getName(), "<filtered>", "<filtered>", 1));
            Object obj = null;
            for (Object obj2 : stackTrace) {
                Object obj22;
                if (zzcm(obj22.getClassName())) {
                    arrayList.add(obj22);
                    obj = 1;
                } else {
                    String className = obj22.getClassName();
                    Object obj3 = (TextUtils.isEmpty(className) || !(className.startsWith("android.") || className.startsWith("java."))) ? null : 1;
                    if (obj3 == null) {
                        obj22 = new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1);
                    }
                    arrayList.add(obj22);
                }
            }
            if (obj != null) {
                th = th == null ? new Throwable(th2.getMessage()) : new Throwable(th2.getMessage(), th);
                th.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
        return th;
    }

    public static java.lang.String zzcl(java.lang.String r9) {
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
        r1 = 0;
    L_0x0002:
        r2 = 2;
        r3 = 0;
        if (r1 >= r2) goto L_0x002e;
    L_0x0006:
        r2 = "MD5";	 Catch:{ NoSuchAlgorithmException -> 0x002b, ArithmeticException -> 0x002a }
        r2 = java.security.MessageDigest.getInstance(r2);	 Catch:{ NoSuchAlgorithmException -> 0x002b, ArithmeticException -> 0x002a }
        r4 = r9.getBytes();	 Catch:{ NoSuchAlgorithmException -> 0x002b, ArithmeticException -> 0x002a }
        r2.update(r4);	 Catch:{ NoSuchAlgorithmException -> 0x002b, ArithmeticException -> 0x002a }
        r4 = java.util.Locale.US;	 Catch:{ NoSuchAlgorithmException -> 0x002b, ArithmeticException -> 0x002a }
        r5 = "%032X";	 Catch:{ NoSuchAlgorithmException -> 0x002b, ArithmeticException -> 0x002a }
        r6 = 1;	 Catch:{ NoSuchAlgorithmException -> 0x002b, ArithmeticException -> 0x002a }
        r7 = new java.lang.Object[r6];	 Catch:{ NoSuchAlgorithmException -> 0x002b, ArithmeticException -> 0x002a }
        r8 = new java.math.BigInteger;	 Catch:{ NoSuchAlgorithmException -> 0x002b, ArithmeticException -> 0x002a }
        r2 = r2.digest();	 Catch:{ NoSuchAlgorithmException -> 0x002b, ArithmeticException -> 0x002a }
        r8.<init>(r6, r2);	 Catch:{ NoSuchAlgorithmException -> 0x002b, ArithmeticException -> 0x002a }
        r7[r0] = r8;	 Catch:{ NoSuchAlgorithmException -> 0x002b, ArithmeticException -> 0x002a }
        r2 = java.lang.String.format(r4, r5, r7);	 Catch:{ NoSuchAlgorithmException -> 0x002b, ArithmeticException -> 0x002a }
        return r2;
    L_0x002a:
        return r3;
    L_0x002b:
        r1 = r1 + 1;
        goto L_0x0002;
    L_0x002e:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzais.zzcl(java.lang.String):java.lang.String");
    }

    public static boolean zzcm(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith("com.google.")) {
            return true;
        }
        try {
            return Class.forName(str).isAnnotationPresent(zzzb.class);
        } catch (Throwable e) {
            String str2 = "Fail to check class type for class ";
            str = String.valueOf(str);
            zzaiw.zza(str.length() != 0 ? str2.concat(str) : new String(str2), e);
            return false;
        }
    }

    public static int zzd(Context context, int i) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return zzb(displayMetrics, i);
    }

    public static boolean zzqs() {
        return Build.DEVICE.startsWith("generic");
    }

    public static boolean zzqt() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static java.lang.String zzqu() {
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
        r0 = java.util.UUID.randomUUID();
        r1 = r0.getLeastSignificantBits();
        r1 = java.math.BigInteger.valueOf(r1);
        r1 = r1.toByteArray();
        r2 = r0.getMostSignificantBits();
        r0 = java.math.BigInteger.valueOf(r2);
        r0 = r0.toByteArray();
        r2 = new java.math.BigInteger;
        r3 = 1;
        r2.<init>(r3, r1);
        r2 = r2.toString();
        r4 = 0;
        r5 = r2;
        r2 = 0;
    L_0x0029:
        r6 = 2;
        if (r2 >= r6) goto L_0x0050;
    L_0x002c:
        r6 = "MD5";	 Catch:{ NoSuchAlgorithmException -> 0x004d }
        r6 = java.security.MessageDigest.getInstance(r6);	 Catch:{ NoSuchAlgorithmException -> 0x004d }
        r6.update(r1);	 Catch:{ NoSuchAlgorithmException -> 0x004d }
        r6.update(r0);	 Catch:{ NoSuchAlgorithmException -> 0x004d }
        r7 = 8;	 Catch:{ NoSuchAlgorithmException -> 0x004d }
        r8 = new byte[r7];	 Catch:{ NoSuchAlgorithmException -> 0x004d }
        r6 = r6.digest();	 Catch:{ NoSuchAlgorithmException -> 0x004d }
        java.lang.System.arraycopy(r6, r4, r8, r4, r7);	 Catch:{ NoSuchAlgorithmException -> 0x004d }
        r6 = new java.math.BigInteger;	 Catch:{ NoSuchAlgorithmException -> 0x004d }
        r6.<init>(r3, r8);	 Catch:{ NoSuchAlgorithmException -> 0x004d }
        r6 = r6.toString();	 Catch:{ NoSuchAlgorithmException -> 0x004d }
        r5 = r6;
    L_0x004d:
        r2 = r2 + 1;
        goto L_0x0029;
    L_0x0050:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzais.zzqu():java.lang.String");
    }

    public final void zza(Context context, @Nullable String str, String str2, Bundle bundle, boolean z) {
        zza(context, null, str2, bundle, true, new zzait(this));
    }

    public final void zza(ViewGroup viewGroup, zziw zziw, String str) {
        zza(viewGroup, zziw, str, (int) ViewCompat.MEASURED_STATE_MASK, -1);
    }

    public final void zza(ViewGroup viewGroup, zziw zziw, String str, String str2) {
        zzaiw.zzco(str2);
        zza(viewGroup, zziw, str, (int) SupportMenu.CATEGORY_MASK, (int) ViewCompat.MEASURED_STATE_MASK);
    }
}
