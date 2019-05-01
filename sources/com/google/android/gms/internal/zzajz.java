package com.google.android.gms.internal;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

@zzzb
public final class zzajz {
    public static HttpURLConnection zzb(String str, int i) throws IOException {
        String protocol;
        URL url = new URL(str);
        int i2 = 0;
        while (true) {
            i2++;
            if (i2 <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(i);
                openConnection.setReadTimeout(i);
                if (openConnection instanceof HttpURLConnection) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                    httpURLConnection.setInstanceFollowRedirects(false);
                    if (httpURLConnection.getResponseCode() / 100 == 3) {
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (headerField != null) {
                            URL url2 = new URL(url, headerField);
                            protocol = url2.getProtocol();
                            if (protocol != null) {
                                if (!protocol.equals("http") && !protocol.equals("https")) {
                                    break;
                                }
                                protocol = "Redirecting to ";
                                headerField = String.valueOf(headerField);
                                zzaiw.zzbw(headerField.length() != 0 ? protocol.concat(headerField) : new String(protocol));
                                httpURLConnection.disconnect();
                                url = url2;
                            } else {
                                throw new IOException("Protocol is null");
                            }
                        }
                        throw new IOException("Missing Location header in redirect");
                    }
                    return httpURLConnection;
                }
                throw new IOException("Invalid protocol.");
            }
            throw new IOException("Too many redirects (20)");
        }
        String str2 = "Unsupported scheme: ";
        String valueOf = String.valueOf(protocol);
        throw new IOException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }
}
