package com.google.android.gms.internal;

import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

public class zzdsr<T_WRAPPER extends zzdss<T_ENGINE>, T_ENGINE> {
    private static final Logger logger = Logger.getLogger(zzdsr.class.getName());
    private static final List<Provider> zzlvt;
    public static final zzdsr<zzdst, Cipher> zzlvu = new zzdsr(new zzdst());
    public static final zzdsr<zzdsx, Mac> zzlvv = new zzdsr(new zzdsx());
    private static zzdsr<zzdsz, Signature> zzlvw = new zzdsr(new zzdsz());
    private static zzdsr<zzdsy, MessageDigest> zzlvx = new zzdsr(new zzdsy());
    public static final zzdsr<zzdsu, KeyAgreement> zzlvy = new zzdsr(new zzdsu());
    public static final zzdsr<zzdsw, KeyPairGenerator> zzlvz = new zzdsr(new zzdsw());
    private static zzdsr<zzdsv, KeyFactory> zzlwa = new zzdsr(new zzdsv());
    private T_WRAPPER zzlwb;
    private List<Provider> zzlwc = zzlvt;
    private boolean zzlwd = true;

    static {
        if (zzdte.zzaiz()) {
            String[] strArr = new String[]{ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL"};
            List arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                Provider provider = Security.getProvider(strArr[i]);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    logger.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", new Object[]{r6}));
                }
            }
            zzlvt = arrayList;
        } else {
            zzlvt = new ArrayList();
        }
    }

    private zzdsr(T_WRAPPER t_wrapper) {
        this.zzlwb = t_wrapper;
    }

    private final boolean zza(java.lang.String r2, java.security.Provider r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/558922244.run(Unknown Source)
*/
        /*
        r1 = this;
        r0 = r1.zzlwb;	 Catch:{ Exception -> 0x0007 }
        r0.zzb(r2, r3);	 Catch:{ Exception -> 0x0007 }
        r2 = 1;
        return r2;
    L_0x0007:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzdsr.zza(java.lang.String, java.security.Provider):boolean");
    }

    public final T_ENGINE zzod(String str) throws GeneralSecurityException {
        for (Provider provider : this.zzlwc) {
            Provider provider2;
            if (zza(str, provider2)) {
                zzdss zzdss = this.zzlwb;
                break;
            }
        }
        if (this.zzlwd) {
            zzdss = this.zzlwb;
            provider2 = null;
            return zzdss.zzb(str, provider2);
        }
        throw new GeneralSecurityException("No good Provider found.");
    }
}
