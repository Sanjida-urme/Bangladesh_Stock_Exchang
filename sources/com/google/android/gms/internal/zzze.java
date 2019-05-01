package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.internal.zzid.zza.zzb;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

@zzzb
public final class zzze extends zzafh implements zzzr {
    private final Context mContext;
    private zztn zzccq;
    private zzzz zzcdj;
    private zzaad zzchw;
    private Runnable zzchx;
    private final Object zzchy = new Object();
    private final zzzd zzckx;
    private final zzaaa zzcky;
    private final zzib zzckz;
    private final zzig zzcla;
    zzahi zzclb;

    public zzze(Context context, zzaaa zzaaa, zzzd zzzd, zzig zzig) {
        zzib zzib;
        zzic zzic;
        this.zzckx = zzzd;
        this.mContext = context;
        this.zzcky = zzaaa;
        this.zzcla = zzig;
        this.zzckz = new zzib(this.zzcla, ((Boolean) zzbs.zzep().zzd(zzmq.zzbpk)).booleanValue());
        this.zzckz.zza(new zzzf(this));
        zzim zzim = new zzim();
        zzim.zzbbq = Integer.valueOf(this.zzcky.zzatd.zzdbz);
        zzim.zzbbr = Integer.valueOf(this.zzcky.zzatd.zzdca);
        zzim.zzbbs = Integer.valueOf(this.zzcky.zzatd.zzdcb ? 0 : 2);
        this.zzckz.zza(new zzzg(zzim));
        if (this.zzcky.zzclp != null) {
            this.zzckz.zza(new zzzh(this));
        }
        zziw zziw = this.zzcky.zzath;
        if (zziw.zzbdb && "interstitial_mb".equals(zziw.zzbda)) {
            zzib = this.zzckz;
            zzic = zzzi.zzcle;
        } else if (zziw.zzbdb && "reward_mb".equals(zziw.zzbda)) {
            zzib = this.zzckz;
            zzic = zzzj.zzcle;
        } else if (zziw.zzbdd || zziw.zzbdb) {
            zzib = this.zzckz;
            zzic = zzzl.zzcle;
        } else {
            zzib = this.zzckz;
            zzic = zzzk.zzcle;
        }
        zzib.zza(zzic);
        this.zzckz.zza(zzb.AD_REQUEST);
    }

