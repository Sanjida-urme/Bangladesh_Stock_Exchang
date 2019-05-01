package com.google.android.gms.ads.internal.gmsg;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.js.zza;
import com.google.android.gms.internal.zzaik;
import com.google.android.gms.internal.zzaiw;
import com.google.android.gms.internal.zzali;
import com.google.android.gms.internal.zzalo;
import com.google.android.gms.internal.zzalp;
import com.google.android.gms.internal.zzama;
import com.google.android.gms.internal.zzamv;
import com.google.android.gms.internal.zzanm;
import com.google.android.gms.internal.zzzb;
import java.util.HashMap;
import java.util.Map;

@zzzb
public final class zzd {
    private static zzt<Object> zzbvb = new zzj();
    public static final zzt<zzama> zzbvc = zze.zzbvu;
    public static final zzt<zzama> zzbvd = zzf.zzbvu;
    public static final zzt<zzama> zzbve = zzg.zzbvu;
    public static final zzt<zzama> zzbvf = new zzl();
    public static final zzt<zzama> zzbvg = new zzm();
    public static final zzt<zzama> zzbvh = zzh.zzbvu;
    public static final zzt<Object> zzbvi = new zzn();
    public static final zzt<zzama> zzbvj = new zzo();
    public static final zzt<zzama> zzbvk = zzi.zzbvu;
    public static final zzt<zzama> zzbvl = new zzp();
    public static final zzt<zzama> zzbvm = new zzq();
    public static final zzt<zzali> zzbvn = new zzalo();
    public static final zzt<zzali> zzbvo = new zzalp();
    public static final zzt<zzama> zzbvp = new zzc();
    public static final zzad zzbvq = new zzad();
    public static final zzt<zzama> zzbvr = new zzr();
    public static final zzt<zzama> zzbvs = new zzs();
    public static final zzt<zzama> zzbvt = new zzk();

    static final /* synthetic */ void zza(com.google.android.gms.ads.internal.js.zza r5, java.util.Map r6) {
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
        r0 = "u";
        r6 = r6.get(r0);
        r6 = (java.lang.String) r6;
        if (r6 != 0) goto L_0x0010;
    L_0x000a:
        r5 = "URL missing from click GMSG.";
        com.google.android.gms.internal.zzaiw.zzco(r5);
        return;
    L_0x0010:
        r0 = android.net.Uri.parse(r6);
        r1 = r5;	 Catch:{ zzct -> 0x0039 }
        r1 = (com.google.android.gms.internal.zzanl) r1;	 Catch:{ zzct -> 0x0039 }
        r1 = r1.zzss();	 Catch:{ zzct -> 0x0039 }
        if (r1 == 0) goto L_0x0052;	 Catch:{ zzct -> 0x0039 }
    L_0x001d:
        r2 = r1.zzb(r0);	 Catch:{ zzct -> 0x0039 }
        if (r2 == 0) goto L_0x0052;	 Catch:{ zzct -> 0x0039 }
    L_0x0023:
        r2 = r5;	 Catch:{ zzct -> 0x0039 }
        r2 = (com.google.android.gms.internal.zzamv) r2;	 Catch:{ zzct -> 0x0039 }
        r2 = r2.getContext();	 Catch:{ zzct -> 0x0039 }
        r3 = r5;	 Catch:{ zzct -> 0x0039 }
        r3 = (com.google.android.gms.internal.zzann) r3;	 Catch:{ zzct -> 0x0039 }
        if (r3 != 0) goto L_0x0031;	 Catch:{ zzct -> 0x0039 }
    L_0x002f:
        r1 = 0;	 Catch:{ zzct -> 0x0039 }
        throw r1;	 Catch:{ zzct -> 0x0039 }
    L_0x0031:
        r3 = (android.view.View) r3;	 Catch:{ zzct -> 0x0039 }
        r1 = r1.zza(r0, r2, r3);	 Catch:{ zzct -> 0x0039 }
        r0 = r1;
        goto L_0x0052;
    L_0x0039:
        r1 = "Unable to append parameter to URL: ";
        r6 = java.lang.String.valueOf(r6);
        r2 = r6.length();
        if (r2 == 0) goto L_0x004a;
    L_0x0045:
        r6 = r1.concat(r6);
        goto L_0x004f;
    L_0x004a:
        r6 = new java.lang.String;
        r6.<init>(r1);
    L_0x004f:
        com.google.android.gms.internal.zzaiw.zzco(r6);
    L_0x0052:
        r6 = com.google.android.gms.ads.internal.zzbs.zzfa();
        r1 = r5;
        r1 = (com.google.android.gms.internal.zzamv) r1;
        r2 = r1.getContext();
        r3 = com.google.android.gms.internal.zzmq.zzbjg;
        r4 = com.google.android.gms.ads.internal.zzbs.zzep();
        r3 = r4.zzd(r3);
        r3 = (java.lang.Boolean) r3;
        r3 = r3.booleanValue();
        if (r3 == 0) goto L_0x0077;
    L_0x006f:
        r6 = r6.zzr(r2);
        if (r6 == 0) goto L_0x0077;
    L_0x0075:
        r6 = 1;
        goto L_0x0078;
    L_0x0077:
        r6 = 0;
    L_0x0078:
        if (r6 == 0) goto L_0x00aa;
    L_0x007a:
        r6 = "fbs_aeid";
        r6 = r0.getQueryParameter(r6);
        r6 = android.text.TextUtils.isEmpty(r6);
        if (r6 == 0) goto L_0x00aa;
    L_0x0086:
        r6 = com.google.android.gms.ads.internal.zzbs.zzfa();
        r2 = r1.getContext();
        r6 = r6.zzz(r2);
        com.google.android.gms.ads.internal.zzbs.zzec();
        r2 = "fbs_aeid";
        r0 = r0.toString();
        r0 = com.google.android.gms.internal.zzagr.zzb(r0, r2, r6);
        r2 = com.google.android.gms.ads.internal.zzbs.zzfa();
        r3 = r1.getContext();
        r2.zze(r3, r6);
    L_0x00aa:
        r6 = r0.toString();
        r0 = new com.google.android.gms.internal.zzaik;
        r1 = r1.getContext();
        r5 = (com.google.android.gms.internal.zzanm) r5;
        r5 = r5.zzsb();
        r5 = r5.zzcp;
        r0.<init>(r1, r5, r6);
        r0.zzps();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.gmsg.zzd.zza(com.google.android.gms.ads.internal.js.zza, java.util.Map):void");
    }

