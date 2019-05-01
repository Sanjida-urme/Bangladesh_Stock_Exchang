package com.google.android.gms.internal;

import java.io.IOException;

public class zzfen<MessageType extends zzfem<MessageType, BuilderType>, BuilderType extends zzfen<MessageType, BuilderType>> extends zzfdi<MessageType, BuilderType> {
    private final MessageType zzpci;
    protected MessageType zzpcj;
    private boolean zzpck = false;

    protected zzfen(MessageType messageType) {
        this.zzpci = messageType;
        this.zzpcj = (zzfem) messageType.zza(zzfeu.zzpcu, null, null);
    }

    private static void zza(MessageType messageType, MessageType messageType2) {
        Object obj = zzfet.zzpcp;
        messageType.zza(zzfeu.zzpcr, obj, (Object) messageType2);
        messageType.zzpcg = obj.zza(messageType.zzpcg, messageType2.zzpcg);
    }

    private final BuilderType zzd(zzfdy zzfdy, zzfei zzfei) throws IOException {
        zzcvj();
        try {
            this.zzpcj.zza(zzfeu.zzpcs, (Object) zzfdy, (Object) zzfei);
            return this;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzfen zzfen = (zzfen) this.zzpci.zza(zzfeu.zzpcv, null, null);
        if (!this.zzpck) {
            zzfem zzfem = this.zzpcj;
            zzfem.zza(zzfeu.zzpct, null, null);
            zzfem.zzpcg.zzbin();
            this.zzpck = true;
        }
        zzfen.zza(this.zzpcj);
        return zzfen;
    }

    public final boolean isInitialized() {
        return this.zzpcj.zza(zzfeu.zzpcq, Boolean.valueOf(false), null) != null;
    }

    protected final /* synthetic */ zzfdi zza(zzfdh zzfdh) {
        return zza((zzfem) zzfdh);
    }

    public final /* synthetic */ zzfdi zza(zzfdy zzfdy, zzfei zzfei) throws IOException {
        return (zzfen) zzb(zzfdy, zzfei);
    }

    public final BuilderType zza(MessageType messageType) {
        zzcvj();
        zza(this.zzpcj, (zzfem) messageType);
        return this;
    }

    public final /* synthetic */ zzffr zzb(zzfdy zzfdy, zzfei zzfei) throws IOException {
        return zzd(zzfdy, zzfei);
    }

    public final /* synthetic */ zzfdi zzcth() {
        return (zzfen) clone();
    }

    public final /* synthetic */ zzffq zzcvi() {
        return this.zzpci;
    }

    protected final void zzcvj() {
        if (this.zzpck) {
            zzfem zzfem = (zzfem) this.zzpcj.zza(zzfeu.zzpcu, null, null);
            zza(zzfem, this.zzpcj);
            this.zzpcj = zzfem;
            this.zzpck = false;
        }
    }

    public final MessageType zzcvk() {
        if (this.zzpck) {
            return this.zzpcj;
        }
        zzfem zzfem = this.zzpcj;
        zzfem.zza(zzfeu.zzpct, null, null);
        zzfem.zzpcg.zzbin();
        this.zzpck = true;
        return this.zzpcj;
    }

    public final MessageType zzcvl() {
        zzfem zzfem;
        boolean z = true;
        if (!this.zzpck) {
            zzfem = this.zzpcj;
            zzfem.zza(zzfeu.zzpct, null, null);
            zzfem.zzpcg.zzbin();
            this.zzpck = true;
        }
        zzfem = this.zzpcj;
        if (zzfem.zza(zzfeu.zzpcq, Boolean.TRUE, null) == null) {
            z = false;
        }
        if (z) {
            return zzfem;
        }
        throw new zzfgp(zzfem);
    }

    public final /* synthetic */ zzffq zzcvm() {
        if (this.zzpck) {
            return this.zzpcj;
        }
        zzfem zzfem = this.zzpcj;
        zzfem.zza(zzfeu.zzpct, null, null);
        zzfem.zzpcg.zzbin();
        this.zzpck = true;
        return this.zzpcj;
    }

    public final /* synthetic */ zzffq zzcvn() {
        zzfem zzfem;
        boolean z = true;
        if (!this.zzpck) {
            zzfem = this.zzpcj;
            zzfem.zza(zzfeu.zzpct, null, null);
            zzfem.zzpcg.zzbin();
            this.zzpck = true;
        }
        zzfem = this.zzpcj;
        if (zzfem.zza(zzfeu.zzpcq, Boolean.TRUE, null) == null) {
            z = false;
        }
        if (z) {
            return zzfem;
        }
        throw new zzfgp(zzfem);
    }
}
