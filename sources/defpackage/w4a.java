package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: w4a  reason: default package */
public final class w4a extends ffe implements a66 {
    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((w4a) n((fka) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ffe(2, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        k29 k29 = (k29) jyc.a.getAccessor().c(k29.class);
        ((j29) k29.i.getValue()).j(-1);
        k29.e().i().forEach(new a29(new bk(12, k29), 0));
        return e5f.a;
    }
}
