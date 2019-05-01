package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.zzbs;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Pattern;

@zzzb
public final class zzsl {
    private final Map<zzsm, zzsn> zzbxw = new HashMap();
    private final LinkedList<zzsm> zzbxx = new LinkedList();
    @Nullable
    private zzri zzbxy;

    private static void zza(String str, zzsm zzsm) {
        if (zzaiw.zzae(2)) {
            zzafj.m5v(String.format(str, new Object[]{zzsm}));
        }
    }

    private static java.lang.String[] zzaw(java.lang.String r5) {
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
        r1 = "\u0000";	 Catch:{ UnsupportedEncodingException -> 0x001e }
        r5 = r5.split(r1);	 Catch:{ UnsupportedEncodingException -> 0x001e }
        r1 = 0;	 Catch:{ UnsupportedEncodingException -> 0x001e }
    L_0x0008:
        r2 = r5.length;	 Catch:{ UnsupportedEncodingException -> 0x001e }
        if (r1 >= r2) goto L_0x001d;	 Catch:{ UnsupportedEncodingException -> 0x001e }
    L_0x000b:
        r2 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x001e }
        r3 = r5[r1];	 Catch:{ UnsupportedEncodingException -> 0x001e }
        r3 = android.util.Base64.decode(r3, r0);	 Catch:{ UnsupportedEncodingException -> 0x001e }
        r4 = "UTF-8";	 Catch:{ UnsupportedEncodingException -> 0x001e }
        r2.<init>(r3, r4);	 Catch:{ UnsupportedEncodingException -> 0x001e }
        r5[r1] = r2;	 Catch:{ UnsupportedEncodingException -> 0x001e }
        r1 = r1 + 1;
        goto L_0x0008;
    L_0x001d:
        return r5;
    L_0x001e:
        r5 = new java.lang.String[r0];
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzsl.zzaw(java.lang.String):java.lang.String[]");
    }

    private static boolean zzax(String str) {
        try {
            return Pattern.matches((String) zzbs.zzep().zzd(zzmq.zzbkn), str);
        } catch (Throwable e) {
            zzbs.zzeg().zza(e, "InterstitialAdPool.isExcludedAdUnit");
            return false;
        }
    }

    private static java.lang.String zzay(java.lang.String r2) {
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
        r0 = "([^/]+/[0-9]+).*";	 Catch:{ RuntimeException -> 0x0016 }
        r0 = java.util.regex.Pattern.compile(r0);	 Catch:{ RuntimeException -> 0x0016 }
        r0 = r0.matcher(r2);	 Catch:{ RuntimeException -> 0x0016 }
        r1 = r0.matches();	 Catch:{ RuntimeException -> 0x0016 }
        if (r1 == 0) goto L_0x0016;	 Catch:{ RuntimeException -> 0x0016 }
    L_0x0010:
        r1 = 1;	 Catch:{ RuntimeException -> 0x0016 }
        r0 = r0.group(r1);	 Catch:{ RuntimeException -> 0x0016 }
        return r0;
    L_0x0016:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzsl.zzay(java.lang.String):java.lang.String");
    }

    private static void zzc(Bundle bundle, String str) {
        while (true) {
            String[] split = str.split("/", 2);
            if (split.length != 0) {
                String str2 = split[0];
                if (split.length == 1) {
                    bundle.remove(str2);
                    return;
                }
                bundle = bundle.getBundle(str2);
                if (bundle != null) {
                    str = split[1];
                } else {
                    return;
                }
            }
            return;
        }
    }

    static Set<String> zzi(zzis zzis) {
        Set<String> hashSet = new HashSet();
        hashSet.addAll(zzis.extras.keySet());
        Bundle bundle = zzis.zzbcf.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            hashSet.addAll(bundle.keySet());
        }
        return hashSet;
    }

    static zzis zzj(zzis zzis) {
        zzis = zzl(zzis);
        String str = "_skipMediation";
        Bundle bundle = zzis.zzbcf.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            bundle.putBoolean(str, true);
        }
        zzis.extras.putBoolean(str, true);
        return zzis;
    }

    private static zzis zzk(zzis zzis) {
        zzis = zzl(zzis);
        for (String str : ((String) zzbs.zzep().zzd(zzmq.zzbkj)).split(",")) {
            zzc(zzis.zzbcf, str);
            String str2 = "com.google.ads.mediation.admob.AdMobAdapter/";
            if (str.startsWith(str2)) {
                zzc(zzis.extras, str.replaceFirst(str2, ""));
            }
        }
        return zzis;
    }

    private final java.lang.String zzkq() {
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
        r0 = new java.lang.StringBuilder;	 Catch:{ UnsupportedEncodingException -> 0x003a }
        r0.<init>();	 Catch:{ UnsupportedEncodingException -> 0x003a }
        r1 = r4.zzbxx;	 Catch:{ UnsupportedEncodingException -> 0x003a }
        r1 = r1.iterator();	 Catch:{ UnsupportedEncodingException -> 0x003a }
    L_0x000b:
        r2 = r1.hasNext();	 Catch:{ UnsupportedEncodingException -> 0x003a }
        if (r2 == 0) goto L_0x0035;	 Catch:{ UnsupportedEncodingException -> 0x003a }
    L_0x0011:
        r2 = r1.next();	 Catch:{ UnsupportedEncodingException -> 0x003a }
        r2 = (com.google.android.gms.internal.zzsm) r2;	 Catch:{ UnsupportedEncodingException -> 0x003a }
        r2 = r2.toString();	 Catch:{ UnsupportedEncodingException -> 0x003a }
        r3 = "UTF-8";	 Catch:{ UnsupportedEncodingException -> 0x003a }
        r2 = r2.getBytes(r3);	 Catch:{ UnsupportedEncodingException -> 0x003a }
        r3 = 0;	 Catch:{ UnsupportedEncodingException -> 0x003a }
        r2 = android.util.Base64.encodeToString(r2, r3);	 Catch:{ UnsupportedEncodingException -> 0x003a }
        r0.append(r2);	 Catch:{ UnsupportedEncodingException -> 0x003a }
        r2 = r1.hasNext();	 Catch:{ UnsupportedEncodingException -> 0x003a }
        if (r2 == 0) goto L_0x000b;	 Catch:{ UnsupportedEncodingException -> 0x003a }
    L_0x002f:
        r2 = "\u0000";	 Catch:{ UnsupportedEncodingException -> 0x003a }
        r0.append(r2);	 Catch:{ UnsupportedEncodingException -> 0x003a }
        goto L_0x000b;	 Catch:{ UnsupportedEncodingException -> 0x003a }
    L_0x0035:
        r0 = r0.toString();	 Catch:{ UnsupportedEncodingException -> 0x003a }
        return r0;
    L_0x003a:
        r0 = "";
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzsl.zzkq():java.lang.String");
    }

    private static zzis zzl(zzis zzis) {
        Parcel obtain = Parcel.obtain();
        zzis.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        zzis = (zzis) zzis.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        if (((Boolean) zzbs.zzep().zzd(zzmq.zzbjy)).booleanValue()) {
            zzis.zzh(zzis);
        }
        return zzis;
    }

    @Nullable
    final zzso zza(zzis zzis, String str) {
        if (zzax(str)) {
            return null;
        }
        int i = new zzabv(this.zzbxy.getApplicationContext()).zzns().zzcsg;
        zzis = zzk(zzis);
        str = zzay(str);
        zzsm zzsm = new zzsm(zzis, str, i);
        zzsn zzsn = (zzsn) this.zzbxw.get(zzsm);
        if (zzsn == null) {
            zza("Interstitial pool created at %s.", zzsm);
            zzsn = new zzsn(zzis, str, i);
            this.zzbxw.put(zzsm, zzsn);
        }
        this.zzbxx.remove(zzsm);
        this.zzbxx.add(zzsm);
        zzsn.zzku();
        while (true) {
            if (this.zzbxx.size() <= ((Integer) zzbs.zzep().zzd(zzmq.zzbkk)).intValue()) {
                break;
            }
            zzsm zzsm2 = (zzsm) this.zzbxx.remove();
            zzsn zzsn2 = (zzsn) this.zzbxw.get(zzsm2);
            zza("Evicting interstitial queue for %s.", zzsm2);
            while (zzsn2.size() > 0) {
                zzso zzm = zzsn2.zzm(null);
                if (zzm.zzbyh) {
                    zzsp.zzkw().zzky();
                }
                zzm.zzbyd.zzde();
            }
            this.zzbxw.remove(zzsm2);
        }
        while (zzsn.size() > 0) {
            zzso zzm2 = zzsn.zzm(zzis);
            if (zzm2.zzbyh) {
                if (zzbs.zzei().currentTimeMillis() - zzm2.zzbyg > ((long) ((Integer) zzbs.zzep().zzd(zzmq.zzbkm)).intValue()) * 1000) {
                    zza("Expired interstitial at %s.", zzsm);
                    zzsp.zzkw().zzkx();
                }
            }
            String str2 = zzm2.zzbye != null ? " (inline) " : " ";
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 34);
            stringBuilder.append("Pooled interstitial");
            stringBuilder.append(str2);
            stringBuilder.append("returned at %s.");
            zza(stringBuilder.toString(), zzsm);
            return zzm2;
        }
        return null;
    }

    final void zza(zzri zzri) {
        if (this.zzbxy == null) {
            this.zzbxy = zzri.zzko();
            if (this.zzbxy != null) {
                int i = 0;
                SharedPreferences sharedPreferences = this.zzbxy.getApplicationContext().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0);
                while (this.zzbxx.size() > 0) {
                    zzsm zzsm = (zzsm) this.zzbxx.remove();
                    zzsn zzsn = (zzsn) this.zzbxw.get(zzsm);
                    zza("Flushing interstitial queue for %s.", zzsm);
                    while (zzsn.size() > 0) {
                        zzsn.zzm(null).zzbyd.zzde();
                    }
                    this.zzbxw.remove(zzsm);
                }
                try {
                    Map hashMap = new HashMap();
                    for (Entry entry : sharedPreferences.getAll().entrySet()) {
                        if (!((String) entry.getKey()).equals("PoolKeys")) {
                            zzsr zzaz = zzsr.zzaz((String) entry.getValue());
                            zzsm zzsm2 = new zzsm(zzaz.zzara, zzaz.zzaou, zzaz.zzbyb);
                            if (!this.zzbxw.containsKey(zzsm2)) {
                                this.zzbxw.put(zzsm2, new zzsn(zzaz.zzara, zzaz.zzaou, zzaz.zzbyb));
                                hashMap.put(zzsm2.toString(), zzsm2);
                                zza("Restored interstitial queue for %s.", zzsm2);
                            }
                        }
                    }
                    String[] zzaw = zzaw(sharedPreferences.getString("PoolKeys", ""));
                    int length = zzaw.length;
                    while (i < length) {
                        zzsm zzsm3 = (zzsm) hashMap.get(zzaw[i]);
                        if (this.zzbxw.containsKey(zzsm3)) {
                            this.zzbxx.add(zzsm3);
                        }
                        i++;
                    }
                } catch (Throwable e) {
                    zzbs.zzeg().zza(e, "InterstitialAdPool.restore");
                    zzaiw.zzc("Malformed preferences value for InterstitialAdPool.", e);
                    this.zzbxw.clear();
                    this.zzbxx.clear();
                }
            }
        }
    }

    final void zzb(zzis zzis, String str) {
        if (this.zzbxy != null) {
            int i = new zzabv(this.zzbxy.getApplicationContext()).zzns().zzcsg;
            zzis zzk = zzk(zzis);
            str = zzay(str);
            zzsm zzsm = new zzsm(zzk, str, i);
            zzsn zzsn = (zzsn) this.zzbxw.get(zzsm);
            if (zzsn == null) {
                zza("Interstitial pool created at %s.", zzsm);
                zzsn = new zzsn(zzk, str, i);
                this.zzbxw.put(zzsm, zzsn);
            }
            zzsn.zza(this.zzbxy, zzis);
            zzsn.zzku();
            zza("Inline entry added to the queue at %s.", zzsm);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final void zzkp() {
        /*
        r9 = this;
        r0 = r9.zzbxy;
        if (r0 != 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r0 = r9.zzbxw;
        r0 = r0.entrySet();
        r0 = r0.iterator();
    L_0x000f:
        r1 = r0.hasNext();
        r2 = 0;
        if (r1 == 0) goto L_0x0089;
    L_0x0016:
        r1 = r0.next();
        r1 = (java.util.Map.Entry) r1;
        r3 = r1.getKey();
        r3 = (com.google.android.gms.internal.zzsm) r3;
        r1 = r1.getValue();
        r1 = (com.google.android.gms.internal.zzsn) r1;
        r4 = 2;
        r5 = com.google.android.gms.internal.zzaiw.zzae(r4);
        if (r5 == 0) goto L_0x0056;
    L_0x002f:
        r5 = r1.size();
        r6 = r1.zzks();
        if (r6 >= r5) goto L_0x0056;
    L_0x0039:
        r7 = "Loading %s/%s pooled interstitials for %s.";
        r8 = 3;
        r8 = new java.lang.Object[r8];
        r6 = r5 - r6;
        r6 = java.lang.Integer.valueOf(r6);
        r8[r2] = r6;
        r5 = java.lang.Integer.valueOf(r5);
        r6 = 1;
        r8[r6] = r5;
        r8[r4] = r3;
        r4 = java.lang.String.format(r7, r8);
        com.google.android.gms.internal.zzafj.m5v(r4);
    L_0x0056:
        r4 = r1.zzkt();
        r4 = r4 + r2;
    L_0x005b:
        r2 = r1.size();
        r5 = com.google.android.gms.internal.zzmq.zzbkl;
        r6 = com.google.android.gms.ads.internal.zzbs.zzep();
        r5 = r6.zzd(r5);
        r5 = (java.lang.Integer) r5;
        r5 = r5.intValue();
        if (r2 >= r5) goto L_0x0081;
    L_0x0071:
        r2 = "Pooling and loading one new interstitial for %s.";
        zza(r2, r3);
        r2 = r9.zzbxy;
        r2 = r1.zzb(r2);
        if (r2 == 0) goto L_0x005b;
    L_0x007e:
        r4 = r4 + 1;
        goto L_0x005b;
    L_0x0081:
        r1 = com.google.android.gms.internal.zzsp.zzkw();
        r1.zzu(r4);
        goto L_0x000f;
    L_0x0089:
        r0 = r9.zzbxy;
        if (r0 == 0) goto L_0x00ea;
    L_0x008d:
        r0 = r9.zzbxy;
        r0 = r0.getApplicationContext();
        r1 = "com.google.android.gms.ads.internal.interstitial.InterstitialAdPool";
        r0 = r0.getSharedPreferences(r1, r2);
        r0 = r0.edit();
        r0.clear();
        r1 = r9.zzbxw;
        r1 = r1.entrySet();
        r1 = r1.iterator();
    L_0x00aa:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x00de;
    L_0x00b0:
        r2 = r1.next();
        r2 = (java.util.Map.Entry) r2;
        r3 = r2.getKey();
        r3 = (com.google.android.gms.internal.zzsm) r3;
        r2 = r2.getValue();
        r2 = (com.google.android.gms.internal.zzsn) r2;
        r4 = r2.zzkv();
        if (r4 == 0) goto L_0x00aa;
    L_0x00c8:
        r4 = new com.google.android.gms.internal.zzsr;
        r4.<init>(r2);
        r2 = r4.zzlf();
        r4 = r3.toString();
        r0.putString(r4, r2);
        r2 = "Saved interstitial queue for %s.";
        zza(r2, r3);
        goto L_0x00aa;
    L_0x00de:
        r1 = "PoolKeys";
        r2 = r9.zzkq();
        r0.putString(r1, r2);
        r0.apply();
    L_0x00ea:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzsl.zzkp():void");
    }
}
