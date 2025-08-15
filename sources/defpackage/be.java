package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: be  reason: default package */
public abstract class be {
    public static final ci6 a;

    static {
        Looper mainLooper = Looper.getMainLooper();
        ztc ztc = ce.a;
        a = new ci6(new Handler(mainLooper));
    }
}
