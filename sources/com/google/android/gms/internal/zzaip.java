package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

final class zzaip implements Callable<String> {
    private /* synthetic */ Context val$context;
    private /* synthetic */ Context zzdbj;

    zzaip(zzaio zzaio, Context context, Context context2) {
        this.zzdbj = context;
        this.val$context = context2;
    }

    public final /* synthetic */ Object call() throws Exception {
        SharedPreferences sharedPreferences;
        int i = 0;
        if (this.zzdbj != null) {
            zzafj.m5v("Attempting to read user agent from Google Play Services.");
            sharedPreferences = this.zzdbj.getSharedPreferences("admob_user_agent", 0);
        } else {
            zzafj.m5v("Attempting to read user agent from local cache.");
            sharedPreferences = this.val$context.getSharedPreferences("admob_user_agent", 0);
            i = 1;
        }
        Object string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            zzafj.m5v("Reading user agent from WebSettings");
            string = WebSettings.getDefaultUserAgent(this.val$context);
            if (i != 0) {
                sharedPreferences.edit().putString("user_agent", string).apply();
                zzafj.m5v("Persisting user agent.");
            }
        }
        return string;
    }
}
