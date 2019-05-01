package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.view.InputDeviceCompat;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.common.internal.zzc;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@zzzb
public final class zzakw extends FrameLayout implements zzakt {
    private final zzali zzdef;
    private final FrameLayout zzdeg;
    private final zznd zzdeh;
    private final zzalk zzdei;
    private final long zzdej;
    @Nullable
    private zzaku zzdek;
    private boolean zzdel;
    private boolean zzdem;
    private boolean zzden;
    private boolean zzdeo;
    private long zzdep;
    private long zzdeq;
    private String zzder;
    private Bitmap zzdes;
    private ImageView zzdet;
    private boolean zzdeu;

    public zzakw(Context context, zzali zzali, int i, boolean z, zznd zznd, zzalh zzalh) {
        Context context2 = context;
        super(context2);
        zzali zzali2 = zzali;
        this.zzdef = zzali2;
        zznd zznd2 = zznd;
        this.zzdeh = zznd2;
        this.zzdeg = new FrameLayout(context2);
        addView(this.zzdeg, new LayoutParams(-1, -1));
        zzc.zzu(zzali2.zzbk());
        this.zzdek = zzali2.zzbk().zzanr.zza(context2, zzali2, i, z, zznd2, zzalh);
        if (this.zzdek != null) {
            r0.zzdeg.addView(r0.zzdek, new LayoutParams(-1, -1, 17));
            if (((Boolean) zzbs.zzep().zzd(zzmq.zzbgz)).booleanValue()) {
                zzrn();
            }
        }
        r0.zzdet = new ImageView(context2);
        r0.zzdej = ((Long) zzbs.zzep().zzd(zzmq.zzbhd)).longValue();
        r0.zzdeo = ((Boolean) zzbs.zzep().zzd(zzmq.zzbhb)).booleanValue();
        if (r0.zzdeh != null) {
            r0.zzdeh.zzf("spinner_used", r0.zzdeo ? "1" : "0");
        }
        r0.zzdei = new zzalk(r0);
        if (r0.zzdek != null) {
            r0.zzdek.zza(r0);
        }
        if (r0.zzdek == null) {
            zzg("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    public static void zza(zzali zzali) {
        Map hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "no_video_view");
        zzali.zza("onVideoEvent", hashMap);
    }

    public static void zza(zzali zzali, String str) {
        Map hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
        hashMap.put("error", str);
        zzali.zza("onVideoEvent", hashMap);
    }

    public static void zza(zzali zzali, Map<String, List<Map<String, Object>>> map) {
        Map hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
        hashMap.put("mimeTypes", map);
        zzali.zza("onVideoEvent", hashMap);
    }

    private final void zza(String str, String... strArr) {
        Map hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, str);
        Object obj = null;
        for (Object obj2 : strArr) {
            if (obj == null) {
                obj = obj2;
            } else {
                hashMap.put(obj, obj2);
                obj = null;
            }
        }
        this.zzdef.zza("onVideoEvent", hashMap);
    }

    private final boolean zzrp() {
        return this.zzdet.getParent() != null;
    }

    private final void zzrq() {
        if (!(this.zzdef.zzrz() == null || !this.zzdem || this.zzden)) {
            this.zzdef.zzrz().getWindow().clearFlags(128);
            this.zzdem = false;
        }
    }

    public final void destroy() {
        this.zzdei.pause();
        if (this.zzdek != null) {
            this.zzdek.stop();
        }
        zzrq();
    }

    public final void onPaused() {
        zza("pause", new String[0]);
        zzrq();
        this.zzdel = false;
    }

    public final void pause() {
        if (this.zzdek != null) {
            this.zzdek.pause();
        }
    }

    public final void play() {
        if (this.zzdek != null) {
            this.zzdek.play();
        }
    }

    public final void seekTo(int i) {
        if (this.zzdek != null) {
            this.zzdek.seekTo(i);
        }
    }

    public final void zza(float f, float f2) {
        if (this.zzdek != null) {
            this.zzdek.zza(f, f2);
        }
    }

    public final void zzb(float f) {
        if (this.zzdek != null) {
            zzaku zzaku = this.zzdek;
            zzaku.zzdee.zzb(f);
            zzaku.zzrd();
        }
    }

    public final void zzcp(String str) {
        this.zzder = str;
    }

