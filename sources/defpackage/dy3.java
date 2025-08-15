package defpackage;

import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

/* renamed from: dy3  reason: default package */
public final class dy3 extends ffe implements a66 {
    public final /* synthetic */ Callable X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dy3(Callable callable, Continuation continuation) {
        super(2, continuation);
        this.X = callable;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dy3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new dy3(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        return this.X.call();
    }
}
