package com.google.android.gms.internal;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.C0231R;
import com.google.android.gms.ads.internal.zzbs;
import java.util.Map;

@zzzb
public final class zzvz extends zzwg {
    private final Context mContext;
    private final Map<String, String> zzbqw;

    public zzvz(zzama zzama, Map<String, String> map) {
        super(zzama, "storePicture");
        this.zzbqw = map;
        this.mContext = zzama.zzrz();
    }

    public final void execute() {
        if (this.mContext == null) {
            zzbl("Activity context is not available");
            return;
        }
        zzbs.zzec();
        if (zzagr.zzak(this.mContext).zzin()) {
            String str = (String) this.zzbqw.get("iurl");
            if (TextUtils.isEmpty(str)) {
                zzbl("Image url cannot be empty.");
                return;
            } else if (URLUtil.isValidUrl(str)) {
                r1 = Uri.parse(str).getLastPathSegment();
                zzbs.zzec();
                if (zzagr.zzce(r1)) {
                    Resources resources = zzbs.zzeg().getResources();
                    zzbs.zzec();
                    Builder zzaj = zzagr.zzaj(this.mContext);
                    zzaj.setTitle(resources != null ? resources.getString(C0231R.string.s1) : "Save image");
                    zzaj.setMessage(resources != null ? resources.getString(C0231R.string.s2) : "Allow Ad to store image in Picture gallery?");
                    zzaj.setPositiveButton(resources != null ? resources.getString(C0231R.string.s3) : "Accept", new zzwa(this, str, r1));
                    zzaj.setNegativeButton(resources != null ? resources.getString(C0231R.string.s4) : "Decline", new zzwb(this));
                    zzaj.create().show();
                    return;
                }
                str = "Image type not recognized: ";
                r1 = String.valueOf(r1);
                zzbl(r1.length() != 0 ? str.concat(r1) : new String(str));
                return;
            } else {
                r1 = "Invalid image url: ";
                str = String.valueOf(str);
                zzbl(str.length() != 0 ? r1.concat(str) : new String(r1));
                return;
            }
        }
        zzbl("Feature is not supported by the device.");
    }
}
