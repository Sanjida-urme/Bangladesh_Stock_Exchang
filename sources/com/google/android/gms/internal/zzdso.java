package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class zzdso {
    private ECPublicKey zzlvn;

    public zzdso(ECPublicKey eCPublicKey) {
        this.zzlvn = eCPublicKey;
    }

    public final zzdsp zza(String str, byte[] bArr, byte[] bArr2, int i, zzdsl zzdsl) throws GeneralSecurityException {
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) zzdsr.zzlvz.zzod("EC");
        keyPairGenerator.initialize(this.zzlvn.getParams());
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        ECPublicKey eCPublicKey = (ECPublicKey) generateKeyPair.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) generateKeyPair.getPrivate();
        zzdsi.zza(this.zzlvn.getW(), this.zzlvn.getParams().getCurve());
        KeyAgreement keyAgreement = (KeyAgreement) zzdsr.zzlvy.zzod("ECDH");
        keyAgreement.init(eCPrivateKey);
        int i2 = 1;
        keyAgreement.doPhase(this.zzlvn, true);
        byte[] generateSecret = keyAgreement.generateSecret();
        generateSecret = zzdte.zzc(zzdsi.zza(eCPublicKey.getParams().getCurve(), zzdsl, eCPublicKey.getW()), generateSecret);
        Mac mac = (Mac) zzdsr.zzlvv.zzod(str);
        if (i > mac.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        Object obj;
        byte[] bArr3;
        int i3;
        if (bArr != null) {
            if (bArr.length != 0) {
                mac.init(new SecretKeySpec(bArr, str));
                bArr = mac.doFinal(generateSecret);
                obj = new byte[i];
                mac.init(new SecretKeySpec(bArr, str));
                bArr3 = new byte[0];
                i3 = 0;
                while (true) {
                    mac.update(bArr3);
                    mac.update(bArr2);
                    mac.update((byte) i2);
                    bArr3 = mac.doFinal();
                    if (bArr3.length + i3 >= i) {
                        System.arraycopy(bArr3, 0, obj, i3, bArr3.length);
                        i3 += bArr3.length;
                        i2++;
                    } else {
                        System.arraycopy(bArr3, 0, obj, i3, i - i3);
                        return new zzdsp(r10, obj);
                    }
                }
            }
        }
        mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
        bArr = mac.doFinal(generateSecret);
        obj = new byte[i];
        mac.init(new SecretKeySpec(bArr, str));
        bArr3 = new byte[0];
        i3 = 0;
        while (true) {
            mac.update(bArr3);
            mac.update(bArr2);
            mac.update((byte) i2);
            bArr3 = mac.doFinal();
            if (bArr3.length + i3 >= i) {
                System.arraycopy(bArr3, 0, obj, i3, i - i3);
                return new zzdsp(r10, obj);
            }
            System.arraycopy(bArr3, 0, obj, i3, bArr3.length);
            i3 += bArr3.length;
            i2++;
        }
    }
}
