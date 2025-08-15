package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: k91  reason: default package */
public final class k91 extends ffe implements a66 {
    public /* synthetic */ Object X;

    public final Object invoke(Object obj, Object obj2) {
        return ((k91) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [k91, kotlin.coroutines.Continuation, ffe] */
    public final Continuation n(Object obj, Continuation continuation) {
        ? ffe = new ffe(2, continuation);
        ffe.X = obj;
        return ffe;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [a66, ffe] */
    public final Object o(Object obj) {
        od2.a0(obj);
        return j47.T((sx3) this.X, (lx3) null, (vx3) null, new ffe(2, (Continuation) null), 3);
    }
}
