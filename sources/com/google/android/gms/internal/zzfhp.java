package com.google.android.gms.internal;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class zzfhp implements Cloneable {
    private Object value;
    private zzfhn<?, ?> zzphs;
    private List<zzfhu> zzpht = new ArrayList();

    zzfhp() {
    }

    private final byte[] toByteArray() throws IOException {
        byte[] bArr = new byte[zzo()];
        zza(zzfhk.zzbe(bArr));
        return bArr;
    }

    private zzfhp zzcxh() {
        zzfhp zzfhp = new zzfhp();
        try {
            zzfhp.zzphs = this.zzphs;
            if (this.zzpht == null) {
                zzfhp.zzpht = null;
            } else {
                zzfhp.zzpht.addAll(this.zzpht);
            }
            if (this.value != null) {
                Object obj;
                if (this.value instanceof zzfhs) {
                    obj = (zzfhs) ((zzfhs) this.value).clone();
                } else if (this.value instanceof byte[]) {
                    obj = ((byte[]) this.value).clone();
                } else {
                    int i = 0;
                    Object obj2;
                    if (this.value instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.value;
                        obj2 = new byte[bArr.length][];
                        zzfhp.value = obj2;
                        while (i < bArr.length) {
                            obj2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.value instanceof boolean[]) {
                        obj = ((boolean[]) this.value).clone();
                    } else if (this.value instanceof int[]) {
                        obj = ((int[]) this.value).clone();
                    } else if (this.value instanceof long[]) {
                        obj = ((long[]) this.value).clone();
                    } else if (this.value instanceof float[]) {
                        obj = ((float[]) this.value).clone();
                    } else if (this.value instanceof double[]) {
                        obj = ((double[]) this.value).clone();
                    } else if (this.value instanceof zzfhs[]) {
                        zzfhs[] zzfhsArr = (zzfhs[]) this.value;
                        obj2 = new zzfhs[zzfhsArr.length];
                        zzfhp.value = obj2;
                        while (i < zzfhsArr.length) {
                            obj2[i] = (zzfhs) zzfhsArr[i].clone();
                            i++;
                        }
                    }
                }
                zzfhp.value = obj;
                return zzfhp;
            }
            return zzfhp;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return zzcxh();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfhp)) {
            return false;
        }
        zzfhp zzfhp = (zzfhp) obj;
        if (this.value != null && zzfhp.value != null) {
            return this.zzphs != zzfhp.zzphs ? false : !this.zzphs.zznbf.isArray() ? this.value.equals(zzfhp.value) : this.value instanceof byte[] ? Arrays.equals((byte[]) this.value, (byte[]) zzfhp.value) : this.value instanceof int[] ? Arrays.equals((int[]) this.value, (int[]) zzfhp.value) : this.value instanceof long[] ? Arrays.equals((long[]) this.value, (long[]) zzfhp.value) : this.value instanceof float[] ? Arrays.equals((float[]) this.value, (float[]) zzfhp.value) : this.value instanceof double[] ? Arrays.equals((double[]) this.value, (double[]) zzfhp.value) : this.value instanceof boolean[] ? Arrays.equals((boolean[]) this.value, (boolean[]) zzfhp.value) : Arrays.deepEquals((Object[]) this.value, (Object[]) zzfhp.value);
        } else {
            if (this.zzpht != null && zzfhp.zzpht != null) {
                return this.zzpht.equals(zzfhp.zzpht);
            }
            try {
                return Arrays.equals(toByteArray(), zzfhp.toByteArray());
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(toByteArray()) + 527;
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    final void zza(zzfhk zzfhk) throws IOException {
        if (this.value != null) {
            zzfhn zzfhn = this.zzphs;
            Object obj = this.value;
            if (zzfhn.zzphn) {
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    Object obj2 = Array.get(obj, i);
                    if (obj2 != null) {
                        zzfhn.zza(obj2, zzfhk);
                    }
                }
                return;
            }
            zzfhn.zza(obj, zzfhk);
            return;
        }
        for (zzfhu zzfhu : this.zzpht) {
            zzfhk.zzly(zzfhu.tag);
            zzfhk.zzbg(zzfhu.zzjkv);
        }
    }

    final void zza(zzfhu zzfhu) {
        this.zzpht.add(zzfhu);
    }

    final <T> T zzb(zzfhn<?, T> zzfhn) {
        if (this.value == null) {
            this.zzphs = zzfhn;
            this.value = zzfhn.zzbp(this.zzpht);
            this.zzpht = null;
        } else if (!this.zzphs.equals(zzfhn)) {
            throw new IllegalStateException("Tried to getExtension with a different Extension.");
        }
        return this.value;
    }

    final int zzo() {
        int i;
        int i2 = 0;
        if (this.value != null) {
            zzfhn zzfhn = this.zzphs;
            Object obj = this.value;
            if (!zzfhn.zzphn) {
                return zzfhn.zzcl(obj);
            }
            int length = Array.getLength(obj);
            i = 0;
            while (i2 < length) {
                if (Array.get(obj, i2) != null) {
                    i += zzfhn.zzcl(Array.get(obj, i2));
                }
                i2++;
            }
        } else {
            i = 0;
            for (zzfhu zzfhu : this.zzpht) {
                i += (zzfhk.zzlz(zzfhu.tag) + 0) + zzfhu.zzjkv.length;
            }
        }
        return i;
    }
}
