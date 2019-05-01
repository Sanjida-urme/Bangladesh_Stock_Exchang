package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;

public final class zzcs {
    private static final String[] zzahs = new String[]{"/aclk", "/pcs/click"};
    private String zzaho = "googleads.g.doubleclick.net";
    private String zzahp = "/pagead/ads";
    private String zzahq = "ad.doubleclick.net";
    private String[] zzahr = new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    private zzco zzaht;

    public zzcs(zzco zzco) {
        this.zzaht = zzco;
    }

    private final android.net.Uri zza(android.net.Uri r4, android.content.Context r5, java.lang.String r6, boolean r7, android.view.View r8) throws com.google.android.gms.internal.zzct {
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
        r3 = this;
        r0 = r3.zza(r4);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        if (r0 == 0) goto L_0x001a;	 Catch:{ UnsupportedOperationException -> 0x0104 }
    L_0x0006:
        r1 = r4.toString();	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r2 = "dc_ms=";	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r1 = r1.contains(r2);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        if (r1 == 0) goto L_0x002a;	 Catch:{ UnsupportedOperationException -> 0x0104 }
    L_0x0012:
        r4 = new com.google.android.gms.internal.zzct;	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r5 = "Parameter already exists: dc_ms";	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4.<init>(r5);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        throw r4;	 Catch:{ UnsupportedOperationException -> 0x0104 }
    L_0x001a:
        r1 = "ms";	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r1 = r4.getQueryParameter(r1);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        if (r1 == 0) goto L_0x002a;	 Catch:{ UnsupportedOperationException -> 0x0104 }
    L_0x0022:
        r4 = new com.google.android.gms.internal.zzct;	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r5 = "Query parameter already exists: ms";	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4.<init>(r5);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        throw r4;	 Catch:{ UnsupportedOperationException -> 0x0104 }
    L_0x002a:
        if (r7 == 0) goto L_0x0033;	 Catch:{ UnsupportedOperationException -> 0x0104 }
    L_0x002c:
        r7 = r3.zzaht;	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r5 = r7.zza(r5, r6, r8);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        goto L_0x0039;	 Catch:{ UnsupportedOperationException -> 0x0104 }
    L_0x0033:
        r6 = r3.zzaht;	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r5 = r6.zza(r5);	 Catch:{ UnsupportedOperationException -> 0x0104 }
    L_0x0039:
        r6 = 0;	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r7 = -1;	 Catch:{ UnsupportedOperationException -> 0x0104 }
        if (r0 == 0) goto L_0x00b6;	 Catch:{ UnsupportedOperationException -> 0x0104 }
    L_0x003d:
        r8 = "dc_ms";	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r0 = r4.toString();	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r1 = ";adurl";	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r1 = r0.indexOf(r1);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        if (r1 == r7) goto L_0x0076;	 Catch:{ UnsupportedOperationException -> 0x0104 }
    L_0x004b:
        r4 = new java.lang.StringBuilder;	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r1 = r1 + 1;	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r6 = r0.substring(r6, r1);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4.<init>(r6);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4.append(r8);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r6 = "=";	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4.append(r6);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4.append(r5);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r5 = ";";	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4.append(r5);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r5 = r0.substring(r1);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4.append(r5);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4 = r4.toString();	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4 = android.net.Uri.parse(r4);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        return r4;	 Catch:{ UnsupportedOperationException -> 0x0104 }
    L_0x0076:
        r4 = r4.getEncodedPath();	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r7 = r0.indexOf(r4);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r1 = new java.lang.StringBuilder;	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r2 = r4.length();	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r2 = r2 + r7;	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r6 = r0.substring(r6, r2);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r1.<init>(r6);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r6 = ";";	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r1.append(r6);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r1.append(r8);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r6 = "=";	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r1.append(r6);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r1.append(r5);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r5 = ";";	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r1.append(r5);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4 = r4.length();	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r7 = r7 + r4;	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4 = r0.substring(r7);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r1.append(r4);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4 = r1.toString();	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4 = android.net.Uri.parse(r4);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        return r4;	 Catch:{ UnsupportedOperationException -> 0x0104 }
    L_0x00b6:
        r8 = "ms";	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r0 = r4.toString();	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r1 = "&adurl";	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r1 = r0.indexOf(r1);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        if (r1 != r7) goto L_0x00ca;	 Catch:{ UnsupportedOperationException -> 0x0104 }
    L_0x00c4:
        r1 = "?adurl";	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r1 = r0.indexOf(r1);	 Catch:{ UnsupportedOperationException -> 0x0104 }
    L_0x00ca:
        if (r1 == r7) goto L_0x00f7;	 Catch:{ UnsupportedOperationException -> 0x0104 }
    L_0x00cc:
        r4 = new java.lang.StringBuilder;	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r1 = r1 + 1;	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r6 = r0.substring(r6, r1);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4.<init>(r6);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4.append(r8);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r6 = "=";	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4.append(r6);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4.append(r5);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r5 = "&";	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4.append(r5);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r5 = r0.substring(r1);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4.append(r5);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4 = r4.toString();	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4 = android.net.Uri.parse(r4);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        return r4;	 Catch:{ UnsupportedOperationException -> 0x0104 }
    L_0x00f7:
        r4 = r4.buildUpon();	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4 = r4.appendQueryParameter(r8, r5);	 Catch:{ UnsupportedOperationException -> 0x0104 }
        r4 = r4.build();	 Catch:{ UnsupportedOperationException -> 0x0104 }
        return r4;
    L_0x0104:
        r4 = new com.google.android.gms.internal.zzct;
        r5 = "Provided Uri is not in a valid state";
        r4.<init>(r5);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzcs.zza(android.net.Uri, android.content.Context, java.lang.String, boolean, android.view.View):android.net.Uri");
    }

