package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.internal.zzaeh;
import com.google.android.gms.internal.zzaeu;
import com.google.android.gms.internal.zzaev;
import com.google.android.gms.internal.zzagr;
import com.google.android.gms.internal.zzaiw;
import com.google.android.gms.internal.zzaiy;
import com.google.android.gms.internal.zzama;
import com.google.android.gms.internal.zzamm;
import com.google.android.gms.internal.zzanp;
import com.google.android.gms.internal.zzfb;
import com.google.android.gms.internal.zziw;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.internal.zznd;
import com.google.android.gms.internal.zznj;
import com.google.android.gms.internal.zzuc;
import com.google.android.gms.internal.zzwh;
import com.google.android.gms.internal.zzxf;
import com.google.android.gms.internal.zzzb;

@zzzb
public class zzi extends zzd implements zzae, zzwh {
    private boolean zzane;

    public zzi(Context context, zziw zziw, String str, zzuc zzuc, zzaiy zzaiy, zzv zzv) {
        super(context, zziw, str, zzuc, zzaiy, zzv);
    }

    protected zzama zza(zzaev zzaev, @Nullable zzw zzw, @Nullable zzaeh zzaeh) throws zzamm {
        zzaev zzaev2 = zzaev;
        View nextView = this.zzamt.zzate.getNextView();
        if (nextView instanceof zzama) {
            ((zzama) nextView).destroy();
        }
        if (nextView != null) {
            r12.zzamt.zzate.removeView(nextView);
        }
        zzama zza = zzbs.zzed().zza(r12.zzamt.zzaif, zzanp.zzc(r12.zzamt.zzath), r12.zzamt.zzath.zzbda, false, false, r12.zzamt.zzatc, r12.zzamt.zzatd, r12.zzamo, r12, r12.zzamw, zzaev2.zzcwc);
        if (r12.zzamt.zzath.zzbdc == null) {
            if (zza == null) {
                throw null;
            }
            zzb((View) zza);
        }
        zza.zzsq().zza(r12, r12, r12, r12, false, null, zzw, r12, zzaeh);
        zza(zza);
        zza.zzcu(zzaev2.zzcpe.zzcmb);
        return zza;
    }

    public final void zza(int i, int i2, int i3, int i4) {
        zzbr();
    }

    protected void zza(zzaev zzaev, zznd zznd) {
        if (zzaev.errorCode != -2) {
            zzagr.zzczc.post(new zzk(this, zzaev));
            return;
        }
        if (zzaev.zzath != null) {
            this.zzamt.zzath = zzaev.zzath;
        }
        if (!zzaev.zzcwe.zzcng || zzaev.zzcwe.zzbdf) {
            zzagr.zzczc.post(new zzl(this, zzaev, this.zzamw.zzans.zza(this.zzamt.zzaif, this.zzamt.zzatd, zzaev.zzcwe), zznd));
            return;
        }
        this.zzamt.zzaue = 0;
        zzbt zzbt = this.zzamt;
        zzbs.zzeb();
        zzbt.zzatg = zzxf.zza(this.zzamt.zzaif, this, zzaev, this.zzamt.zzatc, null, this.zzanb, this, zznd);
    }

    protected final void zza(zzama zzama) {
        zzama.zza("/trackActiveViewUnit", new zzj(this));
    }

