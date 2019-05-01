package com.diziito.stock;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class StockViewActivity extends AppCompatActivity {
    Button b1;
    Button b10;
    Button b11;
    Button b12;
    Button b13;
    Button b14;
    Button b15;
    Button b16;
    Button b17;
    Button b18;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;

    /* renamed from: com.diziito.stock.StockViewActivity$2 */
    class C02232 implements OnClickListener {
        C02232() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(StockViewActivity.this, WebView.class);
            intent.putExtra("url", "https://www.dsebd.org/");
            StockViewActivity.this.startActivity(intent);
            if (StockViewActivity.this.mInterstitialAd.isLoaded() != null) {
                StockViewActivity.this.mInterstitialAd.show();
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.");
            }
        }
    }

    /* renamed from: com.diziito.stock.StockViewActivity$3 */
    class C02243 implements OnClickListener {
        C02243() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(StockViewActivity.this, WebView.class);
            intent.putExtra("url", "https://bangla.dsebd.org/index.php");
            StockViewActivity.this.startActivity(intent);
            if (StockViewActivity.this.mInterstitialAd.isLoaded() != null) {
                StockViewActivity.this.mInterstitialAd.show();
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.");
            }
        }
    }

    /* renamed from: com.diziito.stock.StockViewActivity$4 */
    class C02254 implements OnClickListener {
        C02254() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(StockViewActivity.this, WebView.class);
            intent.putExtra("url", "http://www.cse.com.bd/");
            StockViewActivity.this.startActivity(intent);
            if (StockViewActivity.this.mInterstitialAd.isLoaded() != null) {
                StockViewActivity.this.mInterstitialAd.show();
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.");
            }
        }
    }

    /* renamed from: com.diziito.stock.StockViewActivity$5 */
    class C02265 implements OnClickListener {
        C02265() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(StockViewActivity.this, WebView.class);
            intent.putExtra("url", "http://m.dsemonitor.com/");
            StockViewActivity.this.startActivity(intent);
            if (StockViewActivity.this.mInterstitialAd.isLoaded() != null) {
                StockViewActivity.this.mInterstitialAd.show();
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.");
            }
        }
    }

    /* renamed from: com.diziito.stock.StockViewActivity$6 */
    class C02276 implements OnClickListener {
        C02276() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(StockViewActivity.this, WebView.class);
            intent.putExtra("url", "http://www.stockbangladesh.mobi/top20_bychange.php?type=per");
            StockViewActivity.this.startActivity(intent);
            if (StockViewActivity.this.mInterstitialAd.isLoaded() != null) {
                StockViewActivity.this.mInterstitialAd.show();
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.");
            }
        }
    }

    /* renamed from: com.diziito.stock.StockViewActivity$7 */
    class C02287 implements OnClickListener {
        C02287() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(StockViewActivity.this, WebView.class);
            intent.putExtra("url", "https://www.dsebd.org/top_20_share.php");
            StockViewActivity.this.startActivity(intent);
            if (StockViewActivity.this.mInterstitialAd.isLoaded() != null) {
                StockViewActivity.this.mInterstitialAd.show();
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.");
            }
        }
    }

    /* renamed from: com.diziito.stock.StockViewActivity$8 */
    class C02298 implements OnClickListener {
        C02298() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(StockViewActivity.this, WebView.class);
            intent.putExtra("url", "http://www.stockbangladesh.mobi/top20.php");
            StockViewActivity.this.startActivity(intent);
            if (StockViewActivity.this.mInterstitialAd.isLoaded() != null) {
                StockViewActivity.this.mInterstitialAd.show();
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.");
            }
        }
    }

    /* renamed from: com.diziito.stock.StockViewActivity$9 */
    class C02309 implements OnClickListener {
        C02309() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(StockViewActivity.this, WebView.class);
            intent.putExtra("url", "http://www.stockbangladesh.mobi/market.php");
            StockViewActivity.this.startActivity(intent);
            if (StockViewActivity.this.mInterstitialAd.isLoaded() != null) {
                StockViewActivity.this.mInterstitialAd.show();
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.");
            }
        }
    }

    /* renamed from: com.diziito.stock.StockViewActivity$1 */
    class C02861 extends AdListener {
        C02861() {
        }

        public void onAdClosed() {
            StockViewActivity.this.mInterstitialAd.loadAd(new Builder().build());
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0222R.layout.activity_stock_view);
        MobileAds.initialize(this, "ca-app-pub-9372747959845606~8878605912");
        bundle = new AdView(this);
        bundle.setAdSize(AdSize.BANNER);
        bundle.setAdUnitId("ca-app-pub-9372747959845606/8882459436");
        this.mAdView = (AdView) findViewById(C0222R.id.adView);
        this.mAdView.loadAd(new Builder().build());
        this.mInterstitialAd = new InterstitialAd(this);
        this.mInterstitialAd.setAdUnitId("ca-app-pub-9372747959845606/5138671453");
        this.mInterstitialAd.loadAd(new Builder().build());
        this.mInterstitialAd.setAdListener(new C02861());
        this.b1 = (Button) findViewById(C0222R.id.button1);
        this.b2 = (Button) findViewById(C0222R.id.button2);
        this.b3 = (Button) findViewById(C0222R.id.button3);
        this.b4 = (Button) findViewById(C0222R.id.button4);
        this.b5 = (Button) findViewById(C0222R.id.button5);
        this.b6 = (Button) findViewById(C0222R.id.button6);
        this.b7 = (Button) findViewById(C0222R.id.button7);
        this.b8 = (Button) findViewById(C0222R.id.button8);
        this.b9 = (Button) findViewById(C0222R.id.button9);
        this.b10 = (Button) findViewById(C0222R.id.button10);
        this.b11 = (Button) findViewById(C0222R.id.button11);
        this.b12 = (Button) findViewById(C0222R.id.button12);
        this.b13 = (Button) findViewById(C0222R.id.button13);
        this.b14 = (Button) findViewById(C0222R.id.button14);
        this.b15 = (Button) findViewById(C0222R.id.button15);
        this.b16 = (Button) findViewById(C0222R.id.button16);
        this.b17 = (Button) findViewById(C0222R.id.button17);
        this.b18 = (Button) findViewById(C0222R.id.button18);
        this.b1.setOnClickListener(new C02232());
        this.b2.setOnClickListener(new C02243());
        this.b3.setOnClickListener(new C02254());
        this.b4.setOnClickListener(new C02265());
        this.b5.setOnClickListener(new C02276());
        this.b6.setOnClickListener(new C02287());
        this.b7.setOnClickListener(new C02298());
        this.b8.setOnClickListener(new C02309());
        this.b9.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(StockViewActivity.this, WebView.class);
                intent.putExtra("url", "http://www.stockbangladesh.mobi/index-normal.php");
                StockViewActivity.this.startActivity(intent);
                if (StockViewActivity.this.mInterstitialAd.isLoaded() != null) {
                    StockViewActivity.this.mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        this.b10.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(StockViewActivity.this, WebView.class);
                intent.putExtra("url", "http://www.stockbangladesh.mobi/news.php");
                StockViewActivity.this.startActivity(intent);
                if (StockViewActivity.this.mInterstitialAd.isLoaded() != null) {
                    StockViewActivity.this.mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        this.b11.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(StockViewActivity.this, WebView.class);
                intent.putExtra("url", "http://www.bd7.org/dse/");
                StockViewActivity.this.startActivity(intent);
                if (StockViewActivity.this.mInterstitialAd.isLoaded() != null) {
                    StockViewActivity.this.mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        this.b12.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(StockViewActivity.this, WebView.class);
                intent.putExtra("url", "http://www.sharenews24.com/");
                StockViewActivity.this.startActivity(intent);
                if (StockViewActivity.this.mInterstitialAd.isLoaded() != null) {
                    StockViewActivity.this.mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        this.b13.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(StockViewActivity.this, WebView.class);
                intent.putExtra("url", "http://www.biasl.net/pub/#/");
                StockViewActivity.this.startActivity(intent);
                if (StockViewActivity.this.mInterstitialAd.isLoaded() != null) {
                    StockViewActivity.this.mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        this.b14.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(StockViewActivity.this, WebView.class);
                intent.putExtra("url", "http://www.stockbangladesh.mobi/index-normal.php");
                StockViewActivity.this.startActivity(intent);
                if (StockViewActivity.this.mInterstitialAd.isLoaded() != null) {
                    StockViewActivity.this.mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        this.b15.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(StockViewActivity.this, WebView.class);
                intent.putExtra("url", "https://stockbangladesh.com/");
                StockViewActivity.this.startActivity(intent);
                if (StockViewActivity.this.mInterstitialAd.isLoaded() != null) {
                    StockViewActivity.this.mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        this.b16.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(StockViewActivity.this, WebView.class);
                intent.putExtra("url", "http://www.stockbangladesh.mobi/index-normal.php?segment=1");
                StockViewActivity.this.startActivity(intent);
                if (StockViewActivity.this.mInterstitialAd.isLoaded() != null) {
                    StockViewActivity.this.mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        this.b17.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(StockViewActivity.this, WebView.class);
                intent.putExtra("url", "https://www.cdbl.com.bd/");
                StockViewActivity.this.startActivity(intent);
                if (StockViewActivity.this.mInterstitialAd.isLoaded() != null) {
                    StockViewActivity.this.mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        this.b18.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(StockViewActivity.this, WebView.class);
                intent.putExtra("url", "https://www.dsebd.org/ipo.php");
                StockViewActivity.this.startActivity(intent);
                if (StockViewActivity.this.mInterstitialAd.isLoaded() != null) {
                    StockViewActivity.this.mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
    }
}
