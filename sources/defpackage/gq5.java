package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: gq5  reason: default package */
public final class gq5 extends ffe implements a66 {
    public /* synthetic */ int X;

    public final Object invoke(Object obj, Object obj2) {
        return ((gq5) n(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).o(e5f.a);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [kotlin.coroutines.Continuation, ffe, gq5] */
    public final Continuation n(Object obj, Continuation continuation) {
        ? ffe = new ffe(2, continuation);
        ffe.X = ((Number) obj).intValue();
        return ffe;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        return Boolean.valueOf(this.X > 0);
    }
}
