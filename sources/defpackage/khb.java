package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: khb  reason: default package */
public abstract class khb {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
