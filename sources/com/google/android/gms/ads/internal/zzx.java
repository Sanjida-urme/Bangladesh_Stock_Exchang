package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.location.Location;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.dynamic.zzn;
import com.google.android.gms.internal.zzaeh;
import com.google.android.gms.internal.zzaek;
import com.google.android.gms.internal.zzaeu;
import com.google.android.gms.internal.zzaev;
import com.google.android.gms.internal.zzagr;
import com.google.android.gms.internal.zzaiw;
import com.google.android.gms.internal.zzaiy;
import com.google.android.gms.internal.zzama;
import com.google.android.gms.internal.zzamm;
import com.google.android.gms.internal.zzanp;
import com.google.android.gms.internal.zzfy;
import com.google.android.gms.internal.zzis;
import com.google.android.gms.internal.zziw;
import com.google.android.gms.internal.zzjk;
import com.google.android.gms.internal.zzku;
import com.google.android.gms.internal.zzlw;
import com.google.android.gms.internal.zzuc;
import com.google.android.gms.internal.zzuo;
import com.google.android.gms.internal.zzur;
import com.google.android.gms.internal.zzzb;
import java.lang.ref.WeakReference;
import java.util.List;

@zzzb
public final class zzx extends zzi implements OnGlobalLayoutListener, OnScrollChangedListener {
    private boolean zzals;
    private WeakReference<Object> zzanx = new WeakReference(null);

    public zzx(Context context, zziw zziw, String str, zzuc zzuc, zzaiy zzaiy, zzv zzv) {
        super(context, zziw, str, zzuc, zzaiy, zzv);
    }

    private final boolean zzd(@Nullable zzaeu zzaeu, zzaeu zzaeu2) {
        if (zzaeu2.zzcng) {
            View zze = zzaq.zze(zzaeu2);
            if (zze == null) {
                zzaiw.zzco("Could not get mediation view");
                return false;
            }
            View nextView = this.zzamt.zzate.getNextView();
            if (nextView != null) {
                if (nextView instanceof zzama) {
                    ((zzama) nextView).destroy();
                }
                this.zzamt.zzate.removeView(nextView);
            }
            if (!zzaq.zzf(zzaeu2)) {
                try {
                    if (zzbs.zzfa().zzs(this.zzamt.zzaif)) {
                        new zzfy(this.zzamt.zzaif, zze).zza(new zzaek(this.zzamt.zzaif, this.zzamt.zzatb));
                    }
                    if (zzaeu2.zzcvu != null) {
                        this.zzamt.zzate.setMinimumWidth(zzaeu2.zzcvu.widthPixels);
                        this.zzamt.zzate.setMinimumHeight(zzaeu2.zzcvu.heightPixels);
                    }
                    zzb(zze);
                } catch (Throwable e) {
                    zzbs.zzeg().zza(e, "BannerAdManager.swapViews");
                    zzaiw.zzc("Could not add mediation view to view hierarchy.", e);
                    return false;
                }
            }
        } else if (!(zzaeu2.zzcvu == null || zzaeu2.zzchj == null)) {
            zzaeu2.zzchj.zza(zzanp.zzc(zzaeu2.zzcvu));
            this.zzamt.zzate.removeAllViews();
            this.zzamt.zzate.setMinimumWidth(zzaeu2.zzcvu.widthPixels);
            this.zzamt.zzate.setMinimumHeight(zzaeu2.zzcvu.heightPixels);
            zzama zzama = zzaeu2.zzchj;
            if (zzama == null) {
                throw null;
            }
            zzb((View) zzama);
        }
        if (this.zzamt.zzate.getChildCount() > 1) {
            this.zzamt.zzate.showNext();
        }
        if (zzaeu != null) {
            View nextView2 = this.zzamt.zzate.getNextView();
            if (nextView2 instanceof zzama) {
                ((zzama) nextView2).destroy();
            } else if (nextView2 != null) {
                this.zzamt.zzate.removeView(nextView2);
            }
            this.zzamt.zzff();
        }
        this.zzamt.zzate.setVisibility(0);
        return true;
    }

    @Nullable
    public final zzku getVideoController() {
        zzbq.zzga("getVideoController must be called from the main thread.");
        return (this.zzamt.zzati == null || this.zzamt.zzati.zzchj == null) ? null : this.zzamt.zzati.zzchj.zzrx();
    }

