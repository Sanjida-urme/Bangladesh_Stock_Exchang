package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;

@zzzb
public class zzja {
    private final Object mLock = new Object();
    private zzkj zzbdh;
    private final zzir zzbdi;
    private final zziq zzbdj;
    private final zzlk zzbdk;
    private final zzqn zzbdl;
    private final zzacz zzbdm;
    private final zzwi zzbdn;
    private final zzqo zzbdo;

    @VisibleForTesting
    abstract class zza<T> {
        private /* synthetic */ zzja zzbds;

        zza(zzja zzja) {
            this.zzbds = zzja;
        }

        @Nullable
        protected abstract T zza(zzkj zzkj) throws RemoteException;

        @Nullable
        protected abstract T zzht() throws RemoteException;

        @Nullable
        protected final T zzhu() {
            zzkj zza = this.zzbds.zzhs();
            if (zza == null) {
                zzaiw.zzco("ClientApi class cannot be loaded.");
                return null;
            }
            try {
                return zza(zza);
            } catch (Throwable e) {
                zzaiw.zzc("Cannot invoke local loader using ClientApi class", e);
                return null;
            }
        }

        @Nullable
        protected final T zzhv() {
            try {
                return zzht();
            } catch (Throwable e) {
                zzaiw.zzc("Cannot invoke remote loader", e);
                return null;
            }
        }
    }

    public zzja(zzir zzir, zziq zziq, zzlk zzlk, zzqn zzqn, zzacz zzacz, zzwi zzwi, zzqo zzqo) {
        this.zzbdi = zzir;
        this.zzbdj = zziq;
        this.zzbdk = zzlk;
        this.zzbdl = zzqn;
        this.zzbdm = zzacz;
        this.zzbdn = zzwi;
        this.zzbdo = zzqo;
    }

    @VisibleForTesting
    static <T> T zza(Context context, boolean z, zza<T> zza) {
        T zzhu;
        if (!z) {
            zzjk.zzhx();
            if (!zzais.zzbd(context)) {
                zzaiw.zzbw("Google Play Services is not available");
                z = true;
            }
        }
        zzjk.zzhx();
        int zzav = zzais.zzav(context);
        zzjk.zzhx();
        if (zzav > zzais.zzau(context)) {
            z = true;
        }
        if (z) {
            zzhu = zza.zzhu();
            if (zzhu == null) {
                return zza.zzhv();
            }
        }
        zzhu = zza.zzhv();
        if (zzhu == null) {
            zzhu = zza.zzhu();
        }
        return zzhu;
    }

    private static void zza(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzjk.zzhx().zza(context, null, "gmob-apps", bundle, true);
    }

    @Nullable
    private static zzkj zzhr() {
        try {
            Object newInstance = zzja.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").newInstance();
            if (newInstance instanceof IBinder) {
                return zzkk.asInterface((IBinder) newInstance);
            }
            zzaiw.zzco("ClientApi class is not an instance of IBinder");
            return null;
        } catch (Throwable e) {
            zzaiw.zzc("Failed to instantiate ClientApi class.", e);
            return null;
        }
    }

    @Nullable
    private final zzkj zzhs() {
        zzkj zzkj;
        synchronized (this.mLock) {
            if (this.zzbdh == null) {
                this.zzbdh = zzhr();
            }
            zzkj = this.zzbdh;
        }
        return zzkj;
    }

    public final zzpc zza(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzpc) zza(context, false, new zzjg(this, frameLayout, frameLayout2, context));
    }

    public final zzph zza(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        return (zzph) zza(view.getContext(), false, new zzjh(this, view, hashMap, hashMap2));
    }

    public final zzjw zzb(Context context, String str, zzuc zzuc) {
        return (zzjw) zza(context, false, new zzje(this, context, str, zzuc));
    }

    @Nullable
    public final zzwj zzb(Activity activity) {
        String str = "com.google.android.gms.ads.internal.overlay.useClientJar";
        Intent intent = activity.getIntent();
        boolean z = false;
        if (intent.hasExtra(str)) {
            z = intent.getBooleanExtra(str, false);
        } else {
            zzaiw.m3e("useClientJar flag not found in activity intent extras.");
        }
        return (zzwj) zza((Context) activity, z, new zzjj(this, activity));
    }
}
