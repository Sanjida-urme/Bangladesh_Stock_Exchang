package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.common.util.zzn;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;

@zzzb
public final class zzaap extends zzbej {
    public static final Creator<zzaap> CREATOR = new zzaar();
    private ParcelFileDescriptor zzcoi;
    private Parcelable zzcoj;
    private boolean zzcok;

    public zzaap(ParcelFileDescriptor parcelFileDescriptor) {
        this.zzcoi = parcelFileDescriptor;
        this.zzcoj = null;
        this.zzcok = true;
    }

    public zzaap(zzben zzben) {
        this.zzcoi = null;
        this.zzcoj = zzben;
        this.zzcok = false;
    }

    private final <T> ParcelFileDescriptor zze(byte[] bArr) {
        Throwable e;
        Closeable autoCloseOutputStream;
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            autoCloseOutputStream = new AutoCloseOutputStream(createPipe[1]);
            try {
                new Thread(new zzaaq(this, autoCloseOutputStream, bArr)).start();
                return createPipe[0];
            } catch (IOException e2) {
                e = e2;
                zzaiw.zzb("Error transporting the ad response", e);
                zzbs.zzeg().zza(e, "LargeParcelTeleporter.pipeData.2");
                zzn.closeQuietly(autoCloseOutputStream);
                return null;
            }
        } catch (IOException e3) {
            e = e3;
            autoCloseOutputStream = null;
            zzaiw.zzb("Error transporting the ad response", e);
            zzbs.zzeg().zza(e, "LargeParcelTeleporter.pipeData.2");
            zzn.closeQuietly(autoCloseOutputStream);
            return null;
        }
    }

    private final ParcelFileDescriptor zznh() {
        if (this.zzcoi == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.zzcoj.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                this.zzcoi = zze(marshall);
            } finally {
                obtain.recycle();
            }
        }
        return this.zzcoi;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        zznh();
        int zze = zzbem.zze(parcel);
        zzbem.zza(parcel, 2, this.zzcoi, i, false);
        zzbem.zzai(parcel, zze);
    }

    public final <T extends zzben> T zza(Creator<T> creator) {
        if (this.zzcok) {
            if (this.zzcoi == null) {
                zzaiw.m3e("File descriptor is empty, returning null.");
                return null;
            }
            byte[] autoCloseInputStream = new AutoCloseInputStream(this.zzcoi);
            Closeable dataInputStream = new DataInputStream(autoCloseInputStream);
            Creator creator2;
            try {
                autoCloseInputStream = new byte[dataInputStream.readInt()];
                boolean z = false;
                dataInputStream.readFully(autoCloseInputStream, z, autoCloseInputStream.length);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.unmarshall(autoCloseInputStream, z, autoCloseInputStream.length);
                    obtain.setDataPosition(z);
                    this.zzcoj = (zzben) creator2.createFromParcel(obtain);
                    this.zzcok = z;
                } finally {
                    obtain.recycle();
                }
            } catch (IOException e) {
                creator2 = e;
                autoCloseInputStream = "Could not read from parcel file descriptor";
                zzaiw.zzb(autoCloseInputStream, creator2);
                return null;
            } finally {
                zzn.closeQuietly(dataInputStream);
            }
        }
        return (zzben) this.zzcoj;
    }
}
