package com.google.android.gms.internal;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbs;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@zzzb
public final class zzabr {
    private int mOrientation = -1;
    private zzaaf zzanw;
    private String zzbrz;
    private boolean zzccu = false;
    private final zzzz zzcdj;
    private List<String> zzciu;
    private String zzcqi;
    private String zzcqj;
    private List<String> zzcqk;
    private String zzcql;
    private String zzcqm;
    private String zzcqn;
    private List<String> zzcqo;
    private long zzcqp = -1;
    private boolean zzcqq = false;
    private final long zzcqr = -1;
    private long zzcqs = -1;
    private boolean zzcqt = false;
    private boolean zzcqu = false;
    private boolean zzcqv = false;
    private boolean zzcqw = true;
    private boolean zzcqx = true;
    private String zzcqy = "";
    private boolean zzcqz = false;
    private zzadw zzcra;
    private List<String> zzcrb;
    private List<String> zzcrc;
    private boolean zzcrd = false;
    private boolean zzcre = false;
    private String zzcrf;
    private List<String> zzcrg;
    private boolean zzcrh;
    private String zzcri;
    private zzaee zzcrj;
    private boolean zzcrk;
    private boolean zzcrl;

    public zzabr(zzzz zzzz, String str) {
        this.zzcqj = str;
        this.zzcdj = zzzz;
    }

    private static String zza(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        return (list == null || list.isEmpty()) ? null : (String) list.get(0);
    }

