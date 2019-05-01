package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.util.SimpleArrayMap;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.internal.zzagr;
import com.google.android.gms.internal.zzaiy;
import com.google.android.gms.internal.zzis;
import com.google.android.gms.internal.zziw;
import com.google.android.gms.internal.zzjq;
import com.google.android.gms.internal.zzju;
import com.google.android.gms.internal.zzkm;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.internal.zzom;
import com.google.android.gms.internal.zzpy;
import com.google.android.gms.internal.zzqb;
import com.google.android.gms.internal.zzqe;
import com.google.android.gms.internal.zzqh;
import com.google.android.gms.internal.zzqk;
import com.google.android.gms.internal.zzuc;
import com.google.android.gms.internal.zzzb;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@zzzb
public final class zzag extends zzju {
    private final Context mContext;
    private final Object mLock = new Object();
    private final zzv zzamw;
    private final zzuc zzanb;
    private final zzjq zzaoj;
    @Nullable
    private final zzpy zzaok;
    @Nullable
    private final zzqb zzaol;
    @Nullable
    private final zzqk zzaom;
    @Nullable
    private final zziw zzaon;
    @Nullable
    private final PublisherAdViewOptions zzaoo;
    private final SimpleArrayMap<String, zzqh> zzaop;
    private final SimpleArrayMap<String, zzqe> zzaoq;
    private final zzom zzaor;
    private final List<String> zzaos;
    private final zzkm zzaot;
    private final String zzaou;
    private final zzaiy zzaov;
    @Nullable
    private WeakReference<zzd> zzaow;

    zzag(Context context, String str, zzuc zzuc, zzaiy zzaiy, zzjq zzjq, zzpy zzpy, zzqb zzqb, SimpleArrayMap<String, zzqh> simpleArrayMap, SimpleArrayMap<String, zzqe> simpleArrayMap2, zzom zzom, zzkm zzkm, zzv zzv, zzqk zzqk, zziw zziw, PublisherAdViewOptions publisherAdViewOptions) {
        this.mContext = context;
        this.zzaou = str;
        this.zzanb = zzuc;
        this.zzaov = zzaiy;
        this.zzaoj = zzjq;
        this.zzaol = zzqb;
        this.zzaok = zzpy;
        this.zzaop = simpleArrayMap;
        this.zzaoq = simpleArrayMap2;
        this.zzaor = zzom;
        this.zzaos = zzdb();
        this.zzaot = zzkm;
        this.zzamw = zzv;
        this.zzaom = zzqk;
        this.zzaon = zziw;
        this.zzaoo = publisherAdViewOptions;
        zzmq.initialize(this.mContext);
    }

    private static void runOnUiThread(Runnable runnable) {
        zzagr.zzczc.post(runnable);
    }