    private final boolean zza(android.net.Uri r2) {
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
        if (r2 != 0) goto L_0x0008;
    L_0x0002:
        r2 = new java.lang.NullPointerException;
        r2.<init>();
        throw r2;
    L_0x0008:
        r2 = r2.getHost();	 Catch:{ NullPointerException -> 0x0013 }
        r0 = r1.zzahq;	 Catch:{ NullPointerException -> 0x0013 }
        r2 = r2.equals(r0);	 Catch:{ NullPointerException -> 0x0013 }
        return r2;
    L_0x0013:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzcs.zza(android.net.Uri):boolean");
    }

    public final Uri zza(Uri uri, Context context) throws zzct {
        return zza(uri, context, null, false, null);
    }

    public final android.net.Uri zza(android.net.Uri r8, android.content.Context r9, android.view.View r10) throws com.google.android.gms.internal.zzct {
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
        r7 = this;
        r0 = "ai";	 Catch:{ UnsupportedOperationException -> 0x0010 }
        r4 = r8.getQueryParameter(r0);	 Catch:{ UnsupportedOperationException -> 0x0010 }
        r5 = 1;	 Catch:{ UnsupportedOperationException -> 0x0010 }
        r1 = r7;	 Catch:{ UnsupportedOperationException -> 0x0010 }
        r2 = r8;	 Catch:{ UnsupportedOperationException -> 0x0010 }
        r3 = r9;	 Catch:{ UnsupportedOperationException -> 0x0010 }
        r6 = r10;	 Catch:{ UnsupportedOperationException -> 0x0010 }
        r8 = r1.zza(r2, r3, r4, r5, r6);	 Catch:{ UnsupportedOperationException -> 0x0010 }
        return r8;
    L_0x0010:
        r8 = new com.google.android.gms.internal.zzct;
        r9 = "Provided Uri is not in a valid state";
        r8.<init>(r9);
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzcs.zza(android.net.Uri, android.content.Context, android.view.View):android.net.Uri");
    }

    public final void zza(MotionEvent motionEvent) {
        this.zzaht.zza(motionEvent);
    }

    public final zzco zzad() {
        return this.zzaht;
    }

    public final boolean zzb(android.net.Uri r6) {
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
        r5 = this;
        if (r6 != 0) goto L_0x0008;
    L_0x0002:
        r6 = new java.lang.NullPointerException;
        r6.<init>();
        throw r6;
    L_0x0008:
        r0 = 0;
        r6 = r6.getHost();	 Catch:{ NullPointerException -> 0x0020 }
        r1 = r5.zzahr;	 Catch:{ NullPointerException -> 0x0020 }
        r2 = r1.length;	 Catch:{ NullPointerException -> 0x0020 }
        r3 = 0;	 Catch:{ NullPointerException -> 0x0020 }
    L_0x0011:
        if (r3 >= r2) goto L_0x0020;	 Catch:{ NullPointerException -> 0x0020 }
    L_0x0013:
        r4 = r1[r3];	 Catch:{ NullPointerException -> 0x0020 }
        r4 = r6.endsWith(r4);	 Catch:{ NullPointerException -> 0x0020 }
        if (r4 == 0) goto L_0x001d;
    L_0x001b:
        r6 = 1;
        return r6;
    L_0x001d:
        r3 = r3 + 1;
        goto L_0x0011;
    L_0x0020:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzcs.zzb(android.net.Uri):boolean");
    }

    public final boolean zzc(Uri uri) {
        if (zzb(uri)) {
            for (String endsWith : zzahs) {
                if (uri.getPath().endsWith(endsWith)) {
                    return true;
                }
            }
        }
        return false;
    }
}
