package com.google.android.gms.ads.internal.gmsg;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.internal.zzagr;
import com.google.android.gms.internal.zzaiw;
import com.google.android.gms.internal.zzama;
import java.util.HashMap;
import java.util.Map;

final class zzk implements zzt<zzama> {
    zzk() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzama zzama = (zzama) obj;
        WindowManager windowManager = (WindowManager) zzama.getContext().getSystemService("window");
        zzbs.zzec();
        View view = (View) zzama;
        DisplayMetrics zza = zzagr.zza(windowManager);
        int i = zza.widthPixels;
        int i2 = zza.heightPixels;
        int[] iArr = new int[2];
        Map hashMap = new HashMap();
        view.getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i2));
        zzama.zza("locationReady", hashMap);
        zzaiw.zzco("GET LOCATION COMPILED");
    }
}