    private final com.google.android.gms.internal.zziw zza(com.google.android.gms.internal.zzzz r12) throws com.google.android.gms.internal.zzzo {
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
        r0 = r11.zzcdj;
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x0018;
    L_0x0006:
        r0 = r11.zzcdj;
        r0 = r0.zzatx;
        if (r0 == 0) goto L_0x0018;
    L_0x000c:
        r0 = r11.zzcdj;
        r0 = r0.zzatx;
        r0 = r0.size();
        if (r0 <= r1) goto L_0x0018;
    L_0x0016:
        r0 = 1;
        goto L_0x0019;
    L_0x0018:
        r0 = 0;
    L_0x0019:
        if (r0 == 0) goto L_0x0027;
    L_0x001b:
        r0 = r11.zzccq;
        if (r0 == 0) goto L_0x0027;
    L_0x001f:
        r0 = r11.zzccq;
        r0 = r0.zzccl;
        if (r0 != 0) goto L_0x0027;
    L_0x0025:
        r12 = 0;
        return r12;
    L_0x0027:
        r0 = r11.zzchw;
        r0 = r0.zzbde;
        if (r0 == 0) goto L_0x0048;
    L_0x002d:
        r0 = r12.zzath;
        r0 = r0.zzbdc;
        r3 = r0.length;
        r4 = 0;
    L_0x0033:
        if (r4 >= r3) goto L_0x0048;
    L_0x0035:
        r5 = r0[r4];
        r6 = r5.zzbde;
        if (r6 == 0) goto L_0x0045;
    L_0x003b:
        r0 = new com.google.android.gms.internal.zziw;
        r12 = r12.zzath;
        r12 = r12.zzbdc;
        r0.<init>(r5, r12);
        return r0;
    L_0x0045:
        r4 = r4 + 1;
        goto L_0x0033;
    L_0x0048:
        r0 = r11.zzchw;
        r0 = r0.zzcnj;
        if (r0 != 0) goto L_0x0056;
    L_0x004e:
        r12 = new com.google.android.gms.internal.zzzo;
        r0 = "The ad response must specify one of the supported ad sizes.";
        r12.<init>(r0, r2);
        throw r12;
    L_0x0056:
        r0 = r11.zzchw;
        r0 = r0.zzcnj;
        r3 = "x";
        r0 = r0.split(r3);
        r3 = r0.length;
        r4 = 2;
        if (r3 == r4) goto L_0x0085;
    L_0x0064:
        r12 = new com.google.android.gms.internal.zzzo;
        r0 = "Invalid ad size format from the ad response: ";
        r1 = r11.zzchw;
        r1 = r1.zzcnj;
        r1 = java.lang.String.valueOf(r1);
        r3 = r1.length();
        if (r3 == 0) goto L_0x007b;
    L_0x0076:
        r0 = r0.concat(r1);
        goto L_0x0081;
    L_0x007b:
        r1 = new java.lang.String;
        r1.<init>(r0);
        r0 = r1;
    L_0x0081:
        r12.<init>(r0, r2);
        throw r12;
    L_0x0085:
        r3 = r0[r2];	 Catch:{ NumberFormatException -> 0x00f7 }
        r3 = java.lang.Integer.parseInt(r3);	 Catch:{ NumberFormatException -> 0x00f7 }
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x00f7 }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x00f7 }
        r1 = r12.zzath;
        r1 = r1.zzbdc;
        r4 = r1.length;
        r5 = 0;
    L_0x0097:
        if (r5 >= r4) goto L_0x00d6;
    L_0x0099:
        r6 = r1[r5];
        r7 = r11.mContext;
        r7 = r7.getResources();
        r7 = r7.getDisplayMetrics();
        r7 = r7.density;
        r8 = r6.width;
        r9 = -1;
        if (r8 != r9) goto L_0x00b2;
    L_0x00ac:
        r8 = r6.widthPixels;
        r8 = (float) r8;
        r8 = r8 / r7;
        r8 = (int) r8;
        goto L_0x00b4;
    L_0x00b2:
        r8 = r6.width;
    L_0x00b4:
        r9 = r6.height;
        r10 = -2;
        if (r9 != r10) goto L_0x00bf;
    L_0x00b9:
        r9 = r6.heightPixels;
        r9 = (float) r9;
        r9 = r9 / r7;
        r7 = (int) r9;
        goto L_0x00c1;
    L_0x00bf:
        r7 = r6.height;
    L_0x00c1:
        if (r3 != r8) goto L_0x00d3;
    L_0x00c3:
        if (r0 != r7) goto L_0x00d3;
    L_0x00c5:
        r7 = r6.zzbde;
        if (r7 != 0) goto L_0x00d3;
    L_0x00c9:
        r0 = new com.google.android.gms.internal.zziw;
        r12 = r12.zzath;
        r12 = r12.zzbdc;
        r0.<init>(r6, r12);
        return r0;
    L_0x00d3:
        r5 = r5 + 1;
        goto L_0x0097;
    L_0x00d6:
        r12 = new com.google.android.gms.internal.zzzo;
        r0 = "The ad size from the ad response was not one of the requested sizes: ";
        r1 = r11.zzchw;
        r1 = r1.zzcnj;
        r1 = java.lang.String.valueOf(r1);
        r3 = r1.length();
        if (r3 == 0) goto L_0x00ed;
    L_0x00e8:
        r0 = r0.concat(r1);
        goto L_0x00f3;
    L_0x00ed:
        r1 = new java.lang.String;
        r1.<init>(r0);
        r0 = r1;
    L_0x00f3:
        r12.<init>(r0, r2);
        throw r12;
    L_0x00f7:
        r12 = new com.google.android.gms.internal.zzzo;
        r0 = "Invalid ad size number from the ad response: ";
        r1 = r11.zzchw;
        r1 = r1.zzcnj;
        r1 = java.lang.String.valueOf(r1);
        r3 = r1.length();
        if (r3 == 0) goto L_0x010e;
    L_0x0109:
        r0 = r0.concat(r1);
        goto L_0x0114;
    L_0x010e:
        r1 = new java.lang.String;
        r1.<init>(r0);
        r0 = r1;
    L_0x0114:
        r12.<init>(r0, r2);
        throw r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzze.zza(com.google.android.gms.internal.zzzz):com.google.android.gms.internal.zziw");
    }

    private final void zzc(int i, String str) {
        zzzz zzzz;
        zzze zzze = this;
        int i2 = i;
        if (i2 != 3) {
            if (i2 != -1) {
                zzaiw.zzco(str);
                zzze.zzchw = zzze.zzchw != null ? new zzaad(i2) : new zzaad(i2, zzze.zzchw.zzccb);
                if (zzze.zzcdj == null) {
                    zzzz = zzze.zzcdj;
                } else {
                    zzzz zzzz2 = new zzzz(zzze.zzcky, -1, null, null, null);
                }
                zzze.zzckx.zza(new zzaev(zzzz, zzze.zzchw, zzze.zzccq, null, i2, -1, zzze.zzchw.zzcnk, null, zzze.zzckz, null));
            }
        }
        zzaiw.zzcn(str);
        if (zzze.zzchw != null) {
        }
        zzze.zzchw = zzze.zzchw != null ? new zzaad(i2) : new zzaad(i2, zzze.zzchw.zzccb);
        if (zzze.zzcdj == null) {
            zzzz zzzz22 = new zzzz(zzze.zzcky, -1, null, null, null);
        } else {
            zzzz = zzze.zzcdj;
        }
        zzze.zzckx.zza(new zzaev(zzzz, zzze.zzchw, zzze.zzccq, null, i2, -1, zzze.zzchw.zzcnk, null, zzze.zzckz, null));
    }

    public final void onStop() {
        synchronized (this.zzchy) {
            if (this.zzclb != null) {
                this.zzclb.cancel();
            }
        }
    }

    final zzahi zza(zzaiy zzaiy, zzaka<zzzz> zzaka) {
        Context context = this.mContext;
        if (new zzzq(context).zza(zzaiy)) {
            zzaiw.zzbw("Fetching ad response from local ad request service.");
            zzahi zzzw = new zzzw(context, zzaka, this);
            zzzw.zzmx();
            return zzzw;
        }
        zzaiw.zzbw("Fetching ad response from remote ad request service.");
        zzjk.zzhx();
        if (zzais.zzbd(context)) {
            return new zzzx(context, zzaiy, zzaka, this);
        }
        zzaiw.zzco("Failed to connect to remote ad request service.");
        return null;
    }

    public final void zza(@NonNull zzaad zzaad) {
        String str;
        zzaiw.zzbw("Received ad response.");
        this.zzchw = zzaad;
        long elapsedRealtime = zzbs.zzei().elapsedRealtime();
        synchronized (this.zzchy) {
            zzahi zzahi = null;
            this.zzclb = null;
        }
        zzbs.zzeg().zzg(this.mContext, this.zzchw.zzcmk);
        if (((Boolean) zzbs.zzep().zzd(zzmq.zzbkg)).booleanValue()) {
            SharedPreferences sharedPreferences;
            Set hashSet;
            Context context;
            Collection stringSet;
            if (this.zzchw.zzcmw) {
                zzbs.zzeg();
                context = this.mContext;
                str = this.zzcdj.zzatb;
                sharedPreferences = context.getSharedPreferences("admob", 0);
                stringSet = sharedPreferences.getStringSet("never_pool_slots", Collections.emptySet());
                if (!stringSet.contains(str)) {
                    hashSet = new HashSet(stringSet);
                    hashSet.add(str);
                }
            } else {
                zzbs.zzeg();
                context = this.mContext;
                str = this.zzcdj.zzatb;
                sharedPreferences = context.getSharedPreferences("admob", 0);
                stringSet = sharedPreferences.getStringSet("never_pool_slots", Collections.emptySet());
                if (stringSet.contains(str)) {
                    hashSet = new HashSet(stringSet);
                    hashSet.remove(str);
                }
            }
            Editor edit = sharedPreferences.edit();
            edit.putStringSet("never_pool_slots", hashSet);
            edit.apply();
        }
        try {
            if (this.zzchw.errorCode == -2 || this.zzchw.errorCode == -3) {
                JSONObject jSONObject;
                Boolean valueOf;
                if (this.zzchw.errorCode != -3) {
                    if (TextUtils.isEmpty(this.zzchw.body)) {
                        throw new zzzo("No fill from ad server.", 3);
                    }
                    zzbs.zzeg().zzf(this.mContext, this.zzchw.zzclw);
                    if (this.zzchw.zzcng) {
                        this.zzccq = new zztn(this.zzchw.body);
                        zzbs.zzeg().zzz(this.zzccq.zzcbz);
                    } else {
                        zzbs.zzeg().zzz(this.zzchw.zzcbz);
                    }
                    if (!TextUtils.isEmpty(this.zzchw.zzcml)) {
                        if (((Boolean) zzbs.zzep().zzd(zzmq.zzboh)).booleanValue()) {
                            zzaiw.zzbw("Received cookie from server. Setting webview cookie in CookieManager.");
                            CookieManager zzax = zzbs.zzee().zzax(this.mContext);
                            if (zzax != null) {
                                zzax.setCookie("googleads.g.doubleclick.net", this.zzchw.zzcml);
                            }
                        }
                    }
                }
                zziw zza = this.zzcdj.zzath.zzbdc != null ? zza(this.zzcdj) : null;
                zzbs.zzeg().zzx(this.zzchw.zzcnq);
                zzbs.zzeg().zzy(this.zzchw.zzcod);
                if (!TextUtils.isEmpty(this.zzchw.zzcno)) {
                    try {
                        jSONObject = new JSONObject(this.zzchw.zzcno);
                    } catch (Throwable e) {
                        zzaiw.zzb("Error parsing the JSON for Active View.", e);
                    }
                    if (this.zzchw.zzcof == 2) {
                        zzahi = Boolean.valueOf(true);
                        zzbs.zzec();
                        zzagr.zzb(this.zzcdj.zzclo, true);
                    }
                    if (this.zzchw.zzcof == 1) {
                        zzahi = Boolean.valueOf(false);
                    }
                    if (this.zzchw.zzcof != 0) {
                        zzbs.zzec();
                        valueOf = Boolean.valueOf(zzagr.zzp(this.zzcdj.zzclo));
                    } else {
                        valueOf = zzahi;
                    }
                    this.zzckx.zza(new zzaev(this.zzcdj, this.zzchw, this.zzccq, zza, -2, elapsedRealtime, this.zzchw.zzcnk, jSONObject, this.zzckz, valueOf));
                    zzagr.zzczc.removeCallbacks(this.zzchx);
                    return;
                }
                jSONObject = null;
                if (this.zzchw.zzcof == 2) {
                    zzahi = Boolean.valueOf(true);
                    zzbs.zzec();
                    zzagr.zzb(this.zzcdj.zzclo, true);
                }
                if (this.zzchw.zzcof == 1) {
                    zzahi = Boolean.valueOf(false);
                }
                if (this.zzchw.zzcof != 0) {
                    valueOf = zzahi;
                } else {
                    zzbs.zzec();
                    valueOf = Boolean.valueOf(zzagr.zzp(this.zzcdj.zzclo));
                }
                this.zzckx.zza(new zzaev(this.zzcdj, this.zzchw, this.zzccq, zza, -2, elapsedRealtime, this.zzchw.zzcnk, jSONObject, this.zzckz, valueOf));
                zzagr.zzczc.removeCallbacks(this.zzchx);
                return;
            }
            int i = this.zzchw.errorCode;
            StringBuilder stringBuilder = new StringBuilder(66);
            stringBuilder.append("There was a problem getting an ad response. ErrorCode: ");
            stringBuilder.append(i);
            throw new zzzo(stringBuilder.toString(), this.zzchw.errorCode);
        } catch (Throwable e2) {
            zzaiw.zzb("Could not parse mediation config.", e2);
            String str2 = "Could not parse mediation config: ";
            str = String.valueOf(this.zzchw.body);
            throw new zzzo(str.length() != 0 ? str2.concat(str) : new String(str2), 0);
        } catch (zzzo e3) {
            zzc(e3.getErrorCode(), e3.getMessage());
        }
    }

    final /* synthetic */ void zzb(zzil zzil) {
        zzil.zzbbo.zzbbl = this.zzcky.zzclp.packageName;
    }

    final /* synthetic */ void zzc(zzil zzil) {
        zzil.zzbbn = this.zzcky.zzcmb;
    }

    public final void zzdg() {
        zzaiw.zzbw("AdLoaderBackgroundTask started.");
        this.zzchx = new zzzm(this);
        zzagr.zzczc.postDelayed(this.zzchx, ((Long) zzbs.zzep().zzd(zzmq.zzbls)).longValue());
        long elapsedRealtime = zzbs.zzei().elapsedRealtime();
        if (((Boolean) zzbs.zzep().zzd(zzmq.zzblq)).booleanValue() && this.zzcky.zzclo.extras != null) {
            String string = this.zzcky.zzclo.extras.getString("_ad");
            if (string != null) {
                this.zzcdj = new zzzz(this.zzcky, elapsedRealtime, null, null, null);
                zza(zzabm.zza(this.mContext, this.zzcdj, string));
                return;
            }
        }
        zzaka zzake = new zzake();
        zzagl.zza(new zzzn(this, zzake));
        String zzx = zzbs.zzfa().zzx(this.mContext);
        String zzy = zzbs.zzfa().zzy(this.mContext);
        String zzz = zzbs.zzfa().zzz(this.mContext);
        zzbs.zzfa().zzg(this.mContext, zzz);
        this.zzcdj = new zzzz(this.zzcky, elapsedRealtime, zzx, zzy, zzz);
        zzake.zzj(this.zzcdj);
    }
}
