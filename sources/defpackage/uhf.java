package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: uhf  reason: default package */
public final class uhf extends ffe implements a66 {
    public /* synthetic */ Object X;

    public final Object invoke(Object obj, Object obj2) {
        return ((uhf) n((n7g) obj, (Continuation) obj2)).o(e5f.a);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [uhf, kotlin.coroutines.Continuation, ffe] */
    public final Continuation n(Object obj, Continuation continuation) {
        ? ffe = new ffe(2, continuation);
        ffe.X = obj;
        return ffe;
    }

    public final Object o(Object obj) {
        boolean z;
        od2.a0(obj);
        n7g n7g = (n7g) this.X;
        m7g m7g = null;
        if ((n7g != null ? n7g.b : null) != m7g.c) {
            if ((n7g != null ? n7g.b : null) != m7g.o) {
                if (n7g != null) {
                    m7g = n7g.b;
                }
                if (m7g != m7g.Y) {
                    z = false;
                    return Boolean.valueOf(z);
                }
            }
        }
        z = true;
        return Boolean.valueOf(z);
    }
}
