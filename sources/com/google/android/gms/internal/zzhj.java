package com.google.android.gms.internal;

import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

@zzzb
public final class zzhj {
    private final int zzazk;
    private final zzgz zzazm;
    private String zzazu;
    private String zzazv;
    private final boolean zzazw = false;
    private final int zzazx;
    private final int zzazy;

    public zzhj(int i, int i2, int i3) {
        this.zzazk = i;
        if (i2 <= 64) {
            if (i2 >= 0) {
                this.zzazx = i2;
                if (i3 > 0) {
                    this.zzazy = 1;
                } else {
                    this.zzazy = i3;
                }
                this.zzazm = new zzhi(this.zzazx);
            }
        }
        this.zzazx = 64;
        if (i3 > 0) {
            this.zzazy = i3;
        } else {
            this.zzazy = 1;
        }
        this.zzazm = new zzhi(this.zzazx);
    }

    private final boolean zza(String str, HashSet<String> hashSet) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return true;
        }
        for (String str2 : split) {
            String str22;
            int i;
            Object obj;
            int i2;
            if (str22.indexOf("'") != -1) {
                StringBuilder stringBuilder = new StringBuilder(str22);
                i = 1;
                obj = null;
                while (true) {
                    i2 = i + 2;
                    if (i2 > stringBuilder.length()) {
                        break;
                    }
                    if (stringBuilder.charAt(i) == '\'') {
                        if (stringBuilder.charAt(i - 1) != ' ') {
                            int i3 = i + 1;
                            if ((stringBuilder.charAt(i3) == 's' || stringBuilder.charAt(i3) == 'S') && (i2 == stringBuilder.length() || stringBuilder.charAt(i2) == ' ')) {
                                stringBuilder.insert(i, ' ');
                                i = i2;
                                obj = 1;
                            }
                        }
                        stringBuilder.setCharAt(i, ' ');
                        obj = 1;
                    }
                    i++;
                }
                String stringBuilder2 = obj != null ? stringBuilder.toString() : null;
                if (stringBuilder2 != null) {
                    this.zzazv = stringBuilder2;
                    str22 = stringBuilder2;
                }
            }
            String[] zzb = zzhd.zzb(str22, true);
            if (zzb.length >= this.zzazy) {
                for (int i4 = 0; i4 < zzb.length; i4++) {
                    Object obj2;
                    obj = "";
                    for (i = 0; i < this.zzazy; i++) {
                        i2 = i4 + i;
                        if (i2 >= zzb.length) {
                            obj2 = null;
                            break;
                        }
                        if (i > 0) {
                            obj = String.valueOf(obj).concat(" ");
                        }
                        String valueOf = String.valueOf(obj);
                        String valueOf2 = String.valueOf(zzb[i2]);
                        obj = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                    }
                    obj2 = 1;
                    if (obj2 == null) {
                        break;
                    }
                    hashSet.add(obj);
                    if (hashSet.size() >= this.zzazk) {
                        return false;
                    }
                }
                if (hashSet.size() >= this.zzazk) {
                    return false;
                }
            }
        }
        return true;
    }

    public final String zza(ArrayList<String> arrayList, ArrayList<zzgy> arrayList2) {
        Collections.sort(arrayList2, new zzhk(this));
        HashSet hashSet = new HashSet();
        int i = 0;
        while (i < arrayList2.size() && zza(Normalizer.normalize((CharSequence) arrayList.get(((zzgy) arrayList2.get(i)).zzgz()), Form.NFKC).toLowerCase(Locale.US), hashSet)) {
            i++;
        }
        zzhc zzhc = new zzhc();
        this.zzazu = "";
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                zzhc.write(this.zzazm.zzx((String) it.next()));
            } catch (Throwable e) {
                zzaiw.zzb("Error while writing hash to byteStream", e);
            }
        }
        return zzhc.toString();
    }
}
