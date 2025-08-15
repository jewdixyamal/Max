package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;

/* renamed from: ys0  reason: default package */
public final class ys0 extends ffe implements a66 {
    public final /* synthetic */ ix X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ys0(ix ixVar, Continuation continuation) {
        super(2, continuation);
        this.X = ixVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ys0) n((on5) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ys0(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        ((AtomicBoolean) this.X.k).set(true);
        return e5f.a;
    }
}
