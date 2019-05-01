package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.ads.internal.zzbs;
import java.util.Map;

@zzzb
public final class zzalp implements zzt<zzali> {
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzali zzali = (zzali) obj;
        if (((Boolean) zzbs.zzep().zzd(zzmq.zzblk)).booleanValue()) {
            zzamr zzrx = zzali.zzrx();
            if (zzrx == null) {
                try {
                    zzamr zzamr = new zzamr(zzali, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                    zzali.zza(zzamr);
                    zzrx = zzamr;
                } catch (Throwable e) {
                    zzaiw.zzb("Unable to parse videoMeta message.", e);
                    zzbs.zzeg().zza(e, "VideoMetaGmsgHandler.onGmsg");
                }
            }
            boolean equals = "1".equals(map.get("muted"));
            float parseFloat = Float.parseFloat((String) map.get("currentTime"));
            int parseInt = Integer.parseInt((String) map.get("playbackState"));
            if (parseInt < 0 || 3 < parseInt) {
                parseInt = 0;
            }
            String str = (String) map.get("aspectRatio");
            float parseFloat2 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
            if (zzaiw.zzae(3)) {
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 79);
                stringBuilder.append("Video Meta GMSG: isMuted : ");
                stringBuilder.append(equals);
                stringBuilder.append(" , playbackState : ");
                stringBuilder.append(parseInt);
                stringBuilder.append(" , aspectRatio : ");
                stringBuilder.append(str);
                zzaiw.zzbw(stringBuilder.toString());
            }
            zzrx.zza(parseFloat, parseInt, equals, parseFloat2);
        }
    }
}
