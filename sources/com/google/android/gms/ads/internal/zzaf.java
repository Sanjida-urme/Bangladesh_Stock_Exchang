package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.zzagl;
import com.google.android.gms.internal.zzais;
import com.google.android.gms.internal.zzaiw;
import com.google.android.gms.internal.zzaiy;
import com.google.android.gms.internal.zzco;
import com.google.android.gms.internal.zzcr;
import com.google.android.gms.internal.zzjk;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.internal.zzzb;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@zzzb
public final class zzaf implements zzco, Runnable {
    private Context zzaif;
    private final List<Object[]> zzaof;
    private final AtomicReference<zzco> zzaog;
    private zzaiy zzaoh;
    private CountDownLatch zzaoi;

    private zzaf(Context context, zzaiy zzaiy) {
        this.zzaof = new Vector();
        this.zzaog = new AtomicReference();
        this.zzaoi = new CountDownLatch(1);
        this.zzaif = context;
        this.zzaoh = zzaiy;
        zzjk.zzhx();
        if (zzais.zzqt()) {
            zzagl.zza(this);
        } else {
            run();
        }
    }

    public zzaf(zzbt zzbt) {
        this(zzbt.zzaif, zzbt.zzatd);
    }

    private final boolean zzcx() {
        try {
            this.zzaoi.await();
            return true;
        } catch (Throwable e) {
            zzaiw.zzc("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    private final void zzcy() {
        if (!this.zzaof.isEmpty()) {
            for (Object[] objArr : this.zzaof) {
                if (objArr.length == 1) {
                    ((zzco) this.zzaog.get()).zza((MotionEvent) objArr[0]);
                } else if (objArr.length == 3) {
                    ((zzco) this.zzaog.get()).zza(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            }
            this.zzaof.clear();
        }
    }

    private static Context zze(Context context) {
        if (!((Boolean) zzbs.zzep().zzd(zzmq.zzbgj)).booleanValue()) {
            return context;
        }
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final void run() {
        boolean z = false;
        try {
            boolean z2 = this.zzaoh.zzdcb;
            if (!((Boolean) zzbs.zzep().zzd(zzmq.zzbjv)).booleanValue() && z2) {
                z = true;
            }
            this.zzaog.set(zzcr.zza(this.zzaoh.zzcp, zze(this.zzaif), z));
        } finally {
            this.zzaoi.countDown();
            this.zzaif = null;
            this.zzaoh = null;
        }
    }

    public final String zza(Context context) {
        if (zzcx()) {
            zzco zzco = (zzco) this.zzaog.get();
            if (zzco != null) {
                zzcy();
                return zzco.zza(zze(context));
            }
        }
        return "";
    }

    public final String zza(Context context, String str, View view) {
        if (zzcx()) {
            zzco zzco = (zzco) this.zzaog.get();
            if (zzco != null) {
                zzcy();
                return zzco.zza(zze(context), str, view);
            }
        }
        return "";
    }

    public final void zza(int i, int i2, int i3) {
        zzco zzco = (zzco) this.zzaog.get();
        if (zzco != null) {
            zzcy();
            zzco.zza(i, i2, i3);
            return;
        }
        this.zzaof.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    public final void zza(MotionEvent motionEvent) {
        zzco zzco = (zzco) this.zzaog.get();
        if (zzco != null) {
            zzcy();
            zzco.zza(motionEvent);
            return;
        }
        this.zzaof.add(new Object[]{motionEvent});
    }
}
