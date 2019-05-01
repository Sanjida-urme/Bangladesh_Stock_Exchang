package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

public final class zzld {
    private boolean zzals = false;
    private int zzbcm = -1;
    private int zzbcp = -1;
    private String zzbcq;
    private String zzbcs;
    private final Bundle zzbcu = new Bundle();
    private String zzbcw;
    private boolean zzbcy;
    private final Bundle zzbef = new Bundle();
    private final HashSet<String> zzbek = new HashSet();
    private final HashMap<Class<? extends NetworkExtras>, NetworkExtras> zzbel = new HashMap();
    private final HashSet<String> zzbem = new HashSet();
    private final HashSet<String> zzben = new HashSet();
    private Date zzha;
    private Location zzhe;

    public final void setManualImpressionsEnabled(boolean z) {
        this.zzals = z;
    }

    @Deprecated
    public final void zza(NetworkExtras networkExtras) {
        if (networkExtras instanceof AdMobExtras) {
            zza(AdMobAdapter.class, ((AdMobExtras) networkExtras).getExtras());
        } else {
            this.zzbel.put(networkExtras.getClass(), networkExtras);
        }
    }

    public final void zza(Class<? extends MediationAdapter> cls, Bundle bundle) {
        this.zzbef.putBundle(cls.getName(), bundle);
    }

    public final void zza(Date date) {
        this.zzha = date;
    }

    public final void zzac(String str) {
        this.zzbek.add(str);
    }

    public final void zzad(String str) {
        this.zzbem.add(str);
    }

    public final void zzae(String str) {
        this.zzbem.remove(str);
    }

    public final void zzaf(String str) {
        this.zzbcs = str;
    }

    public final void zzag(String str) {
        this.zzbcq = str;
    }

    public final void zzah(String str) {
        this.zzbcw = str;
    }

    public final void zzai(String str) {
        this.zzben.add(str);
    }

    public final void zzb(Location location) {
        this.zzhe = location;
    }

    public final void zzb(Class<? extends CustomEvent> cls, Bundle bundle) {
        if (this.zzbef.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
            this.zzbef.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        this.zzbef.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter").putBundle(cls.getName(), bundle);
    }

    public final void zzd(String str, String str2) {
        this.zzbcu.putString(str, str2);
    }

    public final void zzi(boolean z) {
        this.zzbcp = z;
    }

    public final void zzj(boolean z) {
        this.zzbcy = z;
    }

    public final void zzr(int i) {
        this.zzbcm = i;
    }
}
