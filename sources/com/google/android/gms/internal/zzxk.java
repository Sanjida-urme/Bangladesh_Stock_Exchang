package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.widget.PopupWindow;

@zzzb
@TargetApi(19)
public final class zzxk extends zzxh {
    private Object zzcie = new Object();
    private PopupWindow zzcif;
    private boolean zzcig = false;

    zzxk(Context context, zzaev zzaev, zzama zzama, zzxg zzxg) {
        super(context, zzaev, zzama, zzxg);
    }

    private final void zzmz() {
        synchronized (this.zzcie) {
            this.zzcig = true;
            if ((this.mContext instanceof Activity) && ((Activity) this.mContext).isDestroyed()) {
                this.zzcif = null;
            }
            if (this.zzcif != null) {
                if (this.zzcif.isShowing()) {
                    this.zzcif.dismiss();
                }
                this.zzcif = null;
            }
        }
    }

    public final void cancel() {
        zzmz();
        super.cancel();
    }

    protected final void zzmy() {
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
        r8 = this;
        r0 = r8.mContext;
        r0 = r0 instanceof android.app.Activity;
        r1 = 0;
        if (r0 == 0) goto L_0x0010;
    L_0x0007:
        r0 = r8.mContext;
        r0 = (android.app.Activity) r0;
        r0 = r0.getWindow();
        goto L_0x0011;
    L_0x0010:
        r0 = r1;
    L_0x0011:
        if (r0 == 0) goto L_0x0071;
    L_0x0013:
        r2 = r0.getDecorView();
        if (r2 != 0) goto L_0x001a;
    L_0x0019:
        return;
    L_0x001a:
        r2 = r8.mContext;
        r2 = (android.app.Activity) r2;
        r2 = r2.isDestroyed();
        if (r2 == 0) goto L_0x0025;
    L_0x0024:
        return;
    L_0x0025:
        r2 = new android.widget.FrameLayout;
        r3 = r8.mContext;
        r2.<init>(r3);
        r3 = new android.view.ViewGroup$LayoutParams;
        r4 = -1;
        r3.<init>(r4, r4);
        r2.setLayoutParams(r3);
        r3 = r8.zzbwq;
        if (r3 != 0) goto L_0x003a;
    L_0x0039:
        throw r1;
    L_0x003a:
        r3 = (android.view.View) r3;
        r2.addView(r3, r4, r4);
        r3 = r8.zzcie;
        monitor-enter(r3);
        r5 = r8.zzcig;	 Catch:{ all -> 0x006e }
        if (r5 == 0) goto L_0x0048;	 Catch:{ all -> 0x006e }
    L_0x0046:
        monitor-exit(r3);	 Catch:{ all -> 0x006e }
        return;	 Catch:{ all -> 0x006e }
    L_0x0048:
        r5 = new android.widget.PopupWindow;	 Catch:{ all -> 0x006e }
        r6 = 0;	 Catch:{ all -> 0x006e }
        r7 = 1;	 Catch:{ all -> 0x006e }
        r5.<init>(r2, r7, r7, r6);	 Catch:{ all -> 0x006e }
        r8.zzcif = r5;	 Catch:{ all -> 0x006e }
        r2 = r8.zzcif;	 Catch:{ all -> 0x006e }
        r2.setOutsideTouchable(r7);	 Catch:{ all -> 0x006e }
        r2 = r8.zzcif;	 Catch:{ all -> 0x006e }
        r2.setClippingEnabled(r6);	 Catch:{ all -> 0x006e }
        r2 = "Displaying the 1x1 popup off the screen.";	 Catch:{ all -> 0x006e }
        com.google.android.gms.internal.zzaiw.zzbw(r2);	 Catch:{ all -> 0x006e }
        r2 = r8.zzcif;	 Catch:{ Exception -> 0x006a }
        r0 = r0.getDecorView();	 Catch:{ Exception -> 0x006a }
        r2.showAtLocation(r0, r6, r4, r4);	 Catch:{ Exception -> 0x006a }
        goto L_0x006c;
    L_0x006a:
        r8.zzcif = r1;	 Catch:{ all -> 0x006e }
    L_0x006c:
        monitor-exit(r3);	 Catch:{ all -> 0x006e }
        return;	 Catch:{ all -> 0x006e }
    L_0x006e:
        r0 = move-exception;	 Catch:{ all -> 0x006e }
        monitor-exit(r3);	 Catch:{ all -> 0x006e }
        throw r0;
    L_0x0071:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzxk.zzmy():void");
    }

    protected final void zzx(int i) {
        zzmz();
        super.zzx(i);
    }
}
