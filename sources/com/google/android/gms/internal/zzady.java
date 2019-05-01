package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.view.View;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.common.util.zzq;
import com.google.android.gms.common.zze;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzzb
public final class zzady implements zzaeh {
    private final Context mContext;
    private final Object mLock = new Object();
    private final zzaee zzcrj;
    private final zzfhw zzcul;
    private final LinkedHashMap<String, zzfie> zzcum;
    private final zzaej zzcun;
    @VisibleForTesting
    boolean zzcuo;
    private HashSet<String> zzcup = new HashSet();
    private boolean zzcuq = false;
    private boolean zzcur = false;
    private boolean zzcus = false;

    public zzady(Context context, zzaiy zzaiy, zzaee zzaee, String str, zzaej zzaej) {
        zzbq.checkNotNull(zzaee, "SafeBrowsing config is not present.");
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.mContext = context;
        this.zzcum = new LinkedHashMap();
        this.zzcun = zzaej;
        this.zzcrj = zzaee;
        for (String toLowerCase : this.zzcrj.zzcva) {
            this.zzcup.add(toLowerCase.toLowerCase(Locale.ENGLISH));
        }
        this.zzcup.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzfhw zzfhw = new zzfhw();
        zzfhw.zzpig = Integer.valueOf(8);
        zzfhw.url = str;
        zzfhw.zzpii = str;
        zzfhw.zzpik = new zzfhx();
        zzfhw.zzpik.zzcuw = this.zzcrj.zzcuw;
        zzfif zzfif = new zzfif();
        zzfif.zzpjr = zzaiy.zzcp;
        zzfif.zzpjt = Boolean.valueOf(zzbgc.zzcy(this.mContext).zzamj());
        zze.zzafn();
        long zzcd = (long) zze.zzcd(this.mContext);
        if (zzcd > 0) {
            zzfif.zzpjs = Long.valueOf(zzcd);
        }
        zzfhw.zzpiu = zzfif;
        this.zzcul = zzfhw;
    }

    @Nullable
    private final zzfie zzbv(String str) {
        zzfie zzfie;
        synchronized (this.mLock) {
            zzfie = (zzfie) this.zzcum.get(str);
        }
        return zzfie;
    }

