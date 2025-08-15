package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: xq  reason: default package */
public final class xq extends ffe implements a66 {
    public /* synthetic */ Object X;

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((xq) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [kotlin.coroutines.Continuation, ffe, xq] */
    public final Continuation n(Object obj, Continuation continuation) {
        ? ffe = new ffe(2, continuation);
        ffe.X = obj;
        return ffe;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        if (tpa.f((wm9) this.X, g43.b)) {
            lr.c.P1().d();
        }
        return e5f.a;
    }
}
