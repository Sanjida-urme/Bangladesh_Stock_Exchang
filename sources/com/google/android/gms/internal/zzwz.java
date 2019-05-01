package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.common.internal.zzbq;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

@zzzb
public abstract class zzwz implements zzahi<Void>, zzamf {
    protected final Context mContext;
    protected final zzama zzbwq;
    private zzxg zzchu;
    private zzaev zzchv;
    protected zzaad zzchw;
    private Runnable zzchx;
    private Object zzchy = new Object();
    private AtomicBoolean zzchz = new AtomicBoolean(true);

    protected zzwz(Context context, zzaev zzaev, zzama zzama, zzxg zzxg) {
        this.mContext = context;
        this.zzchv = zzaev;
        this.zzchw = this.zzchv.zzcwe;
        this.zzbwq = zzama;
        this.zzchu = zzxg;
    }

    public void cancel() {
        if (this.zzchz.getAndSet(false)) {
            this.zzbwq.stopLoading();
            zzbs.zzee();
            zzagw.zzh(this.zzbwq);
            zzx(-1);
            zzagr.zzczc.removeCallbacks(this.zzchx);
        }
    }

    public final void zza(zzama zzama, boolean z) {
        zzaiw.zzbw("WebView finished loading.");
        int i = 0;
        if (this.zzchz.getAndSet(false)) {
            if (z) {
                i = -2;
            }
            zzx(i);
            zzagr.zzczc.removeCallbacks(this.zzchx);
        }
    }

    protected abstract void zzmw();

    public final /* synthetic */ Object zzmx() {
        zzbq.zzga("Webview render task needs to be called on UI thread.");
        this.zzchx = new zzxa(this);
        zzagr.zzczc.postDelayed(this.zzchx, ((Long) zzbs.zzep().zzd(zzmq.zzblt)).longValue());
        zzmw();
        return null;
    }

    protected void zzx(int i) {
        zzwz zzwz = this;
        int i2 = i;
        if (i2 != -2) {
            zzwz.zzchw = new zzaad(i2, zzwz.zzchw.zzccb);
        }
        zzwz.zzbwq.zzsk();
        zzxg zzxg = zzwz.zzchu;
        zzzz zzzz = zzwz.zzchv.zzcpe;
        zzis zzis = zzzz.zzclo;
        zzama zzama = zzwz.zzbwq;
        List list = zzwz.zzchw.zzcbv;
        List list2 = zzwz.zzchw.zzcbw;
        List list3 = zzwz.zzchw.zzcni;
        int i3 = zzwz.zzchw.orientation;
        long j = zzwz.zzchw.zzccb;
        String str = zzzz.zzclr;
        boolean z = zzwz.zzchw.zzcng;
        long j2 = zzwz.zzchw.zzcnh;
        zziw zziw = zzwz.zzchv.zzath;
        long j3 = j2;
        zzxg zzxg2 = zzxg;
        long j4 = zzwz.zzchw.zzcnf;
        long j5 = zzwz.zzchv.zzcvw;
        long j6 = zzwz.zzchw.zzcnk;
        String str2 = zzwz.zzchw.zzcnl;
        JSONObject jSONObject = zzwz.zzchv.zzcvq;
        zzadw zzadw = zzwz.zzchw.zzcnv;
        List list4 = zzwz.zzchw.zzcnw;
        List list5 = zzwz.zzchw.zzcnx;
        boolean z2 = zzwz.zzchw.zzcny;
        zzaaf zzaaf = zzwz.zzchw.zzcnz;
        List list6 = zzwz.zzchw.zzcby;
        String str3 = zzwz.zzchw.zzcoc;
        zzib zzib = zzwz.zzchv.zzcwc;
        String str4 = str2;
        zzuf zzuf = null;
        zzaeu zzaeu = r41;
        zzxg zzxg3 = zzxg2;
        String str5 = null;
        zztn zztn = null;
        zztp zztp = null;
        long j7 = j3;
        long j8 = j4;
        long j9 = j5;
        long j10 = j6;
        zzaeu zzaeu2 = new zzaeu(zzis, zzama, list, i2, list2, list3, i3, j, str, z, null, zzuf, str5, zztn, zztp, j7, zziw, j8, j9, j10, str4, jSONObject, null, zzadw, list4, list5, z2, zzaaf, null, list6, str3, zzib, zzwz.zzchv.zzcwe.zzapy, zzwz.zzchv.zzcwd);
        zzxg3.zzb(zzaeu);
    }
}
