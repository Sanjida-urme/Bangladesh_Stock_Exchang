package com.diziito.stock;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class FirstPageActivity extends AppCompatActivity {
    Button b01;
    Button b02;
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;

    /* renamed from: com.diziito.stock.FirstPageActivity$2 */
    class C02202 implements OnClickListener {
        C02202() {
        }

        public void onClick(View view) {
            Toast.makeText(FirstPageActivity.this.getApplicationContext(), "Stock Exchange Analysis", 0).show();
            FirstPageActivity.this.startActivity(new Intent(FirstPageActivity.this, StockViewActivity.class));
            if (FirstPageActivity.this.mInterstitialAd.isLoaded() != null) {
                FirstPageActivity.this.mInterstitialAd.show();
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.");
            }
        }
    }

    /* renamed from: com.diziito.stock.FirstPageActivity$3 */
    class C02213 implements OnClickListener {
        C02213() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(FirstPageActivity.this, WebView.class);
            intent.putExtra("url", "http://m.dsemonitor.com/");
            FirstPageActivity.this.startActivity(intent);
            if (FirstPageActivity.this.mInterstitialAd.isLoaded() != null) {
                FirstPageActivity.this.mInterstitialAd.show();
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.");
            }
        }
    }

    /* renamed from: com.diziito.stock.FirstPageActivity$1 */
    class C02851 extends AdListener {
        C02851() {
        }

        public void onAdClosed() {
            FirstPageActivity.this.mInterstitialAd.loadAd(new Builder().build());
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0222R.layout.activity_first_page);
        MobileAds.initialize(this, "ca-app-pub-9372747959845606~8878605912");
        this.mAdView = (AdView) findViewById(C0222R.id.adView);
        this.mAdView.loadAd(new Builder().build());
        bundle = new AdView(this);
        bundle.setAdSize(AdSize.BANNER);
        bundle.setAdUnitId("ca-app-pub-9372747959845606/8882459436");
        this.mInterstitialAd = new InterstitialAd(this);
        this.mInterstitialAd.setAdUnitId("ca-app-pub-9372747959845606/5138671453");
        this.mInterstitialAd.loadAd(new Builder().build());
        this.mInterstitialAd.setAdListener(new C02851());
        this.b01 = (Button) findViewById(C0222R.id.fstB);
        this.b02 = (Button) findViewById(C0222R.id.secB);
        this.b01.setOnClickListener(new C02202());
        this.b02.setOnClickListener(new C02213());
    }
}
