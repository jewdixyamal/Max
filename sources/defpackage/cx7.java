package defpackage;

import kotlinx.coroutines.internal.LimitedDispatcherKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;

/* renamed from: cx7  reason: default package */
public abstract class cx7 extends nx3 {
    public abstract cx7 getImmediate();

    public nx3 limitedParallelism(int i, String str) {
        LimitedDispatcherKt.checkParallelism(i);
        return LimitedDispatcherKt.namedOrThis(this, str);
    }

    public String toString() {
        String stringInternalImpl = toStringInternalImpl();
        if (stringInternalImpl != null) {
            return stringInternalImpl;
        }
        return getClass().getSimpleName() + '@' + c54.u(this);
    }

    public final String toStringInternalImpl() {
        cx7 cx7;
        jd4 jd4 = ql4.a;
        cx7 cx72 = MainDispatcherLoader.dispatcher;
        if (this == cx72) {
            return "Dispatchers.Main";
        }
        try {
            cx7 = cx72.getImmediate();
        } catch (UnsupportedOperationException unused) {
            cx7 = null;
        }
        if (this == cx7) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
