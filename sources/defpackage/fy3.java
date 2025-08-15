package defpackage;

import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

/* renamed from: fy3  reason: default package */
public final class fy3 extends ffe implements a66 {
    public final /* synthetic */ Callable X;
    public final /* synthetic */ ry1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fy3(Callable callable, sy1 sy1, Continuation continuation) {
        super(2, continuation);
        this.X = callable;
        this.Y = sy1;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((fy3) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fy3(this.X, (sy1) this.Y, continuation);
    }

    public final Object o(Object obj) {
        ry1 ry1 = this.Y;
        od2.a0(obj);
        try {
            ry1.resumeWith(this.X.call());
        } catch (Throwable th) {
            ry1.resumeWith(new njc(th));
        }
        return e5f.a;
    }
}
