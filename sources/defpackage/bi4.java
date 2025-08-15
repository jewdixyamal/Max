package defpackage;

import android.os.Looper;

/* renamed from: bi4  reason: default package */
public final class bi4 {
    public static final khe c = new khe(new zf3(14));
    public final ThreadLocal a;
    public final Looper b = Looper.myLooper();

    public bi4(ThreadLocal threadLocal) {
        this.a = threadLocal;
        Looper.prepare();
    }
}
