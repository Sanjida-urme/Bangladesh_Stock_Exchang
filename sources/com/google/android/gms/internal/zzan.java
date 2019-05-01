package com.google.android.gms.internal;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import javax.net.ssl.SSLSocketFactory;

public final class zzan implements zzam {
    private final zzao zzcb;
    private final SSLSocketFactory zzcc;

    public zzan() {
        this(null);
    }

    private zzan(zzao zzao) {
        this(null, null);
    }

    private zzan(zzao zzao, SSLSocketFactory sSLSocketFactory) {
        this.zzcb = null;
        this.zzcc = null;
    }

    private static org.apache.http.HttpEntity zza(java.net.HttpURLConnection r3) {
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
        r0 = new org.apache.http.entity.BasicHttpEntity;
        r0.<init>();
        r1 = r3.getInputStream();	 Catch:{ IOException -> 0x000a }
        goto L_0x000e;
    L_0x000a:
        r1 = r3.getErrorStream();
    L_0x000e:
        r0.setContent(r1);
        r1 = r3.getContentLength();
        r1 = (long) r1;
        r0.setContentLength(r1);
        r1 = r3.getContentEncoding();
        r0.setContentEncoding(r1);
        r3 = r3.getContentType();
        r0.setContentType(r3);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzan.zza(java.net.HttpURLConnection):org.apache.http.HttpEntity");
    }

