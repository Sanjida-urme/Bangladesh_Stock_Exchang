package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

@zzzb
public final class zzit {
    private Bundle mExtras;
    private boolean zzals;
    private long zzbcl;
    private int zzbcm;
    private List<String> zzbcn;
    private boolean zzbco;
    private int zzbcp;
    private String zzbcq;
    private zzlw zzbcr;
    private String zzbcs;
    private Bundle zzbct;
    private Bundle zzbcu;
    private List<String> zzbcv;
    private String zzbcw;
    private String zzbcx;
    private boolean zzbcy;
    private Location zzhe;

    public zzit() {
        this.zzbcl = -1;
        this.mExtras = new Bundle();
        this.zzbcm = -1;
        this.zzbcn = new ArrayList();
        this.zzbco = false;
        this.zzbcp = -1;
        this.zzals = false;
        this.zzbcq = null;
        this.zzbcr = null;
        this.zzhe = null;
        this.zzbcs = null;
        this.zzbct = new Bundle();
        this.zzbcu = new Bundle();
        this.zzbcv = new ArrayList();
        this.zzbcw = null;
        this.zzbcx = null;
        this.zzbcy = false;
    }

    public zzit(zzis zzis) {
        this.zzbcl = zzis.zzbbv;
        this.mExtras = zzis.extras;
        this.zzbcm = zzis.zzbbw;
        this.zzbcn = zzis.zzbbx;
        this.zzbco = zzis.zzbby;
        this.zzbcp = zzis.zzbbz;
        this.zzals = zzis.zzbca;
        this.zzbcq = zzis.zzbcb;
        this.zzbcr = zzis.zzbcc;
        this.zzhe = zzis.zzbcd;
        this.zzbcs = zzis.zzbce;
        this.zzbct = zzis.zzbcf;
        this.zzbcu = zzis.zzbcg;
        this.zzbcv = zzis.zzbch;
        this.zzbcw = zzis.zzbci;
        this.zzbcx = zzis.zzbcj;
    }

    public final zzit zza(@Nullable Location location) {
        this.zzhe = null;
        return this;
    }

    public final zzis zzho() {
        long j = this.zzbcl;
        Bundle bundle = this.mExtras;
        int i = this.zzbcm;
        List list = this.zzbcn;
        boolean z = this.zzbco;
        int i2 = this.zzbcp;
        boolean z2 = this.zzals;
        String str = this.zzbcq;
        zzlw zzlw = this.zzbcr;
        Location location = this.zzhe;
        String str2 = this.zzbcs;
        Bundle bundle2 = this.zzbct;
        Bundle bundle3 = this.zzbcu;
        Bundle bundle4 = bundle3;
        Bundle bundle5 = bundle4;
        return new zzis(7, j, bundle, i, list, z, i2, z2, str, zzlw, location, str2, bundle2, bundle5, this.zzbcv, this.zzbcw, this.zzbcx, false);
    }
}
