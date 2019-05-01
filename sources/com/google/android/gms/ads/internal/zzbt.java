package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.support.v4.util.SimpleArrayMap;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.internal.zzacv;
import com.google.android.gms.internal.zzaeu;
import com.google.android.gms.internal.zzaev;
import com.google.android.gms.internal.zzaew;
import com.google.android.gms.internal.zzaff;
import com.google.android.gms.internal.zzafh;
import com.google.android.gms.internal.zzahi;
import com.google.android.gms.internal.zzail;
import com.google.android.gms.internal.zzais;
import com.google.android.gms.internal.zzaiy;
import com.google.android.gms.internal.zzcs;
import com.google.android.gms.internal.zziw;
import com.google.android.gms.internal.zzjk;
import com.google.android.gms.internal.zzjn;
import com.google.android.gms.internal.zzjq;
import com.google.android.gms.internal.zzkg;
import com.google.android.gms.internal.zzkm;
import com.google.android.gms.internal.zzla;
import com.google.android.gms.internal.zzma;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.internal.zznj;
import com.google.android.gms.internal.zzom;
import com.google.android.gms.internal.zzpy;
import com.google.android.gms.internal.zzqb;
import com.google.android.gms.internal.zzqe;
import com.google.android.gms.internal.zzqh;
import com.google.android.gms.internal.zzqk;
import com.google.android.gms.internal.zzzb;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

@zzzb
public final class zzbt implements OnGlobalLayoutListener, OnScrollChangedListener {
    public final Context zzaif;
    boolean zzapr;
    final String zzata;
    public String zzatb;
    final zzcs zzatc;
    public final zzaiy zzatd;
    @Nullable
    zzbu zzate;
    @Nullable
    public zzafh zzatf;
    @Nullable
    public zzahi zzatg;
    public zziw zzath;
    @Nullable
    public zzaeu zzati;
    public zzaev zzatj;
    @Nullable
    public zzaew zzatk;
    @Nullable
    zzjn zzatl;
    @Nullable
    zzjq zzatm;
    @Nullable
    zzkg zzatn;
    @Nullable
    zzkm zzato;
    @Nullable
    zzpy zzatp;
    @Nullable
    zzqb zzatq;
    SimpleArrayMap<String, zzqe> zzatr;
    SimpleArrayMap<String, zzqh> zzats;
    zzom zzatt;
    @Nullable
    zzma zzatu;
    @Nullable
    zzla zzatv;
    @Nullable
    zzqk zzatw;
    @Nullable
    List<Integer> zzatx;
    @Nullable
    zznj zzaty;
    @Nullable
    zzacv zzatz;
    @Nullable
    public String zzaua;
    @Nullable
    List<String> zzaub;
    @Nullable
    public zzaff zzauc;
    @Nullable
    View zzaud;
    public int zzaue;
    private HashSet<zzaew> zzauf;
    private int zzaug;
    private int zzauh;
    private zzail zzaui;
    private boolean zzauj;
    private boolean zzauk;
    private boolean zzaul;

    public zzbt(Context context, zziw zziw, String str, zzaiy zzaiy) {
        this(context, zziw, str, zzaiy, null);
    }

    private zzbt(Context context, zziw zziw, String str, zzaiy zzaiy, zzcs zzcs) {
        this.zzauc = null;
        this.zzaud = null;
        this.zzaue = 0;
        this.zzapr = false;
        this.zzauf = null;
        this.zzaug = -1;
        this.zzauh = -1;
        this.zzauj = true;
        this.zzauk = true;
        this.zzaul = false;
        zzmq.initialize(context);
        if (zzbs.zzeg().zzow() != null) {
            List zzir = zzmq.zzir();
            if (zzaiy.zzdbz != 0) {
                zzir.add(Integer.toString(zzaiy.zzdbz));
            }
            zzbs.zzeg().zzow().zzf(zzir);
        }
        this.zzata = UUID.randomUUID().toString();
        if (!zziw.zzbdb) {
            if (!zziw.zzbdd) {
                this.zzate = new zzbu(context, str, zzaiy.zzcp, this, this);
                this.zzate.setMinimumWidth(zziw.widthPixels);
                this.zzate.setMinimumHeight(zziw.heightPixels);
                this.zzate.setVisibility(4);
                this.zzath = zziw;
                this.zzatb = str;
                this.zzaif = context;
                this.zzatd = zzaiy;
                this.zzatc = new zzcs(new zzaf(this));
                this.zzaui = new zzail(200);
                this.zzats = new SimpleArrayMap();
            }
        }
        this.zzate = null;
        this.zzath = zziw;
        this.zzatb = str;
        this.zzaif = context;
        this.zzatd = zzaiy;
        this.zzatc = new zzcs(new zzaf(this));
        this.zzaui = new zzail(200);
        this.zzats = new SimpleArrayMap();
    }

