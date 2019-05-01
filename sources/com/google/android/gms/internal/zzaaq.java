package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.common.util.zzn;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

final class zzaaq implements Runnable {
    private /* synthetic */ OutputStream zzcol;
    private /* synthetic */ byte[] zzcom;

    zzaaq(zzaap zzaap, OutputStream outputStream, byte[] bArr) {
        this.zzcol = outputStream;
        this.zzcom = bArr;
    }

    public final void run() {
        Closeable dataOutputStream;
        Throwable e;
        Throwable th;
        try {
            dataOutputStream = new DataOutputStream(this.zzcol);
            try {
                dataOutputStream.writeInt(this.zzcom.length);
                dataOutputStream.write(this.zzcom);
                zzn.closeQuietly(dataOutputStream);
            } catch (IOException e2) {
                e = e2;
                try {
                    zzaiw.zzb("Error transporting the ad response", e);
                    zzbs.zzeg().zza(e, "LargeParcelTeleporter.pipeData.1");
                    if (dataOutputStream != null) {
                        zzn.closeQuietly(this.zzcol);
                    } else {
                        zzn.closeQuietly(dataOutputStream);
                    }
                } catch (Throwable th2) {
                    e = th2;
                    if (dataOutputStream == null) {
                        dataOutputStream = this.zzcol;
                    }
                    zzn.closeQuietly(dataOutputStream);
                    throw e;
                }
            }
        } catch (Throwable e3) {
            th = e3;
            dataOutputStream = null;
            e = th;
            zzaiw.zzb("Error transporting the ad response", e);
            zzbs.zzeg().zza(e, "LargeParcelTeleporter.pipeData.1");
            if (dataOutputStream != null) {
                zzn.closeQuietly(dataOutputStream);
            } else {
                zzn.closeQuietly(this.zzcol);
            }
        } catch (Throwable e32) {
            th = e32;
            dataOutputStream = null;
            e = th;
            if (dataOutputStream == null) {
                dataOutputStream = this.zzcol;
            }
            zzn.closeQuietly(dataOutputStream);
            throw e;
        }
    }
}
