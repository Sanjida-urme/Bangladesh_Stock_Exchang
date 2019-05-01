package com.diziito.stock;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class WebView extends AppCompatActivity {
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;
    private android.webkit.WebView webview;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0222R.layout.activity_web_view);
        MobileAds.initialize(this, "ca-app-pub-9372747959845606~8878605912");
        bundle = new AdView(this);
        bundle.setAdSize(AdSize.BANNER);
        bundle.setAdUnitId("ca-app-pub-9372747959845606/8882459436");
        this.mAdView = (AdView) findViewById(C0222R.id.adView);
        this.mAdView.loadAd(new Builder().build());
        bundle = getIntent().getStringExtra("url");
        this.webview = (android.webkit.WebView) findViewById(C0222R.id.webViewpage);
        this.webview.setWebViewClient(new WebViewClient());
        this.webview.getSettings().setJavaScriptEnabled(true);
        this.webview.getSettings().setDomStorageEnabled(true);
        this.webview.setOverScrollMode(2);
        this.webview.loadUrl(bundle);
    }
}
