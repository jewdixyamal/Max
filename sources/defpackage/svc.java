package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: svc  reason: default package */
public final class svc extends ffe implements a66 {
    public /* synthetic */ Object X;

    public final Object invoke(Object obj, Object obj2) {
        return ((svc) n((mm3) obj, (Continuation) obj2)).o(e5f.a);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [svc, kotlin.coroutines.Continuation, ffe] */
    public final Continuation n(Object obj, Continuation continuation) {
        ? ffe = new ffe(2, continuation);
        ffe.X = obj;
        return ffe;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        return new mqc(new rvc((mm3) this.X, (Continuation) null));
    }
}
