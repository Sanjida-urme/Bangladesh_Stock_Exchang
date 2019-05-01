package com.google.android.gms.internal;

public final class zzdsp {
    private final zzdta zzlvo;
    private final zzdta zzlvp;

    public zzdsp(byte[] bArr, byte[] bArr2) {
        this.zzlvo = zzdta.zzak(bArr);
        this.zzlvp = zzdta.zzak(bArr2);
    }

    public final byte[] zzbou() {
        return this.zzlvo == null ? null : this.zzlvo.getBytes();
    }

    public final byte[] zzbov() {
        return this.zzlvp == null ? null : this.zzlvp.getBytes();
    }
}
