package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@zzzb
public final class zziv {
    public static final zziv zzbcz = new zziv();

    protected zziv() {
    }

    public static zzis zza(Context context, zzlc zzlc) {
        Context context2;
        List list;
        String zza;
        zzlc zzlc2 = zzlc;
        Date birthday = zzlc.getBirthday();
        long time = birthday != null ? birthday.getTime() : -1;
        String contentUrl = zzlc.getContentUrl();
        int gender = zzlc.getGender();
        Collection keywords = zzlc.getKeywords();
        if (keywords.isEmpty()) {
            context2 = context;
            list = null;
        } else {
            list = Collections.unmodifiableList(new ArrayList(keywords));
            context2 = context;
        }
        boolean isTestDevice = zzlc2.isTestDevice(context2);
        int zzii = zzlc.zzii();
        Location location = zzlc.getLocation();
        Bundle networkExtrasBundle = zzlc2.getNetworkExtrasBundle(AdMobAdapter.class);
        boolean manualImpressionsEnabled = zzlc.getManualImpressionsEnabled();
        String publisherProvidedId = zzlc.getPublisherProvidedId();
        SearchAdRequest zzif = zzlc.zzif();
        zzlw zzlw = zzif != null ? new zzlw(zzif) : null;
        context2 = context.getApplicationContext();
        if (context2 != null) {
            String packageName = context2.getPackageName();
            zzjk.zzhx();
            zza = zzais.zza(Thread.currentThread().getStackTrace(), packageName);
        } else {
            zza = null;
        }
        return new zzis(7, time, networkExtrasBundle, gender, list, isTestDevice, zzii, manualImpressionsEnabled, publisherProvidedId, zzlw, location, contentUrl, zzlc.zzih(), zzlc.getCustomTargeting(), Collections.unmodifiableList(new ArrayList(zzlc.zzij())), zzlc.zzie(), zza, zzlc.isDesignedForFamilies());
    }
}
