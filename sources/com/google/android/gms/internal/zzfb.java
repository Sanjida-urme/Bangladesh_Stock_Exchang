package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import com.google.android.gms.ads.internal.js.zzo;
import com.google.android.gms.ads.internal.zzbs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

@zzzb
public final class zzfb implements zzfj {
    private final Context mApplicationContext;
    private final Object mLock = new Object();
    private final zzaiy zzaov;
    private final WeakHashMap<zzaeu, zzfc> zzauv = new WeakHashMap();
    private final ArrayList<zzfc> zzauw = new ArrayList();
    private final zzo zzaux;

    public zzfb(Context context, zzaiy zzaiy) {
        this.mApplicationContext = context.getApplicationContext();
        this.zzaov = zzaiy;
        this.zzaux = new zzo(context.getApplicationContext(), zzaiy, (String) zzbs.zzep().zzd(zzmq.zzbfy));
    }

    private final boolean zzg(zzaeu zzaeu) {
        boolean z;
        synchronized (this.mLock) {
            zzfc zzfc = (zzfc) this.zzauv.get(zzaeu);
            z = zzfc != null && zzfc.zzfw();
        }
        return z;
    }

    public final void zza(zzfc zzfc) {
        synchronized (this.mLock) {
            if (!zzfc.zzfw()) {
                this.zzauw.remove(zzfc);
                Iterator it = this.zzauv.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Entry) it.next()).getValue() == zzfc) {
                        it.remove();
                    }
                }
            }
        }
    }

    public final void zza(zziw zziw, zzaeu zzaeu) {
        zzama zzama = zzaeu.zzchj;
        if (zzama == null) {
            throw null;
        }
        zza(zziw, zzaeu, (View) zzama);
    }

    public final void zza(zziw zziw, zzaeu zzaeu, View view) {
        zza(zziw, zzaeu, new zzfi(view, zzaeu), null);
    }

    public final void zza(zziw zziw, zzaeu zzaeu, View view, zzama zzama) {
        zza(zziw, zzaeu, new zzfi(view, zzaeu), zzama);
    }

    public final void zza(zziw zziw, zzaeu zzaeu, zzgm zzgm, @Nullable zzama zzama) {
        synchronized (this.mLock) {
            zzfc zzfc;
            if (zzg(zzaeu)) {
                zzfc = (zzfc) this.zzauv.get(zzaeu);
            } else {
                zzfc zzfc2 = new zzfc(this.mApplicationContext, zziw, zzaeu, this.zzaov, zzgm);
                zzfc2.zza((zzfj) this);
                this.zzauv.put(zzaeu, zzfc2);
                this.zzauw.add(zzfc2);
                zzfc = zzfc2;
            }
            zzfc.zza(zzama != null ? new zzfk(zzfc, zzama) : new zzfo(zzfc, this.zzaux, this.mApplicationContext));
        }
    }

    public final void zzh(zzaeu zzaeu) {
        synchronized (this.mLock) {
            zzfc zzfc = (zzfc) this.zzauv.get(zzaeu);
            if (zzfc != null) {
                zzfc.zzfu();
            }
        }
    }

    public final void zzi(zzaeu zzaeu) {
        synchronized (this.mLock) {
            zzfc zzfc = (zzfc) this.zzauv.get(zzaeu);
            if (zzfc != null) {
                zzfc.stop();
            }
        }
    }

    public final void zzj(zzaeu zzaeu) {
        synchronized (this.mLock) {
            zzfc zzfc = (zzfc) this.zzauv.get(zzaeu);
            if (zzfc != null) {
                zzfc.pause();
            }
        }
    }

    public final void zzk(zzaeu zzaeu) {
        synchronized (this.mLock) {
            zzfc zzfc = (zzfc) this.zzauv.get(zzaeu);
            if (zzfc != null) {
                zzfc.resume();
            }
        }
    }
}
