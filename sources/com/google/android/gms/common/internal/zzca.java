package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.C0231R;

public final class zzca {
    private final Resources zzfzj;
    private final String zzfzk = this.zzfzj.getResourcePackageName(C0231R.string.common_google_play_services_unknown_issue);

    public zzca(Context context) {
        zzbq.checkNotNull(context);
        this.zzfzj = context.getResources();
    }

    public final String getString(String str) {
        int identifier = this.zzfzj.getIdentifier(str, "string", this.zzfzk);
        return identifier == 0 ? null : this.zzfzj.getString(identifier);
    }
}
