package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: v12  reason: default package */
public final class v12 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ m56 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v12(Continuation continuation, m56 m56) {
        super(2, continuation);
        this.Y = m56;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((v12) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        v12 v12 = new v12(continuation, this.Y);
        v12.X = obj;
        return v12;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.Y.invoke((wm9) this.X);
        return e5f.a;
    }
}
