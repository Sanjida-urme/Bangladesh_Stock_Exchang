package com.diziito.stock;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class AboutAppActivity extends AppCompatActivity {
    private AdView mAdView;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0222R.layout.activity_about_app);
        MobileAds.initialize(this, "ca-app-pub-9372747959845606~8878605912");
        this.mAdView = (AdView) findViewById(C0222R.id.adView);
        this.mAdView.loadAd(new Builder().build());
        bundle = new AdView(this);
        bundle.setAdSize(AdSize.BANNER);
        bundle.setAdUnitId("ca-app-pub-9372747959845606/8882459436");
    }
}
