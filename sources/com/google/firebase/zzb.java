package com.google.firebase;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zzdb;

public final class zzb implements zzdb {
    public final Exception zzu(Status status) {
        return status.getStatusCode() == 8 ? new FirebaseException(status.zzagl()) : new FirebaseApiNotAvailableException(status.zzagl());
    }
}
