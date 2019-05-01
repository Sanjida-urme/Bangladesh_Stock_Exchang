package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import com.google.android.gms.ads.internal.zzbs;
import java.util.HashMap;
import java.util.Map;

@zzzb
@TargetApi(14)
public final class zzakk extends zzaku implements OnBufferingUpdateListener, OnCompletionListener, OnErrorListener, OnInfoListener, OnPreparedListener, OnVideoSizeChangedListener, SurfaceTextureListener {
    private static final Map<Integer, String> zzddi = new HashMap();
    private final zzalj zzddj;
    private final boolean zzddk;
    private int zzddl = 0;
    private int zzddm = 0;
    private MediaPlayer zzddn;
    private Uri zzddo;
    private int zzddp;
    private int zzddq;
    private int zzddr;
    private int zzdds;
    private int zzddt;
    private zzalg zzddu;
    private boolean zzddv;
    private int zzddw;
    private zzakt zzddx;

    static {
        if (VERSION.SDK_INT >= 17) {
            zzddi.put(Integer.valueOf(-1004), "MEDIA_ERROR_IO");
            zzddi.put(Integer.valueOf(-1007), "MEDIA_ERROR_MALFORMED");
            zzddi.put(Integer.valueOf(-1010), "MEDIA_ERROR_UNSUPPORTED");
            zzddi.put(Integer.valueOf(-110), "MEDIA_ERROR_TIMED_OUT");
            zzddi.put(Integer.valueOf(3), "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        zzddi.put(Integer.valueOf(100), "MEDIA_ERROR_SERVER_DIED");
        zzddi.put(Integer.valueOf(1), "MEDIA_ERROR_UNKNOWN");
        zzddi.put(Integer.valueOf(1), "MEDIA_INFO_UNKNOWN");
        zzddi.put(Integer.valueOf(700), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        zzddi.put(Integer.valueOf(701), "MEDIA_INFO_BUFFERING_START");
        zzddi.put(Integer.valueOf(702), "MEDIA_INFO_BUFFERING_END");
        zzddi.put(Integer.valueOf(800), "MEDIA_INFO_BAD_INTERLEAVING");
        zzddi.put(Integer.valueOf(801), "MEDIA_INFO_NOT_SEEKABLE");
        zzddi.put(Integer.valueOf(802), "MEDIA_INFO_METADATA_UPDATE");
        if (VERSION.SDK_INT >= 19) {
            zzddi.put(Integer.valueOf(901), "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            zzddi.put(Integer.valueOf(902), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }

    public zzakk(Context context, boolean z, boolean z2, zzalh zzalh, zzalj zzalj) {
        super(context);
        setSurfaceTextureListener(this);
        this.zzddj = zzalj;
        this.zzddv = z;
        this.zzddk = z2;
        this.zzddj.zza(this);
    }

    private final void zza(float r2) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/558922244.run(Unknown Source)
*/
        /*
        r1 = this;
        r0 = r1.zzddn;
        if (r0 == 0) goto L_0x000a;
    L_0x0004:
        r0 = r1.zzddn;	 Catch:{ IllegalStateException -> 0x0009 }
        r0.setVolume(r2, r2);	 Catch:{ IllegalStateException -> 0x0009 }
    L_0x0009:
        return;
    L_0x000a:
        r2 = "AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().";
        com.google.android.gms.internal.zzaiw.zzco(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzakk.zza(float):void");
    }

    private final void zzaa(boolean z) {
        zzafj.m5v("AdMediaPlayerView release");
        if (this.zzddu != null) {
            this.zzddu.zzrs();
            this.zzddu = null;
        }
        if (this.zzddn != null) {
            this.zzddn.reset();
            this.zzddn.release();
            this.zzddn = null;
            zzaf(0);
            if (z) {
                this.zzddm = 0;
                this.zzddm = 0;
            }
        }
    }

    private final void zzaf(int i) {
        if (i == 3) {
            this.zzddj.zzse();
            this.zzdee.zzse();
        } else if (this.zzddl == 3) {
            this.zzddj.zzsf();
            this.zzdee.zzsf();
        }
        this.zzddl = i;
    }

    private final void zzra() {
        zzafj.m5v("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.zzddo != null && surfaceTexture != null) {
            zzaa(false);
            try {
                zzbs.zzeu();
                this.zzddn = new MediaPlayer();
                this.zzddn.setOnBufferingUpdateListener(this);
                this.zzddn.setOnCompletionListener(this);
                this.zzddn.setOnErrorListener(this);
                this.zzddn.setOnInfoListener(this);
                this.zzddn.setOnPreparedListener(this);
                this.zzddn.setOnVideoSizeChangedListener(this);
                this.zzddr = 0;
                if (this.zzddv) {
                    this.zzddu = new zzalg(getContext());
                    this.zzddu.zza(surfaceTexture, getWidth(), getHeight());
                    this.zzddu.start();
                    SurfaceTexture zzrt = this.zzddu.zzrt();
                    if (zzrt != null) {
                        surfaceTexture = zzrt;
                    } else {
                        this.zzddu.zzrs();
                        this.zzddu = null;
                    }
                }
                this.zzddn.setDataSource(getContext(), this.zzddo);
                zzbs.zzev();
                this.zzddn.setSurface(new Surface(surfaceTexture));
                this.zzddn.setAudioStreamType(3);
                this.zzddn.setScreenOnWhilePlaying(true);
                this.zzddn.prepareAsync();
                zzaf(1);
            } catch (Throwable e) {
                String valueOf = String.valueOf(this.zzddo);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 36);
                stringBuilder.append("Failed to initialize MediaPlayer at ");
                stringBuilder.append(valueOf);
                zzaiw.zzc(stringBuilder.toString(), e);
                onError(this.zzddn, 1, 0);
            }
        }
    }

    private final void zzrb() {
        if (this.zzddk && zzrc() && this.zzddn.getCurrentPosition() > 0 && this.zzddm != 3) {
            zzafj.m5v("AdMediaPlayerView nudging MediaPlayer");
            zza(0.0f);
            this.zzddn.start();
            int currentPosition = this.zzddn.getCurrentPosition();
            long currentTimeMillis = zzbs.zzei().currentTimeMillis();
            while (zzrc() && this.zzddn.getCurrentPosition() == currentPosition) {
                if (zzbs.zzei().currentTimeMillis() - currentTimeMillis > 250) {
                    break;
                }
            }
            this.zzddn.pause();
            zzrd();
        }
    }

    private final boolean zzrc() {
        return (this.zzddn == null || this.zzddl == -1 || this.zzddl == 0 || this.zzddl == 1) ? false : true;
    }

    public final int getCurrentPosition() {
        return zzrc() ? this.zzddn.getCurrentPosition() : 0;
    }

    public final int getDuration() {
        return zzrc() ? this.zzddn.getDuration() : -1;
    }

    public final int getVideoHeight() {
        return this.zzddn != null ? this.zzddn.getVideoHeight() : 0;
    }

    public final int getVideoWidth() {
        return this.zzddn != null ? this.zzddn.getVideoWidth() : 0;
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.zzddr = i;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        zzafj.m5v("AdMediaPlayerView completion");
        zzaf(5);
        this.zzddm = 5;
        zzagr.zzczc.post(new zzakm(this));
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        String str = (String) zzddi.get(Integer.valueOf(i));
        String str2 = (String) zzddi.get(Integer.valueOf(i2));
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 38) + String.valueOf(str2).length());
        stringBuilder.append("AdMediaPlayerView MediaPlayer error: ");
        stringBuilder.append(str);
        stringBuilder.append(":");
        stringBuilder.append(str2);
        zzaiw.zzco(stringBuilder.toString());
        zzaf(-1);
        this.zzddm = -1;
        zzagr.zzczc.post(new zzakn(this, str, str2));
        return true;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        String str = (String) zzddi.get(Integer.valueOf(i));
        String str2 = (String) zzddi.get(Integer.valueOf(i2));
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 37) + String.valueOf(str2).length());
        stringBuilder.append("AdMediaPlayerView MediaPlayer info: ");
        stringBuilder.append(str);
        stringBuilder.append(":");
        stringBuilder.append(str2);
        zzafj.m5v(stringBuilder.toString());
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final void onMeasure(int r6, int r7) {
        /*
        r5 = this;
        r0 = r5.zzddp;
        r0 = getDefaultSize(r0, r6);
        r1 = r5.zzddq;
        r1 = getDefaultSize(r1, r7);
        r2 = r5.zzddp;
        if (r2 <= 0) goto L_0x008e;
    L_0x0010:
        r2 = r5.zzddq;
        if (r2 <= 0) goto L_0x008e;
    L_0x0014:
        r2 = r5.zzddu;
        if (r2 != 0) goto L_0x008e;
    L_0x0018:
        r0 = android.view.View.MeasureSpec.getMode(r6);
        r6 = android.view.View.MeasureSpec.getSize(r6);
        r1 = android.view.View.MeasureSpec.getMode(r7);
        r7 = android.view.View.MeasureSpec.getSize(r7);
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r0 != r2) goto L_0x0055;
    L_0x002c:
        if (r1 != r2) goto L_0x0055;
    L_0x002e:
        r0 = r5.zzddp;
        r0 = r0 * r7;
        r1 = r5.zzddq;
        r1 = r1 * r6;
        if (r0 >= r1) goto L_0x0042;
    L_0x0038:
        r6 = r5.zzddp;
        r6 = r6 * r7;
        r0 = r5.zzddq;
        r0 = r6 / r0;
        r6 = r0;
        goto L_0x0090;
    L_0x0042:
        r0 = r5.zzddp;
        r0 = r0 * r7;
        r1 = r5.zzddq;
        r1 = r1 * r6;
        if (r0 <= r1) goto L_0x0090;
    L_0x004c:
        r7 = r5.zzddq;
        r7 = r7 * r6;
        r0 = r5.zzddp;
        r1 = r7 / r0;
        goto L_0x008f;
    L_0x0055:
        r3 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r0 != r2) goto L_0x0067;
    L_0x0059:
        r0 = r5.zzddq;
        r0 = r0 * r6;
        r2 = r5.zzddp;
        r0 = r0 / r2;
        if (r1 != r3) goto L_0x0065;
    L_0x0062:
        if (r0 <= r7) goto L_0x0065;
    L_0x0064:
        goto L_0x0090;
    L_0x0065:
        r7 = r0;
        goto L_0x0090;
    L_0x0067:
        if (r1 != r2) goto L_0x0077;
    L_0x0069:
        r1 = r5.zzddp;
        r1 = r1 * r7;
        r2 = r5.zzddq;
        r1 = r1 / r2;
        if (r0 != r3) goto L_0x0075;
    L_0x0072:
        if (r1 <= r6) goto L_0x0075;
    L_0x0074:
        goto L_0x0090;
    L_0x0075:
        r6 = r1;
        goto L_0x0090;
    L_0x0077:
        r2 = r5.zzddp;
        r4 = r5.zzddq;
        if (r1 != r3) goto L_0x0087;
    L_0x007d:
        if (r4 <= r7) goto L_0x0087;
    L_0x007f:
        r1 = r5.zzddp;
        r1 = r1 * r7;
        r2 = r5.zzddq;
        r1 = r1 / r2;
        goto L_0x0089;
    L_0x0087:
        r1 = r2;
        r7 = r4;
    L_0x0089:
        if (r0 != r3) goto L_0x0075;
    L_0x008b:
        if (r1 <= r6) goto L_0x0075;
    L_0x008d:
        goto L_0x004c;
    L_0x008e:
        r6 = r0;
    L_0x008f:
        r7 = r1;
    L_0x0090:
        r5.setMeasuredDimension(r6, r7);
        r0 = r5.zzddu;
        if (r0 == 0) goto L_0x009c;
    L_0x0097:
        r0 = r5.zzddu;
        r0.zzh(r6, r7);
    L_0x009c:
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 16;
        if (r0 != r1) goto L_0x00b9;
    L_0x00a2:
        r0 = r5.zzdds;
        if (r0 <= 0) goto L_0x00aa;
    L_0x00a6:
        r0 = r5.zzdds;
        if (r0 != r6) goto L_0x00b2;
    L_0x00aa:
        r0 = r5.zzddt;
        if (r0 <= 0) goto L_0x00b5;
    L_0x00ae:
        r0 = r5.zzddt;
        if (r0 == r7) goto L_0x00b5;
    L_0x00b2:
        r5.zzrb();
    L_0x00b5:
        r5.zzdds = r6;
        r5.zzddt = r7;
    L_0x00b9:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzakk.onMeasure(int, int):void");
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        zzafj.m5v("AdMediaPlayerView prepared");
        zzaf(2);
        this.zzddj.zzrf();
        zzagr.zzczc.post(new zzakl(this));
        this.zzddp = mediaPlayer.getVideoWidth();
        this.zzddq = mediaPlayer.getVideoHeight();
        if (this.zzddw != 0) {
            seekTo(this.zzddw);
        }
        zzrb();
        int i = this.zzddp;
        int i2 = this.zzddq;
        StringBuilder stringBuilder = new StringBuilder(62);
        stringBuilder.append("AdMediaPlayerView stream dimensions: ");
        stringBuilder.append(i);
        stringBuilder.append(" x ");
        stringBuilder.append(i2);
        zzaiw.zzcn(stringBuilder.toString());
        if (this.zzddm == 3) {
            play();
        }
        zzrd();
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzafj.m5v("AdMediaPlayerView surface created");
        zzra();
        zzagr.zzczc.post(new zzako(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzafj.m5v("AdMediaPlayerView surface destroyed");
        if (this.zzddn != null && this.zzddw == 0) {
            this.zzddw = this.zzddn.getCurrentPosition();
        }
        if (this.zzddu != null) {
            this.zzddu.zzrs();
        }
        zzagr.zzczc.post(new zzakq(this));
        zzaa(true);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        zzafj.m5v("AdMediaPlayerView surface changed");
        Object obj = null;
        Object obj2 = this.zzddm == 3 ? 1 : null;
        if (this.zzddp == i && this.zzddq == i2) {
            obj = 1;
        }
        if (!(this.zzddn == null || obj2 == null || r0 == null)) {
            if (this.zzddw != 0) {
                seekTo(this.zzddw);
            }
            play();
        }
        if (this.zzddu != null) {
            this.zzddu.zzh(i, i2);
        }
        zzagr.zzczc.post(new zzakp(this, i, i2));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzddj.zzb(this);
        this.zzded.zza(surfaceTexture, this.zzddx);
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder(57);
        stringBuilder.append("AdMediaPlayerView size changed: ");
        stringBuilder.append(i);
        stringBuilder.append(" x ");
        stringBuilder.append(i2);
        zzafj.m5v(stringBuilder.toString());
        this.zzddp = mediaPlayer.getVideoWidth();
        this.zzddq = mediaPlayer.getVideoHeight();
        if (this.zzddp != 0 && this.zzddq != 0) {
            requestLayout();
        }
    }

    public final void pause() {
        zzafj.m5v("AdMediaPlayerView pause");
        if (zzrc() && this.zzddn.isPlaying()) {
            this.zzddn.pause();
            zzaf(4);
            zzagr.zzczc.post(new zzaks(this));
        }
        this.zzddm = 4;
    }

    public final void play() {
        zzafj.m5v("AdMediaPlayerView play");
        if (zzrc()) {
            this.zzddn.start();
            zzaf(3);
            this.zzded.zzrg();
            zzagr.zzczc.post(new zzakr(this));
        }
        this.zzddm = 3;
    }

    public final void seekTo(int i) {
        StringBuilder stringBuilder = new StringBuilder(34);
        stringBuilder.append("AdMediaPlayerView seek ");
        stringBuilder.append(i);
        zzafj.m5v(stringBuilder.toString());
        if (zzrc()) {
            this.zzddn.seekTo(i);
            this.zzddw = 0;
            return;
        }
        this.zzddw = i;
    }

    public final void setVideoPath(String str) {
        Uri parse = Uri.parse(str);
        zzhu zzd = zzhu.zzd(parse);
        if (zzd != null) {
            parse = Uri.parse(zzd.url);
        }
        this.zzddo = parse;
        this.zzddw = 0;
        zzra();
        requestLayout();
        invalidate();
    }

    public final void stop() {
        zzafj.m5v("AdMediaPlayerView stop");
        if (this.zzddn != null) {
            this.zzddn.stop();
            this.zzddn.release();
            this.zzddn = null;
            zzaf(0);
            this.zzddm = 0;
        }
        this.zzddj.onStop();
    }

    public final String toString() {
        String name = getClass().getName();
        String toHexString = Integer.toHexString(hashCode());
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(name).length() + 1) + String.valueOf(toHexString).length());
        stringBuilder.append(name);
        stringBuilder.append("@");
        stringBuilder.append(toHexString);
        return stringBuilder.toString();
    }

    public final void zza(float f, float f2) {
        if (this.zzddu != null) {
            this.zzddu.zzb(f, f2);
        }
    }

    public final void zza(zzakt zzakt) {
        this.zzddx = zzakt;
    }

    public final String zzqz() {
        String str = "MediaPlayer";
        String valueOf = String.valueOf(this.zzddv ? " spherical" : "");
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public final void zzrd() {
        zza(this.zzdee.getVolume());
    }
}
