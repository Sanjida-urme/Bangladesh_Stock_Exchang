package com.google.android.gms.internal;

import com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks;

public final class zzlz extends zzky {
    private final VideoLifecycleCallbacks zzale;

    public zzlz(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        this.zzale = videoLifecycleCallbacks;
    }

    public final void onVideoEnd() {
        this.zzale.onVideoEnd();
    }

    public final void onVideoMute(boolean z) {
        this.zzale.onVideoMute(z);
    }

    public final void onVideoPause() {
        this.zzale.onVideoPause();
    }

    public final void onVideoPlay() {
        this.zzale.onVideoPlay();
    }

    public final void onVideoStart() {
        this.zzale.onVideoStart();
    }
}
