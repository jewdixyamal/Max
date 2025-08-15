package defpackage;

import java.util.HashMap;
import kotlin.coroutines.Continuation;

/* renamed from: cib  reason: default package */
public final class cib extends ffe implements a66 {
    public final /* synthetic */ jib X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cib(jib jib, Continuation continuation) {
        super(2, continuation);
        this.X = jib;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cib) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new cib(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = jib.D0;
        jib jib = this.X;
        e52 r = jib.r();
        e5f e5f = e5f.a;
        if (r == null || !r.Z()) {
            return e5f;
        }
        jib.w0.set(((k4a) ((pk) jib.X.getValue())).l(r.a, r.b.a, 0, (String) null, true, (HashMap) null));
        return e5f;
    }
}
