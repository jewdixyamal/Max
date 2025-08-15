package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ya6  reason: default package */
public final class ya6 extends ffe implements a66 {
    public /* synthetic */ Object X;

    public final Object invoke(Object obj, Object obj2) {
        return ((ya6) n((uj3) obj, (Continuation) obj2)).o(e5f.a);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [kotlin.coroutines.Continuation, ffe, ya6] */
    public final Continuation n(Object obj, Continuation continuation) {
        ? ffe = new ffe(2, continuation);
        ffe.X = obj;
        return ffe;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        uj3 uj3 = (uj3) this.X;
        return Boolean.valueOf(uj3 != null && !uj3.w());
    }
}
