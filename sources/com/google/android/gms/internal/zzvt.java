package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract.Events;
import android.text.TextUtils;
import com.google.android.gms.C0231R;
import com.google.android.gms.ads.internal.zzbs;
import java.util.Map;

@zzzb
public final class zzvt extends zzwg {
    private final Context mContext;
    private final Map<String, String> zzbqw;
    private String zzcep = zzbj("description");
    private long zzceq = zzbk("start_ticks");
    private long zzcer = zzbk("end_ticks");
    private String zzces = zzbj("summary");
    private String zzcet = zzbj("location");

    public zzvt(zzama zzama, Map<String, String> map) {
        super(zzama, "createCalendarEvent");
        this.zzbqw = map;
        this.mContext = zzama.zzrz();
    }

    private final String zzbj(String str) {
        return TextUtils.isEmpty((CharSequence) this.zzbqw.get(str)) ? "" : (String) this.zzbqw.get(str);
    }

    private final long zzbk(java.lang.String r5) {
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
        r4 = this;
        r0 = r4.zzbqw;
        r5 = r0.get(r5);
        r5 = (java.lang.String) r5;
        r0 = -1;
        if (r5 != 0) goto L_0x000d;
    L_0x000c:
        return r0;
    L_0x000d:
        r2 = java.lang.Long.parseLong(r5);	 Catch:{ NumberFormatException -> 0x0012 }
        return r2;
    L_0x0012:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzvt.zzbk(java.lang.String):long");
    }

    @TargetApi(14)
    final Intent createIntent() {
        Intent data = new Intent("android.intent.action.EDIT").setData(Events.CONTENT_URI);
        data.putExtra("title", this.zzcep);
        data.putExtra("eventLocation", this.zzcet);
        data.putExtra("description", this.zzces);
        if (this.zzceq > -1) {
            data.putExtra("beginTime", this.zzceq);
        }
        if (this.zzcer > -1) {
            data.putExtra("endTime", this.zzcer);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void execute() {
        if (this.mContext == null) {
            zzbl("Activity context is not available.");
            return;
        }
        zzbs.zzec();
        if (zzagr.zzak(this.mContext).zzio()) {
            zzbs.zzec();
            Builder zzaj = zzagr.zzaj(this.mContext);
            Resources resources = zzbs.zzeg().getResources();
            zzaj.setTitle(resources != null ? resources.getString(C0231R.string.s5) : "Create calendar event");
            zzaj.setMessage(resources != null ? resources.getString(C0231R.string.s6) : "Allow Ad to create a calendar event?");
            zzaj.setPositiveButton(resources != null ? resources.getString(C0231R.string.s3) : "Accept", new zzvu(this));
            zzaj.setNegativeButton(resources != null ? resources.getString(C0231R.string.s4) : "Decline", new zzvv(this));
            zzaj.create().show();
            return;
        }
        zzbl("This feature is not available on the device.");
    }
}
