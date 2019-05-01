package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

public final class zzdsn implements zzdor {
    private static final byte[] zzlvh = new byte[0];
    private final zzdso zzlvi;
    private final String zzlvj;
    private final byte[] zzlvk;
    private final zzdsl zzlvl;
    private final zzdsm zzlvm;

    public zzdsn(ECPublicKey eCPublicKey, byte[] bArr, String str, zzdsl zzdsl, zzdsm zzdsm) throws GeneralSecurityException {
        zzdsi.zza(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.zzlvi = new zzdso(eCPublicKey);
        this.zzlvk = bArr;
        this.zzlvj = str;
        this.zzlvl = zzdsl;
        this.zzlvm = zzdsm;
    }

    public final byte[] zzd(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzdsp zza = this.zzlvi.zza(this.zzlvj, this.zzlvk, bArr2, this.zzlvm.zzbll(), this.zzlvl);
        bArr = this.zzlvm.zzad(zza.zzbov()).zzd(bArr, zzlvh);
        bArr2 = zza.zzbou();
        return ByteBuffer.allocate(bArr2.length + bArr.length).put(bArr2).put(bArr).array();
    }
}
