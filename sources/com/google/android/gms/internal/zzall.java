package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;

@zzzb
@TargetApi(14)
public final class zzall implements OnAudioFocusChangeListener {
    private final AudioManager mAudioManager;
    private boolean zzdel;
    private final zzalm zzdhe;
    private boolean zzdhf;
    private boolean zzdhg;
    private float zzdhh = 1.0f;

    public zzall(Context context, zzalm zzalm) {
        this.mAudioManager = (AudioManager) context.getSystemService("audio");
        this.zzdhe = zzalm;
    }

    private final void zzsh() {
        boolean z = false;
        Object obj = (!this.zzdel || this.zzdhg || this.zzdhh <= 0.0f) ? null : 1;
        if (obj == null || this.zzdhf) {
            if (obj == null && this.zzdhf) {
                if (this.mAudioManager != null) {
                    if (this.zzdhf) {
                        if (this.mAudioManager.abandonAudioFocus(this) == 0) {
                            z = true;
                        }
                        this.zzdhf = z;
                    }
                }
                this.zzdhe.zzrd();
            }
            return;
        }
        if (this.mAudioManager != null) {
            if (!this.zzdhf) {
                if (this.mAudioManager.requestAudioFocus(this, 3, 2) == 1) {
                    z = true;
                }
                this.zzdhf = z;
            }
        }
        this.zzdhe.zzrd();
    }

    public final float getVolume() {
        return this.zzdhf ? this.zzdhg ? 0.0f : this.zzdhh : 0.0f;
    }

    public final void onAudioFocusChange(int i) {
        this.zzdhf = i > 0;
        this.zzdhe.zzrd();
    }

    public final void setMuted(boolean z) {
        this.zzdhg = z;
        zzsh();
    }

    public final void zzb(float f) {
        this.zzdhh = f;
        zzsh();
    }

    public final void zzse() {
        this.zzdel = true;
        zzsh();
    }

    public final void zzsf() {
        this.zzdel = false;
        zzsh();
    }
}
