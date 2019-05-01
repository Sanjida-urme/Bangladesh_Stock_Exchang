package com.google.android.gms.common;

import android.util.Log;
import com.google.android.gms.common.internal.zzat;
import com.google.android.gms.common.internal.zzau;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.common.util.zzl;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

abstract class zzg extends zzau {
    private int zzfir;

    protected zzg(byte[] bArr) {
        if (bArr.length != 25) {
            int length = bArr.length;
            boolean z = false;
            String zza = zzl.zza(bArr, 0, bArr.length, false);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(zza).length() + 51);
            stringBuilder.append("Cert hash data has incorrect length (");
            stringBuilder.append(length);
            stringBuilder.append("):\n");
            stringBuilder.append(zza);
            Log.wtf("GoogleCertificates", stringBuilder.toString(), new Exception());
            bArr = Arrays.copyOfRange(bArr, 0, 25);
            if (bArr.length == 25) {
                z = true;
            }
            int length2 = bArr.length;
            StringBuilder stringBuilder2 = new StringBuilder(55);
            stringBuilder2.append("cert hash data has incorrect length. length=");
            stringBuilder2.append(length2);
            zzbq.checkArgument(z, stringBuilder2.toString());
        }
        this.zzfir = Arrays.hashCode(bArr);
    }

    protected static byte[] zzft(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof zzat)) {
            return false;
        }
        try {
            zzat zzat = (zzat) obj;
            if (zzat.zzafq() != hashCode()) {
                return false;
            }
            IObjectWrapper zzafp = zzat.zzafp();
            if (zzafp == null) {
                return false;
            }
            return Arrays.equals(getBytes(), (byte[]) zzn.zzx(zzafp));
        } catch (Throwable e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            return false;
        }
    }

    abstract byte[] getBytes();

    public int hashCode() {
        return this.zzfir;
    }

    public final IObjectWrapper zzafp() {
        return zzn.zzy(getBytes());
    }

    public final int zzafq() {
        return hashCode();
    }
}