    public final void onGlobalLayout() {
        zzd(this.zzamt.zzati);
    }

    public final void onScrollChanged() {
        zzd(this.zzamt.zzati);
    }

    public final void setManualImpressionsEnabled(boolean z) {
        zzbq.zzga("setManualImpressionsEnabled must be called from the main thread.");
        this.zzals = z;
    }

    public final void showInterstitial() {
        throw new IllegalStateException("Interstitial is NOT supported by BannerAdManager.");
    }

    protected final zzama zza(zzaev zzaev, @Nullable zzw zzw, @Nullable zzaeh zzaeh) throws zzamm {
        if (this.zzamt.zzath.zzbdc == null && this.zzamt.zzath.zzbde) {
            zziw zziw;
            zzbt zzbt = this.zzamt;
            if (zzaev.zzcwe.zzbde) {
                zziw = this.zzamt.zzath;
            } else {
                AdSize adSize;
                String str = zzaev.zzcwe.zzcnj;
                if (str != null) {
                    String[] split = str.split("[xX]");
                    split[0] = split[0].trim();
                    split[1] = split[1].trim();
                    adSize = new AdSize(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
                } else {
                    adSize = this.zzamt.zzath.zzhq();
                }
                zziw = new zziw(this.zzamt.zzaif, adSize);
            }
            zzbt.zzath = zziw;
        }
        return super.zza(zzaev, zzw, zzaeh);
    }

    protected final void zza(@Nullable zzaeu zzaeu, boolean z) {
        super.zza(zzaeu, z);
        if (zzaq.zzf(zzaeu)) {
            zzab zzab = new zzab(this);
            if (zzaeu != null && zzaq.zzf(zzaeu)) {
                Object obj;
                zzama zzama = zzaeu.zzchj;
                if (zzama == null) {
                    obj = null;
                } else if (zzama == null) {
                    throw null;
                } else {
                    obj = (View) zzama;
                }
                if (obj == null) {
                    zzaiw.zzco("AdWebView is null");
                    return;
                }
                try {
                    List list = zzaeu.zzcdd != null ? zzaeu.zzcdd.zzcbq : null;
                    if (list != null) {
                        if (!list.isEmpty()) {
                            zzuo zzly = zzaeu.zzcde != null ? zzaeu.zzcde.zzly() : null;
                            zzur zzlz = zzaeu.zzcde != null ? zzaeu.zzcde.zzlz() : null;
                            if (list.contains("2") && zzly != null) {
                                zzly.zzi(zzn.zzy(obj));
                                if (!zzly.getOverrideImpressionRecording()) {
                                    zzly.recordImpression();
                                }
                                zzama.zzsq().zza("/nativeExpressViewClicked", zzaq.zza(zzly, null, zzab));
                                return;
                            } else if (!list.contains("1") || zzlz == null) {
                                zzaiw.zzco("No matching template id and mapper");
                                return;
                            } else {
                                zzlz.zzi(zzn.zzy(obj));
                                if (!zzlz.getOverrideImpressionRecording()) {
                                    zzlz.recordImpression();
                                }
                                zzama.zzsq().zza("/nativeExpressViewClicked", zzaq.zza(null, zzlz, zzab));
                                return;
                            }
                        }
                    }
                    zzaiw.zzco("No template ids present in mediation response");
                } catch (Throwable e) {
                    zzaiw.zzc("Error occurred while recording impression and registering for clicks", e);
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(@android.support.annotation.Nullable com.google.android.gms.internal.zzaeu r4, com.google.android.gms.internal.zzaeu r5) {
        /*
        r3 = this;
        r0 = super.zza(r4, r5);
        r1 = 0;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = r3.zzamt;
        r0 = r0.zzfg();
        if (r0 == 0) goto L_0x0025;
    L_0x0010:
        r4 = r3.zzd(r4, r5);
        if (r4 != 0) goto L_0x0025;
    L_0x0016:
        r4 = r5.zzcwc;
        if (r4 == 0) goto L_0x0021;
    L_0x001a:
        r4 = r5.zzcwc;
        r5 = com.google.android.gms.internal.zzid.zza.zzb.AD_FAILED_TO_LOAD;
        r4.zza(r5);
    L_0x0021:
        r3.zzi(r1);
        return r1;
    L_0x0025:
        r4 = r5.zzcny;
        r0 = 0;
        if (r4 == 0) goto L_0x0061;
    L_0x002a:
        r3.zzd(r5);
        com.google.android.gms.ads.internal.zzbs.zzez();
        r4 = r3.zzamt;
        r4 = r4.zzate;
        com.google.android.gms.internal.zzakg.zza(r4, r3);
        com.google.android.gms.ads.internal.zzbs.zzez();
        r4 = r3.zzamt;
        r4 = r4.zzate;
        com.google.android.gms.internal.zzakg.zza(r4, r3);
        r4 = r5.zzcvr;
        if (r4 != 0) goto L_0x007e;
    L_0x0045:
        r4 = new com.google.android.gms.ads.internal.zzy;
        r4.<init>(r3);
        r1 = r5.zzchj;
        if (r1 == 0) goto L_0x0055;
    L_0x004e:
        r1 = r5.zzchj;
        r1 = r1.zzsq();
        goto L_0x0056;
    L_0x0055:
        r1 = r0;
    L_0x0056:
        if (r1 == 0) goto L_0x007e;
    L_0x0058:
        r2 = new com.google.android.gms.ads.internal.zzz;
        r2.<init>(r3, r5, r4);
        r1.zza(r2);
        goto L_0x007e;
    L_0x0061:
        r4 = r3.zzamt;
        r4 = r4.zzfh();
        if (r4 == 0) goto L_0x007b;
    L_0x0069:
        r4 = com.google.android.gms.internal.zzmq.zzbmr;
        r2 = com.google.android.gms.ads.internal.zzbs.zzep();
        r4 = r2.zzd(r4);
        r4 = (java.lang.Boolean) r4;
        r4 = r4.booleanValue();
        if (r4 == 0) goto L_0x007e;
    L_0x007b:
        r3.zza(r5, r1);
    L_0x007e:
        r4 = r5.zzchj;
        if (r4 == 0) goto L_0x00a2;
    L_0x0082:
        r4 = r5.zzchj;
        r4 = r4.zzrx();
        r1 = r5.zzchj;
        r1 = r1.zzsq();
        if (r1 == 0) goto L_0x0093;
    L_0x0090:
        r1.zztk();
    L_0x0093:
        r1 = r3.zzamt;
        r1 = r1.zzatu;
        if (r1 == 0) goto L_0x00a2;
    L_0x0099:
        if (r4 == 0) goto L_0x00a2;
    L_0x009b:
        r1 = r3.zzamt;
        r1 = r1.zzatu;
        r4.zzb(r1);
    L_0x00a2:
        r4 = r3.zzamt;
        r4 = r4.zzfg();
        if (r4 == 0) goto L_0x0116;
    L_0x00aa:
        r4 = r5.zzchj;
        if (r4 == 0) goto L_0x012d;
    L_0x00ae:
        r4 = r5.zzcvq;
        if (r4 == 0) goto L_0x00bb;
    L_0x00b2:
        r4 = r3.zzamv;
        r1 = r3.zzamt;
        r1 = r1.zzath;
        r4.zza(r1, r5);
    L_0x00bb:
        r4 = new com.google.android.gms.internal.zzfy;
        r1 = r3.zzamt;
        r1 = r1.zzaif;
        r2 = r5.zzchj;
        if (r2 != 0) goto L_0x00c6;
    L_0x00c5:
        throw r0;
    L_0x00c6:
        r2 = (android.view.View) r2;
        r4.<init>(r1, r2);
        r0 = com.google.android.gms.ads.internal.zzbs.zzfa();
        r1 = r3.zzamt;
        r1 = r1.zzaif;
        r0 = r0.zzs(r1);
        if (r0 == 0) goto L_0x00fb;
    L_0x00d9:
        r0 = r5.zzclo;
        r0 = com.google.android.gms.ads.internal.zza.zza(r0);
        if (r0 == 0) goto L_0x00fb;
    L_0x00e1:
        r0 = r3.zzamt;
        r0 = r0.zzatb;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x00fb;
    L_0x00eb:
        r0 = new com.google.android.gms.internal.zzaek;
        r1 = r3.zzamt;
        r1 = r1.zzaif;
        r2 = r3.zzamt;
        r2 = r2.zzatb;
        r0.<init>(r1, r2);
        r4.zza(r0);
    L_0x00fb:
        r0 = r5.zzfr();
        if (r0 == 0) goto L_0x0107;
    L_0x0101:
        r5 = r5.zzchj;
        r4.zza(r5);
        goto L_0x012d;
    L_0x0107:
        r0 = r5.zzchj;
        r0 = r0.zzsq();
        r1 = new com.google.android.gms.ads.internal.zzaa;
        r1.<init>(r3, r4, r5);
        r0.zza(r1);
        goto L_0x012d;
    L_0x0116:
        r4 = r3.zzamt;
        r4 = r4.zzaud;
        if (r4 == 0) goto L_0x012d;
    L_0x011c:
        r4 = r5.zzcvq;
        if (r4 == 0) goto L_0x012d;
    L_0x0120:
        r4 = r3.zzamv;
        r0 = r3.zzamt;
        r0 = r0.zzath;
        r1 = r3.zzamt;
        r1 = r1.zzaud;
        r4.zza(r0, r5, r1);
    L_0x012d:
        r4 = 1;
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzx.zza(com.google.android.gms.internal.zzaeu, com.google.android.gms.internal.zzaeu):boolean");
    }

    public final boolean zzb(zzis zzis) {
        zzi zzi;
        zzis zzis2 = zzis;
        if (zzis2.zzbca != this.zzals) {
            boolean z;
            String str;
            zzlw zzlw;
            Location location;
            Location location2;
            int i = zzis2.versionCode;
            long j = zzis2.zzbbv;
            Bundle bundle = zzis2.extras;
            int i2 = zzis2.zzbbw;
            List list = zzis2.zzbbx;
            boolean z2 = zzis2.zzbby;
            int i3 = zzis2.zzbbz;
            if (!zzis2.zzbca) {
                if (!zzi.zzals) {
                    z = false;
                    str = zzis2.zzbcb;
                    zzlw = zzis2.zzbcc;
                    location = zzis2.zzbcd;
                    location2 = location;
                    zzis2 = new zzis(i, j, bundle, i2, list, z2, i3, z, str, zzlw, location2, zzis2.zzbce, zzis2.zzbcf, zzis2.zzbcg, zzis2.zzbch, zzis2.zzbci, zzis2.zzbcj, zzis2.zzbck);
                    zzi = this;
                }
            }
            z = true;
            str = zzis2.zzbcb;
            zzlw = zzis2.zzbcc;
            location = zzis2.zzbcd;
            location2 = location;
            zzis2 = new zzis(i, j, bundle, i2, list, z2, i3, z, str, zzlw, location2, zzis2.zzbce, zzis2.zzbcf, zzis2.zzbcg, zzis2.zzbch, zzis2.zzbci, zzis2.zzbcj, zzis2.zzbck);
            zzi = this;
        }
        return super.zzb(zzis2);
    }

    protected final boolean zzbz() {
        boolean z;
        zzbs.zzec();
        if (zzagr.zzd(this.zzamt.zzaif, this.zzamt.zzaif.getPackageName(), "android.permission.INTERNET")) {
            z = true;
        } else {
            zzjk.zzhx().zza(this.zzamt.zzate, this.zzamt.zzath, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            z = false;
        }
        zzbs.zzec();
        if (!zzagr.zzag(this.zzamt.zzaif)) {
            zzjk.zzhx().zza(this.zzamt.zzate, this.zzamt.zzath, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            z = false;
        }
        if (!(z || this.zzamt.zzate == null)) {
            this.zzamt.zzate.setVisibility(0);
        }
        return z;
    }

    final void zzd(@Nullable zzaeu zzaeu) {
        if (zzaeu != null && !zzaeu.zzcvr && this.zzamt.zzate != null && zzbs.zzec().zza(this.zzamt.zzate, this.zzamt.zzaif) && this.zzamt.zzate.getGlobalVisibleRect(new Rect(), null)) {
            if (!(zzaeu == null || zzaeu.zzchj == null || zzaeu.zzchj.zzsq() == null)) {
                zzaeu.zzchj.zzsq().zza(null);
            }
            zza(zzaeu, false);
            zzaeu.zzcvr = true;
        }
    }
}
