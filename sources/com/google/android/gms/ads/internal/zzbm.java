package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.AsyncTask;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebView;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;
import com.google.android.gms.internal.zzacv;
import com.google.android.gms.internal.zzagl;
import com.google.android.gms.internal.zzaiw;
import com.google.android.gms.internal.zzaiy;
import com.google.android.gms.internal.zzcs;
import com.google.android.gms.internal.zzis;
import com.google.android.gms.internal.zziw;
import com.google.android.gms.internal.zzjn;
import com.google.android.gms.internal.zzjq;
import com.google.android.gms.internal.zzkc;
import com.google.android.gms.internal.zzkg;
import com.google.android.gms.internal.zzkm;
import com.google.android.gms.internal.zzku;
import com.google.android.gms.internal.zzla;
import com.google.android.gms.internal.zzma;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.internal.zznj;
import com.google.android.gms.internal.zzwq;
import com.google.android.gms.internal.zzww;
import com.google.android.gms.internal.zzzb;
import java.util.Map;
import java.util.concurrent.Future;

@zzzb
public final class zzbm extends zzkc {
    private final Context mContext;
    @Nullable
    private zzjq zzaoj;
    private final zzaiy zzaov;
    private final zziw zzarg;
    private final Future<zzcs> zzarh = zzagl.zza(zzagl.zzcyx, new zzbp(this));
    private final zzbr zzari;
    @Nullable
    private WebView zzarj = new WebView(this.mContext);
    @Nullable
    private zzcs zzark;
    private AsyncTask<Void, Void, String> zzarl;

    public zzbm(Context context, zziw zziw, String str, zzaiy zzaiy) {
        this.mContext = context;
        this.zzaov = zzaiy;
        this.zzarg = zziw;
        this.zzari = new zzbr(str);
        zzk(0);
        this.zzarj.setVerticalScrollBarEnabled(false);
        this.zzarj.getSettings().setJavaScriptEnabled(true);
        this.zzarj.setWebViewClient(new zzbn(this));
        this.zzarj.setOnTouchListener(new zzbo(this));
    }

    private final String zzv(String str) {
        if (this.zzark == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = this.zzark.zza(parse, this.mContext, null);
        } catch (Throwable e) {
            zzaiw.zzc("Unable to process ad data", e);
        }
        return parse.toString();
    }

    private final void zzw(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.mContext.startActivity(intent);
    }

    public final void destroy() throws RemoteException {
        zzbq.zzga("destroy must be called on the main UI thread.");
        this.zzarl.cancel(true);
        this.zzarh.cancel(true);
        this.zzarj.destroy();
        this.zzarj = null;
    }

    public final String getAdUnitId() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Nullable
    public final String getMediationAdapterClassName() throws RemoteException {
        return null;
    }

    @Nullable
    public final zzku getVideoController() {
        return null;
    }

    public final boolean isLoading() throws RemoteException {
        return false;
    }

    public final boolean isReady() throws RemoteException {
        return false;
    }

    public final void pause() throws RemoteException {
        zzbq.zzga("pause must be called on the main UI thread.");
    }

    public final void resume() throws RemoteException {
        zzbq.zzga("resume must be called on the main UI thread.");
    }

    public final void setImmersiveMode(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    public final void setManualImpressionsEnabled(boolean z) throws RemoteException {
    }

    public final void setUserId(String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void showInterstitial() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void stopLoading() throws RemoteException {
    }

    public final void zza(zzacv zzacv) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zziw zziw) throws RemoteException {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    public final void zza(zzjn zzjn) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzjq zzjq) throws RemoteException {
        this.zzaoj = zzjq;
    }

    public final void zza(zzkg zzkg) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzkm zzkm) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzla zzla) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzma zzma) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zznj zznj) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzwq zzwq) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzww zzww, String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final boolean zzb(zzis zzis) throws RemoteException {
        zzbq.checkNotNull(this.zzarj, "This Search Ad has already been torn down");
        this.zzari.zza(zzis, this.zzaov);
        this.zzarl = new zzbq().execute(new Void[0]);
        return true;
    }

    public final IObjectWrapper zzbl() throws RemoteException {
        zzbq.zzga("getAdFrame must be called on the main UI thread.");
        return zzn.zzy(this.zzarj);
    }

    public final zziw zzbm() throws RemoteException {
        return this.zzarg;
    }

    public final void zzbo() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final zzkg zzbx() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    public final zzjq zzby() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Nullable
    public final String zzcj() throws RemoteException {
        return null;
    }

    final String zzds() {
        Builder builder = new Builder();
        builder.scheme("https://").appendEncodedPath((String) zzbs.zzep().zzd(zzmq.zzbnx));
        builder.appendQueryParameter(SearchIntents.EXTRA_QUERY, this.zzari.getQuery());
        builder.appendQueryParameter("pubId", this.zzari.zzdv());
        Map zzdw = this.zzari.zzdw();
        for (String str : zzdw.keySet()) {
            builder.appendQueryParameter(str, (String) zzdw.get(str));
        }
        Uri build = builder.build();
        if (this.zzark != null) {
            try {
                build = this.zzark.zza(build, this.mContext);
            } catch (Throwable e) {
                zzaiw.zzc("Unable to process ad data", e);
            }
        }
        String zzdt = zzdt();
        String encodedQuery = build.getEncodedQuery();
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(zzdt).length() + 1) + String.valueOf(encodedQuery).length());
        stringBuilder.append(zzdt);
        stringBuilder.append("#");
        stringBuilder.append(encodedQuery);
        return stringBuilder.toString();
    }

    final String zzdt() {
        String zzdu = this.zzari.zzdu();
        if (TextUtils.isEmpty(zzdu)) {
            zzdu = "www.google.com";
        }
        String str = "https://";
        String str2 = (String) zzbs.zzep().zzd(zzmq.zzbnx);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + String.valueOf(zzdu).length()) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append(zzdu);
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    final void zzk(int i) {
        if (this.zzarj != null) {
            this.zzarj.setLayoutParams(new LayoutParams(-1, i));
        }
    }

    final int zzu(java.lang.String r3) {
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
        r2 = this;
        r3 = android.net.Uri.parse(r3);
        r0 = "height";
        r3 = r3.getQueryParameter(r0);
        r0 = android.text.TextUtils.isEmpty(r3);
        r1 = 0;
        if (r0 == 0) goto L_0x0012;
    L_0x0011:
        return r1;
    L_0x0012:
        com.google.android.gms.internal.zzjk.zzhx();	 Catch:{ NumberFormatException -> 0x0020 }
        r0 = r2.mContext;	 Catch:{ NumberFormatException -> 0x0020 }
        r3 = java.lang.Integer.parseInt(r3);	 Catch:{ NumberFormatException -> 0x0020 }
        r3 = com.google.android.gms.internal.zzais.zzc(r0, r3);	 Catch:{ NumberFormatException -> 0x0020 }
        return r3;
    L_0x0020:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzbm.zzu(java.lang.String):int");
    }
}