    public final void zzd(int i, int i2, int i3, int i4) {
        if (i3 != 0 && i4 != 0) {
            ViewGroup.LayoutParams layoutParams = new LayoutParams(i3, i4);
            layoutParams.setMargins(i, i2, 0, 0);
            this.zzdeg.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    public final void zzf(int i, int i2) {
        if (this.zzdeo) {
            i = Math.max(i / ((Integer) zzbs.zzep().zzd(zzmq.zzbhc)).intValue(), 1);
            i2 = Math.max(i2 / ((Integer) zzbs.zzep().zzd(zzmq.zzbhc)).intValue(), 1);
            if (this.zzdes == null || this.zzdes.getWidth() != i || this.zzdes.getHeight() != i2) {
                this.zzdes = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
                this.zzdeu = false;
            }
        }
    }

    @TargetApi(14)
    public final void zzf(MotionEvent motionEvent) {
        if (this.zzdek != null) {
            this.zzdek.dispatchTouchEvent(motionEvent);
        }
    }

    public final void zzg(String str, @Nullable String str2) {
        zza("error", "what", str, "extra", str2);
    }

    public final void zzre() {
        this.zzdei.resume();
        zzagr.zzczc.post(new zzakx(this));
    }

    public final void zzrf() {
        if (this.zzdek != null && this.zzdeq == 0) {
            float duration = ((float) this.zzdek.getDuration()) / 1000.0f;
            int videoWidth = this.zzdek.getVideoWidth();
            int videoHeight = this.zzdek.getVideoHeight();
            zza("canplaythrough", "duration", String.valueOf(duration), "videoWidth", String.valueOf(videoWidth), "videoHeight", String.valueOf(videoHeight));
        }
    }

    public final void zzrg() {
        if (!(this.zzdef.zzrz() == null || this.zzdem)) {
            this.zzden = (this.zzdef.zzrz().getWindow().getAttributes().flags & 128) != 0;
            if (!this.zzden) {
                this.zzdef.zzrz().getWindow().addFlags(128);
                this.zzdem = true;
            }
        }
        this.zzdel = true;
    }

    public final void zzrh() {
        zza("ended", new String[0]);
        zzrq();
    }

    public final void zzri() {
        if (!(!this.zzdeu || this.zzdes == null || zzrp())) {
            this.zzdet.setImageBitmap(this.zzdes);
            this.zzdet.invalidate();
            this.zzdeg.addView(this.zzdet, new LayoutParams(-1, -1));
            this.zzdeg.bringChildToFront(this.zzdet);
        }
        this.zzdei.pause();
        this.zzdeq = this.zzdep;
        zzagr.zzczc.post(new zzaky(this));
    }

    public final void zzrj() {
        if (this.zzdel && zzrp()) {
            this.zzdeg.removeView(this.zzdet);
        }
        if (this.zzdes != null) {
            long elapsedRealtime = zzbs.zzei().elapsedRealtime();
            if (this.zzdek.getBitmap(this.zzdes) != null) {
                this.zzdeu = true;
            }
            long elapsedRealtime2 = zzbs.zzei().elapsedRealtime() - elapsedRealtime;
            if (zzafj.zzpt()) {
                StringBuilder stringBuilder = new StringBuilder(46);
                stringBuilder.append("Spinner frame grab took ");
                stringBuilder.append(elapsedRealtime2);
                stringBuilder.append("ms");
                zzafj.m5v(stringBuilder.toString());
            }
            if (elapsedRealtime2 > this.zzdej) {
                zzaiw.zzco("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.zzdeo = false;
                this.zzdes = null;
                if (this.zzdeh != null) {
                    this.zzdeh.zzf("spinner_jank", Long.toString(elapsedRealtime2));
                }
            }
        }
    }

    public final void zzrk() {
        if (this.zzdek != null) {
            if (TextUtils.isEmpty(this.zzder)) {
                zza("no_src", new String[0]);
            } else {
                this.zzdek.setVideoPath(this.zzder);
            }
        }
    }

    public final void zzrl() {
        if (this.zzdek != null) {
            zzaku zzaku = this.zzdek;
            zzaku.zzdee.setMuted(true);
            zzaku.zzrd();
        }
    }

    public final void zzrm() {
        if (this.zzdek != null) {
            zzaku zzaku = this.zzdek;
            zzaku.zzdee.setMuted(false);
            zzaku.zzrd();
        }
    }

    @TargetApi(14)
    public final void zzrn() {
        if (this.zzdek != null) {
            View textView = new TextView(this.zzdek.getContext());
            String str = "AdMob - ";
            String valueOf = String.valueOf(this.zzdek.zzqz());
            textView.setText(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            textView.setTextColor(SupportMenu.CATEGORY_MASK);
            textView.setBackgroundColor(InputDeviceCompat.SOURCE_ANY);
            this.zzdeg.addView(textView, new LayoutParams(-2, -2, 17));
            this.zzdeg.bringChildToFront(textView);
        }
    }

    final void zzro() {
        if (this.zzdek != null) {
            long currentPosition = (long) this.zzdek.getCurrentPosition();
            if (this.zzdep != currentPosition && currentPosition > 0) {
                float f = ((float) currentPosition) / 1000.0f;
                zza("timeupdate", "time", String.valueOf(f));
                this.zzdep = currentPosition;
            }
        }
    }
}
