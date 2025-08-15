package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: k97  reason: default package */
public final class k97 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ n97 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k97(n97 n97, Continuation continuation) {
        super(2, continuation);
        this.Y = n97;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((k97) n((qc2) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        k97 k97 = new k97(this.Y, continuation);
        k97.X = obj;
        return k97;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        pnf.o(this.Y.X, new wm9(Long.valueOf(((qc2) this.X).c)));
        return e5f.a;
    }
}
