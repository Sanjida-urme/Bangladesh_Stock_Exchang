package com.google.android.gms.common;

import android.content.Intent;

public class GooglePlayServicesRepairableException extends UserRecoverableException {
    private final int zzdzl;

    public GooglePlayServicesRepairableException(int i, String str, Intent intent) {
        super(str, intent);
        this.zzdzl = i;
    }

    public int getConnectionStatusCode() {
        return this.zzdzl;
    }
}
