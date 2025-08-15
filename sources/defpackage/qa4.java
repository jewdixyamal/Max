package defpackage;

import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.internal.MainDispatchersKt;
import kotlinx.coroutines.internal.SystemPropsKt;

/* renamed from: qa4  reason: default package */
public abstract class qa4 {
    public static final hg4 a;

    static {
        hg4 hg4;
        if (!SystemPropsKt.systemProp("kotlinx.coroutines.main.delay", false)) {
            hg4 = pa4.s0;
        } else {
            jd4 jd4 = ql4.a;
            cx7 cx7 = MainDispatcherLoader.dispatcher;
            hg4 = (MainDispatchersKt.isMissing(cx7) || !(cx7 instanceof hg4)) ? pa4.s0 : (hg4) cx7;
        }
        a = hg4;
    }
}