    private static long zzb(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r2, java.lang.String r3) {
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
        r2 = r2.get(r3);
        r2 = (java.util.List) r2;
        if (r2 == 0) goto L_0x004e;
    L_0x0008:
        r0 = r2.isEmpty();
        if (r0 != 0) goto L_0x004e;
    L_0x000e:
        r0 = 0;
        r2 = r2.get(r0);
        r2 = (java.lang.String) r2;
        r0 = java.lang.Float.parseFloat(r2);	 Catch:{ NumberFormatException -> 0x001f }
        r2 = 1148846080; // 0x447a0000 float:1000.0 double:5.676053805E-315;
        r0 = r0 * r2;
        r2 = (long) r0;
        return r2;
    L_0x001f:
        r0 = java.lang.String.valueOf(r3);
        r0 = r0.length();
        r0 = r0 + 36;
        r1 = java.lang.String.valueOf(r2);
        r1 = r1.length();
        r0 = r0 + r1;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r0);
        r0 = "Could not parse float from ";
        r1.append(r0);
        r1.append(r3);
        r3 = " header: ";
        r1.append(r3);
        r1.append(r2);
        r2 = r1.toString();
        com.google.android.gms.internal.zzaiw.zzco(r2);
    L_0x004e:
        r2 = -1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzabr.zzb(java.util.Map, java.lang.String):long");
    }

    private static List<String> zzc(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (!(list == null || list.isEmpty())) {
            String str2 = (String) list.get(0);
            if (str2 != null) {
                return Arrays.asList(str2.trim().split("\\s+"));
            }
        }
        return null;
    }

    private static boolean zzd(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        return (list == null || list.isEmpty()) ? false : Boolean.valueOf((String) list.get(0)).booleanValue();
    }

    public final zzaad zza(long j, boolean z) {
        zzzz zzzz = this.zzcdj;
        String str = this.zzcqj;
        String str2 = this.zzbrz;
        List list = this.zzcqk;
        List list2 = this.zzcqo;
        long j2 = this.zzcqp;
        boolean z2 = this.zzcqq;
        List list3 = this.zzciu;
        long j3 = this.zzcqs;
        int i = this.mOrientation;
        String str3 = this.zzcqi;
        return new zzaad(zzzz, str, str2, list, list2, j2, z2, -1, list3, j3, i, str3, j, this.zzcqm, this.zzcqn, this.zzcqt, this.zzcqu, this.zzcqv, this.zzcqw, false, this.zzcqy, this.zzcqz, this.zzccu, this.zzcra, this.zzcrb, this.zzcrc, this.zzcrd, this.zzanw, this.zzcre, this.zzcrf, this.zzcrg, this.zzcrh, this.zzcri, this.zzcrj, this.zzcql, this.zzcqx, this.zzcrk, this.zzcrl, z ? 2 : 1);
    }

    public final void zza(String str, Map<String, List<String>> map, String str2) {
        this.zzbrz = str2;
        zzn(map);
    }

    public final void zzn(Map<String, List<String>> map) {
        String str;
        this.zzcqi = zza((Map) map, "X-Afma-Ad-Size");
        this.zzcri = zza((Map) map, "X-Afma-Ad-Slot-Size");
        List zzc = zzc(map, "X-Afma-Click-Tracking-Urls");
        if (zzc != null) {
            this.zzcqk = zzc;
        }
        this.zzcql = zza((Map) map, "X-Afma-Debug-Signals");
        zzc = (List) map.get("X-Afma-Debug-Dialog");
        if (!(zzc == null || zzc.isEmpty())) {
            this.zzcqm = (String) zzc.get(0);
        }
        zzc = zzc(map, "X-Afma-Tracking-Urls");
        if (zzc != null) {
            this.zzcqo = zzc;
        }
        long zzb = zzb(map, "X-Afma-Interstitial-Timeout");
        if (zzb != -1) {
            this.zzcqp = zzb;
        }
        this.zzcqq |= zzd(map, "X-Afma-Mediation");
        zzc = zzc(map, "X-Afma-Manual-Tracking-Urls");
        if (zzc != null) {
            this.zzciu = zzc;
        }
        zzb = zzb(map, "X-Afma-Refresh-Rate");
        if (zzb != -1) {
            this.zzcqs = zzb;
        }
        zzc = (List) map.get("X-Afma-Orientation");
        if (!(zzc == null || zzc.isEmpty())) {
            int zzqa;
            str = (String) zzc.get(0);
            if ("portrait".equalsIgnoreCase(str)) {
                zzqa = zzbs.zzee().zzqa();
            } else if ("landscape".equalsIgnoreCase(str)) {
                zzqa = zzbs.zzee().zzpz();
            }
            this.mOrientation = zzqa;
        }
        this.zzcqn = zza((Map) map, "X-Afma-ActiveView");
        zzc = (List) map.get("X-Afma-Use-HTTPS");
        if (!(zzc == null || zzc.isEmpty())) {
            this.zzcqv = Boolean.valueOf((String) zzc.get(0)).booleanValue();
        }
        this.zzcqt |= zzd(map, "X-Afma-Custom-Rendering-Allowed");
        this.zzcqu = "native".equals(zza((Map) map, "X-Afma-Ad-Format"));
        zzc = (List) map.get("X-Afma-Content-Url-Opted-Out");
        if (!(zzc == null || zzc.isEmpty())) {
            this.zzcqw = Boolean.valueOf((String) zzc.get(0)).booleanValue();
        }
        zzc = (List) map.get("X-Afma-Content-Vertical-Opted-Out");
        if (!(zzc == null || zzc.isEmpty())) {
            this.zzcqx = Boolean.valueOf((String) zzc.get(0)).booleanValue();
        }
        zzc = (List) map.get("X-Afma-Gws-Query-Id");
        if (!(zzc == null || zzc.isEmpty())) {
            this.zzcqy = (String) zzc.get(0);
        }
        str = zza((Map) map, "X-Afma-Fluid");
        if (str != null && str.equals("height")) {
            this.zzcqz = true;
        }
        this.zzccu = "native_express".equals(zza((Map) map, "X-Afma-Ad-Format"));
        this.zzcra = zzadw.zzbt(zza((Map) map, "X-Afma-Rewards"));
        if (this.zzcrb == null) {
            this.zzcrb = zzc(map, "X-Afma-Reward-Video-Start-Urls");
        }
        if (this.zzcrc == null) {
            this.zzcrc = zzc(map, "X-Afma-Reward-Video-Complete-Urls");
        }
        this.zzcrd |= zzd(map, "X-Afma-Use-Displayed-Impression");
        this.zzcre |= zzd(map, "X-Afma-Auto-Collect-Location");
        this.zzcrf = zza((Map) map, "Set-Cookie");
        Object zza = zza((Map) map, "X-Afma-Auto-Protection-Configuration");
        if (zza != null) {
            if (!TextUtils.isEmpty(zza)) {
                try {
                    this.zzanw = zzaaf.zzl(new JSONObject(zza));
                } catch (Throwable e) {
                    zzaiw.zzc("Error parsing configuration JSON", e);
                    this.zzanw = new zzaaf();
                }
                zzc = zzc(map, "X-Afma-Remote-Ping-Urls");
                if (zzc != null) {
                    this.zzcrg = zzc;
                }
                zza = zza((Map) map, "X-Afma-Safe-Browsing");
                if (!TextUtils.isEmpty(zza)) {
                    try {
                        this.zzcrj = zzaee.zzo(new JSONObject(zza));
                    } catch (Throwable e2) {
                        zzaiw.zzc("Error parsing safe browsing header", e2);
                    }
                }
                this.zzcrh |= zzd(map, "X-Afma-Render-In-Browser");
                zza = zza((Map) map, "X-Afma-Pool");
                if (!TextUtils.isEmpty(zza)) {
                    try {
                        this.zzcrk = new JSONObject(zza).getBoolean("never_pool");
                    } catch (Throwable e22) {
                        zzaiw.zzc("Error parsing interstitial pool header", e22);
                    }
                }
                this.zzcrl = zzd(map, "X-Afma-Custom-Close-Blocked");
            }
        }
        Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204").buildUpon();
        buildUpon.appendQueryParameter("id", "gmob-apps-blocked-navigation");
        if (!TextUtils.isEmpty(this.zzcqm)) {
            buildUpon.appendQueryParameter("debugDialog", this.zzcqm);
        }
        boolean booleanValue = ((Boolean) zzbs.zzep().zzd(zzmq.zzbgg)).booleanValue();
        String[] strArr = new String[1];
        str = buildUpon.toString();
        String str2 = "navigationURL";
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 18) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append("&");
        stringBuilder.append(str2);
        stringBuilder.append("={NAVIGATION_URL}");
        strArr[0] = stringBuilder.toString();
        this.zzanw = new zzaaf(booleanValue, Arrays.asList(strArr));
        zzc = zzc(map, "X-Afma-Remote-Ping-Urls");
        if (zzc != null) {
            this.zzcrg = zzc;
        }
        zza = zza((Map) map, "X-Afma-Safe-Browsing");
        if (TextUtils.isEmpty(zza)) {
            this.zzcrj = zzaee.zzo(new JSONObject(zza));
        }
        this.zzcrh |= zzd(map, "X-Afma-Render-In-Browser");
        zza = zza((Map) map, "X-Afma-Pool");
        if (TextUtils.isEmpty(zza)) {
            this.zzcrk = new JSONObject(zza).getBoolean("never_pool");
        }
        this.zzcrl = zzd(map, "X-Afma-Custom-Close-Blocked");
    }
}
