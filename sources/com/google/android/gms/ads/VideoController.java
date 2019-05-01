package com.google.android.gms.ads;

import android.support.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.internal.zzaiw;
import com.google.android.gms.internal.zzku;
import com.google.android.gms.internal.zzlz;
import com.google.android.gms.internal.zzzb;

@zzzb
public final class VideoController {
    @KeepForSdk
    public static final int PLAYBACK_STATE_ENDED = 3;
    @KeepForSdk
    public static final int PLAYBACK_STATE_PAUSED = 2;
    @KeepForSdk
    public static final int PLAYBACK_STATE_PLAYING = 1;
    @KeepForSdk
    public static final int PLAYBACK_STATE_READY = 5;
    @KeepForSdk
    public static final int PLAYBACK_STATE_UNKNOWN = 0;
    private final Object mLock = new Object();
    @Nullable
    private zzku zzald;
    @Nullable
    private VideoLifecycleCallbacks zzale;

    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z) {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }
    }

    public final float getAspectRatio() {
        synchronized (this.mLock) {
            if (this.zzald == null) {
                return 0.0f;
            }
            try {
                float aspectRatio = this.zzald.getAspectRatio();
                return aspectRatio;
            } catch (Throwable e) {
                zzaiw.zzb("Unable to call getAspectRatio on video controller.", e);
                return 0.0f;
            }
        }
    }

    @KeepForSdk
    public final int getPlaybackState() {
        synchronized (this.mLock) {
            if (this.zzald == null) {
                return 0;
            }
            try {
                int playbackState = this.zzald.getPlaybackState();
                return playbackState;
            } catch (Throwable e) {
                zzaiw.zzb("Unable to call getPlaybackState on video controller.", e);
                return 0;
            }
        }
    }

    @Nullable
    public final VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.mLock) {
            videoLifecycleCallbacks = this.zzale;
        }
        return videoLifecycleCallbacks;
    }

    public final boolean hasVideoContent() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzald != null;
        }
        return z;
    }

    @KeepForSdk
    public final boolean isClickToExpandEnabled() {
        synchronized (this.mLock) {
            if (this.zzald == null) {
                return false;
            }
            try {
                boolean isClickToExpandEnabled = this.zzald.isClickToExpandEnabled();
                return isClickToExpandEnabled;
            } catch (Throwable e) {
                zzaiw.zzb("Unable to call isClickToExpandEnabled.", e);
                return false;
            }
        }
    }

    @KeepForSdk
    public final boolean isCustomControlsEnabled() {
        synchronized (this.mLock) {
            if (this.zzald == null) {
                return false;
            }
            try {
                boolean isCustomControlsEnabled = this.zzald.isCustomControlsEnabled();
                return isCustomControlsEnabled;
            } catch (Throwable e) {
                zzaiw.zzb("Unable to call isUsingCustomPlayerControls.", e);
                return false;
            }
        }
    }

    @KeepForSdk
    public final boolean isMuted() {
        synchronized (this.mLock) {
            if (this.zzald == null) {
                return true;
            }
            try {
                boolean isMuted = this.zzald.isMuted();
                return isMuted;
            } catch (Throwable e) {
                zzaiw.zzb("Unable to call isMuted on video controller.", e);
                return true;
            }
        }
    }

    @KeepForSdk
    public final void mute(boolean z) {
        synchronized (this.mLock) {
            if (this.zzald == null) {
                return;
            }
            try {
                this.zzald.mute(z);
            } catch (Throwable e) {
                zzaiw.zzb("Unable to call mute on video controller.", e);
            }
        }
    }

    @KeepForSdk
    public final void pause() {
        synchronized (this.mLock) {
            if (this.zzald == null) {
                return;
            }
            try {
                this.zzald.pause();
            } catch (Throwable e) {
                zzaiw.zzb("Unable to call pause on video controller.", e);
            }
        }
    }

    @KeepForSdk
    public final void play() {
        synchronized (this.mLock) {
            if (this.zzald == null) {
                return;
            }
            try {
                this.zzald.play();
            } catch (Throwable e) {
                zzaiw.zzb("Unable to call play on video controller.", e);
            }
        }
    }

    public final void setVideoLifecycleCallbacks(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        zzbq.checkNotNull(videoLifecycleCallbacks, "VideoLifecycleCallbacks may not be null.");
        synchronized (this.mLock) {
            this.zzale = videoLifecycleCallbacks;
            if (this.zzald == null) {
                return;
            }
            try {
                this.zzald.zza(new zzlz(videoLifecycleCallbacks));
            } catch (Throwable e) {
                zzaiw.zzb("Unable to call setVideoLifecycleCallbacks on video controller.", e);
            }
        }
    }

    public final void zza(zzku zzku) {
        synchronized (this.mLock) {
            this.zzald = zzku;
            if (this.zzale != null) {
                setVideoLifecycleCallbacks(this.zzale);
            }
        }
    }

    public final zzku zzbe() {
        zzku zzku;
        synchronized (this.mLock) {
            zzku = this.zzald;
        }
        return zzku;
    }
}
