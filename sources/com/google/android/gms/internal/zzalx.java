package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.ads.internal.zzbs;
import java.util.Map;

@zzzb
public final class zzalx implements zzt<zzali> {
    @Nullable
    private zzalt zzdhu;

    private static java.lang.Integer zze(java.util.Map<java.lang.String, java.lang.String> r3, java.lang.String r4) {
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
        r0 = r3.containsKey(r4);
        r1 = 0;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = r3.get(r4);	 Catch:{ NumberFormatException -> 0x0017 }
        r0 = (java.lang.String) r0;	 Catch:{ NumberFormatException -> 0x0017 }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x0017 }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ NumberFormatException -> 0x0017 }
        return r0;
    L_0x0017:
        r3 = r3.get(r4);
        r3 = (java.lang.String) r3;
        r0 = java.lang.String.valueOf(r4);
        r0 = r0.length();
        r0 = r0 + 39;
        r2 = java.lang.String.valueOf(r3);
        r2 = r2.length();
        r0 = r0 + r2;
        r2 = new java.lang.StringBuilder;
        r2.<init>(r0);
        r0 = "Precache invalid numeric parameter '";
        r2.append(r0);
        r2.append(r4);
        r4 = "': ";
        r2.append(r4);
        r2.append(r3);
        r3 = r2.toString();
        com.google.android.gms.internal.zzaiw.zzco(r3);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzalx.zze(java.util.Map, java.lang.String):java.lang.Integer");
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzali zzali = (zzali) obj;
        zzbs.zzey();
        if (!map.containsKey("abort")) {
            String str = (String) map.get("src");
            if (str != null) {
                if (this.zzdhu != null) {
                    zzaiw.zzco("Threadless precache task has already started.");
                    return;
                } else if (zzals.zzc(zzali) != null) {
                    zzaiw.zzco("Precache task is already running.");
                    return;
                } else if (zzali.zzbk() == null) {
                    zzaiw.zzco("Precache requires a dependency provider.");
                    return;
                } else {
                    Object obj2;
                    int i;
                    zzalh zzalh = new zzalh((String) map.get("flags"));
                    Integer zze = zze(map, "notifyBytes");
                    Integer zze2 = zze(map, "notifyMillis");
                    Integer zze3 = zze(map, "player");
                    int i2 = 0;
                    if (zze3 == null) {
                        zze3 = Integer.valueOf(0);
                    }
                    zzalt zza = zzali.zzbk().zzanq.zza(zzali, zze3.intValue(), null, zzalh);
                    if (zze == null) {
                        if (zze2 == null) {
                            obj2 = null;
                            if (obj2 != null) {
                                for (String str2 : zzalh.zzdgk.split(",")) {
                                    if (str2.equals("1") && !str2.equals("2")) {
                                        i2 = 1;
                                        break;
                                    }
                                }
                                if (i2 != 0) {
                                    if (zze == null) {
                                        zze.intValue();
                                    } else {
                                        zze2.intValue();
                                    }
                                    this.zzdhu = zza;
                                }
                            }
                            new zzalq(zzali, zza, str).zzmx();
                        }
                    }
                    obj2 = 1;
                    if (obj2 != null) {
                        for (i = 0; i < r7; i++) {
                            if (str2.equals("1")) {
                            }
                        }
                        if (i2 != 0) {
                            if (zze == null) {
                                zze2.intValue();
                            } else {
                                zze.intValue();
                            }
                            this.zzdhu = zza;
                        }
                    }
                    new zzalq(zzali, zza, str).zzmx();
                }
            } else if (zzals.zzc(zzali) == null && this.zzdhu == null) {
                zzaiw.zzco("Precache must specify a source.");
                return;
            }
            Integer zze4 = zze(map, "minBufferMs");
            if (zze4 != null) {
                zze4.intValue();
            }
            zze4 = zze(map, "maxBufferMs");
            if (zze4 != null) {
                zze4.intValue();
            }
            zze4 = zze(map, "bufferForPlaybackMs");
            if (zze4 != null) {
                zze4.intValue();
            }
            zze4 = zze(map, "bufferForPlaybackAfterRebufferMs");
            if (zze4 != null) {
                zze4.intValue();
            }
        } else if (this.zzdhu != null) {
            this.zzdhu.abort();
        } else {
            if (!zzals.zzb(zzali)) {
                zzaiw.zzco("Precache abort but no precache task running.");
            }
        }
    }
}
