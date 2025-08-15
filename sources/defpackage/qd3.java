package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: qd3  reason: default package */
public abstract class qd3 {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
