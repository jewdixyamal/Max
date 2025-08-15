package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bg3  reason: default package */
public final class bg3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ cg3 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bg3(cg3 cg3, Continuation continuation) {
        super(2, continuation);
        this.Y = cg3;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((bg3) n((wm9) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        bg3 bg3 = new bg3(this.Y, continuation);
        bg3.X = obj;
        return bg3;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        pnf.o(this.Y.X, (wm9) this.X);
        return e5f.a;
    }
}
