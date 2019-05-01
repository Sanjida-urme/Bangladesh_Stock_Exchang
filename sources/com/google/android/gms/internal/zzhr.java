package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import java.io.InputStream;

@zzzb
public final class zzhr extends zzbej {
    public static final Creator<zzhr> CREATOR = new zzhs();
    @Nullable
    private ParcelFileDescriptor zzbaf;

    public zzhr() {
        this(null);
    }

    public zzhr(@Nullable ParcelFileDescriptor parcelFileDescriptor) {
        this.zzbaf = parcelFileDescriptor;
    }

    private synchronized ParcelFileDescriptor zzhe() {
        return this.zzbaf;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int zze = zzbem.zze(parcel);
        zzbem.zza(parcel, 2, zzhe(), i, false);
        zzbem.zzai(parcel, zze);
    }

    public final synchronized boolean zzhc() {
        return this.zzbaf != null;
    }

    @Nullable
    public final synchronized InputStream zzhd() {
        if (this.zzbaf == null) {
            return null;
        }
        InputStream autoCloseInputStream = new AutoCloseInputStream(this.zzbaf);
        this.zzbaf = null;
        return autoCloseInputStream;
    }
}
