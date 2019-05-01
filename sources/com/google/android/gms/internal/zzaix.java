package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@zzzb
public final class zzaix implements zzaiv {
    @Nullable
    private final String zzcxh;

    public zzaix() {
        this(null);
    }

    public zzaix(@Nullable String str) {
        this.zzcxh = str;
    }

    @WorkerThread
    public final void zzch(String str) {
        String str2;
        String valueOf;
        StringBuilder stringBuilder;
        HttpURLConnection httpURLConnection;
        try {
            str2 = "Pinging URL: ";
            valueOf = String.valueOf(str);
            zzaiw.zzbw(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            zzjk.zzhx();
            zzais.zza(true, httpURLConnection, this.zzcxh);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 65);
                stringBuilder2.append("Received non-success response code ");
                stringBuilder2.append(responseCode);
                stringBuilder2.append(" from pinging URL: ");
                stringBuilder2.append(str);
                zzaiw.zzco(stringBuilder2.toString());
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e) {
            str2 = e.getMessage();
            stringBuilder = new StringBuilder((String.valueOf(str).length() + 32) + String.valueOf(str2).length());
            valueOf = "Error while parsing ping URL: ";
            stringBuilder.append(valueOf);
            stringBuilder.append(str);
            stringBuilder.append(". ");
            stringBuilder.append(str2);
            zzaiw.zzco(stringBuilder.toString());
        } catch (IOException e2) {
            str2 = e2.getMessage();
            stringBuilder = new StringBuilder((String.valueOf(str).length() + 27) + String.valueOf(str2).length());
            valueOf = "Error while pinging URL: ";
            stringBuilder.append(valueOf);
            stringBuilder.append(str);
            stringBuilder.append(". ");
            stringBuilder.append(str2);
            zzaiw.zzco(stringBuilder.toString());
        } catch (RuntimeException e3) {
            str2 = e3.getMessage();
            stringBuilder = new StringBuilder((String.valueOf(str).length() + 27) + String.valueOf(str2).length());
            valueOf = "Error while pinging URL: ";
            stringBuilder.append(valueOf);
            stringBuilder.append(str);
            stringBuilder.append(". ");
            stringBuilder.append(str2);
            zzaiw.zzco(stringBuilder.toString());
        } catch (Throwable th) {
            httpURLConnection.disconnect();
        }
    }
}
