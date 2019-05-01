package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.dynamic.zzn;
import com.google.android.gms.internal.zzaiw;
import com.google.android.gms.internal.zzjk;
import com.google.android.gms.internal.zzwj;

@KeepForSdkWithMembers
public class AdActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    public static final String SIMPLE_CLASS_NAME = "AdActivity";
    private zzwj zzakp;

    private final void zzba() {
        if (this.zzakp != null) {
            try {
                this.zzakp.zzba();
            } catch (Throwable e) {
                zzaiw.zzc("Could not forward setContentViewSet to ad overlay:", e);
            }
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        try {
            this.zzakp.onActivityResult(i, i2, intent);
        } catch (Throwable e) {
            zzaiw.zzc("Could not forward onActivityResult to ad overlay:", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        boolean z = true;
        try {
            if (this.zzakp != null) {
                z = this.zzakp.zzmo();
            }
        } catch (Throwable e) {
            zzaiw.zzc("Could not forward onBackPressed to ad overlay:", e);
        }
        if (z) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            this.zzakp.zzk(zzn.zzy(configuration));
        } catch (Throwable e) {
            zzaiw.zzc("Failed to wrap configuration.", e);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.zzakp = zzjk.zzhy().zzb((Activity) this);
        if (this.zzakp == null) {
            zzaiw.zzco("Could not create ad overlay.");
        } else {
            try {
                this.zzakp.onCreate(bundle);
                return;
            } catch (Throwable e) {
                zzaiw.zzc("Could not forward onCreate to ad overlay:", e);
            }
        }
        finish();
    }

    protected void onDestroy() {
        try {
            if (this.zzakp != null) {
                this.zzakp.onDestroy();
            }
        } catch (Throwable e) {
            zzaiw.zzc("Could not forward onDestroy to ad overlay:", e);
        }
        super.onDestroy();
    }

    protected void onPause() {
        try {
            if (this.zzakp != null) {
                this.zzakp.onPause();
            }
        } catch (Throwable e) {
            zzaiw.zzc("Could not forward onPause to ad overlay:", e);
            finish();
        }
        super.onPause();
    }

    protected void onRestart() {
        super.onRestart();
        try {
            if (this.zzakp != null) {
                this.zzakp.onRestart();
            }
        } catch (Throwable e) {
            zzaiw.zzc("Could not forward onRestart to ad overlay:", e);
            finish();
        }
    }

    protected void onResume() {
        super.onResume();
        try {
            if (this.zzakp != null) {
                this.zzakp.onResume();
            }
        } catch (Throwable e) {
            zzaiw.zzc("Could not forward onResume to ad overlay:", e);
            finish();
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        try {
            if (this.zzakp != null) {
                this.zzakp.onSaveInstanceState(bundle);
            }
        } catch (Throwable e) {
            zzaiw.zzc("Could not forward onSaveInstanceState to ad overlay:", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    protected void onStart() {
        super.onStart();
        try {
            if (this.zzakp != null) {
                this.zzakp.onStart();
            }
        } catch (Throwable e) {
            zzaiw.zzc("Could not forward onStart to ad overlay:", e);
            finish();
        }
    }

    protected void onStop() {
        try {
            if (this.zzakp != null) {
                this.zzakp.onStop();
            }
        } catch (Throwable e) {
            zzaiw.zzc("Could not forward onStop to ad overlay:", e);
            finish();
        }
        super.onStop();
    }

    public void setContentView(int i) {
        super.setContentView(i);
        zzba();
    }

    public void setContentView(View view) {
        super.setContentView(view);
        zzba();
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zzba();
    }
}
