package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bu2  reason: default package */
public final class bu2 extends ffe implements a66 {
    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((bu2) n((sx3) obj, (Continuation) obj2)).o(e5f);
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
