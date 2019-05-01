package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.zzc;
import com.google.android.gms.common.zze;
import com.google.android.gms.internal.zzbej;
import com.google.android.gms.internal.zzbem;

public final class zzz extends zzbej {
    public static final Creator<zzz> CREATOR = new zzaa();
    private int version;
    private int zzfxh;
    private int zzfxi;
    String zzfxj;
    IBinder zzfxk;
    Scope[] zzfxl;
    Bundle zzfxm;
    Account zzfxn;
    zzc[] zzfxo;

    public zzz(int i) {
        this.version = 3;
        this.zzfxi = zze.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        this.zzfxh = i;
    }

    zzz(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, zzc[] zzcArr) {
        this.version = i;
        this.zzfxh = i2;
        this.zzfxi = i3;
        if ("com.google.android.gms".equals(str)) {
            this.zzfxj = "com.google.android.gms";
        } else {
            this.zzfxj = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                zzan zzap;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                    zzap = queryLocalInterface instanceof zzan ? (zzan) queryLocalInterface : new zzap(iBinder);
                }
                account2 = zza.zza(zzap);
            }
            this.zzfxn = account2;
        } else {
            this.zzfxk = iBinder;
            this.zzfxn = account;
        }
        this.zzfxl = scopeArr;
        this.zzfxm = bundle;
        this.zzfxo = zzcArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int zze = zzbem.zze(parcel);
        zzbem.zzc(parcel, 1, this.version);
        zzbem.zzc(parcel, 2, this.zzfxh);
        zzbem.zzc(parcel, 3, this.zzfxi);
        zzbem.zza(parcel, 4, this.zzfxj, false);
        zzbem.zza(parcel, 5, this.zzfxk, false);
        zzbem.zza(parcel, 6, this.zzfxl, i, false);
        zzbem.zza(parcel, 7, this.zzfxm, false);
        zzbem.zza(parcel, 8, this.zzfxn, i, false);
        zzbem.zza(parcel, 10, this.zzfxo, i, false);
        zzbem.zzai(parcel, zze);
    }
}
