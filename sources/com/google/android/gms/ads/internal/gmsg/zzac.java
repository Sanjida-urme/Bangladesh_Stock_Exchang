package com.google.android.gms.ads.internal.gmsg;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.internal.zzagr;
import com.google.android.gms.internal.zzcs;
import com.google.android.gms.internal.zzmq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class zzac {
    private final Context mContext;
    private final View mView;
    private final zzcs zzbwr;

    public zzac(Context context, zzcs zzcs, View view) {
        this.mContext = context;
        this.zzbwr = zzcs;
        this.mView = view;
    }

    private static Intent zza(Intent intent, ResolveInfo resolveInfo) {
        Intent intent2 = new Intent(intent);
        intent2.setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        return intent2;
    }

    private final ResolveInfo zza(Intent intent, ArrayList<ResolveInfo> arrayList) {
        ResolveInfo resolveInfo = null;
        try {
            PackageManager packageManager = this.mContext.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            Collection queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
            if (queryIntentActivities != null && resolveActivity != null) {
                for (int i = 0; i < queryIntentActivities.size(); i++) {
                    ResolveInfo resolveInfo2 = (ResolveInfo) queryIntentActivities.get(i);
                    if (resolveActivity != null && resolveActivity.activityInfo.name.equals(resolveInfo2.activityInfo.name)) {
                        resolveInfo = resolveActivity;
                        break;
                    }
                }
            }
            arrayList.addAll(queryIntentActivities);
            return resolveInfo;
        } catch (Throwable th) {
            zzbs.zzeg().zza(th, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
            return null;
        }
    }

    private final ResolveInfo zzb(Intent intent) {
        return zza(intent, new ArrayList());
    }

    private static Intent zze(Uri uri) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    public final Intent zzl(Map<String, String> map) {
        ActivityManager activityManager = (ActivityManager) this.mContext.getSystemService("activity");
        String str = (String) map.get("u");
        Uri uri = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Object obj;
        Builder buildUpon;
        String str2;
        ArrayList arrayList;
        Intent zze;
        Intent zze2;
        ResolveInfo zza;
        Intent zza2;
        List<RunningAppProcessInfo> runningAppProcesses;
        ArrayList arrayList2;
        int size;
        int i;
        Object obj2;
        ResolveInfo resolveInfo;
        zzbs.zzec();
        Uri parse = Uri.parse(zzagr.zza(this.mContext, this.zzbwr, str, this.mView));
        boolean parseBoolean = Boolean.parseBoolean((String) map.get("use_first_package"));
        boolean parseBoolean2 = Boolean.parseBoolean((String) map.get("use_running_process"));
        if (!Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
            if (!((Boolean) zzbs.zzep().zzd(zzmq.zzbox)).booleanValue()) {
                obj = null;
                if ("http".equalsIgnoreCase(parse.getScheme())) {
                    if ("https".equalsIgnoreCase(parse.getScheme())) {
                        buildUpon = parse.buildUpon();
                        str2 = "http";
                    }
                    arrayList = new ArrayList();
                    zze = zze(parse);
                    zze2 = zze(uri);
                    if (obj != null) {
                        zzbs.zzec();
                        zzagr.zzb(this.mContext, zze);
                        zzbs.zzec();
                        zzagr.zzb(this.mContext, zze2);
                    }
                    zza = zza(zze, arrayList);
                    if (zza == null) {
                        return zza(zze, zza);
                    }
                    if (zze2 != null) {
                        zza = zzb(zze2);
                        if (zza != null) {
                            zza2 = zza(zze, zza);
                            if (zzb(zza2) != null) {
                                return zza2;
                            }
                        }
                    }
                    if (arrayList.size() != 0) {
                        return zze;
                    }
                    if (parseBoolean2 && activityManager != null) {
                        runningAppProcesses = activityManager.getRunningAppProcesses();
                        if (runningAppProcesses != null) {
                            arrayList2 = arrayList;
                            size = arrayList2.size();
                            i = 0;
                            while (i < size) {
                                obj2 = arrayList2.get(i);
                                i++;
                                resolveInfo = (ResolveInfo) obj2;
                                for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                                    if (runningAppProcessInfo.processName.equals(resolveInfo.activityInfo.packageName)) {
                                        return zza(zze, resolveInfo);
                                    }
                                }
                            }
                        }
                    }
                    return parseBoolean ? zza(zze, (ResolveInfo) arrayList.get(0)) : zze;
                } else {
                    buildUpon = parse.buildUpon();
                    str2 = "https";
                }
                uri = buildUpon.scheme(str2).build();
                arrayList = new ArrayList();
                zze = zze(parse);
                zze2 = zze(uri);
                if (obj != null) {
                    zzbs.zzec();
                    zzagr.zzb(this.mContext, zze);
                    zzbs.zzec();
                    zzagr.zzb(this.mContext, zze2);
                }
                zza = zza(zze, arrayList);
                if (zza == null) {
                    return zza(zze, zza);
                }
                if (zze2 != null) {
                    zza = zzb(zze2);
                    if (zza != null) {
                        zza2 = zza(zze, zza);
                        if (zzb(zza2) != null) {
                            return zza2;
                        }
                    }
                }
                if (arrayList.size() != 0) {
                    return zze;
                }
                runningAppProcesses = activityManager.getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    arrayList2 = arrayList;
                    size = arrayList2.size();
                    i = 0;
                    while (i < size) {
                        obj2 = arrayList2.get(i);
                        i++;
                        resolveInfo = (ResolveInfo) obj2;
                        while (r8.hasNext()) {
                            if (runningAppProcessInfo.processName.equals(resolveInfo.activityInfo.packageName)) {
                                return zza(zze, resolveInfo);
                            }
                        }
                    }
                }
                if (parseBoolean) {
                }
            }
        }
        obj = 1;
        if ("http".equalsIgnoreCase(parse.getScheme())) {
            if ("https".equalsIgnoreCase(parse.getScheme())) {
                buildUpon = parse.buildUpon();
                str2 = "http";
            }
            arrayList = new ArrayList();
            zze = zze(parse);
            zze2 = zze(uri);
            if (obj != null) {
                zzbs.zzec();
                zzagr.zzb(this.mContext, zze);
                zzbs.zzec();
                zzagr.zzb(this.mContext, zze2);
            }
            zza = zza(zze, arrayList);
            if (zza == null) {
                return zza(zze, zza);
            }
            if (zze2 != null) {
                zza = zzb(zze2);
                if (zza != null) {
                    zza2 = zza(zze, zza);
                    if (zzb(zza2) != null) {
                        return zza2;
                    }
                }
            }
            if (arrayList.size() != 0) {
                return zze;
            }
            runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses != null) {
                arrayList2 = arrayList;
                size = arrayList2.size();
                i = 0;
                while (i < size) {
                    obj2 = arrayList2.get(i);
                    i++;
                    resolveInfo = (ResolveInfo) obj2;
                    while (r8.hasNext()) {
                        if (runningAppProcessInfo.processName.equals(resolveInfo.activityInfo.packageName)) {
                            return zza(zze, resolveInfo);
                        }
                    }
                }
            }
            if (parseBoolean) {
            }
        }
        buildUpon = parse.buildUpon();
        str2 = "https";
        uri = buildUpon.scheme(str2).build();
        arrayList = new ArrayList();
        zze = zze(parse);
        zze2 = zze(uri);
        if (obj != null) {
            zzbs.zzec();
            zzagr.zzb(this.mContext, zze);
            zzbs.zzec();
            zzagr.zzb(this.mContext, zze2);
        }
        zza = zza(zze, arrayList);
        if (zza == null) {
            return zza(zze, zza);
        }
        if (zze2 != null) {
            zza = zzb(zze2);
            if (zza != null) {
                zza2 = zza(zze, zza);
                if (zzb(zza2) != null) {
                    return zza2;
                }
            }
        }
        if (arrayList.size() != 0) {
            return zze;
        }
        runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses != null) {
            arrayList2 = arrayList;
            size = arrayList2.size();
            i = 0;
            while (i < size) {
                obj2 = arrayList2.get(i);
                i++;
                resolveInfo = (ResolveInfo) obj2;
                while (r8.hasNext()) {
                    if (runningAppProcessInfo.processName.equals(resolveInfo.activityInfo.packageName)) {
                        return zza(zze, resolveInfo);
                    }
                }
            }
        }
        if (parseBoolean) {
        }
    }
}
