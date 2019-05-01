package com.google.android.gms.internal;

import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public final class zzag implements zzb {
    private final Map<String, zzah> zzbt;
    private long zzbu;
    private final File zzbv;
    private final int zzbw;

    public zzag(File file) {
        this(file, 5242880);
    }

    private zzag(File file, int i) {
        this.zzbt = new LinkedHashMap(16, 0.75f, true);
        this.zzbu = 0;
        this.zzbv = file;
        this.zzbw = 5242880;
    }

    private final synchronized void remove(String str) {
        boolean delete = zze(str).delete();
        removeEntry(str);
        if (!delete) {
            zzab.zzb("Could not delete cache entry for key=%s, filename=%s", str, zzd(str));
        }
    }

    private final void removeEntry(String str) {
        zzah zzah = (zzah) this.zzbt.remove(str);
        if (zzah != null) {
            this.zzbu -= zzah.zzbx;
        }
    }

    private static int zza(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private static InputStream zza(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    static String zza(zzai zzai) throws IOException {
        return new String(zza(zzai, zzc(zzai)), "UTF-8");
    }

    static void zza(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write(i >>> 24);
    }

    static void zza(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) ((int) j));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    static void zza(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        zza(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    private final void zza(String str, zzah zzah) {
        if (this.zzbt.containsKey(str)) {
            this.zzbu += zzah.zzbx - ((zzah) this.zzbt.get(str)).zzbx;
        } else {
            this.zzbu += zzah.zzbx;
        }
        this.zzbt.put(str, zzah);
    }

    private static byte[] zza(zzai zzai, long j) throws IOException {
        long zzn = zzai.zzn();
        if (j >= 0 && j <= zzn) {
            int i = (int) j;
            if (((long) i) == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(zzai).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder stringBuilder = new StringBuilder(73);
        stringBuilder.append("streamToBytes length=");
        stringBuilder.append(j);
        stringBuilder.append(", maxLength=");
        stringBuilder.append(zzn);
        throw new IOException(stringBuilder.toString());
    }

    static int zzb(InputStream inputStream) throws IOException {
        return (zza(inputStream) << 24) | (((zza(inputStream) | 0) | (zza(inputStream) << 8)) | (zza(inputStream) << 16));
    }

    static Map<String, String> zzb(zzai zzai) throws IOException {
        int zzb = zzb((InputStream) zzai);
        Map<String, String> emptyMap = zzb == 0 ? Collections.emptyMap() : new HashMap(zzb);
        for (int i = 0; i < zzb; i++) {
            emptyMap.put(zza(zzai).intern(), zza(zzai).intern());
        }
        return emptyMap;
    }

    static long zzc(InputStream inputStream) throws IOException {
        return ((((((((((long) zza(inputStream)) & 255) | 0) | ((((long) zza(inputStream)) & 255) << 8)) | ((((long) zza(inputStream)) & 255) << 16)) | ((((long) zza(inputStream)) & 255) << 24)) | ((((long) zza(inputStream)) & 255) << 32)) | ((((long) zza(inputStream)) & 255) << 40)) | ((((long) zza(inputStream)) & 255) << 48)) | ((((long) zza(inputStream)) & 255) << 56);
    }

    private static String zzd(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        str = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
    }

    private final File zze(String str) {
        return new File(this.zzbv, zzd(str));
    }

    public final synchronized void initialize() {
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
        r9 = this;
        monitor-enter(r9);
        r0 = r9.zzbv;	 Catch:{ all -> 0x0061 }
        r0 = r0.exists();	 Catch:{ all -> 0x0061 }
        r1 = 0;	 Catch:{ all -> 0x0061 }
        if (r0 != 0) goto L_0x0024;	 Catch:{ all -> 0x0061 }
    L_0x000a:
        r0 = r9.zzbv;	 Catch:{ all -> 0x0061 }
        r0 = r0.mkdirs();	 Catch:{ all -> 0x0061 }
        if (r0 != 0) goto L_0x0022;	 Catch:{ all -> 0x0061 }
    L_0x0012:
        r0 = "Unable to create cache dir %s";	 Catch:{ all -> 0x0061 }
        r2 = 1;	 Catch:{ all -> 0x0061 }
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x0061 }
        r3 = r9.zzbv;	 Catch:{ all -> 0x0061 }
        r3 = r3.getAbsolutePath();	 Catch:{ all -> 0x0061 }
        r2[r1] = r3;	 Catch:{ all -> 0x0061 }
        com.google.android.gms.internal.zzab.zzc(r0, r2);	 Catch:{ all -> 0x0061 }
    L_0x0022:
        monitor-exit(r9);
        return;
    L_0x0024:
        r0 = r9.zzbv;	 Catch:{ all -> 0x0061 }
        r0 = r0.listFiles();	 Catch:{ all -> 0x0061 }
        if (r0 != 0) goto L_0x002e;
    L_0x002c:
        monitor-exit(r9);
        return;
    L_0x002e:
        r2 = r0.length;	 Catch:{ all -> 0x0061 }
    L_0x002f:
        if (r1 >= r2) goto L_0x005f;	 Catch:{ all -> 0x0061 }
    L_0x0031:
        r3 = r0[r1];	 Catch:{ all -> 0x0061 }
        r4 = r3.length();	 Catch:{ IOException -> 0x0059 }
        r6 = new com.google.android.gms.internal.zzai;	 Catch:{ IOException -> 0x0059 }
        r7 = new java.io.BufferedInputStream;	 Catch:{ IOException -> 0x0059 }
        r8 = zza(r3);	 Catch:{ IOException -> 0x0059 }
        r7.<init>(r8);	 Catch:{ IOException -> 0x0059 }
        r6.<init>(r7, r4);	 Catch:{ IOException -> 0x0059 }
        r7 = com.google.android.gms.internal.zzah.zzc(r6);	 Catch:{ all -> 0x0054 }
        r7.zzbx = r4;	 Catch:{ all -> 0x0054 }
        r4 = r7.key;	 Catch:{ all -> 0x0054 }
        r9.zza(r4, r7);	 Catch:{ all -> 0x0054 }
        r6.close();	 Catch:{ IOException -> 0x0059 }
        goto L_0x005c;	 Catch:{ IOException -> 0x0059 }
    L_0x0054:
        r4 = move-exception;	 Catch:{ IOException -> 0x0059 }
        r6.close();	 Catch:{ IOException -> 0x0059 }
        throw r4;	 Catch:{ IOException -> 0x0059 }
    L_0x0059:
        r3.delete();	 Catch:{ all -> 0x0061 }
    L_0x005c:
        r1 = r1 + 1;
        goto L_0x002f;
    L_0x005f:
        monitor-exit(r9);
        return;
    L_0x0061:
        r0 = move-exception;
        monitor-exit(r9);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzag.initialize():void");
    }

    public final synchronized zzc zza(String str) {
        zzah zzah = (zzah) this.zzbt.get(str);
        if (zzah == null) {
            return null;
        }
        File zze = zze(str);
        zzai zzai;
        try {
            zzai = new zzai(new BufferedInputStream(zza(zze)), zze.length());
            if (TextUtils.equals(str, zzah.zzc(zzai).key)) {
                byte[] zza = zza(zzai, zzai.zzn());
                zzc zzc = new zzc();
                zzc.data = zza;
                zzc.zza = zzah.zza;
                zzc.zzb = zzah.zzb;
                zzc.zzc = zzah.zzc;
                zzc.zzd = zzah.zzd;
                zzc.zze = zzah.zze;
                zzc.zzf = zzah.zzf;
                zzai.close();
                return zzc;
            }
            zzab.zzb("%s: key=%s, found=%s", zze.getAbsolutePath(), str, zzah.zzc(zzai).key);
            removeEntry(str);
            zzai.close();
            return null;
        } catch (IOException e) {
            zzab.zzb("%s: %s", zze.getAbsolutePath(), e.toString());
            remove(str);
            return null;
        } catch (Throwable th) {
            zzai.close();
        }
    }

    public final synchronized void zza(java.lang.String r20, com.google.android.gms.internal.zzc r21) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
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
        r19 = this;
        r1 = r19;
        r2 = r20;
        r3 = r21;
        monitor-enter(r19);
        r4 = r3.data;	 Catch:{ all -> 0x0120 }
        r4 = r4.length;	 Catch:{ all -> 0x0120 }
        r5 = r1.zzbu;	 Catch:{ all -> 0x0120 }
        r7 = (long) r4;	 Catch:{ all -> 0x0120 }
        r9 = r5 + r7;	 Catch:{ all -> 0x0120 }
        r4 = r1.zzbw;	 Catch:{ all -> 0x0120 }
        r4 = (long) r4;	 Catch:{ all -> 0x0120 }
        r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1));	 Catch:{ all -> 0x0120 }
        r5 = 0;	 Catch:{ all -> 0x0120 }
        if (r6 < 0) goto L_0x00c9;	 Catch:{ all -> 0x0120 }
    L_0x0017:
        r6 = com.google.android.gms.internal.zzab.DEBUG;	 Catch:{ all -> 0x0120 }
        if (r6 == 0) goto L_0x0022;	 Catch:{ all -> 0x0120 }
    L_0x001b:
        r6 = "Pruning old cache entries.";	 Catch:{ all -> 0x0120 }
        r9 = new java.lang.Object[r5];	 Catch:{ all -> 0x0120 }
        com.google.android.gms.internal.zzab.zza(r6, r9);	 Catch:{ all -> 0x0120 }
    L_0x0022:
        r9 = r1.zzbu;	 Catch:{ all -> 0x0120 }
        r11 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x0120 }
        r6 = r1.zzbt;	 Catch:{ all -> 0x0120 }
        r6 = r6.entrySet();	 Catch:{ all -> 0x0120 }
        r6 = r6.iterator();	 Catch:{ all -> 0x0120 }
        r13 = 0;	 Catch:{ all -> 0x0120 }
    L_0x0033:
        r14 = r6.hasNext();	 Catch:{ all -> 0x0120 }
        r15 = 2;	 Catch:{ all -> 0x0120 }
        if (r14 == 0) goto L_0x009b;	 Catch:{ all -> 0x0120 }
    L_0x003a:
        r14 = r6.next();	 Catch:{ all -> 0x0120 }
        r14 = (java.util.Map.Entry) r14;	 Catch:{ all -> 0x0120 }
        r14 = r14.getValue();	 Catch:{ all -> 0x0120 }
        r14 = (com.google.android.gms.internal.zzah) r14;	 Catch:{ all -> 0x0120 }
        r4 = r14.key;	 Catch:{ all -> 0x0120 }
        r4 = r1.zze(r4);	 Catch:{ all -> 0x0120 }
        r4 = r4.delete();	 Catch:{ all -> 0x0120 }
        if (r4 == 0) goto L_0x0062;	 Catch:{ all -> 0x0120 }
    L_0x0052:
        r16 = r6;	 Catch:{ all -> 0x0120 }
        r5 = r1.zzbu;	 Catch:{ all -> 0x0120 }
        r3 = r14.zzbx;	 Catch:{ all -> 0x0120 }
        r14 = 0;	 Catch:{ all -> 0x0120 }
        r17 = r11;	 Catch:{ all -> 0x0120 }
        r11 = r5 - r3;	 Catch:{ all -> 0x0120 }
        r1.zzbu = r11;	 Catch:{ all -> 0x0120 }
    L_0x005f:
        r3 = r16;	 Catch:{ all -> 0x0120 }
        goto L_0x007c;	 Catch:{ all -> 0x0120 }
    L_0x0062:
        r16 = r6;	 Catch:{ all -> 0x0120 }
        r17 = r11;	 Catch:{ all -> 0x0120 }
        r3 = "Could not delete cache entry for key=%s, filename=%s";	 Catch:{ all -> 0x0120 }
        r4 = new java.lang.Object[r15];	 Catch:{ all -> 0x0120 }
        r5 = r14.key;	 Catch:{ all -> 0x0120 }
        r6 = 0;	 Catch:{ all -> 0x0120 }
        r4[r6] = r5;	 Catch:{ all -> 0x0120 }
        r5 = r14.key;	 Catch:{ all -> 0x0120 }
        r5 = zzd(r5);	 Catch:{ all -> 0x0120 }
        r6 = 1;	 Catch:{ all -> 0x0120 }
        r4[r6] = r5;	 Catch:{ all -> 0x0120 }
        com.google.android.gms.internal.zzab.zzb(r3, r4);	 Catch:{ all -> 0x0120 }
        goto L_0x005f;	 Catch:{ all -> 0x0120 }
    L_0x007c:
        r3.remove();	 Catch:{ all -> 0x0120 }
        r13 = r13 + 1;	 Catch:{ all -> 0x0120 }
        r4 = r1.zzbu;	 Catch:{ all -> 0x0120 }
        r6 = 0;	 Catch:{ all -> 0x0120 }
        r11 = r4 + r7;	 Catch:{ all -> 0x0120 }
        r4 = (float) r11;	 Catch:{ all -> 0x0120 }
        r5 = r1.zzbw;	 Catch:{ all -> 0x0120 }
        r5 = (float) r5;	 Catch:{ all -> 0x0120 }
        r6 = 1063675494; // 0x3f666666 float:0.9 double:5.2552552E-315;	 Catch:{ all -> 0x0120 }
        r5 = r5 * r6;	 Catch:{ all -> 0x0120 }
        r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1));	 Catch:{ all -> 0x0120 }
        if (r4 >= 0) goto L_0x0094;	 Catch:{ all -> 0x0120 }
    L_0x0093:
        goto L_0x009d;	 Catch:{ all -> 0x0120 }
    L_0x0094:
        r6 = r3;	 Catch:{ all -> 0x0120 }
        r11 = r17;	 Catch:{ all -> 0x0120 }
        r3 = r21;	 Catch:{ all -> 0x0120 }
        r5 = 0;	 Catch:{ all -> 0x0120 }
        goto L_0x0033;	 Catch:{ all -> 0x0120 }
    L_0x009b:
        r17 = r11;	 Catch:{ all -> 0x0120 }
    L_0x009d:
        r3 = com.google.android.gms.internal.zzab.DEBUG;	 Catch:{ all -> 0x0120 }
        if (r3 == 0) goto L_0x00c9;	 Catch:{ all -> 0x0120 }
    L_0x00a1:
        r3 = "pruned %d files, %d bytes, %d ms";	 Catch:{ all -> 0x0120 }
        r4 = 3;	 Catch:{ all -> 0x0120 }
        r4 = new java.lang.Object[r4];	 Catch:{ all -> 0x0120 }
        r5 = java.lang.Integer.valueOf(r13);	 Catch:{ all -> 0x0120 }
        r6 = 0;	 Catch:{ all -> 0x0120 }
        r4[r6] = r5;	 Catch:{ all -> 0x0120 }
        r5 = r1.zzbu;	 Catch:{ all -> 0x0120 }
        r7 = 0;	 Catch:{ all -> 0x0120 }
        r7 = r5 - r9;	 Catch:{ all -> 0x0120 }
        r5 = java.lang.Long.valueOf(r7);	 Catch:{ all -> 0x0120 }
        r6 = 1;	 Catch:{ all -> 0x0120 }
        r4[r6] = r5;	 Catch:{ all -> 0x0120 }
        r5 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x0120 }
        r7 = 0;	 Catch:{ all -> 0x0120 }
        r7 = r5 - r17;	 Catch:{ all -> 0x0120 }
        r5 = java.lang.Long.valueOf(r7);	 Catch:{ all -> 0x0120 }
        r4[r15] = r5;	 Catch:{ all -> 0x0120 }
        com.google.android.gms.internal.zzab.zza(r3, r4);	 Catch:{ all -> 0x0120 }
    L_0x00c9:
        r3 = r19.zze(r20);	 Catch:{ all -> 0x0120 }
        r4 = new java.io.BufferedOutputStream;	 Catch:{ IOException -> 0x0109 }
        r5 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x0109 }
        r5.<init>(r3);	 Catch:{ IOException -> 0x0109 }
        r4.<init>(r5);	 Catch:{ IOException -> 0x0109 }
        r5 = new com.google.android.gms.internal.zzah;	 Catch:{ IOException -> 0x0109 }
        r6 = r21;	 Catch:{ IOException -> 0x0109 }
        r5.<init>(r2, r6);	 Catch:{ IOException -> 0x0109 }
        r7 = r5.zza(r4);	 Catch:{ IOException -> 0x0109 }
        if (r7 != 0) goto L_0x00fc;	 Catch:{ IOException -> 0x0109 }
    L_0x00e4:
        r4.close();	 Catch:{ IOException -> 0x0109 }
        r2 = "Failed to write header for %s";	 Catch:{ IOException -> 0x0109 }
        r4 = 1;	 Catch:{ IOException -> 0x0109 }
        r5 = new java.lang.Object[r4];	 Catch:{ IOException -> 0x0109 }
        r4 = r3.getAbsolutePath();	 Catch:{ IOException -> 0x0109 }
        r6 = 0;	 Catch:{ IOException -> 0x0109 }
        r5[r6] = r4;	 Catch:{ IOException -> 0x0109 }
        com.google.android.gms.internal.zzab.zzb(r2, r5);	 Catch:{ IOException -> 0x0109 }
        r2 = new java.io.IOException;	 Catch:{ IOException -> 0x0109 }
        r2.<init>();	 Catch:{ IOException -> 0x0109 }
        throw r2;	 Catch:{ IOException -> 0x0109 }
    L_0x00fc:
        r6 = r6.data;	 Catch:{ IOException -> 0x0109 }
        r4.write(r6);	 Catch:{ IOException -> 0x0109 }
        r4.close();	 Catch:{ IOException -> 0x0109 }
        r1.zza(r2, r5);	 Catch:{ IOException -> 0x0109 }
        monitor-exit(r19);
        return;
    L_0x0109:
        r2 = r3.delete();	 Catch:{ all -> 0x0120 }
        if (r2 != 0) goto L_0x011e;	 Catch:{ all -> 0x0120 }
    L_0x010f:
        r2 = "Could not clean up file %s";	 Catch:{ all -> 0x0120 }
        r4 = 1;	 Catch:{ all -> 0x0120 }
        r4 = new java.lang.Object[r4];	 Catch:{ all -> 0x0120 }
        r3 = r3.getAbsolutePath();	 Catch:{ all -> 0x0120 }
        r5 = 0;	 Catch:{ all -> 0x0120 }
        r4[r5] = r3;	 Catch:{ all -> 0x0120 }
        com.google.android.gms.internal.zzab.zzb(r2, r4);	 Catch:{ all -> 0x0120 }
    L_0x011e:
        monitor-exit(r19);
        return;
    L_0x0120:
        r0 = move-exception;
        r2 = r0;
        monitor-exit(r19);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzag.zza(java.lang.String, com.google.android.gms.internal.zzc):void");
    }
}
