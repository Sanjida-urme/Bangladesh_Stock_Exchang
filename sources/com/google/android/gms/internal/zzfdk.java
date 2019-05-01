package com.google.android.gms.internal;

public abstract class zzfdk<MessageType extends zzffq> implements zzffu<MessageType> {
    private static final zzfei zzpax = zzfei.zzcva();

    public final /* synthetic */ Object zzc(zzfdy zzfdy, zzfei zzfei) throws zzffe {
        zzffq zzffq = (zzffq) zze(zzfdy, zzfei);
        if (zzffq == null || zzffq.isInitialized()) {
            return zzffq;
        }
        zzfgp zzfgp = zzffq instanceof zzfdh ? new zzfgp((zzfdh) zzffq) : zzffq instanceof zzfdj ? new zzfgp((zzfdj) zzffq) : new zzfgp(zzffq);
        throw zzfgp.zzcwu().zzh(zzffq);
    }
}
