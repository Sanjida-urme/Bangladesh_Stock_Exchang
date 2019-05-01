package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzkc extends zzee implements zzkb {
    public zzkc() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzkb zzf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return queryLocalInterface instanceof zzkb ? (zzkb) queryLocalInterface : new zzkd(iBinder);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTransact(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
        /*
        r1 = this;
        r5 = r1.zza(r2, r3, r4, r5);
        r0 = 1;
        if (r5 == 0) goto L_0x0008;
    L_0x0007:
        return r0;
    L_0x0008:
        r5 = 0;
        switch(r2) {
            case 1: goto L_0x0171;
            case 2: goto L_0x016a;
            case 3: goto L_0x015f;
            case 4: goto L_0x0152;
            case 5: goto L_0x014e;
            case 6: goto L_0x014a;
            case 7: goto L_0x012c;
            case 8: goto L_0x010e;
            case 9: goto L_0x010a;
            case 10: goto L_0x0105;
            case 11: goto L_0x0100;
            case 12: goto L_0x00f5;
            case 13: goto L_0x00e8;
            case 14: goto L_0x00db;
            case 15: goto L_0x00ca;
            case 16: goto L_0x000c;
            case 17: goto L_0x000c;
            case 18: goto L_0x00bf;
            case 19: goto L_0x00b2;
            case 20: goto L_0x0093;
            case 21: goto L_0x0074;
            case 22: goto L_0x006b;
            case 23: goto L_0x0065;
            case 24: goto L_0x0058;
            case 25: goto L_0x004f;
            case 26: goto L_0x0049;
            case 27: goto L_0x000c;
            case 28: goto L_0x000c;
            case 29: goto L_0x003c;
            case 30: goto L_0x002f;
            case 31: goto L_0x0029;
            case 32: goto L_0x0023;
            case 33: goto L_0x001d;
            case 34: goto L_0x0014;
            case 35: goto L_0x000e;
            default: goto L_0x000c;
        };
    L_0x000c:
        r2 = 0;
        return r2;
    L_0x000e:
        r2 = r1.zzcj();
        goto L_0x00c3;
    L_0x0014:
        r2 = com.google.android.gms.internal.zzef.zza(r3);
        r1.setImmersiveMode(r2);
        goto L_0x016d;
    L_0x001d:
        r2 = r1.zzby();
        goto L_0x0175;
    L_0x0023:
        r2 = r1.zzbx();
        goto L_0x0175;
    L_0x0029:
        r2 = r1.getAdUnitId();
        goto L_0x00c3;
    L_0x002f:
        r2 = com.google.android.gms.internal.zzla.CREATOR;
        r2 = com.google.android.gms.internal.zzef.zza(r3, r2);
        r2 = (com.google.android.gms.internal.zzla) r2;
        r1.zza(r2);
        goto L_0x016d;
    L_0x003c:
        r2 = com.google.android.gms.internal.zzma.CREATOR;
        r2 = com.google.android.gms.internal.zzef.zza(r3, r2);
        r2 = (com.google.android.gms.internal.zzma) r2;
        r1.zza(r2);
        goto L_0x016d;
    L_0x0049:
        r2 = r1.getVideoController();
        goto L_0x0175;
    L_0x004f:
        r2 = r3.readString();
        r1.setUserId(r2);
        goto L_0x016d;
    L_0x0058:
        r2 = r3.readStrongBinder();
        r2 = com.google.android.gms.internal.zzacw.zzz(r2);
        r1.zza(r2);
        goto L_0x016d;
    L_0x0065:
        r2 = r1.isLoading();
        goto L_0x0163;
    L_0x006b:
        r2 = com.google.android.gms.internal.zzef.zza(r3);
        r1.setManualImpressionsEnabled(r2);
        goto L_0x016d;
    L_0x0074:
        r2 = r3.readStrongBinder();
        if (r2 != 0) goto L_0x007b;
    L_0x007a:
        goto L_0x008e;
    L_0x007b:
        r3 = "com.google.android.gms.ads.internal.client.ICorrelationIdProvider";
        r3 = r2.queryLocalInterface(r3);
        r5 = r3 instanceof com.google.android.gms.internal.zzkm;
        if (r5 == 0) goto L_0x0089;
    L_0x0085:
        r5 = r3;
        r5 = (com.google.android.gms.internal.zzkm) r5;
        goto L_0x008e;
    L_0x0089:
        r5 = new com.google.android.gms.internal.zzko;
        r5.<init>(r2);
    L_0x008e:
        r1.zza(r5);
        goto L_0x016d;
    L_0x0093:
        r2 = r3.readStrongBinder();
        if (r2 != 0) goto L_0x009a;
    L_0x0099:
        goto L_0x00ad;
    L_0x009a:
        r3 = "com.google.android.gms.ads.internal.client.IAdClickListener";
        r3 = r2.queryLocalInterface(r3);
        r5 = r3 instanceof com.google.android.gms.internal.zzjn;
        if (r5 == 0) goto L_0x00a8;
    L_0x00a4:
        r5 = r3;
        r5 = (com.google.android.gms.internal.zzjn) r5;
        goto L_0x00ad;
    L_0x00a8:
        r5 = new com.google.android.gms.internal.zzjp;
        r5.<init>(r2);
    L_0x00ad:
        r1.zza(r5);
        goto L_0x016d;
    L_0x00b2:
        r2 = r3.readStrongBinder();
        r2 = com.google.android.gms.internal.zznk.zzi(r2);
        r1.zza(r2);
        goto L_0x016d;
    L_0x00bf:
        r2 = r1.getMediationAdapterClassName();
    L_0x00c3:
        r4.writeNoException();
        r4.writeString(r2);
        return r0;
    L_0x00ca:
        r2 = r3.readStrongBinder();
        r2 = com.google.android.gms.internal.zzwx.zzx(r2);
        r3 = r3.readString();
        r1.zza(r2, r3);
        goto L_0x016d;
    L_0x00db:
        r2 = r3.readStrongBinder();
        r2 = com.google.android.gms.internal.zzwr.zzv(r2);
        r1.zza(r2);
        goto L_0x016d;
    L_0x00e8:
        r2 = com.google.android.gms.internal.zziw.CREATOR;
        r2 = com.google.android.gms.internal.zzef.zza(r3, r2);
        r2 = (com.google.android.gms.internal.zziw) r2;
        r1.zza(r2);
        goto L_0x016d;
    L_0x00f5:
        r2 = r1.zzbm();
        r4.writeNoException();
        com.google.android.gms.internal.zzef.zzb(r4, r2);
        return r0;
    L_0x0100:
        r1.zzbo();
        goto L_0x016d;
    L_0x0105:
        r1.stopLoading();
        goto L_0x016d;
    L_0x010a:
        r1.showInterstitial();
        goto L_0x016d;
    L_0x010e:
        r2 = r3.readStrongBinder();
        if (r2 != 0) goto L_0x0115;
    L_0x0114:
        goto L_0x0128;
    L_0x0115:
        r3 = "com.google.android.gms.ads.internal.client.IAppEventListener";
        r3 = r2.queryLocalInterface(r3);
        r5 = r3 instanceof com.google.android.gms.internal.zzkg;
        if (r5 == 0) goto L_0x0123;
    L_0x011f:
        r5 = r3;
        r5 = (com.google.android.gms.internal.zzkg) r5;
        goto L_0x0128;
    L_0x0123:
        r5 = new com.google.android.gms.internal.zzki;
        r5.<init>(r2);
    L_0x0128:
        r1.zza(r5);
        goto L_0x016d;
    L_0x012c:
        r2 = r3.readStrongBinder();
        if (r2 != 0) goto L_0x0133;
    L_0x0132:
        goto L_0x0146;
    L_0x0133:
        r3 = "com.google.android.gms.ads.internal.client.IAdListener";
        r3 = r2.queryLocalInterface(r3);
        r5 = r3 instanceof com.google.android.gms.internal.zzjq;
        if (r5 == 0) goto L_0x0141;
    L_0x013d:
        r5 = r3;
        r5 = (com.google.android.gms.internal.zzjq) r5;
        goto L_0x0146;
    L_0x0141:
        r5 = new com.google.android.gms.internal.zzjs;
        r5.<init>(r2);
    L_0x0146:
        r1.zza(r5);
        goto L_0x016d;
    L_0x014a:
        r1.resume();
        goto L_0x016d;
    L_0x014e:
        r1.pause();
        goto L_0x016d;
    L_0x0152:
        r2 = com.google.android.gms.internal.zzis.CREATOR;
        r2 = com.google.android.gms.internal.zzef.zza(r3, r2);
        r2 = (com.google.android.gms.internal.zzis) r2;
        r2 = r1.zzb(r2);
        goto L_0x0163;
    L_0x015f:
        r2 = r1.isReady();
    L_0x0163:
        r4.writeNoException();
        com.google.android.gms.internal.zzef.zza(r4, r2);
        return r0;
    L_0x016a:
        r1.destroy();
    L_0x016d:
        r4.writeNoException();
        return r0;
    L_0x0171:
        r2 = r1.zzbl();
    L_0x0175:
        r4.writeNoException();
        com.google.android.gms.internal.zzef.zza(r4, r2);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzkc.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
