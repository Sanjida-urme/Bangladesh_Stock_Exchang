package com.google.android.gms.internal;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

final class zzhc {
    private ByteArrayOutputStream zzazn = new ByteArrayOutputStream(4096);
    private Base64OutputStream zzazo = new Base64OutputStream(this.zzazn, 10);

    public final String toString() {
        String byteArrayOutputStream;
        try {
            this.zzazo.close();
        } catch (Throwable e) {
            zzaiw.zzb("HashManager: Unable to convert to Base64.", e);
        }
        try {
            this.zzazn.close();
            byteArrayOutputStream = this.zzazn.toString();
        } catch (Throwable e2) {
            zzaiw.zzb("HashManager: Unable to convert to Base64.", e2);
            byteArrayOutputStream = "";
        } catch (Throwable th) {
            this.zzazn = null;
            this.zzazo = null;
        }
        this.zzazn = null;
        this.zzazo = null;
        return byteArrayOutputStream;
    }

    public final void write(byte[] bArr) throws IOException {
        this.zzazo.write(bArr);
    }
}
