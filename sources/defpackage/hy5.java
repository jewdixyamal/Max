package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: hy5  reason: default package */
public final class hy5 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ m56 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hy5(Continuation continuation, m56 m56) {
        super(2, continuation);
        this.Y = m56;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((hy5) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        hy5 hy5 = new hy5(continuation, this.Y);
        hy5.X = obj;
        return hy5;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.Y.invoke((wm9) this.X);
        return e5f.a;
    }
}
