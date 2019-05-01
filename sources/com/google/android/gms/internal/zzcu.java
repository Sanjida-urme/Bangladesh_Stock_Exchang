package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzcu {
    private static Cipher zzahv;
    private static final Object zzahw = new Object();
    private static final Object zzahx = new Object();
    private final SecureRandom zzahu = null;

    public zzcu(SecureRandom secureRandom) {
    }

    private static Cipher getCipher() throws NoSuchAlgorithmException, NoSuchPaddingException {
        Cipher cipher;
        synchronized (zzahx) {
            if (zzahv == null) {
                zzahv = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = zzahv;
        }
        return cipher;
    }

    public final byte[] zzb(byte[] bArr, String str) throws zzcv {
        if (bArr.length != 16) {
            throw new zzcv(this);
        }
        try {
            byte[] zza = zzbr.zza(str, false);
            if (zza.length <= 16) {
                throw new zzcv(this);
            }
            ByteBuffer allocate = ByteBuffer.allocate(zza.length);
            allocate.put(zza);
            allocate.flip();
            byte[] bArr2 = new byte[16];
            zza = new byte[(zza.length - 16)];
            allocate.get(bArr2);
            allocate.get(zza);
            Key secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (zzahw) {
                getCipher().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                zza = getCipher().doFinal(zza);
            }
            return zza;
        } catch (Throwable e) {
            throw new zzcv(this, e);
        } catch (Throwable e2) {
            throw new zzcv(this, e2);
        } catch (Throwable e22) {
            throw new zzcv(this, e22);
        } catch (Throwable e222) {
            throw new zzcv(this, e222);
        } catch (Throwable e2222) {
            throw new zzcv(this, e2222);
        } catch (Throwable e22222) {
            throw new zzcv(this, e22222);
        } catch (Throwable e222222) {
            throw new zzcv(this, e222222);
        }
    }

    public final String zzc(byte[] bArr, byte[] bArr2) throws zzcv {
        if (bArr.length != 16) {
            throw new zzcv(this);
        }
        try {
            byte[] iv;
            Key secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (zzahw) {
                getCipher().init(1, secretKeySpec, null);
                bArr2 = getCipher().doFinal(bArr2);
                iv = getCipher().getIV();
            }
            int length = bArr2.length + iv.length;
            ByteBuffer allocate = ByteBuffer.allocate(length);
            allocate.put(iv).put(bArr2);
            allocate.flip();
            bArr = new byte[length];
            allocate.get(bArr);
            return zzbr.zza(bArr, false);
        } catch (Throwable e) {
            throw new zzcv(this, e);
        } catch (Throwable e2) {
            throw new zzcv(this, e2);
        } catch (Throwable e22) {
            throw new zzcv(this, e22);
        } catch (Throwable e222) {
            throw new zzcv(this, e222);
        } catch (Throwable e2222) {
            throw new zzcv(this, e2222);
        }
    }

    public final byte[] zzk(String str) throws zzcv {
        int i = 0;
        try {
            byte[] zza = zzbr.zza(str, false);
            if (zza.length != 32) {
                throw new zzcv(this);
            }
            byte[] bArr = new byte[16];
            ByteBuffer.wrap(zza, 4, 16).get(bArr);
            while (i < 16) {
                bArr[i] = (byte) (bArr[i] ^ 68);
                i++;
            }
            return bArr;
        } catch (Throwable e) {
            throw new zzcv(this, e);
        }
    }
}
