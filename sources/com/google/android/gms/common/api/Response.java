package com.google.android.gms.common.api;

import android.support.annotation.NonNull;

public class Response<T extends Result> {
    private T zzfku;

    protected Response(@NonNull T t) {
        this.zzfku = t;
    }

    @NonNull
    protected T getResult() {
        return this.zzfku;
    }

    public void setResult(@NonNull T t) {
        this.zzfku = t;
    }
}
