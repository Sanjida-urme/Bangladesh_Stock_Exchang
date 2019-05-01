package com.google.android.gms.internal;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.zzbs;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@zzzb
public final class zzahj {
    private final Context mContext;
    private int mState;
    private String zzaou;
    private String zzaus;
    private final float zzcfv;
    private String zzczo;
    private float zzczp;
    private float zzczq;
    private float zzczr;

    public zzahj(Context context) {
        this.mState = 0;
        this.mContext = context;
        this.zzcfv = context.getResources().getDisplayMetrics().density;
    }

    public zzahj(Context context, String str) {
        this(context);
        this.zzczo = str;
    }

    private static int zza(List<String> list, String str, boolean z) {
        if (!z) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zza(int r5, float r6, float r7) {
        /*
        r4 = this;
        if (r5 != 0) goto L_0x000c;
    L_0x0002:
        r5 = 0;
        r4.mState = r5;
        r4.zzczp = r6;
        r4.zzczq = r7;
        r4.zzczr = r7;
        return;
    L_0x000c:
        r0 = r4.mState;
        r1 = -1;
        if (r0 != r1) goto L_0x0012;
    L_0x0011:
        return;
    L_0x0012:
        r0 = 2;
        r2 = 1;
        if (r5 != r0) goto L_0x008e;
    L_0x0016:
        r5 = r4.zzczq;
        r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1));
        if (r5 <= 0) goto L_0x001f;
    L_0x001c:
        r4.zzczq = r7;
        goto L_0x0027;
    L_0x001f:
        r5 = r4.zzczr;
        r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1));
        if (r5 >= 0) goto L_0x0027;
    L_0x0025:
        r4.zzczr = r7;
    L_0x0027:
        r5 = r4.zzczq;
        r7 = r4.zzczr;
        r5 = r5 - r7;
        r7 = 1106247680; // 0x41f00000 float:30.0 double:5.465589745E-315;
        r3 = r4.zzcfv;
        r3 = r3 * r7;
        r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));
        if (r5 <= 0) goto L_0x0039;
    L_0x0036:
        r4.mState = r1;
        return;
    L_0x0039:
        r5 = r4.mState;
        r7 = 3;
        if (r5 == 0) goto L_0x005a;
    L_0x003e:
        r5 = r4.mState;
        if (r5 != r0) goto L_0x0043;
    L_0x0042:
        goto L_0x005a;
    L_0x0043:
        r5 = r4.mState;
        if (r5 == r2) goto L_0x004b;
    L_0x0047:
        r5 = r4.mState;
        if (r5 != r7) goto L_0x006f;
    L_0x004b:
        r5 = r4.zzczp;
        r5 = r6 - r5;
        r1 = -1035468800; // 0xffffffffc2480000 float:-50.0 double:NaN;
        r3 = r4.zzcfv;
        r3 = r3 * r1;
        r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));
        if (r5 > 0) goto L_0x006f;
    L_0x0059:
        goto L_0x0068;
    L_0x005a:
        r5 = r4.zzczp;
        r5 = r6 - r5;
        r1 = 1112014848; // 0x42480000 float:50.0 double:5.49408334E-315;
        r3 = r4.zzcfv;
        r3 = r3 * r1;
        r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));
        if (r5 < 0) goto L_0x006f;
    L_0x0068:
        r4.zzczp = r6;
        r5 = r4.mState;
        r5 = r5 + r2;
        r4.mState = r5;
    L_0x006f:
        r5 = r4.mState;
        if (r5 == r2) goto L_0x0085;
    L_0x0073:
        r5 = r4.mState;
        if (r5 != r7) goto L_0x0078;
    L_0x0077:
        goto L_0x0085;
    L_0x0078:
        r5 = r4.mState;
        if (r5 != r0) goto L_0x0098;
    L_0x007c:
        r5 = r4.zzczp;
        r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1));
        if (r5 >= 0) goto L_0x0098;
    L_0x0082:
        r4.zzczp = r6;
        return;
    L_0x0085:
        r5 = r4.zzczp;
        r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1));
        if (r5 <= 0) goto L_0x0098;
    L_0x008b:
        r4.zzczp = r6;
        return;
    L_0x008e:
        if (r5 != r2) goto L_0x0098;
    L_0x0090:
        r5 = r4.mState;
        r6 = 4;
        if (r5 != r6) goto L_0x0098;
    L_0x0095:
        r4.showDialog();
    L_0x0098:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzahj.zza(int, float, float):void");
    }

    private final void zzqg() {
        if (this.mContext instanceof Activity) {
            Builder builder;
            Object obj = this.zzczo;
            if (!TextUtils.isEmpty(obj)) {
                Uri build = new Uri.Builder().encodedQuery(obj.replaceAll("\\+", "%20")).build();
                StringBuilder stringBuilder = new StringBuilder();
                zzbs.zzec();
                Map zzf = zzagr.zzf(build);
                for (String str : zzf.keySet()) {
                    stringBuilder.append(str);
                    stringBuilder.append(" = ");
                    stringBuilder.append((String) zzf.get(str));
                    stringBuilder.append("\n\n");
                }
                obj = stringBuilder.toString().trim();
                if (!TextUtils.isEmpty(obj)) {
                    builder = new Builder(this.mContext);
                    builder.setMessage(obj);
                    builder.setTitle("Ad Information");
                    builder.setPositiveButton("Share", new zzahl(this, obj));
                    builder.setNegativeButton("Close", new zzahm(this));
                    builder.create().show();
                    return;
                }
            }
            obj = "No debug information";
            builder = new Builder(this.mContext);
            builder.setMessage(obj);
            builder.setTitle("Ad Information");
            builder.setPositiveButton("Share", new zzahl(this, obj));
            builder.setNegativeButton("Close", new zzahm(this));
            builder.create().show();
            return;
        }
        zzaiw.zzcn("Can not create dialog without Activity Context");
    }

    private final void zzqh() {
        zzaiw.zzbw("Debug mode [Creative Preview] selected.");
        zzagl.zza(new zzahn(this));
    }

    private final void zzqi() {
        zzaiw.zzbw("Debug mode [Troubleshooting] selected.");
        zzagl.zza(new zzaho(this));
    }

    public final void setAdUnitId(String str) {
        this.zzaou = str;
    }

    public final void showDialog() {
        if (!((Boolean) zzbs.zzep().zzd(zzmq.zzbpa)).booleanValue()) {
            if (!((Boolean) zzbs.zzep().zzd(zzmq.zzboz)).booleanValue()) {
                zzqg();
                return;
            }
        }
        if (this.mContext instanceof Activity) {
            String str = !TextUtils.isEmpty(zzbs.zzel().zzqj()) ? "Creative Preview (Enabled)" : "Creative Preview";
            String str2 = zzbs.zzel().zzqk() ? "Troubleshooting (Enabled)" : "Troubleshooting";
            List arrayList = new ArrayList();
            int zza = zza(arrayList, "Ad Information", true);
            int zza2 = zza(arrayList, str, ((Boolean) zzbs.zzep().zzd(zzmq.zzboz)).booleanValue());
            int zza3 = zza(arrayList, str2, ((Boolean) zzbs.zzep().zzd(zzmq.zzbpa)).booleanValue());
            Builder builder = new Builder(this.mContext, zzbs.zzee().zzqe());
            builder.setTitle("Select a Debug Mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new zzahk(this, zza, zza2, zza3));
            builder.create().show();
            return;
        }
        zzaiw.zzcn("Can not create dialog without Activity Context");
    }

    public final void zzci(String str) {
        this.zzaus = str;
    }

    public final void zzcj(String str) {
        this.zzczo = str;
    }

    public final void zze(MotionEvent motionEvent) {
        int historySize = motionEvent.getHistorySize();
        for (int i = 0; i < historySize; i++) {
            zza(motionEvent.getActionMasked(), motionEvent.getHistoricalX(0, i), motionEvent.getHistoricalY(0, i));
        }
        zza(motionEvent.getActionMasked(), motionEvent.getX(), motionEvent.getY());
    }
}
