package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbs;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

@zzzb
public final class zzmt {
    private Context mContext;
    private String zzaus;
    private String zzbqf;
    private BlockingQueue<zznd> zzbqh;
    private ExecutorService zzbqi;
    private LinkedHashMap<String, String> zzbqj = new LinkedHashMap();
    private Map<String, zzmx> zzbqk = new HashMap();
    private AtomicBoolean zzbql;
    private File zzbqm;

    public zzmt(Context context, String str, String str2, Map<String, String> map) {
        this.mContext = context;
        this.zzaus = str;
        this.zzbqf = str2;
        this.zzbql = new AtomicBoolean(false);
        this.zzbql.set(((Boolean) zzbs.zzep().zzd(zzmq.zzbhz)).booleanValue());
        if (this.zzbql.get()) {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory != null) {
                this.zzbqm = new File(externalStorageDirectory, "sdk_csi_data.txt");
            }
        }
        for (Entry entry : map.entrySet()) {
            this.zzbqj.put((String) entry.getKey(), (String) entry.getValue());
        }
        this.zzbqh = new ArrayBlockingQueue(30);
        this.zzbqi = Executors.newSingleThreadExecutor();
        this.zzbqi.execute(new zzmu(this));
        this.zzbqk.put("action", zzmx.zzbqp);
        this.zzbqk.put("ad_format", zzmx.zzbqp);
        this.zzbqk.put("e", zzmx.zzbqq);
    }

    private final void zziv() {
        FileOutputStream fileOutputStream;
        Throwable e;
        while (true) {
            try {
                zznd zznd = (zznd) this.zzbqh.take();
                Object zzja = zznd.zzja();
                if (!TextUtils.isEmpty(zzja)) {
                    Map zza = zza(this.zzbqj, zznd.zzjb());
                    Builder buildUpon = Uri.parse(this.zzbqf).buildUpon();
                    for (Entry entry : zza.entrySet()) {
                        buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                    }
                    StringBuilder stringBuilder = new StringBuilder(buildUpon.build().toString());
                    stringBuilder.append("&it=");
                    stringBuilder.append(zzja);
                    String stringBuilder2 = stringBuilder.toString();
                    if (this.zzbql.get()) {
                        File file = this.zzbqm;
                        if (file != null) {
                            fileOutputStream = null;
                            try {
                                FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                                try {
                                    fileOutputStream2.write(stringBuilder2.getBytes());
                                    fileOutputStream2.write(10);
                                } catch (IOException e2) {
                                    e = e2;
                                    fileOutputStream = fileOutputStream2;
                                    try {
                                        zzaiw.zzc("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                                        if (fileOutputStream != null) {
                                            fileOutputStream.close();
                                        }
                                    } catch (Throwable th) {
                                        e = th;
                                    }
                                } catch (Throwable th2) {
                                    e = th2;
                                    fileOutputStream = fileOutputStream2;
                                }
                                try {
                                    fileOutputStream2.close();
                                } catch (Throwable e3) {
                                    zzaiw.zzc("CsiReporter: Cannot close file: sdk_csi_data.txt.", e3);
                                }
                            } catch (IOException e4) {
                                e3 = e4;
                                zzaiw.zzc("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e3);
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                            }
                        } else {
                            zzaiw.zzco("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
                        }
                    } else {
                        zzbs.zzec();
                        zzagr.zze(this.mContext, this.zzaus, stringBuilder2);
                    }
                }
            } catch (Throwable e32) {
                zzaiw.zzc("CsiReporter:reporter interrupted", e32);
                return;
            }
        }
        throw e32;
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (Throwable e5) {
                zzaiw.zzc("CsiReporter: Cannot close file: sdk_csi_data.txt.", e5);
            }
        }
        throw e32;
    }

    final Map<String, String> zza(Map<String, String> map, @Nullable Map<String, String> map2) {
        Map<String, String> linkedHashMap = new LinkedHashMap(map);
        if (map2 == null) {
            return linkedHashMap;
        }
        for (Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) linkedHashMap.get(str);
            linkedHashMap.put(str, zzal(str).zze(str2, (String) entry.getValue()));
        }
        return linkedHashMap;
    }

    public final boolean zza(zznd zznd) {
        return this.zzbqh.offer(zznd);
    }

    public final zzmx zzal(String str) {
        zzmx zzmx = (zzmx) this.zzbqk.get(str);
        return zzmx != null ? zzmx : zzmx.zzbqo;
    }

    public final void zzf(@Nullable List<String> list) {
        if (list != null && !list.isEmpty()) {
            this.zzbqj.put("e", TextUtils.join(",", list));
        }
    }
}