    public final void zza(zznj zznj) {
        zzbq.zzga("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzamt.zzaty = zznj;
    }

    protected boolean zza(@android.support.annotation.Nullable com.google.android.gms.internal.zzaeu r3, com.google.android.gms.internal.zzaeu r4) {
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
        r0 = r2.zzamt;
        r0 = r0.zzfg();
        if (r0 == 0) goto L_0x001b;
    L_0x0008:
        r0 = r2.zzamt;
        r0 = r0.zzate;
        if (r0 == 0) goto L_0x001b;
    L_0x000e:
        r0 = r2.zzamt;
        r0 = r0.zzate;
        r0 = r0.zzfj();
        r1 = r4.zzcnl;
        r0.zzcj(r1);
    L_0x001b:
        r0 = r4.zzchj;	 Catch:{ RuntimeException -> 0x0065 }
        if (r0 == 0) goto L_0x006a;	 Catch:{ RuntimeException -> 0x0065 }
    L_0x001f:
        r0 = r4.zzcng;	 Catch:{ RuntimeException -> 0x0065 }
        if (r0 != 0) goto L_0x006a;	 Catch:{ RuntimeException -> 0x0065 }
    L_0x0023:
        r0 = r4.zzcwd;	 Catch:{ RuntimeException -> 0x0065 }
        if (r0 == 0) goto L_0x006a;	 Catch:{ RuntimeException -> 0x0065 }
    L_0x0027:
        r0 = com.google.android.gms.internal.zzmq.zzbqb;	 Catch:{ RuntimeException -> 0x0065 }
        r1 = com.google.android.gms.ads.internal.zzbs.zzep();	 Catch:{ RuntimeException -> 0x0065 }
        r0 = r1.zzd(r0);	 Catch:{ RuntimeException -> 0x0065 }
        r0 = (java.lang.Boolean) r0;	 Catch:{ RuntimeException -> 0x0065 }
        r0 = r0.booleanValue();	 Catch:{ RuntimeException -> 0x0065 }
        if (r0 == 0) goto L_0x006a;	 Catch:{ RuntimeException -> 0x0065 }
    L_0x0039:
        r0 = r4.zzclo;	 Catch:{ RuntimeException -> 0x0065 }
        r0 = r0.zzbcj;	 Catch:{ RuntimeException -> 0x0065 }
        if (r0 == 0) goto L_0x004a;	 Catch:{ RuntimeException -> 0x0065 }
    L_0x003f:
        r1 = "com.google.ads.mediation.AbstractAdViewAdapter";	 Catch:{ RuntimeException -> 0x0065 }
        r0 = r1.equals(r0);	 Catch:{ RuntimeException -> 0x0065 }
        if (r0 == 0) goto L_0x0048;	 Catch:{ RuntimeException -> 0x0065 }
    L_0x0047:
        goto L_0x004a;	 Catch:{ RuntimeException -> 0x0065 }
    L_0x0048:
        r0 = 0;	 Catch:{ RuntimeException -> 0x0065 }
        goto L_0x004b;	 Catch:{ RuntimeException -> 0x0065 }
    L_0x004a:
        r0 = 1;	 Catch:{ RuntimeException -> 0x0065 }
    L_0x004b:
        if (r0 == 0) goto L_0x006a;	 Catch:{ RuntimeException -> 0x0065 }
    L_0x004d:
        r0 = r4.zzclo;	 Catch:{ RuntimeException -> 0x0065 }
        r0 = r0.extras;	 Catch:{ RuntimeException -> 0x0065 }
        r1 = "sdk_less_server_data";	 Catch:{ RuntimeException -> 0x0065 }
        r0 = r0.containsKey(r1);	 Catch:{ RuntimeException -> 0x0065 }
        if (r0 != 0) goto L_0x006a;
    L_0x0059:
        r0 = r4.zzchj;	 Catch:{ Throwable -> 0x005f }
        r0.zztc();	 Catch:{ Throwable -> 0x005f }
        goto L_0x006a;
    L_0x005f:
        r0 = "Could not render test Ad label.";	 Catch:{ RuntimeException -> 0x0065 }
        com.google.android.gms.internal.zzafj.m5v(r0);	 Catch:{ RuntimeException -> 0x0065 }
        goto L_0x006a;
    L_0x0065:
        r0 = "Could not render test AdLabel.";
        com.google.android.gms.internal.zzafj.m5v(r0);
    L_0x006a:
        r3 = super.zza(r3, r4);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzi.zza(com.google.android.gms.internal.zzaeu, com.google.android.gms.internal.zzaeu):boolean");
    }

    final void zzb(zzama zzama) {
        if (this.zzamt.zzati != null) {
            zzfb zzfb = this.zzamv;
            zziw zziw = this.zzamt.zzath;
            zzaeu zzaeu = this.zzamt.zzati;
            if (zzama == null) {
                throw null;
            }
            zzfb.zza(zziw, zzaeu, (View) zzama, zzama);
            this.zzane = false;
            return;
        }
        this.zzane = true;
        zzaiw.zzco("Request to enable ActiveView before adState is available.");
    }

    protected void zzbs() {
        super.zzbs();
        if (this.zzane) {
            if (((Boolean) zzbs.zzep().zzd(zzmq.zzbnd)).booleanValue()) {
                zzb(this.zzamt.zzati.zzchj);
            }
        }
    }

    public final void zzc(View view) {
        this.zzamt.zzaud = view;
        zzb(new zzaeu(this.zzamt.zzatj, null, null, null, null, null, null, null));
    }

    public final void zzcm() {
        onAdClicked();
    }

    public final void zzcn() {
        recordImpression();
        zzbo();
    }

    public final void zzco() {
        zzbp();
    }
}