    static final /* synthetic */ void zza(zzamv zzamv, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            zzaiw.zzco("URL missing from httpTrack GMSG.");
        } else {
            new zzaik(zzamv.getContext(), ((zzanm) zzamv).zzsb().zzcp, str).zzps();
        }
    }

    static final /* synthetic */ void zza(com.google.android.gms.internal.zzanl r3, java.util.Map r4) {
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
        r0 = "tx";
        r0 = r4.get(r0);
        r0 = (java.lang.String) r0;
        r1 = "ty";
        r1 = r4.get(r1);
        r1 = (java.lang.String) r1;
        r2 = "td";
        r4 = r4.get(r2);
        r4 = (java.lang.String) r4;
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x0032 }
        r1 = java.lang.Integer.parseInt(r1);	 Catch:{ NumberFormatException -> 0x0032 }
        r4 = java.lang.Integer.parseInt(r4);	 Catch:{ NumberFormatException -> 0x0032 }
        r3 = r3.zzss();	 Catch:{ NumberFormatException -> 0x0032 }
        if (r3 == 0) goto L_0x0031;	 Catch:{ NumberFormatException -> 0x0032 }
    L_0x002a:
        r3 = r3.zzad();	 Catch:{ NumberFormatException -> 0x0032 }
        r3.zza(r0, r1, r4);	 Catch:{ NumberFormatException -> 0x0032 }
    L_0x0031:
        return;
    L_0x0032:
        r3 = "Could not parse touch parameters from gmsg.";
        com.google.android.gms.internal.zzaiw.zzco(r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.gmsg.zzd.zza(com.google.android.gms.internal.zzanl, java.util.Map):void");
    }

    static final /* synthetic */ void zzb(com.google.android.gms.internal.zzamv r17, java.util.Map r18) {
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
        r2 = r17.getContext();
        r2 = r2.getPackageManager();
        r3 = "data";
        r4 = r18;
        r3 = r4.get(r3);
        r3 = (java.lang.String) r3;
        r4 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x010a }
        r4.<init>(r3);	 Catch:{ JSONException -> 0x010a }
        r3 = "intents";	 Catch:{ JSONException -> 0x00fb }
        r3 = r4.getJSONArray(r3);	 Catch:{ JSONException -> 0x00fb }
        r4 = new org.json.JSONObject;
        r4.<init>();
        r5 = 0;
        r6 = 0;
    L_0x0024:
        r7 = r3.length();
        if (r6 >= r7) goto L_0x00f1;
    L_0x002a:
        r7 = r3.getJSONObject(r6);	 Catch:{ JSONException -> 0x00e7 }
        r8 = "id";
        r8 = r7.optString(r8);
        r9 = "u";
        r9 = r7.optString(r9);
        r10 = "i";
        r10 = r7.optString(r10);
        r11 = "m";
        r11 = r7.optString(r11);
        r12 = "p";
        r12 = r7.optString(r12);
        r13 = "c";
        r13 = r7.optString(r13);
        r14 = "f";
        r7.optString(r14);
        r14 = "e";
        r7.optString(r14);
        r14 = "intent_url";
        r7 = r7.optString(r14);
        r14 = 0;
        r15 = android.text.TextUtils.isEmpty(r7);
        if (r15 != 0) goto L_0x0089;
    L_0x0069:
        r15 = android.content.Intent.parseUri(r7, r5);	 Catch:{ URISyntaxException -> 0x006f }
        r14 = r15;
        goto L_0x0089;
    L_0x006f:
        r0 = move-exception;
        r15 = "Error parsing the url: ";
        r7 = java.lang.String.valueOf(r7);
        r16 = r7.length();
        if (r16 == 0) goto L_0x0081;
    L_0x007c:
        r7 = r15.concat(r7);
        goto L_0x0086;
    L_0x0081:
        r7 = new java.lang.String;
        r7.<init>(r15);
    L_0x0086:
        com.google.android.gms.internal.zzaiw.zzb(r7, r0);
    L_0x0089:
        r7 = 1;
        if (r14 != 0) goto L_0x00d5;
    L_0x008c:
        r14 = new android.content.Intent;
        r14.<init>();
        r15 = android.text.TextUtils.isEmpty(r9);
        if (r15 != 0) goto L_0x009e;
    L_0x0097:
        r9 = android.net.Uri.parse(r9);
        r14.setData(r9);
    L_0x009e:
        r9 = android.text.TextUtils.isEmpty(r10);
        if (r9 != 0) goto L_0x00a7;
    L_0x00a4:
        r14.setAction(r10);
    L_0x00a7:
        r9 = android.text.TextUtils.isEmpty(r11);
        if (r9 != 0) goto L_0x00b0;
    L_0x00ad:
        r14.setType(r11);
    L_0x00b0:
        r9 = android.text.TextUtils.isEmpty(r12);
        if (r9 != 0) goto L_0x00b9;
    L_0x00b6:
        r14.setPackage(r12);
    L_0x00b9:
        r9 = android.text.TextUtils.isEmpty(r13);
        if (r9 != 0) goto L_0x00d5;
    L_0x00bf:
        r9 = "/";
        r10 = 2;
        r9 = r13.split(r9, r10);
        r11 = r9.length;
        if (r11 != r10) goto L_0x00d5;
    L_0x00c9:
        r10 = new android.content.ComponentName;
        r11 = r9[r5];
        r9 = r9[r7];
        r10.<init>(r11, r9);
        r14.setComponent(r10);
    L_0x00d5:
        r9 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r9 = r2.resolveActivity(r14, r9);
        if (r9 == 0) goto L_0x00de;
    L_0x00dd:
        goto L_0x00df;
    L_0x00de:
        r7 = 0;
    L_0x00df:
        r4.put(r8, r7);	 Catch:{ JSONException -> 0x00e3 }
        goto L_0x00ed;
    L_0x00e3:
        r0 = move-exception;
        r7 = "Error constructing openable urls response.";
        goto L_0x00ea;
    L_0x00e7:
        r0 = move-exception;
        r7 = "Error parsing the intent data.";
    L_0x00ea:
        com.google.android.gms.internal.zzaiw.zzb(r7, r0);
    L_0x00ed:
        r6 = r6 + 1;
        goto L_0x0024;
    L_0x00f1:
        r1 = r17;
        r1 = (com.google.android.gms.ads.internal.js.zza) r1;
        r2 = "openableIntents";
        r1.zza(r2, r4);
        return;
    L_0x00fb:
        r1 = r17;
        r1 = (com.google.android.gms.ads.internal.js.zza) r1;
        r2 = "openableIntents";
        r3 = new org.json.JSONObject;
        r3.<init>();
        r1.zza(r2, r3);
        return;
    L_0x010a:
        r1 = r17;
        r1 = (com.google.android.gms.ads.internal.js.zza) r1;
        r2 = "openableIntents";
        r3 = new org.json.JSONObject;
        r3.<init>();
        r1.zza(r2, r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.gmsg.zzd.zzb(com.google.android.gms.internal.zzamv, java.util.Map):void");
    }

    static final /* synthetic */ void zzc(zzamv zzamv, Map map) {
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            zzaiw.zzco("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(",");
        Map hashMap = new HashMap();
        PackageManager packageManager = zzamv.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            boolean z = true;
            if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                z = false;
            }
            hashMap.put(str2, Boolean.valueOf(z));
        }
        ((zza) zzamv).zza("openableURLs", hashMap);
    }
}
