package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.common.zzo;

public abstract class zzp<T> {
    private final String zzgud;
    private T zzgue;

    protected zzp(String str) {
        this.zzgud = str;
    }

    protected final T zzdb(Context context) throws zzq {
        if (this.zzgue == null) {
            zzbq.checkNotNull(context);
            context = zzo.getRemoteContext(context);
            if (context == null) {
                throw new zzq("Could not get remote context.");
            }
            try {
                this.zzgue = zze((IBinder) context.getClassLoader().loadClass(this.zzgud).newInstance());
            } catch (Throwable e) {
                throw new zzq("Could not load creator class.", e);
            } catch (Throwable e2) {
                throw new zzq("Could not instantiate creator.", e2);
            } catch (Throwable e22) {
                throw new zzq("Could not access creator.", e22);
            }
        }
        return this.zzgue;
    }

    protected abstract T zze(IBinder iBinder);
}