    private final void zzb(zzis zzis, int i) {
        zza zzba = new zzba(this.mContext, this.zzamw, zziw.zzg(this.mContext), this.zzaou, this.zzanb, this.zzaov);
        this.zzaow = new WeakReference(zzba);
        zzpy zzpy = this.zzaok;
        zzbq.zzga("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
        zzba.zzamt.zzatp = zzpy;
        zzqb zzqb = this.zzaol;
        zzbq.zzga("setOnContentAdLoadedListener must be called on the main UI thread.");
        zzba.zzamt.zzatq = zzqb;
        SimpleArrayMap simpleArrayMap = this.zzaop;
        zzbq.zzga("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        zzba.zzamt.zzats = simpleArrayMap;
        zzba.zza(this.zzaoj);
        simpleArrayMap = this.zzaoq;
        zzbq.zzga("setOnCustomClickListener must be called on the main UI thread.");
        zzba.zzamt.zzatr = simpleArrayMap;
        zzba.zzc(zzdb());
        zzom zzom = this.zzaor;
        zzbq.zzga("setNativeAdOptions must be called on the main UI thread.");
        zzba.zzamt.zzatt = zzom;
        zzba.zza(this.zzaot);
        zzba.zzj(i);
        zzba.zzb(zzis);
    }

    private final boolean zzcz() {
        return ((Boolean) zzbs.zzep().zzd(zzmq.zzbjw)).booleanValue() && this.zzaom != null;
    }

    private final boolean zzda() {
        if (this.zzaok == null && this.zzaol == null) {
            if (this.zzaop == null || this.zzaop.size() <= 0) {
                return false;
            }
        }
        return true;
    }

    private final List<String> zzdb() {
        List<String> arrayList = new ArrayList();
        if (this.zzaol != null) {
            arrayList.add("1");
        }
        if (this.zzaok != null) {
            arrayList.add("2");
        }
        if (this.zzaop.size() > 0) {
            arrayList.add("3");
        }
        return arrayList;
    }

    private final void zze(zzis zzis) {
        zza zzq = new zzq(this.mContext, this.zzamw, this.zzaon, this.zzaou, this.zzanb, this.zzaov);
        this.zzaow = new WeakReference(zzq);
        zzqk zzqk = this.zzaom;
        zzbq.zzga("setOnPublisherAdViewLoadedListener must be called on the main UI thread.");
        zzq.zzamt.zzatw = zzqk;
        if (this.zzaoo != null) {
            if (this.zzaoo.zzbi() != null) {
                zzq.zza(this.zzaoo.zzbi());
            }
            zzq.setManualImpressionsEnabled(this.zzaoo.getManualImpressionsEnabled());
        }
        zzpy zzpy = this.zzaok;
        zzbq.zzga("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
        zzq.zzamt.zzatp = zzpy;
        zzqb zzqb = this.zzaol;
        zzbq.zzga("setOnContentAdLoadedListener must be called on the main UI thread.");
        zzq.zzamt.zzatq = zzqb;
        SimpleArrayMap simpleArrayMap = this.zzaop;
        zzbq.zzga("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        zzq.zzamt.zzats = simpleArrayMap;
        simpleArrayMap = this.zzaoq;
        zzbq.zzga("setOnCustomClickListener must be called on the main UI thread.");
        zzq.zzamt.zzatr = simpleArrayMap;
        zzom zzom = this.zzaor;
        zzbq.zzga("setNativeAdOptions must be called on the main UI thread.");
        zzq.zzamt.zzatt = zzom;
        zzq.zzc(zzdb());
        zzq.zza(this.zzaoj);
        zzq.zza(this.zzaot);
        List arrayList = new ArrayList();
        if (zzda()) {
            arrayList.add(Integer.valueOf(1));
        }
        if (this.zzaom != null) {
            arrayList.add(Integer.valueOf(2));
        }
        zzq.zzd(arrayList);
        if (zzda()) {
            zzis.extras.putBoolean("ina", true);
        }
        if (this.zzaom != null) {
            zzis.extras.putBoolean("iba", true);
        }
        zzq.zzb(zzis);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.Nullable
    public final java.lang.String getMediationAdapterClassName() {
        /*
        r3 = this;
        r0 = r3.mLock;
        monitor-enter(r0);
        r1 = r3.zzaow;	 Catch:{ all -> 0x001a }
        r2 = 0;
        if (r1 == 0) goto L_0x0018;
    L_0x0008:
        r1 = r3.zzaow;	 Catch:{ all -> 0x001a }
        r1 = r1.get();	 Catch:{ all -> 0x001a }
        r1 = (com.google.android.gms.ads.internal.zzd) r1;	 Catch:{ all -> 0x001a }
        if (r1 == 0) goto L_0x0016;
    L_0x0012:
        r2 = r1.getMediationAdapterClassName();	 Catch:{ all -> 0x001a }
    L_0x0016:
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        return r2;
    L_0x0018:
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        return r2;
    L_0x001a:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzag.getMediationAdapterClassName():java.lang.String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isLoading() {
        /*
        r3 = this;
        r0 = r3.mLock;
        monitor-enter(r0);
        r1 = r3.zzaow;	 Catch:{ all -> 0x001a }
        r2 = 0;
        if (r1 == 0) goto L_0x0018;
    L_0x0008:
        r1 = r3.zzaow;	 Catch:{ all -> 0x001a }
        r1 = r1.get();	 Catch:{ all -> 0x001a }
        r1 = (com.google.android.gms.ads.internal.zzd) r1;	 Catch:{ all -> 0x001a }
        if (r1 == 0) goto L_0x0016;
    L_0x0012:
        r2 = r1.isLoading();	 Catch:{ all -> 0x001a }
    L_0x0016:
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        return r2;
    L_0x0018:
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        return r2;
    L_0x001a:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzag.isLoading():boolean");
    }

    public final void zza(zzis zzis, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Number of ads has to be more than 0");
        }
        runOnUiThread(new zzai(this, zzis, i));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.Nullable
    public final java.lang.String zzcj() {
        /*
        r3 = this;
        r0 = r3.mLock;
        monitor-enter(r0);
        r1 = r3.zzaow;	 Catch:{ all -> 0x001a }
        r2 = 0;
        if (r1 == 0) goto L_0x0018;
    L_0x0008:
        r1 = r3.zzaow;	 Catch:{ all -> 0x001a }
        r1 = r1.get();	 Catch:{ all -> 0x001a }
        r1 = (com.google.android.gms.ads.internal.zzd) r1;	 Catch:{ all -> 0x001a }
        if (r1 == 0) goto L_0x0016;
    L_0x0012:
        r2 = r1.zzcj();	 Catch:{ all -> 0x001a }
    L_0x0016:
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        return r2;
    L_0x0018:
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        return r2;
    L_0x001a:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzag.zzcj():java.lang.String");
    }

    public final void zzd(zzis zzis) {
        runOnUiThread(new zzah(this, zzis));
    }
}
