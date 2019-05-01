package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.zzc;
import com.google.android.gms.common.zze;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class zzd<T extends IInterface> {
    private static String[] zzfwo = new String[]{"service_esmobile", "service_googleme"};
    private final Context mContext;
    final Handler mHandler;
    private final Object mLock;
    private final Looper zzakm;
    private final zze zzfns;
    private int zzfvt;
    private long zzfvu;
    private long zzfvv;
    private int zzfvw;
    private long zzfvx;
    private zzam zzfvy;
    private final zzag zzfvz;
    private final Object zzfwa;
    private zzay zzfwb;
    protected zzj zzfwc;
    private T zzfwd;
    private final ArrayList<zzi<?>> zzfwe;
    private zzl zzfwf;
    private int zzfwg;
    private final zzf zzfwh;
    private final zzg zzfwi;
    private final int zzfwj;
    private final String zzfwk;
    private ConnectionResult zzfwl;
    private boolean zzfwm;
    protected AtomicInteger zzfwn;

    protected zzd(Context context, Looper looper, int i, zzf zzf, zzg zzg, String str) {
        this(context, looper, zzag.zzcl(context), zze.zzafn(), i, (zzf) zzbq.checkNotNull(zzf), (zzg) zzbq.checkNotNull(zzg), null);
    }

    protected zzd(Context context, Looper looper, zzag zzag, zze zze, int i, zzf zzf, zzg zzg, String str) {
        this.mLock = new Object();
        this.zzfwa = new Object();
        this.zzfwe = new ArrayList();
        this.zzfwg = 1;
        this.zzfwl = null;
        this.zzfwm = false;
        this.zzfwn = new AtomicInteger(0);
        this.mContext = (Context) zzbq.checkNotNull(context, "Context must not be null");
        this.zzakm = (Looper) zzbq.checkNotNull(looper, "Looper must not be null");
        this.zzfvz = (zzag) zzbq.checkNotNull(zzag, "Supervisor must not be null");
        this.zzfns = (zze) zzbq.checkNotNull(zze, "API availability must not be null");
        this.mHandler = new zzh(this, looper);
        this.zzfwj = i;
        this.zzfwh = zzf;
        this.zzfwi = zzg;
        this.zzfwk = str;
    }

    private final void zza(int i, T t) {
        boolean z = true;
        if ((i == 4 ? 1 : null) != (t != null ? 1 : null)) {
            z = false;
        }
        zzbq.checkArgument(z);
        synchronized (this.mLock) {
            this.zzfwg = i;
            this.zzfwd = t;
            switch (i) {
                case 1:
                    if (this.zzfwf != null) {
                        this.zzfvz.zza(zzhf(), zzajw(), 129, this.zzfwf, zzajx());
                        this.zzfwf = null;
                        break;
                    }
                    break;
                case 2:
                case 3:
                    String zzald;
                    if (!(this.zzfwf == null || this.zzfvy == null)) {
                        zzald = this.zzfvy.zzald();
                        String packageName = this.zzfvy.getPackageName();
                        StringBuilder stringBuilder = new StringBuilder((String.valueOf(zzald).length() + 70) + String.valueOf(packageName).length());
                        stringBuilder.append("Calling connect() while still connected, missing disconnect() for ");
                        stringBuilder.append(zzald);
                        stringBuilder.append(" on ");
                        stringBuilder.append(packageName);
                        Log.e("GmsClient", stringBuilder.toString());
                        this.zzfvz.zza(this.zzfvy.zzald(), this.zzfvy.getPackageName(), this.zzfvy.zzakz(), this.zzfwf, zzajx());
                        this.zzfwn.incrementAndGet();
                    }
                    this.zzfwf = new zzl(this, this.zzfwn.get());
                    this.zzfvy = new zzam(zzajw(), zzhf(), false, 129);
                    if (!this.zzfvz.zza(new zzah(this.zzfvy.zzald(), this.zzfvy.getPackageName(), this.zzfvy.zzakz()), this.zzfwf, zzajx())) {
                        zzald = this.zzfvy.zzald();
                        String packageName2 = this.zzfvy.getPackageName();
                        StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(zzald).length() + 34) + String.valueOf(packageName2).length());
                        stringBuilder2.append("unable to connect to service: ");
                        stringBuilder2.append(zzald);
                        stringBuilder2.append(" on ");
                        stringBuilder2.append(packageName2);
                        Log.e("GmsClient", stringBuilder2.toString());
                        zza(16, null, this.zzfwn.get());
                        break;
                    }
                    break;
                case 4:
                    zza((IInterface) t);
                    break;
                default:
                    break;
            }
        }
    }

    private final boolean zza(int i, int i2, T t) {
        synchronized (this.mLock) {
            if (this.zzfwg != i) {
                return false;
            }
            zza(i2, (IInterface) t);
            return true;
        }
    }

    @Nullable
    private final String zzajx() {
        return this.zzfwk == null ? this.mContext.getClass().getName() : this.zzfwk;
    }

    private final boolean zzajz() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzfwg == 3;
        }
        return z;
    }

    private final boolean zzakf() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/558922244.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = r2.zzfwm;
        r1 = 0;
        if (r0 == 0) goto L_0x0006;
    L_0x0005:
        return r1;
    L_0x0006:
        r0 = r2.zzhg();
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x0011;
    L_0x0010:
        return r1;
    L_0x0011:
        r0 = 0;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x0019;
    L_0x0018:
        return r1;
    L_0x0019:
        r0 = r2.zzhg();	 Catch:{ ClassNotFoundException -> 0x0022 }
        java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0022 }
        r0 = 1;
        return r0;
    L_0x0022:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzd.zzakf():boolean");
    }

    private final void zzcg(int i) {
        if (zzajz()) {
            i = 5;
            this.zzfwm = true;
        } else {
            i = 4;
        }
        this.mHandler.sendMessage(this.mHandler.obtainMessage(i, this.zzfwn.get(), 16));
    }

    public void disconnect() {
        this.zzfwn.incrementAndGet();
        synchronized (this.zzfwe) {
            int size = this.zzfwe.size();
            for (int i = 0; i < size; i++) {
                ((zzi) this.zzfwe.get(i)).removeListener();
            }
            this.zzfwe.clear();
        }
        synchronized (this.zzfwa) {
            this.zzfwb = null;
        }
        zza(1, null);
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        synchronized (this.mLock) {
            int i = this.zzfwg;
            IInterface iInterface = this.zzfwd;
        }
        synchronized (this.zzfwa) {
            zzay zzay = this.zzfwb;
        }
        printWriter.append(str).append("mConnectState=");
        switch (i) {
            case 1:
                str2 = "DISCONNECTED";
                break;
            case 2:
                str2 = "REMOTE_CONNECTING";
                break;
            case 3:
                str2 = "LOCAL_CONNECTING";
                break;
            case 4:
                str2 = "CONNECTED";
                break;
            case 5:
                str2 = "DISCONNECTING";
                break;
            default:
                str2 = "UNKNOWN";
                break;
        }
        printWriter.print(str2);
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append(zzhg()).append("@").append(Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (zzay == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(zzay.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzfvv > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j = this.zzfvv;
            String format = simpleDateFormat.format(new Date(this.zzfvv));
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(format).length() + 21);
            stringBuilder.append(j);
            stringBuilder.append(" ");
            stringBuilder.append(format);
            append.println(stringBuilder.toString());
        }
        if (this.zzfvu > 0) {
            CharSequence charSequence;
            printWriter.append(str).append("lastSuspendedCause=");
            switch (this.zzfvt) {
                case 1:
                    charSequence = "CAUSE_SERVICE_DISCONNECTED";
                    break;
                case 2:
                    charSequence = "CAUSE_NETWORK_LOST";
                    break;
                default:
                    charSequence = String.valueOf(this.zzfvt);
                    break;
            }
            printWriter.append(charSequence);
            append = printWriter.append(" lastSuspendedTime=");
            j = this.zzfvu;
            format = simpleDateFormat.format(new Date(this.zzfvu));
            stringBuilder = new StringBuilder(String.valueOf(format).length() + 21);
            stringBuilder.append(j);
            stringBuilder.append(" ");
            stringBuilder.append(format);
            append.println(stringBuilder.toString());
        }
        if (this.zzfvx > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(CommonStatusCodes.getStatusCodeString(this.zzfvw));
            PrintWriter append2 = printWriter.append(" lastFailedTime=");
            long j2 = this.zzfvx;
            String format2 = simpleDateFormat.format(new Date(this.zzfvx));
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(format2).length() + 21);
            stringBuilder2.append(j2);
            stringBuilder2.append(" ");
            stringBuilder2.append(format2);
            append2.println(stringBuilder2.toString());
        }
    }

    public Account getAccount() {
        return null;
    }

    public final Context getContext() {
        return this.mContext;
    }

    public final Looper getLooper() {
        return this.zzakm;
    }

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public final boolean isConnected() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzfwg == 4;
        }
        return z;
    }

    public final boolean isConnecting() {
        boolean z;
        synchronized (this.mLock) {
            if (this.zzfwg != 2) {
                if (this.zzfwg != 3) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    @CallSuper
    protected void onConnectionFailed(ConnectionResult connectionResult) {
        this.zzfvw = connectionResult.getErrorCode();
        this.zzfvx = System.currentTimeMillis();
    }

    @CallSuper
    protected void onConnectionSuspended(int i) {
        this.zzfvt = i;
        this.zzfvu = System.currentTimeMillis();
    }

    protected final void zza(int i, @Nullable Bundle bundle, int i2) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(7, i2, -1, new zzo(this, i, null)));
    }

    protected void zza(int i, IBinder iBinder, Bundle bundle, int i2) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(1, i2, -1, new zzn(this, i, iBinder, bundle)));
    }

    @CallSuper
    protected void zza(@NonNull T t) {
        this.zzfvv = System.currentTimeMillis();
    }

    @WorkerThread
    public final void zza(zzan zzan, Set<Scope> set) {
        Bundle zzaae = zzaae();
        zzz zzz = new zzz(this.zzfwj);
        zzz.zzfxj = this.mContext.getPackageName();
        zzz.zzfxm = zzaae;
        if (set != null) {
            zzz.zzfxl = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (zzaan()) {
            zzz.zzfxn = getAccount() != null ? getAccount() : new Account("<<default account>>", "com.google");
            if (zzan != null) {
                zzz.zzfxk = zzan.asBinder();
            }
        } else if (zzakd()) {
            zzz.zzfxn = getAccount();
        }
        zzz.zzfxo = zzaka();
        try {
            synchronized (this.zzfwa) {
                if (this.zzfwb != null) {
                    this.zzfwb.zza(new zzk(this, this.zzfwn.get()), zzz);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (Throwable e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            zzcf(1);
        } catch (SecurityException e2) {
            throw e2;
        } catch (Throwable e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            zza(8, null, null, this.zzfwn.get());
        }
    }

    public void zza(@NonNull zzj zzj) {
        this.zzfwc = (zzj) zzbq.checkNotNull(zzj, "Connection progress callbacks cannot be null.");
        zza(2, null);
    }

    protected final void zza(@NonNull zzj zzj, int i, @Nullable PendingIntent pendingIntent) {
        this.zzfwc = (zzj) zzbq.checkNotNull(zzj, "Connection progress callbacks cannot be null.");
        this.mHandler.sendMessage(this.mHandler.obtainMessage(3, this.zzfwn.get(), i, pendingIntent));
    }

    public void zza(@NonNull zzp zzp) {
        zzp.zzaiu();
    }

    protected Bundle zzaae() {
        return new Bundle();
    }

    public boolean zzaan() {
        return false;
    }

    public boolean zzaax() {
        return false;
    }

    public Bundle zzaex() {
        return null;
    }

    public boolean zzafv() {
        return true;
    }

    @Nullable
    public final IBinder zzafw() {
        synchronized (this.zzfwa) {
            if (this.zzfwb == null) {
                return null;
            }
            IBinder asBinder = this.zzfwb.asBinder();
            return asBinder;
        }
    }

    protected String zzajw() {
        return "com.google.android.gms";
    }

    public final void zzajy() {
        int isGooglePlayServicesAvailable = this.zzfns.isGooglePlayServicesAvailable(this.mContext);
        if (isGooglePlayServicesAvailable != 0) {
            zza(1, null);
            zza(new zzm(this), isGooglePlayServicesAvailable, null);
            return;
        }
        zza(new zzm(this));
    }

    public zzc[] zzaka() {
        return new zzc[0];
    }

    protected final void zzakb() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public final T zzakc() throws DeadObjectException {
        T t;
        synchronized (this.mLock) {
            if (this.zzfwg == 5) {
                throw new DeadObjectException();
            }
            zzakb();
            zzbq.zza(this.zzfwd != null, (Object) "Client is connected but service is null");
            t = this.zzfwd;
        }
        return t;
    }

    public boolean zzakd() {
        return false;
    }

    protected Set<Scope> zzake() {
        return Collections.EMPTY_SET;
    }

    public final void zzcf(int i) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(6, this.zzfwn.get(), i));
    }

    @Nullable
    protected abstract T zzd(IBinder iBinder);

    @NonNull
    protected abstract String zzhf();

    @NonNull
    protected abstract String zzhg();
}
