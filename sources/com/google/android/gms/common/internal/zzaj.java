package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Set;

final class zzaj implements ServiceConnection {
    private ComponentName mComponentName;
    private int mState = 2;
    private IBinder zzfwv;
    private final Set<ServiceConnection> zzfyg = new HashSet();
    private boolean zzfyh;
    private final zzah zzfyi;
    private /* synthetic */ zzai zzfyj;

    public zzaj(zzai zzai, zzah zzah) {
        this.zzfyj = zzai;
        this.zzfyi = zzah;
    }

    public final IBinder getBinder() {
        return this.zzfwv;
    }

    public final ComponentName getComponentName() {
        return this.mComponentName;
    }

    public final int getState() {
        return this.mState;
    }

    public final boolean isBound() {
        return this.zzfyh;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.zzfyj.zzfyc) {
            this.zzfyj.mHandler.removeMessages(1, this.zzfyi);
            this.zzfwv = iBinder;
            this.mComponentName = componentName;
            for (ServiceConnection onServiceConnected : this.zzfyg) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.mState = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.zzfyj.zzfyc) {
            this.zzfyj.mHandler.removeMessages(1, this.zzfyi);
            this.zzfwv = null;
            this.mComponentName = componentName;
            for (ServiceConnection onServiceDisconnected : this.zzfyg) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.mState = 2;
        }
    }

    public final void zza(ServiceConnection serviceConnection, String str) {
        this.zzfyj.zzfyd;
        this.zzfyj.mApplicationContext;
        this.zzfyi.zzala();
        this.zzfyg.add(serviceConnection);
    }

    public final boolean zza(ServiceConnection serviceConnection) {
        return this.zzfyg.contains(serviceConnection);
    }

    public final boolean zzalb() {
        return this.zzfyg.isEmpty();
    }

    public final void zzb(ServiceConnection serviceConnection, String str) {
        this.zzfyj.zzfyd;
        this.zzfyj.mApplicationContext;
        this.zzfyg.remove(serviceConnection);
    }

    public final void zzge(java.lang.String r8) {
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
        r7 = this;
        r0 = 3;
        r7.mState = r0;
        r0 = r7.zzfyj;
        r1 = r0.zzfyd;
        r0 = r7.zzfyj;
        r2 = r0.mApplicationContext;
        r0 = r7.zzfyi;
        r4 = r0.zzala();
        r0 = r7.zzfyi;
        r6 = r0.zzakz();
        r3 = r8;
        r5 = r7;
        r8 = r1.zza(r2, r3, r4, r5, r6);
        r7.zzfyh = r8;
        r8 = r7.zzfyh;
        if (r8 == 0) goto L_0x0044;
    L_0x0027:
        r8 = r7.zzfyj;
        r8 = r8.mHandler;
        r0 = 1;
        r1 = r7.zzfyi;
        r8 = r8.obtainMessage(r0, r1);
        r0 = r7.zzfyj;
        r0 = r0.mHandler;
        r1 = r7.zzfyj;
        r1 = r1.zzfyf;
        r0.sendMessageDelayed(r8, r1);
        return;
    L_0x0044:
        r8 = 2;
        r7.mState = r8;
        r8 = r7.zzfyj;	 Catch:{ IllegalArgumentException -> 0x0055 }
        r8.zzfyd;	 Catch:{ IllegalArgumentException -> 0x0055 }
        r8 = r7.zzfyj;	 Catch:{ IllegalArgumentException -> 0x0055 }
        r8 = r8.mApplicationContext;	 Catch:{ IllegalArgumentException -> 0x0055 }
        r8.unbindService(r7);	 Catch:{ IllegalArgumentException -> 0x0055 }
    L_0x0055:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzaj.zzge(java.lang.String):void");
    }

    public final void zzgf(String str) {
        this.zzfyj.mHandler.removeMessages(1, this.zzfyi);
        this.zzfyj.zzfyd;
        this.zzfyj.mApplicationContext.unbindService(this);
        this.zzfyh = false;
        this.mState = 2;
    }
}
