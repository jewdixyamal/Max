package defpackage;

import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.ThreadLocalKt;

/* renamed from: use  reason: default package */
public abstract class use {
    public static final ThreadLocal a = ThreadLocalKt.commonThreadLocal(new Symbol("ThreadLocalEventLoop"));

    public static a45 a() {
        ThreadLocal threadLocal = a;
        a45 a45 = (a45) threadLocal.get();
        if (a45 != null) {
            return a45;
        }
        kp0 kp0 = new kp0(Thread.currentThread());
        threadLocal.set(kp0);
        return kp0;
    }
}
