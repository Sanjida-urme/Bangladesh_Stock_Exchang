package com.google.android.gms.internal;

import android.webkit.ValueCallback;
import android.webkit.WebView;

final class zzgv implements Runnable {
    final /* synthetic */ zzgt zzayv;
    private ValueCallback<String> zzayw = new zzgw(this);
    final /* synthetic */ zzgn zzayx;
    final /* synthetic */ WebView zzayy;
    final /* synthetic */ boolean zzayz;

    zzgv(zzgt zzgt, zzgn zzgn, WebView webView, boolean z) {
        this.zzayv = zzgt;
        this.zzayx = zzgn;
        this.zzayy = webView;
        this.zzayz = z;
    }

    public final void run() {
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
        r3 = this;
        r0 = r3.zzayy;
        r0 = r0.getSettings();
        r0 = r0.getJavaScriptEnabled();
        if (r0 == 0) goto L_0x001d;
    L_0x000c:
        r0 = r3.zzayy;	 Catch:{ Throwable -> 0x0016 }
        r1 = "(function() { return  {text:document.body.innerText}})();";	 Catch:{ Throwable -> 0x0016 }
        r2 = r3.zzayw;	 Catch:{ Throwable -> 0x0016 }
        r0.evaluateJavascript(r1, r2);	 Catch:{ Throwable -> 0x0016 }
        return;
    L_0x0016:
        r0 = r3.zzayw;
        r1 = "";
        r0.onReceiveValue(r1);
    L_0x001d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzgv.run():void");
    }
}
