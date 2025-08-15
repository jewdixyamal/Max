package defpackage;

import java.util.Collection;
import kotlin.coroutines.Continuation;

/* renamed from: p1b  reason: default package */
public final class p1b extends ffe implements a66 {
    public /* synthetic */ Object X;

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((p1b) n((Collection) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [p1b, kotlin.coroutines.Continuation, ffe] */
    public final Continuation n(Object obj, Continuation continuation) {
        ? ffe = new ffe(2, continuation);
        ffe.X = obj;
        return ffe;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        ((si9) ((yl4) n31.a.getAccessor().c(yl4.class)).c.getValue()).g((Collection) this.X);
        return e5f.a;
    }
}
