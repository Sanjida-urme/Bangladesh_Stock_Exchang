package com.google.android.gms.ads.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;
import com.google.android.gms.internal.zzaeu;
import com.google.android.gms.internal.zzaiw;
import com.google.android.gms.internal.zzama;
import com.google.android.gms.internal.zzamb;
import com.google.android.gms.internal.zzamf;
import com.google.android.gms.internal.zzns;
import com.google.android.gms.internal.zznu;
import com.google.android.gms.internal.zzoy;
import com.google.android.gms.internal.zzoz;
import com.google.android.gms.internal.zztt;
import com.google.android.gms.internal.zzuo;
import com.google.android.gms.internal.zzur;
import com.google.android.gms.internal.zzzb;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

@zzzb
public final class zzaq {
    static zzt<zzama> zza(@Nullable zzuo zzuo, @Nullable zzur zzur, zzab zzab) {
        return new zzav(zzuo, zzab, zzur);
    }

    private static String zza(@Nullable Bitmap bitmap) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap == null) {
            zzaiw.zzco("Bitmap is null. Returning empty string");
            return "";
        }
        bitmap.compress(CompressFormat.PNG, 100, byteArrayOutputStream);
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        String valueOf = String.valueOf("data:image/png;base64,");
        encodeToString = String.valueOf(encodeToString);
        return encodeToString.length() != 0 ? valueOf.concat(encodeToString) : new String(valueOf);
    }

    static java.lang.String zza(@android.support.annotation.Nullable com.google.android.gms.internal.zzoy r1) {
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
        if (r1 != 0) goto L_0x000a;
    L_0x0002:
        r1 = "Image is null. Returning empty string";
        com.google.android.gms.internal.zzaiw.zzco(r1);
        r1 = "";
        return r1;
    L_0x000a:
        r0 = r1.getUri();	 Catch:{ RemoteException -> 0x0015 }
        if (r0 == 0) goto L_0x001a;	 Catch:{ RemoteException -> 0x0015 }
    L_0x0010:
        r0 = r0.toString();	 Catch:{ RemoteException -> 0x0015 }
        return r0;
    L_0x0015:
        r0 = "Unable to get image uri. Trying data uri next";
        com.google.android.gms.internal.zzaiw.zzco(r0);
    L_0x001a:
        r1 = zzb(r1);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzaq.zza(com.google.android.gms.internal.zzoy):java.lang.String");
    }

    private static JSONObject zza(@Nullable Bundle bundle, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (bundle == null || TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject(str);
        Iterator keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String str2 = (String) keys.next();
            if (bundle.containsKey(str2)) {
                Object obj;
                if ("image".equals(jSONObject2.getString(str2))) {
                    obj = bundle.get(str2);
                    if (obj instanceof Bitmap) {
                        obj = zza((Bitmap) obj);
                    } else {
                        str2 = "Invalid type. An image type extra should return a bitmap";
                        zzaiw.zzco(str2);
                    }
                } else if (bundle.get(str2) instanceof Bitmap) {
                    str2 = "Invalid asset type. Bitmap should be returned only for image type";
                    zzaiw.zzco(str2);
                } else {
                    obj = String.valueOf(bundle.get(str2));
                }
                jSONObject.put(str2, obj);
            }
        }
        return jSONObject;
    }

    public static boolean zza(zzama zzama, zztt zztt, CountDownLatch countDownLatch) {
        zzama zzama2 = zzama;
        zztt zztt2 = zztt;
        CountDownLatch countDownLatch2 = countDownLatch;
        View view = null;
        boolean z = false;
        if (zzama2 == null) {
            try {
                throw null;
            } catch (Throwable e) {
                zzaiw.zzc("Unable to invoke load assets", e);
            } catch (RuntimeException e2) {
                RuntimeException runtimeException = e2;
                countDownLatch.countDown();
                throw runtimeException;
            }
        }
        String str;
        View view2 = (View) zzama2;
        if (view2 == null) {
            str = "AdWebView is null";
        } else {
            view2.setVisibility(4);
            List list = zztt2.zzcdd.zzcbq;
            if (list != null) {
                if (!list.isEmpty()) {
                    String str2;
                    zzamb zzsq;
                    zzamf zzar;
                    zzama.zzsq().zza("/nativeExpressAssetsLoaded", new zzat(countDownLatch2));
                    zzama.zzsq().zza("/nativeExpressAssetsLoadingFailed", new zzau(countDownLatch2));
                    zzuo zzly = zztt2.zzcde.zzly();
                    zzur zzlz = zztt2.zzcde.zzlz();
                    String callToAction;
                    if (list.contains("2") && zzly != null) {
                        String headline = zzly.getHeadline();
                        List images = zzly.getImages();
                        String body = zzly.getBody();
                        zzoy zzjm = zzly.zzjm();
                        callToAction = zzly.getCallToAction();
                        double starRating = zzly.getStarRating();
                        String store = zzly.getStore();
                        String price = zzly.getPrice();
                        Bundle extras = zzly.getExtras();
                        if (zzly.zzmf() != null) {
                            view = (View) zzn.zzx(zzly.zzmf());
                        }
                        zzns zzns = new zzns(headline, images, body, zzjm, callToAction, starRating, store, price, null, extras, null, view, zzly.zzjr(), null);
                        str2 = zztt2.zzcdd.zzcbp;
                        zzsq = zzama.zzsq();
                        zzar = new zzar(zzns, str2, zzama2);
                    } else if (!list.contains("1") || zzlz == null) {
                        str = "No matching template id and mapper";
                    } else {
                        String headline2 = zzlz.getHeadline();
                        List images2 = zzlz.getImages();
                        String body2 = zzlz.getBody();
                        zzoy zzjt = zzlz.zzjt();
                        String callToAction2 = zzlz.getCallToAction();
                        callToAction = zzlz.getAdvertiser();
                        Bundle extras2 = zzlz.getExtras();
                        if (zzlz.zzmf() != null) {
                            view = (View) zzn.zzx(zzlz.zzmf());
                        }
                        zznu zznu = new zznu(headline2, images2, body2, zzjt, callToAction2, callToAction, null, extras2, null, view, zzlz.zzjr(), null);
                        str2 = zztt2.zzcdd.zzcbp;
                        zzsq = zzama.zzsq();
                        zzar = new zzas(zznu, str2, zzama2);
                    }
                    zzsq.zza(zzar);
                    str2 = zztt2.zzcdd.zzcbn;
                    String str3 = zztt2.zzcdd.zzcbo;
                    if (str3 != null) {
                        zzama2.loadDataWithBaseURL(str3, str2, "text/html", "UTF-8", null);
                    } else {
                        zzama2.loadData(str2, "text/html", "UTF-8");
                    }
                    z = true;
                    if (!z) {
                        countDownLatch.countDown();
                    }
                    return z;
                }
            }
            str = "No template ids present in mediation response";
        }
        zzaiw.zzco(str);
        if (z) {
            countDownLatch.countDown();
        }
        return z;
    }

    private static java.lang.String zzb(com.google.android.gms.internal.zzoy r1) {
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
        r1 = r1.zzjl();	 Catch:{ RemoteException -> 0x002b }
        if (r1 != 0) goto L_0x000e;	 Catch:{ RemoteException -> 0x002b }
    L_0x0006:
        r1 = "Drawable is null. Returning empty string";	 Catch:{ RemoteException -> 0x002b }
        com.google.android.gms.internal.zzaiw.zzco(r1);	 Catch:{ RemoteException -> 0x002b }
        r1 = "";	 Catch:{ RemoteException -> 0x002b }
        return r1;	 Catch:{ RemoteException -> 0x002b }
    L_0x000e:
        r1 = com.google.android.gms.dynamic.zzn.zzx(r1);	 Catch:{ RemoteException -> 0x002b }
        r1 = (android.graphics.drawable.Drawable) r1;	 Catch:{ RemoteException -> 0x002b }
        r0 = r1 instanceof android.graphics.drawable.BitmapDrawable;
        if (r0 != 0) goto L_0x0020;
    L_0x0018:
        r1 = "Drawable is not an instance of BitmapDrawable. Returning empty string";
        com.google.android.gms.internal.zzaiw.zzco(r1);
        r1 = "";
        return r1;
    L_0x0020:
        r1 = (android.graphics.drawable.BitmapDrawable) r1;
        r1 = r1.getBitmap();
        r1 = zza(r1);
        return r1;
    L_0x002b:
        r1 = "Unable to get drawable. Returning empty string";
        com.google.android.gms.internal.zzaiw.zzco(r1);
        r1 = "";
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzaq.zzb(com.google.android.gms.internal.zzoy):java.lang.String");
    }

    private static void zzc(zzama zzama) {
        OnClickListener onClickListener = zzama.getOnClickListener();
        if (onClickListener == null) {
            return;
        }
        if (zzama == null) {
            throw null;
        }
        onClickListener.onClick((View) zzama);
    }

    @Nullable
    private static zzoy zzd(Object obj) {
        return obj instanceof IBinder ? zzoz.zzk((IBinder) obj) : null;
    }

    @Nullable
    public static View zze(@Nullable zzaeu zzaeu) {
        if (zzaeu == null) {
            zzaiw.m3e("AdState is null");
            return null;
        } else if (!zzf(zzaeu) || zzaeu.zzchj == null) {
            try {
                IObjectWrapper view = zzaeu.zzcde != null ? zzaeu.zzcde.getView() : null;
                if (view != null) {
                    return (View) zzn.zzx(view);
                }
                zzaiw.zzco("View in mediation adapter is null.");
                return null;
            } catch (Throwable e) {
                zzaiw.zzc("Could not get View from mediation adapter.", e);
                return null;
            }
        } else {
            zzama zzama = zzaeu.zzchj;
            if (zzama != null) {
                return (View) zzama;
            }
            throw null;
        }
    }

    public static boolean zzf(@Nullable zzaeu zzaeu) {
        return (zzaeu == null || !zzaeu.zzcng || zzaeu.zzcdd == null || zzaeu.zzcdd.zzcbn == null) ? false : true;
    }
}
