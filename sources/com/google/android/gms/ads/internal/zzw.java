package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.internal.zzaaf;
import com.google.android.gms.internal.zzaeh;
import com.google.android.gms.internal.zzagr;
import com.google.android.gms.internal.zzzb;

@zzzb
public final class zzw {
    private final Context mContext;
    private boolean zzanu;
    private zzaeh zzanv;
    private zzaaf zzanw;

    public zzw(Context context, zzaeh zzaeh, zzaaf zzaaf) {
        this.mContext = context;
        this.zzanv = zzaeh;
        this.zzanw = zzaaf;
        if (this.zzanw == null) {
            this.zzanw = new zzaaf();
        }
    }

    private final boolean zzct() {
        return (this.zzanv != null && this.zzanv.zzoe().zzcvb) || this.zzanw.zzcog;
    }

    public final void recordClick() {
        this.zzanu = true;
    }

    public final boolean zzcu() {
        if (zzct()) {
            if (!this.zzanu) {
                return false;
            }
        }
        return true;
    }

    public final void zzs(@Nullable String str) {
        if (zzct()) {
            if (str == null) {
                str = "";
            }
            if (this.zzanv != null) {
                this.zzanv.zza(str, null, 3);
                return;
            }
            if (this.zzanw.zzcog && this.zzanw.zzcoh != null) {
                for (String str2 : this.zzanw.zzcoh) {
                    String str22;
                    if (!TextUtils.isEmpty(str22)) {
                        str22 = str22.replace("{NAVIGATION_URL}", Uri.encode(str));
                        zzbs.zzec();
                        zzagr.zze(this.mContext, "", str22);
                    }
                }
            }
        }
    }
}
