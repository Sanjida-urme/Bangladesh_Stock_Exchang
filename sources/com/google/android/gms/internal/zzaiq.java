package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.VideoCapabilities;
import android.media.MediaCodecList;
import android.os.Build.VERSION;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@zzzb
public final class zzaiq {
    private static Map<String, List<Map<String, Object>>> zzdbk = new HashMap();
    private static List<MediaCodecInfo> zzdbl;
    private static final Object zzdbm = new Object();

    @TargetApi(21)
    private static Integer[] zza(Range<Integer> range) {
        return new Integer[]{(Integer) range.getLower(), (Integer) range.getUpper()};
    }

    @TargetApi(16)
    public static List<Map<String, Object>> zzck(String str) {
        synchronized (zzdbm) {
            if (zzdbk.containsKey(str)) {
                return (List) zzdbk.get(str);
            }
            List arrayList;
            try {
                synchronized (zzdbm) {
                    if (zzdbl == null) {
                        List asList;
                        if (VERSION.SDK_INT >= 21) {
                            asList = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                        } else if (VERSION.SDK_INT >= 16) {
                            int codecCount = MediaCodecList.getCodecCount();
                            zzdbl = new ArrayList(codecCount);
                            for (int i = 0; i < codecCount; i++) {
                                zzdbl.add(MediaCodecList.getCodecInfoAt(i));
                            }
                        } else {
                            asList = Collections.emptyList();
                        }
                        zzdbl = asList;
                    }
                }
                arrayList = new ArrayList();
                for (MediaCodecInfo mediaCodecInfo : zzdbl) {
                    if (!mediaCodecInfo.isEncoder() && Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str)) {
                        Map hashMap = new HashMap();
                        hashMap.put("codecName", mediaCodecInfo.getName());
                        CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                        ArrayList arrayList2 = new ArrayList();
                        for (CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                            arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                        }
                        hashMap.put("profileLevels", arrayList2);
                        if (VERSION.SDK_INT >= 21) {
                            VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                            hashMap.put("bitRatesBps", zza(videoCapabilities.getBitrateRange()));
                            hashMap.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                            hashMap.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                            hashMap.put("frameRates", zza(videoCapabilities.getSupportedFrameRates()));
                            hashMap.put("widths", zza(videoCapabilities.getSupportedWidths()));
                            hashMap.put("heights", zza(videoCapabilities.getSupportedHeights()));
                        }
                        if (VERSION.SDK_INT >= 23) {
                            hashMap.put("instancesLimit", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                        }
                        arrayList.add(hashMap);
                    }
                }
                zzdbk.put(str, arrayList);
                return arrayList;
            } catch (RuntimeException e) {
                Map hashMap2 = new HashMap();
                hashMap2.put("error", e.getClass().getSimpleName());
                arrayList = new ArrayList();
                arrayList.add(hashMap2);
                zzdbk.put(str, arrayList);
                return arrayList;
            }
        }
    }
}
