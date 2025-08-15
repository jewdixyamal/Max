package defpackage;

import kotlinx.coroutines.internal.LimitedDispatcherKt;

/* renamed from: jd4  reason: default package */
public final class jd4 extends duc {
    public static final jd4 b = new duc(joe.c, joe.d, joe.e);

    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public final nx3 limitedParallelism(int i, String str) {
        LimitedDispatcherKt.checkParallelism(i);
        return i >= joe.c ? LimitedDispatcherKt.namedOrThis(this, str) : super.limitedParallelism(i, str);
    }

    public final String toString() {
        return "Dispatchers.Default";
    }
}
