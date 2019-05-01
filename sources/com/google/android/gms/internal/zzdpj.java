package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class zzdpj {
    private static final Logger logger = Logger.getLogger(zzdpj.class.getName());

    static {
        try {
            zzdpb.zzblj();
            zzdpp.zzblj();
        } catch (GeneralSecurityException e) {
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 30);
            stringBuilder.append("cannot register key managers: ");
            stringBuilder.append(valueOf);
            logger.logp(Level.SEVERE, "com.google.crypto.tink.hybrid.HybridEncryptFactory", "<clinit>", stringBuilder.toString());
        }
    }

    public static zzdor zza(zzdot zzdot) throws GeneralSecurityException {
        return new zzdpk(zzdpa.zzlqa.zza(zzdot, null));
    }
}
