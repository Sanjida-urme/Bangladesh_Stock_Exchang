package com.google.android.gms.internal;

public class zzaq extends zzp<String> {
    private final zzv<String> zzcd;

    public zzaq(int i, String str, zzv<String> zzv, zzu zzu) {
        super(i, str, zzu);
        this.zzcd = zzv;
    }

    protected final com.google.android.gms.internal.zzt<java.lang.String> zza(com.google.android.gms.internal.zzn r4) {
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
        r0 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x000e }
        r1 = r4.data;	 Catch:{ UnsupportedEncodingException -> 0x000e }
        r2 = r4.zzy;	 Catch:{ UnsupportedEncodingException -> 0x000e }
        r2 = com.google.android.gms.internal.zzal.zza(r2);	 Catch:{ UnsupportedEncodingException -> 0x000e }
        r0.<init>(r1, r2);	 Catch:{ UnsupportedEncodingException -> 0x000e }
        goto L_0x0015;
    L_0x000e:
        r0 = new java.lang.String;
        r1 = r4.data;
        r0.<init>(r1);
    L_0x0015:
        r4 = com.google.android.gms.internal.zzal.zzb(r4);
        r4 = com.google.android.gms.internal.zzt.zza(r0, r4);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzaq.zza(com.google.android.gms.internal.zzn):com.google.android.gms.internal.zzt<java.lang.String>");
    }

    protected final /* synthetic */ void zza(Object obj) {
        String str = (String) obj;
        if (this.zzcd != null) {
            this.zzcd.zzb(str);
        }
    }
}