    private final void zze(boolean z) {
        if (this.zzate != null && this.zzati != null && this.zzati.zzchj != null && this.zzati.zzchj.zzsq() != null) {
            if (!z || this.zzaui.tryAcquire()) {
                if (this.zzati.zzchj.zzsq().zzfr()) {
                    int[] iArr = new int[2];
                    this.zzate.getLocationOnScreen(iArr);
                    zzjk.zzhx();
                    int zzd = zzais.zzd(this.zzaif, iArr[0]);
                    zzjk.zzhx();
                    int zzd2 = zzais.zzd(this.zzaif, iArr[1]);
                    if (!(zzd == this.zzaug && zzd2 == this.zzauh)) {
                        this.zzaug = zzd;
                        this.zzauh = zzd2;
                        this.zzati.zzchj.zzsq().zza(this.zzaug, this.zzauh, z ^ true);
                    }
                }
                if (this.zzate != null) {
                    View findViewById = this.zzate.getRootView().findViewById(16908290);
                    if (findViewById != null) {
                        Rect rect = new Rect();
                        Rect rect2 = new Rect();
                        this.zzate.getGlobalVisibleRect(rect);
                        findViewById.getGlobalVisibleRect(rect2);
                        if (rect.top != rect2.top) {
                            this.zzauj = false;
                        }
                        if (rect.bottom != rect2.bottom) {
                            this.zzauk = false;
                        }
                    }
                }
            }
        }
    }

    public final void onGlobalLayout() {
        zze(false);
    }

    public final void onScrollChanged() {
        zze(true);
        this.zzaul = true;
    }

    public final void zza(HashSet<zzaew> hashSet) {
        this.zzauf = hashSet;
    }

    public final void zzf(boolean z) {
        if (!(this.zzaue != 0 || this.zzati == null || this.zzati.zzchj == null)) {
            this.zzati.zzchj.stopLoading();
        }
        if (this.zzatf != null) {
            this.zzatf.cancel();
        }
        if (this.zzatg != null) {
            this.zzatg.cancel();
        }
        if (z) {
            this.zzati = null;
        }
    }

    public final HashSet<zzaew> zzfd() {
        return this.zzauf;
    }

    public final void zzfe() {
        if (this.zzati != null && this.zzati.zzchj != null) {
            this.zzati.zzchj.destroy();
        }
    }

    public final void zzff() {
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
        r1 = this;
        r0 = r1.zzati;
        if (r0 == 0) goto L_0x0017;
    L_0x0004:
        r0 = r1.zzati;
        r0 = r0.zzcde;
        if (r0 == 0) goto L_0x0017;
    L_0x000a:
        r0 = r1.zzati;	 Catch:{ RemoteException -> 0x0012 }
        r0 = r0.zzcde;	 Catch:{ RemoteException -> 0x0012 }
        r0.destroy();	 Catch:{ RemoteException -> 0x0012 }
        return;
    L_0x0012:
        r0 = "Could not destroy mediation adapter.";
        com.google.android.gms.internal.zzaiw.zzco(r0);
    L_0x0017:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzbt.zzff():void");
    }

    public final boolean zzfg() {
        return this.zzaue == 0;
    }

    public final boolean zzfh() {
        return this.zzaue == 1;
    }

    public final String zzfi() {
        return (this.zzauj && this.zzauk) ? "" : this.zzauj ? this.zzaul ? "top-scrollable" : "top-locked" : this.zzauk ? this.zzaul ? "bottom-scrollable" : "bottom-locked" : "";
    }
}