    @VisibleForTesting
    final void send() {
        Object obj = (!(this.zzcuo && this.zzcrj.zzcvc) && (!(this.zzcus && this.zzcrj.zzcvb) && (this.zzcuo || !this.zzcrj.zzcuz))) ? null : 1;
        if (obj != null) {
            synchronized (this.mLock) {
                this.zzcul.zzpil = new zzfie[this.zzcum.size()];
                this.zzcum.values().toArray(this.zzcul.zzpil);
                if (zzaeg.isEnabled()) {
                    String str = this.zzcul.url;
                    String str2 = this.zzcul.zzpim;
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 53) + String.valueOf(str2).length());
                    stringBuilder.append("Sending SB report\n  url: ");
                    stringBuilder.append(str);
                    stringBuilder.append("\n  clickUrl: ");
                    stringBuilder.append(str2);
                    stringBuilder.append("\n  resources: \n");
                    StringBuilder stringBuilder2 = new StringBuilder(stringBuilder.toString());
                    for (zzfie zzfie : this.zzcul.zzpil) {
                        stringBuilder2.append("    [");
                        stringBuilder2.append(zzfie.zzpjq.length);
                        stringBuilder2.append("] ");
                        stringBuilder2.append(zzfie.url);
                    }
                    zzaeg.zzbw(stringBuilder2.toString());
                }
                zzajp zza = new zzahy(this.mContext).zza(1, this.zzcrj.zzcux, null, zzfhs.zzc(this.zzcul));
                if (zzaeg.isEnabled()) {
                    zza.zza(new zzaeb(this), zzagl.zzcyx);
                }
            }
        }
    }

    public final void zza(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, int r9) {
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
        r6 = this;
        r0 = r6.mLock;
        monitor-enter(r0);
        r1 = 3;
        if (r9 != r1) goto L_0x000d;
    L_0x0006:
        r2 = 1;
        r6.zzcus = r2;	 Catch:{ all -> 0x000a }
        goto L_0x000d;	 Catch:{ all -> 0x000a }
    L_0x000a:
        r7 = move-exception;	 Catch:{ all -> 0x000a }
        goto L_0x00ca;	 Catch:{ all -> 0x000a }
    L_0x000d:
        r2 = r6.zzcum;	 Catch:{ all -> 0x000a }
        r2 = r2.containsKey(r7);	 Catch:{ all -> 0x000a }
        if (r2 == 0) goto L_0x0027;	 Catch:{ all -> 0x000a }
    L_0x0015:
        if (r9 != r1) goto L_0x0025;	 Catch:{ all -> 0x000a }
    L_0x0017:
        r8 = r6.zzcum;	 Catch:{ all -> 0x000a }
        r7 = r8.get(r7);	 Catch:{ all -> 0x000a }
        r7 = (com.google.android.gms.internal.zzfie) r7;	 Catch:{ all -> 0x000a }
        r8 = java.lang.Integer.valueOf(r9);	 Catch:{ all -> 0x000a }
        r7.zzpjp = r8;	 Catch:{ all -> 0x000a }
    L_0x0025:
        monitor-exit(r0);	 Catch:{ all -> 0x000a }
        return;	 Catch:{ all -> 0x000a }
    L_0x0027:
        r1 = new com.google.android.gms.internal.zzfie;	 Catch:{ all -> 0x000a }
        r1.<init>();	 Catch:{ all -> 0x000a }
        r9 = java.lang.Integer.valueOf(r9);	 Catch:{ all -> 0x000a }
        r1.zzpjp = r9;	 Catch:{ all -> 0x000a }
        r9 = r6.zzcum;	 Catch:{ all -> 0x000a }
        r9 = r9.size();	 Catch:{ all -> 0x000a }
        r9 = java.lang.Integer.valueOf(r9);	 Catch:{ all -> 0x000a }
        r1.zzjhl = r9;	 Catch:{ all -> 0x000a }
        r1.url = r7;	 Catch:{ all -> 0x000a }
        r9 = new com.google.android.gms.internal.zzfhz;	 Catch:{ all -> 0x000a }
        r9.<init>();	 Catch:{ all -> 0x000a }
        r1.zzpjk = r9;	 Catch:{ all -> 0x000a }
        r9 = r6.zzcup;	 Catch:{ all -> 0x000a }
        r9 = r9.size();	 Catch:{ all -> 0x000a }
        if (r9 <= 0) goto L_0x00c3;	 Catch:{ all -> 0x000a }
    L_0x004f:
        if (r8 == 0) goto L_0x00c3;	 Catch:{ all -> 0x000a }
    L_0x0051:
        r9 = new java.util.LinkedList;	 Catch:{ all -> 0x000a }
        r9.<init>();	 Catch:{ all -> 0x000a }
        r8 = r8.entrySet();	 Catch:{ all -> 0x000a }
        r8 = r8.iterator();	 Catch:{ all -> 0x000a }
    L_0x005e:
        r2 = r8.hasNext();	 Catch:{ all -> 0x000a }
        if (r2 == 0) goto L_0x00b6;	 Catch:{ all -> 0x000a }
    L_0x0064:
        r2 = r8.next();	 Catch:{ all -> 0x000a }
        r2 = (java.util.Map.Entry) r2;	 Catch:{ all -> 0x000a }
        r3 = r2.getKey();	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        if (r3 == 0) goto L_0x0077;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
    L_0x0070:
        r3 = r2.getKey();	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r3 = (java.lang.String) r3;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        goto L_0x0079;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
    L_0x0077:
        r3 = "";	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
    L_0x0079:
        r4 = r2.getValue();	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        if (r4 == 0) goto L_0x0086;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
    L_0x007f:
        r2 = r2.getValue();	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r2 = (java.lang.String) r2;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        goto L_0x0088;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
    L_0x0086:
        r2 = "";	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
    L_0x0088:
        r4 = java.util.Locale.ENGLISH;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r4 = r3.toLowerCase(r4);	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r5 = r6.zzcup;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r4 = r5.contains(r4);	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        if (r4 != 0) goto L_0x0097;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
    L_0x0096:
        goto L_0x005e;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
    L_0x0097:
        r4 = new com.google.android.gms.internal.zzfhy;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r4.<init>();	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r5 = "UTF-8";	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r3 = r3.getBytes(r5);	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r4.zzpiw = r3;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r3 = "UTF-8";	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r2 = r2.getBytes(r3);	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r4.zzodc = r2;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r9.add(r4);	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        goto L_0x005e;
    L_0x00b0:
        r2 = "Cannot convert string to bytes, skip header.";	 Catch:{ all -> 0x000a }
        com.google.android.gms.internal.zzaeg.zzbw(r2);	 Catch:{ all -> 0x000a }
        goto L_0x005e;	 Catch:{ all -> 0x000a }
    L_0x00b6:
        r8 = r9.size();	 Catch:{ all -> 0x000a }
        r8 = new com.google.android.gms.internal.zzfhy[r8];	 Catch:{ all -> 0x000a }
        r9.toArray(r8);	 Catch:{ all -> 0x000a }
        r9 = r1.zzpjk;	 Catch:{ all -> 0x000a }
        r9.zzpiy = r8;	 Catch:{ all -> 0x000a }
    L_0x00c3:
        r8 = r6.zzcum;	 Catch:{ all -> 0x000a }
        r8.put(r7, r1);	 Catch:{ all -> 0x000a }
        monitor-exit(r0);	 Catch:{ all -> 0x000a }
        return;	 Catch:{ all -> 0x000a }
    L_0x00ca:
        monitor-exit(r0);	 Catch:{ all -> 0x000a }
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzady.zza(java.lang.String, java.util.Map, int):void");
    }

    public final void zzbu(String str) {
        synchronized (this.mLock) {
            this.zzcul.zzpim = str;
        }
    }

    public final void zzl(View view) {
        if (this.zzcrj.zzcuy && !this.zzcur) {
            zzbs.zzec();
            Bitmap zzn = zzagr.zzn(view);
            if (zzn == null) {
                zzaeg.zzbw("Failed to capture the webview bitmap.");
                return;
            }
            this.zzcur = true;
            zzagr.zzb(new zzadz(this, zzn));
        }
    }

    @VisibleForTesting
    final void zzo(@Nullable Map<String, String> map) throws JSONException {
        if (map != null) {
            for (String str : map.keySet()) {
                String str2;
                JSONArray optJSONArray = new JSONObject((String) map.get(str2)).optJSONArray("matches");
                if (optJSONArray != null) {
                    synchronized (this.mLock) {
                        int length = optJSONArray.length();
                        zzfie zzbv = zzbv(str2);
                        if (zzbv == null) {
                            String str3 = "Cannot find the corresponding resource object for ";
                            str2 = String.valueOf(str2);
                            zzaeg.zzbw(str2.length() != 0 ? str3.concat(str2) : new String(str3));
                        } else {
                            zzbv.zzpjq = new String[length];
                            int i = 0;
                            for (int i2 = 0; i2 < length; i2++) {
                                zzbv.zzpjq[i2] = optJSONArray.getJSONObject(i2).getString("threat_type");
                            }
                            boolean z = this.zzcuo;
                            if (length > 0) {
                                i = 1;
                            }
                            this.zzcuo = i | z;
                        }
                    }
                }
            }
        }
    }

    public final zzaee zzoe() {
        return this.zzcrj;
    }

    public final boolean zzof() {
        return zzq.zzama() && this.zzcrj.zzcuy && !this.zzcur;
    }

    public final void zzog() {
        this.zzcuq = true;
    }

    public final void zzoh() {
        synchronized (this.mLock) {
            zzajp zza = this.zzcun.zza(this.mContext, this.zzcum.keySet());
            zza.zza(new zzaea(this, zza), zzagl.zzcyx);
        }
    }
}
