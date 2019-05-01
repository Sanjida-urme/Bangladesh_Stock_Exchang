package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdrk.zzb;
import java.security.GeneralSecurityException;

public final class zzdpf implements zzdos<zzdoo> {
    zzdpf() {
    }

    private static com.google.android.gms.internal.zzdoo zzd(com.google.android.gms.internal.zzfdp r1) throws java.security.GeneralSecurityException {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/558922244.run(Unknown Source)
*/
        /*
        r1 = com.google.android.gms.internal.zzdqg.zzq(r1);	 Catch:{ zzffe -> 0x0012 }
        r0 = new com.google.android.gms.internal.zzdrz;	 Catch:{ zzffe -> 0x0012 }
        r1 = r1.zzblu();	 Catch:{ zzffe -> 0x0012 }
        r1 = r1.toByteArray();	 Catch:{ zzffe -> 0x0012 }
        r0.<init>(r1);	 Catch:{ zzffe -> 0x0012 }
        return r0;
    L_0x0012:
        r1 = new java.security.GeneralSecurityException;
        r0 = "expected AesGcmKey proto";
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzdpf.zzd(com.google.android.gms.internal.zzfdp):com.google.android.gms.internal.zzdoo");
    }

    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    public final /* synthetic */ Object zza(zzfdp zzfdp) throws GeneralSecurityException {
        return zzd(zzfdp);
    }

    public final /* synthetic */ Object zza(zzffq zzffq) throws GeneralSecurityException {
        if (zzffq instanceof zzdqg) {
            zzdqg zzdqg = (zzdqg) zzffq;
            zzdte.zzt(zzdqg.getVersion(), 0);
            zzdte.zzgd(zzdqg.zzblu().size());
            return new zzdrz(zzdqg.zzblu().toByteArray());
        }
        throw new GeneralSecurityException("expected AesGcmKey proto");
    }

    public final zzffq zzb(zzfdp zzfdp) throws GeneralSecurityException {
        try {
            return zzb(zzdqi.zzs(zzfdp));
        } catch (Throwable e) {
            throw new GeneralSecurityException("expected serialized AesGcmKeyFormat proto", e);
        }
    }

    public final zzffq zzb(zzffq zzffq) throws GeneralSecurityException {
        if (zzffq instanceof zzdqi) {
            zzdqi zzdqi = (zzdqi) zzffq;
            zzdte.zzgd(zzdqi.getKeySize());
            return zzdqg.zzbmj().zzr(zzfdp.zzay(zzdtd.zzgc(zzdqi.getKeySize()))).zzb(zzdqi.zzbml()).zzfm(0).zzcvl();
        }
        throw new GeneralSecurityException("expected AesGcmKeyFormat proto");
    }

    public final zzdrk zzc(zzfdp zzfdp) throws GeneralSecurityException {
        return (zzdrk) zzdrk.zzbnw().zzob("type.googleapis.com/google.crypto.tink.AesGcmKey").zzaa(((zzdqg) zzb(zzfdp)).toByteString()).zzb(zzb.SYMMETRIC).zzcvl();
    }
}
