package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: fp8  reason: default package */
public final class fp8 extends ffe implements a66 {
    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((fp8) n((Set) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ffe(2, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        return e5f.a;
    }
}
