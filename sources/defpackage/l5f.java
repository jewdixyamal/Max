package defpackage;

import kotlinx.coroutines.internal.LimitedDispatcherKt;

/* renamed from: l5f  reason: default package */
public final class l5f extends nx3 {
    public static final l5f a = new nx3();

    public final void dispatch(lx3 lx3, Runnable runnable) {
        jd4 jd4 = jd4.b;
        jd4.a.n(runnable, joe.h, false);
    }

    public final void dispatchYield(lx3 lx3, Runnable runnable) {
        jd4 jd4 = jd4.b;
        jd4.a.n(runnable, joe.h, true);
    }

    public final nx3 limitedParallelism(int i, String str) {
        LimitedDispatcherKt.checkParallelism(i);
        return i >= joe.d ? LimitedDispatcherKt.namedOrThis(this, str) : super.limitedParallelism(i, str);
    }

    public final String toString() {
        return "Dispatchers.IO";
    }
}
