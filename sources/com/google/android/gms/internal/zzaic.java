package com.google.android.gms.internal;

final class zzaic implements zzu {
    private /* synthetic */ String zzckw;
    private /* synthetic */ zzaif zzdau;

    zzaic(zzahy zzahy, String str, zzaif zzaif) {
        this.zzckw = str;
        this.zzdau = zzaif;
    }

    public final void zzd(zzaa zzaa) {
        String str = this.zzckw;
        String zzaa2 = zzaa.toString();
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 21) + String.valueOf(zzaa2).length());
        stringBuilder.append("Failed to load URL: ");
        stringBuilder.append(str);
        stringBuilder.append("\n");
        stringBuilder.append(zzaa2);
        zzaiw.zzco(stringBuilder.toString());
        this.zzdau.zzb(null);
    }
}
