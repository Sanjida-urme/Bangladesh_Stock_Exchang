package com.google.android.gms.internal;

import android.content.DialogInterface.OnClickListener;

final class zzwa implements OnClickListener {
    private /* synthetic */ String zzcfm;
    private /* synthetic */ String zzcfn;
    private /* synthetic */ zzvz zzcfo;

    zzwa(zzvz zzvz, String str, String str2) {
        this.zzcfo = zzvz;
        this.zzcfm = str;
        this.zzcfn = str2;
    }

    public final void onClick(android.content.DialogInterface r3, int r4) {
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
        r3 = r2.zzcfo;
        r3 = r3.mContext;
        r4 = "download";
        r3 = r3.getSystemService(r4);
        r3 = (android.app.DownloadManager) r3;
        r4 = r2.zzcfm;	 Catch:{ IllegalStateException -> 0x002b }
        r0 = r2.zzcfn;	 Catch:{ IllegalStateException -> 0x002b }
        r1 = new android.app.DownloadManager$Request;	 Catch:{ IllegalStateException -> 0x002b }
        r4 = android.net.Uri.parse(r4);	 Catch:{ IllegalStateException -> 0x002b }
        r1.<init>(r4);	 Catch:{ IllegalStateException -> 0x002b }
        r4 = android.os.Environment.DIRECTORY_PICTURES;	 Catch:{ IllegalStateException -> 0x002b }
        r1.setDestinationInExternalPublicDir(r4, r0);	 Catch:{ IllegalStateException -> 0x002b }
        r4 = com.google.android.gms.ads.internal.zzbs.zzee();	 Catch:{ IllegalStateException -> 0x002b }
        r4.zza(r1);	 Catch:{ IllegalStateException -> 0x002b }
        r3.enqueue(r1);	 Catch:{ IllegalStateException -> 0x002b }
        return;
    L_0x002b:
        r3 = r2.zzcfo;
        r4 = "Could not store picture.";
        r3.zzbl(r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzwa.onClick(android.content.DialogInterface, int):void");
    }
}
