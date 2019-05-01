package com.google.android.gms.ads.internal.gmsg;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzq;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.internal.zzaeo;
import com.google.android.gms.internal.zzagr;
import com.google.android.gms.internal.zzaiw;
import com.google.android.gms.internal.zzaiy;
import com.google.android.gms.internal.zzama;
import com.google.android.gms.internal.zzamv;
import com.google.android.gms.internal.zzamw;
import com.google.android.gms.internal.zzanj;
import com.google.android.gms.internal.zzanl;
import com.google.android.gms.internal.zzann;
import com.google.android.gms.internal.zzcs;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzvw;
import com.google.android.gms.internal.zzzb;
import java.util.Map;

@zzzb
public final class zzab<T extends zzamv & zzamw & zzanj & zzanl & zzann> implements zzt<T> {
    private final Context mContext;
    private zzaiy zzaqi;
    private zzin zzbbt;
    private zzb zzbva;
    private zzw zzbwk;
    private zzvw zzbwl;
    private final zzcs zzbwn;
    private zzq zzbwo;
    private zzn zzbwp;
    private zzama zzbwq = null;

    public zzab(Context context, zzaiy zzaiy, zzcs zzcs, zzq zzq, zzin zzin, zzb zzb, zzn zzn, zzw zzw, zzvw zzvw) {
        this.mContext = context;
        this.zzaqi = zzaiy;
        this.zzbwn = zzcs;
        this.zzbwo = zzq;
        this.zzbbt = zzin;
        this.zzbva = zzb;
        this.zzbwk = zzw;
        this.zzbwl = zzvw;
        this.zzbwp = zzn;
    }

    private static boolean zzj(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    private static int zzk(Map<String, String> map) {
        String str = (String) map.get("o");
        if (str != null) {
            if ("p".equalsIgnoreCase(str)) {
                return zzbs.zzee().zzqa();
            }
            if ("l".equalsIgnoreCase(str)) {
                return zzbs.zzee().zzpz();
            }
            if ("c".equalsIgnoreCase(str)) {
                return zzbs.zzee().zzqb();
            }
        }
        return -1;
    }

    private final void zzk(boolean z) {
        if (this.zzbwl != null) {
            this.zzbwl.zzl(z);
        }
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzamv zzamv = (zzamv) obj;
        String zzb = zzaeo.zzb((String) map.get("u"), zzamv.getContext());
        String str = (String) map.get("a");
        if (str == null) {
            zzaiw.zzco("Action missing from an open GMSG.");
        } else if (this.zzbwk != null && !this.zzbwk.zzcu()) {
            this.zzbwk.zzs(zzb);
        } else if ("expand".equalsIgnoreCase(str)) {
            if (((zzamw) zzamv).zzst()) {
                zzaiw.zzco("Cannot expand WebView that is already expanded.");
                return;
            }
            zzk(false);
            ((zzanj) zzamv).zza(zzj(map), zzk(map));
        } else if ("webapp".equalsIgnoreCase(str)) {
            zzk(false);
            if (zzb != null) {
                ((zzanj) zzamv).zza(zzj(map), zzk(map), zzb);
            } else {
                ((zzanj) zzamv).zza(zzj(map), zzk(map), (String) map.get("html"), (String) map.get("baseurl"));
            }
        } else if ("app".equalsIgnoreCase(str) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            zzk(true);
            zzamv.getContext();
            if (TextUtils.isEmpty(zzb)) {
                zzaiw.zzco("Destination url cannot be empty.");
                return;
            }
            r1 = zzamv.getContext();
            r2 = ((zzanl) zzamv).zzss();
            r3 = (zzann) zzamv;
            if (r3 == null) {
                throw null;
            }
            try {
                ((zzanj) zzamv).zza(new zzc(new zzac(r1, r2, (View) r3).zzl(map)));
            } catch (ActivityNotFoundException e) {
                zzaiw.zzco(e.getMessage());
            }
        } else {
            Intent parseUri;
            String str2;
            Uri data;
            Context context;
            zzcs zzss;
            zzann zzann;
            zzk(true);
            str = (String) map.get("intent_url");
            if (!TextUtils.isEmpty(str)) {
                try {
                    parseUri = Intent.parseUri(str, 0);
                } catch (Throwable e2) {
                    str2 = "Error parsing the url: ";
                    str = String.valueOf(str);
                    zzaiw.zzb(str.length() != 0 ? str2.concat(str) : new String(str2), e2);
                }
                if (!(parseUri == null || parseUri.getData() == null)) {
                    data = parseUri.getData();
                    str2 = data.toString();
                    if (!TextUtils.isEmpty(str2)) {
                        try {
                            zzbs.zzec();
                            context = zzamv.getContext();
                            zzss = ((zzanl) zzamv).zzss();
                            zzann = (zzann) zzamv;
                            if (zzann != null) {
                                throw null;
                            }
                            str2 = zzagr.zza(context, zzss, str2, (View) zzann);
                            try {
                                data = Uri.parse(str2);
                            } catch (Throwable e3) {
                                String str3 = "Error parsing the uri: ";
                                str2 = String.valueOf(str2);
                                zzaiw.zzb(str2.length() != 0 ? str3.concat(str2) : new String(str3), e3);
                                zzbs.zzeg().zza(e3, "OpenGmsgHandler.onGmsg");
                            }
                        } catch (Throwable e32) {
                            zzaiw.zzb("Error occurred while adding signals.", e32);
                            zzbs.zzeg().zza(e32, "OpenGmsgHandler.onGmsg");
                        }
                    }
                    parseUri.setData(data);
                }
                if (parseUri == null) {
                    ((zzanj) zzamv).zza(new zzc(parseUri));
                }
                if (!TextUtils.isEmpty(zzb)) {
                    zzbs.zzec();
                    r1 = zzamv.getContext();
                    r2 = ((zzanl) zzamv).zzss();
                    r3 = (zzann) zzamv;
                    if (r3 != null) {
                        throw null;
                    }
                    zzb = zzagr.zza(r1, r2, zzb, (View) r3);
                }
                ((zzanj) zzamv).zza(new zzc((String) map.get("i"), zzb, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e")));
                return;
            }
            parseUri = null;
            data = parseUri.getData();
            str2 = data.toString();
            if (TextUtils.isEmpty(str2)) {
                zzbs.zzec();
                context = zzamv.getContext();
                zzss = ((zzanl) zzamv).zzss();
                zzann = (zzann) zzamv;
                if (zzann != null) {
                    str2 = zzagr.zza(context, zzss, str2, (View) zzann);
                    data = Uri.parse(str2);
                } else {
                    throw null;
                }
            }
            parseUri.setData(data);
            if (parseUri == null) {
                if (TextUtils.isEmpty(zzb)) {
                    zzbs.zzec();
                    r1 = zzamv.getContext();
                    r2 = ((zzanl) zzamv).zzss();
                    r3 = (zzann) zzamv;
                    if (r3 != null) {
                        zzb = zzagr.zza(r1, r2, zzb, (View) r3);
                    } else {
                        throw null;
                    }
                }
                ((zzanj) zzamv).zza(new zzc((String) map.get("i"), zzb, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e")));
                return;
            }
            ((zzanj) zzamv).zza(new zzc(parseUri));
        }
    }
}
