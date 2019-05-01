package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdrr.zzb;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class zzdow<P> {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private ConcurrentMap<String, List<zzdox<P>>> zzlpr = new ConcurrentHashMap();
    private zzdox<P> zzlps;

    protected final zzdox<P> zza(P p, zzb zzb) throws GeneralSecurityException {
        ByteBuffer allocate;
        byte b;
        byte[] bArr;
        switch (zzdoq.zzlpo[zzb.zzboj().ordinal()]) {
            case 1:
            case 2:
                allocate = ByteBuffer.allocate(5);
                b = (byte) 0;
                break;
            case 3:
                allocate = ByteBuffer.allocate(5);
                b = (byte) 1;
                break;
            case 4:
                bArr = zzdop.zzlpn;
                break;
            default:
                throw new GeneralSecurityException("unknown output prefix type");
        }
        bArr = allocate.put(b).putInt(zzb.zzboi()).array();
        zzdox<P> zzdox = new zzdox(p, bArr, zzb.zzboh(), zzb.zzboj());
        List arrayList = new ArrayList();
        arrayList.add(zzdox);
        String str = new String(zzdox.zzbli(), UTF_8);
        arrayList = (List) this.zzlpr.put(str, Collections.unmodifiableList(arrayList));
        if (arrayList != null) {
            List arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList2.add(zzdox);
            this.zzlpr.put(str, Collections.unmodifiableList(arrayList2));
        }
        return zzdox;
    }

    protected final void zza(zzdox<P> zzdox) {
        this.zzlps = zzdox;
    }

    public final zzdox<P> zzblg() {
        return this.zzlps;
    }
}