    private static void zza(HttpURLConnection httpURLConnection, zzp<?> zzp) throws IOException, zza {
        byte[] zzg = zzp.zzg();
        if (zzg != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.addRequestProperty("Content-Type", zzp.zzf());
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(zzg);
            dataOutputStream.close();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.apache.http.HttpResponse zza(com.google.android.gms.internal.zzp<?> r7, java.util.Map<java.lang.String, java.lang.String> r8) throws java.io.IOException, com.google.android.gms.internal.zza {
        /*
        r6 = this;
        r0 = r7.getUrl();
        r1 = new java.util.HashMap;
        r1.<init>();
        r2 = r7.getHeaders();
        r1.putAll(r2);
        r1.putAll(r8);
        r8 = r6.zzcb;
        if (r8 == 0) goto L_0x003c;
    L_0x0017:
        r8 = r6.zzcb;
        r8 = r8.zzg(r0);
        if (r8 != 0) goto L_0x003d;
    L_0x001f:
        r7 = new java.io.IOException;
        r8 = "URL blocked by rewriter: ";
        r0 = java.lang.String.valueOf(r0);
        r1 = r0.length();
        if (r1 == 0) goto L_0x0032;
    L_0x002d:
        r8 = r8.concat(r0);
        goto L_0x0038;
    L_0x0032:
        r0 = new java.lang.String;
        r0.<init>(r8);
        r8 = r0;
    L_0x0038:
        r7.<init>(r8);
        throw r7;
    L_0x003c:
        r8 = r0;
    L_0x003d:
        r0 = new java.net.URL;
        r0.<init>(r8);
        r8 = r0.openConnection();
        r8 = (java.net.HttpURLConnection) r8;
        r2 = java.net.HttpURLConnection.getFollowRedirects();
        r8.setInstanceFollowRedirects(r2);
        r2 = r7.zzi();
        r8.setConnectTimeout(r2);
        r8.setReadTimeout(r2);
        r2 = 0;
        r8.setUseCaches(r2);
        r3 = 1;
        r8.setDoInput(r3);
        r4 = "https";
        r0 = r0.getProtocol();
        r4.equals(r0);
        r0 = r1.keySet();
        r0 = r0.iterator();
    L_0x0072:
        r4 = r0.hasNext();
        if (r4 == 0) goto L_0x0088;
    L_0x0078:
        r4 = r0.next();
        r4 = (java.lang.String) r4;
        r5 = r1.get(r4);
        r5 = (java.lang.String) r5;
        r8.addRequestProperty(r4, r5);
        goto L_0x0072;
    L_0x0088:
        r0 = r7.getMethod();
        switch(r0) {
            case -1: goto L_0x00b7;
            case 0: goto L_0x00b2;
            case 1: goto L_0x00a9;
            case 2: goto L_0x00a6;
            case 3: goto L_0x00a3;
            case 4: goto L_0x00a0;
            case 5: goto L_0x009d;
            case 6: goto L_0x009a;
            case 7: goto L_0x0097;
            default: goto L_0x008f;
        };
    L_0x008f:
        r7 = new java.lang.IllegalStateException;
        r8 = "Unknown method type.";
        r7.<init>(r8);
        throw r7;
    L_0x0097:
        r0 = "PATCH";
        goto L_0x00ab;
    L_0x009a:
        r0 = "TRACE";
        goto L_0x00b4;
    L_0x009d:
        r0 = "OPTIONS";
        goto L_0x00b4;
    L_0x00a0:
        r0 = "HEAD";
        goto L_0x00b4;
    L_0x00a3:
        r0 = "DELETE";
        goto L_0x00b4;
    L_0x00a6:
        r0 = "PUT";
        goto L_0x00ab;
    L_0x00a9:
        r0 = "POST";
    L_0x00ab:
        r8.setRequestMethod(r0);
        zza(r8, r7);
        goto L_0x00b7;
    L_0x00b2:
        r0 = "GET";
    L_0x00b4:
        r8.setRequestMethod(r0);
    L_0x00b7:
        r0 = new org.apache.http.ProtocolVersion;
        r1 = "HTTP";
        r0.<init>(r1, r3, r3);
        r1 = r8.getResponseCode();
        r4 = -1;
        if (r1 != r4) goto L_0x00cd;
    L_0x00c5:
        r7 = new java.io.IOException;
        r8 = "Could not retrieve response code from HttpUrlConnection.";
        r7.<init>(r8);
        throw r7;
    L_0x00cd:
        r1 = new org.apache.http.message.BasicStatusLine;
        r4 = r8.getResponseCode();
        r5 = r8.getResponseMessage();
        r1.<init>(r0, r4, r5);
        r0 = new org.apache.http.message.BasicHttpResponse;
        r0.<init>(r1);
        r7 = r7.getMethod();
        r1 = r1.getStatusCode();
        r4 = 4;
        if (r7 == r4) goto L_0x00fb;
    L_0x00ea:
        r7 = 100;
        if (r7 > r1) goto L_0x00f2;
    L_0x00ee:
        r7 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r1 < r7) goto L_0x00fb;
    L_0x00f2:
        r7 = 204; // 0xcc float:2.86E-43 double:1.01E-321;
        if (r1 == r7) goto L_0x00fb;
    L_0x00f6:
        r7 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        if (r1 == r7) goto L_0x00fb;
    L_0x00fa:
        goto L_0x00fc;
    L_0x00fb:
        r3 = 0;
    L_0x00fc:
        if (r3 == 0) goto L_0x0105;
    L_0x00fe:
        r7 = zza(r8);
        r0.setEntity(r7);
    L_0x0105:
        r7 = r8.getHeaderFields();
        r7 = r7.entrySet();
        r7 = r7.iterator();
    L_0x0111:
        r8 = r7.hasNext();
        if (r8 == 0) goto L_0x013e;
    L_0x0117:
        r8 = r7.next();
        r8 = (java.util.Map.Entry) r8;
        r1 = r8.getKey();
        if (r1 == 0) goto L_0x0111;
    L_0x0123:
        r1 = new org.apache.http.message.BasicHeader;
        r3 = r8.getKey();
        r3 = (java.lang.String) r3;
        r8 = r8.getValue();
        r8 = (java.util.List) r8;
        r8 = r8.get(r2);
        r8 = (java.lang.String) r8;
        r1.<init>(r3, r8);
        r0.addHeader(r1);
        goto L_0x0111;
    L_0x013e:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzan.zza(com.google.android.gms.internal.zzp, java.util.Map):org.apache.http.HttpResponse");
    }
}
