package com.google.android.gms.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.ads.internal.zzbs;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

final class zzbt {
    private static boolean zzyp = false;
    private static MessageDigest zzyq;
    private static final Object zzyr = new Object();
    private static final Object zzys = new Object();
    static CountDownLatch zzyt = new CountDownLatch(1);

    static String zza(zzaw zzaw, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] zzc = zzfhs.zzc(zzaw);
        if (((Boolean) zzbs.zzep().zzd(zzmq.zzbmc)).booleanValue()) {
            zzc = zza(zzc, str);
        } else if (zzbw.zzyu == null) {
            throw new GeneralSecurityException();
        } else {
            zzc = zzbw.zzyu.zzd(zzc, str != null ? str.getBytes() : new byte[0]);
            zzfhs zzbc = new zzbc();
            zzbc.zzgj = new byte[][]{zzc};
            zzbc.zzgl = Integer.valueOf(2);
            zzc = zzfhs.zzc(zzbc);
        }
        return zzbr.zza(zzc, true);
    }

    private static java.util.Vector<byte[]> zza(byte[] r6, int r7) {
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
        r7 = 0;
        if (r6 == 0) goto L_0x002c;
    L_0x0003:
        r0 = r6.length;
        if (r0 > 0) goto L_0x0007;
    L_0x0006:
        return r7;
    L_0x0007:
        r0 = r6.length;
        r1 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r0 = r0 + r1;
        r0 = r0 + -1;
        r0 = r0 / r1;
        r2 = new java.util.Vector;
        r2.<init>();
        r3 = 0;
    L_0x0014:
        if (r3 >= r0) goto L_0x002b;
    L_0x0016:
        r4 = r3 * 255;
        r5 = r6.length;	 Catch:{ IndexOutOfBoundsException -> 0x002a }
        r5 = r5 - r4;	 Catch:{ IndexOutOfBoundsException -> 0x002a }
        if (r5 <= r1) goto L_0x001f;	 Catch:{ IndexOutOfBoundsException -> 0x002a }
    L_0x001c:
        r5 = r4 + 255;	 Catch:{ IndexOutOfBoundsException -> 0x002a }
        goto L_0x0020;	 Catch:{ IndexOutOfBoundsException -> 0x002a }
    L_0x001f:
        r5 = r6.length;	 Catch:{ IndexOutOfBoundsException -> 0x002a }
    L_0x0020:
        r4 = java.util.Arrays.copyOfRange(r6, r4, r5);	 Catch:{ IndexOutOfBoundsException -> 0x002a }
        r2.add(r4);	 Catch:{ IndexOutOfBoundsException -> 0x002a }
        r3 = r3 + 1;
        goto L_0x0014;
    L_0x002a:
        return r7;
    L_0x002b:
        return r2;
    L_0x002c:
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzbt.zza(byte[], int):java.util.Vector<byte[]>");
    }

    private static byte[] zza(byte[] bArr, String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        Vector zza = zza(bArr, 255);
        if (zza != null) {
            if (zza.size() != 0) {
                zzfhs zzbc = new zzbc();
                zzbc.zzgj = new byte[zza.size()][];
                Iterator it = zza.iterator();
                int i = 0;
                while (it.hasNext()) {
                    int i2 = i + 1;
                    zzbc.zzgj[i] = zza((byte[]) it.next(), str, false);
                    i = i2;
                }
                zzbc.zzge = zzb(bArr);
                return zzfhs.zzc(zzbc);
            }
        }
        return zza(zzfhs.zzc(zzb((long) PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM)), str, true);
    }

    private static byte[] zza(byte[] bArr, String str, boolean z) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        ByteBuffer put;
        int i = z ? 239 : 255;
        if (bArr.length > i) {
            bArr = zzfhs.zzc(zzb((long) PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM));
        }
        if (bArr.length < i) {
            byte[] bArr2 = new byte[(i - bArr.length)];
            new SecureRandom().nextBytes(bArr2);
            put = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr).put(bArr2);
        } else {
            put = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr);
        }
        bArr = put.array();
        if (z) {
            bArr = ByteBuffer.allocate(256).put(zzb(bArr)).put(bArr).array();
        }
        byte[] bArr3 = new byte[256];
        new zzbx().zza(bArr, bArr3);
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzfby(str.getBytes("UTF-8")).zzax(bArr3);
        }
        return bArr3;
    }

    private static zzaw zzb(long j) {
        zzaw zzaw = new zzaw();
        zzaw.zzdn = Long.valueOf(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
        return zzaw;
    }

    public static byte[] zzb(byte[] bArr) throws NoSuchAlgorithmException {
        synchronized (zzyr) {
            MessageDigest zzy = zzy();
            if (zzy == null) {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
            zzy.reset();
            zzy.update(bArr);
            bArr = zzyq.digest();
        }
        return bArr;
    }

    static void zzx() {
        synchronized (zzys) {
            if (!zzyp) {
                zzyp = true;
                new Thread(new zzbv()).start();
            }
        }
    }

    private static java.security.MessageDigest zzy() {
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
        zzx();
        r0 = zzyt;	 Catch:{ InterruptedException -> 0x000e }
        r1 = 2;	 Catch:{ InterruptedException -> 0x000e }
        r3 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ InterruptedException -> 0x000e }
        r0 = r0.await(r1, r3);	 Catch:{ InterruptedException -> 0x000e }
        goto L_0x000f;
    L_0x000e:
        r0 = 0;
    L_0x000f:
        r1 = 0;
        if (r0 != 0) goto L_0x0013;
    L_0x0012:
        return r1;
    L_0x0013:
        r0 = zzyq;
        if (r0 != 0) goto L_0x0018;
    L_0x0017:
        return r1;
    L_0x0018:
        r0 = zzyq;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzbt.zzy():java.security.MessageDigest");
    }
}
