package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class zzagv extends BroadcastReceiver {
    private /* synthetic */ zzagr zzczl;

    private zzagv(zzagr zzagr) {
        this.zzczl = zzagr;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.zzczl.zzczf = true;
            return;
        }
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.zzczl.zzczf = false;
        }
    }
}
