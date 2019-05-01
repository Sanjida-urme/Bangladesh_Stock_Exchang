package com.google.android.gms.internal;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.support.annotation.NonNull;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzg;

@zzzb
public final class zzzx extends zzzt implements zzf, zzg {
    private Context mContext;
    private final Object mLock = new Object();
    private zzaiy zzaov;
    private zzaka<zzzz> zzclh;
    private final zzzr zzcli;
    private zzzy zzcll;

    public zzzx(Context context, zzaiy zzaiy, zzaka<zzzz> zzaka, zzzr zzzr) {
        super(zzaka, zzzr);
        this.mContext = context;
        this.zzaov = zzaiy;
        this.zzclh = zzaka;
        this.zzcli = zzzr;
        this.zzcll = new zzzy(context, ((Boolean) zzbs.zzep().zzd(zzmq.zzbhr)).booleanValue() ? zzbs.zzet().zzqm() : context.getMainLooper(), this, this, this.zzaov.zzdca);
        this.zzcll.zzajy();
    }

    public final void onConnected(Bundle bundle) {
        zzmx();
    }

    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        zzaiw.zzbw("Cannot connect to remote service, fallback to local instance.");
        new zzzw(this.mContext, this.zzclh, this.zzcli).zzmx();
        Bundle bundle = new Bundle();
        bundle.putString("action", "gms_connection_failed_fallback_to_local");
        zzbs.zzec().zzb(this.mContext, this.zzaov.zzcp, "gmob-apps", bundle, true);
    }

    public final void onConnectionSuspended(int i) {
        zzaiw.zzbw("Disconnected from remote ad request service.");
    }

    public final void zzne() {
        synchronized (this.mLock) {
            if (this.zzcll.isConnected() || this.zzcll.isConnecting()) {
                this.zzcll.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }

    public final com.google.android.gms.internal.zzaah zznf() {
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
        r2 = this;
        r0 = r2.mLock;
        monitor-enter(r0);
        r1 = r2.zzcll;	 Catch:{ IllegalStateException -> 0x000d, IllegalStateException -> 0x000d }
        r1 = r1.zzng();	 Catch:{ IllegalStateException -> 0x000d, IllegalStateException -> 0x000d }
        monitor-exit(r0);	 Catch:{ all -> 0x000b }
        return r1;	 Catch:{ all -> 0x000b }
    L_0x000b:
        r1 = move-exception;	 Catch:{ all -> 0x000b }
        goto L_0x0010;	 Catch:{ all -> 0x000b }
    L_0x000d:
        r1 = 0;	 Catch:{ all -> 0x000b }
        monitor-exit(r0);	 Catch:{ all -> 0x000b }
        return r1;	 Catch:{ all -> 0x000b }
    L_0x0010:
        monitor-exit(r0);	 Catch:{ all -> 0x000b }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzzx.zznf():com.google.android.gms.internal.zzaah");
    }
}
