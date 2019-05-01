package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.util.ArrayMap;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public final class zzdd extends Fragment implements zzci {
    private static WeakHashMap<FragmentActivity, WeakReference<zzdd>> zzfru = new WeakHashMap();
    private int zzbzn = 0;
    private Map<String, LifecycleCallback> zzfrv = new ArrayMap();
    private Bundle zzfrw;

    public static zzdd zza(FragmentActivity fragmentActivity) {
        zzdd zzdd;
        WeakReference weakReference = (WeakReference) zzfru.get(fragmentActivity);
        if (weakReference != null) {
            zzdd = (zzdd) weakReference.get();
            if (zzdd != null) {
                return zzdd;
            }
        }
        try {
            zzdd = (zzdd) fragmentActivity.getSupportFragmentManager().findFragmentByTag("SupportLifecycleFragmentImpl");
            if (zzdd == null || zzdd.isRemoving()) {
                zzdd = new zzdd();
                fragmentActivity.getSupportFragmentManager().beginTransaction().add((Fragment) zzdd, "SupportLifecycleFragmentImpl").commitAllowingStateLoss();
            }
            zzfru.put(fragmentActivity, new WeakReference(zzdd));
            return zzdd;
        } catch (Throwable e) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback dump : this.zzfrv.values()) {
            dump.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback onActivityResult : this.zzfrv.values()) {
            onActivityResult.onActivityResult(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.zzbzn = 1;
        this.zzfrw = bundle;
        for (Entry entry : this.zzfrv.entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.zzbzn = 5;
        for (LifecycleCallback onDestroy : this.zzfrv.values()) {
            onDestroy.onDestroy();
        }
    }

    public final void onResume() {
        super.onResume();
        this.zzbzn = 3;
        for (LifecycleCallback onResume : this.zzfrv.values()) {
            onResume.onResume();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Entry entry : this.zzfrv.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.zzbzn = 2;
        for (LifecycleCallback onStart : this.zzfrv.values()) {
            onStart.onStart();
        }
    }

    public final void onStop() {
        super.onStop();
        this.zzbzn = 4;
        for (LifecycleCallback onStop : this.zzfrv.values()) {
            onStop.onStop();
        }
    }

    public final <T extends LifecycleCallback> T zza(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.zzfrv.get(str));
    }

    public final void zza(String str, @NonNull LifecycleCallback lifecycleCallback) {
        if (this.zzfrv.containsKey(str)) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 59);
            stringBuilder.append("LifecycleCallback with tag ");
            stringBuilder.append(str);
            stringBuilder.append(" already added to this fragment.");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.zzfrv.put(str, lifecycleCallback);
        if (this.zzbzn > 0) {
            new Handler(Looper.getMainLooper()).post(new zzde(this, lifecycleCallback, str));
        }
    }

    public final /* synthetic */ Activity zzajc() {
        return getActivity();
    }
}
