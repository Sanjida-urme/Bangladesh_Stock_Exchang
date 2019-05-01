package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.C0231R;
import com.google.android.gms.ads.AdSize;

@zzzb
public final class zziz {
    private final String zzaou;
    private final AdSize[] zzbdg;

    public zziz(Context context, AttributeSet attributeSet) {
        AdSize[] zzab;
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C0231R.styleable.AdsAttrs);
        Object string = obtainAttributes.getString(C0231R.styleable.AdsAttrs_adSize);
        Object string2 = obtainAttributes.getString(C0231R.styleable.AdsAttrs_adSizes);
        int isEmpty = TextUtils.isEmpty(string) ^ 1;
        int isEmpty2 = TextUtils.isEmpty(string2) ^ 1;
        if (isEmpty != 0 && isEmpty2 == 0) {
            zzab = zzab(string);
        } else if (isEmpty == 0 && isEmpty2 != 0) {
            zzab = zzab(string2);
        } else if (isEmpty != 0) {
            throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
        } else {
            throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
        }
        this.zzbdg = zzab;
        this.zzaou = obtainAttributes.getString(C0231R.styleable.AdsAttrs_adUnitId);
        if (TextUtils.isEmpty(this.zzaou)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    private static com.google.android.gms.ads.AdSize[] zzab(java.lang.String r10) {
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
        r0 = "\\s*,\\s*";
        r0 = r10.split(r0);
        r1 = r0.length;
        r1 = new com.google.android.gms.ads.AdSize[r1];
        r2 = 0;
        r3 = 0;
    L_0x000b:
        r4 = r0.length;
        if (r3 >= r4) goto L_0x0114;
    L_0x000e:
        r4 = r0[r3];
        r4 = r4.trim();
        r5 = "^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$";
        r5 = r4.matches(r5);
        if (r5 == 0) goto L_0x007e;
    L_0x001c:
        r5 = "[xX]";
        r5 = r4.split(r5);
        r6 = r5[r2];
        r6 = r6.trim();
        r5[r2] = r6;
        r6 = 1;
        r7 = r5[r6];
        r7 = r7.trim();
        r5[r6] = r7;
        r7 = "FULL_WIDTH";	 Catch:{ NumberFormatException -> 0x0061 }
        r8 = r5[r2];	 Catch:{ NumberFormatException -> 0x0061 }
        r7 = r7.equals(r8);	 Catch:{ NumberFormatException -> 0x0061 }
        if (r7 == 0) goto L_0x003f;	 Catch:{ NumberFormatException -> 0x0061 }
    L_0x003d:
        r7 = -1;	 Catch:{ NumberFormatException -> 0x0061 }
        goto L_0x0045;	 Catch:{ NumberFormatException -> 0x0061 }
    L_0x003f:
        r7 = r5[r2];	 Catch:{ NumberFormatException -> 0x0061 }
        r7 = java.lang.Integer.parseInt(r7);	 Catch:{ NumberFormatException -> 0x0061 }
    L_0x0045:
        r8 = "AUTO_HEIGHT";	 Catch:{ NumberFormatException -> 0x0061 }
        r9 = r5[r6];	 Catch:{ NumberFormatException -> 0x0061 }
        r8 = r8.equals(r9);	 Catch:{ NumberFormatException -> 0x0061 }
        if (r8 == 0) goto L_0x0051;	 Catch:{ NumberFormatException -> 0x0061 }
    L_0x004f:
        r4 = -2;	 Catch:{ NumberFormatException -> 0x0061 }
        goto L_0x0058;	 Catch:{ NumberFormatException -> 0x0061 }
    L_0x0051:
        r5 = r5[r6];	 Catch:{ NumberFormatException -> 0x0061 }
        r5 = java.lang.Integer.parseInt(r5);	 Catch:{ NumberFormatException -> 0x0061 }
        r4 = r5;
    L_0x0058:
        r5 = new com.google.android.gms.ads.AdSize;
        r5.<init>(r7, r4);
        r1[r3] = r5;
        goto L_0x00f3;
    L_0x0061:
        r10 = new java.lang.IllegalArgumentException;
        r0 = "Could not parse XML attribute \"adSize\": ";
        r1 = java.lang.String.valueOf(r4);
        r2 = r1.length();
        if (r2 == 0) goto L_0x0074;
    L_0x006f:
        r0 = r0.concat(r1);
        goto L_0x007a;
    L_0x0074:
        r1 = new java.lang.String;
        r1.<init>(r0);
        r0 = r1;
    L_0x007a:
        r10.<init>(r0);
        throw r10;
    L_0x007e:
        r5 = "BANNER";
        r5 = r5.equals(r4);
        if (r5 == 0) goto L_0x008c;
    L_0x0086:
        r4 = com.google.android.gms.ads.AdSize.BANNER;
        r1[r3] = r4;
        goto L_0x00f3;
    L_0x008c:
        r5 = "LARGE_BANNER";
        r5 = r5.equals(r4);
        if (r5 == 0) goto L_0x0099;
    L_0x0094:
        r4 = com.google.android.gms.ads.AdSize.LARGE_BANNER;
        r1[r3] = r4;
        goto L_0x00f3;
    L_0x0099:
        r5 = "FULL_BANNER";
        r5 = r5.equals(r4);
        if (r5 == 0) goto L_0x00a6;
    L_0x00a1:
        r4 = com.google.android.gms.ads.AdSize.FULL_BANNER;
        r1[r3] = r4;
        goto L_0x00f3;
    L_0x00a6:
        r5 = "LEADERBOARD";
        r5 = r5.equals(r4);
        if (r5 == 0) goto L_0x00b3;
    L_0x00ae:
        r4 = com.google.android.gms.ads.AdSize.LEADERBOARD;
        r1[r3] = r4;
        goto L_0x00f3;
    L_0x00b3:
        r5 = "MEDIUM_RECTANGLE";
        r5 = r5.equals(r4);
        if (r5 == 0) goto L_0x00c0;
    L_0x00bb:
        r4 = com.google.android.gms.ads.AdSize.MEDIUM_RECTANGLE;
        r1[r3] = r4;
        goto L_0x00f3;
    L_0x00c0:
        r5 = "SMART_BANNER";
        r5 = r5.equals(r4);
        if (r5 == 0) goto L_0x00cd;
    L_0x00c8:
        r4 = com.google.android.gms.ads.AdSize.SMART_BANNER;
        r1[r3] = r4;
        goto L_0x00f3;
    L_0x00cd:
        r5 = "WIDE_SKYSCRAPER";
        r5 = r5.equals(r4);
        if (r5 == 0) goto L_0x00da;
    L_0x00d5:
        r4 = com.google.android.gms.ads.AdSize.WIDE_SKYSCRAPER;
        r1[r3] = r4;
        goto L_0x00f3;
    L_0x00da:
        r5 = "FLUID";
        r5 = r5.equals(r4);
        if (r5 == 0) goto L_0x00e7;
    L_0x00e2:
        r4 = com.google.android.gms.ads.AdSize.FLUID;
        r1[r3] = r4;
        goto L_0x00f3;
    L_0x00e7:
        r5 = "ICON";
        r5 = r5.equals(r4);
        if (r5 == 0) goto L_0x00f7;
    L_0x00ef:
        r4 = com.google.android.gms.ads.AdSize.zzakv;
        r1[r3] = r4;
    L_0x00f3:
        r3 = r3 + 1;
        goto L_0x000b;
    L_0x00f7:
        r10 = new java.lang.IllegalArgumentException;
        r0 = "Could not parse XML attribute \"adSize\": ";
        r1 = java.lang.String.valueOf(r4);
        r2 = r1.length();
        if (r2 == 0) goto L_0x010a;
    L_0x0105:
        r0 = r0.concat(r1);
        goto L_0x0110;
    L_0x010a:
        r1 = new java.lang.String;
        r1.<init>(r0);
        r0 = r1;
    L_0x0110:
        r10.<init>(r0);
        throw r10;
    L_0x0114:
        r0 = r1.length;
        if (r0 != 0) goto L_0x0133;
    L_0x0117:
        r0 = new java.lang.IllegalArgumentException;
        r1 = "Could not parse XML attribute \"adSize\": ";
        r10 = java.lang.String.valueOf(r10);
        r2 = r10.length();
        if (r2 == 0) goto L_0x012a;
    L_0x0125:
        r10 = r1.concat(r10);
        goto L_0x012f;
    L_0x012a:
        r10 = new java.lang.String;
        r10.<init>(r1);
    L_0x012f:
        r0.<init>(r10);
        throw r0;
    L_0x0133:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zziz.zzab(java.lang.String):com.google.android.gms.ads.AdSize[]");
    }

    public final String getAdUnitId() {
        return this.zzaou;
    }

    public final AdSize[] zzh(boolean z) {
        if (z || this.zzbdg.length == 1) {
            return this.zzbdg;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }
}
